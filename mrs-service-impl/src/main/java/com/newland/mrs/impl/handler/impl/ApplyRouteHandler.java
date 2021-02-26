package com.newland.mrs.impl.handler.impl;

import com.alibaba.fastjson.JSONObject;
import com.newland.mrs.api.entity.ApplyRouteRequest;
import com.newland.mrs.api.entity.MrsRequestInfo;
import com.newland.mrs.api.entity.MrsResponseInfo;
import com.newland.mrs.impl.annotation.DistributedLock;
import com.newland.mrs.impl.enums.ApplyStatusEnum;
import com.newland.mrs.impl.enums.ResultStatusEnum;
import com.newland.mrs.impl.handler.AbstractMrsHandler;
import com.newland.mrs.impl.mq.producer.MrsMessageProducer;
import com.newland.mrs.impl.service.*;
import com.newland.mrs.impl.util.DateUtils;
import com.newland.mrs.persist.model.*;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * ApplyRouteHandler
 * 路由申请接口处理
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-29 17:29
 **/
@Component("applyRouteHandler")
public class ApplyRouteHandler extends AbstractMrsHandler {

    private static final Logger logger = LoggerFactory.getLogger(ApplyRouteHandler.class);

    private final MrsApplyRouteService mrsApplyRouteService;

    private final MrsRuleConfigService mrsRuleConfigService;

    private final MrsRuleDetailService mrsRuleDetailService;

    private final MrsRuleResultService mrsRuleResultService;

    private final MrsFunderConfigService mrsFunderConfigService;

    private final MrsDivisionConfigService mrsDivisionConfigService;

    private final MrsFunderMatchService mrsFunderMatchService;

    private final MrsMktFunderConfigService mrsMktFunderConfigService;

    private final MrsMktFunderMatchService mrsMktFunderMatchService;

    private final MrsMessageProducer mrsMessageProducer;

    public ApplyRouteHandler(MrsApplyRouteService mrsApplyRouteService, MrsRuleConfigService mrsRuleConfigService, MrsRuleDetailService mrsRuleDetailService, MrsRuleResultService mrsRuleResultService, MrsFunderConfigService mrsFunderConfigService, MrsDivisionConfigService mrsDivisionConfigService, MrsFunderMatchService mrsFunderMatchService, MrsMktFunderConfigService mrsMktFunderConfigService, MrsMktFunderMatchService mrsMktFunderMatchService, MrsMessageProducer mrsMessageProducer) {
        this.mrsApplyRouteService = mrsApplyRouteService;
        this.mrsRuleConfigService = mrsRuleConfigService;
        this.mrsRuleDetailService = mrsRuleDetailService;
        this.mrsRuleResultService = mrsRuleResultService;
        this.mrsFunderConfigService = mrsFunderConfigService;
        this.mrsDivisionConfigService = mrsDivisionConfigService;
        this.mrsFunderMatchService = mrsFunderMatchService;
        this.mrsMktFunderConfigService = mrsMktFunderConfigService;
        this.mrsMktFunderMatchService = mrsMktFunderMatchService;
        this.mrsMessageProducer = mrsMessageProducer;
    }

