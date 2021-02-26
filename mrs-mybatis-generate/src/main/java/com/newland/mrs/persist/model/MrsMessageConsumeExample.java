package com.newland.mrs.persist.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MrsMessageConsumeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MrsMessageConsumeExample() {
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

        public Criteria andMessageKeyIsNull() {
            addCriterion("message_key is null");
            return (Criteria) this;
        }

        public Criteria andMessageKeyIsNotNull() {
            addCriterion("message_key is not null");
            return (Criteria) this;
        }

        public Criteria andMessageKeyEqualTo(String value) {
            addCriterion("message_key =", value, "messageKey");
            return (Criteria) this;
        }

        public Criteria andMessageKeyNotEqualTo(String value) {
            addCriterion("message_key <>", value, "messageKey");
            return (Criteria) this;
        }

        public Criteria andMessageKeyGreaterThan(String value) {
            addCriterion("message_key >", value, "messageKey");
            return (Criteria) this;
        }

        public Criteria andMessageKeyGreaterThanOrEqualTo(String value) {
            addCriterion("message_key >=", value, "messageKey");
            return (Criteria) this;
        }

        public Criteria andMessageKeyLessThan(String value) {
            addCriterion("message_key <", value, "messageKey");
            return (Criteria) this;
        }

        public Criteria andMessageKeyLessThanOrEqualTo(String value) {
            addCriterion("message_key <=", value, "messageKey");
            return (Criteria) this;
        }

        public Criteria andMessageKeyLike(String value) {
            addCriterion("message_key like", value, "messageKey");
            return (Criteria) this;
        }

        public Criteria andMessageKeyNotLike(String value) {
            addCriterion("message_key not like", value, "messageKey");
            return (Criteria) this;
        }

        public Criteria andMessageKeyIn(List<String> values) {
            addCriterion("message_key in", values, "messageKey");
            return (Criteria) this;
        }

        public Criteria andMessageKeyNotIn(List<String> values) {
            addCriterion("message_key not in", values, "messageKey");
            return (Criteria) this;
        }

        public Criteria andMessageKeyBetween(String value1, String value2) {
            addCriterion("message_key between", value1, value2, "messageKey");
            return (Criteria) this;
        }

        public Criteria andMessageKeyNotBetween(String value1, String value2) {
            addCriterion("message_key not between", value1, value2, "messageKey");
            return (Criteria) this;
        }

        public Criteria andConsumeGroupIsNull() {
            addCriterion("consume_group is null");
            return (Criteria) this;
        }

        public Criteria andConsumeGroupIsNotNull() {
            addCriterion("consume_group is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeGroupEqualTo(String value) {
            addCriterion("consume_group =", value, "consumeGroup");
            return (Criteria) this;
        }

        public Criteria andConsumeGroupNotEqualTo(String value) {
            addCriterion("consume_group <>", value, "consumeGroup");
            return (Criteria) this;
        }

        public Criteria andConsumeGroupGreaterThan(String value) {
            addCriterion("consume_group >", value, "consumeGroup");
            return (Criteria) this;
        }

        public Criteria andConsumeGroupGreaterThanOrEqualTo(String value) {
            addCriterion("consume_group >=", value, "consumeGroup");
            return (Criteria) this;
        }

        public Criteria andConsumeGroupLessThan(String value) {
            addCriterion("consume_group <", value, "consumeGroup");
            return (Criteria) this;
        }

        public Criteria andConsumeGroupLessThanOrEqualTo(String value) {
            addCriterion("consume_group <=", value, "consumeGroup");
            return (Criteria) this;
        }

        public Criteria andConsumeGroupLike(String value) {
            addCriterion("consume_group like", value, "consumeGroup");
            return (Criteria) this;
        }

        public Criteria andConsumeGroupNotLike(String value) {
            addCriterion("consume_group not like", value, "consumeGroup");
            return (Criteria) this;
        }

        public Criteria andConsumeGroupIn(List<String> values) {
            addCriterion("consume_group in", values, "consumeGroup");
            return (Criteria) this;
        }

        public Criteria andConsumeGroupNotIn(List<String> values) {
            addCriterion("consume_group not in", values, "consumeGroup");
            return (Criteria) this;
        }

        public Criteria andConsumeGroupBetween(String value1, String value2) {
            addCriterion("consume_group between", value1, value2, "consumeGroup");
            return (Criteria) this;
        }

        public Criteria andConsumeGroupNotBetween(String value1, String value2) {
            addCriterion("consume_group not between", value1, value2, "consumeGroup");
            return (Criteria) this;
        }

        public Criteria andProducerGroupIsNull() {
            addCriterion("producer_group is null");
            return (Criteria) this;
        }

        public Criteria andProducerGroupIsNotNull() {
            addCriterion("producer_group is not null");
            return (Criteria) this;
        }

        public Criteria andProducerGroupEqualTo(String value) {
            addCriterion("producer_group =", value, "producerGroup");
            return (Criteria) this;
        }

        public Criteria andProducerGroupNotEqualTo(String value) {
            addCriterion("producer_group <>", value, "producerGroup");
            return (Criteria) this;
        }

        public Criteria andProducerGroupGreaterThan(String value) {
            addCriterion("producer_group >", value, "producerGroup");
            return (Criteria) this;
        }

        public Criteria andProducerGroupGreaterThanOrEqualTo(String value) {
            addCriterion("producer_group >=", value, "producerGroup");
            return (Criteria) this;
        }

        public Criteria andProducerGroupLessThan(String value) {
            addCriterion("producer_group <", value, "producerGroup");
            return (Criteria) this;
        }

        public Criteria andProducerGroupLessThanOrEqualTo(String value) {
            addCriterion("producer_group <=", value, "producerGroup");
            return (Criteria) this;
        }

        public Criteria andProducerGroupLike(String value) {
            addCriterion("producer_group like", value, "producerGroup");
            return (Criteria) this;
        }

        public Criteria andProducerGroupNotLike(String value) {
            addCriterion("producer_group not like", value, "producerGroup");
            return (Criteria) this;
        }

        public Criteria andProducerGroupIn(List<String> values) {
            addCriterion("producer_group in", values, "producerGroup");
            return (Criteria) this;
        }

        public Criteria andProducerGroupNotIn(List<String> values) {
            addCriterion("producer_group not in", values, "producerGroup");
            return (Criteria) this;
        }

        public Criteria andProducerGroupBetween(String value1, String value2) {
            addCriterion("producer_group between", value1, value2, "producerGroup");
            return (Criteria) this;
        }

        public Criteria andProducerGroupNotBetween(String value1, String value2) {
            addCriterion("producer_group not between", value1, value2, "producerGroup");
            return (Criteria) this;
        }

        public Criteria andTopicIsNull() {
            addCriterion("topic is null");
            return (Criteria) this;
        }

        public Criteria andTopicIsNotNull() {
            addCriterion("topic is not null");
            return (Criteria) this;
        }

        public Criteria andTopicEqualTo(String value) {
            addCriterion("topic =", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotEqualTo(String value) {
            addCriterion("topic <>", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThan(String value) {
            addCriterion("topic >", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicGreaterThanOrEqualTo(String value) {
            addCriterion("topic >=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThan(String value) {
            addCriterion("topic <", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLessThanOrEqualTo(String value) {
            addCriterion("topic <=", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicLike(String value) {
            addCriterion("topic like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotLike(String value) {
            addCriterion("topic not like", value, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicIn(List<String> values) {
            addCriterion("topic in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotIn(List<String> values) {
            addCriterion("topic not in", values, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicBetween(String value1, String value2) {
            addCriterion("topic between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andTopicNotBetween(String value1, String value2) {
            addCriterion("topic not between", value1, value2, "topic");
            return (Criteria) this;
        }

        public Criteria andTagsIsNull() {
            addCriterion("tags is null");
            return (Criteria) this;
        }

        public Criteria andTagsIsNotNull() {
            addCriterion("tags is not null");
            return (Criteria) this;
        }

        public Criteria andTagsEqualTo(String value) {
            addCriterion("tags =", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotEqualTo(String value) {
            addCriterion("tags <>", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThan(String value) {
            addCriterion("tags >", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsGreaterThanOrEqualTo(String value) {
            addCriterion("tags >=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThan(String value) {
            addCriterion("tags <", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLessThanOrEqualTo(String value) {
            addCriterion("tags <=", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsLike(String value) {
            addCriterion("tags like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotLike(String value) {
            addCriterion("tags not like", value, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsIn(List<String> values) {
            addCriterion("tags in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotIn(List<String> values) {
            addCriterion("tags not in", values, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsBetween(String value1, String value2) {
            addCriterion("tags between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andTagsNotBetween(String value1, String value2) {
            addCriterion("tags not between", value1, value2, "tags");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNull() {
            addCriterion("message_id is null");
            return (Criteria) this;
        }

        public Criteria andMessageIdIsNotNull() {
            addCriterion("message_id is not null");
            return (Criteria) this;
        }

        public Criteria andMessageIdEqualTo(String value) {
            addCriterion("message_id =", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotEqualTo(String value) {
            addCriterion("message_id <>", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThan(String value) {
            addCriterion("message_id >", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdGreaterThanOrEqualTo(String value) {
            addCriterion("message_id >=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThan(String value) {
            addCriterion("message_id <", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLessThanOrEqualTo(String value) {
            addCriterion("message_id <=", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdLike(String value) {
            addCriterion("message_id like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotLike(String value) {
            addCriterion("message_id not like", value, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdIn(List<String> values) {
            addCriterion("message_id in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotIn(List<String> values) {
            addCriterion("message_id not in", values, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdBetween(String value1, String value2) {
            addCriterion("message_id between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andMessageIdNotBetween(String value1, String value2) {
            addCriterion("message_id not between", value1, value2, "messageId");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNull() {
            addCriterion("sys_date is null");
            return (Criteria) this;
        }

        public Criteria andSysDateIsNotNull() {
            addCriterion("sys_date is not null");
            return (Criteria) this;
        }

        public Criteria andSysDateEqualTo(Date value) {
            addCriterionForJDBCDate("sys_date =", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("sys_date <>", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThan(Date value) {
            addCriterionForJDBCDate("sys_date >", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sys_date >=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThan(Date value) {
            addCriterionForJDBCDate("sys_date <", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("sys_date <=", value, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateIn(List<Date> values) {
            addCriterionForJDBCDate("sys_date in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("sys_date not in", values, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sys_date between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andSysDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("sys_date not between", value1, value2, "sysDate");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeIsNull() {
            addCriterion("consume_time is null");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeIsNotNull() {
            addCriterion("consume_time is not null");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeEqualTo(Date value) {
            addCriterion("consume_time =", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeNotEqualTo(Date value) {
            addCriterion("consume_time <>", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeGreaterThan(Date value) {
            addCriterion("consume_time >", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("consume_time >=", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeLessThan(Date value) {
            addCriterion("consume_time <", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeLessThanOrEqualTo(Date value) {
            addCriterion("consume_time <=", value, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeIn(List<Date> values) {
            addCriterion("consume_time in", values, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeNotIn(List<Date> values) {
            addCriterion("consume_time not in", values, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeBetween(Date value1, Date value2) {
            addCriterion("consume_time between", value1, value2, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andConsumeTimeNotBetween(Date value1, Date value2) {
            addCriterion("consume_time not between", value1, value2, "consumeTime");
            return (Criteria) this;
        }

        public Criteria andAllowRepeatIsNull() {
            addCriterion("allow_repeat is null");
            return (Criteria) this;
        }

        public Criteria andAllowRepeatIsNotNull() {
            addCriterion("allow_repeat is not null");
            return (Criteria) this;
        }

        public Criteria andAllowRepeatEqualTo(String value) {
            addCriterion("allow_repeat =", value, "allowRepeat");
            return (Criteria) this;
        }

        public Criteria andAllowRepeatNotEqualTo(String value) {
            addCriterion("allow_repeat <>", value, "allowRepeat");
            return (Criteria) this;
        }

        public Criteria andAllowRepeatGreaterThan(String value) {
            addCriterion("allow_repeat >", value, "allowRepeat");
            return (Criteria) this;
        }

        public Criteria andAllowRepeatGreaterThanOrEqualTo(String value) {
            addCriterion("allow_repeat >=", value, "allowRepeat");
            return (Criteria) this;
        }

        public Criteria andAllowRepeatLessThan(String value) {
            addCriterion("allow_repeat <", value, "allowRepeat");
            return (Criteria) this;
        }

        public Criteria andAllowRepeatLessThanOrEqualTo(String value) {
            addCriterion("allow_repeat <=", value, "allowRepeat");
            return (Criteria) this;
        }

        public Criteria andAllowRepeatLike(String value) {
            addCriterion("allow_repeat like", value, "allowRepeat");
            return (Criteria) this;
        }

        public Criteria andAllowRepeatNotLike(String value) {
            addCriterion("allow_repeat not like", value, "allowRepeat");
            return (Criteria) this;
        }

        public Criteria andAllowRepeatIn(List<String> values) {
            addCriterion("allow_repeat in", values, "allowRepeat");
            return (Criteria) this;
        }

        public Criteria andAllowRepeatNotIn(List<String> values) {
            addCriterion("allow_repeat not in", values, "allowRepeat");
            return (Criteria) this;
        }

        public Criteria andAllowRepeatBetween(String value1, String value2) {
            addCriterion("allow_repeat between", value1, value2, "allowRepeat");
            return (Criteria) this;
        }

        public Criteria andAllowRepeatNotBetween(String value1, String value2) {
            addCriterion("allow_repeat not between", value1, value2, "allowRepeat");
            return (Criteria) this;
        }

        public Criteria andRepeatCountIsNull() {
            addCriterion("repeat_count is null");
            return (Criteria) this;
        }

        public Criteria andRepeatCountIsNotNull() {
            addCriterion("repeat_count is not null");
            return (Criteria) this;
        }

        public Criteria andRepeatCountEqualTo(Integer value) {
            addCriterion("repeat_count =", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountNotEqualTo(Integer value) {
            addCriterion("repeat_count <>", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountGreaterThan(Integer value) {
            addCriterion("repeat_count >", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("repeat_count >=", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountLessThan(Integer value) {
            addCriterion("repeat_count <", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountLessThanOrEqualTo(Integer value) {
            addCriterion("repeat_count <=", value, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountIn(List<Integer> values) {
            addCriterion("repeat_count in", values, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountNotIn(List<Integer> values) {
            addCriterion("repeat_count not in", values, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountBetween(Integer value1, Integer value2) {
            addCriterion("repeat_count between", value1, value2, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andRepeatCountNotBetween(Integer value1, Integer value2) {
            addCriterion("repeat_count not between", value1, value2, "repeatCount");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusIsNull() {
            addCriterion("business_status is null");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusIsNotNull() {
            addCriterion("business_status is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusEqualTo(String value) {
            addCriterion("business_status =", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotEqualTo(String value) {
            addCriterion("business_status <>", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusGreaterThan(String value) {
            addCriterion("business_status >", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusGreaterThanOrEqualTo(String value) {
            addCriterion("business_status >=", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusLessThan(String value) {
            addCriterion("business_status <", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusLessThanOrEqualTo(String value) {
            addCriterion("business_status <=", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusLike(String value) {
            addCriterion("business_status like", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotLike(String value) {
            addCriterion("business_status not like", value, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusIn(List<String> values) {
            addCriterion("business_status in", values, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotIn(List<String> values) {
            addCriterion("business_status not in", values, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusBetween(String value1, String value2) {
            addCriterion("business_status between", value1, value2, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessStatusNotBetween(String value1, String value2) {
            addCriterion("business_status not between", value1, value2, "businessStatus");
            return (Criteria) this;
        }

        public Criteria andBusinessDescIsNull() {
            addCriterion("business_desc is null");
            return (Criteria) this;
        }

        public Criteria andBusinessDescIsNotNull() {
            addCriterion("business_desc is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessDescEqualTo(String value) {
            addCriterion("business_desc =", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescNotEqualTo(String value) {
            addCriterion("business_desc <>", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescGreaterThan(String value) {
            addCriterion("business_desc >", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescGreaterThanOrEqualTo(String value) {
            addCriterion("business_desc >=", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescLessThan(String value) {
            addCriterion("business_desc <", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescLessThanOrEqualTo(String value) {
            addCriterion("business_desc <=", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescLike(String value) {
            addCriterion("business_desc like", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescNotLike(String value) {
            addCriterion("business_desc not like", value, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescIn(List<String> values) {
            addCriterion("business_desc in", values, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescNotIn(List<String> values) {
            addCriterion("business_desc not in", values, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescBetween(String value1, String value2) {
            addCriterion("business_desc between", value1, value2, "businessDesc");
            return (Criteria) this;
        }

        public Criteria andBusinessDescNotBetween(String value1, String value2) {
            addCriterion("business_desc not between", value1, value2, "businessDesc");
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