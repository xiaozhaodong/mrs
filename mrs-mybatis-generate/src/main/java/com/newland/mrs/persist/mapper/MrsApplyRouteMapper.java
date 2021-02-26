package com.newland.mrs.persist.mapper;

import com.newland.mrs.persist.model.MrsApplyRoute;
import com.newland.mrs.persist.model.MrsApplyRouteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MrsApplyRouteMapper {
    long countByExample(MrsApplyRouteExample example);

    int deleteByExample(MrsApplyRouteExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MrsApplyRoute record);

    int insertSelective(MrsApplyRoute record);

    List<MrsApplyRoute> selectByExample(MrsApplyRouteExample example);

    MrsApplyRoute selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MrsApplyRoute record, @Param("example") MrsApplyRouteExample example);

    int updateByExample(@Param("record") MrsApplyRoute record, @Param("example") MrsApplyRouteExample example);

    int updateByPrimaryKeySelective(MrsApplyRoute record);

    int updateByPrimaryKey(MrsApplyRoute record);
}