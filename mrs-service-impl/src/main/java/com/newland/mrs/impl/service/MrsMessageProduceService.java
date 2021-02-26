package com.newland.mrs.impl.service;

import com.newland.mrs.persist.model.MrsMessageProduce;

/**
 * MrsMessageProduceService
 * 消息发送记录数据层操作接口
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-07 11:19
 **/
public interface MrsMessageProduceService {

    /**
     * 新增消息发送
     * @param messageProduce 消息发送对象
     */
    void insertSelective(MrsMessageProduce messageProduce);

    /**
     * 根据条件查询对应的消息发送记录
     * @param condition 查询条件
     * @return FpsMessageProduce
     */
    MrsMessageProduce selectMessageProduceByCondition(MrsMessageProduce condition);
}
