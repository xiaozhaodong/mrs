package com.newland.mrs.impl.service.impl;

import com.newland.mrs.impl.service.MrsRuleResultService;
import com.newland.mrs.impl.service.dao.MrsRuleResultDao;
import com.newland.mrs.persist.model.MrsRuleResult;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * MrsRuleResultServiceImpl
 * 规则匹配结果数据持久层Impl
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-31 11:48
 **/
@Service
public class MrsRuleResultServiceImpl implements MrsRuleResultService {

    @Resource
    private MrsRuleResultDao mrsRuleResultDao;

    @Override
    public void insertRuleResult(MrsRuleResult mrsRuleResult) {
        mrsRuleResultDao.insertSelective(mrsRuleResult);
    }

    @Override
    public void updateRuleResult(MrsRuleResult mrsRuleResult) {
        mrsRuleResultDao.updateByPrimaryKeySelective(mrsRuleResult);
    }

    @Override
    public List<MrsRuleResult> selectRuleResultByRouteNo(String routeNo, String ruleGroup) {
        return mrsRuleResultDao.selectRuleResultByRouteNo(routeNo, ruleGroup);
    }
}
