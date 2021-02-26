package com.newland.mrs.impl.service.dao;

import com.newland.mrs.persist.mapper.MrsRuleDetailMapper;
import com.newland.mrs.persist.model.MrsRuleDetail;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * MrsRuleDetailDao
 * 系统规则明细数据持久层dao
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-29 14:32
 **/
public interface MrsRuleDetailDao extends MrsRuleDetailMapper {

    /**
     * 根据规则编号查询规则明细
     * @param ids 小类规则配置id
     * @param ruleGroup 规则组别
     * @return List<MrsRuleDetail>
     */
    @Select({
            "<script>",
                "select * from mrs_rule_detail where enable='Y' and rule_group=#{ruleGroup} and config_id in",
                "<foreach collection='ids' item='id' open='(' separator=',' close=')'>",
                "#{id}",
                "</foreach>",
            "</script>"
    })
    List<MrsRuleDetail> selectRuleDetailByConfigIds(@Param("ids") List<Long> ids, @Param("ruleGroup") String ruleGroup);

    /**
     * 根据小类配置ID查询规则明细
     * @param configId 小类配置ID
     * @param ruleGroup 规则组别
     * @return List<MrsRuleDetail>
     */
    @Select("select * from mrs_rule_detail where config_id=#{configId} and rule_group=#{ruleGroup} and enable='Y'")
    List<MrsRuleDetail> selectRuleDetailByConfigId(@Param("configId") Long configId, @Param("ruleGroup") String ruleGroup);
}
