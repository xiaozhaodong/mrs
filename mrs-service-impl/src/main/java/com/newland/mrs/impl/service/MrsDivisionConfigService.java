package com.newland.mrs.impl.service;

import com.newland.mrs.persist.model.MrsDivisionConfig;

import java.util.List;

/**
 * MrsDivisionConfigService
 * 事业部团队配置数据持久层Service
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-23 10:53
 **/
public interface MrsDivisionConfigService {

    /**
     * 新增事业部团队配置
     * @param mrsDivisionConfig 事业部团队配置
     */
    void insertDivisionConfig(MrsDivisionConfig mrsDivisionConfig);

    /**
     * 更新事业部团队配置
     * @param mrsDivisionConfig 事业部团队配置
     */
    void updateDivisionConfig(MrsDivisionConfig mrsDivisionConfig);

    /**
     * 查询启用状态的团队配置信息
     * @param ruleNo 规则编号
     * @return List<MrsDivisionConfig>
     */
    List<MrsDivisionConfig> selectDivisionConfigByRuleNo(String ruleNo);

    /**
     * 根据团队编号查询是业务团队配置信息
     * @param ruleNo 规则编号
     * @param divisionCode 事业部编号
     * @param teamCode 事业部团队编号
     * @return MrsDivisionConfig
     */
    MrsDivisionConfig selectDivisionByTeamCode(String ruleNo, String divisionCode, String teamCode);
}
