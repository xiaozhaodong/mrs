package com.newland.mrs.impl.service.impl;

import com.newland.mrs.impl.service.MrsFunderConfigService;
import com.newland.mrs.impl.service.dao.MrsFunderConfigDao;
import com.newland.mrs.persist.model.MrsFunderConfig;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * MrsFunderConfigServiceImpl
 * 规则配置数据持久层接口实现
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-27 18:12
 **/
@Service
public class MrsFunderConfigServiceImpl implements MrsFunderConfigService {

    @Resource
    private MrsFunderConfigDao mrsFunderConfigDao;

    @Override
    public void insertFunderConfig(MrsFunderConfig mrsFunderConfig) {
        mrsFunderConfigDao.insertSelective(mrsFunderConfig);
    }

    @Override
    public void updateFunderConfig(MrsFunderConfig mrsFunderConfig) {
        mrsFunderConfigDao.updateByPrimaryKeySelective(mrsFunderConfig);
    }

    @Override
    public List<MrsFunderConfig> selectFunderConfigEnable(String ruleNo) {
        return mrsFunderConfigDao.selectFunderConfigEnable(ruleNo);
    }
}
