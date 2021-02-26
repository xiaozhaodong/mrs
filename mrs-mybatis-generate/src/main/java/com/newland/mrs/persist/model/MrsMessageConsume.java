package com.newland.mrs.persist.model;

import java.io.Serializable;
import java.util.Date;

public class MrsMessageConsume implements Serializable {
    /**
     * 消息key
     *
     * @mbg.generated
     */
    private String messageKey;

    /**
     * 消费者组
     *
     * @mbg.generated
     */
    private String consumeGroup;

    /**
     * 生产者组
     *
     * @mbg.generated
     */
    private String producerGroup;

    /**
     * 消息主题
     *
     * @mbg.generated
     */
    private String topic;

    /**
     * 子主题
     *
     * @mbg.generated
     */
    private String tags;

    /**
     * 中间件产生的消息id
     *
     * @mbg.generated
     */
    private String messageId;

    /**
     * 系统日期
     *
     * @mbg.generated
     */
    private Date sysDate;

    /**
     * 消费时间
     *
     * @mbg.generated
     */
    private Date consumeTime;

    /**
     * 是否允许重复消费
     *
     * @mbg.generated
     */
    private String allowRepeat;

    /**
     * 重复次数
     *
     * @mbg.generated
     */
    private Integer repeatCount;

    /**
     * 业务处理状态
     *
     * @mbg.generated
     */
    private String businessStatus;

    /**
     * 业务处理描述
     *
     * @mbg.generated
     */
    private String businessDesc;

    /**
     * 消息内容
     *
     * @mbg.generated
     */
    private String context;

    private static final long serialVersionUID = 1L;

    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    public String getConsumeGroup() {
        return consumeGroup;
    }

    public void setConsumeGroup(String consumeGroup) {
        this.consumeGroup = consumeGroup;
    }

    public String getProducerGroup() {
        return producerGroup;
    }

    public void setProducerGroup(String producerGroup) {
        this.producerGroup = producerGroup;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public Date getSysDate() {
        return sysDate;
    }

    public void setSysDate(Date sysDate) {
        this.sysDate = sysDate;
    }

    public Date getConsumeTime() {
        return consumeTime;
    }

    public void setConsumeTime(Date consumeTime) {
        this.consumeTime = consumeTime;
    }

    public String getAllowRepeat() {
        return allowRepeat;
    }

    public void setAllowRepeat(String allowRepeat) {
        this.allowRepeat = allowRepeat;
    }

    public Integer getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(Integer repeatCount) {
        this.repeatCount = repeatCount;
    }

    public String getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(String businessStatus) {
        this.businessStatus = businessStatus;
    }

    public String getBusinessDesc() {
        return businessDesc;
    }

    public void setBusinessDesc(String businessDesc) {
        this.businessDesc = businessDesc;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", messageKey=").append(messageKey);
        sb.append(", consumeGroup=").append(consumeGroup);
        sb.append(", producerGroup=").append(producerGroup);
        sb.append(", topic=").append(topic);
        sb.append(", tags=").append(tags);
        sb.append(", messageId=").append(messageId);
        sb.append(", sysDate=").append(sysDate);
        sb.append(", consumeTime=").append(consumeTime);
        sb.append(", allowRepeat=").append(allowRepeat);
        sb.append(", repeatCount=").append(repeatCount);
        sb.append(", businessStatus=").append(businessStatus);
        sb.append(", businessDesc=").append(businessDesc);
        sb.append(", context=").append(context);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}