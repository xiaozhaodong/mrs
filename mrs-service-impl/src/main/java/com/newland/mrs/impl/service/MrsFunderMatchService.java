package com.newland.mrs.impl.service;

import com.newland.mrs.persist.model.MrsFunderMatch;

import java.util.List;

/**
 * MrsFunderMatchService
 * 资金方匹配信息数据持久层Service
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-01 15:43
 **/
public interface MrsFunderMatchService {

    /**
     * 新增资金方匹配信息
     * @param mrsFunderMatch 金方匹配信息
     */
    void insertFunderMatch(MrsFunderMatch mrsFunderMatch);

    /**
     * 更新资金方匹配信息
     * @param mrsFunderMatch 金方匹配信息
     */
    void updateFunderMatch(MrsFunderMatch mrsFunderMatch);

    /**
     * 根据路由编号查询资金方匹配信息
     * @param routeNo 路由编号
     * @return List<MrsFunderMatch>
     */
    List<MrsFunderMatch> selectFunderMatchByRoute(String routeNo);
}
