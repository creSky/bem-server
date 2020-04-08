package com.bem.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppPowerRecallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppPowerRecallExample() {
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNull() {
            addCriterion("APP_ID is null");
            return (Criteria) this;
        }

        public Criteria andAppIdIsNotNull() {
            addCriterion("APP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAppIdEqualTo(String value) {
            addCriterion("APP_ID =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(String value) {
            addCriterion("APP_ID <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(String value) {
            addCriterion("APP_ID >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(String value) {
            addCriterion("APP_ID >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(String value) {
            addCriterion("APP_ID <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(String value) {
            addCriterion("APP_ID <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLike(String value) {
            addCriterion("APP_ID like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotLike(String value) {
            addCriterion("APP_ID not like", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<String> values) {
            addCriterion("APP_ID in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<String> values) {
            addCriterion("APP_ID not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(String value1, String value2) {
            addCriterion("APP_ID between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(String value1, String value2) {
            addCriterion("APP_ID not between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNull() {
            addCriterion("TASK_ID is null");
            return (Criteria) this;
        }

        public Criteria andTaskIdIsNotNull() {
            addCriterion("TASK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTaskIdEqualTo(Integer value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Integer value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Integer value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Integer value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Integer value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Integer> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Integer> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNull() {
            addCriterion("PROCESS_INSTANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIsNotNull() {
            addCriterion("PROCESS_INSTANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdEqualTo(Long value) {
            addCriterion("PROCESS_INSTANCE_ID =", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotEqualTo(Long value) {
            addCriterion("PROCESS_INSTANCE_ID <>", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThan(Long value) {
            addCriterion("PROCESS_INSTANCE_ID >", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PROCESS_INSTANCE_ID >=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThan(Long value) {
            addCriterion("PROCESS_INSTANCE_ID <", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdLessThanOrEqualTo(Long value) {
            addCriterion("PROCESS_INSTANCE_ID <=", value, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdIn(List<Long> values) {
            addCriterion("PROCESS_INSTANCE_ID in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotIn(List<Long> values) {
            addCriterion("PROCESS_INSTANCE_ID not in", values, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdBetween(Long value1, Long value2) {
            addCriterion("PROCESS_INSTANCE_ID between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andProcessInstanceIdNotBetween(Long value1, Long value2) {
            addCriterion("PROCESS_INSTANCE_ID not between", value1, value2, "processInstanceId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("USER_ID =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("USER_ID <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("USER_ID >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("USER_ID >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("USER_ID <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("USER_ID <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("USER_ID in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("USER_ID not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("USER_ID between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("USER_ID not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNull() {
            addCriterion("USER_NO is null");
            return (Criteria) this;
        }

        public Criteria andUserNoIsNotNull() {
            addCriterion("USER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andUserNoEqualTo(String value) {
            addCriterion("USER_NO =", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotEqualTo(String value) {
            addCriterion("USER_NO <>", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThan(String value) {
            addCriterion("USER_NO >", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NO >=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThan(String value) {
            addCriterion("USER_NO <", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLessThanOrEqualTo(String value) {
            addCriterion("USER_NO <=", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoLike(String value) {
            addCriterion("USER_NO like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotLike(String value) {
            addCriterion("USER_NO not like", value, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoIn(List<String> values) {
            addCriterion("USER_NO in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotIn(List<String> values) {
            addCriterion("USER_NO not in", values, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoBetween(String value1, String value2) {
            addCriterion("USER_NO between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNoNotBetween(String value1, String value2) {
            addCriterion("USER_NO not between", value1, value2, "userNo");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("USER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("USER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("USER_NAME =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("USER_NAME <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("USER_NAME >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("USER_NAME >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("USER_NAME <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("USER_NAME <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("USER_NAME like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("USER_NAME not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("USER_NAME in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("USER_NAME not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("USER_NAME between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("USER_NAME not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andMeterIdIsNull() {
            addCriterion("METER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMeterIdIsNotNull() {
            addCriterion("METER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMeterIdEqualTo(Long value) {
            addCriterion("METER_ID =", value, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdNotEqualTo(Long value) {
            addCriterion("METER_ID <>", value, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdGreaterThan(Long value) {
            addCriterion("METER_ID >", value, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("METER_ID >=", value, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdLessThan(Long value) {
            addCriterion("METER_ID <", value, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdLessThanOrEqualTo(Long value) {
            addCriterion("METER_ID <=", value, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdIn(List<Long> values) {
            addCriterion("METER_ID in", values, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdNotIn(List<Long> values) {
            addCriterion("METER_ID not in", values, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdBetween(Long value1, Long value2) {
            addCriterion("METER_ID between", value1, value2, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdNotBetween(Long value1, Long value2) {
            addCriterion("METER_ID not between", value1, value2, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterNoIsNull() {
            addCriterion("METER_NO is null");
            return (Criteria) this;
        }

        public Criteria andMeterNoIsNotNull() {
            addCriterion("METER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMeterNoEqualTo(String value) {
            addCriterion("METER_NO =", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoNotEqualTo(String value) {
            addCriterion("METER_NO <>", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoGreaterThan(String value) {
            addCriterion("METER_NO >", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoGreaterThanOrEqualTo(String value) {
            addCriterion("METER_NO >=", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoLessThan(String value) {
            addCriterion("METER_NO <", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoLessThanOrEqualTo(String value) {
            addCriterion("METER_NO <=", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoLike(String value) {
            addCriterion("METER_NO like", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoNotLike(String value) {
            addCriterion("METER_NO not like", value, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoIn(List<String> values) {
            addCriterion("METER_NO in", values, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoNotIn(List<String> values) {
            addCriterion("METER_NO not in", values, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoBetween(String value1, String value2) {
            addCriterion("METER_NO between", value1, value2, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterNoNotBetween(String value1, String value2) {
            addCriterion("METER_NO not between", value1, value2, "meterNo");
            return (Criteria) this;
        }

        public Criteria andMeterOrderIsNull() {
            addCriterion("METER_ORDER is null");
            return (Criteria) this;
        }

        public Criteria andMeterOrderIsNotNull() {
            addCriterion("METER_ORDER is not null");
            return (Criteria) this;
        }

        public Criteria andMeterOrderEqualTo(Integer value) {
            addCriterion("METER_ORDER =", value, "meterOrder");
            return (Criteria) this;
        }

        public Criteria andMeterOrderNotEqualTo(Integer value) {
            addCriterion("METER_ORDER <>", value, "meterOrder");
            return (Criteria) this;
        }

        public Criteria andMeterOrderGreaterThan(Integer value) {
            addCriterion("METER_ORDER >", value, "meterOrder");
            return (Criteria) this;
        }

        public Criteria andMeterOrderGreaterThanOrEqualTo(Integer value) {
            addCriterion("METER_ORDER >=", value, "meterOrder");
            return (Criteria) this;
        }

        public Criteria andMeterOrderLessThan(Integer value) {
            addCriterion("METER_ORDER <", value, "meterOrder");
            return (Criteria) this;
        }

        public Criteria andMeterOrderLessThanOrEqualTo(Integer value) {
            addCriterion("METER_ORDER <=", value, "meterOrder");
            return (Criteria) this;
        }

        public Criteria andMeterOrderIn(List<Integer> values) {
            addCriterion("METER_ORDER in", values, "meterOrder");
            return (Criteria) this;
        }

        public Criteria andMeterOrderNotIn(List<Integer> values) {
            addCriterion("METER_ORDER not in", values, "meterOrder");
            return (Criteria) this;
        }

        public Criteria andMeterOrderBetween(Integer value1, Integer value2) {
            addCriterion("METER_ORDER between", value1, value2, "meterOrder");
            return (Criteria) this;
        }

        public Criteria andMeterOrderNotBetween(Integer value1, Integer value2) {
            addCriterion("METER_ORDER not between", value1, value2, "meterOrder");
            return (Criteria) this;
        }

        public Criteria andMeterNameIsNull() {
            addCriterion("METER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andMeterNameIsNotNull() {
            addCriterion("METER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andMeterNameEqualTo(String value) {
            addCriterion("METER_NAME =", value, "meterName");
            return (Criteria) this;
        }

        public Criteria andMeterNameNotEqualTo(String value) {
            addCriterion("METER_NAME <>", value, "meterName");
            return (Criteria) this;
        }

        public Criteria andMeterNameGreaterThan(String value) {
            addCriterion("METER_NAME >", value, "meterName");
            return (Criteria) this;
        }

        public Criteria andMeterNameGreaterThanOrEqualTo(String value) {
            addCriterion("METER_NAME >=", value, "meterName");
            return (Criteria) this;
        }

        public Criteria andMeterNameLessThan(String value) {
            addCriterion("METER_NAME <", value, "meterName");
            return (Criteria) this;
        }

        public Criteria andMeterNameLessThanOrEqualTo(String value) {
            addCriterion("METER_NAME <=", value, "meterName");
            return (Criteria) this;
        }

        public Criteria andMeterNameLike(String value) {
            addCriterion("METER_NAME like", value, "meterName");
            return (Criteria) this;
        }

        public Criteria andMeterNameNotLike(String value) {
            addCriterion("METER_NAME not like", value, "meterName");
            return (Criteria) this;
        }

        public Criteria andMeterNameIn(List<String> values) {
            addCriterion("METER_NAME in", values, "meterName");
            return (Criteria) this;
        }

        public Criteria andMeterNameNotIn(List<String> values) {
            addCriterion("METER_NAME not in", values, "meterName");
            return (Criteria) this;
        }

        public Criteria andMeterNameBetween(String value1, String value2) {
            addCriterion("METER_NAME between", value1, value2, "meterName");
            return (Criteria) this;
        }

        public Criteria andMeterNameNotBetween(String value1, String value2) {
            addCriterion("METER_NAME not between", value1, value2, "meterName");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdIsNull() {
            addCriterion("WRITE_SECTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdIsNotNull() {
            addCriterion("WRITE_SECTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdEqualTo(Integer value) {
            addCriterion("WRITE_SECTION_ID =", value, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdNotEqualTo(Integer value) {
            addCriterion("WRITE_SECTION_ID <>", value, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdGreaterThan(Integer value) {
            addCriterion("WRITE_SECTION_ID >", value, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("WRITE_SECTION_ID >=", value, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdLessThan(Integer value) {
            addCriterion("WRITE_SECTION_ID <", value, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("WRITE_SECTION_ID <=", value, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdIn(List<Integer> values) {
            addCriterion("WRITE_SECTION_ID in", values, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdNotIn(List<Integer> values) {
            addCriterion("WRITE_SECTION_ID not in", values, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdBetween(Integer value1, Integer value2) {
            addCriterion("WRITE_SECTION_ID between", value1, value2, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("WRITE_SECTION_ID not between", value1, value2, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectNameIsNull() {
            addCriterion("WRITE_SECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andWriteSectNameIsNotNull() {
            addCriterion("WRITE_SECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andWriteSectNameEqualTo(String value) {
            addCriterion("WRITE_SECT_NAME =", value, "writeSectName");
            return (Criteria) this;
        }

        public Criteria andWriteSectNameNotEqualTo(String value) {
            addCriterion("WRITE_SECT_NAME <>", value, "writeSectName");
            return (Criteria) this;
        }

        public Criteria andWriteSectNameGreaterThan(String value) {
            addCriterion("WRITE_SECT_NAME >", value, "writeSectName");
            return (Criteria) this;
        }

        public Criteria andWriteSectNameGreaterThanOrEqualTo(String value) {
            addCriterion("WRITE_SECT_NAME >=", value, "writeSectName");
            return (Criteria) this;
        }

        public Criteria andWriteSectNameLessThan(String value) {
            addCriterion("WRITE_SECT_NAME <", value, "writeSectName");
            return (Criteria) this;
        }

        public Criteria andWriteSectNameLessThanOrEqualTo(String value) {
            addCriterion("WRITE_SECT_NAME <=", value, "writeSectName");
            return (Criteria) this;
        }

        public Criteria andWriteSectNameLike(String value) {
            addCriterion("WRITE_SECT_NAME like", value, "writeSectName");
            return (Criteria) this;
        }

        public Criteria andWriteSectNameNotLike(String value) {
            addCriterion("WRITE_SECT_NAME not like", value, "writeSectName");
            return (Criteria) this;
        }

        public Criteria andWriteSectNameIn(List<String> values) {
            addCriterion("WRITE_SECT_NAME in", values, "writeSectName");
            return (Criteria) this;
        }

        public Criteria andWriteSectNameNotIn(List<String> values) {
            addCriterion("WRITE_SECT_NAME not in", values, "writeSectName");
            return (Criteria) this;
        }

        public Criteria andWriteSectNameBetween(String value1, String value2) {
            addCriterion("WRITE_SECT_NAME between", value1, value2, "writeSectName");
            return (Criteria) this;
        }

        public Criteria andWriteSectNameNotBetween(String value1, String value2) {
            addCriterion("WRITE_SECT_NAME not between", value1, value2, "writeSectName");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsIdIsNull() {
            addCriterion("METER_ASSETS_ID is null");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsIdIsNotNull() {
            addCriterion("METER_ASSETS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsIdEqualTo(Long value) {
            addCriterion("METER_ASSETS_ID =", value, "meterAssetsId");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsIdNotEqualTo(Long value) {
            addCriterion("METER_ASSETS_ID <>", value, "meterAssetsId");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsIdGreaterThan(Long value) {
            addCriterion("METER_ASSETS_ID >", value, "meterAssetsId");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("METER_ASSETS_ID >=", value, "meterAssetsId");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsIdLessThan(Long value) {
            addCriterion("METER_ASSETS_ID <", value, "meterAssetsId");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsIdLessThanOrEqualTo(Long value) {
            addCriterion("METER_ASSETS_ID <=", value, "meterAssetsId");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsIdIn(List<Long> values) {
            addCriterion("METER_ASSETS_ID in", values, "meterAssetsId");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsIdNotIn(List<Long> values) {
            addCriterion("METER_ASSETS_ID not in", values, "meterAssetsId");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsIdBetween(Long value1, Long value2) {
            addCriterion("METER_ASSETS_ID between", value1, value2, "meterAssetsId");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsIdNotBetween(Long value1, Long value2) {
            addCriterion("METER_ASSETS_ID not between", value1, value2, "meterAssetsId");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsNoIsNull() {
            addCriterion("METER_ASSETS_NO is null");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsNoIsNotNull() {
            addCriterion("METER_ASSETS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsNoEqualTo(String value) {
            addCriterion("METER_ASSETS_NO =", value, "meterAssetsNo");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsNoNotEqualTo(String value) {
            addCriterion("METER_ASSETS_NO <>", value, "meterAssetsNo");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsNoGreaterThan(String value) {
            addCriterion("METER_ASSETS_NO >", value, "meterAssetsNo");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsNoGreaterThanOrEqualTo(String value) {
            addCriterion("METER_ASSETS_NO >=", value, "meterAssetsNo");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsNoLessThan(String value) {
            addCriterion("METER_ASSETS_NO <", value, "meterAssetsNo");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsNoLessThanOrEqualTo(String value) {
            addCriterion("METER_ASSETS_NO <=", value, "meterAssetsNo");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsNoLike(String value) {
            addCriterion("METER_ASSETS_NO like", value, "meterAssetsNo");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsNoNotLike(String value) {
            addCriterion("METER_ASSETS_NO not like", value, "meterAssetsNo");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsNoIn(List<String> values) {
            addCriterion("METER_ASSETS_NO in", values, "meterAssetsNo");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsNoNotIn(List<String> values) {
            addCriterion("METER_ASSETS_NO not in", values, "meterAssetsNo");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsNoBetween(String value1, String value2) {
            addCriterion("METER_ASSETS_NO between", value1, value2, "meterAssetsNo");
            return (Criteria) this;
        }

        public Criteria andMeterAssetsNoNotBetween(String value1, String value2) {
            addCriterion("METER_ASSETS_NO not between", value1, value2, "meterAssetsNo");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNull() {
            addCriterion("FUNCTION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNotNull() {
            addCriterion("FUNCTION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeEqualTo(Integer value) {
            addCriterion("FUNCTION_CODE =", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotEqualTo(Integer value) {
            addCriterion("FUNCTION_CODE <>", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThan(Integer value) {
            addCriterion("FUNCTION_CODE >", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("FUNCTION_CODE >=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThan(Integer value) {
            addCriterion("FUNCTION_CODE <", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThanOrEqualTo(Integer value) {
            addCriterion("FUNCTION_CODE <=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIn(List<Integer> values) {
            addCriterion("FUNCTION_CODE in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotIn(List<Integer> values) {
            addCriterion("FUNCTION_CODE not in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeBetween(Integer value1, Integer value2) {
            addCriterion("FUNCTION_CODE between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("FUNCTION_CODE not between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andReasonCodeIsNull() {
            addCriterion("REASON_CODE is null");
            return (Criteria) this;
        }

        public Criteria andReasonCodeIsNotNull() {
            addCriterion("REASON_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andReasonCodeEqualTo(Integer value) {
            addCriterion("REASON_CODE =", value, "reasonCode");
            return (Criteria) this;
        }

        public Criteria andReasonCodeNotEqualTo(Integer value) {
            addCriterion("REASON_CODE <>", value, "reasonCode");
            return (Criteria) this;
        }

        public Criteria andReasonCodeGreaterThan(Integer value) {
            addCriterion("REASON_CODE >", value, "reasonCode");
            return (Criteria) this;
        }

        public Criteria andReasonCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("REASON_CODE >=", value, "reasonCode");
            return (Criteria) this;
        }

        public Criteria andReasonCodeLessThan(Integer value) {
            addCriterion("REASON_CODE <", value, "reasonCode");
            return (Criteria) this;
        }

        public Criteria andReasonCodeLessThanOrEqualTo(Integer value) {
            addCriterion("REASON_CODE <=", value, "reasonCode");
            return (Criteria) this;
        }

        public Criteria andReasonCodeIn(List<Integer> values) {
            addCriterion("REASON_CODE in", values, "reasonCode");
            return (Criteria) this;
        }

        public Criteria andReasonCodeNotIn(List<Integer> values) {
            addCriterion("REASON_CODE not in", values, "reasonCode");
            return (Criteria) this;
        }

        public Criteria andReasonCodeBetween(Integer value1, Integer value2) {
            addCriterion("REASON_CODE between", value1, value2, "reasonCode");
            return (Criteria) this;
        }

        public Criteria andReasonCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("REASON_CODE not between", value1, value2, "reasonCode");
            return (Criteria) this;
        }

        public Criteria andRpMonIsNull() {
            addCriterion("RP_MON is null");
            return (Criteria) this;
        }

        public Criteria andRpMonIsNotNull() {
            addCriterion("RP_MON is not null");
            return (Criteria) this;
        }

        public Criteria andRpMonEqualTo(Integer value) {
            addCriterion("RP_MON =", value, "rpMon");
            return (Criteria) this;
        }

        public Criteria andRpMonNotEqualTo(Integer value) {
            addCriterion("RP_MON <>", value, "rpMon");
            return (Criteria) this;
        }

        public Criteria andRpMonGreaterThan(Integer value) {
            addCriterion("RP_MON >", value, "rpMon");
            return (Criteria) this;
        }

        public Criteria andRpMonGreaterThanOrEqualTo(Integer value) {
            addCriterion("RP_MON >=", value, "rpMon");
            return (Criteria) this;
        }

        public Criteria andRpMonLessThan(Integer value) {
            addCriterion("RP_MON <", value, "rpMon");
            return (Criteria) this;
        }

        public Criteria andRpMonLessThanOrEqualTo(Integer value) {
            addCriterion("RP_MON <=", value, "rpMon");
            return (Criteria) this;
        }

        public Criteria andRpMonIn(List<Integer> values) {
            addCriterion("RP_MON in", values, "rpMon");
            return (Criteria) this;
        }

        public Criteria andRpMonNotIn(List<Integer> values) {
            addCriterion("RP_MON not in", values, "rpMon");
            return (Criteria) this;
        }

        public Criteria andRpMonBetween(Integer value1, Integer value2) {
            addCriterion("RP_MON between", value1, value2, "rpMon");
            return (Criteria) this;
        }

        public Criteria andRpMonNotBetween(Integer value1, Integer value2) {
            addCriterion("RP_MON not between", value1, value2, "rpMon");
            return (Criteria) this;
        }

        public Criteria andShdAddPowerIsNull() {
            addCriterion("SHD_ADD_POWER is null");
            return (Criteria) this;
        }

        public Criteria andShdAddPowerIsNotNull() {
            addCriterion("SHD_ADD_POWER is not null");
            return (Criteria) this;
        }

        public Criteria andShdAddPowerEqualTo(BigDecimal value) {
            addCriterion("SHD_ADD_POWER =", value, "shdAddPower");
            return (Criteria) this;
        }

        public Criteria andShdAddPowerNotEqualTo(BigDecimal value) {
            addCriterion("SHD_ADD_POWER <>", value, "shdAddPower");
            return (Criteria) this;
        }

        public Criteria andShdAddPowerGreaterThan(BigDecimal value) {
            addCriterion("SHD_ADD_POWER >", value, "shdAddPower");
            return (Criteria) this;
        }

        public Criteria andShdAddPowerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SHD_ADD_POWER >=", value, "shdAddPower");
            return (Criteria) this;
        }

        public Criteria andShdAddPowerLessThan(BigDecimal value) {
            addCriterion("SHD_ADD_POWER <", value, "shdAddPower");
            return (Criteria) this;
        }

        public Criteria andShdAddPowerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SHD_ADD_POWER <=", value, "shdAddPower");
            return (Criteria) this;
        }

        public Criteria andShdAddPowerIn(List<BigDecimal> values) {
            addCriterion("SHD_ADD_POWER in", values, "shdAddPower");
            return (Criteria) this;
        }

        public Criteria andShdAddPowerNotIn(List<BigDecimal> values) {
            addCriterion("SHD_ADD_POWER not in", values, "shdAddPower");
            return (Criteria) this;
        }

        public Criteria andShdAddPowerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHD_ADD_POWER between", value1, value2, "shdAddPower");
            return (Criteria) this;
        }

        public Criteria andShdAddPowerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SHD_ADD_POWER not between", value1, value2, "shdAddPower");
            return (Criteria) this;
        }

        public Criteria andIsLinelostIsNull() {
            addCriterion("IS_LINELOST is null");
            return (Criteria) this;
        }

        public Criteria andIsLinelostIsNotNull() {
            addCriterion("IS_LINELOST is not null");
            return (Criteria) this;
        }

        public Criteria andIsLinelostEqualTo(Integer value) {
            addCriterion("IS_LINELOST =", value, "isLinelost");
            return (Criteria) this;
        }

        public Criteria andIsLinelostNotEqualTo(Integer value) {
            addCriterion("IS_LINELOST <>", value, "isLinelost");
            return (Criteria) this;
        }

        public Criteria andIsLinelostGreaterThan(Integer value) {
            addCriterion("IS_LINELOST >", value, "isLinelost");
            return (Criteria) this;
        }

        public Criteria andIsLinelostGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_LINELOST >=", value, "isLinelost");
            return (Criteria) this;
        }

        public Criteria andIsLinelostLessThan(Integer value) {
            addCriterion("IS_LINELOST <", value, "isLinelost");
            return (Criteria) this;
        }

        public Criteria andIsLinelostLessThanOrEqualTo(Integer value) {
            addCriterion("IS_LINELOST <=", value, "isLinelost");
            return (Criteria) this;
        }

        public Criteria andIsLinelostIn(List<Integer> values) {
            addCriterion("IS_LINELOST in", values, "isLinelost");
            return (Criteria) this;
        }

        public Criteria andIsLinelostNotIn(List<Integer> values) {
            addCriterion("IS_LINELOST not in", values, "isLinelost");
            return (Criteria) this;
        }

        public Criteria andIsLinelostBetween(Integer value1, Integer value2) {
            addCriterion("IS_LINELOST between", value1, value2, "isLinelost");
            return (Criteria) this;
        }

        public Criteria andIsLinelostNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_LINELOST not between", value1, value2, "isLinelost");
            return (Criteria) this;
        }

        public Criteria andTsFlagIsNull() {
            addCriterion("TS_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTsFlagIsNotNull() {
            addCriterion("TS_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTsFlagEqualTo(Integer value) {
            addCriterion("TS_FLAG =", value, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagNotEqualTo(Integer value) {
            addCriterion("TS_FLAG <>", value, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagGreaterThan(Integer value) {
            addCriterion("TS_FLAG >", value, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("TS_FLAG >=", value, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagLessThan(Integer value) {
            addCriterion("TS_FLAG <", value, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagLessThanOrEqualTo(Integer value) {
            addCriterion("TS_FLAG <=", value, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagIn(List<Integer> values) {
            addCriterion("TS_FLAG in", values, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagNotIn(List<Integer> values) {
            addCriterion("TS_FLAG not in", values, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagBetween(Integer value1, Integer value2) {
            addCriterion("TS_FLAG between", value1, value2, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("TS_FLAG not between", value1, value2, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andIsCosIsNull() {
            addCriterion("IS_COS is null");
            return (Criteria) this;
        }

        public Criteria andIsCosIsNotNull() {
            addCriterion("IS_COS is not null");
            return (Criteria) this;
        }

        public Criteria andIsCosEqualTo(Integer value) {
            addCriterion("IS_COS =", value, "isCos");
            return (Criteria) this;
        }

        public Criteria andIsCosNotEqualTo(Integer value) {
            addCriterion("IS_COS <>", value, "isCos");
            return (Criteria) this;
        }

        public Criteria andIsCosGreaterThan(Integer value) {
            addCriterion("IS_COS >", value, "isCos");
            return (Criteria) this;
        }

        public Criteria andIsCosGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_COS >=", value, "isCos");
            return (Criteria) this;
        }

        public Criteria andIsCosLessThan(Integer value) {
            addCriterion("IS_COS <", value, "isCos");
            return (Criteria) this;
        }

        public Criteria andIsCosLessThanOrEqualTo(Integer value) {
            addCriterion("IS_COS <=", value, "isCos");
            return (Criteria) this;
        }

        public Criteria andIsCosIn(List<Integer> values) {
            addCriterion("IS_COS in", values, "isCos");
            return (Criteria) this;
        }

        public Criteria andIsCosNotIn(List<Integer> values) {
            addCriterion("IS_COS not in", values, "isCos");
            return (Criteria) this;
        }

        public Criteria andIsCosBetween(Integer value1, Integer value2) {
            addCriterion("IS_COS between", value1, value2, "isCos");
            return (Criteria) this;
        }

        public Criteria andIsCosNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_COS not between", value1, value2, "isCos");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIsNull() {
            addCriterion("APPLY_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIsNotNull() {
            addCriterion("APPLY_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andApplyPersonEqualTo(String value) {
            addCriterion("APPLY_PERSON =", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotEqualTo(String value) {
            addCriterion("APPLY_PERSON <>", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonGreaterThan(String value) {
            addCriterion("APPLY_PERSON >", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_PERSON >=", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonLessThan(String value) {
            addCriterion("APPLY_PERSON <", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonLessThanOrEqualTo(String value) {
            addCriterion("APPLY_PERSON <=", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonLike(String value) {
            addCriterion("APPLY_PERSON like", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotLike(String value) {
            addCriterion("APPLY_PERSON not like", value, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonIn(List<String> values) {
            addCriterion("APPLY_PERSON in", values, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotIn(List<String> values) {
            addCriterion("APPLY_PERSON not in", values, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonBetween(String value1, String value2) {
            addCriterion("APPLY_PERSON between", value1, value2, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyPersonNotBetween(String value1, String value2) {
            addCriterion("APPLY_PERSON not between", value1, value2, "applyPerson");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNull() {
            addCriterion("APPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andApplyDateIsNotNull() {
            addCriterion("APPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andApplyDateEqualTo(Date value) {
            addCriterion("APPLY_DATE =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterion("APPLY_DATE <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterion("APPLY_DATE >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("APPLY_DATE >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterion("APPLY_DATE <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterion("APPLY_DATE <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterion("APPLY_DATE in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterion("APPLY_DATE not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterion("APPLY_DATE between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterion("APPLY_DATE not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIsNull() {
            addCriterion("APPLY_REASON is null");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIsNotNull() {
            addCriterion("APPLY_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andApplyReasonEqualTo(String value) {
            addCriterion("APPLY_REASON =", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotEqualTo(String value) {
            addCriterion("APPLY_REASON <>", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonGreaterThan(String value) {
            addCriterion("APPLY_REASON >", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonGreaterThanOrEqualTo(String value) {
            addCriterion("APPLY_REASON >=", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLessThan(String value) {
            addCriterion("APPLY_REASON <", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLessThanOrEqualTo(String value) {
            addCriterion("APPLY_REASON <=", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonLike(String value) {
            addCriterion("APPLY_REASON like", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotLike(String value) {
            addCriterion("APPLY_REASON not like", value, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonIn(List<String> values) {
            addCriterion("APPLY_REASON in", values, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotIn(List<String> values) {
            addCriterion("APPLY_REASON not in", values, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonBetween(String value1, String value2) {
            addCriterion("APPLY_REASON between", value1, value2, "applyReason");
            return (Criteria) this;
        }

        public Criteria andApplyReasonNotBetween(String value1, String value2) {
            addCriterion("APPLY_REASON not between", value1, value2, "applyReason");
            return (Criteria) this;
        }

        public Criteria andPassPersonIsNull() {
            addCriterion("PASS_PERSON is null");
            return (Criteria) this;
        }

        public Criteria andPassPersonIsNotNull() {
            addCriterion("PASS_PERSON is not null");
            return (Criteria) this;
        }

        public Criteria andPassPersonEqualTo(String value) {
            addCriterion("PASS_PERSON =", value, "passPerson");
            return (Criteria) this;
        }

        public Criteria andPassPersonNotEqualTo(String value) {
            addCriterion("PASS_PERSON <>", value, "passPerson");
            return (Criteria) this;
        }

        public Criteria andPassPersonGreaterThan(String value) {
            addCriterion("PASS_PERSON >", value, "passPerson");
            return (Criteria) this;
        }

        public Criteria andPassPersonGreaterThanOrEqualTo(String value) {
            addCriterion("PASS_PERSON >=", value, "passPerson");
            return (Criteria) this;
        }

        public Criteria andPassPersonLessThan(String value) {
            addCriterion("PASS_PERSON <", value, "passPerson");
            return (Criteria) this;
        }

        public Criteria andPassPersonLessThanOrEqualTo(String value) {
            addCriterion("PASS_PERSON <=", value, "passPerson");
            return (Criteria) this;
        }

        public Criteria andPassPersonLike(String value) {
            addCriterion("PASS_PERSON like", value, "passPerson");
            return (Criteria) this;
        }

        public Criteria andPassPersonNotLike(String value) {
            addCriterion("PASS_PERSON not like", value, "passPerson");
            return (Criteria) this;
        }

        public Criteria andPassPersonIn(List<String> values) {
            addCriterion("PASS_PERSON in", values, "passPerson");
            return (Criteria) this;
        }

        public Criteria andPassPersonNotIn(List<String> values) {
            addCriterion("PASS_PERSON not in", values, "passPerson");
            return (Criteria) this;
        }

        public Criteria andPassPersonBetween(String value1, String value2) {
            addCriterion("PASS_PERSON between", value1, value2, "passPerson");
            return (Criteria) this;
        }

        public Criteria andPassPersonNotBetween(String value1, String value2) {
            addCriterion("PASS_PERSON not between", value1, value2, "passPerson");
            return (Criteria) this;
        }

        public Criteria andPassDateIsNull() {
            addCriterion("PASS_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPassDateIsNotNull() {
            addCriterion("PASS_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPassDateEqualTo(Date value) {
            addCriterion("PASS_DATE =", value, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateNotEqualTo(Date value) {
            addCriterion("PASS_DATE <>", value, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateGreaterThan(Date value) {
            addCriterion("PASS_DATE >", value, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateGreaterThanOrEqualTo(Date value) {
            addCriterion("PASS_DATE >=", value, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateLessThan(Date value) {
            addCriterion("PASS_DATE <", value, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateLessThanOrEqualTo(Date value) {
            addCriterion("PASS_DATE <=", value, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateIn(List<Date> values) {
            addCriterion("PASS_DATE in", values, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateNotIn(List<Date> values) {
            addCriterion("PASS_DATE not in", values, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateBetween(Date value1, Date value2) {
            addCriterion("PASS_DATE between", value1, value2, "passDate");
            return (Criteria) this;
        }

        public Criteria andPassDateNotBetween(Date value1, Date value2) {
            addCriterion("PASS_DATE not between", value1, value2, "passDate");
            return (Criteria) this;
        }

        public Criteria andMonIsNull() {
            addCriterion("MON is null");
            return (Criteria) this;
        }

        public Criteria andMonIsNotNull() {
            addCriterion("MON is not null");
            return (Criteria) this;
        }

        public Criteria andMonEqualTo(Integer value) {
            addCriterion("MON =", value, "mon");
            return (Criteria) this;
        }

        public Criteria andMonNotEqualTo(Integer value) {
            addCriterion("MON <>", value, "mon");
            return (Criteria) this;
        }

        public Criteria andMonGreaterThan(Integer value) {
            addCriterion("MON >", value, "mon");
            return (Criteria) this;
        }

        public Criteria andMonGreaterThanOrEqualTo(Integer value) {
            addCriterion("MON >=", value, "mon");
            return (Criteria) this;
        }

        public Criteria andMonLessThan(Integer value) {
            addCriterion("MON <", value, "mon");
            return (Criteria) this;
        }

        public Criteria andMonLessThanOrEqualTo(Integer value) {
            addCriterion("MON <=", value, "mon");
            return (Criteria) this;
        }

        public Criteria andMonIn(List<Integer> values) {
            addCriterion("MON in", values, "mon");
            return (Criteria) this;
        }

        public Criteria andMonNotIn(List<Integer> values) {
            addCriterion("MON not in", values, "mon");
            return (Criteria) this;
        }

        public Criteria andMonBetween(Integer value1, Integer value2) {
            addCriterion("MON between", value1, value2, "mon");
            return (Criteria) this;
        }

        public Criteria andMonNotBetween(Integer value1, Integer value2) {
            addCriterion("MON not between", value1, value2, "mon");
            return (Criteria) this;
        }

        public Criteria andMonSnIsNull() {
            addCriterion("MON_SN is null");
            return (Criteria) this;
        }

        public Criteria andMonSnIsNotNull() {
            addCriterion("MON_SN is not null");
            return (Criteria) this;
        }

        public Criteria andMonSnEqualTo(Short value) {
            addCriterion("MON_SN =", value, "monSn");
            return (Criteria) this;
        }

        public Criteria andMonSnNotEqualTo(Short value) {
            addCriterion("MON_SN <>", value, "monSn");
            return (Criteria) this;
        }

        public Criteria andMonSnGreaterThan(Short value) {
            addCriterion("MON_SN >", value, "monSn");
            return (Criteria) this;
        }

        public Criteria andMonSnGreaterThanOrEqualTo(Short value) {
            addCriterion("MON_SN >=", value, "monSn");
            return (Criteria) this;
        }

        public Criteria andMonSnLessThan(Short value) {
            addCriterion("MON_SN <", value, "monSn");
            return (Criteria) this;
        }

        public Criteria andMonSnLessThanOrEqualTo(Short value) {
            addCriterion("MON_SN <=", value, "monSn");
            return (Criteria) this;
        }

        public Criteria andMonSnIn(List<Short> values) {
            addCriterion("MON_SN in", values, "monSn");
            return (Criteria) this;
        }

        public Criteria andMonSnNotIn(List<Short> values) {
            addCriterion("MON_SN not in", values, "monSn");
            return (Criteria) this;
        }

        public Criteria andMonSnBetween(Short value1, Short value2) {
            addCriterion("MON_SN between", value1, value2, "monSn");
            return (Criteria) this;
        }

        public Criteria andMonSnNotBetween(Short value1, Short value2) {
            addCriterion("MON_SN not between", value1, value2, "monSn");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower1IsNull() {
            addCriterion("ACTIVE_WRITE_POWER_1 is null");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower1IsNotNull() {
            addCriterion("ACTIVE_WRITE_POWER_1 is not null");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower1EqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_1 =", value, "activeWritePower1");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower1NotEqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_1 <>", value, "activeWritePower1");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower1GreaterThan(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_1 >", value, "activeWritePower1");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_1 >=", value, "activeWritePower1");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower1LessThan(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_1 <", value, "activeWritePower1");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_1 <=", value, "activeWritePower1");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower1In(List<BigDecimal> values) {
            addCriterion("ACTIVE_WRITE_POWER_1 in", values, "activeWritePower1");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower1NotIn(List<BigDecimal> values) {
            addCriterion("ACTIVE_WRITE_POWER_1 not in", values, "activeWritePower1");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTIVE_WRITE_POWER_1 between", value1, value2, "activeWritePower1");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTIVE_WRITE_POWER_1 not between", value1, value2, "activeWritePower1");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower2IsNull() {
            addCriterion("ACTIVE_WRITE_POWER_2 is null");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower2IsNotNull() {
            addCriterion("ACTIVE_WRITE_POWER_2 is not null");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower2EqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_2 =", value, "activeWritePower2");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower2NotEqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_2 <>", value, "activeWritePower2");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower2GreaterThan(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_2 >", value, "activeWritePower2");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_2 >=", value, "activeWritePower2");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower2LessThan(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_2 <", value, "activeWritePower2");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_2 <=", value, "activeWritePower2");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower2In(List<BigDecimal> values) {
            addCriterion("ACTIVE_WRITE_POWER_2 in", values, "activeWritePower2");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower2NotIn(List<BigDecimal> values) {
            addCriterion("ACTIVE_WRITE_POWER_2 not in", values, "activeWritePower2");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTIVE_WRITE_POWER_2 between", value1, value2, "activeWritePower2");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTIVE_WRITE_POWER_2 not between", value1, value2, "activeWritePower2");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower3IsNull() {
            addCriterion("ACTIVE_WRITE_POWER_3 is null");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower3IsNotNull() {
            addCriterion("ACTIVE_WRITE_POWER_3 is not null");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower3EqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_3 =", value, "activeWritePower3");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower3NotEqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_3 <>", value, "activeWritePower3");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower3GreaterThan(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_3 >", value, "activeWritePower3");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_3 >=", value, "activeWritePower3");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower3LessThan(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_3 <", value, "activeWritePower3");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_3 <=", value, "activeWritePower3");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower3In(List<BigDecimal> values) {
            addCriterion("ACTIVE_WRITE_POWER_3 in", values, "activeWritePower3");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower3NotIn(List<BigDecimal> values) {
            addCriterion("ACTIVE_WRITE_POWER_3 not in", values, "activeWritePower3");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTIVE_WRITE_POWER_3 between", value1, value2, "activeWritePower3");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTIVE_WRITE_POWER_3 not between", value1, value2, "activeWritePower3");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower4IsNull() {
            addCriterion("ACTIVE_WRITE_POWER_4 is null");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower4IsNotNull() {
            addCriterion("ACTIVE_WRITE_POWER_4 is not null");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower4EqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_4 =", value, "activeWritePower4");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower4NotEqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_4 <>", value, "activeWritePower4");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower4GreaterThan(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_4 >", value, "activeWritePower4");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_4 >=", value, "activeWritePower4");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower4LessThan(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_4 <", value, "activeWritePower4");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ACTIVE_WRITE_POWER_4 <=", value, "activeWritePower4");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower4In(List<BigDecimal> values) {
            addCriterion("ACTIVE_WRITE_POWER_4 in", values, "activeWritePower4");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower4NotIn(List<BigDecimal> values) {
            addCriterion("ACTIVE_WRITE_POWER_4 not in", values, "activeWritePower4");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTIVE_WRITE_POWER_4 between", value1, value2, "activeWritePower4");
            return (Criteria) this;
        }

        public Criteria andActiveWritePower4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ACTIVE_WRITE_POWER_4 not between", value1, value2, "activeWritePower4");
            return (Criteria) this;
        }

        public Criteria andPowerDirectionIsNull() {
            addCriterion("POWER_DIRECTION is null");
            return (Criteria) this;
        }

        public Criteria andPowerDirectionIsNotNull() {
            addCriterion("POWER_DIRECTION is not null");
            return (Criteria) this;
        }

        public Criteria andPowerDirectionEqualTo(Integer value) {
            addCriterion("POWER_DIRECTION =", value, "powerDirection");
            return (Criteria) this;
        }

        public Criteria andPowerDirectionNotEqualTo(Integer value) {
            addCriterion("POWER_DIRECTION <>", value, "powerDirection");
            return (Criteria) this;
        }

        public Criteria andPowerDirectionGreaterThan(Integer value) {
            addCriterion("POWER_DIRECTION >", value, "powerDirection");
            return (Criteria) this;
        }

        public Criteria andPowerDirectionGreaterThanOrEqualTo(Integer value) {
            addCriterion("POWER_DIRECTION >=", value, "powerDirection");
            return (Criteria) this;
        }

        public Criteria andPowerDirectionLessThan(Integer value) {
            addCriterion("POWER_DIRECTION <", value, "powerDirection");
            return (Criteria) this;
        }

        public Criteria andPowerDirectionLessThanOrEqualTo(Integer value) {
            addCriterion("POWER_DIRECTION <=", value, "powerDirection");
            return (Criteria) this;
        }

        public Criteria andPowerDirectionIn(List<Integer> values) {
            addCriterion("POWER_DIRECTION in", values, "powerDirection");
            return (Criteria) this;
        }

        public Criteria andPowerDirectionNotIn(List<Integer> values) {
            addCriterion("POWER_DIRECTION not in", values, "powerDirection");
            return (Criteria) this;
        }

        public Criteria andPowerDirectionBetween(Integer value1, Integer value2) {
            addCriterion("POWER_DIRECTION between", value1, value2, "powerDirection");
            return (Criteria) this;
        }

        public Criteria andPowerDirectionNotBetween(Integer value1, Integer value2) {
            addCriterion("POWER_DIRECTION not between", value1, value2, "powerDirection");
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