package com.newland.mrs.persist.mapper;

import com.newland.mrs.persist.model.MrsMktFunderMatch;
import com.newland.mrs.persist.model.MrsMktFunderMatchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MrsMktFunderMatchMapper {
    long countByExample(MrsMktFunderMatchExample example);

    int deleteByExample(MrsMktFunderMatchExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MrsMktFunderMatch record);

    int insertSelective(MrsMktFunderMatch record);

    List<MrsMktFunderMatch> selectByExample(MrsMktFunderMatchExample example);

    MrsMktFunderMatch selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MrsMktFunderMatch record, @Param("example") MrsMktFunderMatchExample example);

    int updateByExample(@Param("record") MrsMktFunderMatch record, @Param("example") MrsMktFunderMatchExample example);

    int updateByPrimaryKeySelective(MrsMktFunderMatch record);

    int updateByPrimaryKey(MrsMktFunderMatch record);
}