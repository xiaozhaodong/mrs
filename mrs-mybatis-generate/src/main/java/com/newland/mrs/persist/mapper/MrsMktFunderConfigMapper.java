package com.newland.mrs.persist.mapper;

import com.newland.mrs.persist.model.MrsMktFunderConfig;
import com.newland.mrs.persist.model.MrsMktFunderConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MrsMktFunderConfigMapper {
    long countByExample(MrsMktFunderConfigExample example);

    int deleteByExample(MrsMktFunderConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MrsMktFunderConfig record);

    int insertSelective(MrsMktFunderConfig record);

    List<MrsMktFunderConfig> selectByExample(MrsMktFunderConfigExample example);

    MrsMktFunderConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MrsMktFunderConfig record, @Param("example") MrsMktFunderConfigExample example);

    int updateByExample(@Param("record") MrsMktFunderConfig record, @Param("example") MrsMktFunderConfigExample example);

    int updateByPrimaryKeySelective(MrsMktFunderConfig record);

    int updateByPrimaryKey(MrsMktFunderConfig record);
}