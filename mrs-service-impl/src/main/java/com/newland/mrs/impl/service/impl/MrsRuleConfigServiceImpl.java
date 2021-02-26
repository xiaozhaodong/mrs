package com.newland.mrs.impl.service.impl;

import com.newland.mrs.impl.service.MrsRuleConfigService;
import com.newland.mrs.impl.service.dao.MrsRuleConfigDao;
import com.newland.mrs.persist.model.MrsRuleConfig;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * MrsRuleConfigServiceImpl
 * 规则主表数据持久化接口实现
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-29 11:12
 **/
@Service
public class MrsRuleConfigServiceImpl implements MrsRuleConfigService {

    @Resource
    private MrsRuleConfigDao mrsRuleConfigDao;

    @Override
    public void insertRuleConfig(MrsRuleConfig mrsRuleConfig) {
        mrsRuleConfigDao.insertSelective(mrsRuleConfig);
    }

    @Override
    public void updateRuleConfig(MrsRuleConfig mrsRuleConfig) {
        mrsRuleConfigDao.updateByPrimaryKeySelective(mrsRuleConfig);
    }

    @Override
    public List<MrsRuleConfig> selectMrsRuleByRuleNos(List<String> ruleNos) {
        return mrsRuleConfigDao.selectMrsRuleByRuleNos(ruleNos);
    }

    @Override
    public MrsRuleConfig selectRuleConfigByRuleNo(String ruleNo) {
        return mrsRuleConfigDao.selectRuleConfigByRuleNo(ruleNo);
    }
}
