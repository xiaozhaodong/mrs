package com.newland.mrs.persist.mapper;

import com.newland.mrs.persist.model.MrsRuleResult;
import com.newland.mrs.persist.model.MrsRuleResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MrsRuleResultMapper {
    long countByExample(MrsRuleResultExample example);

    int deleteByExample(MrsRuleResultExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MrsRuleResult record);

    int insertSelective(MrsRuleResult record);

    List<MrsRuleResult> selectByExample(MrsRuleResultExample example);

    MrsRuleResult selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MrsRuleResult record, @Param("example") MrsRuleResultExample example);

    int updateByExample(@Param("record") MrsRuleResult record, @Param("example") MrsRuleResultExample example);

    int updateByPrimaryKeySelective(MrsRuleResult record);

    int updateByPrimaryKey(MrsRuleResult record);
}