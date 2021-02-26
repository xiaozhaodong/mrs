package com.newland.mrs.persist.mapper;

import com.newland.mrs.persist.model.MrsMessageConsume;
import com.newland.mrs.persist.model.MrsMessageConsumeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MrsMessageConsumeMapper {
    long countByExample(MrsMessageConsumeExample example);

    int deleteByExample(MrsMessageConsumeExample example);

    int deleteByPrimaryKey(@Param("messageKey") String messageKey, @Param("consumeGroup") String consumeGroup);

    int insert(MrsMessageConsume record);

    int insertSelective(MrsMessageConsume record);

    List<MrsMessageConsume> selectByExampleWithBLOBs(MrsMessageConsumeExample example);

    List<MrsMessageConsume> selectByExample(MrsMessageConsumeExample example);

    MrsMessageConsume selectByPrimaryKey(@Param("messageKey") String messageKey, @Param("consumeGroup") String consumeGroup);

    int updateByExampleSelective(@Param("record") MrsMessageConsume record, @Param("example") MrsMessageConsumeExample example);

    int updateByExampleWithBLOBs(@Param("record") MrsMessageConsume record, @Param("example") MrsMessageConsumeExample example);

    int updateByExample(@Param("record") MrsMessageConsume record, @Param("example") MrsMessageConsumeExample example);

    int updateByPrimaryKeySelective(MrsMessageConsume record);

    int updateByPrimaryKeyWithBLOBs(MrsMessageConsume record);

    int updateByPrimaryKey(MrsMessageConsume record);
}