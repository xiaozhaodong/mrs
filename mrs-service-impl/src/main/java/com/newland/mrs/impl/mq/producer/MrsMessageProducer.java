package com.newland.mrs.impl.mq.producer;

import com.newland.mrs.impl.mq.DelayLevelCalculate;
import com.newland.mrs.impl.service.MrsMessageProduceService;
import com.newland.mrs.impl.util.DateUtils;
import com.newland.mrs.persist.model.MrsMessageProduce;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.SendStatus;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.common.RemotingHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * MrsMessageProducer
 * 资金平台MQ消息生产者
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-07 11:28
 **/
@Component
public class MrsMessageProducer {

    private static final Logger logger = LoggerFactory.getLogger(MrsMessageProducer.class);

    private final DefaultMQProducer producer;

    private final MrsMessageProduceService produceService;

    public MrsMessageProducer(DefaultMQProducer producer, MrsMessageProduceService produceService) {
        this.producer = producer;
        this.produceService = produceService;
    }

    /**
     * 默认主题常规消息发送
     * @param tags 子主题
     * @param bizId 业务ID
     * @param msg 消息内容
     */
    public void producerMessage(String tags, String bizId, String msg) {
        MrsMessageProduce messageProduce = new MrsMessageProduce();
        messageProduce.setMessageKey(bizId);
        messageProduce.setProducerGroup(producer.getProducerGroup());
        messageProduce.setMessageType("normal_message");
        messageProduce.setTopic("mrs-topic");
        messageProduce.setTags(tags);
        messageProduce.setSysDate(new Date());
        messageProduce.setContext(msg);
        try {
            Message message = new Message();
            message.setTopic("mrs-topic");
            message.setTags(tags);
            message.setKeys(bizId);
            message.putUserProperty("producerGroup", producer.getProducerGroup());
            message.setBody(msg.getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult sendResult = producer.send(message);
            messageProduce.setSendTime(new Date());
            if (SendStatus.SEND_OK.equals(sendResult.getSendStatus())) {
                messageProduce.setSendResult("S");
                messageProduce.setResultDesc("MQ消息发送成功");
                logger.info("topic:{},tags:{},key:{},message:{},发送到MQ成功", "Mrs-topic", tags, message.getKeys() ,msg);
            } else {
                messageProduce.setSendResult("F");
                messageProduce.setResultDesc("MQ消息发送失败");
                logger.info("topic:{},tags:{},key:{},message:{},发送到MQ失败", "Mrs-topic", tags, message.getKeys() ,msg);
            }
        } catch (Exception e) {
            messageProduce.setSendResult("E");
            messageProduce.setResultDesc("MQ消息发送异常:" + e.getMessage());
            logger.info("topic:{},tags:{},message:{},发送到MQ异常", "Mrs-topic", tags ,msg);
            logger.error(e.getMessage(), e);
        } finally {
            produceService.insertSelective(messageProduce);
        }
    }

    /**
     * 自定义主题常规消息发送
     * @param topic 主题
     * @param tags 子主题
     * @param bizId 业务ID
     * @param msg 消息内容
     */
    public void producerMessage(String topic, String tags, String bizId, String msg) {
        MrsMessageProduce messageProduce = new MrsMessageProduce();
        messageProduce.setMessageKey(bizId);
        messageProduce.setProducerGroup(producer.getProducerGroup());
        messageProduce.setMessageType("normal_message");
        messageProduce.setTopic(topic);
        messageProduce.setTags(tags);
        messageProduce.setSysDate(new Date());
        messageProduce.setContext(msg);
        try {
            Message message = new Message();
            message.setTopic(topic);
            message.setTags(tags);
            message.setKeys(bizId);
            message.putUserProperty("producerGroup", producer.getProducerGroup());
            message.setBody(msg.getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult sendResult = producer.send(message);
            messageProduce.setSendTime(new Date());
            if (SendStatus.SEND_OK.equals(sendResult.getSendStatus())) {
                messageProduce.setSendResult("S");
                messageProduce.setResultDesc("MQ消息发送成功");
                logger.info("topic:{},tags:{},key:{},message:{},发送到MQ成功", topic, tags, message.getKeys() ,msg);
            } else {
                messageProduce.setSendResult("F");
                messageProduce.setResultDesc("MQ消息发送失败");
                logger.info("topic:{},tags:{},key:{},message:{},发送到MQ失败", topic, tags, message.getKeys() ,msg);
            }
        } catch (Exception e) {
            messageProduce.setSendResult("E");
            messageProduce.setResultDesc("MQ消息发送异常:" + e.getMessage());
            logger.info("topic:{},tags:{},message:{},发送到MQ异常", topic, tags ,msg);
            logger.error(e.getMessage(), e);
        } finally {
            produceService.insertSelective(messageProduce);
        }
    }

    /**
     * 延时消息发送
     * @param topic 主题
     * @param tags 子主题
     * @param bizId 业务id
     * @param msg 消息内容
     * @param delayLevel 延时级别
     */
    public void producerDelayMessage(String topic, String tags, String bizId, String msg, int delayLevel) {
        MrsMessageProduce messageProduce = new MrsMessageProduce();
        messageProduce.setMessageKey(bizId);
        messageProduce.setProducerGroup(producer.getProducerGroup());
        messageProduce.setMessageType("delay_message");
        messageProduce.setDelayLevel(delayLevel);
        messageProduce.setTopic(topic);
        messageProduce.setTags(tags);
        messageProduce.setSysDate(new Date());
        messageProduce.setContext(msg);
        try {
            Message message = new Message();
            message.setTopic(topic);
            message.setTags(tags);
            message.setKeys(bizId);
            message.putUserProperty("producerGroup", producer.getProducerGroup());
            message.setBody(msg.getBytes(RemotingHelper.DEFAULT_CHARSET));
            message.setDelayTimeLevel(delayLevel);
            SendResult sendResult = producer.send(message);
            messageProduce.setSendTime(new Date());
            if (SendStatus.SEND_OK.equals(sendResult.getSendStatus())) {
                messageProduce.setSendResult("S");
                messageProduce.setResultDesc("MQ消息发送成功");
                logger.info("topic:{},tags:{},key:{},message:{},DelayTimeLevel:{},发送到MQ成功", topic, tags, message.getKeys() ,msg, delayLevel);
            } else {
                messageProduce.setSendResult("F");
                messageProduce.setResultDesc("MQ消息发送失败");
                logger.info("topic:{},tags:{},key:{},message:{},DelayTimeLevel:{},发送到MQ失败", topic, tags, message.getKeys() ,msg, delayLevel);
            }
        } catch (Exception e) {
            messageProduce.setSendResult("E");
            messageProduce.setResultDesc("MQ消息发送异常:" + e.getMessage());
            logger.info("topic:{},tags:{},message:{},DelayTimeLevel:{},发送到MQ异常", topic, tags ,msg, delayLevel);
            logger.error(e.getMessage(), e);
        } finally {
            produceService.insertSelective(messageProduce);
        }
    }

    /**
     * 定时消息发送
     * @param topic 主题
     * @param tags 子主题
     * @param bizId 业务ID
     * @param msg 消息内容
     * @param startSendTime 发送时间
     */
    public void producerTimingMessage(String topic, String tags, String bizId, String msg, Date startSendTime) {
        MrsMessageProduce messageProduce = new MrsMessageProduce();
        messageProduce.setMessageKey(bizId);
        messageProduce.setProducerGroup(producer.getProducerGroup());
        messageProduce.setMessageType("timing_message");
        messageProduce.setTopic(topic);
        messageProduce.setTags(tags);
        messageProduce.setSysDate(new Date());
        messageProduce.setContext(msg);
        messageProduce.setTiming(startSendTime);
        wheelTimeProcess(topic, tags, bizId, msg, startSendTime, messageProduce);
        produceService.insertSelective(messageProduce);
    }

    /**
     * 消息轮转发送
     * @param topic 主题
     * @param tags 子主题
     * @param bizId 业务ID
     * @param msg 内容
     * @param startSendTime 发送时间
     */
    public void wheelTimeProcess(String topic, String tags, String bizId, String msg, Date startSendTime) {
        long microsecond = startSendTime.getTime() - System.currentTimeMillis();
        logger.info("指定发送时间:{},发送时间和当前时间的秒差：{}", DateUtils.dateToString(startSendTime, "yyyy-MM-dd HH:mm:ss"),
                TimeUnit.MILLISECONDS.toSeconds(microsecond));
        // 时间差值小于0，立即发送
        if (microsecond <= 0) {
            producerMessageNoPersist(topic, tags, bizId, msg);
            return;
        }
        // 2s 3s 4s
        if (microsecond < TimeUnit.SECONDS.toMillis(DelayLevelCalculate.get(1))
                && microsecond > TimeUnit.SECONDS.toMillis(DelayLevelCalculate.get(0))) {
            // 休眠对应微妙
            logger.info("休眠微秒:{}", microsecond);
            try {
                TimeUnit.MILLISECONDS.sleep(microsecond);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            producerMessageNoPersist(topic, tags, bizId, msg);
            return;
        }
        // 如果秒差在对应级别中包含
        int delayLevel = DelayLevelCalculate.calculateDefault(TimeUnit.MILLISECONDS.toSeconds(microsecond));
        logger.info("当前秒差计算到到延迟级别:{}", delayLevel);
        if (DelayLevelCalculate.hitDefaultDelayLevel(TimeUnit.MILLISECONDS.toSeconds(microsecond))) {
            // 直接取对应延迟级别大消息发送
            producerDelayMessageNoPersist(topic, tags, bizId, msg, delayLevel);
        } else {
            // 秒差数没有被包含，发送到另外队列暂存
            producerWheelTimerMessage(topic, tags, bizId, msg, startSendTime, delayLevel);
        }
    }

    private void wheelTimeProcess(String topic, String tags, String bizId, String msg, Date startSendTime, MrsMessageProduce messageProduce) {
        long microsecond = startSendTime.getTime() - System.currentTimeMillis();
        logger.info("指定发送时间:{},发送时间和当前时间的秒差：{}", DateUtils.dateToString(startSendTime, "yyyy-MM-dd HH:mm:ss"),
                TimeUnit.MILLISECONDS.toSeconds(microsecond));
        // 时间差值小于0，立即发送
        if (microsecond <= 0) {
            producerMessageNoPersist(topic, tags, bizId, msg, messageProduce);
            return;
        }
        // 2s 3s 4s
        if (microsecond < TimeUnit.SECONDS.toMillis(DelayLevelCalculate.get(1))
                && microsecond > TimeUnit.SECONDS.toMillis(DelayLevelCalculate.get(0))) {
            // 休眠对应微妙
            logger.info("休眠微秒:{}", microsecond);
            try {
                TimeUnit.MILLISECONDS.sleep(microsecond);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            producerMessageNoPersist(topic, tags, bizId, msg, messageProduce);
            return;
        }
        // 如果秒差在对应级别中包含
        int delayLevel = DelayLevelCalculate.calculateDefault(TimeUnit.MILLISECONDS.toSeconds(microsecond));
        logger.info("当前秒差计算到到延迟级别:{}", delayLevel);
        if (DelayLevelCalculate.hitDefaultDelayLevel(TimeUnit.MILLISECONDS.toSeconds(microsecond))) {
            // 直接取对应延迟级别大消息发送
            producerDelayMessageNoPersist(topic, tags, bizId, msg, delayLevel, messageProduce);
        } else {
            // 秒差数没有被包含，发送到另外队列暂存
            producerWheelTimerMessage(topic, tags, bizId, msg, startSendTime, delayLevel, messageProduce);
        }
    }

    private void producerMessageNoPersist(String topic, String tags, String bizId, String msg, MrsMessageProduce messageProduce) {
        try {
            Message message = new Message();
            message.setTopic(topic);
            message.setKeys(bizId);
            message.setTags(tags);
            message.putUserProperty("producerGroup", producer.getProducerGroup());
            message.setBody(msg.getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult sendResult = producer.send(message);
            messageProduce.setSendTime(new Date());
            if (SendStatus.SEND_OK.equals(sendResult.getSendStatus())) {
                logger.info("topic:{},tags:{},key:{},message:{},发送到MQ成功", topic, tags, message.getKeys() , msg);
                messageProduce.setSendResult("S");
                messageProduce.setResultDesc("MQ消息发送成功");
            } else {
                logger.info("topic:{},tags:{},key:{},message:{},发送到MQ失败", topic, tags, message.getKeys() , msg);
                messageProduce.setSendResult("F");
                messageProduce.setResultDesc("MQ消息发送失败");
            }
        } catch (Exception e) {
            messageProduce.setSendResult("E");
            messageProduce.setResultDesc("MQ消息发送异常:" + e.getMessage());
            logger.info("topic:{},tags:{},message:{},发送到MQ异常", topic, tags ,msg);
            logger.error(e.getMessage(), e);
        }
    }

    private void producerMessageNoPersist(String topic, String tags, String bizId, String msg) {
        try {
            Message message = new Message();
            message.setKeys(bizId);
            message.setTopic(topic);
            message.setTags(tags);
            message.putUserProperty("producerGroup", producer.getProducerGroup());
            message.setBody(msg.getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult sendResult = producer.send(message);
            if (SendStatus.SEND_OK.equals(sendResult.getSendStatus())) {
                logger.info("topic:{},tags:{},key:{},message:{},发送到MQ成功", topic, tags, message.getKeys() , msg);
            } else {
                logger.info("topic:{},tags:{},key:{},message:{},发送到MQ失败", topic, tags, message.getKeys() , msg);
            }
        } catch (Exception e) {
            logger.info("topic:{},tags:{},message:{},发送到MQ异常", topic, tags ,msg);
            logger.error(e.getMessage(), e);
        }
    }

    private void producerDelayMessageNoPersist(String topic, String tags, String bizId, String msg, int delayLevel, MrsMessageProduce messageProduce) {
        try {
            Message message = new Message();
            message.setTopic(topic);
            message.setTags(tags);
            message.setKeys(bizId);
            message.setDelayTimeLevel(delayLevel);
            message.putUserProperty("producerGroup", producer.getProducerGroup());
            message.setBody(msg.getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult sendResult = producer.send(message);
            messageProduce.setSendTime(new Date());
            if (SendStatus.SEND_OK.equals(sendResult.getSendStatus())) {
                logger.info("topic:{},tags:{},key:{},message:{},DelayTimeLevel:{},发送到MQ成功", topic, tags, message.getKeys() ,msg, delayLevel);
                messageProduce.setSendResult("S");
                messageProduce.setResultDesc("MQ消息发送成功");
            } else {
                messageProduce.setSendResult("F");
                messageProduce.setResultDesc("MQ消息发送失败");
                logger.info("topic:{},tags:{},key:{},message:{},DelayTimeLevel:{},发送到MQ失败", topic, tags, message.getKeys() ,msg, delayLevel);
            }
        } catch (Exception e) {
            messageProduce.setSendResult("E");
            messageProduce.setResultDesc("MQ消息发送异常:" + e.getMessage());
            logger.info("topic:{},tags:{},message:{},DelayTimeLevel:{},发送到MQ异常", topic, tags ,msg, delayLevel);
            logger.error(e.getMessage(), e);
        }
    }

    private void producerDelayMessageNoPersist(String topic, String tags, String bizId, String msg, int delayLevel) {
        try {
            Message message = new Message();
            message.setTopic(topic);
            message.setKeys(bizId);
            message.setTags(tags);
            message.setDelayTimeLevel(delayLevel);
            message.putUserProperty("producerGroup", producer.getProducerGroup());
            message.setBody(msg.getBytes(RemotingHelper.DEFAULT_CHARSET));
            SendResult sendResult = producer.send(message);
            if (SendStatus.SEND_OK.equals(sendResult.getSendStatus())) {
                logger.info("topic:{},tags:{},key:{},message:{},DelayTimeLevel:{},发送到MQ成功", topic, tags, message.getKeys() ,msg, delayLevel);
            } else {
                logger.info("topic:{},tags:{},key:{},message:{},DelayTimeLevel:{},发送到MQ失败", topic, tags, message.getKeys() ,msg, delayLevel);
            }
        } catch (Exception e) {
            logger.info("topic:{},tags:{},message:{},DelayTimeLevel:{},发送到MQ异常", topic, tags ,msg, delayLevel);
            logger.error(e.getMessage(), e);
        }
    }

    private void producerWheelTimerMessage(String topic, String tags, String bizId, String msg, Date startSendTime, int delayLevel, MrsMessageProduce messageProduce) {
        String sendTime = DateUtils.dateToString(startSendTime, "yyyy-MM-dd HH:mm:ss");
        try {
            Message message = new Message();
            message.setTopic("mrs_wheel_timer");
            message.setTags(tags);
            message.setKeys(bizId);
            message.putUserProperty("targetTopic", topic);
            message.putUserProperty("startSendTime", sendTime);
            message.setBody(msg.getBytes(RemotingHelper.DEFAULT_CHARSET));
            message.setDelayTimeLevel(delayLevel);
            SendResult sendResult = producer.send(message);
            messageProduce.setSendTime(new Date());
            if (SendStatus.SEND_OK.equals(sendResult.getSendStatus())) {
                messageProduce.setSendResult("S");
                messageProduce.setResultDesc("MQ消息发送成功");
                logger.info("topic:{},tags:{},key:{},targetTopic:{},message:{},startSendTime:{},发送到MQ成功", "Mrs_wheel_timer", tags, message.getKeys(), topic, msg, sendTime);
            } else {
                logger.info("topic:{},tags:{},key:{},targetTopic:{},message:{},startSendTime:{},发送到MQ失败", "Mrs_wheel_timer", tags, message.getKeys(), topic, msg, sendTime);
                messageProduce.setSendResult("F");
                messageProduce.setResultDesc("MQ消息发送失败");
            }
        } catch (Exception e) {
            messageProduce.setSendResult("E");
            messageProduce.setResultDesc("MQ消息发送异常:" + e.getMessage());
            logger.info("topic:{},tags:{},key:{},targetTopic:{},startSendTime:{},发送到MQ异常", "Mrs_wheel_timer", tags, bizId, topic, sendTime);
            logger.error(e.getMessage(), e);
        }
    }

    private void producerWheelTimerMessage(String topic, String tags, String bizId, String msg, Date startSendTime, int delayLevel) {
        String sendTime = DateUtils.dateToString(startSendTime, "yyyy-MM-dd HH:mm:ss");
        try {
            Message message = new Message();
            message.setKeys(bizId);
            message.setTopic("mrs_wheel_timer");
            message.setTags(tags);
            message.putUserProperty("targetTopic", topic);
            message.putUserProperty("startSendTime", sendTime);
            message.setBody(msg.getBytes(RemotingHelper.DEFAULT_CHARSET));
            message.setDelayTimeLevel(delayLevel);
            SendResult sendResult = producer.send(message);
            if (SendStatus.SEND_OK.equals(sendResult.getSendStatus())) {
                logger.info("topic:{},tags:{},key:{},targetTopic:{},message:{},startSendTime:{},发送到MQ成功", "Mrs_wheel_timer", tags, message.getKeys(), topic, msg, sendTime);
            } else {
                logger.info("topic:{},tags:{},key:{},targetTopic:{},message:{},startSendTime:{},发送到MQ失败", "Mrs_wheel_timer", tags, message.getKeys(), topic, msg, sendTime);
            }
        } catch (Exception e) {
            logger.info("topic:{},tags:{},key:{},targetTopic:{},startSendTime:{},发送到MQ异常", "Mrs_wheel_timer", tags, bizId, topic, sendTime);
            logger.error(e.getMessage(), e);
        }
    }
}
