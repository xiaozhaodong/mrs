package com.newland.mrs.impl.config.mq;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * RocketMQProperties
 * rocketMQ相关配置
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-04 15:48
 **/
@Configuration
@ConfigurationProperties(prefix = "mrs.rocket")
public class RocketMqProperties {

    private String producerGroup;

    private String nameAddress;

    private boolean vipChannelEnabled = false;

    private String instanceName;

    private int retryTimesWhenSendFailed;

    public String getProducerGroup() {
        return producerGroup;
    }

    public void setProducerGroup(String producerGroup) {
        this.producerGroup = producerGroup;
    }

    public String getNameAddress() {
        return nameAddress;
    }

    public void setNameAddress(String nameAddress) {
        this.nameAddress = nameAddress;
    }

    public boolean isVipChannelEnabled() {
        return vipChannelEnabled;
    }

    public void setVipChannelEnabled(boolean vipChannelEnabled) {
        this.vipChannelEnabled = vipChannelEnabled;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    public int getRetryTimesWhenSendFailed() {
        return retryTimesWhenSendFailed;
    }

    public void setRetryTimesWhenSendFailed(int retryTimesWhenSendFailed) {
        this.retryTimesWhenSendFailed = retryTimesWhenSendFailed;
    }
}
