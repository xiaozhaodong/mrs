package com.newland.mrs.impl.service.impl;

import com.newland.mrs.impl.service.MrsFunderMatchService;
import com.newland.mrs.impl.service.dao.MrsFunderMatchDao;
import com.newland.mrs.persist.model.MrsFunderMatch;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * MrsFunderMatchServiceImpl
 * 资金方匹配信息数据持久层Impl
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-01 16:02
 **/
@Service
public class MrsFunderMatchServiceImpl implements MrsFunderMatchService {

    @Resource
    private MrsFunderMatchDao mrsFunderMatchDao;

    @Override
    public void insertFunderMatch(MrsFunderMatch mrsFunderMatch) {
        mrsFunderMatchDao.insertSelective(mrsFunderMatch);
    }

    @Override
    public void updateFunderMatch(MrsFunderMatch mrsFunderMatch) {
        mrsFunderMatchDao.updateByPrimaryKeySelective(mrsFunderMatch);
    }

    @Override
    public List<MrsFunderMatch> selectFunderMatchByRoute(String routeNo) {
        return mrsFunderMatchDao.selectFunderMatchByRoute(routeNo);
    }
}
