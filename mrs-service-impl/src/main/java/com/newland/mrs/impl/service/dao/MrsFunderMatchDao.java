package com.newland.mrs.impl.service.dao;

import com.newland.mrs.persist.mapper.MrsFunderMatchMapper;
import com.newland.mrs.persist.model.MrsFunderMatch;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * MrsFunderMatchDao
 * 资金方匹配信息数据持久层Dao
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-01 15:59
 **/
public interface MrsFunderMatchDao extends MrsFunderMatchMapper {

    /**
     * 根据路由编号查询资金方匹配信息
     * @param routeNo 路由编号
     * @return List<MrsFunderMatch>
     */
    @Select("select * from mrs_funder_match where route_no=#{routeNo}")
    List<MrsFunderMatch> selectFunderMatchByRoute(@Param("routeNo") String routeNo);
}
