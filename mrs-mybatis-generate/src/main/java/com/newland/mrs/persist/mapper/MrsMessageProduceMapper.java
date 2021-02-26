package com.newland.mrs.persist.mapper;

import com.newland.mrs.persist.model.MrsMessageProduce;
import com.newland.mrs.persist.model.MrsMessageProduceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MrsMessageProduceMapper {
    long countByExample(MrsMessageProduceExample example);

    int deleteByExample(MrsMessageProduceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MrsMessageProduce record);

    int insertSelective(MrsMessageProduce record);

    List<MrsMessageProduce> selectByExampleWithBLOBs(MrsMessageProduceExample example);

    List<MrsMessageProduce> selectByExample(MrsMessageProduceExample example);

    MrsMessageProduce selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MrsMessageProduce record, @Param("example") MrsMessageProduceExample example);

    int updateByExampleWithBLOBs(@Param("record") MrsMessageProduce record, @Param("example") MrsMessageProduceExample example);

    int updateByExample(@Param("record") MrsMessageProduce record, @Param("example") MrsMessageProduceExample example);

    int updateByPrimaryKeySelective(MrsMessageProduce record);

    int updateByPrimaryKeyWithBLOBs(MrsMessageProduce record);

    int updateByPrimaryKey(MrsMessageProduce record);
}