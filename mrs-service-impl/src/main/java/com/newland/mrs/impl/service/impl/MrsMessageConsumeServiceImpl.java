package com.newland.mrs.impl.service.impl;

import com.newland.mrs.impl.service.MrsMessageConsumeService;
import com.newland.mrs.persist.mapper.MrsMessageConsumeMapper;
import com.newland.mrs.persist.model.MrsMessageConsume;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * MrsMessageConsumeServiceImpl
 * 消息消费信息数据持久层操作接口实现
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2020-12-08 15:01
 **/
@Service
public class MrsMessageConsumeServiceImpl implements MrsMessageConsumeService {

    @Resource
    private MrsMessageConsumeMapper mrsMessageConsumeMapper;

    @Override
    public MrsMessageConsume selectByPrimaryKey(String messageKey, String consumeGroup) {
        return mrsMessageConsumeMapper.selectByPrimaryKey(messageKey, consumeGroup);
    }

    @Override
    public void insertMessageConsume(MrsMessageConsume messageConsume) {
        mrsMessageConsumeMapper.insertSelective(messageConsume);
    }

    @Override
    public void updateMessageConsume(MrsMessageConsume messageConsume) {
        mrsMessageConsumeMapper.updateByPrimaryKeySelective(messageConsume);
    }
}
