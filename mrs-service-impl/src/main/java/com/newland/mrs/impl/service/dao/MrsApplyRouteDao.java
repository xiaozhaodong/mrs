package com.newland.mrs.impl.service.dao;

import com.newland.mrs.persist.mapper.MrsApplyRouteMapper;
import com.newland.mrs.persist.model.MrsApplyRoute;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * MrsApplyRouteDao
 * 路由申请数据持久层dao
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-31 09:58
 **/
public interface MrsApplyRouteDao extends MrsApplyRouteMapper {

    /**
     * 根据路由申请编号查询路由信息
     * @param routeNo 路由申请编号
     * @return 路由申请信息
     */
    @Select("select * from mrs_apply_route where route_no=#{routeNo}")
    MrsApplyRoute selectApplyRouteByRouteNo(@Param("routeNo") String routeNo);
}
