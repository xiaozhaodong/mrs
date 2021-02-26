package com.newland.mrs.persist.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MrsFunderConfigExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MrsFunderConfigExample() {
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

        public Criteria andEnableIsNull() {
            addCriterion("enable is null");
            return (Criteria) this;
        }

        public Criteria andEnableIsNotNull() {
            addCriterion("enable is not null");
            return (Criteria) this;
        }

        public Criteria andEnableEqualTo(String value) {
            addCriterion("enable =", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotEqualTo(String value) {
            addCriterion("enable <>", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThan(String value) {
            addCriterion("enable >", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableGreaterThanOrEqualTo(String value) {
            addCriterion("enable >=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThan(String value) {
            addCriterion("enable <", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLessThanOrEqualTo(String value) {
            addCriterion("enable <=", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableLike(String value) {
            addCriterion("enable like", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotLike(String value) {
            addCriterion("enable not like", value, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableIn(List<String> values) {
            addCriterion("enable in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotIn(List<String> values) {
            addCriterion("enable not in", values, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableBetween(String value1, String value2) {
            addCriterion("enable between", value1, value2, "enable");
            return (Criteria) this;
        }

        public Criteria andEnableNotBetween(String value1, String value2) {
            addCriterion("enable not between", value1, value2, "enable");
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

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(String value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(String value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(String value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(String value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(String value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(String value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLike(String value) {
            addCriterion("create_user like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotLike(String value) {
            addCriterion("create_user not like", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<String> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<String> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(String value1, String value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(String value1, String value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
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