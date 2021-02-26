package com.newland.mrs.impl.mq.consumer;

import com.newland.mrs.impl.config.mq.RocketMqProperties;
import com.newland.mrs.impl.mq.consumer.listener.DivisionRuleMatchMessageListener;
import com.newland.mrs.impl.mq.consumer.listener.RouteRuleMatchMessageListener;
import org.apache.rocketmq.client.consumer.DefaultMQPushConsumer;
import org.apache.rocketmq.common.consumer.ConsumeFromWhere;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * MrsMessageConsumer
 * 消费者配置
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-01 10:15
 **/
@Configuration
public class MrsMessageConsumer {

    private final RocketMqProperties properties;

    private final WheelTimerMessageListener wheelTimerMessageListener;

    private final RouteRuleMatchMessageListener routeRuleMatchMessageListener;

    private final DivisionRuleMatchMessageListener divisionRuleMatchMessageListener;

    public MrsMessageConsumer(RocketMqProperties properties, WheelTimerMessageListener wheelTimerMessageListener, RouteRuleMatchMessageListener routeRuleMatchMessageListener, DivisionRuleMatchMessageListener divisionRuleMatchMessageListener) {
        this.properties = properties;
        this.wheelTimerMessageListener = wheelTimerMessageListener;
        this.routeRuleMatchMessageListener = routeRuleMatchMessageListener;
        this.divisionRuleMatchMessageListener = divisionRuleMatchMessageListener;
    }

    /**
     * 定发发送消息暂存队列消息消费
     * @return DefaultMQPushConsumer
     */
    @Bean(initMethod = "start", destroyMethod = "shutdown")
    public DefaultMQPushConsumer wheelTimerConsumer() {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer();
        consumer.setNamesrvAddr(properties.getNameAddress());
        consumer.setConsumerGroup(WheelTimerMessageListener.CONSUME_GROUP);
        consumer.setConsumeFromWhere(ConsumeFromWhere.valueOf("CONSUME_FROM_FIRST_OFFSET"));
        consumer.setMessageListener(wheelTimerMessageListener);
        Map<String, String> subscriptionMap = new HashMap<>(2);
        subscriptionMap.put("mrs_wheel_timer", "*");
        consumer.setSubscription(subscriptionMap);
        return consumer;
    }

    /**
     * 路由匹配规则消息消费
     * @return DefaultMQPushConsumer
     */
    @Bean(initMethod = "start", destroyMethod = "shutdown")
    public DefaultMQPushConsumer routeRuleMatchConsumer() {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer();
        consumer.setNamesrvAddr(properties.getNameAddress());
        consumer.setConsumerGroup(RouteRuleMatchMessageListener.CONSUME_GROUP);
        consumer.setConsumeFromWhere(ConsumeFromWhere.valueOf("CONSUME_FROM_FIRST_OFFSET"));
        consumer.setMessageListener(routeRuleMatchMessageListener);
        Map<String, String> subscriptionMap = new HashMap<>(2);
        subscriptionMap.put("mrs-topic", "route_rule_match");
        consumer.setSubscription(subscriptionMap);
        return consumer;
    }

    /**
     * 市场部推送规则消息消费
     * @return DefaultMQPushConsumer
     */
    @Bean(initMethod = "start", destroyMethod = "shutdown")
    public DefaultMQPushConsumer divisionRuleMatchConsumer() {
        DefaultMQPushConsumer consumer = new DefaultMQPushConsumer();
        consumer.setNamesrvAddr(properties.getNameAddress());
        consumer.setConsumerGroup(DivisionRuleMatchMessageListener.CONSUME_GROUP);
        consumer.setConsumeFromWhere(ConsumeFromWhere.valueOf("CONSUME_FROM_FIRST_OFFSET"));
        consumer.setMessageListener(divisionRuleMatchMessageListener);
        Map<String, String> subscriptionMap = new HashMap<>(2);
        subscriptionMap.put("mrs-topic", "division_rule_match");
        consumer.setSubscription(subscriptionMap);
        return consumer;
    }
}
