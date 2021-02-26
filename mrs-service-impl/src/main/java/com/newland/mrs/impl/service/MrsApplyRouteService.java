package com.newland.mrs.impl.service;

import com.newland.mrs.persist.model.MrsApplyRoute;

/**
 * MrsApplyRouteService
 * 路由申请数据持久层Service
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-31 09:51
 **/
public interface MrsApplyRouteService {

    /**
     * 新增路由申请信息
     * @param mrsApplyRoute 由申请信息
     */
    void insertApplyRoute(MrsApplyRoute mrsApplyRoute);

    /**
     * 更新路由申请信息
     * @param mrsApplyRoute 由申请信息
     */
    void updateApplyRoute(MrsApplyRoute mrsApplyRoute);

    /**
     * 根据路由申请编号查询路由信息
     * @param routeNo 路由申请编号
     * @return 路由申请信息
     */
    MrsApplyRoute selectApplyRouteByRouteNo(String routeNo);
}
