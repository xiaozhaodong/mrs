package com.newland.mrs.persist.mapper;

import com.newland.mrs.persist.model.MrsRuleDetail;
import com.newland.mrs.persist.model.MrsRuleDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MrsRuleDetailMapper {
    long countByExample(MrsRuleDetailExample example);

    int deleteByExample(MrsRuleDetailExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MrsRuleDetail record);

    int insertSelective(MrsRuleDetail record);

    List<MrsRuleDetail> selectByExample(MrsRuleDetailExample example);

    MrsRuleDetail selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MrsRuleDetail record, @Param("example") MrsRuleDetailExample example);

    int updateByExample(@Param("record") MrsRuleDetail record, @Param("example") MrsRuleDetailExample example);

    int updateByPrimaryKeySelective(MrsRuleDetail record);

    int updateByPrimaryKey(MrsRuleDetail record);
}