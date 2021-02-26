package com.newland.mrs.impl.mq.consumer;

import com.newland.mrs.impl.config.redis.RedisCacheManager;
import com.newland.mrs.impl.service.MrsMessageConsumeService;
import com.newland.mrs.persist.model.MrsMessageConsume;
import com.newland.mrs.persist.model.MrsRuleResult;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyContext;
import org.apache.rocketmq.client.consumer.listener.ConsumeConcurrentlyStatus;
import org.apache.rocketmq.client.consumer.listener.MessageListenerConcurrently;
import org.apache.rocketmq.common.message.MessageExt;
import org.kie.api.definition.rule.Rule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

/**
 * AbstractMrsMessageListener
 * 消息消费抽象
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-08 10:53
 **/
public abstract class AbstractMrsMessageListener implements MessageListenerConcurrently {


    private static final Logger logger = LoggerFactory.getLogger(AbstractMrsMessageListener.class);

    @Autowired
    private MrsMessageConsumeService mrsMessageConsumeService;

    @Autowired
    private RedisCacheManager redisCacheManager;

    /**
     * 获取消费者组名
     * @return String
     */
    public abstract String getConsumeGroupName();

    /**
     * 是否允许重复消费
     * @return boolean
     */
    public abstract boolean allowRepeat();

    @Override
    public ConsumeConcurrentlyStatus consumeMessage(List<MessageExt> list, ConsumeConcurrentlyContext consumeConcurrentlyContext) {
        for (MessageExt ext : list) {
            logger.info("消息消费开始,topic:{},tags:{},KEY:{},ID:{}", ext.getTopic(), ext.getTags(),
                    ext.getKeys(), ext.getMsgId());
            String key =  getConsumeGroupName() + ":lock:" + ext.getKeys();
            boolean lock = redisCacheManager.lock(key, "1", 5 * 60);
            if (!lock) {
                logger.info("消息业务ID:{},消费者组:{},存在正在处理的消息", ext.getKeys(), getConsumeGroupName());
                return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
            }
            MrsMessageConsume messageConsume = mrsMessageConsumeService.selectByPrimaryKey(ext.getKeys(), getConsumeGroupName());
            if (messageConsume != null) {
                if (("0").equals(messageConsume.getAllowRepeat())) {
                    logger.info("消息业务ID:{},消费者组:{},该消息不允许重复消费,直接丢弃不处理", ext.getKeys(), getConsumeGroupName());
                    return ConsumeConcurrentlyStatus.CONSUME_SUCCESS;
                }
                messageConsume.setContext(new String(ext.getBody()));
                messageConsume.setRepeatCount(messageConsume.getRepeatCount() + 1);
            } else {
                messageConsume = createMessageConsume(ext);
            }
            try {
                BusinessResult result = businessProcess(ext);
                messageConsume.setBusinessStatus(result.getStatus());
                messageConsume.setBusinessDesc(result.getDesc());
                return result.getConsumeConcurrentlyStatus();
            } finally {
                mrsMessageConsumeService.updateMessageConsume(messageConsume);
                redisCacheManager.unlock(key, "1");
            }
        }
        return null;
    }

    /**
     * 业务处理
     * @param ext 消息
     * @return 业务处理结果
     */
    public abstract BusinessResult businessProcess(MessageExt ext);


    private MrsMessageConsume createMessageConsume(MessageExt ext) {
        MrsMessageConsume messageConsume = new MrsMessageConsume();
        messageConsume.setMessageKey(ext.getKeys());
        messageConsume.setConsumeGroup(getConsumeGroupName());
        messageConsume.setProducerGroup(ext.getUserProperty("producerGroup"));
        messageConsume.setTopic(ext.getTopic());
        messageConsume.setTags(ext.getTags());
        messageConsume.setMessageId(ext.getMsgId());
        messageConsume.setSysDate(new Date());
        messageConsume.setConsumeTime(new Date());
        messageConsume.setAllowRepeat(allowRepeat() ? "1" : "0");
        messageConsume.setRepeatCount(0);
        messageConsume.setContext(new String(ext.getBody()));
        mrsMessageConsumeService.insertMessageConsume(messageConsume);
        return messageConsume;
    }


    protected List<MrsRuleResult> getMatchRules(List<Rule> hitRules, List<MrsRuleResult> ruleResults) {
        List<MrsRuleResult> matchList = new ArrayList<>();
        for (Rule hitRule : hitRules) {
            Long ruleId = Long.valueOf(hitRule.getName());
            List<MrsRuleResult> results = ruleResults.stream().filter(m -> ruleId.compareTo(m.getRuleId()) == 0).collect(Collectors.toList());
            if (results.size() > 0) {
                matchList.addAll(results);
            }
        }
        return matchList;
    }
}
