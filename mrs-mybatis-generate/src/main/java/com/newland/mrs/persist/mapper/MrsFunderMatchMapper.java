package com.newland.mrs.persist.mapper;

import com.newland.mrs.persist.model.MrsFunderMatch;
import com.newland.mrs.persist.model.MrsFunderMatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MrsFunderMatchMapper {
    long countByExample(MrsFunderMatchExample example);

    int deleteByExample(MrsFunderMatchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MrsFunderMatch record);

    int insertSelective(MrsFunderMatch record);

    List<MrsFunderMatch> selectByExample(MrsFunderMatchExample example);

    MrsFunderMatch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MrsFunderMatch record, @Param("example") MrsFunderMatchExample example);

    int updateByExample(@Param("record") MrsFunderMatch record, @Param("example") MrsFunderMatchExample example);

    int updateByPrimaryKeySelective(MrsFunderMatch record);

    int updateByPrimaryKey(MrsFunderMatch record);
}