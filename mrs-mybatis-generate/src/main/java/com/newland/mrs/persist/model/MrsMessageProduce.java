package com.newland.mrs.persist.model;

import java.io.Serializable;
import java.util.Date;

public class MrsMessageProduce implements Serializable {
    /**
     * 主键
     *
     * @mbg.generated
     */
    private Long id;

    /**
     * 消息key
     *
     * @mbg.generated
     */
    private String messageKey;

    /**
     * 生产者组
     *
     * @mbg.generated
     */
    private String producerGroup;

    /**
     * 消息类型
     *
     * @mbg.generated
     */
    private String messageType;

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
     * 系统日期
     *
     * @mbg.generated
     */
    private Date sysDate;

    /**
     * 发送时间
     *
     * @mbg.generated
     */
    private Date sendTime;

    /**
     * 延时级别
     *
     * @mbg.generated
     */
    private Integer delayLevel;

    /**
     * 定时时间
     *
     * @mbg.generated
     */
    private Date timing;

    /**
     * 发送状态
     *
     * @mbg.generated
     */
    private String sendResult;

    /**
     * 描述
     *
     * @mbg.generated
     */
    private String resultDesc;

    /**
     * 消息内容
     *
     * @mbg.generated
     */
    private String context;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMessageKey() {
        return messageKey;
    }

    public void setMessageKey(String messageKey) {
        this.messageKey = messageKey;
    }

    public String getProducerGroup() {
        return producerGroup;
    }

    public void setProducerGroup(String producerGroup) {
        this.producerGroup = producerGroup;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
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

    public Date getSysDate() {
        return sysDate;
    }

    public void setSysDate(Date sysDate) {
        this.sysDate = sysDate;
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Integer getDelayLevel() {
        return delayLevel;
    }

    public void setDelayLevel(Integer delayLevel) {
        this.delayLevel = delayLevel;
    }

    public Date getTiming() {
        return timing;
    }

    public void setTiming(Date timing) {
        this.timing = timing;
    }

    public String getSendResult() {
        return sendResult;
    }

    public void setSendResult(String sendResult) {
        this.sendResult = sendResult;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
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
        sb.append(", id=").append(id);
        sb.append(", messageKey=").append(messageKey);
        sb.append(", producerGroup=").append(producerGroup);
        sb.append(", messageType=").append(messageType);
        sb.append(", topic=").append(topic);
        sb.append(", tags=").append(tags);
        sb.append(", sysDate=").append(sysDate);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", delayLevel=").append(delayLevel);
        sb.append(", timing=").append(timing);
        sb.append(", sendResult=").append(sendResult);
        sb.append(", resultDesc=").append(resultDesc);
        sb.append(", context=").append(context);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}