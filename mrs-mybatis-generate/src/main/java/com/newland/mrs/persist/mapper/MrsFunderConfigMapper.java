package com.newland.mrs.persist.mapper;

import com.newland.mrs.persist.model.MrsFunderConfig;
import com.newland.mrs.persist.model.MrsFunderConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MrsFunderConfigMapper {
    long countByExample(MrsFunderConfigExample example);

    int deleteByExample(MrsFunderConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MrsFunderConfig record);

    int insertSelective(MrsFunderConfig record);

    List<MrsFunderConfig> selectByExample(MrsFunderConfigExample example);

    MrsFunderConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MrsFunderConfig record, @Param("example") MrsFunderConfigExample example);

    int updateByExample(@Param("record") MrsFunderConfig record, @Param("example") MrsFunderConfigExample example);

    int updateByPrimaryKeySelective(MrsFunderConfig record);

    int updateByPrimaryKey(MrsFunderConfig record);
}