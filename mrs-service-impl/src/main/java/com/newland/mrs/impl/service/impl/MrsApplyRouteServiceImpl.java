package com.newland.mrs.impl.service.impl;

import com.newland.mrs.impl.service.MrsApplyRouteService;
import com.newland.mrs.impl.service.dao.MrsApplyRouteDao;
import com.newland.mrs.persist.model.MrsApplyRoute;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * MrsApplyRouteServiceImpl
 * 路由申请数据持久层Impl
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-31 10:00
 **/
@Service
public class MrsApplyRouteServiceImpl implements MrsApplyRouteService {

    @Resource
    private MrsApplyRouteDao mrsApplyRouteDao;

    @Override
    public void insertApplyRoute(MrsApplyRoute mrsApplyRoute) {
        mrsApplyRouteDao.insertSelective(mrsApplyRoute);
    }

    @Override
    public void updateApplyRoute(MrsApplyRoute mrsApplyRoute) {
        mrsApplyRouteDao.updateByPrimaryKeySelective(mrsApplyRoute);
    }

    @Override
    public MrsApplyRoute selectApplyRouteByRouteNo(String routeNo) {
        return mrsApplyRouteDao.selectApplyRouteByRouteNo(routeNo);
    }
}
