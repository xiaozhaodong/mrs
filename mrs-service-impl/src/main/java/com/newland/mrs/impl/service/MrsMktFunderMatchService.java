package com.newland.mrs.impl.service;

import com.newland.mrs.persist.model.MrsMktFunderMatch;

import java.util.List;

/**
 * MrsMktFunderMatchService
 * 市场部推送资金方匹配信息数据持久层Service
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-25 12:06
 **/
public interface MrsMktFunderMatchService {

    /**
     * 新增市场部推送资金方匹配信息
     * @param mrsMktFunderMatch 场部推送资金方匹配信息
     */
    void insertMktFunderMatch(MrsMktFunderMatch mrsMktFunderMatch);

    /**
     * 更新市场部推送资金方匹配信息
     * @param mrsMktFunderMatch 场部推送资金方匹配信息
     */
    void updateMktFunderMatch(MrsMktFunderMatch mrsMktFunderMatch);

    /**
     * 根据路由申请编号查询市场部资金方匹配信息
     * @param routeNo 路由申请编号
     * @return List<MrsMktFunderMatch>
     */
    List<MrsMktFunderMatch> selectMktFunderMatchByRouteNo(String routeNo);
}
