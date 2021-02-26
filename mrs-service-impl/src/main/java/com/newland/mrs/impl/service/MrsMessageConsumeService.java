package com.newland.mrs.impl.service;

import com.newland.mrs.persist.model.MrsMessageConsume;

/**
 * MrsMessageConsumeService
 * 消息消费信息数据持久层操作接口
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-08 11:00
 **/
public interface MrsMessageConsumeService {

    /**
     * 根据主键查询消息消费记录
     * @param messageKey 消息业务ID
     * @param consumeGroup 消费者组名
     * @return MrsMessageConsume
     */
    MrsMessageConsume selectByPrimaryKey(String messageKey, String consumeGroup);

    /**
     * 新增消息记录
     * @param messageConsume 消息信息
     */
    void insertMessageConsume(MrsMessageConsume messageConsume);

    /**
     * 更新消息记录
     * @param messageConsume 消息信息
     */
    void updateMessageConsume(MrsMessageConsume messageConsume);
}
