package com.newland.mrs.impl.service.impl;

import com.newland.mrs.impl.service.MrsRuleDetailService;
import com.newland.mrs.impl.service.dao.MrsRuleDetailDao;
import com.newland.mrs.persist.model.MrsRuleDetail;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * MrsRuleDetailServiceImpl
 * 系统规则明细数据持久层impl
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-29 14:35
 **/
@Service
public class MrsRuleDetailServiceImpl implements MrsRuleDetailService {

    @Resource
    private MrsRuleDetailDao mrsRuleDetailDao;

    @Override
    public void insertRuleDetail(MrsRuleDetail mrsRuleDetail) {
        mrsRuleDetailDao.insertSelective(mrsRuleDetail);
    }

    @Override
    public void updateRuleDetail(MrsRuleDetail mrsRuleDetail) {
        mrsRuleDetailDao.updateByPrimaryKeySelective(mrsRuleDetail);
    }

    @Override
    public List<MrsRuleDetail> selectRuleDetailByConfigIds(List<Long> ids, String ruleGroup) {
        return mrsRuleDetailDao.selectRuleDetailByConfigIds(ids, ruleGroup);
    }

    @Override
    public List<MrsRuleDetail> selectRuleDetailByConfigId(Long configId, String ruleGroup) {
        return mrsRuleDetailDao.selectRuleDetailByConfigId(configId, ruleGroup);
    }
}
