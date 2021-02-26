package com.newland.mrs.persist.model;

import java.util.ArrayList;
import java.util.List;

public class MrsRuleDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MrsRuleDetailExample() {
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

        public Criteria andConfigIdIsNull() {
            addCriterion("config_id is null");
            return (Criteria) this;
        }

        public Criteria andConfigIdIsNotNull() {
            addCriterion("config_id is not null");
            return (Criteria) this;
        }

        public Criteria andConfigIdEqualTo(Long value) {
            addCriterion("config_id =", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotEqualTo(Long value) {
            addCriterion("config_id <>", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThan(Long value) {
            addCriterion("config_id >", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("config_id >=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThan(Long value) {
            addCriterion("config_id <", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdLessThanOrEqualTo(Long value) {
            addCriterion("config_id <=", value, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdIn(List<Long> values) {
            addCriterion("config_id in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotIn(List<Long> values) {
            addCriterion("config_id not in", values, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdBetween(Long value1, Long value2) {
            addCriterion("config_id between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andConfigIdNotBetween(Long value1, Long value2) {
            addCriterion("config_id not between", value1, value2, "configId");
            return (Criteria) this;
        }

        public Criteria andRuleGroupIsNull() {
            addCriterion("rule_group is null");
            return (Criteria) this;
        }

        public Criteria andRuleGroupIsNotNull() {
            addCriterion("rule_group is not null");
            return (Criteria) this;
        }

        public Criteria andRuleGroupEqualTo(String value) {
            addCriterion("rule_group =", value, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupNotEqualTo(String value) {
            addCriterion("rule_group <>", value, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupGreaterThan(String value) {
            addCriterion("rule_group >", value, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupGreaterThanOrEqualTo(String value) {
            addCriterion("rule_group >=", value, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupLessThan(String value) {
            addCriterion("rule_group <", value, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupLessThanOrEqualTo(String value) {
            addCriterion("rule_group <=", value, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupLike(String value) {
            addCriterion("rule_group like", value, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupNotLike(String value) {
            addCriterion("rule_group not like", value, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupIn(List<String> values) {
            addCriterion("rule_group in", values, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupNotIn(List<String> values) {
            addCriterion("rule_group not in", values, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupBetween(String value1, String value2) {
            addCriterion("rule_group between", value1, value2, "ruleGroup");
            return (Criteria) this;
        }

        public Criteria andRuleGroupNotBetween(String value1, String value2) {
            addCriterion("rule_group not between", value1, value2, "ruleGroup");
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

        public Criteria andRuleCodeIsNull() {
            addCriterion("rule_code is null");
            return (Criteria) this;
        }

        public Criteria andRuleCodeIsNotNull() {
            addCriterion("rule_code is not null");
            return (Criteria) this;
        }

        public Criteria andRuleCodeEqualTo(String value) {
            addCriterion("rule_code =", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeNotEqualTo(String value) {
            addCriterion("rule_code <>", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeGreaterThan(String value) {
            addCriterion("rule_code >", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeGreaterThanOrEqualTo(String value) {
            addCriterion("rule_code >=", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeLessThan(String value) {
            addCriterion("rule_code <", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeLessThanOrEqualTo(String value) {
            addCriterion("rule_code <=", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeLike(String value) {
            addCriterion("rule_code like", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeNotLike(String value) {
            addCriterion("rule_code not like", value, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeIn(List<String> values) {
            addCriterion("rule_code in", values, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeNotIn(List<String> values) {
            addCriterion("rule_code not in", values, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeBetween(String value1, String value2) {
            addCriterion("rule_code between", value1, value2, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleCodeNotBetween(String value1, String value2) {
            addCriterion("rule_code not between", value1, value2, "ruleCode");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNull() {
            addCriterion("rule_name is null");
            return (Criteria) this;
        }

        public Criteria andRuleNameIsNotNull() {
            addCriterion("rule_name is not null");
            return (Criteria) this;
        }

        public Criteria andRuleNameEqualTo(String value) {
            addCriterion("rule_name =", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotEqualTo(String value) {
            addCriterion("rule_name <>", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThan(String value) {
            addCriterion("rule_name >", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameGreaterThanOrEqualTo(String value) {
            addCriterion("rule_name >=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThan(String value) {
            addCriterion("rule_name <", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLessThanOrEqualTo(String value) {
            addCriterion("rule_name <=", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameLike(String value) {
            addCriterion("rule_name like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotLike(String value) {
            addCriterion("rule_name not like", value, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameIn(List<String> values) {
            addCriterion("rule_name in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotIn(List<String> values) {
            addCriterion("rule_name not in", values, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameBetween(String value1, String value2) {
            addCriterion("rule_name between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleNameNotBetween(String value1, String value2) {
            addCriterion("rule_name not between", value1, value2, "ruleName");
            return (Criteria) this;
        }

        public Criteria andRuleContextIsNull() {
            addCriterion("rule_context is null");
            return (Criteria) this;
        }

        public Criteria andRuleContextIsNotNull() {
            addCriterion("rule_context is not null");
            return (Criteria) this;
        }

        public Criteria andRuleContextEqualTo(String value) {
            addCriterion("rule_context =", value, "ruleContext");
            return (Criteria) this;
        }

        public Criteria andRuleContextNotEqualTo(String value) {
            addCriterion("rule_context <>", value, "ruleContext");
            return (Criteria) this;
        }

        public Criteria andRuleContextGreaterThan(String value) {
            addCriterion("rule_context >", value, "ruleContext");
            return (Criteria) this;
        }

        public Criteria andRuleContextGreaterThanOrEqualTo(String value) {
            addCriterion("rule_context >=", value, "ruleContext");
            return (Criteria) this;
        }

        public Criteria andRuleContextLessThan(String value) {
            addCriterion("rule_context <", value, "ruleContext");
            return (Criteria) this;
        }

        public Criteria andRuleContextLessThanOrEqualTo(String value) {
            addCriterion("rule_context <=", value, "ruleContext");
            return (Criteria) this;
        }

        public Criteria andRuleContextLike(String value) {
            addCriterion("rule_context like", value, "ruleContext");
            return (Criteria) this;
        }

        public Criteria andRuleContextNotLike(String value) {
            addCriterion("rule_context not like", value, "ruleContext");
            return (Criteria) this;
        }

        public Criteria andRuleContextIn(List<String> values) {
            addCriterion("rule_context in", values, "ruleContext");
            return (Criteria) this;
        }

        public Criteria andRuleContextNotIn(List<String> values) {
            addCriterion("rule_context not in", values, "ruleContext");
            return (Criteria) this;
        }

        public Criteria andRuleContextBetween(String value1, String value2) {
            addCriterion("rule_context between", value1, value2, "ruleContext");
            return (Criteria) this;
        }

        public Criteria andRuleContextNotBetween(String value1, String value2) {
            addCriterion("rule_context not between", value1, value2, "ruleContext");
            return (Criteria) this;
        }

        public Criteria andRuleDescIsNull() {
            addCriterion("rule_desc is null");
            return (Criteria) this;
        }

        public Criteria andRuleDescIsNotNull() {
            addCriterion("rule_desc is not null");
            return (Criteria) this;
        }

        public Criteria andRuleDescEqualTo(String value) {
            addCriterion("rule_desc =", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescNotEqualTo(String value) {
            addCriterion("rule_desc <>", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescGreaterThan(String value) {
            addCriterion("rule_desc >", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescGreaterThanOrEqualTo(String value) {
            addCriterion("rule_desc >=", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescLessThan(String value) {
            addCriterion("rule_desc <", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescLessThanOrEqualTo(String value) {
            addCriterion("rule_desc <=", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescLike(String value) {
            addCriterion("rule_desc like", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescNotLike(String value) {
            addCriterion("rule_desc not like", value, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescIn(List<String> values) {
            addCriterion("rule_desc in", values, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescNotIn(List<String> values) {
            addCriterion("rule_desc not in", values, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescBetween(String value1, String value2) {
            addCriterion("rule_desc between", value1, value2, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andRuleDescNotBetween(String value1, String value2) {
            addCriterion("rule_desc not between", value1, value2, "ruleDesc");
            return (Criteria) this;
        }

        public Criteria andOutDataSignIsNull() {
            addCriterion("out_data_sign is null");
            return (Criteria) this;
        }

        public Criteria andOutDataSignIsNotNull() {
            addCriterion("out_data_sign is not null");
            return (Criteria) this;
        }

        public Criteria andOutDataSignEqualTo(String value) {
            addCriterion("out_data_sign =", value, "outDataSign");
            return (Criteria) this;
        }

        public Criteria andOutDataSignNotEqualTo(String value) {
            addCriterion("out_data_sign <>", value, "outDataSign");
            return (Criteria) this;
        }

        public Criteria andOutDataSignGreaterThan(String value) {
            addCriterion("out_data_sign >", value, "outDataSign");
            return (Criteria) this;
        }

        public Criteria andOutDataSignGreaterThanOrEqualTo(String value) {
            addCriterion("out_data_sign >=", value, "outDataSign");
            return (Criteria) this;
        }

        public Criteria andOutDataSignLessThan(String value) {
            addCriterion("out_data_sign <", value, "outDataSign");
            return (Criteria) this;
        }

        public Criteria andOutDataSignLessThanOrEqualTo(String value) {
            addCriterion("out_data_sign <=", value, "outDataSign");
            return (Criteria) this;
        }

        public Criteria andOutDataSignLike(String value) {
            addCriterion("out_data_sign like", value, "outDataSign");
            return (Criteria) this;
        }

        public Criteria andOutDataSignNotLike(String value) {
            addCriterion("out_data_sign not like", value, "outDataSign");
            return (Criteria) this;
        }

        public Criteria andOutDataSignIn(List<String> values) {
            addCriterion("out_data_sign in", values, "outDataSign");
            return (Criteria) this;
        }

        public Criteria andOutDataSignNotIn(List<String> values) {
            addCriterion("out_data_sign not in", values, "outDataSign");
            return (Criteria) this;
        }

        public Criteria andOutDataSignBetween(String value1, String value2) {
            addCriterion("out_data_sign between", value1, value2, "outDataSign");
            return (Criteria) this;
        }

        public Criteria andOutDataSignNotBetween(String value1, String value2) {
            addCriterion("out_data_sign not between", value1, value2, "outDataSign");
            return (Criteria) this;
        }

        public Criteria andOutBeanNameIsNull() {
            addCriterion("out_bean_name is null");
            return (Criteria) this;
        }

        public Criteria andOutBeanNameIsNotNull() {
            addCriterion("out_bean_name is not null");
            return (Criteria) this;
        }

        public Criteria andOutBeanNameEqualTo(String value) {
            addCriterion("out_bean_name =", value, "outBeanName");
            return (Criteria) this;
        }

        public Criteria andOutBeanNameNotEqualTo(String value) {
            addCriterion("out_bean_name <>", value, "outBeanName");
            return (Criteria) this;
        }

        public Criteria andOutBeanNameGreaterThan(String value) {
            addCriterion("out_bean_name >", value, "outBeanName");
            return (Criteria) this;
        }

        public Criteria andOutBeanNameGreaterThanOrEqualTo(String value) {
            addCriterion("out_bean_name >=", value, "outBeanName");
            return (Criteria) this;
        }

        public Criteria andOutBeanNameLessThan(String value) {
            addCriterion("out_bean_name <", value, "outBeanName");
            return (Criteria) this;
        }

        public Criteria andOutBeanNameLessThanOrEqualTo(String value) {
            addCriterion("out_bean_name <=", value, "outBeanName");
            return (Criteria) this;
        }

        public Criteria andOutBeanNameLike(String value) {
            addCriterion("out_bean_name like", value, "outBeanName");
            return (Criteria) this;
        }

        public Criteria andOutBeanNameNotLike(String value) {
            addCriterion("out_bean_name not like", value, "outBeanName");
            return (Criteria) this;
        }

        public Criteria andOutBeanNameIn(List<String> values) {
            addCriterion("out_bean_name in", values, "outBeanName");
            return (Criteria) this;
        }

        public Criteria andOutBeanNameNotIn(List<String> values) {
            addCriterion("out_bean_name not in", values, "outBeanName");
            return (Criteria) this;
        }

        public Criteria andOutBeanNameBetween(String value1, String value2) {
            addCriterion("out_bean_name between", value1, value2, "outBeanName");
            return (Criteria) this;
        }

        public Criteria andOutBeanNameNotBetween(String value1, String value2) {
            addCriterion("out_bean_name not between", value1, value2, "outBeanName");
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