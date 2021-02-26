package com.newland.mrs.persist.model;

import java.util.ArrayList;
import java.util.List;

public class MrsMktFunderMatchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MrsMktFunderMatchExample() {
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

        public Criteria andMktFunderConfigIdIsNull() {
            addCriterion("mkt_funder_config_id is null");
            return (Criteria) this;
        }

        public Criteria andMktFunderConfigIdIsNotNull() {
            addCriterion("mkt_funder_config_id is not null");
            return (Criteria) this;
        }

        public Criteria andMktFunderConfigIdEqualTo(Long value) {
            addCriterion("mkt_funder_config_id =", value, "mktFunderConfigId");
            return (Criteria) this;
        }

        public Criteria andMktFunderConfigIdNotEqualTo(Long value) {
            addCriterion("mkt_funder_config_id <>", value, "mktFunderConfigId");
            return (Criteria) this;
        }

        public Criteria andMktFunderConfigIdGreaterThan(Long value) {
            addCriterion("mkt_funder_config_id >", value, "mktFunderConfigId");
            return (Criteria) this;
        }

        public Criteria andMktFunderConfigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("mkt_funder_config_id >=", value, "mktFunderConfigId");
            return (Criteria) this;
        }

        public Criteria andMktFunderConfigIdLessThan(Long value) {
            addCriterion("mkt_funder_config_id <", value, "mktFunderConfigId");
            return (Criteria) this;
        }

        public Criteria andMktFunderConfigIdLessThanOrEqualTo(Long value) {
            addCriterion("mkt_funder_config_id <=", value, "mktFunderConfigId");
            return (Criteria) this;
        }

        public Criteria andMktFunderConfigIdIn(List<Long> values) {
            addCriterion("mkt_funder_config_id in", values, "mktFunderConfigId");
            return (Criteria) this;
        }

        public Criteria andMktFunderConfigIdNotIn(List<Long> values) {
            addCriterion("mkt_funder_config_id not in", values, "mktFunderConfigId");
            return (Criteria) this;
        }

        public Criteria andMktFunderConfigIdBetween(Long value1, Long value2) {
            addCriterion("mkt_funder_config_id between", value1, value2, "mktFunderConfigId");
            return (Criteria) this;
        }

        public Criteria andMktFunderConfigIdNotBetween(Long value1, Long value2) {
            addCriterion("mkt_funder_config_id not between", value1, value2, "mktFunderConfigId");
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

        public Criteria andWhetherToPushIsNull() {
            addCriterion("whether_to_push is null");
            return (Criteria) this;
        }

        public Criteria andWhetherToPushIsNotNull() {
            addCriterion("whether_to_push is not null");
            return (Criteria) this;
        }

        public Criteria andWhetherToPushEqualTo(String value) {
            addCriterion("whether_to_push =", value, "whetherToPush");
            return (Criteria) this;
        }

        public Criteria andWhetherToPushNotEqualTo(String value) {
            addCriterion("whether_to_push <>", value, "whetherToPush");
            return (Criteria) this;
        }

        public Criteria andWhetherToPushGreaterThan(String value) {
            addCriterion("whether_to_push >", value, "whetherToPush");
            return (Criteria) this;
        }

        public Criteria andWhetherToPushGreaterThanOrEqualTo(String value) {
            addCriterion("whether_to_push >=", value, "whetherToPush");
            return (Criteria) this;
        }

        public Criteria andWhetherToPushLessThan(String value) {
            addCriterion("whether_to_push <", value, "whetherToPush");
            return (Criteria) this;
        }

        public Criteria andWhetherToPushLessThanOrEqualTo(String value) {
            addCriterion("whether_to_push <=", value, "whetherToPush");
            return (Criteria) this;
        }

        public Criteria andWhetherToPushLike(String value) {
            addCriterion("whether_to_push like", value, "whetherToPush");
            return (Criteria) this;
        }

        public Criteria andWhetherToPushNotLike(String value) {
            addCriterion("whether_to_push not like", value, "whetherToPush");
            return (Criteria) this;
        }

        public Criteria andWhetherToPushIn(List<String> values) {
            addCriterion("whether_to_push in", values, "whetherToPush");
            return (Criteria) this;
        }

        public Criteria andWhetherToPushNotIn(List<String> values) {
            addCriterion("whether_to_push not in", values, "whetherToPush");
            return (Criteria) this;
        }

        public Criteria andWhetherToPushBetween(String value1, String value2) {
            addCriterion("whether_to_push between", value1, value2, "whetherToPush");
            return (Criteria) this;
        }

        public Criteria andWhetherToPushNotBetween(String value1, String value2) {
            addCriterion("whether_to_push not between", value1, value2, "whetherToPush");
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