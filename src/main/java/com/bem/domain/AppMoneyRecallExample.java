package com.bem.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppMoneyRecallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppMoneyRecallExample() {
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

        public Criteria andRpMonSnIsNull() {
            addCriterion("RP_MON_SN is null");
            return (Criteria) this;
        }

        public Criteria andRpMonSnIsNotNull() {
            addCriterion("RP_MON_SN is not null");
            return (Criteria) this;
        }

        public Criteria andRpMonSnEqualTo(Short value) {
            addCriterion("RP_MON_SN =", value, "rpMonSn");
            return (Criteria) this;
        }

        public Criteria andRpMonSnNotEqualTo(Short value) {
            addCriterion("RP_MON_SN <>", value, "rpMonSn");
            return (Criteria) this;
        }

        public Criteria andRpMonSnGreaterThan(Short value) {
            addCriterion("RP_MON_SN >", value, "rpMonSn");
            return (Criteria) this;
        }

        public Criteria andRpMonSnGreaterThanOrEqualTo(Short value) {
            addCriterion("RP_MON_SN >=", value, "rpMonSn");
            return (Criteria) this;
        }

        public Criteria andRpMonSnLessThan(Short value) {
            addCriterion("RP_MON_SN <", value, "rpMonSn");
            return (Criteria) this;
        }

        public Criteria andRpMonSnLessThanOrEqualTo(Short value) {
            addCriterion("RP_MON_SN <=", value, "rpMonSn");
            return (Criteria) this;
        }

        public Criteria andRpMonSnIn(List<Short> values) {
            addCriterion("RP_MON_SN in", values, "rpMonSn");
            return (Criteria) this;
        }

        public Criteria andRpMonSnNotIn(List<Short> values) {
            addCriterion("RP_MON_SN not in", values, "rpMonSn");
            return (Criteria) this;
        }

        public Criteria andRpMonSnBetween(Short value1, Short value2) {
            addCriterion("RP_MON_SN between", value1, value2, "rpMonSn");
            return (Criteria) this;
        }

        public Criteria andRpMonSnNotBetween(Short value1, Short value2) {
            addCriterion("RP_MON_SN not between", value1, value2, "rpMonSn");
            return (Criteria) this;
        }

        public Criteria andElecTypeCodeIsNull() {
            addCriterion("ELEC_TYPE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andElecTypeCodeIsNotNull() {
            addCriterion("ELEC_TYPE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andElecTypeCodeEqualTo(Short value) {
            addCriterion("ELEC_TYPE_CODE =", value, "elecTypeCode");
            return (Criteria) this;
        }

        public Criteria andElecTypeCodeNotEqualTo(Short value) {
            addCriterion("ELEC_TYPE_CODE <>", value, "elecTypeCode");
            return (Criteria) this;
        }

        public Criteria andElecTypeCodeGreaterThan(Short value) {
            addCriterion("ELEC_TYPE_CODE >", value, "elecTypeCode");
            return (Criteria) this;
        }

        public Criteria andElecTypeCodeGreaterThanOrEqualTo(Short value) {
            addCriterion("ELEC_TYPE_CODE >=", value, "elecTypeCode");
            return (Criteria) this;
        }

        public Criteria andElecTypeCodeLessThan(Short value) {
            addCriterion("ELEC_TYPE_CODE <", value, "elecTypeCode");
            return (Criteria) this;
        }

        public Criteria andElecTypeCodeLessThanOrEqualTo(Short value) {
            addCriterion("ELEC_TYPE_CODE <=", value, "elecTypeCode");
            return (Criteria) this;
        }

        public Criteria andElecTypeCodeIn(List<Short> values) {
            addCriterion("ELEC_TYPE_CODE in", values, "elecTypeCode");
            return (Criteria) this;
        }

        public Criteria andElecTypeCodeNotIn(List<Short> values) {
            addCriterion("ELEC_TYPE_CODE not in", values, "elecTypeCode");
            return (Criteria) this;
        }

        public Criteria andElecTypeCodeBetween(Short value1, Short value2) {
            addCriterion("ELEC_TYPE_CODE between", value1, value2, "elecTypeCode");
            return (Criteria) this;
        }

        public Criteria andElecTypeCodeNotBetween(Short value1, Short value2) {
            addCriterion("ELEC_TYPE_CODE not between", value1, value2, "elecTypeCode");
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

        public Criteria andTsFlagEqualTo(Short value) {
            addCriterion("TS_FLAG =", value, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagNotEqualTo(Short value) {
            addCriterion("TS_FLAG <>", value, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagGreaterThan(Short value) {
            addCriterion("TS_FLAG >", value, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("TS_FLAG >=", value, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagLessThan(Short value) {
            addCriterion("TS_FLAG <", value, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagLessThanOrEqualTo(Short value) {
            addCriterion("TS_FLAG <=", value, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagIn(List<Short> values) {
            addCriterion("TS_FLAG in", values, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagNotIn(List<Short> values) {
            addCriterion("TS_FLAG not in", values, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagBetween(Short value1, Short value2) {
            addCriterion("TS_FLAG between", value1, value2, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andTsFlagNotBetween(Short value1, Short value2) {
            addCriterion("TS_FLAG not between", value1, value2, "tsFlag");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyFlagIsNull() {
            addCriterion("BASE_MONEY_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyFlagIsNotNull() {
            addCriterion("BASE_MONEY_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyFlagEqualTo(Short value) {
            addCriterion("BASE_MONEY_FLAG =", value, "baseMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyFlagNotEqualTo(Short value) {
            addCriterion("BASE_MONEY_FLAG <>", value, "baseMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyFlagGreaterThan(Short value) {
            addCriterion("BASE_MONEY_FLAG >", value, "baseMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("BASE_MONEY_FLAG >=", value, "baseMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyFlagLessThan(Short value) {
            addCriterion("BASE_MONEY_FLAG <", value, "baseMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyFlagLessThanOrEqualTo(Short value) {
            addCriterion("BASE_MONEY_FLAG <=", value, "baseMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyFlagIn(List<Short> values) {
            addCriterion("BASE_MONEY_FLAG in", values, "baseMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyFlagNotIn(List<Short> values) {
            addCriterion("BASE_MONEY_FLAG not in", values, "baseMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyFlagBetween(Short value1, Short value2) {
            addCriterion("BASE_MONEY_FLAG between", value1, value2, "baseMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andBaseMoneyFlagNotBetween(Short value1, Short value2) {
            addCriterion("BASE_MONEY_FLAG not between", value1, value2, "baseMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andCosTypeIsNull() {
            addCriterion("COS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCosTypeIsNotNull() {
            addCriterion("COS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCosTypeEqualTo(Short value) {
            addCriterion("COS_TYPE =", value, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeNotEqualTo(Short value) {
            addCriterion("COS_TYPE <>", value, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeGreaterThan(Short value) {
            addCriterion("COS_TYPE >", value, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("COS_TYPE >=", value, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeLessThan(Short value) {
            addCriterion("COS_TYPE <", value, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeLessThanOrEqualTo(Short value) {
            addCriterion("COS_TYPE <=", value, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeIn(List<Short> values) {
            addCriterion("COS_TYPE in", values, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeNotIn(List<Short> values) {
            addCriterion("COS_TYPE not in", values, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeBetween(Short value1, Short value2) {
            addCriterion("COS_TYPE between", value1, value2, "cosType");
            return (Criteria) this;
        }

        public Criteria andCosTypeNotBetween(Short value1, Short value2) {
            addCriterion("COS_TYPE not between", value1, value2, "cosType");
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

        public Criteria andWriteSectIdIsNull() {
            addCriterion("WRITE_SECT_ID is null");
            return (Criteria) this;
        }

        public Criteria andWriteSectIdIsNotNull() {
            addCriterion("WRITE_SECT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWriteSectIdEqualTo(Long value) {
            addCriterion("WRITE_SECT_ID =", value, "writeSectId");
            return (Criteria) this;
        }

        public Criteria andWriteSectIdNotEqualTo(Long value) {
            addCriterion("WRITE_SECT_ID <>", value, "writeSectId");
            return (Criteria) this;
        }

        public Criteria andWriteSectIdGreaterThan(Long value) {
            addCriterion("WRITE_SECT_ID >", value, "writeSectId");
            return (Criteria) this;
        }

        public Criteria andWriteSectIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WRITE_SECT_ID >=", value, "writeSectId");
            return (Criteria) this;
        }

        public Criteria andWriteSectIdLessThan(Long value) {
            addCriterion("WRITE_SECT_ID <", value, "writeSectId");
            return (Criteria) this;
        }

        public Criteria andWriteSectIdLessThanOrEqualTo(Long value) {
            addCriterion("WRITE_SECT_ID <=", value, "writeSectId");
            return (Criteria) this;
        }

        public Criteria andWriteSectIdIn(List<Long> values) {
            addCriterion("WRITE_SECT_ID in", values, "writeSectId");
            return (Criteria) this;
        }

        public Criteria andWriteSectIdNotIn(List<Long> values) {
            addCriterion("WRITE_SECT_ID not in", values, "writeSectId");
            return (Criteria) this;
        }

        public Criteria andWriteSectIdBetween(Long value1, Long value2) {
            addCriterion("WRITE_SECT_ID between", value1, value2, "writeSectId");
            return (Criteria) this;
        }

        public Criteria andWriteSectIdNotBetween(Long value1, Long value2) {
            addCriterion("WRITE_SECT_ID not between", value1, value2, "writeSectId");
            return (Criteria) this;
        }

        public Criteria andWriteSectNoIsNull() {
            addCriterion("WRITE_SECT_NO is null");
            return (Criteria) this;
        }

        public Criteria andWriteSectNoIsNotNull() {
            addCriterion("WRITE_SECT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andWriteSectNoEqualTo(String value) {
            addCriterion("WRITE_SECT_NO =", value, "writeSectNo");
            return (Criteria) this;
        }

        public Criteria andWriteSectNoNotEqualTo(String value) {
            addCriterion("WRITE_SECT_NO <>", value, "writeSectNo");
            return (Criteria) this;
        }

        public Criteria andWriteSectNoGreaterThan(String value) {
            addCriterion("WRITE_SECT_NO >", value, "writeSectNo");
            return (Criteria) this;
        }

        public Criteria andWriteSectNoGreaterThanOrEqualTo(String value) {
            addCriterion("WRITE_SECT_NO >=", value, "writeSectNo");
            return (Criteria) this;
        }

        public Criteria andWriteSectNoLessThan(String value) {
            addCriterion("WRITE_SECT_NO <", value, "writeSectNo");
            return (Criteria) this;
        }

        public Criteria andWriteSectNoLessThanOrEqualTo(String value) {
            addCriterion("WRITE_SECT_NO <=", value, "writeSectNo");
            return (Criteria) this;
        }

        public Criteria andWriteSectNoLike(String value) {
            addCriterion("WRITE_SECT_NO like", value, "writeSectNo");
            return (Criteria) this;
        }

        public Criteria andWriteSectNoNotLike(String value) {
            addCriterion("WRITE_SECT_NO not like", value, "writeSectNo");
            return (Criteria) this;
        }

        public Criteria andWriteSectNoIn(List<String> values) {
            addCriterion("WRITE_SECT_NO in", values, "writeSectNo");
            return (Criteria) this;
        }

        public Criteria andWriteSectNoNotIn(List<String> values) {
            addCriterion("WRITE_SECT_NO not in", values, "writeSectNo");
            return (Criteria) this;
        }

        public Criteria andWriteSectNoBetween(String value1, String value2) {
            addCriterion("WRITE_SECT_NO between", value1, value2, "writeSectNo");
            return (Criteria) this;
        }

        public Criteria andWriteSectNoNotBetween(String value1, String value2) {
            addCriterion("WRITE_SECT_NO not between", value1, value2, "writeSectNo");
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

        public Criteria andTotalPowerIsNull() {
            addCriterion("TOTAL_POWER is null");
            return (Criteria) this;
        }

        public Criteria andTotalPowerIsNotNull() {
            addCriterion("TOTAL_POWER is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPowerEqualTo(BigDecimal value) {
            addCriterion("TOTAL_POWER =", value, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_POWER <>", value, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_POWER >", value, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_POWER >=", value, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerLessThan(BigDecimal value) {
            addCriterion("TOTAL_POWER <", value, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_POWER <=", value, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerIn(List<BigDecimal> values) {
            addCriterion("TOTAL_POWER in", values, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_POWER not in", values, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_POWER between", value1, value2, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalPowerNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_POWER not between", value1, value2, "totalPower");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNull() {
            addCriterion("TOTAL_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("TOTAL_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(BigDecimal value) {
            addCriterion("TOTAL_MONEY =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("TOTAL_MONEY <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(BigDecimal value) {
            addCriterion("TOTAL_MONEY >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_MONEY >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(BigDecimal value) {
            addCriterion("TOTAL_MONEY <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TOTAL_MONEY <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<BigDecimal> values) {
            addCriterion("TOTAL_MONEY in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("TOTAL_MONEY not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_MONEY between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TOTAL_MONEY not between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andVolumeChargeIsNull() {
            addCriterion("VOLUME_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andVolumeChargeIsNotNull() {
            addCriterion("VOLUME_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeChargeEqualTo(BigDecimal value) {
            addCriterion("VOLUME_CHARGE =", value, "volumeCharge");
            return (Criteria) this;
        }

        public Criteria andVolumeChargeNotEqualTo(BigDecimal value) {
            addCriterion("VOLUME_CHARGE <>", value, "volumeCharge");
            return (Criteria) this;
        }

        public Criteria andVolumeChargeGreaterThan(BigDecimal value) {
            addCriterion("VOLUME_CHARGE >", value, "volumeCharge");
            return (Criteria) this;
        }

        public Criteria andVolumeChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("VOLUME_CHARGE >=", value, "volumeCharge");
            return (Criteria) this;
        }

        public Criteria andVolumeChargeLessThan(BigDecimal value) {
            addCriterion("VOLUME_CHARGE <", value, "volumeCharge");
            return (Criteria) this;
        }

        public Criteria andVolumeChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("VOLUME_CHARGE <=", value, "volumeCharge");
            return (Criteria) this;
        }

        public Criteria andVolumeChargeIn(List<BigDecimal> values) {
            addCriterion("VOLUME_CHARGE in", values, "volumeCharge");
            return (Criteria) this;
        }

        public Criteria andVolumeChargeNotIn(List<BigDecimal> values) {
            addCriterion("VOLUME_CHARGE not in", values, "volumeCharge");
            return (Criteria) this;
        }

        public Criteria andVolumeChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOLUME_CHARGE between", value1, value2, "volumeCharge");
            return (Criteria) this;
        }

        public Criteria andVolumeChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("VOLUME_CHARGE not between", value1, value2, "volumeCharge");
            return (Criteria) this;
        }

        public Criteria andBasicMoneyIsNull() {
            addCriterion("BASIC_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andBasicMoneyIsNotNull() {
            addCriterion("BASIC_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andBasicMoneyEqualTo(BigDecimal value) {
            addCriterion("BASIC_MONEY =", value, "basicMoney");
            return (Criteria) this;
        }

        public Criteria andBasicMoneyNotEqualTo(BigDecimal value) {
            addCriterion("BASIC_MONEY <>", value, "basicMoney");
            return (Criteria) this;
        }

        public Criteria andBasicMoneyGreaterThan(BigDecimal value) {
            addCriterion("BASIC_MONEY >", value, "basicMoney");
            return (Criteria) this;
        }

        public Criteria andBasicMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BASIC_MONEY >=", value, "basicMoney");
            return (Criteria) this;
        }

        public Criteria andBasicMoneyLessThan(BigDecimal value) {
            addCriterion("BASIC_MONEY <", value, "basicMoney");
            return (Criteria) this;
        }

        public Criteria andBasicMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BASIC_MONEY <=", value, "basicMoney");
            return (Criteria) this;
        }

        public Criteria andBasicMoneyIn(List<BigDecimal> values) {
            addCriterion("BASIC_MONEY in", values, "basicMoney");
            return (Criteria) this;
        }

        public Criteria andBasicMoneyNotIn(List<BigDecimal> values) {
            addCriterion("BASIC_MONEY not in", values, "basicMoney");
            return (Criteria) this;
        }

        public Criteria andBasicMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASIC_MONEY between", value1, value2, "basicMoney");
            return (Criteria) this;
        }

        public Criteria andBasicMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BASIC_MONEY not between", value1, value2, "basicMoney");
            return (Criteria) this;
        }

        public Criteria andPowerRateMoneyIsNull() {
            addCriterion("POWER_RATE_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andPowerRateMoneyIsNotNull() {
            addCriterion("POWER_RATE_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andPowerRateMoneyEqualTo(BigDecimal value) {
            addCriterion("POWER_RATE_MONEY =", value, "powerRateMoney");
            return (Criteria) this;
        }

        public Criteria andPowerRateMoneyNotEqualTo(BigDecimal value) {
            addCriterion("POWER_RATE_MONEY <>", value, "powerRateMoney");
            return (Criteria) this;
        }

        public Criteria andPowerRateMoneyGreaterThan(BigDecimal value) {
            addCriterion("POWER_RATE_MONEY >", value, "powerRateMoney");
            return (Criteria) this;
        }

        public Criteria andPowerRateMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("POWER_RATE_MONEY >=", value, "powerRateMoney");
            return (Criteria) this;
        }

        public Criteria andPowerRateMoneyLessThan(BigDecimal value) {
            addCriterion("POWER_RATE_MONEY <", value, "powerRateMoney");
            return (Criteria) this;
        }

        public Criteria andPowerRateMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("POWER_RATE_MONEY <=", value, "powerRateMoney");
            return (Criteria) this;
        }

        public Criteria andPowerRateMoneyIn(List<BigDecimal> values) {
            addCriterion("POWER_RATE_MONEY in", values, "powerRateMoney");
            return (Criteria) this;
        }

        public Criteria andPowerRateMoneyNotIn(List<BigDecimal> values) {
            addCriterion("POWER_RATE_MONEY not in", values, "powerRateMoney");
            return (Criteria) this;
        }

        public Criteria andPowerRateMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POWER_RATE_MONEY between", value1, value2, "powerRateMoney");
            return (Criteria) this;
        }

        public Criteria andPowerRateMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("POWER_RATE_MONEY not between", value1, value2, "powerRateMoney");
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

        public Criteria andAddMoney1IsNull() {
            addCriterion("ADD_MONEY1 is null");
            return (Criteria) this;
        }

        public Criteria andAddMoney1IsNotNull() {
            addCriterion("ADD_MONEY1 is not null");
            return (Criteria) this;
        }

        public Criteria andAddMoney1EqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY1 =", value, "addMoney1");
            return (Criteria) this;
        }

        public Criteria andAddMoney1NotEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY1 <>", value, "addMoney1");
            return (Criteria) this;
        }

        public Criteria andAddMoney1GreaterThan(BigDecimal value) {
            addCriterion("ADD_MONEY1 >", value, "addMoney1");
            return (Criteria) this;
        }

        public Criteria andAddMoney1GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY1 >=", value, "addMoney1");
            return (Criteria) this;
        }

        public Criteria andAddMoney1LessThan(BigDecimal value) {
            addCriterion("ADD_MONEY1 <", value, "addMoney1");
            return (Criteria) this;
        }

        public Criteria andAddMoney1LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY1 <=", value, "addMoney1");
            return (Criteria) this;
        }

        public Criteria andAddMoney1In(List<BigDecimal> values) {
            addCriterion("ADD_MONEY1 in", values, "addMoney1");
            return (Criteria) this;
        }

        public Criteria andAddMoney1NotIn(List<BigDecimal> values) {
            addCriterion("ADD_MONEY1 not in", values, "addMoney1");
            return (Criteria) this;
        }

        public Criteria andAddMoney1Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY1 between", value1, value2, "addMoney1");
            return (Criteria) this;
        }

        public Criteria andAddMoney1NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY1 not between", value1, value2, "addMoney1");
            return (Criteria) this;
        }

        public Criteria andAddMoney2IsNull() {
            addCriterion("ADD_MONEY2 is null");
            return (Criteria) this;
        }

        public Criteria andAddMoney2IsNotNull() {
            addCriterion("ADD_MONEY2 is not null");
            return (Criteria) this;
        }

        public Criteria andAddMoney2EqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY2 =", value, "addMoney2");
            return (Criteria) this;
        }

        public Criteria andAddMoney2NotEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY2 <>", value, "addMoney2");
            return (Criteria) this;
        }

        public Criteria andAddMoney2GreaterThan(BigDecimal value) {
            addCriterion("ADD_MONEY2 >", value, "addMoney2");
            return (Criteria) this;
        }

        public Criteria andAddMoney2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY2 >=", value, "addMoney2");
            return (Criteria) this;
        }

        public Criteria andAddMoney2LessThan(BigDecimal value) {
            addCriterion("ADD_MONEY2 <", value, "addMoney2");
            return (Criteria) this;
        }

        public Criteria andAddMoney2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY2 <=", value, "addMoney2");
            return (Criteria) this;
        }

        public Criteria andAddMoney2In(List<BigDecimal> values) {
            addCriterion("ADD_MONEY2 in", values, "addMoney2");
            return (Criteria) this;
        }

        public Criteria andAddMoney2NotIn(List<BigDecimal> values) {
            addCriterion("ADD_MONEY2 not in", values, "addMoney2");
            return (Criteria) this;
        }

        public Criteria andAddMoney2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY2 between", value1, value2, "addMoney2");
            return (Criteria) this;
        }

        public Criteria andAddMoney2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY2 not between", value1, value2, "addMoney2");
            return (Criteria) this;
        }

        public Criteria andAddMoney3IsNull() {
            addCriterion("ADD_MONEY3 is null");
            return (Criteria) this;
        }

        public Criteria andAddMoney3IsNotNull() {
            addCriterion("ADD_MONEY3 is not null");
            return (Criteria) this;
        }

        public Criteria andAddMoney3EqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY3 =", value, "addMoney3");
            return (Criteria) this;
        }

        public Criteria andAddMoney3NotEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY3 <>", value, "addMoney3");
            return (Criteria) this;
        }

        public Criteria andAddMoney3GreaterThan(BigDecimal value) {
            addCriterion("ADD_MONEY3 >", value, "addMoney3");
            return (Criteria) this;
        }

        public Criteria andAddMoney3GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY3 >=", value, "addMoney3");
            return (Criteria) this;
        }

        public Criteria andAddMoney3LessThan(BigDecimal value) {
            addCriterion("ADD_MONEY3 <", value, "addMoney3");
            return (Criteria) this;
        }

        public Criteria andAddMoney3LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY3 <=", value, "addMoney3");
            return (Criteria) this;
        }

        public Criteria andAddMoney3In(List<BigDecimal> values) {
            addCriterion("ADD_MONEY3 in", values, "addMoney3");
            return (Criteria) this;
        }

        public Criteria andAddMoney3NotIn(List<BigDecimal> values) {
            addCriterion("ADD_MONEY3 not in", values, "addMoney3");
            return (Criteria) this;
        }

        public Criteria andAddMoney3Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY3 between", value1, value2, "addMoney3");
            return (Criteria) this;
        }

        public Criteria andAddMoney3NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY3 not between", value1, value2, "addMoney3");
            return (Criteria) this;
        }

        public Criteria andAddMoney4IsNull() {
            addCriterion("ADD_MONEY4 is null");
            return (Criteria) this;
        }

        public Criteria andAddMoney4IsNotNull() {
            addCriterion("ADD_MONEY4 is not null");
            return (Criteria) this;
        }

        public Criteria andAddMoney4EqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY4 =", value, "addMoney4");
            return (Criteria) this;
        }

        public Criteria andAddMoney4NotEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY4 <>", value, "addMoney4");
            return (Criteria) this;
        }

        public Criteria andAddMoney4GreaterThan(BigDecimal value) {
            addCriterion("ADD_MONEY4 >", value, "addMoney4");
            return (Criteria) this;
        }

        public Criteria andAddMoney4GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY4 >=", value, "addMoney4");
            return (Criteria) this;
        }

        public Criteria andAddMoney4LessThan(BigDecimal value) {
            addCriterion("ADD_MONEY4 <", value, "addMoney4");
            return (Criteria) this;
        }

        public Criteria andAddMoney4LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY4 <=", value, "addMoney4");
            return (Criteria) this;
        }

        public Criteria andAddMoney4In(List<BigDecimal> values) {
            addCriterion("ADD_MONEY4 in", values, "addMoney4");
            return (Criteria) this;
        }

        public Criteria andAddMoney4NotIn(List<BigDecimal> values) {
            addCriterion("ADD_MONEY4 not in", values, "addMoney4");
            return (Criteria) this;
        }

        public Criteria andAddMoney4Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY4 between", value1, value2, "addMoney4");
            return (Criteria) this;
        }

        public Criteria andAddMoney4NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY4 not between", value1, value2, "addMoney4");
            return (Criteria) this;
        }

        public Criteria andAddMoney5IsNull() {
            addCriterion("ADD_MONEY5 is null");
            return (Criteria) this;
        }

        public Criteria andAddMoney5IsNotNull() {
            addCriterion("ADD_MONEY5 is not null");
            return (Criteria) this;
        }

        public Criteria andAddMoney5EqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY5 =", value, "addMoney5");
            return (Criteria) this;
        }

        public Criteria andAddMoney5NotEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY5 <>", value, "addMoney5");
            return (Criteria) this;
        }

        public Criteria andAddMoney5GreaterThan(BigDecimal value) {
            addCriterion("ADD_MONEY5 >", value, "addMoney5");
            return (Criteria) this;
        }

        public Criteria andAddMoney5GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY5 >=", value, "addMoney5");
            return (Criteria) this;
        }

        public Criteria andAddMoney5LessThan(BigDecimal value) {
            addCriterion("ADD_MONEY5 <", value, "addMoney5");
            return (Criteria) this;
        }

        public Criteria andAddMoney5LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY5 <=", value, "addMoney5");
            return (Criteria) this;
        }

        public Criteria andAddMoney5In(List<BigDecimal> values) {
            addCriterion("ADD_MONEY5 in", values, "addMoney5");
            return (Criteria) this;
        }

        public Criteria andAddMoney5NotIn(List<BigDecimal> values) {
            addCriterion("ADD_MONEY5 not in", values, "addMoney5");
            return (Criteria) this;
        }

        public Criteria andAddMoney5Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY5 between", value1, value2, "addMoney5");
            return (Criteria) this;
        }

        public Criteria andAddMoney5NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY5 not between", value1, value2, "addMoney5");
            return (Criteria) this;
        }

        public Criteria andAddMoney6IsNull() {
            addCriterion("ADD_MONEY6 is null");
            return (Criteria) this;
        }

        public Criteria andAddMoney6IsNotNull() {
            addCriterion("ADD_MONEY6 is not null");
            return (Criteria) this;
        }

        public Criteria andAddMoney6EqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY6 =", value, "addMoney6");
            return (Criteria) this;
        }

        public Criteria andAddMoney6NotEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY6 <>", value, "addMoney6");
            return (Criteria) this;
        }

        public Criteria andAddMoney6GreaterThan(BigDecimal value) {
            addCriterion("ADD_MONEY6 >", value, "addMoney6");
            return (Criteria) this;
        }

        public Criteria andAddMoney6GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY6 >=", value, "addMoney6");
            return (Criteria) this;
        }

        public Criteria andAddMoney6LessThan(BigDecimal value) {
            addCriterion("ADD_MONEY6 <", value, "addMoney6");
            return (Criteria) this;
        }

        public Criteria andAddMoney6LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY6 <=", value, "addMoney6");
            return (Criteria) this;
        }

        public Criteria andAddMoney6In(List<BigDecimal> values) {
            addCriterion("ADD_MONEY6 in", values, "addMoney6");
            return (Criteria) this;
        }

        public Criteria andAddMoney6NotIn(List<BigDecimal> values) {
            addCriterion("ADD_MONEY6 not in", values, "addMoney6");
            return (Criteria) this;
        }

        public Criteria andAddMoney6Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY6 between", value1, value2, "addMoney6");
            return (Criteria) this;
        }

        public Criteria andAddMoney6NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY6 not between", value1, value2, "addMoney6");
            return (Criteria) this;
        }

        public Criteria andAddMoney7IsNull() {
            addCriterion("ADD_MONEY7 is null");
            return (Criteria) this;
        }

        public Criteria andAddMoney7IsNotNull() {
            addCriterion("ADD_MONEY7 is not null");
            return (Criteria) this;
        }

        public Criteria andAddMoney7EqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY7 =", value, "addMoney7");
            return (Criteria) this;
        }

        public Criteria andAddMoney7NotEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY7 <>", value, "addMoney7");
            return (Criteria) this;
        }

        public Criteria andAddMoney7GreaterThan(BigDecimal value) {
            addCriterion("ADD_MONEY7 >", value, "addMoney7");
            return (Criteria) this;
        }

        public Criteria andAddMoney7GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY7 >=", value, "addMoney7");
            return (Criteria) this;
        }

        public Criteria andAddMoney7LessThan(BigDecimal value) {
            addCriterion("ADD_MONEY7 <", value, "addMoney7");
            return (Criteria) this;
        }

        public Criteria andAddMoney7LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY7 <=", value, "addMoney7");
            return (Criteria) this;
        }

        public Criteria andAddMoney7In(List<BigDecimal> values) {
            addCriterion("ADD_MONEY7 in", values, "addMoney7");
            return (Criteria) this;
        }

        public Criteria andAddMoney7NotIn(List<BigDecimal> values) {
            addCriterion("ADD_MONEY7 not in", values, "addMoney7");
            return (Criteria) this;
        }

        public Criteria andAddMoney7Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY7 between", value1, value2, "addMoney7");
            return (Criteria) this;
        }

        public Criteria andAddMoney7NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY7 not between", value1, value2, "addMoney7");
            return (Criteria) this;
        }

        public Criteria andAddMoney8IsNull() {
            addCriterion("ADD_MONEY8 is null");
            return (Criteria) this;
        }

        public Criteria andAddMoney8IsNotNull() {
            addCriterion("ADD_MONEY8 is not null");
            return (Criteria) this;
        }

        public Criteria andAddMoney8EqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY8 =", value, "addMoney8");
            return (Criteria) this;
        }

        public Criteria andAddMoney8NotEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY8 <>", value, "addMoney8");
            return (Criteria) this;
        }

        public Criteria andAddMoney8GreaterThan(BigDecimal value) {
            addCriterion("ADD_MONEY8 >", value, "addMoney8");
            return (Criteria) this;
        }

        public Criteria andAddMoney8GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY8 >=", value, "addMoney8");
            return (Criteria) this;
        }

        public Criteria andAddMoney8LessThan(BigDecimal value) {
            addCriterion("ADD_MONEY8 <", value, "addMoney8");
            return (Criteria) this;
        }

        public Criteria andAddMoney8LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY8 <=", value, "addMoney8");
            return (Criteria) this;
        }

        public Criteria andAddMoney8In(List<BigDecimal> values) {
            addCriterion("ADD_MONEY8 in", values, "addMoney8");
            return (Criteria) this;
        }

        public Criteria andAddMoney8NotIn(List<BigDecimal> values) {
            addCriterion("ADD_MONEY8 not in", values, "addMoney8");
            return (Criteria) this;
        }

        public Criteria andAddMoney8Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY8 between", value1, value2, "addMoney8");
            return (Criteria) this;
        }

        public Criteria andAddMoney8NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY8 not between", value1, value2, "addMoney8");
            return (Criteria) this;
        }

        public Criteria andAddMoney9IsNull() {
            addCriterion("ADD_MONEY9 is null");
            return (Criteria) this;
        }

        public Criteria andAddMoney9IsNotNull() {
            addCriterion("ADD_MONEY9 is not null");
            return (Criteria) this;
        }

        public Criteria andAddMoney9EqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY9 =", value, "addMoney9");
            return (Criteria) this;
        }

        public Criteria andAddMoney9NotEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY9 <>", value, "addMoney9");
            return (Criteria) this;
        }

        public Criteria andAddMoney9GreaterThan(BigDecimal value) {
            addCriterion("ADD_MONEY9 >", value, "addMoney9");
            return (Criteria) this;
        }

        public Criteria andAddMoney9GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY9 >=", value, "addMoney9");
            return (Criteria) this;
        }

        public Criteria andAddMoney9LessThan(BigDecimal value) {
            addCriterion("ADD_MONEY9 <", value, "addMoney9");
            return (Criteria) this;
        }

        public Criteria andAddMoney9LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY9 <=", value, "addMoney9");
            return (Criteria) this;
        }

        public Criteria andAddMoney9In(List<BigDecimal> values) {
            addCriterion("ADD_MONEY9 in", values, "addMoney9");
            return (Criteria) this;
        }

        public Criteria andAddMoney9NotIn(List<BigDecimal> values) {
            addCriterion("ADD_MONEY9 not in", values, "addMoney9");
            return (Criteria) this;
        }

        public Criteria andAddMoney9Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY9 between", value1, value2, "addMoney9");
            return (Criteria) this;
        }

        public Criteria andAddMoney9NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY9 not between", value1, value2, "addMoney9");
            return (Criteria) this;
        }

        public Criteria andAddMoney10IsNull() {
            addCriterion("ADD_MONEY10 is null");
            return (Criteria) this;
        }

        public Criteria andAddMoney10IsNotNull() {
            addCriterion("ADD_MONEY10 is not null");
            return (Criteria) this;
        }

        public Criteria andAddMoney10EqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY10 =", value, "addMoney10");
            return (Criteria) this;
        }

        public Criteria andAddMoney10NotEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY10 <>", value, "addMoney10");
            return (Criteria) this;
        }

        public Criteria andAddMoney10GreaterThan(BigDecimal value) {
            addCriterion("ADD_MONEY10 >", value, "addMoney10");
            return (Criteria) this;
        }

        public Criteria andAddMoney10GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY10 >=", value, "addMoney10");
            return (Criteria) this;
        }

        public Criteria andAddMoney10LessThan(BigDecimal value) {
            addCriterion("ADD_MONEY10 <", value, "addMoney10");
            return (Criteria) this;
        }

        public Criteria andAddMoney10LessThanOrEqualTo(BigDecimal value) {
            addCriterion("ADD_MONEY10 <=", value, "addMoney10");
            return (Criteria) this;
        }

        public Criteria andAddMoney10In(List<BigDecimal> values) {
            addCriterion("ADD_MONEY10 in", values, "addMoney10");
            return (Criteria) this;
        }

        public Criteria andAddMoney10NotIn(List<BigDecimal> values) {
            addCriterion("ADD_MONEY10 not in", values, "addMoney10");
            return (Criteria) this;
        }

        public Criteria andAddMoney10Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY10 between", value1, value2, "addMoney10");
            return (Criteria) this;
        }

        public Criteria andAddMoney10NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ADD_MONEY10 not between", value1, value2, "addMoney10");
            return (Criteria) this;
        }

        public Criteria andRpModeIsNull() {
            addCriterion("RP_MODE is null");
            return (Criteria) this;
        }

        public Criteria andRpModeIsNotNull() {
            addCriterion("RP_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andRpModeEqualTo(Integer value) {
            addCriterion("RP_MODE =", value, "rpMode");
            return (Criteria) this;
        }

        public Criteria andRpModeNotEqualTo(Integer value) {
            addCriterion("RP_MODE <>", value, "rpMode");
            return (Criteria) this;
        }

        public Criteria andRpModeGreaterThan(Integer value) {
            addCriterion("RP_MODE >", value, "rpMode");
            return (Criteria) this;
        }

        public Criteria andRpModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("RP_MODE >=", value, "rpMode");
            return (Criteria) this;
        }

        public Criteria andRpModeLessThan(Integer value) {
            addCriterion("RP_MODE <", value, "rpMode");
            return (Criteria) this;
        }

        public Criteria andRpModeLessThanOrEqualTo(Integer value) {
            addCriterion("RP_MODE <=", value, "rpMode");
            return (Criteria) this;
        }

        public Criteria andRpModeIn(List<Integer> values) {
            addCriterion("RP_MODE in", values, "rpMode");
            return (Criteria) this;
        }

        public Criteria andRpModeNotIn(List<Integer> values) {
            addCriterion("RP_MODE not in", values, "rpMode");
            return (Criteria) this;
        }

        public Criteria andRpModeBetween(Integer value1, Integer value2) {
            addCriterion("RP_MODE between", value1, value2, "rpMode");
            return (Criteria) this;
        }

        public Criteria andRpModeNotBetween(Integer value1, Integer value2) {
            addCriterion("RP_MODE not between", value1, value2, "rpMode");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNull() {
            addCriterion("PRICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIsNotNull() {
            addCriterion("PRICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andPriceTypeEqualTo(Short value) {
            addCriterion("PRICE_TYPE =", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotEqualTo(Short value) {
            addCriterion("PRICE_TYPE <>", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThan(Short value) {
            addCriterion("PRICE_TYPE >", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("PRICE_TYPE >=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThan(Short value) {
            addCriterion("PRICE_TYPE <", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeLessThanOrEqualTo(Short value) {
            addCriterion("PRICE_TYPE <=", value, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeIn(List<Short> values) {
            addCriterion("PRICE_TYPE in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotIn(List<Short> values) {
            addCriterion("PRICE_TYPE not in", values, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeBetween(Short value1, Short value2) {
            addCriterion("PRICE_TYPE between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPriceTypeNotBetween(Short value1, Short value2) {
            addCriterion("PRICE_TYPE not between", value1, value2, "priceType");
            return (Criteria) this;
        }

        public Criteria andPaidFlagIsNull() {
            addCriterion("PAID_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPaidFlagIsNotNull() {
            addCriterion("PAID_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPaidFlagEqualTo(Integer value) {
            addCriterion("PAID_FLAG =", value, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagNotEqualTo(Integer value) {
            addCriterion("PAID_FLAG <>", value, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagGreaterThan(Integer value) {
            addCriterion("PAID_FLAG >", value, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("PAID_FLAG >=", value, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagLessThan(Integer value) {
            addCriterion("PAID_FLAG <", value, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagLessThanOrEqualTo(Integer value) {
            addCriterion("PAID_FLAG <=", value, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagIn(List<Integer> values) {
            addCriterion("PAID_FLAG in", values, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagNotIn(List<Integer> values) {
            addCriterion("PAID_FLAG not in", values, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagBetween(Integer value1, Integer value2) {
            addCriterion("PAID_FLAG between", value1, value2, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPaidFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("PAID_FLAG not between", value1, value2, "paidFlag");
            return (Criteria) this;
        }

        public Criteria andPassResultIsNull() {
            addCriterion("PASS_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andPassResultIsNotNull() {
            addCriterion("PASS_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andPassResultEqualTo(Integer value) {
            addCriterion("PASS_RESULT =", value, "passResult");
            return (Criteria) this;
        }

        public Criteria andPassResultNotEqualTo(Integer value) {
            addCriterion("PASS_RESULT <>", value, "passResult");
            return (Criteria) this;
        }

        public Criteria andPassResultGreaterThan(Integer value) {
            addCriterion("PASS_RESULT >", value, "passResult");
            return (Criteria) this;
        }

        public Criteria andPassResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("PASS_RESULT >=", value, "passResult");
            return (Criteria) this;
        }

        public Criteria andPassResultLessThan(Integer value) {
            addCriterion("PASS_RESULT <", value, "passResult");
            return (Criteria) this;
        }

        public Criteria andPassResultLessThanOrEqualTo(Integer value) {
            addCriterion("PASS_RESULT <=", value, "passResult");
            return (Criteria) this;
        }

        public Criteria andPassResultIn(List<Integer> values) {
            addCriterion("PASS_RESULT in", values, "passResult");
            return (Criteria) this;
        }

        public Criteria andPassResultNotIn(List<Integer> values) {
            addCriterion("PASS_RESULT not in", values, "passResult");
            return (Criteria) this;
        }

        public Criteria andPassResultBetween(Integer value1, Integer value2) {
            addCriterion("PASS_RESULT between", value1, value2, "passResult");
            return (Criteria) this;
        }

        public Criteria andPassResultNotBetween(Integer value1, Integer value2) {
            addCriterion("PASS_RESULT not between", value1, value2, "passResult");
            return (Criteria) this;
        }

        public Criteria andPassReasonIsNull() {
            addCriterion("PASS_REASON is null");
            return (Criteria) this;
        }

        public Criteria andPassReasonIsNotNull() {
            addCriterion("PASS_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andPassReasonEqualTo(String value) {
            addCriterion("PASS_REASON =", value, "passReason");
            return (Criteria) this;
        }

        public Criteria andPassReasonNotEqualTo(String value) {
            addCriterion("PASS_REASON <>", value, "passReason");
            return (Criteria) this;
        }

        public Criteria andPassReasonGreaterThan(String value) {
            addCriterion("PASS_REASON >", value, "passReason");
            return (Criteria) this;
        }

        public Criteria andPassReasonGreaterThanOrEqualTo(String value) {
            addCriterion("PASS_REASON >=", value, "passReason");
            return (Criteria) this;
        }

        public Criteria andPassReasonLessThan(String value) {
            addCriterion("PASS_REASON <", value, "passReason");
            return (Criteria) this;
        }

        public Criteria andPassReasonLessThanOrEqualTo(String value) {
            addCriterion("PASS_REASON <=", value, "passReason");
            return (Criteria) this;
        }

        public Criteria andPassReasonLike(String value) {
            addCriterion("PASS_REASON like", value, "passReason");
            return (Criteria) this;
        }

        public Criteria andPassReasonNotLike(String value) {
            addCriterion("PASS_REASON not like", value, "passReason");
            return (Criteria) this;
        }

        public Criteria andPassReasonIn(List<String> values) {
            addCriterion("PASS_REASON in", values, "passReason");
            return (Criteria) this;
        }

        public Criteria andPassReasonNotIn(List<String> values) {
            addCriterion("PASS_REASON not in", values, "passReason");
            return (Criteria) this;
        }

        public Criteria andPassReasonBetween(String value1, String value2) {
            addCriterion("PASS_REASON between", value1, value2, "passReason");
            return (Criteria) this;
        }

        public Criteria andPassReasonNotBetween(String value1, String value2) {
            addCriterion("PASS_REASON not between", value1, value2, "passReason");
            return (Criteria) this;
        }

        public Criteria andSettlementIdIsNull() {
            addCriterion("SETTLEMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSettlementIdIsNotNull() {
            addCriterion("SETTLEMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementIdEqualTo(Long value) {
            addCriterion("SETTLEMENT_ID =", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdNotEqualTo(Long value) {
            addCriterion("SETTLEMENT_ID <>", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdGreaterThan(Long value) {
            addCriterion("SETTLEMENT_ID >", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SETTLEMENT_ID >=", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdLessThan(Long value) {
            addCriterion("SETTLEMENT_ID <", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdLessThanOrEqualTo(Long value) {
            addCriterion("SETTLEMENT_ID <=", value, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdIn(List<Long> values) {
            addCriterion("SETTLEMENT_ID in", values, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdNotIn(List<Long> values) {
            addCriterion("SETTLEMENT_ID not in", values, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdBetween(Long value1, Long value2) {
            addCriterion("SETTLEMENT_ID between", value1, value2, "settlementId");
            return (Criteria) this;
        }

        public Criteria andSettlementIdNotBetween(Long value1, Long value2) {
            addCriterion("SETTLEMENT_ID not between", value1, value2, "settlementId");
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