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
import com.newland.mrs.impl.mq.producer.MrsMessageProducer;
import com.newland.mrs.impl.service.MrsApplyRouteService;
import com.newland.mrs.impl.service.MrsFunderMatchService;
import com.newland.mrs.impl.service.MrsRuleResultService;
import com.newland.mrs.persist.model.MrsApplyRoute;
import com.newland.mrs.persist.model.MrsFunderMatch;
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
import java.util.List;
import java.util.stream.Collectors;

/**
 * RouteRuleMatchMessageListener
 * 路由规则匹配消息监听
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-31 17:16
 **/
@Component("routeRuleMatchMessageListener")
public class RouteRuleMatchMessageListener extends AbstractMrsMessageListener {

    public static final String CONSUME_GROUP = "route_rule_match_consumer";

    private static final Logger logger = LoggerFactory.getLogger(RouteRuleMatchMessageListener.class);

    private final MrsApplyRouteService mrsApplyRouteService;

    private final MrsRuleResultService mrsRuleResultService;

    private final MrsFunderMatchService mrsFunderMatchService;

    private final KieSessionHelper kieSessionHelper;

    private final MrsMessageProducer mrsMessageProducer;

    public RouteRuleMatchMessageListener(MrsApplyRouteService mrsApplyRouteService, MrsRuleResultService mrsRuleResultService, MrsFunderMatchService mrsFunderMatchService, KieSessionHelper kieSessionHelper, MrsMessageProducer mrsMessageProducer) {
        this.mrsApplyRouteService = mrsApplyRouteService;
        this.mrsRuleResultService = mrsRuleResultService;
        this.mrsFunderMatchService = mrsFunderMatchService;
        this.kieSessionHelper = kieSessionHelper;
        this.mrsMessageProducer = mrsMessageProducer;
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
        logger.info("路由申请编号:{},开始匹配资金方要素匹配规则:{}", ext.getKeys(), message);
        MrsApplyRoute mrsApplyRoute = mrsApplyRouteService.selectApplyRouteByRouteNo(ext.getKeys());
        if (mrsApplyRoute == null) {
            return BusinessResult.failure("路由申请信息不存在");
        }
        if (!ApplyStatusEnum.INIT.getCode().equals(mrsApplyRoute.getApplyStatus())) {
            return BusinessResult.failure("路由申请信息状态非法");
        }
        List<MrsFunderMatch> mrsFunderMatches = mrsFunderMatchService.selectFunderMatchByRoute(ext.getKeys());
        if (mrsFunderMatches == null || mrsFunderMatches.size() == 0) {
            return BusinessResult.failure("资金方配置信息不存在");
        }
        List<MrsRuleResult> mrsRuleResults = mrsRuleResultService.selectRuleResultByRouteNo(ext.getKeys(), "funder_element");
        if (mrsRuleResults == null || mrsRuleResults.size() == 0) {
            return BusinessResult.failure("路由规则匹配结果信息不存在");
        }
        try {
            RouteRuleMatchMessageListener routeRuleMatchMessageListener = ((RouteRuleMatchMessageListener) AopContext.currentProxy());
            List<MrsFunderMatch> matchFunders = routeRuleMatchMessageListener.ruleMatchProcess(ext, mrsApplyRoute, mrsFunderMatches, mrsRuleResults);
            logger.info("路由申请编号:{},资金要素匹配匹配到到资金方:{}", ext.getKeys(), JSONObject.toJSONString(matchFunders));
            if (matchFunders.size() > 0) {
//                mrsMessageProducer.producerMessage("risk_invoke", mrsApplyRoute.getRouteNo(), mrsApplyRoute.getRouteNo());
            } else {
//                System.out.println("通知trs走自营");
            }
        } catch (Exception e) {
            logger.info("路由申请编号:{},处理规则匹配异常:{}", ext.getKeys(), e.getMessage());
            return BusinessResult.failure("规则匹配处理异常");
        }
        return BusinessResult.success();
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
    public List<MrsFunderMatch> ruleMatchProcess(MessageExt ext, MrsApplyRoute mrsApplyRoute, List<MrsFunderMatch> mrsFunderMatches, List<MrsRuleResult> mrsRuleResults) throws IllegalAccessException {
        List<MrsFunderMatch> matchFunders = new ArrayList<>();
        for (MrsFunderMatch funderMatch : mrsFunderMatches) {
            KieSession kieSession = kieSessionHelper.getKieSession("funder_element_" + funderMatch.getFunderConfigId().toString());
            HitRuleListener hitRuleListener = new HitRuleListener();
            kieSession.addEventListener(hitRuleListener);
            kieSession.insert(Fact.makeFactMap(mrsApplyRoute));
            kieSession.fireAllRules();
            List<Rule> hitRules = hitRuleListener.getHitRules();
            // 筛选出当前资金方的规则
            List<MrsRuleResult> funderRuleResults = mrsRuleResults.stream().filter(m -> funderMatch.getFunderConfigId().compareTo(m.getConfigId()) == 0).collect(Collectors.toList());
            if (hitRules.size() > 0) {
                if (hitRules.size() == funderRuleResults.size()) {
                    logger.info("路由申请编号:{},配置资金方编号:{},全部命中", ext.getKeys(), funderMatch.getFunderCode());
                    funderRuleResults.forEach(e -> updateRuleResultStatus(e, YorNEnum.Y.getCode()));
                    matchFunders.add(funderMatch);
                    funderMatch.setMatchStatus(ResultStatusEnum.MATCH_ED.getCode());
                    funderMatch.setHitSign(YorNEnum.Y.getCode());
                } else {
                    List<MrsRuleResult> matchList = getMatchRules(hitRules, funderRuleResults);
                    logger.info("路由申请编号:{},配置资金方编号:{},命中的规则:{}", ext.getKeys(), funderMatch.getFunderCode(), JSONObject.toJSONString(matchList));
                    matchList.forEach(e -> updateRuleResultStatus(e, YorNEnum.Y.getCode()));
                    funderRuleResults.removeAll(matchList);
                    logger.info("路由申请编号:{},配置资金方编号:{},未命中的规则:{}", ext.getKeys(), funderMatch.getFunderCode(), JSONObject.toJSONString(funderRuleResults));
                    funderRuleResults.forEach(e -> updateRuleResultStatus(e, YorNEnum.N.getCode()));
                    funderMatch.setMatchStatus(ResultStatusEnum.MATCH_ED.getCode());
                    funderMatch.setHitSign(YorNEnum.N.getCode());
                }
                mrsFunderMatchService.updateFunderMatch(funderMatch);
            } else {
                logger.info("路由申请编号:{},配置资金方编号:{},全部未命中", ext.getKeys(), funderMatch.getFunderCode());
                funderMatch.setMatchStatus(ResultStatusEnum.MATCH_ED.getCode());
                funderMatch.setHitSign(YorNEnum.N.getCode());
                mrsFunderMatchService.updateFunderMatch(funderMatch);
                funderRuleResults.forEach(e -> updateRuleResultStatus(e, YorNEnum.N.getCode()));
            }
        }
        mrsApplyRoute.setApplyStatus(ApplyStatusEnum.FUNDER_MATCH_EN.getCode());
        mrsApplyRoute.setRemark(ApplyStatusEnum.FUNDER_MATCH_EN.getName());
        mrsApplyRouteService.updateApplyRoute(mrsApplyRoute);
        return matchFunders;
    }

    private void updateRuleResultStatus(MrsRuleResult ruleResult, String hit) {
        ruleResult.setHitSign(hit);
        ruleResult.setResultStatus(ResultStatusEnum.MATCH_ED.getCode());
        mrsRuleResultService.updateRuleResult(ruleResult);
    }
}
