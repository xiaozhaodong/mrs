package com.newland.mrs.impl.service;

import com.newland.mrs.persist.model.MrsRuleConfig;

import java.util.List;

/**
 * MrsRuleConfigService
 * 规则主表数据持久化接口
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-29 10:43
 **/
public interface MrsRuleConfigService {

    /**
     * 新增规则主表
     * @param mrsRuleConfig 规则主表信息
     */
    void insertRuleConfig(MrsRuleConfig mrsRuleConfig);

    /**
     * 更新规则主表
     * @param mrsRuleConfig 规则主表信息
     */
    void updateRuleConfig(MrsRuleConfig mrsRuleConfig);

    /**
     * 加载启用的
     * @param ruleNos 配置启用的规则号
     * @return List<MrsRuleConfig>
     */
    List<MrsRuleConfig> selectMrsRuleByRuleNos(List<String> ruleNos);

    /**
     * 根据规则编号查询对应规则信息
     * @param ruleNo 规则编号
     * @return 规则信息
     */
    MrsRuleConfig selectRuleConfigByRuleNo(String ruleNo);
}
