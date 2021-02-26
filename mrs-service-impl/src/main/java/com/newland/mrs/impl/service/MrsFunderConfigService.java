package com.newland.mrs.impl.service;

import com.newland.mrs.persist.model.MrsFunderConfig;

import java.util.List;

/**
 * MrsFunderConfigService
 * 规则配置数据持久层接口
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-27 18:02
 **/
public interface MrsFunderConfigService {

    /**
     * 新增资金方配置信息
     * @param mrsFunderConfig 资金方配置
     */
    void insertFunderConfig(MrsFunderConfig mrsFunderConfig);

    /**
     * 更新资金方配置信息
     * @param mrsFunderConfig 资金方配置
     */
    void updateFunderConfig(MrsFunderConfig mrsFunderConfig);

    /**
     * 查询在启用状态的资金方
     * @param ruleNo 规则编号
     * @return List<MrsFunderConfig>
     */
    List<MrsFunderConfig> selectFunderConfigEnable(String ruleNo);
}
