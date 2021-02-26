package com.newland.mrs.impl.mq.consumer.listener;

import com.alibaba.fastjson.JSONObject;
import com.newland.mrs.api.enums.YorNEnum;
import com.newland.mrs.impl.config.rule.KieSessionHelper;
import com.newland.mrs.impl.config.rule.listener.HitRuleListener;
import com.newland.mrs.impl.entity.Fact;
import com.newland.mrs.impl.enums.ApplyStatusEnum;
import com.newland.mrs.impl.enums.ResultStatusEnum;
import com.newland.mrs.impl.mq.consumer.AbstractMrsMessageListener;
import com.newland.mrs.impl.mq.consumer.BusinessResult;
import com.newland.mrs.impl.service.MrsApplyRouteService;
import com.newland.mrs.impl.service.MrsFunderMatchService;
import com.newland.mrs.impl.service.MrsMktFunderMatchService;
import com.newland.mrs.impl.service.MrsRuleResultService;
import com.newland.mrs.persist.model.MrsApplyRoute;
import com.newland.mrs.persist.model.MrsFunderMatch;
import com.newland.mrs.persist.model.MrsMktFunderMatch;
import com.newland.mrs.persist.model.MrsRuleResult;
import org.apache.rocketmq.common.message.MessageExt;
import org.kie.api.definition.rule.Rule;
import org.kie.api.runtime.KieSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.framework.AopContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * DivisionRuleMatchMessageListener
 * 市场部推送规则消息监听
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-23 15:31
 **/
@Component("divisionRuleMatchMessageListener")
public class DivisionRuleMatchMessageListener extends AbstractMrsMessageListener {

    public static final String CONSUME_GROUP = "division_rule_match_consumer";

    private static final Logger logger = LoggerFactory.getLogger(DivisionRuleMatchMessageListener.class);

    private final MrsApplyRouteService mrsApplyRouteService;

    private final MrsFunderMatchService mrsFunderMatchService;

    private final MrsMktFunderMatchService mrsMktFunderMatchService;

    private final MrsRuleResultService mrsRuleResultService;

    private final KieSessionHelper kieSessionHelper;

    public DivisionRuleMatchMessageListener(MrsApplyRouteService mrsApplyRouteService, MrsFunderMatchService mrsFunderMatchService, MrsMktFunderMatchService mrsMktFunderMatchService, MrsRuleResultService mrsRuleResultService, KieSessionHelper kieSessionHelper) {
        this.mrsApplyRouteService = mrsApplyRouteService;
        this.mrsFunderMatchService = mrsFunderMatchService;
        this.mrsMktFunderMatchService = mrsMktFunderMatchService;
        this.mrsRuleResultService = mrsRuleResultService;
        this.kieSessionHelper = kieSessionHelper;
    }

    @Override
    public String getConsumeGroupName() {
        return CONSUME_GROUP;
    }

    @Override
    public boolean allowRepeat() {
        return true;
    }

