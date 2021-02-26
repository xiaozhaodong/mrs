package com.newland.mrs.impl.mq.producer;

import com.newland.mrs.impl.config.mq.RocketMqProperties;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * MrsProducerConfig
 * RocketMQ默认生产者配置
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-04 15:33
 **/
@Configuration
public class MrsProducerConfig {

    private final RocketMqProperties properties;

    public MrsProducerConfig(RocketMqProperties properties) {
        this.properties = properties;
    }

    @Bean(initMethod = "start", destroyMethod = "shutdown")
    public DefaultMQProducer getProducer() {
        DefaultMQProducer producer = new DefaultMQProducer();
        producer.setProducerGroup(properties.getProducerGroup());
        producer.setNamesrvAddr(properties.getNameAddress());
        producer.setVipChannelEnabled(properties.isVipChannelEnabled());
        producer.setInstanceName(properties.getInstanceName());
        producer.setRetryTimesWhenSendFailed(properties.getRetryTimesWhenSendFailed());
        return producer;
    }
}
