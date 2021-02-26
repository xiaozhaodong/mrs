package com.newland.mrs.impl.service;

import com.newland.mrs.persist.model.MrsRuleDetail;

import java.util.List;

/**
 * MrsRuleDetailService
 * 系统规则明细数据持久层service
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-29 14:14
 **/
public interface MrsRuleDetailService {

    /**
     * 新增规则明细
     * @param mrsRuleDetail 规则明细信息
     */
    void insertRuleDetail(MrsRuleDetail mrsRuleDetail);

    /**
     * 更新规则明细
     * @param mrsRuleDetail 规则明细信息
     */
    void updateRuleDetail(MrsRuleDetail mrsRuleDetail);

    /**
     * 根据规则编号查询规则明细
     * @param ids 小类规则配置id
     * @param ruleGroup 规则组别
     * @return List<MrsRuleDetail>
     */
    List<MrsRuleDetail> selectRuleDetailByConfigIds(List<Long> ids, String ruleGroup);

    /**
     * 根据小类配置ID查询规则明细
     * @param configId 小类配置ID
     * @param ruleGroup 规则组别
     * @return List<MrsRuleDetail>
     */
    List<MrsRuleDetail> selectRuleDetailByConfigId(Long configId, String ruleGroup);
}