    @Override
    @DistributedLock(bizKeyName = "routeNo", redisRoot = "applyRoute")
    public MrsResponseInfo handle(MrsRequestInfo requestInfo) {
        ApplyRouteRequest routeRequest = ((ApplyRouteRequest) requestInfo.getRequestData());
        if (!"OFFLINE".equals(routeRequest.getLineSign())) {
            return MrsResponseInfo.newFailure("2001", "当前仅支持线下业务");
        }
        if (StringUtils.isEmpty(routeRequest.getDivisionCode())) {
            return MrsResponseInfo.newFailure("2002", "线下业务事业部编号必填");
        }
        if (StringUtils.isEmpty(routeRequest.getTeamCode())) {
            return MrsResponseInfo.newFailure("2003", "线下业务事业团队部编号必填");
        }
        MrsApplyRoute mrsApplyRoute = mrsApplyRouteService.selectApplyRouteByRouteNo(routeRequest.getRouteNo());
        if (mrsApplyRoute != null) {
            return MrsResponseInfo.newFailure("2004", "申请编号重复");
        }
        MrsRuleConfig mrsRuleConfig = mrsRuleConfigService.selectRuleConfigByRuleNo(requestInfo.getRuleNo());
        if (mrsRuleConfig == null) {
            return MrsResponseInfo.newFailure("2005", "规则编号对应规则配置不存在或者已禁用");
        }
        List<MrsFunderConfig> mrsFunderConfigs = mrsFunderConfigService.selectFunderConfigEnable(requestInfo.getRuleNo());
        if (mrsFunderConfigs == null || mrsFunderConfigs.size() == 0) {
            return MrsResponseInfo.newFailure("2006", "资金方配置信息不存在");
        }
        List<Long> funderIds = mrsFunderConfigs.stream().map(MrsFunderConfig::getId).collect(Collectors.toList());
        List<MrsRuleDetail> mrsRuleDetails = mrsRuleDetailService.selectRuleDetailByConfigIds(funderIds, "funder_element");
        if (mrsRuleDetails == null || mrsRuleDetails.size() == 0) {
            return MrsResponseInfo.newFailure("2007", "资金方配置规则明细不存在或者已经禁用");
        }
        try {
            List<MrsRuleDetail> allowMrsRuleDetails = new ArrayList<>(mrsRuleDetails);
            // 是否走市场部推送规则
            boolean hasDivisionRule = false;
            List<MrsMktFunderConfig> mrsMktFunderConfigs = null;
            MrsDivisionConfig mrsDivisionConfig = mrsDivisionConfigService.selectDivisionByTeamCode(requestInfo.getRuleNo(), routeRequest.getDivisionCode(), routeRequest.getTeamCode());
            // 存在该团队配置的情况下才会走市场部推送规则
            if (mrsDivisionConfig != null) {
                mrsMktFunderConfigs = mrsMktFunderConfigService.selectMktFunderByDivisionId(mrsDivisionConfig.getId());
                if (mrsMktFunderConfigs != null && mrsMktFunderConfigs.size() > 0) {
                    for (MrsMktFunderConfig mrsMktFunderConfig : mrsMktFunderConfigs) {
                        List<MrsRuleDetail> divisionRuleDetails = mrsRuleDetailService.selectRuleDetailByConfigId(mrsMktFunderConfig.getId(), "division_match");
                        if (divisionRuleDetails != null && divisionRuleDetails.size() > 0) {
                            allowMrsRuleDetails.addAll(divisionRuleDetails);
                            hasDivisionRule = true;
                        }
                    }
                }
            }
            ApplyRouteHandler applyRouteHandler = ((ApplyRouteHandler) AopContext.currentProxy());
            if (hasDivisionRule) {
                applyRouteHandler.saveBizData(requestInfo.getRuleNo(), routeRequest, mrsFunderConfigs, allowMrsRuleDetails, mrsDivisionConfig.getId(), mrsMktFunderConfigs);
            } else {
                applyRouteHandler.saveBizData(requestInfo.getRuleNo(), routeRequest, mrsFunderConfigs, allowMrsRuleDetails);
            }
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("hasDivisionRule", hasDivisionRule);
            mrsMessageProducer.producerMessage("route_rule_match", routeRequest.getRouteNo(), jsonObject.toJSONString());
        } catch (Exception e) {
            logger.error(e.getMessage());
            return MrsResponseInfo.newFailure("E001", "数据保存异常");
        }
        return MrsResponseInfo.newSuccess();
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void saveBizData(String ruleNo, ApplyRouteRequest routeRequest, List<MrsFunderConfig> mrsFunderConfigs, List<MrsRuleDetail> mrsRuleDetails) throws Exception {
        saveApplyRoute(ruleNo, routeRequest, null);
        mrsFunderConfigs.forEach(mrsFunderConfig -> saveFunderMatch(routeRequest.getRouteNo(), mrsFunderConfig));
        mrsRuleDetails.forEach(mrsRuleDetail -> saveRuleResult(routeRequest.getRouteNo(), mrsRuleDetail));
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public void saveBizData(String ruleNo, ApplyRouteRequest routeRequest, List<MrsFunderConfig> mrsFunderConfigs, List<MrsRuleDetail> mrsRuleDetails, Long divisionId, List<MrsMktFunderConfig> mrsMktFunderConfigs) throws Exception {
        saveApplyRoute(ruleNo, routeRequest, divisionId);
        mrsFunderConfigs.forEach(mrsFunderConfig -> saveFunderMatch(routeRequest.getRouteNo(), mrsFunderConfig));
        mrsMktFunderConfigs.forEach(mrsMktFunderConfig -> saveMktFunderMatch(routeRequest.getRouteNo(), mrsMktFunderConfig));
        mrsRuleDetails.forEach(mrsRuleDetail -> saveRuleResult(routeRequest.getRouteNo(), mrsRuleDetail));
    }

    /**
     * 保存路由申请信息
     * @param ruleNo 规则编号
     * @param routeRequest 路由申请请求
     * @param divisionId 市场规则
     * @throws ParseException 日期转化异常
     */
    private void saveApplyRoute(String ruleNo, ApplyRouteRequest routeRequest, Long divisionId) throws ParseException {
        MrsApplyRoute mrsApplyRoute = new MrsApplyRoute();
        mrsApplyRoute.setRouteNo(routeRequest.getRouteNo());
        mrsApplyRoute.setRuleNo(ruleNo);
        mrsApplyRoute.setApplyNo(routeRequest.getApplyNo());
        mrsApplyRoute.setRouteDate(new Date());
        mrsApplyRoute.setCustomName(routeRequest.getCustomName());
        mrsApplyRoute.setCustomPhone(routeRequest.getCustomPhone());
        mrsApplyRoute.setCustomIdNo(routeRequest.getCustomIdNo());
        mrsApplyRoute.setBankCardNo(routeRequest.getBankCardNo());
        mrsApplyRoute.setCustomBalance(Long.valueOf(routeRequest.getCustomBalance()));
        mrsApplyRoute.setCustomLimit(Integer.valueOf(routeRequest.getCustomLimit()));
        mrsApplyRoute.setCreditAmount(Long.valueOf(routeRequest.getCreditAmount()));
        mrsApplyRoute.setApplyAmount(Long.valueOf(routeRequest.getApplyAmount()));
        mrsApplyRoute.setApplyRate(new BigDecimal(routeRequest.getApplyRate()));
        mrsApplyRoute.setApplyAge(Integer.valueOf(routeRequest.getApplyAge()));
        mrsApplyRoute.setLimitStartDate(DateUtils.stringToDate(routeRequest.getLimitStartDate(), "yyyy-MM-dd"));
        mrsApplyRoute.setLimitEndDate(DateUtils.stringToDate(routeRequest.getLimitEndDate(), "yyyy-MM-dd"));
        mrsApplyRoute.setApplyProductType(routeRequest.getApplyProductType());
        mrsApplyRoute.setApplyProductTerm(Integer.valueOf(routeRequest.getApplyProductTerm()));
        mrsApplyRoute.setApplyRepayType(routeRequest.getApplyRepayType());
        mrsApplyRoute.setMicroCreditSign(routeRequest.getMicroCreditSign());
        mrsApplyRoute.setLineSign(routeRequest.getLineSign());
        mrsApplyRoute.setDivisionCode(routeRequest.getDivisionCode());
        mrsApplyRoute.setDivisionName(routeRequest.getDivisionName());
        mrsApplyRoute.setTeamCode(routeRequest.getTeamCode());
        mrsApplyRoute.setTeamName(routeRequest.getTeamName());
        if (divisionId != null) {
            mrsApplyRoute.setDivisionId(divisionId);
        }
        mrsApplyRoute.setPersonalOrEnterprise(routeRequest.getPersonalOrEnterprise());
        mrsApplyRoute.setUscCode(routeRequest.getUscCode());
        mrsApplyRoute.setApplyCrowd(routeRequest.getApplyCrowd());
        mrsApplyRoute.setIdCardAddress(routeRequest.getIdCardAddress());
        mrsApplyRoute.setHomeAddress(routeRequest.getHomeAddress());
        mrsApplyRoute.setBusinessAddress(routeRequest.getBusinessAddress());
        mrsApplyRoute.setManageAddress(routeRequest.getManageAddress());
        mrsApplyRoute.setCompanyName(routeRequest.getCompanyName());
        mrsApplyRoute.setCompanyAddress(routeRequest.getCompanyAddress());
        mrsApplyRoute.setMicroOrConsume(routeRequest.getMicroOrConsume());
        mrsApplyRoute.setHaveFileType(routeRequest.getHaveFileType());
        mrsApplyRoute.setApplyStatus(ApplyStatusEnum.INIT.getCode());
        mrsApplyRoute.setRemark(ApplyStatusEnum.INIT.getName());
        mrsApplyRouteService.insertApplyRoute(mrsApplyRoute);
    }

    private void saveFunderMatch(String routeNo, MrsFunderConfig mrsFunderConfig) {
        MrsFunderMatch mrsFunderMatch = new MrsFunderMatch();
        mrsFunderMatch.setRouteNo(routeNo);
        mrsFunderMatch.setRuleNo(mrsFunderConfig.getRuleNo());
        mrsFunderMatch.setFunderConfigId(mrsFunderConfig.getId());
        mrsFunderMatch.setFunderCode(mrsFunderConfig.getFunderCode());
        mrsFunderMatch.setFunderName(mrsFunderConfig.getFunderName());
        mrsFunderMatch.setPreserveStartTime(mrsFunderConfig.getPreserveStartTime());
        mrsFunderMatch.setPreserveEndTime(mrsFunderConfig.getPreserveEndTime());
        mrsFunderMatch.setLoanStartTime(mrsFunderConfig.getLoanStartTime());
        mrsFunderMatch.setLoanEndTime(mrsFunderConfig.getLoanEndTime());
        mrsFunderMatch.setBatchStartTime(mrsFunderConfig.getBatchStartTime());
        mrsFunderMatch.setPriority(mrsFunderConfig.getPriority());
        mrsFunderMatch.setMatchStatus(ResultStatusEnum.UN_MATCH.getCode());
        mrsFunderMatchService.insertFunderMatch(mrsFunderMatch);
    }

    private void saveMktFunderMatch(String routeNo, MrsMktFunderConfig mrsMktFunderConfig) {
        MrsMktFunderMatch mrsMktFunderMatch = new MrsMktFunderMatch();
        mrsMktFunderMatch.setRouteNo(routeNo);
        mrsMktFunderMatch.setRuleNo(mrsMktFunderConfig.getRuleNo());
        mrsMktFunderMatch.setDivisionId(mrsMktFunderConfig.getDivisionId());
        mrsMktFunderMatch.setMktFunderConfigId(mrsMktFunderConfig.getId());
        mrsMktFunderMatch.setFunderCode(mrsMktFunderConfig.getFunderCode());
        mrsMktFunderMatch.setFunderName(mrsMktFunderConfig.getFunderName());
        mrsMktFunderMatch.setPriority(mrsMktFunderConfig.getPriority());
        mrsMktFunderMatch.setWhetherToPush(mrsMktFunderConfig.getWhetherToPush());
        mrsMktFunderMatch.setMatchStatus(ResultStatusEnum.UN_MATCH.getCode());
        mrsMktFunderMatchService.insertMktFunderMatch(mrsMktFunderMatch);
    }

    private void saveRuleResult(String ruleNo, MrsRuleDetail mrsRuleDetail) {
        MrsRuleResult mrsRuleResult = new MrsRuleResult();
        mrsRuleResult.setBusinessNo(ruleNo);
        mrsRuleResult.setRuleNo(mrsRuleDetail.getRuleNo());
        mrsRuleResult.setConfigId(mrsRuleDetail.getConfigId());
        mrsRuleResult.setRuleGroup(mrsRuleDetail.getRuleGroup());
        mrsRuleResult.setRuleId(mrsRuleDetail.getId());
        mrsRuleResult.setRuleCode(mrsRuleDetail.getRuleCode());
        mrsRuleResult.setRuleName(mrsRuleDetail.getRuleName());
        mrsRuleResult.setRuleContext(mrsRuleDetail.getRuleContext());
        mrsRuleResult.setRuleDesc(mrsRuleDetail.getRuleDesc());
        mrsRuleResult.setOutDataSign(mrsRuleDetail.getOutDataSign());
        mrsRuleResult.setOutBeanName(mrsRuleDetail.getOutBeanName());
        mrsRuleResult.setPriority(mrsRuleDetail.getPriority());
        mrsRuleResult.setResultStatus(ResultStatusEnum.UN_MATCH.getCode());
        mrsRuleResultService.insertRuleResult(mrsRuleResult);
    }
}
