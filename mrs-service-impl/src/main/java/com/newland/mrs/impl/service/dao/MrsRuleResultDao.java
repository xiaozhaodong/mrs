package com.newland.mrs.impl.service.dao;

import com.newland.mrs.persist.mapper.MrsRuleResultMapper;
import com.newland.mrs.persist.model.MrsRuleResult;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * MrsRuleResultDao
 * 规则匹配结果数据持久层Dao
 * @author xiaozhaodong
 * @version 1.0.0
 * @date 2021-01-31 11:46
 **/
public interface MrsRuleResultDao extends MrsRuleResultMapper {

    /**
     * 根据路由编号查询路由结果信息
     * @param routeNo 路由申请编号
     * @param ruleGroup 规则组名
     * @return List<MrsRuleResult>
     */
    @Select("select * from mrs_rule_result where business_no=#{routeNo} and rule_group=#{ruleGroup}")
    List<MrsRuleResult> selectRuleResultByRouteNo(@Param("routeNo") String routeNo, @Param("ruleGroup") String ruleGroup);
}
