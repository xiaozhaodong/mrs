package com.newland.mrs.persist.mapper;

import com.newland.mrs.persist.model.MrsDivisionConfig;
import com.newland.mrs.persist.model.MrsDivisionConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MrsDivisionConfigMapper {
    long countByExample(MrsDivisionConfigExample example);

    int deleteByExample(MrsDivisionConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MrsDivisionConfig record);

    int insertSelective(MrsDivisionConfig record);

    List<MrsDivisionConfig> selectByExample(MrsDivisionConfigExample example);

    MrsDivisionConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MrsDivisionConfig record, @Param("example") MrsDivisionConfigExample example);

    int updateByExample(@Param("record") MrsDivisionConfig record, @Param("example") MrsDivisionConfigExample example);

    int updateByPrimaryKeySelective(MrsDivisionConfig record);

    int updateByPrimaryKey(MrsDivisionConfig record);
}