package com.newland.mrs.impl.service.dao;

import com.newland.mrs.persist.mapper.MrsDivisionConfigMapper;
import com.newland.mrs.persist.model.MrsDivisionConfig;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * MrsDivisionConfigDao
 * 事业部团队配置数据持久层Dao
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-23 11:00
 **/
public interface MrsDivisionConfigDao extends MrsDivisionConfigMapper {

    /**
     * 查询启用状态的团队配置信息
     * @param ruleNo 规则编号
     * @return List<MrsDivisionConfig>
     */
    @Select("select * from mrs_division_config where rule_no=#{ruleNo} and enable='Y'")
    List<MrsDivisionConfig> selectDivisionConfigByRuleNo(@Param("ruleNo") String ruleNo);

    /**
     * 根据团队编号查询是业务团队配置信息
     * @param ruleNo 规则编号
     * @param divisionCode 事业部编号
     * @param teamCode 事业部团队编号
     * @return MrsDivisionConfig
     */
    @Select("select * from mrs_division_config where rule_no=#{ruleNo} and division_code=#{divisionCode} and team_code=#{teamCode} and enable='Y'")
    MrsDivisionConfig selectDivisionByTeamCode(@Param("ruleNo") String ruleNo, @Param("divisionCode") String divisionCode, @Param("teamCode") String teamCode);
}
