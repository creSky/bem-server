package com.bem.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AppTransformerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppTransformerInfoExample() {
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

        public Criteria andAppIdEqualTo(Long value) {
            addCriterion("APP_ID =", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotEqualTo(Long value) {
            addCriterion("APP_ID <>", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThan(Long value) {
            addCriterion("APP_ID >", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdGreaterThanOrEqualTo(Long value) {
            addCriterion("APP_ID >=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThan(Long value) {
            addCriterion("APP_ID <", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdLessThanOrEqualTo(Long value) {
            addCriterion("APP_ID <=", value, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdIn(List<Long> values) {
            addCriterion("APP_ID in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotIn(List<Long> values) {
            addCriterion("APP_ID not in", values, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdBetween(Long value1, Long value2) {
            addCriterion("APP_ID between", value1, value2, "appId");
            return (Criteria) this;
        }

        public Criteria andAppIdNotBetween(Long value1, Long value2) {
            addCriterion("APP_ID not between", value1, value2, "appId");
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

        public Criteria andLoadChangeSignIsNull() {
            addCriterion("LOAD_CHANGE_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andLoadChangeSignIsNotNull() {
            addCriterion("LOAD_CHANGE_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andLoadChangeSignEqualTo(Integer value) {
            addCriterion("LOAD_CHANGE_SIGN =", value, "loadChangeSign");
            return (Criteria) this;
        }

        public Criteria andLoadChangeSignNotEqualTo(Integer value) {
            addCriterion("LOAD_CHANGE_SIGN <>", value, "loadChangeSign");
            return (Criteria) this;
        }

        public Criteria andLoadChangeSignGreaterThan(Integer value) {
            addCriterion("LOAD_CHANGE_SIGN >", value, "loadChangeSign");
            return (Criteria) this;
        }

        public Criteria andLoadChangeSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("LOAD_CHANGE_SIGN >=", value, "loadChangeSign");
            return (Criteria) this;
        }

        public Criteria andLoadChangeSignLessThan(Integer value) {
            addCriterion("LOAD_CHANGE_SIGN <", value, "loadChangeSign");
            return (Criteria) this;
        }

        public Criteria andLoadChangeSignLessThanOrEqualTo(Integer value) {
            addCriterion("LOAD_CHANGE_SIGN <=", value, "loadChangeSign");
            return (Criteria) this;
        }

        public Criteria andLoadChangeSignIn(List<Integer> values) {
            addCriterion("LOAD_CHANGE_SIGN in", values, "loadChangeSign");
            return (Criteria) this;
        }

        public Criteria andLoadChangeSignNotIn(List<Integer> values) {
            addCriterion("LOAD_CHANGE_SIGN not in", values, "loadChangeSign");
            return (Criteria) this;
        }

        public Criteria andLoadChangeSignBetween(Integer value1, Integer value2) {
            addCriterion("LOAD_CHANGE_SIGN between", value1, value2, "loadChangeSign");
            return (Criteria) this;
        }

        public Criteria andLoadChangeSignNotBetween(Integer value1, Integer value2) {
            addCriterion("LOAD_CHANGE_SIGN not between", value1, value2, "loadChangeSign");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupNoIsNull() {
            addCriterion("TRANSFORMER_GROUP_NO is null");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupNoIsNotNull() {
            addCriterion("TRANSFORMER_GROUP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupNoEqualTo(String value) {
            addCriterion("TRANSFORMER_GROUP_NO =", value, "transformerGroupNo");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupNoNotEqualTo(String value) {
            addCriterion("TRANSFORMER_GROUP_NO <>", value, "transformerGroupNo");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupNoGreaterThan(String value) {
            addCriterion("TRANSFORMER_GROUP_NO >", value, "transformerGroupNo");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFORMER_GROUP_NO >=", value, "transformerGroupNo");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupNoLessThan(String value) {
            addCriterion("TRANSFORMER_GROUP_NO <", value, "transformerGroupNo");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupNoLessThanOrEqualTo(String value) {
            addCriterion("TRANSFORMER_GROUP_NO <=", value, "transformerGroupNo");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupNoLike(String value) {
            addCriterion("TRANSFORMER_GROUP_NO like", value, "transformerGroupNo");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupNoNotLike(String value) {
            addCriterion("TRANSFORMER_GROUP_NO not like", value, "transformerGroupNo");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupNoIn(List<String> values) {
            addCriterion("TRANSFORMER_GROUP_NO in", values, "transformerGroupNo");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupNoNotIn(List<String> values) {
            addCriterion("TRANSFORMER_GROUP_NO not in", values, "transformerGroupNo");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupNoBetween(String value1, String value2) {
            addCriterion("TRANSFORMER_GROUP_NO between", value1, value2, "transformerGroupNo");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupNoNotBetween(String value1, String value2) {
            addCriterion("TRANSFORMER_GROUP_NO not between", value1, value2, "transformerGroupNo");
            return (Criteria) this;
        }

        public Criteria andTransformerIdIsNull() {
            addCriterion("TRANSFORMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransformerIdIsNotNull() {
            addCriterion("TRANSFORMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransformerIdEqualTo(Long value) {
            addCriterion("TRANSFORMER_ID =", value, "transformerId");
            return (Criteria) this;
        }

        public Criteria andTransformerIdNotEqualTo(Long value) {
            addCriterion("TRANSFORMER_ID <>", value, "transformerId");
            return (Criteria) this;
        }

        public Criteria andTransformerIdGreaterThan(Long value) {
            addCriterion("TRANSFORMER_ID >", value, "transformerId");
            return (Criteria) this;
        }

        public Criteria andTransformerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TRANSFORMER_ID >=", value, "transformerId");
            return (Criteria) this;
        }

        public Criteria andTransformerIdLessThan(Long value) {
            addCriterion("TRANSFORMER_ID <", value, "transformerId");
            return (Criteria) this;
        }

        public Criteria andTransformerIdLessThanOrEqualTo(Long value) {
            addCriterion("TRANSFORMER_ID <=", value, "transformerId");
            return (Criteria) this;
        }

        public Criteria andTransformerIdIn(List<Long> values) {
            addCriterion("TRANSFORMER_ID in", values, "transformerId");
            return (Criteria) this;
        }

        public Criteria andTransformerIdNotIn(List<Long> values) {
            addCriterion("TRANSFORMER_ID not in", values, "transformerId");
            return (Criteria) this;
        }

        public Criteria andTransformerIdBetween(Long value1, Long value2) {
            addCriterion("TRANSFORMER_ID between", value1, value2, "transformerId");
            return (Criteria) this;
        }

        public Criteria andTransformerIdNotBetween(Long value1, Long value2) {
            addCriterion("TRANSFORMER_ID not between", value1, value2, "transformerId");
            return (Criteria) this;
        }

        public Criteria andSubsIdIsNull() {
            addCriterion("SUBS_ID is null");
            return (Criteria) this;
        }

        public Criteria andSubsIdIsNotNull() {
            addCriterion("SUBS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSubsIdEqualTo(Long value) {
            addCriterion("SUBS_ID =", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdNotEqualTo(Long value) {
            addCriterion("SUBS_ID <>", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdGreaterThan(Long value) {
            addCriterion("SUBS_ID >", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUBS_ID >=", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdLessThan(Long value) {
            addCriterion("SUBS_ID <", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdLessThanOrEqualTo(Long value) {
            addCriterion("SUBS_ID <=", value, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdIn(List<Long> values) {
            addCriterion("SUBS_ID in", values, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdNotIn(List<Long> values) {
            addCriterion("SUBS_ID not in", values, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdBetween(Long value1, Long value2) {
            addCriterion("SUBS_ID between", value1, value2, "subsId");
            return (Criteria) this;
        }

        public Criteria andSubsIdNotBetween(Long value1, Long value2) {
            addCriterion("SUBS_ID not between", value1, value2, "subsId");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNull() {
            addCriterion("LINE_ID is null");
            return (Criteria) this;
        }

        public Criteria andLineIdIsNotNull() {
            addCriterion("LINE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLineIdEqualTo(Long value) {
            addCriterion("LINE_ID =", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotEqualTo(Long value) {
            addCriterion("LINE_ID <>", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThan(Long value) {
            addCriterion("LINE_ID >", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LINE_ID >=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThan(Long value) {
            addCriterion("LINE_ID <", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdLessThanOrEqualTo(Long value) {
            addCriterion("LINE_ID <=", value, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdIn(List<Long> values) {
            addCriterion("LINE_ID in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotIn(List<Long> values) {
            addCriterion("LINE_ID not in", values, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdBetween(Long value1, Long value2) {
            addCriterion("LINE_ID between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andLineIdNotBetween(Long value1, Long value2) {
            addCriterion("LINE_ID not between", value1, value2, "lineId");
            return (Criteria) this;
        }

        public Criteria andMsTypeIsNull() {
            addCriterion("MS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMsTypeIsNotNull() {
            addCriterion("MS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMsTypeEqualTo(Short value) {
            addCriterion("MS_TYPE =", value, "msType");
            return (Criteria) this;
        }

        public Criteria andMsTypeNotEqualTo(Short value) {
            addCriterion("MS_TYPE <>", value, "msType");
            return (Criteria) this;
        }

        public Criteria andMsTypeGreaterThan(Short value) {
            addCriterion("MS_TYPE >", value, "msType");
            return (Criteria) this;
        }

        public Criteria andMsTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("MS_TYPE >=", value, "msType");
            return (Criteria) this;
        }

        public Criteria andMsTypeLessThan(Short value) {
            addCriterion("MS_TYPE <", value, "msType");
            return (Criteria) this;
        }

        public Criteria andMsTypeLessThanOrEqualTo(Short value) {
            addCriterion("MS_TYPE <=", value, "msType");
            return (Criteria) this;
        }

        public Criteria andMsTypeIn(List<Short> values) {
            addCriterion("MS_TYPE in", values, "msType");
            return (Criteria) this;
        }

        public Criteria andMsTypeNotIn(List<Short> values) {
            addCriterion("MS_TYPE not in", values, "msType");
            return (Criteria) this;
        }

        public Criteria andMsTypeBetween(Short value1, Short value2) {
            addCriterion("MS_TYPE between", value1, value2, "msType");
            return (Criteria) this;
        }

        public Criteria andMsTypeNotBetween(Short value1, Short value2) {
            addCriterion("MS_TYPE not between", value1, value2, "msType");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNull() {
            addCriterion("CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(BigDecimal value) {
            addCriterion("CAPACITY =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(BigDecimal value) {
            addCriterion("CAPACITY <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(BigDecimal value) {
            addCriterion("CAPACITY >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAPACITY >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(BigDecimal value) {
            addCriterion("CAPACITY <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAPACITY <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<BigDecimal> values) {
            addCriterion("CAPACITY in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<BigDecimal> values) {
            addCriterion("CAPACITY not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAPACITY between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAPACITY not between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andIsPubTypeIsNull() {
            addCriterion("IS_PUB_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIsPubTypeIsNotNull() {
            addCriterion("IS_PUB_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIsPubTypeEqualTo(Short value) {
            addCriterion("IS_PUB_TYPE =", value, "isPubType");
            return (Criteria) this;
        }

        public Criteria andIsPubTypeNotEqualTo(Short value) {
            addCriterion("IS_PUB_TYPE <>", value, "isPubType");
            return (Criteria) this;
        }

        public Criteria andIsPubTypeGreaterThan(Short value) {
            addCriterion("IS_PUB_TYPE >", value, "isPubType");
            return (Criteria) this;
        }

        public Criteria andIsPubTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_PUB_TYPE >=", value, "isPubType");
            return (Criteria) this;
        }

        public Criteria andIsPubTypeLessThan(Short value) {
            addCriterion("IS_PUB_TYPE <", value, "isPubType");
            return (Criteria) this;
        }

        public Criteria andIsPubTypeLessThanOrEqualTo(Short value) {
            addCriterion("IS_PUB_TYPE <=", value, "isPubType");
            return (Criteria) this;
        }

        public Criteria andIsPubTypeIn(List<Short> values) {
            addCriterion("IS_PUB_TYPE in", values, "isPubType");
            return (Criteria) this;
        }

        public Criteria andIsPubTypeNotIn(List<Short> values) {
            addCriterion("IS_PUB_TYPE not in", values, "isPubType");
            return (Criteria) this;
        }

        public Criteria andIsPubTypeBetween(Short value1, Short value2) {
            addCriterion("IS_PUB_TYPE between", value1, value2, "isPubType");
            return (Criteria) this;
        }

        public Criteria andIsPubTypeNotBetween(Short value1, Short value2) {
            addCriterion("IS_PUB_TYPE not between", value1, value2, "isPubType");
            return (Criteria) this;
        }

        public Criteria andStandTimeIsNull() {
            addCriterion("STAND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andStandTimeIsNotNull() {
            addCriterion("STAND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andStandTimeEqualTo(Integer value) {
            addCriterion("STAND_TIME =", value, "standTime");
            return (Criteria) this;
        }

        public Criteria andStandTimeNotEqualTo(Integer value) {
            addCriterion("STAND_TIME <>", value, "standTime");
            return (Criteria) this;
        }

        public Criteria andStandTimeGreaterThan(Integer value) {
            addCriterion("STAND_TIME >", value, "standTime");
            return (Criteria) this;
        }

        public Criteria andStandTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("STAND_TIME >=", value, "standTime");
            return (Criteria) this;
        }

        public Criteria andStandTimeLessThan(Integer value) {
            addCriterion("STAND_TIME <", value, "standTime");
            return (Criteria) this;
        }

        public Criteria andStandTimeLessThanOrEqualTo(Integer value) {
            addCriterion("STAND_TIME <=", value, "standTime");
            return (Criteria) this;
        }

        public Criteria andStandTimeIn(List<Integer> values) {
            addCriterion("STAND_TIME in", values, "standTime");
            return (Criteria) this;
        }

        public Criteria andStandTimeNotIn(List<Integer> values) {
            addCriterion("STAND_TIME not in", values, "standTime");
            return (Criteria) this;
        }

        public Criteria andStandTimeBetween(Integer value1, Integer value2) {
            addCriterion("STAND_TIME between", value1, value2, "standTime");
            return (Criteria) this;
        }

        public Criteria andStandTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("STAND_TIME not between", value1, value2, "standTime");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("CREATE_DATE =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("CREATE_DATE <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("CREATE_DATE >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("CREATE_DATE <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("CREATE_DATE <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("CREATE_DATE in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("CREATE_DATE not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("CREATE_DATE not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andChgManIsNull() {
            addCriterion("CHG_MAN is null");
            return (Criteria) this;
        }

        public Criteria andChgManIsNotNull() {
            addCriterion("CHG_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andChgManEqualTo(Integer value) {
            addCriterion("CHG_MAN =", value, "chgMan");
            return (Criteria) this;
        }

        public Criteria andChgManNotEqualTo(Integer value) {
            addCriterion("CHG_MAN <>", value, "chgMan");
            return (Criteria) this;
        }

        public Criteria andChgManGreaterThan(Integer value) {
            addCriterion("CHG_MAN >", value, "chgMan");
            return (Criteria) this;
        }

        public Criteria andChgManGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHG_MAN >=", value, "chgMan");
            return (Criteria) this;
        }

        public Criteria andChgManLessThan(Integer value) {
            addCriterion("CHG_MAN <", value, "chgMan");
            return (Criteria) this;
        }

        public Criteria andChgManLessThanOrEqualTo(Integer value) {
            addCriterion("CHG_MAN <=", value, "chgMan");
            return (Criteria) this;
        }

        public Criteria andChgManIn(List<Integer> values) {
            addCriterion("CHG_MAN in", values, "chgMan");
            return (Criteria) this;
        }

        public Criteria andChgManNotIn(List<Integer> values) {
            addCriterion("CHG_MAN not in", values, "chgMan");
            return (Criteria) this;
        }

        public Criteria andChgManBetween(Integer value1, Integer value2) {
            addCriterion("CHG_MAN between", value1, value2, "chgMan");
            return (Criteria) this;
        }

        public Criteria andChgManNotBetween(Integer value1, Integer value2) {
            addCriterion("CHG_MAN not between", value1, value2, "chgMan");
            return (Criteria) this;
        }

        public Criteria andChgDateIsNull() {
            addCriterion("CHG_DATE is null");
            return (Criteria) this;
        }

        public Criteria andChgDateIsNotNull() {
            addCriterion("CHG_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andChgDateEqualTo(Date value) {
            addCriterionForJDBCDate("CHG_DATE =", value, "chgDate");
            return (Criteria) this;
        }

        public Criteria andChgDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CHG_DATE <>", value, "chgDate");
            return (Criteria) this;
        }

        public Criteria andChgDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CHG_DATE >", value, "chgDate");
            return (Criteria) this;
        }

        public Criteria andChgDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHG_DATE >=", value, "chgDate");
            return (Criteria) this;
        }

        public Criteria andChgDateLessThan(Date value) {
            addCriterionForJDBCDate("CHG_DATE <", value, "chgDate");
            return (Criteria) this;
        }

        public Criteria andChgDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHG_DATE <=", value, "chgDate");
            return (Criteria) this;
        }

        public Criteria andChgDateIn(List<Date> values) {
            addCriterionForJDBCDate("CHG_DATE in", values, "chgDate");
            return (Criteria) this;
        }

        public Criteria andChgDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CHG_DATE not in", values, "chgDate");
            return (Criteria) this;
        }

        public Criteria andChgDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHG_DATE between", value1, value2, "chgDate");
            return (Criteria) this;
        }

        public Criteria andChgDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHG_DATE not between", value1, value2, "chgDate");
            return (Criteria) this;
        }

        public Criteria andChgAddressIsNull() {
            addCriterion("CHG_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andChgAddressIsNotNull() {
            addCriterion("CHG_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andChgAddressEqualTo(String value) {
            addCriterion("CHG_ADDRESS =", value, "chgAddress");
            return (Criteria) this;
        }

        public Criteria andChgAddressNotEqualTo(String value) {
            addCriterion("CHG_ADDRESS <>", value, "chgAddress");
            return (Criteria) this;
        }

        public Criteria andChgAddressGreaterThan(String value) {
            addCriterion("CHG_ADDRESS >", value, "chgAddress");
            return (Criteria) this;
        }

        public Criteria andChgAddressGreaterThanOrEqualTo(String value) {
            addCriterion("CHG_ADDRESS >=", value, "chgAddress");
            return (Criteria) this;
        }

        public Criteria andChgAddressLessThan(String value) {
            addCriterion("CHG_ADDRESS <", value, "chgAddress");
            return (Criteria) this;
        }

        public Criteria andChgAddressLessThanOrEqualTo(String value) {
            addCriterion("CHG_ADDRESS <=", value, "chgAddress");
            return (Criteria) this;
        }

        public Criteria andChgAddressLike(String value) {
            addCriterion("CHG_ADDRESS like", value, "chgAddress");
            return (Criteria) this;
        }

        public Criteria andChgAddressNotLike(String value) {
            addCriterion("CHG_ADDRESS not like", value, "chgAddress");
            return (Criteria) this;
        }

        public Criteria andChgAddressIn(List<String> values) {
            addCriterion("CHG_ADDRESS in", values, "chgAddress");
            return (Criteria) this;
        }

        public Criteria andChgAddressNotIn(List<String> values) {
            addCriterion("CHG_ADDRESS not in", values, "chgAddress");
            return (Criteria) this;
        }

        public Criteria andChgAddressBetween(String value1, String value2) {
            addCriterion("CHG_ADDRESS between", value1, value2, "chgAddress");
            return (Criteria) this;
        }

        public Criteria andChgAddressNotBetween(String value1, String value2) {
            addCriterion("CHG_ADDRESS not between", value1, value2, "chgAddress");
            return (Criteria) this;
        }

        public Criteria andDeskNameIsNull() {
            addCriterion("DESK_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeskNameIsNotNull() {
            addCriterion("DESK_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeskNameEqualTo(String value) {
            addCriterion("DESK_NAME =", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameNotEqualTo(String value) {
            addCriterion("DESK_NAME <>", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameGreaterThan(String value) {
            addCriterion("DESK_NAME >", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameGreaterThanOrEqualTo(String value) {
            addCriterion("DESK_NAME >=", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameLessThan(String value) {
            addCriterion("DESK_NAME <", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameLessThanOrEqualTo(String value) {
            addCriterion("DESK_NAME <=", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameLike(String value) {
            addCriterion("DESK_NAME like", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameNotLike(String value) {
            addCriterion("DESK_NAME not like", value, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameIn(List<String> values) {
            addCriterion("DESK_NAME in", values, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameNotIn(List<String> values) {
            addCriterion("DESK_NAME not in", values, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameBetween(String value1, String value2) {
            addCriterion("DESK_NAME between", value1, value2, "deskName");
            return (Criteria) this;
        }

        public Criteria andDeskNameNotBetween(String value1, String value2) {
            addCriterion("DESK_NAME not between", value1, value2, "deskName");
            return (Criteria) this;
        }

        public Criteria andTransformerRelIdIsNull() {
            addCriterion("TRANSFORMER_REL_ID is null");
            return (Criteria) this;
        }

        public Criteria andTransformerRelIdIsNotNull() {
            addCriterion("TRANSFORMER_REL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTransformerRelIdEqualTo(Long value) {
            addCriterion("TRANSFORMER_REL_ID =", value, "transformerRelId");
            return (Criteria) this;
        }

        public Criteria andTransformerRelIdNotEqualTo(Long value) {
            addCriterion("TRANSFORMER_REL_ID <>", value, "transformerRelId");
            return (Criteria) this;
        }

        public Criteria andTransformerRelIdGreaterThan(Long value) {
            addCriterion("TRANSFORMER_REL_ID >", value, "transformerRelId");
            return (Criteria) this;
        }

        public Criteria andTransformerRelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TRANSFORMER_REL_ID >=", value, "transformerRelId");
            return (Criteria) this;
        }

        public Criteria andTransformerRelIdLessThan(Long value) {
            addCriterion("TRANSFORMER_REL_ID <", value, "transformerRelId");
            return (Criteria) this;
        }

        public Criteria andTransformerRelIdLessThanOrEqualTo(Long value) {
            addCriterion("TRANSFORMER_REL_ID <=", value, "transformerRelId");
            return (Criteria) this;
        }

        public Criteria andTransformerRelIdIn(List<Long> values) {
            addCriterion("TRANSFORMER_REL_ID in", values, "transformerRelId");
            return (Criteria) this;
        }

        public Criteria andTransformerRelIdNotIn(List<Long> values) {
            addCriterion("TRANSFORMER_REL_ID not in", values, "transformerRelId");
            return (Criteria) this;
        }

        public Criteria andTransformerRelIdBetween(Long value1, Long value2) {
            addCriterion("TRANSFORMER_REL_ID between", value1, value2, "transformerRelId");
            return (Criteria) this;
        }

        public Criteria andTransformerRelIdNotBetween(Long value1, Long value2) {
            addCriterion("TRANSFORMER_REL_ID not between", value1, value2, "transformerRelId");
            return (Criteria) this;
        }

        public Criteria andTransformerNoIsNull() {
            addCriterion("TRANSFORMER_NO is null");
            return (Criteria) this;
        }

        public Criteria andTransformerNoIsNotNull() {
            addCriterion("TRANSFORMER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTransformerNoEqualTo(Long value) {
            addCriterion("TRANSFORMER_NO =", value, "transformerNo");
            return (Criteria) this;
        }

        public Criteria andTransformerNoNotEqualTo(Long value) {
            addCriterion("TRANSFORMER_NO <>", value, "transformerNo");
            return (Criteria) this;
        }

        public Criteria andTransformerNoGreaterThan(Long value) {
            addCriterion("TRANSFORMER_NO >", value, "transformerNo");
            return (Criteria) this;
        }

        public Criteria andTransformerNoGreaterThanOrEqualTo(Long value) {
            addCriterion("TRANSFORMER_NO >=", value, "transformerNo");
            return (Criteria) this;
        }

        public Criteria andTransformerNoLessThan(Long value) {
            addCriterion("TRANSFORMER_NO <", value, "transformerNo");
            return (Criteria) this;
        }

        public Criteria andTransformerNoLessThanOrEqualTo(Long value) {
            addCriterion("TRANSFORMER_NO <=", value, "transformerNo");
            return (Criteria) this;
        }

        public Criteria andTransformerNoIn(List<Long> values) {
            addCriterion("TRANSFORMER_NO in", values, "transformerNo");
            return (Criteria) this;
        }

        public Criteria andTransformerNoNotIn(List<Long> values) {
            addCriterion("TRANSFORMER_NO not in", values, "transformerNo");
            return (Criteria) this;
        }

        public Criteria andTransformerNoBetween(Long value1, Long value2) {
            addCriterion("TRANSFORMER_NO between", value1, value2, "transformerNo");
            return (Criteria) this;
        }

        public Criteria andTransformerNoNotBetween(Long value1, Long value2) {
            addCriterion("TRANSFORMER_NO not between", value1, value2, "transformerNo");
            return (Criteria) this;
        }

        public Criteria andSubsNameIsNull() {
            addCriterion("SUBS_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSubsNameIsNotNull() {
            addCriterion("SUBS_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSubsNameEqualTo(String value) {
            addCriterion("SUBS_NAME =", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameNotEqualTo(String value) {
            addCriterion("SUBS_NAME <>", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameGreaterThan(String value) {
            addCriterion("SUBS_NAME >", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameGreaterThanOrEqualTo(String value) {
            addCriterion("SUBS_NAME >=", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameLessThan(String value) {
            addCriterion("SUBS_NAME <", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameLessThanOrEqualTo(String value) {
            addCriterion("SUBS_NAME <=", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameLike(String value) {
            addCriterion("SUBS_NAME like", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameNotLike(String value) {
            addCriterion("SUBS_NAME not like", value, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameIn(List<String> values) {
            addCriterion("SUBS_NAME in", values, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameNotIn(List<String> values) {
            addCriterion("SUBS_NAME not in", values, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameBetween(String value1, String value2) {
            addCriterion("SUBS_NAME between", value1, value2, "subsName");
            return (Criteria) this;
        }

        public Criteria andSubsNameNotBetween(String value1, String value2) {
            addCriterion("SUBS_NAME not between", value1, value2, "subsName");
            return (Criteria) this;
        }

        public Criteria andLineNameIsNull() {
            addCriterion("LINE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andLineNameIsNotNull() {
            addCriterion("LINE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andLineNameEqualTo(String value) {
            addCriterion("LINE_NAME =", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotEqualTo(String value) {
            addCriterion("LINE_NAME <>", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameGreaterThan(String value) {
            addCriterion("LINE_NAME >", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameGreaterThanOrEqualTo(String value) {
            addCriterion("LINE_NAME >=", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLessThan(String value) {
            addCriterion("LINE_NAME <", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLessThanOrEqualTo(String value) {
            addCriterion("LINE_NAME <=", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameLike(String value) {
            addCriterion("LINE_NAME like", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotLike(String value) {
            addCriterion("LINE_NAME not like", value, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameIn(List<String> values) {
            addCriterion("LINE_NAME in", values, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotIn(List<String> values) {
            addCriterion("LINE_NAME not in", values, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameBetween(String value1, String value2) {
            addCriterion("LINE_NAME between", value1, value2, "lineName");
            return (Criteria) this;
        }

        public Criteria andLineNameNotBetween(String value1, String value2) {
            addCriterion("LINE_NAME not between", value1, value2, "lineName");
            return (Criteria) this;
        }

        public Criteria andTransformerLossTypeIsNull() {
            addCriterion("TRANSFORMER_LOSS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransformerLossTypeIsNotNull() {
            addCriterion("TRANSFORMER_LOSS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransformerLossTypeEqualTo(Short value) {
            addCriterion("TRANSFORMER_LOSS_TYPE =", value, "transformerLossType");
            return (Criteria) this;
        }

        public Criteria andTransformerLossTypeNotEqualTo(Short value) {
            addCriterion("TRANSFORMER_LOSS_TYPE <>", value, "transformerLossType");
            return (Criteria) this;
        }

        public Criteria andTransformerLossTypeGreaterThan(Short value) {
            addCriterion("TRANSFORMER_LOSS_TYPE >", value, "transformerLossType");
            return (Criteria) this;
        }

        public Criteria andTransformerLossTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TRANSFORMER_LOSS_TYPE >=", value, "transformerLossType");
            return (Criteria) this;
        }

        public Criteria andTransformerLossTypeLessThan(Short value) {
            addCriterion("TRANSFORMER_LOSS_TYPE <", value, "transformerLossType");
            return (Criteria) this;
        }

        public Criteria andTransformerLossTypeLessThanOrEqualTo(Short value) {
            addCriterion("TRANSFORMER_LOSS_TYPE <=", value, "transformerLossType");
            return (Criteria) this;
        }

        public Criteria andTransformerLossTypeIn(List<Short> values) {
            addCriterion("TRANSFORMER_LOSS_TYPE in", values, "transformerLossType");
            return (Criteria) this;
        }

        public Criteria andTransformerLossTypeNotIn(List<Short> values) {
            addCriterion("TRANSFORMER_LOSS_TYPE not in", values, "transformerLossType");
            return (Criteria) this;
        }

        public Criteria andTransformerLossTypeBetween(Short value1, Short value2) {
            addCriterion("TRANSFORMER_LOSS_TYPE between", value1, value2, "transformerLossType");
            return (Criteria) this;
        }

        public Criteria andTransformerLossTypeNotBetween(Short value1, Short value2) {
            addCriterion("TRANSFORMER_LOSS_TYPE not between", value1, value2, "transformerLossType");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeIsNull() {
            addCriterion("BUSINESS_PLACE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeIsNotNull() {
            addCriterion("BUSINESS_PLACE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeEqualTo(Long value) {
            addCriterion("BUSINESS_PLACE_CODE =", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeNotEqualTo(Long value) {
            addCriterion("BUSINESS_PLACE_CODE <>", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeGreaterThan(Long value) {
            addCriterion("BUSINESS_PLACE_CODE >", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeGreaterThanOrEqualTo(Long value) {
            addCriterion("BUSINESS_PLACE_CODE >=", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeLessThan(Long value) {
            addCriterion("BUSINESS_PLACE_CODE <", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeLessThanOrEqualTo(Long value) {
            addCriterion("BUSINESS_PLACE_CODE <=", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeIn(List<Long> values) {
            addCriterion("BUSINESS_PLACE_CODE in", values, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeNotIn(List<Long> values) {
            addCriterion("BUSINESS_PLACE_CODE not in", values, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeBetween(Long value1, Long value2) {
            addCriterion("BUSINESS_PLACE_CODE between", value1, value2, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeNotBetween(Long value1, Long value2) {
            addCriterion("BUSINESS_PLACE_CODE not between", value1, value2, "businessPlaceCode");
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

        public Criteria andTaskIdEqualTo(Long value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(Long value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(Long value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(Long value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(Long value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<Long> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<Long> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(Long value1, Long value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(Long value1, Long value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andFlagIsNull() {
            addCriterion("FLAG is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Short value) {
            addCriterion("FLAG =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Short value) {
            addCriterion("FLAG <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Short value) {
            addCriterion("FLAG >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("FLAG >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Short value) {
            addCriterion("FLAG <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Short value) {
            addCriterion("FLAG <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Short> values) {
            addCriterion("FLAG in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Short> values) {
            addCriterion("FLAG not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Short value1, Short value2) {
            addCriterion("FLAG between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Short value1, Short value2) {
            addCriterion("FLAG not between", value1, value2, "flag");
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