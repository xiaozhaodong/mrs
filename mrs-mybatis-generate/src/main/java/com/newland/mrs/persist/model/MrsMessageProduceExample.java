package com.newland.mrs.persist.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class MrsMessageProduceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MrsMessageProduceExample() {
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

        public Criteria andMessageTypeIsNull() {
            addCriterion("message_type is null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIsNotNull() {
            addCriterion("message_type is not null");
            return (Criteria) this;
        }

        public Criteria andMessageTypeEqualTo(String value) {
            addCriterion("message_type =", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotEqualTo(String value) {
            addCriterion("message_type <>", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThan(String value) {
            addCriterion("message_type >", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeGreaterThanOrEqualTo(String value) {
            addCriterion("message_type >=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThan(String value) {
            addCriterion("message_type <", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLessThanOrEqualTo(String value) {
            addCriterion("message_type <=", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeLike(String value) {
            addCriterion("message_type like", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotLike(String value) {
            addCriterion("message_type not like", value, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeIn(List<String> values) {
            addCriterion("message_type in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotIn(List<String> values) {
            addCriterion("message_type not in", values, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeBetween(String value1, String value2) {
            addCriterion("message_type between", value1, value2, "messageType");
            return (Criteria) this;
        }

        public Criteria andMessageTypeNotBetween(String value1, String value2) {
            addCriterion("message_type not between", value1, value2, "messageType");
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

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andDelayLevelIsNull() {
            addCriterion("delay_level is null");
            return (Criteria) this;
        }

        public Criteria andDelayLevelIsNotNull() {
            addCriterion("delay_level is not null");
            return (Criteria) this;
        }

        public Criteria andDelayLevelEqualTo(Integer value) {
            addCriterion("delay_level =", value, "delayLevel");
            return (Criteria) this;
        }

        public Criteria andDelayLevelNotEqualTo(Integer value) {
            addCriterion("delay_level <>", value, "delayLevel");
            return (Criteria) this;
        }

        public Criteria andDelayLevelGreaterThan(Integer value) {
            addCriterion("delay_level >", value, "delayLevel");
            return (Criteria) this;
        }

        public Criteria andDelayLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("delay_level >=", value, "delayLevel");
            return (Criteria) this;
        }

        public Criteria andDelayLevelLessThan(Integer value) {
            addCriterion("delay_level <", value, "delayLevel");
            return (Criteria) this;
        }

        public Criteria andDelayLevelLessThanOrEqualTo(Integer value) {
            addCriterion("delay_level <=", value, "delayLevel");
            return (Criteria) this;
        }

        public Criteria andDelayLevelIn(List<Integer> values) {
            addCriterion("delay_level in", values, "delayLevel");
            return (Criteria) this;
        }

        public Criteria andDelayLevelNotIn(List<Integer> values) {
            addCriterion("delay_level not in", values, "delayLevel");
            return (Criteria) this;
        }

        public Criteria andDelayLevelBetween(Integer value1, Integer value2) {
            addCriterion("delay_level between", value1, value2, "delayLevel");
            return (Criteria) this;
        }

        public Criteria andDelayLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("delay_level not between", value1, value2, "delayLevel");
            return (Criteria) this;
        }

        public Criteria andTimingIsNull() {
            addCriterion("timing is null");
            return (Criteria) this;
        }

        public Criteria andTimingIsNotNull() {
            addCriterion("timing is not null");
            return (Criteria) this;
        }

        public Criteria andTimingEqualTo(Date value) {
            addCriterion("timing =", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingNotEqualTo(Date value) {
            addCriterion("timing <>", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingGreaterThan(Date value) {
            addCriterion("timing >", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingGreaterThanOrEqualTo(Date value) {
            addCriterion("timing >=", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingLessThan(Date value) {
            addCriterion("timing <", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingLessThanOrEqualTo(Date value) {
            addCriterion("timing <=", value, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingIn(List<Date> values) {
            addCriterion("timing in", values, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingNotIn(List<Date> values) {
            addCriterion("timing not in", values, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingBetween(Date value1, Date value2) {
            addCriterion("timing between", value1, value2, "timing");
            return (Criteria) this;
        }

        public Criteria andTimingNotBetween(Date value1, Date value2) {
            addCriterion("timing not between", value1, value2, "timing");
            return (Criteria) this;
        }

        public Criteria andSendResultIsNull() {
            addCriterion("send_result is null");
            return (Criteria) this;
        }

        public Criteria andSendResultIsNotNull() {
            addCriterion("send_result is not null");
            return (Criteria) this;
        }

        public Criteria andSendResultEqualTo(String value) {
            addCriterion("send_result =", value, "sendResult");
            return (Criteria) this;
        }

        public Criteria andSendResultNotEqualTo(String value) {
            addCriterion("send_result <>", value, "sendResult");
            return (Criteria) this;
        }

        public Criteria andSendResultGreaterThan(String value) {
            addCriterion("send_result >", value, "sendResult");
            return (Criteria) this;
        }

        public Criteria andSendResultGreaterThanOrEqualTo(String value) {
            addCriterion("send_result >=", value, "sendResult");
            return (Criteria) this;
        }

        public Criteria andSendResultLessThan(String value) {
            addCriterion("send_result <", value, "sendResult");
            return (Criteria) this;
        }

        public Criteria andSendResultLessThanOrEqualTo(String value) {
            addCriterion("send_result <=", value, "sendResult");
            return (Criteria) this;
        }

        public Criteria andSendResultLike(String value) {
            addCriterion("send_result like", value, "sendResult");
            return (Criteria) this;
        }

        public Criteria andSendResultNotLike(String value) {
            addCriterion("send_result not like", value, "sendResult");
            return (Criteria) this;
        }

        public Criteria andSendResultIn(List<String> values) {
            addCriterion("send_result in", values, "sendResult");
            return (Criteria) this;
        }

        public Criteria andSendResultNotIn(List<String> values) {
            addCriterion("send_result not in", values, "sendResult");
            return (Criteria) this;
        }

        public Criteria andSendResultBetween(String value1, String value2) {
            addCriterion("send_result between", value1, value2, "sendResult");
            return (Criteria) this;
        }

        public Criteria andSendResultNotBetween(String value1, String value2) {
            addCriterion("send_result not between", value1, value2, "sendResult");
            return (Criteria) this;
        }

        public Criteria andResultDescIsNull() {
            addCriterion("result_desc is null");
            return (Criteria) this;
        }

        public Criteria andResultDescIsNotNull() {
            addCriterion("result_desc is not null");
            return (Criteria) this;
        }

        public Criteria andResultDescEqualTo(String value) {
            addCriterion("result_desc =", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescNotEqualTo(String value) {
            addCriterion("result_desc <>", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescGreaterThan(String value) {
            addCriterion("result_desc >", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescGreaterThanOrEqualTo(String value) {
            addCriterion("result_desc >=", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescLessThan(String value) {
            addCriterion("result_desc <", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescLessThanOrEqualTo(String value) {
            addCriterion("result_desc <=", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescLike(String value) {
            addCriterion("result_desc like", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescNotLike(String value) {
            addCriterion("result_desc not like", value, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescIn(List<String> values) {
            addCriterion("result_desc in", values, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescNotIn(List<String> values) {
            addCriterion("result_desc not in", values, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescBetween(String value1, String value2) {
            addCriterion("result_desc between", value1, value2, "resultDesc");
            return (Criteria) this;
        }

        public Criteria andResultDescNotBetween(String value1, String value2) {
            addCriterion("result_desc not between", value1, value2, "resultDesc");
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