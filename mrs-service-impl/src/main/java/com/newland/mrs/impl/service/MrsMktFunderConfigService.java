package com.newland.mrs.impl.service;

import com.newland.mrs.persist.model.MrsMktFunderConfig;

import java.util.List;

/**
 * MrsMktFunderConfigService
 * 市场部下资金方匹配信息数据持久层Service
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-25 10:48
 **/
public interface MrsMktFunderConfigService {

    /**
     * 新增市场部下资金方匹配信息
     * @param mrsMktFunderConfig 部下资金方匹配信息
     */
    void insertMktFunderConfig(MrsMktFunderConfig mrsMktFunderConfig);

    /**
     * 更新市场部下资金方匹配信息
     * @param mrsMktFunderConfig 部下资金方匹配信息
     */
    void updateMktFunderConfig(MrsMktFunderConfig mrsMktFunderConfig);

    /**
     * 根据事业部团队配置ID查询对应的可用的资方匹配信息
     * @param divisionId 事业部团队配置ID
     * @return List<MrsMktFunderConfig>
     */
    List<MrsMktFunderConfig> selectMktFunderByDivisionId(Long divisionId);
}
