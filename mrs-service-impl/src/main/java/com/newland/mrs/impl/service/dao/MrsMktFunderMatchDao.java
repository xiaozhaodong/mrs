package com.newland.mrs.impl.service.dao;

import com.newland.mrs.persist.mapper.MrsMktFunderMatchMapper;
import com.newland.mrs.persist.model.MrsMktFunderMatch;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * MrsMktFunderMatchDao
 * 市场部推送资金方匹配信息数据持久层Dao
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-25 12:18
 **/
public interface MrsMktFunderMatchDao extends MrsMktFunderMatchMapper {

    /**
     * 根据路由申请编号查询市场部资金方匹配信息
     * @param routeNo 路由申请编号
     * @return List<MrsMktFunderMatch>
     */
    @Select("select * from mrs_mkt_funder_match where route_no=#{routeNo}")
    List<MrsMktFunderMatch> selectMktFunderMatchByRouteNo(@Param("routeNo") String routeNo);
}
