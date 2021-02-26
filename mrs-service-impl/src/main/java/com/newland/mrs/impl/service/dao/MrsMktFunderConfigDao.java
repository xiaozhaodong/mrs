package com.newland.mrs.impl.service.dao;

import com.newland.mrs.persist.mapper.MrsMktFunderConfigMapper;
import com.newland.mrs.persist.model.MrsMktFunderConfig;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * MrsMktFunderConfigDao
 * 市场部下资金方匹配信息数据持久层Dao
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-25 10:55
 **/
public interface MrsMktFunderConfigDao extends MrsMktFunderConfigMapper {

    /**
     * 根据事业部团队配置ID查询对应的可用的资方匹配信息
     * @param divisionId 事业部团队配置ID
     * @return List<MrsMktFunderConfig>
     */
    @Select("select * from mrs_mkt_funder_config where division_id=#{divisionId} and enable='Y'")
    List<MrsMktFunderConfig> selectMktFunderByDivisionId(@Param("divisionId") Long divisionId);
}
