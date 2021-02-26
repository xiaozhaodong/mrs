package com.newland.mrs.impl.service.impl;

import com.newland.mrs.impl.service.MrsMessageProduceService;
import com.newland.mrs.persist.mapper.MrsMessageProduceMapper;
import com.newland.mrs.persist.model.MrsMessageProduce;
import com.newland.mrs.persist.model.MrsMessageProduceExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * MrsMessageProduceServiceImpl
 * 消息发送记录数据层操作接口Impl
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-31 14:23
 **/
@Service
public class MrsMessageProduceServiceImpl implements MrsMessageProduceService {

    @Resource
    private MrsMessageProduceMapper mrsMessageProduceMapper;

    @Override
    public void insertSelective(MrsMessageProduce messageProduce) {
        mrsMessageProduceMapper.insertSelective(messageProduce);
    }

    @Override
    public MrsMessageProduce selectMessageProduceByCondition(MrsMessageProduce condition) {
        MrsMessageProduceExample produceExample = new MrsMessageProduceExample();
        MrsMessageProduceExample.Criteria criteria = produceExample.createCriteria();
        if (StringUtils.isNotEmpty(condition.getMessageKey())) {
            criteria.andMessageKeyEqualTo(condition.getMessageKey());
        }
        if (StringUtils.isNotEmpty(condition.getMessageType())) {
            criteria.andMessageTypeEqualTo(condition.getMessageType());
        }
        if (StringUtils.isNotEmpty(condition.getTopic())) {
            criteria.andTopicEqualTo(condition.getTopic());
        }
        if (StringUtils.isNotEmpty(condition.getTags())) {
            criteria.andTagsEqualTo(condition.getTags());
        }
        List<MrsMessageProduce> produceList = mrsMessageProduceMapper.selectByExample(produceExample);
        if (produceList != null && produceList.size() == 1) {
            return produceList.get(0);
        } else {
            return null;
        }
    }
}
