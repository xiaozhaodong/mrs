package com.newland.mrs.persist.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MrsApplyRouteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MrsApplyRouteExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andApplyNoIsNull() {
            addCriterion("apply_no is null");
            return (Criteria) this;
        }

        public Criteria andApplyNoIsNotNull() {
            addCriterion("apply_no is not null");
            return (Criteria) this;
        }

        public Criteria andApplyNoEqualTo(String value) {
            addCriterion("apply_no =", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotEqualTo(String value) {
            addCriterion("apply_no <>", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThan(String value) {
            addCriterion("apply_no >", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoGreaterThanOrEqualTo(String value) {
            addCriterion("apply_no >=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThan(String value) {
            addCriterion("apply_no <", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLessThanOrEqualTo(String value) {
            addCriterion("apply_no <=", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoLike(String value) {
            addCriterion("apply_no like", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotLike(String value) {
            addCriterion("apply_no not like", value, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoIn(List<String> values) {
            addCriterion("apply_no in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotIn(List<String> values) {
            addCriterion("apply_no not in", values, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoBetween(String value1, String value2) {
            addCriterion("apply_no between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andApplyNoNotBetween(String value1, String value2) {
            addCriterion("apply_no not between", value1, value2, "applyNo");
            return (Criteria) this;
        }

        public Criteria andRouteDateIsNull() {
            addCriterion("route_date is null");
            return (Criteria) this;
        }

        public Criteria andRouteDateIsNotNull() {
            addCriterion("route_date is not null");
            return (Criteria) this;
        }

        public Criteria andRouteDateEqualTo(Date value) {
            addCriterion("route_date =", value, "routeDate");
            return (Criteria) this;
        }

        public Criteria andRouteDateNotEqualTo(Date value) {
            addCriterion("route_date <>", value, "routeDate");
            return (Criteria) this;
        }

        public Criteria andRouteDateGreaterThan(Date value) {
            addCriterion("route_date >", value, "routeDate");
            return (Criteria) this;
        }

        public Criteria andRouteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("route_date >=", value, "routeDate");
            return (Criteria) this;
        }

        public Criteria andRouteDateLessThan(Date value) {
            addCriterion("route_date <", value, "routeDate");
            return (Criteria) this;
        }

        public Criteria andRouteDateLessThanOrEqualTo(Date value) {
            addCriterion("route_date <=", value, "routeDate");
            return (Criteria) this;
        }

        public Criteria andRouteDateIn(List<Date> values) {
            addCriterion("route_date in", values, "routeDate");
            return (Criteria) this;
        }

        public Criteria andRouteDateNotIn(List<Date> values) {
            addCriterion("route_date not in", values, "routeDate");
            return (Criteria) this;
        }

        public Criteria andRouteDateBetween(Date value1, Date value2) {
            addCriterion("route_date between", value1, value2, "routeDate");
            return (Criteria) this;
        }

        public Criteria andRouteDateNotBetween(Date value1, Date value2) {
            addCriterion("route_date not between", value1, value2, "routeDate");
            return (Criteria) this;
        }

        public Criteria andCustomNameIsNull() {
            addCriterion("custom_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomNameIsNotNull() {
            addCriterion("custom_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomNameEqualTo(String value) {
            addCriterion("custom_name =", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotEqualTo(String value) {
            addCriterion("custom_name <>", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThan(String value) {
            addCriterion("custom_name >", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameGreaterThanOrEqualTo(String value) {
            addCriterion("custom_name >=", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThan(String value) {
            addCriterion("custom_name <", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLessThanOrEqualTo(String value) {
            addCriterion("custom_name <=", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameLike(String value) {
            addCriterion("custom_name like", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotLike(String value) {
            addCriterion("custom_name not like", value, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameIn(List<String> values) {
            addCriterion("custom_name in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotIn(List<String> values) {
            addCriterion("custom_name not in", values, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameBetween(String value1, String value2) {
            addCriterion("custom_name between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomNameNotBetween(String value1, String value2) {
            addCriterion("custom_name not between", value1, value2, "customName");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneIsNull() {
            addCriterion("custom_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneIsNotNull() {
            addCriterion("custom_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneEqualTo(String value) {
            addCriterion("custom_phone =", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneNotEqualTo(String value) {
            addCriterion("custom_phone <>", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneGreaterThan(String value) {
            addCriterion("custom_phone >", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("custom_phone >=", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneLessThan(String value) {
            addCriterion("custom_phone <", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneLessThanOrEqualTo(String value) {
            addCriterion("custom_phone <=", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneLike(String value) {
            addCriterion("custom_phone like", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneNotLike(String value) {
            addCriterion("custom_phone not like", value, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneIn(List<String> values) {
            addCriterion("custom_phone in", values, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneNotIn(List<String> values) {
            addCriterion("custom_phone not in", values, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneBetween(String value1, String value2) {
            addCriterion("custom_phone between", value1, value2, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomPhoneNotBetween(String value1, String value2) {
            addCriterion("custom_phone not between", value1, value2, "customPhone");
            return (Criteria) this;
        }

        public Criteria andCustomIdNoIsNull() {
            addCriterion("custom_id_no is null");
            return (Criteria) this;
        }

        public Criteria andCustomIdNoIsNotNull() {
            addCriterion("custom_id_no is not null");
            return (Criteria) this;
        }

        public Criteria andCustomIdNoEqualTo(String value) {
            addCriterion("custom_id_no =", value, "customIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomIdNoNotEqualTo(String value) {
            addCriterion("custom_id_no <>", value, "customIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomIdNoGreaterThan(String value) {
            addCriterion("custom_id_no >", value, "customIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomIdNoGreaterThanOrEqualTo(String value) {
            addCriterion("custom_id_no >=", value, "customIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomIdNoLessThan(String value) {
            addCriterion("custom_id_no <", value, "customIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomIdNoLessThanOrEqualTo(String value) {
            addCriterion("custom_id_no <=", value, "customIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomIdNoLike(String value) {
            addCriterion("custom_id_no like", value, "customIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomIdNoNotLike(String value) {
            addCriterion("custom_id_no not like", value, "customIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomIdNoIn(List<String> values) {
            addCriterion("custom_id_no in", values, "customIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomIdNoNotIn(List<String> values) {
            addCriterion("custom_id_no not in", values, "customIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomIdNoBetween(String value1, String value2) {
            addCriterion("custom_id_no between", value1, value2, "customIdNo");
            return (Criteria) this;
        }

        public Criteria andCustomIdNoNotBetween(String value1, String value2) {
            addCriterion("custom_id_no not between", value1, value2, "customIdNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNull() {
            addCriterion("bank_card_no is null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIsNotNull() {
            addCriterion("bank_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andBankCardNoEqualTo(String value) {
            addCriterion("bank_card_no =", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotEqualTo(String value) {
            addCriterion("bank_card_no <>", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThan(String value) {
            addCriterion("bank_card_no >", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("bank_card_no >=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThan(String value) {
            addCriterion("bank_card_no <", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLessThanOrEqualTo(String value) {
            addCriterion("bank_card_no <=", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoLike(String value) {
            addCriterion("bank_card_no like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotLike(String value) {
            addCriterion("bank_card_no not like", value, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoIn(List<String> values) {
            addCriterion("bank_card_no in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotIn(List<String> values) {
            addCriterion("bank_card_no not in", values, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoBetween(String value1, String value2) {
            addCriterion("bank_card_no between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andBankCardNoNotBetween(String value1, String value2) {
            addCriterion("bank_card_no not between", value1, value2, "bankCardNo");
            return (Criteria) this;
        }

        public Criteria andCustomBalanceIsNull() {
            addCriterion("custom_balance is null");
            return (Criteria) this;
        }

        public Criteria andCustomBalanceIsNotNull() {
            addCriterion("custom_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCustomBalanceEqualTo(Long value) {
            addCriterion("custom_balance =", value, "customBalance");
            return (Criteria) this;
        }

        public Criteria andCustomBalanceNotEqualTo(Long value) {
            addCriterion("custom_balance <>", value, "customBalance");
            return (Criteria) this;
        }

        public Criteria andCustomBalanceGreaterThan(Long value) {
            addCriterion("custom_balance >", value, "customBalance");
            return (Criteria) this;
        }

        public Criteria andCustomBalanceGreaterThanOrEqualTo(Long value) {
            addCriterion("custom_balance >=", value, "customBalance");
            return (Criteria) this;
        }

        public Criteria andCustomBalanceLessThan(Long value) {
            addCriterion("custom_balance <", value, "customBalance");
            return (Criteria) this;
        }

        public Criteria andCustomBalanceLessThanOrEqualTo(Long value) {
            addCriterion("custom_balance <=", value, "customBalance");
            return (Criteria) this;
        }

        public Criteria andCustomBalanceIn(List<Long> values) {
            addCriterion("custom_balance in", values, "customBalance");
            return (Criteria) this;
        }

        public Criteria andCustomBalanceNotIn(List<Long> values) {
            addCriterion("custom_balance not in", values, "customBalance");
            return (Criteria) this;
        }

        public Criteria andCustomBalanceBetween(Long value1, Long value2) {
            addCriterion("custom_balance between", value1, value2, "customBalance");
            return (Criteria) this;
        }

        public Criteria andCustomBalanceNotBetween(Long value1, Long value2) {
            addCriterion("custom_balance not between", value1, value2, "customBalance");
            return (Criteria) this;
        }

        public Criteria andCustomLimitIsNull() {
            addCriterion("custom_limit is null");
            return (Criteria) this;
        }

        public Criteria andCustomLimitIsNotNull() {
            addCriterion("custom_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCustomLimitEqualTo(Integer value) {
            addCriterion("custom_limit =", value, "customLimit");
            return (Criteria) this;
        }

        public Criteria andCustomLimitNotEqualTo(Integer value) {
            addCriterion("custom_limit <>", value, "customLimit");
            return (Criteria) this;
        }

        public Criteria andCustomLimitGreaterThan(Integer value) {
            addCriterion("custom_limit >", value, "customLimit");
            return (Criteria) this;
        }

        public Criteria andCustomLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("custom_limit >=", value, "customLimit");
            return (Criteria) this;
        }

        public Criteria andCustomLimitLessThan(Integer value) {
            addCriterion("custom_limit <", value, "customLimit");
            return (Criteria) this;
        }

        public Criteria andCustomLimitLessThanOrEqualTo(Integer value) {
            addCriterion("custom_limit <=", value, "customLimit");
            return (Criteria) this;
        }

        public Criteria andCustomLimitIn(List<Integer> values) {
            addCriterion("custom_limit in", values, "customLimit");
            return (Criteria) this;
        }

        public Criteria andCustomLimitNotIn(List<Integer> values) {
            addCriterion("custom_limit not in", values, "customLimit");
            return (Criteria) this;
        }

        public Criteria andCustomLimitBetween(Integer value1, Integer value2) {
            addCriterion("custom_limit between", value1, value2, "customLimit");
            return (Criteria) this;
        }

        public Criteria andCustomLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("custom_limit not between", value1, value2, "customLimit");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNull() {
            addCriterion("credit_amount is null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIsNotNull() {
            addCriterion("credit_amount is not null");
            return (Criteria) this;
        }

        public Criteria andCreditAmountEqualTo(Long value) {
            addCriterion("credit_amount =", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotEqualTo(Long value) {
            addCriterion("credit_amount <>", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThan(Long value) {
            addCriterion("credit_amount >", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("credit_amount >=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThan(Long value) {
            addCriterion("credit_amount <", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountLessThanOrEqualTo(Long value) {
            addCriterion("credit_amount <=", value, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountIn(List<Long> values) {
            addCriterion("credit_amount in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotIn(List<Long> values) {
            addCriterion("credit_amount not in", values, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountBetween(Long value1, Long value2) {
            addCriterion("credit_amount between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andCreditAmountNotBetween(Long value1, Long value2) {
            addCriterion("credit_amount not between", value1, value2, "creditAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountIsNull() {
            addCriterion("apply_amount is null");
            return (Criteria) this;
        }

        public Criteria andApplyAmountIsNotNull() {
            addCriterion("apply_amount is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAmountEqualTo(Long value) {
            addCriterion("apply_amount =", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotEqualTo(Long value) {
            addCriterion("apply_amount <>", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountGreaterThan(Long value) {
            addCriterion("apply_amount >", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("apply_amount >=", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountLessThan(Long value) {
            addCriterion("apply_amount <", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountLessThanOrEqualTo(Long value) {
            addCriterion("apply_amount <=", value, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountIn(List<Long> values) {
            addCriterion("apply_amount in", values, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotIn(List<Long> values) {
            addCriterion("apply_amount not in", values, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountBetween(Long value1, Long value2) {
            addCriterion("apply_amount between", value1, value2, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyAmountNotBetween(Long value1, Long value2) {
            addCriterion("apply_amount not between", value1, value2, "applyAmount");
            return (Criteria) this;
        }

        public Criteria andApplyRateIsNull() {
            addCriterion("apply_rate is null");
            return (Criteria) this;
        }

        public Criteria andApplyRateIsNotNull() {
            addCriterion("apply_rate is not null");
            return (Criteria) this;
        }

        public Criteria andApplyRateEqualTo(BigDecimal value) {
            addCriterion("apply_rate =", value, "applyRate");
            return (Criteria) this;
        }

        public Criteria andApplyRateNotEqualTo(BigDecimal value) {
            addCriterion("apply_rate <>", value, "applyRate");
            return (Criteria) this;
        }

        public Criteria andApplyRateGreaterThan(BigDecimal value) {
            addCriterion("apply_rate >", value, "applyRate");
            return (Criteria) this;
        }

        public Criteria andApplyRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("apply_rate >=", value, "applyRate");
            return (Criteria) this;
        }

        public Criteria andApplyRateLessThan(BigDecimal value) {
            addCriterion("apply_rate <", value, "applyRate");
            return (Criteria) this;
        }

        public Criteria andApplyRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("apply_rate <=", value, "applyRate");
            return (Criteria) this;
        }

        public Criteria andApplyRateIn(List<BigDecimal> values) {
            addCriterion("apply_rate in", values, "applyRate");
            return (Criteria) this;
        }

        public Criteria andApplyRateNotIn(List<BigDecimal> values) {
            addCriterion("apply_rate not in", values, "applyRate");
            return (Criteria) this;
        }

        public Criteria andApplyRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apply_rate between", value1, value2, "applyRate");
            return (Criteria) this;
        }

        public Criteria andApplyRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("apply_rate not between", value1, value2, "applyRate");
            return (Criteria) this;
        }

        public Criteria andApplyAgeIsNull() {
            addCriterion("apply_age is null");
            return (Criteria) this;
        }

        public Criteria andApplyAgeIsNotNull() {
            addCriterion("apply_age is not null");
            return (Criteria) this;
        }

        public Criteria andApplyAgeEqualTo(Integer value) {
            addCriterion("apply_age =", value, "applyAge");
            return (Criteria) this;
        }

        public Criteria andApplyAgeNotEqualTo(Integer value) {
            addCriterion("apply_age <>", value, "applyAge");
            return (Criteria) this;
        }

        public Criteria andApplyAgeGreaterThan(Integer value) {
            addCriterion("apply_age >", value, "applyAge");
            return (Criteria) this;
        }

        public Criteria andApplyAgeGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_age >=", value, "applyAge");
            return (Criteria) this;
        }

        public Criteria andApplyAgeLessThan(Integer value) {
            addCriterion("apply_age <", value, "applyAge");
            return (Criteria) this;
        }

        public Criteria andApplyAgeLessThanOrEqualTo(Integer value) {
            addCriterion("apply_age <=", value, "applyAge");
            return (Criteria) this;
        }

        public Criteria andApplyAgeIn(List<Integer> values) {
            addCriterion("apply_age in", values, "applyAge");
            return (Criteria) this;
        }

        public Criteria andApplyAgeNotIn(List<Integer> values) {
            addCriterion("apply_age not in", values, "applyAge");
            return (Criteria) this;
        }

        public Criteria andApplyAgeBetween(Integer value1, Integer value2) {
            addCriterion("apply_age between", value1, value2, "applyAge");
            return (Criteria) this;
        }

        public Criteria andApplyAgeNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_age not between", value1, value2, "applyAge");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateIsNull() {
            addCriterion("limit_start_date is null");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateIsNotNull() {
            addCriterion("limit_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("limit_start_date =", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("limit_start_date <>", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("limit_start_date >", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("limit_start_date >=", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateLessThan(Date value) {
            addCriterionForJDBCDate("limit_start_date <", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("limit_start_date <=", value, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("limit_start_date in", values, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("limit_start_date not in", values, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("limit_start_date between", value1, value2, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("limit_start_date not between", value1, value2, "limitStartDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateIsNull() {
            addCriterion("limit_end_date is null");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateIsNotNull() {
            addCriterion("limit_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("limit_end_date =", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("limit_end_date <>", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("limit_end_date >", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("limit_end_date >=", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateLessThan(Date value) {
            addCriterionForJDBCDate("limit_end_date <", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("limit_end_date <=", value, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("limit_end_date in", values, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("limit_end_date not in", values, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("limit_end_date between", value1, value2, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andLimitEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("limit_end_date not between", value1, value2, "limitEndDate");
            return (Criteria) this;
        }

        public Criteria andApplyProductTypeIsNull() {
            addCriterion("apply_product_type is null");
            return (Criteria) this;
        }

        public Criteria andApplyProductTypeIsNotNull() {
            addCriterion("apply_product_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplyProductTypeEqualTo(String value) {
            addCriterion("apply_product_type =", value, "applyProductType");
            return (Criteria) this;
        }

        public Criteria andApplyProductTypeNotEqualTo(String value) {
            addCriterion("apply_product_type <>", value, "applyProductType");
            return (Criteria) this;
        }

        public Criteria andApplyProductTypeGreaterThan(String value) {
            addCriterion("apply_product_type >", value, "applyProductType");
            return (Criteria) this;
        }

        public Criteria andApplyProductTypeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_product_type >=", value, "applyProductType");
            return (Criteria) this;
        }

        public Criteria andApplyProductTypeLessThan(String value) {
            addCriterion("apply_product_type <", value, "applyProductType");
            return (Criteria) this;
        }

        public Criteria andApplyProductTypeLessThanOrEqualTo(String value) {
            addCriterion("apply_product_type <=", value, "applyProductType");
            return (Criteria) this;
        }

        public Criteria andApplyProductTypeLike(String value) {
            addCriterion("apply_product_type like", value, "applyProductType");
            return (Criteria) this;
        }

        public Criteria andApplyProductTypeNotLike(String value) {
            addCriterion("apply_product_type not like", value, "applyProductType");
            return (Criteria) this;
        }

        public Criteria andApplyProductTypeIn(List<String> values) {
            addCriterion("apply_product_type in", values, "applyProductType");
            return (Criteria) this;
        }

        public Criteria andApplyProductTypeNotIn(List<String> values) {
            addCriterion("apply_product_type not in", values, "applyProductType");
            return (Criteria) this;
        }

        public Criteria andApplyProductTypeBetween(String value1, String value2) {
            addCriterion("apply_product_type between", value1, value2, "applyProductType");
            return (Criteria) this;
        }

        public Criteria andApplyProductTypeNotBetween(String value1, String value2) {
            addCriterion("apply_product_type not between", value1, value2, "applyProductType");
            return (Criteria) this;
        }

        public Criteria andApplyProductTermIsNull() {
            addCriterion("apply_product_term is null");
            return (Criteria) this;
        }

        public Criteria andApplyProductTermIsNotNull() {
            addCriterion("apply_product_term is not null");
            return (Criteria) this;
        }

        public Criteria andApplyProductTermEqualTo(Integer value) {
            addCriterion("apply_product_term =", value, "applyProductTerm");
            return (Criteria) this;
        }

        public Criteria andApplyProductTermNotEqualTo(Integer value) {
            addCriterion("apply_product_term <>", value, "applyProductTerm");
            return (Criteria) this;
        }

        public Criteria andApplyProductTermGreaterThan(Integer value) {
            addCriterion("apply_product_term >", value, "applyProductTerm");
            return (Criteria) this;
        }

        public Criteria andApplyProductTermGreaterThanOrEqualTo(Integer value) {
            addCriterion("apply_product_term >=", value, "applyProductTerm");
            return (Criteria) this;
        }

        public Criteria andApplyProductTermLessThan(Integer value) {
            addCriterion("apply_product_term <", value, "applyProductTerm");
            return (Criteria) this;
        }

        public Criteria andApplyProductTermLessThanOrEqualTo(Integer value) {
            addCriterion("apply_product_term <=", value, "applyProductTerm");
            return (Criteria) this;
        }

        public Criteria andApplyProductTermIn(List<Integer> values) {
            addCriterion("apply_product_term in", values, "applyProductTerm");
            return (Criteria) this;
        }

        public Criteria andApplyProductTermNotIn(List<Integer> values) {
            addCriterion("apply_product_term not in", values, "applyProductTerm");
            return (Criteria) this;
        }

        public Criteria andApplyProductTermBetween(Integer value1, Integer value2) {
            addCriterion("apply_product_term between", value1, value2, "applyProductTerm");
            return (Criteria) this;
        }

        public Criteria andApplyProductTermNotBetween(Integer value1, Integer value2) {
            addCriterion("apply_product_term not between", value1, value2, "applyProductTerm");
            return (Criteria) this;
        }

        public Criteria andApplyRepayTypeIsNull() {
            addCriterion("apply_repay_type is null");
            return (Criteria) this;
        }

        public Criteria andApplyRepayTypeIsNotNull() {
            addCriterion("apply_repay_type is not null");
            return (Criteria) this;
        }

        public Criteria andApplyRepayTypeEqualTo(String value) {
            addCriterion("apply_repay_type =", value, "applyRepayType");
            return (Criteria) this;
        }

        public Criteria andApplyRepayTypeNotEqualTo(String value) {
            addCriterion("apply_repay_type <>", value, "applyRepayType");
            return (Criteria) this;
        }

        public Criteria andApplyRepayTypeGreaterThan(String value) {
            addCriterion("apply_repay_type >", value, "applyRepayType");
            return (Criteria) this;
        }

        public Criteria andApplyRepayTypeGreaterThanOrEqualTo(String value) {
            addCriterion("apply_repay_type >=", value, "applyRepayType");
            return (Criteria) this;
        }

        public Criteria andApplyRepayTypeLessThan(String value) {
            addCriterion("apply_repay_type <", value, "applyRepayType");
            return (Criteria) this;
        }

        public Criteria andApplyRepayTypeLessThanOrEqualTo(String value) {
            addCriterion("apply_repay_type <=", value, "applyRepayType");
            return (Criteria) this;
        }

        public Criteria andApplyRepayTypeLike(String value) {
            addCriterion("apply_repay_type like", value, "applyRepayType");
            return (Criteria) this;
        }

        public Criteria andApplyRepayTypeNotLike(String value) {
            addCriterion("apply_repay_type not like", value, "applyRepayType");
            return (Criteria) this;
        }

        public Criteria andApplyRepayTypeIn(List<String> values) {
            addCriterion("apply_repay_type in", values, "applyRepayType");
            return (Criteria) this;
        }

        public Criteria andApplyRepayTypeNotIn(List<String> values) {
            addCriterion("apply_repay_type not in", values, "applyRepayType");
            return (Criteria) this;
        }

        public Criteria andApplyRepayTypeBetween(String value1, String value2) {
            addCriterion("apply_repay_type between", value1, value2, "applyRepayType");
            return (Criteria) this;
        }

        public Criteria andApplyRepayTypeNotBetween(String value1, String value2) {
            addCriterion("apply_repay_type not between", value1, value2, "applyRepayType");
            return (Criteria) this;
        }

        public Criteria andMicroCreditSignIsNull() {
            addCriterion("micro_credit_sign is null");
            return (Criteria) this;
        }

        public Criteria andMicroCreditSignIsNotNull() {
            addCriterion("micro_credit_sign is not null");
            return (Criteria) this;
        }

        public Criteria andMicroCreditSignEqualTo(String value) {
            addCriterion("micro_credit_sign =", value, "microCreditSign");
            return (Criteria) this;
        }

        public Criteria andMicroCreditSignNotEqualTo(String value) {
            addCriterion("micro_credit_sign <>", value, "microCreditSign");
            return (Criteria) this;
        }

        public Criteria andMicroCreditSignGreaterThan(String value) {
            addCriterion("micro_credit_sign >", value, "microCreditSign");
            return (Criteria) this;
        }

        public Criteria andMicroCreditSignGreaterThanOrEqualTo(String value) {
            addCriterion("micro_credit_sign >=", value, "microCreditSign");
            return (Criteria) this;
        }

        public Criteria andMicroCreditSignLessThan(String value) {
            addCriterion("micro_credit_sign <", value, "microCreditSign");
            return (Criteria) this;
        }

        public Criteria andMicroCreditSignLessThanOrEqualTo(String value) {
            addCriterion("micro_credit_sign <=", value, "microCreditSign");
            return (Criteria) this;
        }

        public Criteria andMicroCreditSignLike(String value) {
            addCriterion("micro_credit_sign like", value, "microCreditSign");
            return (Criteria) this;
        }

        public Criteria andMicroCreditSignNotLike(String value) {
            addCriterion("micro_credit_sign not like", value, "microCreditSign");
            return (Criteria) this;
        }

        public Criteria andMicroCreditSignIn(List<String> values) {
            addCriterion("micro_credit_sign in", values, "microCreditSign");
            return (Criteria) this;
        }

        public Criteria andMicroCreditSignNotIn(List<String> values) {
            addCriterion("micro_credit_sign not in", values, "microCreditSign");
            return (Criteria) this;
        }

        public Criteria andMicroCreditSignBetween(String value1, String value2) {
            addCriterion("micro_credit_sign between", value1, value2, "microCreditSign");
            return (Criteria) this;
        }

        public Criteria andMicroCreditSignNotBetween(String value1, String value2) {
            addCriterion("micro_credit_sign not between", value1, value2, "microCreditSign");
            return (Criteria) this;
        }

        public Criteria andLineSignIsNull() {
            addCriterion("line_sign is null");
            return (Criteria) this;
        }

        public Criteria andLineSignIsNotNull() {
            addCriterion("line_sign is not null");
            return (Criteria) this;
        }

        public Criteria andLineSignEqualTo(String value) {
            addCriterion("line_sign =", value, "lineSign");
            return (Criteria) this;
        }

        public Criteria andLineSignNotEqualTo(String value) {
            addCriterion("line_sign <>", value, "lineSign");
            return (Criteria) this;
        }

        public Criteria andLineSignGreaterThan(String value) {
            addCriterion("line_sign >", value, "lineSign");
            return (Criteria) this;
        }

        public Criteria andLineSignGreaterThanOrEqualTo(String value) {
            addCriterion("line_sign >=", value, "lineSign");
            return (Criteria) this;
        }

        public Criteria andLineSignLessThan(String value) {
            addCriterion("line_sign <", value, "lineSign");
            return (Criteria) this;
        }

        public Criteria andLineSignLessThanOrEqualTo(String value) {
            addCriterion("line_sign <=", value, "lineSign");
            return (Criteria) this;
        }

        public Criteria andLineSignLike(String value) {
            addCriterion("line_sign like", value, "lineSign");
            return (Criteria) this;
        }

        public Criteria andLineSignNotLike(String value) {
            addCriterion("line_sign not like", value, "lineSign");
            return (Criteria) this;
        }

        public Criteria andLineSignIn(List<String> values) {
            addCriterion("line_sign in", values, "lineSign");
            return (Criteria) this;
        }

        public Criteria andLineSignNotIn(List<String> values) {
            addCriterion("line_sign not in", values, "lineSign");
            return (Criteria) this;
        }

        public Criteria andLineSignBetween(String value1, String value2) {
            addCriterion("line_sign between", value1, value2, "lineSign");
            return (Criteria) this;
        }

        public Criteria andLineSignNotBetween(String value1, String value2) {
            addCriterion("line_sign not between", value1, value2, "lineSign");
            return (Criteria) this;
        }

        public Criteria andDivisionCodeIsNull() {
            addCriterion("division_code is null");
            return (Criteria) this;
        }

        public Criteria andDivisionCodeIsNotNull() {
            addCriterion("division_code is not null");
            return (Criteria) this;
        }

        public Criteria andDivisionCodeEqualTo(String value) {
            addCriterion("division_code =", value, "divisionCode");
            return (Criteria) this;
        }

        public Criteria andDivisionCodeNotEqualTo(String value) {
            addCriterion("division_code <>", value, "divisionCode");
            return (Criteria) this;
        }

        public Criteria andDivisionCodeGreaterThan(String value) {
            addCriterion("division_code >", value, "divisionCode");
            return (Criteria) this;
        }

        public Criteria andDivisionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("division_code >=", value, "divisionCode");
            return (Criteria) this;
        }

        public Criteria andDivisionCodeLessThan(String value) {
            addCriterion("division_code <", value, "divisionCode");
            return (Criteria) this;
        }

        public Criteria andDivisionCodeLessThanOrEqualTo(String value) {
            addCriterion("division_code <=", value, "divisionCode");
            return (Criteria) this;
        }

        public Criteria andDivisionCodeLike(String value) {
            addCriterion("division_code like", value, "divisionCode");
            return (Criteria) this;
        }

        public Criteria andDivisionCodeNotLike(String value) {
            addCriterion("division_code not like", value, "divisionCode");
            return (Criteria) this;
        }

        public Criteria andDivisionCodeIn(List<String> values) {
            addCriterion("division_code in", values, "divisionCode");
            return (Criteria) this;
        }

        public Criteria andDivisionCodeNotIn(List<String> values) {
            addCriterion("division_code not in", values, "divisionCode");
            return (Criteria) this;
        }

        public Criteria andDivisionCodeBetween(String value1, String value2) {
            addCriterion("division_code between", value1, value2, "divisionCode");
            return (Criteria) this;
        }

        public Criteria andDivisionCodeNotBetween(String value1, String value2) {
            addCriterion("division_code not between", value1, value2, "divisionCode");
            return (Criteria) this;
        }

        public Criteria andDivisionNameIsNull() {
            addCriterion("division_name is null");
            return (Criteria) this;
        }

        public Criteria andDivisionNameIsNotNull() {
            addCriterion("division_name is not null");
            return (Criteria) this;
        }

        public Criteria andDivisionNameEqualTo(String value) {
            addCriterion("division_name =", value, "divisionName");
            return (Criteria) this;
        }

        public Criteria andDivisionNameNotEqualTo(String value) {
            addCriterion("division_name <>", value, "divisionName");
            return (Criteria) this;
        }

        public Criteria andDivisionNameGreaterThan(String value) {
            addCriterion("division_name >", value, "divisionName");
            return (Criteria) this;
        }

        public Criteria andDivisionNameGreaterThanOrEqualTo(String value) {
            addCriterion("division_name >=", value, "divisionName");
            return (Criteria) this;
        }

        public Criteria andDivisionNameLessThan(String value) {
            addCriterion("division_name <", value, "divisionName");
            return (Criteria) this;
        }

        public Criteria andDivisionNameLessThanOrEqualTo(String value) {
            addCriterion("division_name <=", value, "divisionName");
            return (Criteria) this;
        }

        public Criteria andDivisionNameLike(String value) {
            addCriterion("division_name like", value, "divisionName");
            return (Criteria) this;
        }

        public Criteria andDivisionNameNotLike(String value) {
            addCriterion("division_name not like", value, "divisionName");
            return (Criteria) this;
        }

        public Criteria andDivisionNameIn(List<String> values) {
            addCriterion("division_name in", values, "divisionName");
            return (Criteria) this;
        }

        public Criteria andDivisionNameNotIn(List<String> values) {
            addCriterion("division_name not in", values, "divisionName");
            return (Criteria) this;
        }

        public Criteria andDivisionNameBetween(String value1, String value2) {
            addCriterion("division_name between", value1, value2, "divisionName");
            return (Criteria) this;
        }

        public Criteria andDivisionNameNotBetween(String value1, String value2) {
            addCriterion("division_name not between", value1, value2, "divisionName");
            return (Criteria) this;
        }

        public Criteria andTeamCodeIsNull() {
            addCriterion("team_code is null");
            return (Criteria) this;
        }

        public Criteria andTeamCodeIsNotNull() {
            addCriterion("team_code is not null");
            return (Criteria) this;
        }

        public Criteria andTeamCodeEqualTo(String value) {
            addCriterion("team_code =", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeNotEqualTo(String value) {
            addCriterion("team_code <>", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeGreaterThan(String value) {
            addCriterion("team_code >", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeGreaterThanOrEqualTo(String value) {
            addCriterion("team_code >=", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeLessThan(String value) {
            addCriterion("team_code <", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeLessThanOrEqualTo(String value) {
            addCriterion("team_code <=", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeLike(String value) {
            addCriterion("team_code like", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeNotLike(String value) {
            addCriterion("team_code not like", value, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeIn(List<String> values) {
            addCriterion("team_code in", values, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeNotIn(List<String> values) {
            addCriterion("team_code not in", values, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeBetween(String value1, String value2) {
            addCriterion("team_code between", value1, value2, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamCodeNotBetween(String value1, String value2) {
            addCriterion("team_code not between", value1, value2, "teamCode");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNull() {
            addCriterion("team_name is null");
            return (Criteria) this;
        }

        public Criteria andTeamNameIsNotNull() {
            addCriterion("team_name is not null");
            return (Criteria) this;
        }

        public Criteria andTeamNameEqualTo(String value) {
            addCriterion("team_name =", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotEqualTo(String value) {
            addCriterion("team_name <>", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThan(String value) {
            addCriterion("team_name >", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameGreaterThanOrEqualTo(String value) {
            addCriterion("team_name >=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThan(String value) {
            addCriterion("team_name <", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLessThanOrEqualTo(String value) {
            addCriterion("team_name <=", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameLike(String value) {
            addCriterion("team_name like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotLike(String value) {
            addCriterion("team_name not like", value, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameIn(List<String> values) {
            addCriterion("team_name in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotIn(List<String> values) {
            addCriterion("team_name not in", values, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameBetween(String value1, String value2) {
            addCriterion("team_name between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andTeamNameNotBetween(String value1, String value2) {
            addCriterion("team_name not between", value1, value2, "teamName");
            return (Criteria) this;
        }

        public Criteria andDivisionIdIsNull() {
            addCriterion("division_id is null");
            return (Criteria) this;
        }

        public Criteria andDivisionIdIsNotNull() {
            addCriterion("division_id is not null");
            return (Criteria) this;
        }

        public Criteria andDivisionIdEqualTo(Long value) {
            addCriterion("division_id =", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdNotEqualTo(Long value) {
            addCriterion("division_id <>", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdGreaterThan(Long value) {
            addCriterion("division_id >", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("division_id >=", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdLessThan(Long value) {
            addCriterion("division_id <", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdLessThanOrEqualTo(Long value) {
            addCriterion("division_id <=", value, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdIn(List<Long> values) {
            addCriterion("division_id in", values, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdNotIn(List<Long> values) {
            addCriterion("division_id not in", values, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdBetween(Long value1, Long value2) {
            addCriterion("division_id between", value1, value2, "divisionId");
            return (Criteria) this;
        }

        public Criteria andDivisionIdNotBetween(Long value1, Long value2) {
            addCriterion("division_id not between", value1, value2, "divisionId");
            return (Criteria) this;
        }

        public Criteria andPersonalOrEnterpriseIsNull() {
            addCriterion("personal_or_enterprise is null");
            return (Criteria) this;
        }

        public Criteria andPersonalOrEnterpriseIsNotNull() {
            addCriterion("personal_or_enterprise is not null");
            return (Criteria) this;
        }

        public Criteria andPersonalOrEnterpriseEqualTo(String value) {
            addCriterion("personal_or_enterprise =", value, "personalOrEnterprise");
            return (Criteria) this;
        }

        public Criteria andPersonalOrEnterpriseNotEqualTo(String value) {
            addCriterion("personal_or_enterprise <>", value, "personalOrEnterprise");
            return (Criteria) this;
        }

        public Criteria andPersonalOrEnterpriseGreaterThan(String value) {
            addCriterion("personal_or_enterprise >", value, "personalOrEnterprise");
            return (Criteria) this;
        }

        public Criteria andPersonalOrEnterpriseGreaterThanOrEqualTo(String value) {
            addCriterion("personal_or_enterprise >=", value, "personalOrEnterprise");
            return (Criteria) this;
        }

        public Criteria andPersonalOrEnterpriseLessThan(String value) {
            addCriterion("personal_or_enterprise <", value, "personalOrEnterprise");
            return (Criteria) this;
        }

        public Criteria andPersonalOrEnterpriseLessThanOrEqualTo(String value) {
            addCriterion("personal_or_enterprise <=", value, "personalOrEnterprise");
            return (Criteria) this;
        }

        public Criteria andPersonalOrEnterpriseLike(String value) {
            addCriterion("personal_or_enterprise like", value, "personalOrEnterprise");
            return (Criteria) this;
        }

        public Criteria andPersonalOrEnterpriseNotLike(String value) {
            addCriterion("personal_or_enterprise not like", value, "personalOrEnterprise");
            return (Criteria) this;
        }

        public Criteria andPersonalOrEnterpriseIn(List<String> values) {
            addCriterion("personal_or_enterprise in", values, "personalOrEnterprise");
            return (Criteria) this;
        }

        public Criteria andPersonalOrEnterpriseNotIn(List<String> values) {
            addCriterion("personal_or_enterprise not in", values, "personalOrEnterprise");
            return (Criteria) this;
        }

        public Criteria andPersonalOrEnterpriseBetween(String value1, String value2) {
            addCriterion("personal_or_enterprise between", value1, value2, "personalOrEnterprise");
            return (Criteria) this;
        }

        public Criteria andPersonalOrEnterpriseNotBetween(String value1, String value2) {
            addCriterion("personal_or_enterprise not between", value1, value2, "personalOrEnterprise");
            return (Criteria) this;
        }

        public Criteria andUscCodeIsNull() {
            addCriterion("usc_code is null");
            return (Criteria) this;
        }

        public Criteria andUscCodeIsNotNull() {
            addCriterion("usc_code is not null");
            return (Criteria) this;
        }

        public Criteria andUscCodeEqualTo(String value) {
            addCriterion("usc_code =", value, "uscCode");
            return (Criteria) this;
        }

        public Criteria andUscCodeNotEqualTo(String value) {
            addCriterion("usc_code <>", value, "uscCode");
            return (Criteria) this;
        }

        public Criteria andUscCodeGreaterThan(String value) {
            addCriterion("usc_code >", value, "uscCode");
            return (Criteria) this;
        }

        public Criteria andUscCodeGreaterThanOrEqualTo(String value) {
            addCriterion("usc_code >=", value, "uscCode");
            return (Criteria) this;
        }

        public Criteria andUscCodeLessThan(String value) {
            addCriterion("usc_code <", value, "uscCode");
            return (Criteria) this;
        }

        public Criteria andUscCodeLessThanOrEqualTo(String value) {
            addCriterion("usc_code <=", value, "uscCode");
            return (Criteria) this;
        }

        public Criteria andUscCodeLike(String value) {
            addCriterion("usc_code like", value, "uscCode");
            return (Criteria) this;
        }

        public Criteria andUscCodeNotLike(String value) {
            addCriterion("usc_code not like", value, "uscCode");
            return (Criteria) this;
        }

        public Criteria andUscCodeIn(List<String> values) {
            addCriterion("usc_code in", values, "uscCode");
            return (Criteria) this;
        }

        public Criteria andUscCodeNotIn(List<String> values) {
            addCriterion("usc_code not in", values, "uscCode");
            return (Criteria) this;
        }

        public Criteria andUscCodeBetween(String value1, String value2) {
            addCriterion("usc_code between", value1, value2, "uscCode");
            return (Criteria) this;
        }

        public Criteria andUscCodeNotBetween(String value1, String value2) {
            addCriterion("usc_code not between", value1, value2, "uscCode");
            return (Criteria) this;
        }

        public Criteria andApplyCrowdIsNull() {
            addCriterion("apply_crowd is null");
            return (Criteria) this;
        }

        public Criteria andApplyCrowdIsNotNull() {
            addCriterion("apply_crowd is not null");
            return (Criteria) this;
        }

        public Criteria andApplyCrowdEqualTo(String value) {
            addCriterion("apply_crowd =", value, "applyCrowd");
            return (Criteria) this;
        }

        public Criteria andApplyCrowdNotEqualTo(String value) {
            addCriterion("apply_crowd <>", value, "applyCrowd");
            return (Criteria) this;
        }

        public Criteria andApplyCrowdGreaterThan(String value) {
            addCriterion("apply_crowd >", value, "applyCrowd");
            return (Criteria) this;
        }

        public Criteria andApplyCrowdGreaterThanOrEqualTo(String value) {
            addCriterion("apply_crowd >=", value, "applyCrowd");
            return (Criteria) this;
        }

        public Criteria andApplyCrowdLessThan(String value) {
            addCriterion("apply_crowd <", value, "applyCrowd");
            return (Criteria) this;
        }

        public Criteria andApplyCrowdLessThanOrEqualTo(String value) {
            addCriterion("apply_crowd <=", value, "applyCrowd");
            return (Criteria) this;
        }

        public Criteria andApplyCrowdLike(String value) {
            addCriterion("apply_crowd like", value, "applyCrowd");
            return (Criteria) this;
        }

        public Criteria andApplyCrowdNotLike(String value) {
            addCriterion("apply_crowd not like", value, "applyCrowd");
            return (Criteria) this;
        }

        public Criteria andApplyCrowdIn(List<String> values) {
            addCriterion("apply_crowd in", values, "applyCrowd");
            return (Criteria) this;
        }

        public Criteria andApplyCrowdNotIn(List<String> values) {
            addCriterion("apply_crowd not in", values, "applyCrowd");
            return (Criteria) this;
        }

        public Criteria andApplyCrowdBetween(String value1, String value2) {
            addCriterion("apply_crowd between", value1, value2, "applyCrowd");
            return (Criteria) this;
        }

        public Criteria andApplyCrowdNotBetween(String value1, String value2) {
            addCriterion("apply_crowd not between", value1, value2, "applyCrowd");
            return (Criteria) this;
        }

        public Criteria andIdCardAddressIsNull() {
            addCriterion("id_card_address is null");
            return (Criteria) this;
        }

        public Criteria andIdCardAddressIsNotNull() {
            addCriterion("id_card_address is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardAddressEqualTo(String value) {
            addCriterion("id_card_address =", value, "idCardAddress");
            return (Criteria) this;
        }

        public Criteria andIdCardAddressNotEqualTo(String value) {
            addCriterion("id_card_address <>", value, "idCardAddress");
            return (Criteria) this;
        }

        public Criteria andIdCardAddressGreaterThan(String value) {
            addCriterion("id_card_address >", value, "idCardAddress");
            return (Criteria) this;
        }

        public Criteria andIdCardAddressGreaterThanOrEqualTo(String value) {
            addCriterion("id_card_address >=", value, "idCardAddress");
            return (Criteria) this;
        }

        public Criteria andIdCardAddressLessThan(String value) {
            addCriterion("id_card_address <", value, "idCardAddress");
            return (Criteria) this;
        }

        public Criteria andIdCardAddressLessThanOrEqualTo(String value) {
            addCriterion("id_card_address <=", value, "idCardAddress");
            return (Criteria) this;
        }

        public Criteria andIdCardAddressLike(String value) {
            addCriterion("id_card_address like", value, "idCardAddress");
            return (Criteria) this;
        }

        public Criteria andIdCardAddressNotLike(String value) {
            addCriterion("id_card_address not like", value, "idCardAddress");
            return (Criteria) this;
        }

        public Criteria andIdCardAddressIn(List<String> values) {
            addCriterion("id_card_address in", values, "idCardAddress");
            return (Criteria) this;
        }

        public Criteria andIdCardAddressNotIn(List<String> values) {
            addCriterion("id_card_address not in", values, "idCardAddress");
            return (Criteria) this;
        }

        public Criteria andIdCardAddressBetween(String value1, String value2) {
            addCriterion("id_card_address between", value1, value2, "idCardAddress");
            return (Criteria) this;
        }

        public Criteria andIdCardAddressNotBetween(String value1, String value2) {
            addCriterion("id_card_address not between", value1, value2, "idCardAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNull() {
            addCriterion("home_address is null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIsNotNull() {
            addCriterion("home_address is not null");
            return (Criteria) this;
        }

        public Criteria andHomeAddressEqualTo(String value) {
            addCriterion("home_address =", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotEqualTo(String value) {
            addCriterion("home_address <>", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThan(String value) {
            addCriterion("home_address >", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("home_address >=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThan(String value) {
            addCriterion("home_address <", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLessThanOrEqualTo(String value) {
            addCriterion("home_address <=", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressLike(String value) {
            addCriterion("home_address like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotLike(String value) {
            addCriterion("home_address not like", value, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressIn(List<String> values) {
            addCriterion("home_address in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotIn(List<String> values) {
            addCriterion("home_address not in", values, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressBetween(String value1, String value2) {
            addCriterion("home_address between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andHomeAddressNotBetween(String value1, String value2) {
            addCriterion("home_address not between", value1, value2, "homeAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIsNull() {
            addCriterion("business_address is null");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIsNotNull() {
            addCriterion("business_address is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressEqualTo(String value) {
            addCriterion("business_address =", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotEqualTo(String value) {
            addCriterion("business_address <>", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressGreaterThan(String value) {
            addCriterion("business_address >", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressGreaterThanOrEqualTo(String value) {
            addCriterion("business_address >=", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLessThan(String value) {
            addCriterion("business_address <", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLessThanOrEqualTo(String value) {
            addCriterion("business_address <=", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressLike(String value) {
            addCriterion("business_address like", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotLike(String value) {
            addCriterion("business_address not like", value, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressIn(List<String> values) {
            addCriterion("business_address in", values, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotIn(List<String> values) {
            addCriterion("business_address not in", values, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressBetween(String value1, String value2) {
            addCriterion("business_address between", value1, value2, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andBusinessAddressNotBetween(String value1, String value2) {
            addCriterion("business_address not between", value1, value2, "businessAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressIsNull() {
            addCriterion("manage_address is null");
            return (Criteria) this;
        }

        public Criteria andManageAddressIsNotNull() {
            addCriterion("manage_address is not null");
            return (Criteria) this;
        }

        public Criteria andManageAddressEqualTo(String value) {
            addCriterion("manage_address =", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressNotEqualTo(String value) {
            addCriterion("manage_address <>", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressGreaterThan(String value) {
            addCriterion("manage_address >", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressGreaterThanOrEqualTo(String value) {
            addCriterion("manage_address >=", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressLessThan(String value) {
            addCriterion("manage_address <", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressLessThanOrEqualTo(String value) {
            addCriterion("manage_address <=", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressLike(String value) {
            addCriterion("manage_address like", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressNotLike(String value) {
            addCriterion("manage_address not like", value, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressIn(List<String> values) {
            addCriterion("manage_address in", values, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressNotIn(List<String> values) {
            addCriterion("manage_address not in", values, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressBetween(String value1, String value2) {
            addCriterion("manage_address between", value1, value2, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andManageAddressNotBetween(String value1, String value2) {
            addCriterion("manage_address not between", value1, value2, "manageAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("company_address is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("company_address is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("company_address =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("company_address <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("company_address >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("company_address >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("company_address <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("company_address <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("company_address like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("company_address not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("company_address in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("company_address not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("company_address between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("company_address not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andMicroOrConsumeIsNull() {
            addCriterion("micro_or_consume is null");
            return (Criteria) this;
        }

        public Criteria andMicroOrConsumeIsNotNull() {
            addCriterion("micro_or_consume is not null");
            return (Criteria) this;
        }

        public Criteria andMicroOrConsumeEqualTo(String value) {
            addCriterion("micro_or_consume =", value, "microOrConsume");
            return (Criteria) this;
        }

        public Criteria andMicroOrConsumeNotEqualTo(String value) {
            addCriterion("micro_or_consume <>", value, "microOrConsume");
            return (Criteria) this;
        }

        public Criteria andMicroOrConsumeGreaterThan(String value) {
            addCriterion("micro_or_consume >", value, "microOrConsume");
            return (Criteria) this;
        }

        public Criteria andMicroOrConsumeGreaterThanOrEqualTo(String value) {
            addCriterion("micro_or_consume >=", value, "microOrConsume");
            return (Criteria) this;
        }

        public Criteria andMicroOrConsumeLessThan(String value) {
            addCriterion("micro_or_consume <", value, "microOrConsume");
            return (Criteria) this;
        }

        public Criteria andMicroOrConsumeLessThanOrEqualTo(String value) {
            addCriterion("micro_or_consume <=", value, "microOrConsume");
            return (Criteria) this;
        }

        public Criteria andMicroOrConsumeLike(String value) {
            addCriterion("micro_or_consume like", value, "microOrConsume");
            return (Criteria) this;
        }

        public Criteria andMicroOrConsumeNotLike(String value) {
            addCriterion("micro_or_consume not like", value, "microOrConsume");
            return (Criteria) this;
        }

        public Criteria andMicroOrConsumeIn(List<String> values) {
            addCriterion("micro_or_consume in", values, "microOrConsume");
            return (Criteria) this;
        }

        public Criteria andMicroOrConsumeNotIn(List<String> values) {
            addCriterion("micro_or_consume not in", values, "microOrConsume");
            return (Criteria) this;
        }

        public Criteria andMicroOrConsumeBetween(String value1, String value2) {
            addCriterion("micro_or_consume between", value1, value2, "microOrConsume");
            return (Criteria) this;
        }

        public Criteria andMicroOrConsumeNotBetween(String value1, String value2) {
            addCriterion("micro_or_consume not between", value1, value2, "microOrConsume");
            return (Criteria) this;
        }

        public Criteria andHaveFileTypeIsNull() {
            addCriterion("have_file_type is null");
            return (Criteria) this;
        }

        public Criteria andHaveFileTypeIsNotNull() {
            addCriterion("have_file_type is not null");
            return (Criteria) this;
        }

        public Criteria andHaveFileTypeEqualTo(String value) {
            addCriterion("have_file_type =", value, "haveFileType");
            return (Criteria) this;
        }

        public Criteria andHaveFileTypeNotEqualTo(String value) {
            addCriterion("have_file_type <>", value, "haveFileType");
            return (Criteria) this;
        }

        public Criteria andHaveFileTypeGreaterThan(String value) {
            addCriterion("have_file_type >", value, "haveFileType");
            return (Criteria) this;
        }

        public Criteria andHaveFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("have_file_type >=", value, "haveFileType");
            return (Criteria) this;
        }

        public Criteria andHaveFileTypeLessThan(String value) {
            addCriterion("have_file_type <", value, "haveFileType");
            return (Criteria) this;
        }

        public Criteria andHaveFileTypeLessThanOrEqualTo(String value) {
            addCriterion("have_file_type <=", value, "haveFileType");
            return (Criteria) this;
        }

        public Criteria andHaveFileTypeLike(String value) {
            addCriterion("have_file_type like", value, "haveFileType");
            return (Criteria) this;
        }

        public Criteria andHaveFileTypeNotLike(String value) {
            addCriterion("have_file_type not like", value, "haveFileType");
            return (Criteria) this;
        }

        public Criteria andHaveFileTypeIn(List<String> values) {
            addCriterion("have_file_type in", values, "haveFileType");
            return (Criteria) this;
        }

        public Criteria andHaveFileTypeNotIn(List<String> values) {
            addCriterion("have_file_type not in", values, "haveFileType");
            return (Criteria) this;
        }

        public Criteria andHaveFileTypeBetween(String value1, String value2) {
            addCriterion("have_file_type between", value1, value2, "haveFileType");
            return (Criteria) this;
        }

        public Criteria andHaveFileTypeNotBetween(String value1, String value2) {
            addCriterion("have_file_type not between", value1, value2, "haveFileType");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNull() {
            addCriterion("apply_status is null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIsNotNull() {
            addCriterion("apply_status is not null");
            return (Criteria) this;
        }

        public Criteria andApplyStatusEqualTo(String value) {
            addCriterion("apply_status =", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotEqualTo(String value) {
            addCriterion("apply_status <>", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThan(String value) {
            addCriterion("apply_status >", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusGreaterThanOrEqualTo(String value) {
            addCriterion("apply_status >=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThan(String value) {
            addCriterion("apply_status <", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLessThanOrEqualTo(String value) {
            addCriterion("apply_status <=", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusLike(String value) {
            addCriterion("apply_status like", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotLike(String value) {
            addCriterion("apply_status not like", value, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusIn(List<String> values) {
            addCriterion("apply_status in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotIn(List<String> values) {
            addCriterion("apply_status not in", values, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusBetween(String value1, String value2) {
            addCriterion("apply_status between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andApplyStatusNotBetween(String value1, String value2) {
            addCriterion("apply_status not between", value1, value2, "applyStatus");
            return (Criteria) this;
        }

        public Criteria andFunderResultIsNull() {
            addCriterion("funder_result is null");
            return (Criteria) this;
        }

        public Criteria andFunderResultIsNotNull() {
            addCriterion("funder_result is not null");
            return (Criteria) this;
        }

        public Criteria andFunderResultEqualTo(String value) {
            addCriterion("funder_result =", value, "funderResult");
            return (Criteria) this;
        }

        public Criteria andFunderResultNotEqualTo(String value) {
            addCriterion("funder_result <>", value, "funderResult");
            return (Criteria) this;
        }

        public Criteria andFunderResultGreaterThan(String value) {
            addCriterion("funder_result >", value, "funderResult");
            return (Criteria) this;
        }

        public Criteria andFunderResultGreaterThanOrEqualTo(String value) {
            addCriterion("funder_result >=", value, "funderResult");
            return (Criteria) this;
        }

        public Criteria andFunderResultLessThan(String value) {
            addCriterion("funder_result <", value, "funderResult");
            return (Criteria) this;
        }

        public Criteria andFunderResultLessThanOrEqualTo(String value) {
            addCriterion("funder_result <=", value, "funderResult");
            return (Criteria) this;
        }

        public Criteria andFunderResultLike(String value) {
            addCriterion("funder_result like", value, "funderResult");
            return (Criteria) this;
        }

        public Criteria andFunderResultNotLike(String value) {
            addCriterion("funder_result not like", value, "funderResult");
            return (Criteria) this;
        }

        public Criteria andFunderResultIn(List<String> values) {
            addCriterion("funder_result in", values, "funderResult");
            return (Criteria) this;
        }

        public Criteria andFunderResultNotIn(List<String> values) {
            addCriterion("funder_result not in", values, "funderResult");
            return (Criteria) this;
        }

        public Criteria andFunderResultBetween(String value1, String value2) {
            addCriterion("funder_result between", value1, value2, "funderResult");
            return (Criteria) this;
        }

        public Criteria andFunderResultNotBetween(String value1, String value2) {
            addCriterion("funder_result not between", value1, value2, "funderResult");
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