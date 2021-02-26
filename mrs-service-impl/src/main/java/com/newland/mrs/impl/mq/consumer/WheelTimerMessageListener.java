package com.newland.mrs.impl.mq.consumer;

import com.newland.mrs.impl.config.redis.RedisCacheManager;
import com.newland.mrs.impl.mq.producer.MrsMessageProducer;
import com.newland.mrs.impl.util.DateUtils;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * WheelTimerMessageListener
 * 消息暂存队列
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020/8/14 3:26 下午
 */
@Component("wheelTimerMessageListener")
public class WheelTimerMessageListener implements MessageListenerConcurrently {

    public static final String CONSUME_GROUP = "mrs_wheel_timer_consumer";

    private static final Logger logger = LoggerFactory.getLogger(WheelTimerMessageListener.class);

    private final MrsMessageProducer mrsMessageProducer;

    private final RedisCacheManager redisCacheManager;

    public WheelTimerMessageListener(MrsMessageProducer mrsMessageProducer, RedisCacheManager redisCacheManager) {
        this.mrsMessageProducer = mrsMessageProducer;
        this.redisCacheManager = redisCacheManager;
    }

    @Override
    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
        for (MessageExt ext : list) {
            logger.info("消息主题:{},子主题:{},KEY:{},ID:{},开始处理", ext.getTopic(), ext.getTags(), ext.getKeys(), ext.getMsgId());
            boolean lock = redisCacheManager.lock("consume:" + CONSUME_GROUP + ":" + ext.getKeys(),"1", 5 * 60);
            if (!lock) {
                logger.info("消息主题:{},子主题:{},KEY:{},ID:{},消息正在处理", ext.getTopic(), ext.getTags(), ext.getKeys(), ext.getMsgId());
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
            try {
                String targetTopic = ext.getUserProperty("targetTopic");
                String startDate = ext.getUserProperty("startSendTime");
                Date startSendTime = DateUtils.stringToDate(startDate, "yyyy-MM-dd HH:mm:ss");
                mrsMessageProducer.wheelTimeProcess(targetTopic, ext.getTags(), ext.getKeys(), new String(ext.getBody()), startSendTime);
            } catch (Exception e) {
                logger.info("消息主题:{},子主题:{},KEY:{},ID:{},消费发生异常:{}", ext.getTopic(), ext.getTags(), ext.getKeys(), ext.getMsgId(), e.getMessage());
                return ConsumeConcurrentlyStatus.RECONSUME_LATER;
            } finally {
                redisCacheManager.unlock("consume:" + CONSUME_GROUP + ":" + ext.getKeys(),"1");
            }
        }
        return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
    }
}
