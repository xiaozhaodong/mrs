package com.newland.mrs.impl.service.impl;

import com.newland.mrs.impl.service.MrsMktFunderConfigService;
import com.newland.mrs.impl.service.dao.MrsMktFunderConfigDao;
import com.newland.mrs.persist.model.MrsMktFunderConfig;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * MrsMktFunderConfigServiceImpl
 * 市场部下资金方匹配信息数据持久层Impl
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-25 10:53
 **/
@Service
public class MrsMktFunderConfigServiceImpl implements MrsMktFunderConfigService {

    @Resource
    private MrsMktFunderConfigDao mrsMktFunderConfigDao;

    @Override
    public void insertMktFunderConfig(MrsMktFunderConfig mrsMktFunderConfig) {
        mrsMktFunderConfigDao.insertSelective(mrsMktFunderConfig);
    }

    @Override
    public void updateMktFunderConfig(MrsMktFunderConfig mrsMktFunderConfig) {
        mrsMktFunderConfigDao.updateByPrimaryKeySelective(mrsMktFunderConfig);
    }

    @Override
    public List<MrsMktFunderConfig> selectMktFunderByDivisionId(Long divisionId) {
        return mrsMktFunderConfigDao.selectMktFunderByDivisionId(divisionId);
    }
}
