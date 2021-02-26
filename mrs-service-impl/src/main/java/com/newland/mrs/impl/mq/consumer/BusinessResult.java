package com.newland.mrs.impl.mq.consumer;

import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;

/**
 * BusinessResult
 * 消息业务处理结果
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-08 14:58
 **/
public class BusinessResult {

    private String status;

    private String desc;

    private ConsumeConcurrentlyStatus consumeConcurrentlyStatus;

    /**
     * 业务处理成功
     * @return BusinessResult
     */
    public static BusinessResult success() {
        BusinessResult businessResult = new BusinessResult();
        businessResult.setStatus("S");
        businessResult.setDesc("业务处理成功");
        businessResult.setConsumeConcurrentlyStatus(ConsumeConcurrentlyStatus.CONSUME_SUCCESS);
        return businessResult;
    }

    /**
     * 处理成功带参数
     * @param desc 成功描述
     * @param consumeConcurrentlyStatus mq处理状态
     * @return BusinessResult
     */
    public static BusinessResult success(String desc, ConsumeConcurrentlyStatus consumeConcurrentlyStatus) {
        BusinessResult businessResult = new BusinessResult();
        businessResult.setStatus("S");
        businessResult.setDesc(desc);
        businessResult.setConsumeConcurrentlyStatus(consumeConcurrentlyStatus);
        return businessResult;
    }

    /**
     * 处理失败
     * @param desc 失败描述
     * @return BusinessResult
     */
    public static BusinessResult failure(String desc) {
        BusinessResult businessResult = new BusinessResult();
        businessResult.setStatus("F");
        businessResult.setDesc("业务处理失败," + desc);
        businessResult.setConsumeConcurrentlyStatus(ConsumeConcurrentlyStatus.CONSUME_SUCCESS);
        return businessResult;
    }

    /**
     * 处理失败带mq状态参数
     * @param desc 失败描述
     * @param consumeConcurrentlyStatus mq处理状态标示
     * @return BusinessResult
     */
    public static BusinessResult failure(String desc, ConsumeConcurrentlyStatus consumeConcurrentlyStatus) {
        BusinessResult businessResult = new BusinessResult();
        businessResult.setStatus("F");
        businessResult.setDesc("业务处理失败," + desc);
        businessResult.setConsumeConcurrentlyStatus(consumeConcurrentlyStatus);
        return businessResult;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ConsumeConcurrentlyStatus getConsumeConcurrentlyStatus() {
        return consumeConcurrentlyStatus;
    }

    public void setConsumeConcurrentlyStatus(ConsumeConcurrentlyStatus consumeConcurrentlyStatus) {
        this.consumeConcurrentlyStatus = consumeConcurrentlyStatus;
    }
}
