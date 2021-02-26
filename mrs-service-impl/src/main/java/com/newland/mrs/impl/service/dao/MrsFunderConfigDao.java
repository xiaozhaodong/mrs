package com.newland.mrs.impl.service.dao;

import com.newland.mrs.persist.mapper.MrsFunderConfigMapper;
import com.newland.mrs.persist.model.MrsFunderConfig;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * MrsFunderConfigDao
 * 资金方配置信息持久层操作扩展
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-27 18:07
 **/
public interface MrsFunderConfigDao extends MrsFunderConfigMapper {

    /**
     * 查询在启用状态的资金方
     * @param ruleNo 规则编号
     * @return List<MrsFunderConfig>
     */
    @Select("select * from mrs_funder_config where rule_no=#{ruleNo} and enable='Y'")
    List<MrsFunderConfig> selectFunderConfigEnable(@Param("ruleNo") String ruleNo);
}
