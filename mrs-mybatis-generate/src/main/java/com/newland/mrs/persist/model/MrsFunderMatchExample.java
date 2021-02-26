package com.newland.mrs.persist.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MrsFunderMatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MrsFunderMatchExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andRouteNoIsNull() {
            addCriterion("route_no is null");
            return (Criteria) this;
        }

        public Criteria andRouteNoIsNotNull() {
            addCriterion("route_no is not null");
            return (Criteria) this;
        }

        public Criteria andRouteNoEqualTo(String value) {
            addCriterion("route_no =", value, "routeNo");
            return (Criteria) this;
        }

        public Criteria andRouteNoNotEqualTo(String value) {
            addCriterion("route_no <>", value, "routeNo");
            return (Criteria) this;
        }

        public Criteria andRouteNoGreaterThan(String value) {
            addCriterion("route_no >", value, "routeNo");
            return (Criteria) this;
        }

        public Criteria andRouteNoGreaterThanOrEqualTo(String value) {
            addCriterion("route_no >=", value, "routeNo");
            return (Criteria) this;
        }

        public Criteria andRouteNoLessThan(String value) {
            addCriterion("route_no <", value, "routeNo");
            return (Criteria) this;
        }

        public Criteria andRouteNoLessThanOrEqualTo(String value) {
            addCriterion("route_no <=", value, "routeNo");
            return (Criteria) this;
        }

        public Criteria andRouteNoLike(String value) {
            addCriterion("route_no like", value, "routeNo");
            return (Criteria) this;
        }

        public Criteria andRouteNoNotLike(String value) {
            addCriterion("route_no not like", value, "routeNo");
            return (Criteria) this;
        }

        public Criteria andRouteNoIn(List<String> values) {
            addCriterion("route_no in", values, "routeNo");
            return (Criteria) this;
        }

        public Criteria andRouteNoNotIn(List<String> values) {
            addCriterion("route_no not in", values, "routeNo");
            return (Criteria) this;
        }

        public Criteria andRouteNoBetween(String value1, String value2) {
            addCriterion("route_no between", value1, value2, "routeNo");
            return (Criteria) this;
        }

        public Criteria andRouteNoNotBetween(String value1, String value2) {
            addCriterion("route_no not between", value1, value2, "routeNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoIsNull() {
            addCriterion("rule_no is null");
            return (Criteria) this;
        }

        public Criteria andRuleNoIsNotNull() {
            addCriterion("rule_no is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNoEqualTo(String value) {
            addCriterion("rule_no =", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoNotEqualTo(String value) {
            addCriterion("rule_no <>", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoGreaterThan(String value) {
            addCriterion("rule_no >", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoGreaterThanOrEqualTo(String value) {
            addCriterion("rule_no >=", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoLessThan(String value) {
            addCriterion("rule_no <", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoLessThanOrEqualTo(String value) {
            addCriterion("rule_no <=", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoLike(String value) {
            addCriterion("rule_no like", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoNotLike(String value) {
            addCriterion("rule_no not like", value, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoIn(List<String> values) {
            addCriterion("rule_no in", values, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoNotIn(List<String> values) {
            addCriterion("rule_no not in", values, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoBetween(String value1, String value2) {
            addCriterion("rule_no between", value1, value2, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andRuleNoNotBetween(String value1, String value2) {
            addCriterion("rule_no not between", value1, value2, "ruleNo");
            return (Criteria) this;
        }

        public Criteria andFunderConfigIdIsNull() {
            addCriterion("funder_config_id is null");
            return (Criteria) this;
        }

        public Criteria andFunderConfigIdIsNotNull() {
            addCriterion("funder_config_id is not null");
            return (Criteria) this;
        }

        public Criteria andFunderConfigIdEqualTo(Long value) {
            addCriterion("funder_config_id =", value, "funderConfigId");
            return (Criteria) this;
        }

        public Criteria andFunderConfigIdNotEqualTo(Long value) {
            addCriterion("funder_config_id <>", value, "funderConfigId");
            return (Criteria) this;
        }

        public Criteria andFunderConfigIdGreaterThan(Long value) {
            addCriterion("funder_config_id >", value, "funderConfigId");
            return (Criteria) this;
        }

        public Criteria andFunderConfigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("funder_config_id >=", value, "funderConfigId");
            return (Criteria) this;
        }

        public Criteria andFunderConfigIdLessThan(Long value) {
            addCriterion("funder_config_id <", value, "funderConfigId");
            return (Criteria) this;
        }

        public Criteria andFunderConfigIdLessThanOrEqualTo(Long value) {
            addCriterion("funder_config_id <=", value, "funderConfigId");
            return (Criteria) this;
        }

        public Criteria andFunderConfigIdIn(List<Long> values) {
            addCriterion("funder_config_id in", values, "funderConfigId");
            return (Criteria) this;
        }

        public Criteria andFunderConfigIdNotIn(List<Long> values) {
            addCriterion("funder_config_id not in", values, "funderConfigId");
            return (Criteria) this;
        }

        public Criteria andFunderConfigIdBetween(Long value1, Long value2) {
            addCriterion("funder_config_id between", value1, value2, "funderConfigId");
            return (Criteria) this;
        }

        public Criteria andFunderConfigIdNotBetween(Long value1, Long value2) {
            addCriterion("funder_config_id not between", value1, value2, "funderConfigId");
            return (Criteria) this;
        }

        public Criteria andFunderCodeIsNull() {
            addCriterion("funder_code is null");
            return (Criteria) this;
        }

        public Criteria andFunderCodeIsNotNull() {
            addCriterion("funder_code is not null");
            return (Criteria) this;
        }

        public Criteria andFunderCodeEqualTo(String value) {
            addCriterion("funder_code =", value, "funderCode");
            return (Criteria) this;
        }

        public Criteria andFunderCodeNotEqualTo(String value) {
            addCriterion("funder_code <>", value, "funderCode");
            return (Criteria) this;
        }

        public Criteria andFunderCodeGreaterThan(String value) {
            addCriterion("funder_code >", value, "funderCode");
            return (Criteria) this;
        }

        public Criteria andFunderCodeGreaterThanOrEqualTo(String value) {
            addCriterion("funder_code >=", value, "funderCode");
            return (Criteria) this;
        }

        public Criteria andFunderCodeLessThan(String value) {
            addCriterion("funder_code <", value, "funderCode");
            return (Criteria) this;
        }

        public Criteria andFunderCodeLessThanOrEqualTo(String value) {
            addCriterion("funder_code <=", value, "funderCode");
            return (Criteria) this;
        }

        public Criteria andFunderCodeLike(String value) {
            addCriterion("funder_code like", value, "funderCode");
            return (Criteria) this;
        }

        public Criteria andFunderCodeNotLike(String value) {
            addCriterion("funder_code not like", value, "funderCode");
            return (Criteria) this;
        }

        public Criteria andFunderCodeIn(List<String> values) {
            addCriterion("funder_code in", values, "funderCode");
            return (Criteria) this;
        }

        public Criteria andFunderCodeNotIn(List<String> values) {
            addCriterion("funder_code not in", values, "funderCode");
            return (Criteria) this;
        }

        public Criteria andFunderCodeBetween(String value1, String value2) {
            addCriterion("funder_code between", value1, value2, "funderCode");
            return (Criteria) this;
        }

        public Criteria andFunderCodeNotBetween(String value1, String value2) {
            addCriterion("funder_code not between", value1, value2, "funderCode");
            return (Criteria) this;
        }

        public Criteria andFunderNameIsNull() {
            addCriterion("funder_name is null");
            return (Criteria) this;
        }

        public Criteria andFunderNameIsNotNull() {
            addCriterion("funder_name is not null");
            return (Criteria) this;
        }

        public Criteria andFunderNameEqualTo(String value) {
            addCriterion("funder_name =", value, "funderName");
            return (Criteria) this;
        }

        public Criteria andFunderNameNotEqualTo(String value) {
            addCriterion("funder_name <>", value, "funderName");
            return (Criteria) this;
        }

        public Criteria andFunderNameGreaterThan(String value) {
            addCriterion("funder_name >", value, "funderName");
            return (Criteria) this;
        }

        public Criteria andFunderNameGreaterThanOrEqualTo(String value) {
            addCriterion("funder_name >=", value, "funderName");
            return (Criteria) this;
        }

        public Criteria andFunderNameLessThan(String value) {
            addCriterion("funder_name <", value, "funderName");
            return (Criteria) this;
        }

        public Criteria andFunderNameLessThanOrEqualTo(String value) {
            addCriterion("funder_name <=", value, "funderName");
            return (Criteria) this;
        }

        public Criteria andFunderNameLike(String value) {
            addCriterion("funder_name like", value, "funderName");
            return (Criteria) this;
        }

        public Criteria andFunderNameNotLike(String value) {
            addCriterion("funder_name not like", value, "funderName");
            return (Criteria) this;
        }

        public Criteria andFunderNameIn(List<String> values) {
            addCriterion("funder_name in", values, "funderName");
            return (Criteria) this;
        }

        public Criteria andFunderNameNotIn(List<String> values) {
            addCriterion("funder_name not in", values, "funderName");
            return (Criteria) this;
        }

        public Criteria andFunderNameBetween(String value1, String value2) {
            addCriterion("funder_name between", value1, value2, "funderName");
            return (Criteria) this;
        }

        public Criteria andFunderNameNotBetween(String value1, String value2) {
            addCriterion("funder_name not between", value1, value2, "funderName");
            return (Criteria) this;
        }

        public Criteria andPreserveStartTimeIsNull() {
            addCriterion("preserve_start_time is null");
            return (Criteria) this;
        }

        public Criteria andPreserveStartTimeIsNotNull() {
            addCriterion("preserve_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andPreserveStartTimeEqualTo(Date value) {
            addCriterion("preserve_start_time =", value, "preserveStartTime");
            return (Criteria) this;
        }

        public Criteria andPreserveStartTimeNotEqualTo(Date value) {
            addCriterion("preserve_start_time <>", value, "preserveStartTime");
            return (Criteria) this;
        }

        public Criteria andPreserveStartTimeGreaterThan(Date value) {
            addCriterion("preserve_start_time >", value, "preserveStartTime");
            return (Criteria) this;
        }

        public Criteria andPreserveStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("preserve_start_time >=", value, "preserveStartTime");
            return (Criteria) this;
        }

        public Criteria andPreserveStartTimeLessThan(Date value) {
            addCriterion("preserve_start_time <", value, "preserveStartTime");
            return (Criteria) this;
        }

        public Criteria andPreserveStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("preserve_start_time <=", value, "preserveStartTime");
            return (Criteria) this;
        }

        public Criteria andPreserveStartTimeIn(List<Date> values) {
            addCriterion("preserve_start_time in", values, "preserveStartTime");
            return (Criteria) this;
        }

        public Criteria andPreserveStartTimeNotIn(List<Date> values) {
            addCriterion("preserve_start_time not in", values, "preserveStartTime");
            return (Criteria) this;
        }

        public Criteria andPreserveStartTimeBetween(Date value1, Date value2) {
            addCriterion("preserve_start_time between", value1, value2, "preserveStartTime");
            return (Criteria) this;
        }

        public Criteria andPreserveStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("preserve_start_time not between", value1, value2, "preserveStartTime");
            return (Criteria) this;
        }

        public Criteria andPreserveEndTimeIsNull() {
            addCriterion("preserve_end_time is null");
            return (Criteria) this;
        }

        public Criteria andPreserveEndTimeIsNotNull() {
            addCriterion("preserve_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andPreserveEndTimeEqualTo(Date value) {
            addCriterion("preserve_end_time =", value, "preserveEndTime");
            return (Criteria) this;
        }

        public Criteria andPreserveEndTimeNotEqualTo(Date value) {
            addCriterion("preserve_end_time <>", value, "preserveEndTime");
            return (Criteria) this;
        }

        public Criteria andPreserveEndTimeGreaterThan(Date value) {
            addCriterion("preserve_end_time >", value, "preserveEndTime");
            return (Criteria) this;
        }

        public Criteria andPreserveEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("preserve_end_time >=", value, "preserveEndTime");
            return (Criteria) this;
        }

        public Criteria andPreserveEndTimeLessThan(Date value) {
            addCriterion("preserve_end_time <", value, "preserveEndTime");
            return (Criteria) this;
        }

        public Criteria andPreserveEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("preserve_end_time <=", value, "preserveEndTime");
            return (Criteria) this;
        }

        public Criteria andPreserveEndTimeIn(List<Date> values) {
            addCriterion("preserve_end_time in", values, "preserveEndTime");
            return (Criteria) this;
        }

        public Criteria andPreserveEndTimeNotIn(List<Date> values) {
            addCriterion("preserve_end_time not in", values, "preserveEndTime");
            return (Criteria) this;
        }

        public Criteria andPreserveEndTimeBetween(Date value1, Date value2) {
            addCriterion("preserve_end_time between", value1, value2, "preserveEndTime");
            return (Criteria) this;
        }

        public Criteria andPreserveEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("preserve_end_time not between", value1, value2, "preserveEndTime");
            return (Criteria) this;
        }

        public Criteria andLoanStartTimeIsNull() {
            addCriterion("loan_start_time is null");
            return (Criteria) this;
        }

        public Criteria andLoanStartTimeIsNotNull() {
            addCriterion("loan_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoanStartTimeEqualTo(Date value) {
            addCriterion("loan_start_time =", value, "loanStartTime");
            return (Criteria) this;
        }

        public Criteria andLoanStartTimeNotEqualTo(Date value) {
            addCriterion("loan_start_time <>", value, "loanStartTime");
            return (Criteria) this;
        }

        public Criteria andLoanStartTimeGreaterThan(Date value) {
            addCriterion("loan_start_time >", value, "loanStartTime");
            return (Criteria) this;
        }

        public Criteria andLoanStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loan_start_time >=", value, "loanStartTime");
            return (Criteria) this;
        }

        public Criteria andLoanStartTimeLessThan(Date value) {
            addCriterion("loan_start_time <", value, "loanStartTime");
            return (Criteria) this;
        }

        public Criteria andLoanStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("loan_start_time <=", value, "loanStartTime");
            return (Criteria) this;
        }

        public Criteria andLoanStartTimeIn(List<Date> values) {
            addCriterion("loan_start_time in", values, "loanStartTime");
            return (Criteria) this;
        }

        public Criteria andLoanStartTimeNotIn(List<Date> values) {
            addCriterion("loan_start_time not in", values, "loanStartTime");
            return (Criteria) this;
        }

        public Criteria andLoanStartTimeBetween(Date value1, Date value2) {
            addCriterion("loan_start_time between", value1, value2, "loanStartTime");
            return (Criteria) this;
        }

        public Criteria andLoanStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("loan_start_time not between", value1, value2, "loanStartTime");
            return (Criteria) this;
        }

        public Criteria andLoanEndTimeIsNull() {
            addCriterion("loan_end_time is null");
            return (Criteria) this;
        }

        public Criteria andLoanEndTimeIsNotNull() {
            addCriterion("loan_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andLoanEndTimeEqualTo(Date value) {
            addCriterion("loan_end_time =", value, "loanEndTime");
            return (Criteria) this;
        }

        public Criteria andLoanEndTimeNotEqualTo(Date value) {
            addCriterion("loan_end_time <>", value, "loanEndTime");
            return (Criteria) this;
        }

        public Criteria andLoanEndTimeGreaterThan(Date value) {
            addCriterion("loan_end_time >", value, "loanEndTime");
            return (Criteria) this;
        }

        public Criteria andLoanEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("loan_end_time >=", value, "loanEndTime");
            return (Criteria) this;
        }

        public Criteria andLoanEndTimeLessThan(Date value) {
            addCriterion("loan_end_time <", value, "loanEndTime");
            return (Criteria) this;
        }

        public Criteria andLoanEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("loan_end_time <=", value, "loanEndTime");
            return (Criteria) this;
        }

        public Criteria andLoanEndTimeIn(List<Date> values) {
            addCriterion("loan_end_time in", values, "loanEndTime");
            return (Criteria) this;
        }

        public Criteria andLoanEndTimeNotIn(List<Date> values) {
            addCriterion("loan_end_time not in", values, "loanEndTime");
            return (Criteria) this;
        }

        public Criteria andLoanEndTimeBetween(Date value1, Date value2) {
            addCriterion("loan_end_time between", value1, value2, "loanEndTime");
            return (Criteria) this;
        }

        public Criteria andLoanEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("loan_end_time not between", value1, value2, "loanEndTime");
            return (Criteria) this;
        }

        public Criteria andBatchStartTimeIsNull() {
            addCriterion("batch_start_time is null");
            return (Criteria) this;
        }

        public Criteria andBatchStartTimeIsNotNull() {
            addCriterion("batch_start_time is not null");
            return (Criteria) this;
        }

        public Criteria andBatchStartTimeEqualTo(Date value) {
            addCriterion("batch_start_time =", value, "batchStartTime");
            return (Criteria) this;
        }

        public Criteria andBatchStartTimeNotEqualTo(Date value) {
            addCriterion("batch_start_time <>", value, "batchStartTime");
            return (Criteria) this;
        }

        public Criteria andBatchStartTimeGreaterThan(Date value) {
            addCriterion("batch_start_time >", value, "batchStartTime");
            return (Criteria) this;
        }

        public Criteria andBatchStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("batch_start_time >=", value, "batchStartTime");
            return (Criteria) this;
        }

        public Criteria andBatchStartTimeLessThan(Date value) {
            addCriterion("batch_start_time <", value, "batchStartTime");
            return (Criteria) this;
        }

        public Criteria andBatchStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("batch_start_time <=", value, "batchStartTime");
            return (Criteria) this;
        }

        public Criteria andBatchStartTimeIn(List<Date> values) {
            addCriterion("batch_start_time in", values, "batchStartTime");
            return (Criteria) this;
        }

        public Criteria andBatchStartTimeNotIn(List<Date> values) {
            addCriterion("batch_start_time not in", values, "batchStartTime");
            return (Criteria) this;
        }

        public Criteria andBatchStartTimeBetween(Date value1, Date value2) {
            addCriterion("batch_start_time between", value1, value2, "batchStartTime");
            return (Criteria) this;
        }

        public Criteria andBatchStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("batch_start_time not between", value1, value2, "batchStartTime");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("priority is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("priority is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Integer value) {
            addCriterion("priority =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Integer value) {
            addCriterion("priority <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Integer value) {
            addCriterion("priority >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("priority >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Integer value) {
            addCriterion("priority <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("priority <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Integer> values) {
            addCriterion("priority in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Integer> values) {
            addCriterion("priority not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Integer value1, Integer value2) {
            addCriterion("priority between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("priority not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andMatchStatusIsNull() {
            addCriterion("match_status is null");
            return (Criteria) this;
        }

        public Criteria andMatchStatusIsNotNull() {
            addCriterion("match_status is not null");
            return (Criteria) this;
        }

        public Criteria andMatchStatusEqualTo(String value) {
            addCriterion("match_status =", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusNotEqualTo(String value) {
            addCriterion("match_status <>", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusGreaterThan(String value) {
            addCriterion("match_status >", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusGreaterThanOrEqualTo(String value) {
            addCriterion("match_status >=", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusLessThan(String value) {
            addCriterion("match_status <", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusLessThanOrEqualTo(String value) {
            addCriterion("match_status <=", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusLike(String value) {
            addCriterion("match_status like", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusNotLike(String value) {
            addCriterion("match_status not like", value, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusIn(List<String> values) {
            addCriterion("match_status in", values, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusNotIn(List<String> values) {
            addCriterion("match_status not in", values, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusBetween(String value1, String value2) {
            addCriterion("match_status between", value1, value2, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andMatchStatusNotBetween(String value1, String value2) {
            addCriterion("match_status not between", value1, value2, "matchStatus");
            return (Criteria) this;
        }

        public Criteria andHitSignIsNull() {
            addCriterion("hit_sign is null");
            return (Criteria) this;
        }

        public Criteria andHitSignIsNotNull() {
            addCriterion("hit_sign is not null");
            return (Criteria) this;
        }

        public Criteria andHitSignEqualTo(String value) {
            addCriterion("hit_sign =", value, "hitSign");
            return (Criteria) this;
        }

        public Criteria andHitSignNotEqualTo(String value) {
            addCriterion("hit_sign <>", value, "hitSign");
            return (Criteria) this;
        }

        public Criteria andHitSignGreaterThan(String value) {
            addCriterion("hit_sign >", value, "hitSign");
            return (Criteria) this;
        }

        public Criteria andHitSignGreaterThanOrEqualTo(String value) {
            addCriterion("hit_sign >=", value, "hitSign");
            return (Criteria) this;
        }

        public Criteria andHitSignLessThan(String value) {
            addCriterion("hit_sign <", value, "hitSign");
            return (Criteria) this;
        }

        public Criteria andHitSignLessThanOrEqualTo(String value) {
            addCriterion("hit_sign <=", value, "hitSign");
            return (Criteria) this;
        }

        public Criteria andHitSignLike(String value) {
            addCriterion("hit_sign like", value, "hitSign");
            return (Criteria) this;
        }

        public Criteria andHitSignNotLike(String value) {
            addCriterion("hit_sign not like", value, "hitSign");
            return (Criteria) this;
        }

        public Criteria andHitSignIn(List<String> values) {
            addCriterion("hit_sign in", values, "hitSign");
            return (Criteria) this;
        }

        public Criteria andHitSignNotIn(List<String> values) {
            addCriterion("hit_sign not in", values, "hitSign");
            return (Criteria) this;
        }

        public Criteria andHitSignBetween(String value1, String value2) {
            addCriterion("hit_sign between", value1, value2, "hitSign");
            return (Criteria) this;
        }

        public Criteria andHitSignNotBetween(String value1, String value2) {
            addCriterion("hit_sign not between", value1, value2, "hitSign");
            return (Criteria) this;
        }

        public Criteria andRiskResultIsNull() {
            addCriterion("risk_result is null");
            return (Criteria) this;
        }

        public Criteria andRiskResultIsNotNull() {
            addCriterion("risk_result is not null");
            return (Criteria) this;
        }

        public Criteria andRiskResultEqualTo(String value) {
            addCriterion("risk_result =", value, "riskResult");
            return (Criteria) this;
        }

        public Criteria andRiskResultNotEqualTo(String value) {
            addCriterion("risk_result <>", value, "riskResult");
            return (Criteria) this;
        }

        public Criteria andRiskResultGreaterThan(String value) {
            addCriterion("risk_result >", value, "riskResult");
            return (Criteria) this;
        }

        public Criteria andRiskResultGreaterThanOrEqualTo(String value) {
            addCriterion("risk_result >=", value, "riskResult");
            return (Criteria) this;
        }

        public Criteria andRiskResultLessThan(String value) {
            addCriterion("risk_result <", value, "riskResult");
            return (Criteria) this;
        }

        public Criteria andRiskResultLessThanOrEqualTo(String value) {
            addCriterion("risk_result <=", value, "riskResult");
            return (Criteria) this;
        }

        public Criteria andRiskResultLike(String value) {
            addCriterion("risk_result like", value, "riskResult");
            return (Criteria) this;
        }

        public Criteria andRiskResultNotLike(String value) {
            addCriterion("risk_result not like", value, "riskResult");
            return (Criteria) this;
        }

        public Criteria andRiskResultIn(List<String> values) {
            addCriterion("risk_result in", values, "riskResult");
            return (Criteria) this;
        }

        public Criteria andRiskResultNotIn(List<String> values) {
            addCriterion("risk_result not in", values, "riskResult");
            return (Criteria) this;
        }

        public Criteria andRiskResultBetween(String value1, String value2) {
            addCriterion("risk_result between", value1, value2, "riskResult");
            return (Criteria) this;
        }

        public Criteria andRiskResultNotBetween(String value1, String value2) {
            addCriterion("risk_result not between", value1, value2, "riskResult");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}