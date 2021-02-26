package com.newland.mrs.impl.service.dao;

import com.newland.mrs.persist.mapper.MrsRuleConfigMapper;
import com.newland.mrs.persist.model.MrsRuleConfig;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * MrsRuleConfigDao
 * 规则主表数据持久化接扣dao
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-29 11:13
 **/
public interface MrsRuleConfigDao extends MrsRuleConfigMapper {

    /**
     * 加载启用的
     * @param ruleNos 配置启用的规则号
     * @return List<MrsRuleConfig>
     */
    @Select({
            "<script>",
                "select * from mrs_rule_config where enable='Y' and rule_no in",
                "<foreach collection='ruleNos' item='id' open='(' separator=',' close=')'>",
                    "#{id}",
                "</foreach>",
            "</script>"
    })
    List<MrsRuleConfig> selectMrsRuleByRuleNos(@Param("ruleNos") List<String> ruleNos);

    /**
     * 根据规则编号查询对应规则信息
     * @param ruleNo 规则编号
     * @return 规则信息
     */
    @Select("select * from mrs_rule_config where rule_no=#{ruleNo} and enable='Y'")
    MrsRuleConfig selectRuleConfigByRuleNo(String ruleNo);
}
