package com.newland.mrs.persist.mapper;

import com.newland.mrs.persist.model.MrsRuleConfig;
import com.newland.mrs.persist.model.MrsRuleConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MrsRuleConfigMapper {
    long countByExample(MrsRuleConfigExample example);

    int deleteByExample(MrsRuleConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MrsRuleConfig record);

    int insertSelective(MrsRuleConfig record);

    List<MrsRuleConfig> selectByExample(MrsRuleConfigExample example);

    MrsRuleConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MrsRuleConfig record, @Param("example") MrsRuleConfigExample example);

    int updateByExample(@Param("record") MrsRuleConfig record, @Param("example") MrsRuleConfigExample example);

    int updateByPrimaryKeySelective(MrsRuleConfig record);

    int updateByPrimaryKey(MrsRuleConfig record);
}