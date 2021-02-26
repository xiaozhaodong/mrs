package com.newland.mrs.impl.service.impl;

import com.newland.mrs.impl.service.MrsMktFunderMatchService;
import com.newland.mrs.impl.service.dao.MrsMktFunderMatchDao;
import com.newland.mrs.persist.model.MrsMktFunderMatch;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * MrsMktFunderMatchServiceImpl
 * 市场部推送资金方匹配信息数据持久层Impl
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-02-25 12:17
 **/
@Service
public class MrsMktFunderMatchServiceImpl implements MrsMktFunderMatchService {

    @Resource
    private MrsMktFunderMatchDao mrsMktFunderMatchDao;

    @Override
    public void insertMktFunderMatch(MrsMktFunderMatch mrsMktFunderMatch) {
        mrsMktFunderMatchDao.insertSelective(mrsMktFunderMatch);
    }

    @Override
    public void updateMktFunderMatch(MrsMktFunderMatch mrsMktFunderMatch) {
        mrsMktFunderMatchDao.updateByPrimaryKeySelective(mrsMktFunderMatch);
    }

    @Override
    public List<MrsMktFunderMatch> selectMktFunderMatchByRouteNo(String routeNo) {
        return mrsMktFunderMatchDao.selectMktFunderMatchByRouteNo(routeNo);
    }
}
