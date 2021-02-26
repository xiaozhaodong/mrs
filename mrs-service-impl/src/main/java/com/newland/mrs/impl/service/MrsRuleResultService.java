package com.newland.mrs.impl.service;

import com.newland.mrs.persist.model.MrsRuleResult;

import java.util.List;

/**
 * MrsRuleResultService
 * 规则匹配结果数据持久层Service
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-31 11:25
 **/
public interface MrsRuleResultService {

    /**
     * 保存规则匹配结果信息
     * @param mrsRuleResult 规则匹配结果信息
     */
    void insertRuleResult(MrsRuleResult mrsRuleResult);

    /**
     * 更新规则匹配结果信息
     * @param mrsRuleResult 规则匹配结果信息
     */
    void updateRuleResult(MrsRuleResult mrsRuleResult);

    /**
     * 根据路由编号查询路由结果信息
     * @param routeNo 路由申请编号
     * @param ruleGroup 规则组名
     * @return List<MrsRuleResult>
     */
    List<MrsRuleResult> selectRuleResultByRouteNo(String routeNo, String ruleGroup);
}
