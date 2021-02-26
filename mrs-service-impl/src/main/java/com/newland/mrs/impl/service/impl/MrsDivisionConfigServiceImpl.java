package com.newland.mrs.impl.service.impl;

import com.newland.mrs.impl.service.MrsDivisionConfigService;
import com.newland.mrs.impl.service.dao.MrsDivisionConfigDao;
import com.newland.mrs.persist.model.MrsDivisionConfig;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * MrsDivisionConfigServiceImpl
 * 事业部团队配置数据持久层Impl
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-23 10:57
 **/
@Service
public class MrsDivisionConfigServiceImpl implements MrsDivisionConfigService {

    @Resource
    private MrsDivisionConfigDao mrsDivisionConfigDao;

    @Override
    public void insertDivisionConfig(MrsDivisionConfig mrsDivisionConfig) {
        mrsDivisionConfigDao.insertSelective(mrsDivisionConfig);
    }

    @Override
    public void updateDivisionConfig(MrsDivisionConfig mrsDivisionConfig) {
        mrsDivisionConfigDao.updateByPrimaryKeySelective(mrsDivisionConfig);
    }

    @Override
    public List<MrsDivisionConfig> selectDivisionConfigByRuleNo(String ruleNo) {
        return mrsDivisionConfigDao.selectDivisionConfigByRuleNo(ruleNo);
    }

    @Override
    public MrsDivisionConfig selectDivisionByTeamCode(String ruleNo, String divisionCode, String teamCode) {
        return mrsDivisionConfigDao.selectDivisionByTeamCode(ruleNo, divisionCode, teamCode);
    }
}