    @Override
    public BusinessResult businessProcess(MessageExt ext) {
        String message = new String(ext.getBody());
        logger.info("路由申请编号:{},开始匹配市场部推送规则:{}", ext.getKeys(), message);
        MrsApplyRoute mrsApplyRoute = mrsApplyRouteService.selectApplyRouteByRouteNo(ext.getKeys());
        if (mrsApplyRoute == null) {
            return BusinessResult.failure("路由申请信息不存在");
        }
        if (!ApplyStatusEnum.PUSH_RISK_COMPLETE.getCode().equals(mrsApplyRoute.getApplyStatus())) {
            return BusinessResult.failure("路由申请信息状态非法");
        }
        List<MrsFunderMatch> mrsFunderMatches = mrsFunderMatchService.selectFunderMatchByRoute(ext.getKeys());
        if (mrsFunderMatches == null || mrsFunderMatches.size() == 0) {
            return BusinessResult.failure("资金方匹配信息不存在");
        }
        List<MrsFunderMatch> passFunders = mrsFunderMatches.stream().filter(t -> "PASS".equals(t.getRiskResult())).collect(Collectors.toList());
        if (passFunders.size() <= 0) {
            return BusinessResult.failure("不存在风控通过的资金方");
        }
        List<MrsMktFunderMatch> mktFunderMatches = mrsMktFunderMatchService.selectMktFunderMatchByRouteNo(ext.getKeys());
        if (mktFunderMatches == null || mktFunderMatches.size() == 0) {
            return BusinessResult.failure("市场部资金方匹配信息不存在");
        }
        List<MrsRuleResult> mrsRuleResults = mrsRuleResultService.selectRuleResultByRouteNo(ext.getKeys(), "division_match");
        if (mrsRuleResults == null || mrsRuleResults.size() == 0) {
            return BusinessResult.failure("市场部资金方规则结果不存在");
        }
        try {
            DivisionRuleMatchMessageListener divisionRuleMatchMessageListener = ((DivisionRuleMatchMessageListener) AopContext.currentProxy());
            List<String> pushFunderCodes = divisionRuleMatchMessageListener.getFinalFunders(ext, mrsApplyRoute, passFunders, mktFunderMatches, mrsRuleResults);
            logger.info("路由申请编号:{},最终推送的资方为:{}", ext.getKeys(), JSONObject.toJSONString(pushFunderCodes));
            // 消息推送trs最终结果
        } catch (Exception e) {
            logger.info("路由申请编号:{},处理市场推送规则匹配异常:{}", ext.getKeys(), e.getMessage());
            return BusinessResult.failure("市场推送规则匹配处理异常");
        }
        return BusinessResult.success();
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<String> getFinalFunders(MessageExt ext, MrsApplyRoute mrsApplyRoute, List<MrsFunderMatch> passFunders, List<MrsMktFunderMatch> mktFunderMatches, List<MrsRuleResult> mrsRuleResults) throws IllegalAccessException {
        // 确定推送的资金方编码
        List<String> pushFunderCodes = new ArrayList<>();
        // 优先推送的资金方编码
        List<String> priorityPushFunderCodes = new ArrayList<>();
        // 不推送的资金方编码
        List<String> unPushFunderCodes = new ArrayList<>();
        // 风控通过的资金方编码
        List<String> passFunderCodes = passFunders.stream().map(MrsFunderMatch::getFunderCode).collect(Collectors.toList());
        // 该团队配置的资金方编码
        List<String> mktFundersCodes = mktFunderMatches.stream().map(MrsMktFunderMatch::getFunderCode).collect(Collectors.toList());
        // 交集的资金方编码
        List<String> sameFunderCodes = mktFundersCodes.stream().filter(passFunderCodes::contains).collect(Collectors.toList());
        if (sameFunderCodes.size() > 0) {
            List<MrsMktFunderMatch> sameMktFunderMatches = mktFunderMatches.stream().filter(t -> sameFunderCodes.contains(t.getFunderCode())).collect(Collectors.toList());
            for (MrsMktFunderMatch sameMktFunderMatch : sameMktFunderMatches) {
                // 过规则产出资金方顺序
                mktFunderRuleProcess(ext, mrsApplyRoute, mrsRuleResults, priorityPushFunderCodes, unPushFunderCodes, sameMktFunderMatch);
            }
            // 风控通过的资金方按照优先级排序
            passFunders.sort(Comparator.comparing(MrsFunderMatch::getPriority));
            // 移除不推送的资金方
            List<MrsFunderMatch> newFunderMatches = passFunders.stream().filter(t -> !unPushFunderCodes.contains(t.getFunderCode())).collect(Collectors.toList());
            // 存在优先推送的资金方
            if (priorityPushFunderCodes.size() > 0) {
                // 找出需要优先的资金方按照默认规则排序
                List<MrsFunderMatch> priorityFunderMatches = newFunderMatches.stream().filter(t -> priorityPushFunderCodes.contains(t.getFunderCode())).sorted(Comparator.comparing(MrsFunderMatch::getPriority)).collect(Collectors.toList());
                // 优先推送的资方数量大于2个，只取前2个推送
                if (priorityFunderMatches.size() >= 2) {
                    pushFunderCodes.add(priorityFunderMatches.get(0).getFunderCode());
                    pushFunderCodes.add(priorityFunderMatches.get(1).getFunderCode());
                } else {
                    newFunderMatches.removeAll(priorityFunderMatches);
                    pushFunderCodes.add(priorityFunderMatches.get(0).getFunderCode());
                    if (newFunderMatches.size() > 0) {
                        pushFunderCodes.add(newFunderMatches.get(0).getFunderCode());
                    }
                }
            } else {
                if (newFunderMatches.size() >= 2) {
                    pushFunderCodes.add(newFunderMatches.get(0).getFunderCode());
                    pushFunderCodes.add(newFunderMatches.get(1).getFunderCode());
                } else {
                    pushFunderCodes.add(newFunderMatches.get(0).getFunderCode());
                }
            }
        } else {
            // 没有相同的资金方配置按照原优先级推送
            passFunders.sort(Comparator.comparing(MrsFunderMatch::getPriority));
            if (passFunders.size() >= 2) {
                pushFunderCodes.add(passFunders.get(0).getFunderCode());
                pushFunderCodes.add(passFunders.get(1).getFunderCode());
            } else {
                pushFunderCodes.add(passFunders.get(0).getFunderCode());
            }
        }
        updateApplyRouteResult(mrsApplyRoute, pushFunderCodes);
        return pushFunderCodes;
    }

    private void mktFunderRuleProcess(MessageExt ext, MrsApplyRoute mrsApplyRoute, List<MrsRuleResult> mrsRuleResults, List<String> priorityPushFunderCodes, List<String> unPushFunderCodes, MrsMktFunderMatch sameMktFunderMatch) throws IllegalAccessException {
        KieSession kieSession = kieSessionHelper.getKieSession("division_match_" + sameMktFunderMatch.getDivisionId() + "_" + sameMktFunderMatch.getMktFunderConfigId());
        HitRuleListener hitRuleListener = new HitRuleListener();
        kieSession.addEventListener(hitRuleListener);
        kieSession.insert(Fact.makeFactMap(mrsApplyRoute));
        kieSession.fireAllRules();
        List<Rule> hitRules = hitRuleListener.getHitRules();
        List<MrsRuleResult> ruleResults = mrsRuleResults.stream().filter(t -> t.getConfigId().equals(sameMktFunderMatch.getMktFunderConfigId())).collect(Collectors.toList());
        if (hitRules.size() > 0 ) {
            if (hitRules.size() == ruleResults.size()) {
                logger.info("路由申请编号:{},团队配置ID:{},团队下资金方编码:{},全部命中", ext.getKeys(), sameMktFunderMatch.getDivisionId(), sameMktFunderMatch.getFunderCode());
                // 全部命中
                ruleResults.forEach(t -> updateRuleResultStatus(t, YorNEnum.Y.getCode()));
                sameMktFunderMatch.setMatchStatus(ResultStatusEnum.MATCH_ED.getCode());
                sameMktFunderMatch.setHitSign(YorNEnum.Y.getCode());
                // 命中后推送
                if (YorNEnum.Y.getCode().equals(sameMktFunderMatch.getWhetherToPush())) {
                    logger.info("路由申请编号:{},团队配置ID:{},团队下资金方编码:{},全部命中后优先推送", ext.getKeys(), sameMktFunderMatch.getDivisionId(), sameMktFunderMatch.getFunderCode());
                    priorityPushFunderCodes.add(sameMktFunderMatch.getFunderCode());
                } else {
                    logger.info("路由申请编号:{},团队配置ID:{},团队下资金方编码:{},全部命中后不推送", ext.getKeys(), sameMktFunderMatch.getDivisionId(), sameMktFunderMatch.getFunderCode());
                    unPushFunderCodes.add(sameMktFunderMatch.getFunderCode());
                }
            } else {
                // 部分命中 走默认推送规则
                List<MrsRuleResult> matchList = getMatchRules(hitRules, ruleResults);
                logger.info("路由申请编号:{},团队配置ID:{},团队下资金方编码:{},命中的规则:{}", ext.getKeys(), sameMktFunderMatch.getDivisionId(), sameMktFunderMatch.getFunderCode(), JSONObject.toJSONString(matchList));
                matchList.forEach(e -> updateRuleResultStatus(e, YorNEnum.Y.getCode()));
                ruleResults.removeAll(matchList);
                logger.info("路由申请编号:{},团队配置ID:{},团队下资金方编码:{},未命中的规则:{}", ext.getKeys(), sameMktFunderMatch.getDivisionId(), sameMktFunderMatch.getFunderCode(), JSONObject.toJSONString(ruleResults));
                ruleResults.forEach(e -> updateRuleResultStatus(e, YorNEnum.N.getCode()));
                sameMktFunderMatch.setMatchStatus(ResultStatusEnum.MATCH_ED.getCode());
                sameMktFunderMatch.setHitSign(YorNEnum.N.getCode());
            }
            mrsMktFunderMatchService.updateMktFunderMatch(sameMktFunderMatch);
        } else {
            // 全部未命中 走默认推送顺序
            logger.info("路由申请编号:{},团队配置ID:{},团队下资金方编码:{},全部未命中规则", ext.getKeys(), sameMktFunderMatch.getDivisionId(), sameMktFunderMatch.getFunderCode());
            sameMktFunderMatch.setMatchStatus(ResultStatusEnum.MATCH_ED.getCode());
            sameMktFunderMatch.setHitSign(YorNEnum.N.getCode());
            mrsMktFunderMatchService.updateMktFunderMatch(sameMktFunderMatch);
            ruleResults.forEach(t -> updateRuleResultStatus(t, YorNEnum.N.getCode()));
        }
    }

    private void updateApplyRouteResult(MrsApplyRoute mrsApplyRoute, List<String> pushFunderCodes) {
        StringBuilder funderCodes = new StringBuilder();
        for (String code : pushFunderCodes) {
            funderCodes.append(code).append(",");
        }
        mrsApplyRoute.setFunderResult(funderCodes.substring(0, funderCodes.lastIndexOf(",")));
        mrsApplyRoute.setApplyStatus(ApplyStatusEnum.ROUTE_COMPLETE.getCode());
        mrsApplyRoute.setRemark(ApplyStatusEnum.ROUTE_COMPLETE.getName());
        mrsApplyRouteService.updateApplyRoute(mrsApplyRoute);
    }

    private void updateRuleResultStatus(MrsRuleResult ruleResult, String hit) {
        ruleResult.setHitSign(hit);
        ruleResult.setResultStatus(ResultStatusEnum.MATCH_ED.getCode());
        mrsRuleResultService.updateRuleResult(ruleResult);
    }
}
