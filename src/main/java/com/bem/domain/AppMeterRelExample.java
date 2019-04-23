package com.bem.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppMeterRelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppMeterRelExample() {
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

        public Criteria andPMeterIdIsNull() {
            addCriterion("P_METER_ID is null");
            return (Criteria) this;
        }

        public Criteria andPMeterIdIsNotNull() {
            addCriterion("P_METER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPMeterIdEqualTo(Long value) {
            addCriterion("P_METER_ID =", value, "pMeterId");
            return (Criteria) this;
        }

        public Criteria andPMeterIdNotEqualTo(Long value) {
            addCriterion("P_METER_ID <>", value, "pMeterId");
            return (Criteria) this;
        }

        public Criteria andPMeterIdGreaterThan(Long value) {
            addCriterion("P_METER_ID >", value, "pMeterId");
            return (Criteria) this;
        }

        public Criteria andPMeterIdGreaterThanOrEqualTo(Long value) {
            addCriterion("P_METER_ID >=", value, "pMeterId");
            return (Criteria) this;
        }

        public Criteria andPMeterIdLessThan(Long value) {
            addCriterion("P_METER_ID <", value, "pMeterId");
            return (Criteria) this;
        }

        public Criteria andPMeterIdLessThanOrEqualTo(Long value) {
            addCriterion("P_METER_ID <=", value, "pMeterId");
            return (Criteria) this;
        }

        public Criteria andPMeterIdIn(List<Long> values) {
            addCriterion("P_METER_ID in", values, "pMeterId");
            return (Criteria) this;
        }

        public Criteria andPMeterIdNotIn(List<Long> values) {
            addCriterion("P_METER_ID not in", values, "pMeterId");
            return (Criteria) this;
        }

        public Criteria andPMeterIdBetween(Long value1, Long value2) {
            addCriterion("P_METER_ID between", value1, value2, "pMeterId");
            return (Criteria) this;
        }

        public Criteria andPMeterIdNotBetween(Long value1, Long value2) {
            addCriterion("P_METER_ID not between", value1, value2, "pMeterId");
            return (Criteria) this;
        }

        public Criteria andMeterRelationTypeIsNull() {
            addCriterion("METER_RELATION_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMeterRelationTypeIsNotNull() {
            addCriterion("METER_RELATION_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMeterRelationTypeEqualTo(Short value) {
            addCriterion("METER_RELATION_TYPE =", value, "meterRelationType");
            return (Criteria) this;
        }

        public Criteria andMeterRelationTypeNotEqualTo(Short value) {
            addCriterion("METER_RELATION_TYPE <>", value, "meterRelationType");
            return (Criteria) this;
        }

        public Criteria andMeterRelationTypeGreaterThan(Short value) {
            addCriterion("METER_RELATION_TYPE >", value, "meterRelationType");
            return (Criteria) this;
        }

        public Criteria andMeterRelationTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("METER_RELATION_TYPE >=", value, "meterRelationType");
            return (Criteria) this;
        }

        public Criteria andMeterRelationTypeLessThan(Short value) {
            addCriterion("METER_RELATION_TYPE <", value, "meterRelationType");
            return (Criteria) this;
        }

        public Criteria andMeterRelationTypeLessThanOrEqualTo(Short value) {
            addCriterion("METER_RELATION_TYPE <=", value, "meterRelationType");
            return (Criteria) this;
        }

        public Criteria andMeterRelationTypeIn(List<Short> values) {
            addCriterion("METER_RELATION_TYPE in", values, "meterRelationType");
            return (Criteria) this;
        }

        public Criteria andMeterRelationTypeNotIn(List<Short> values) {
            addCriterion("METER_RELATION_TYPE not in", values, "meterRelationType");
            return (Criteria) this;
        }

        public Criteria andMeterRelationTypeBetween(Short value1, Short value2) {
            addCriterion("METER_RELATION_TYPE between", value1, value2, "meterRelationType");
            return (Criteria) this;
        }

        public Criteria andMeterRelationTypeNotBetween(Short value1, Short value2) {
            addCriterion("METER_RELATION_TYPE not between", value1, value2, "meterRelationType");
            return (Criteria) this;
        }

        public Criteria andMeterRelationValueIsNull() {
            addCriterion("METER_RELATION_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andMeterRelationValueIsNotNull() {
            addCriterion("METER_RELATION_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andMeterRelationValueEqualTo(BigDecimal value) {
            addCriterion("METER_RELATION_VALUE =", value, "meterRelationValue");
            return (Criteria) this;
        }

        public Criteria andMeterRelationValueNotEqualTo(BigDecimal value) {
            addCriterion("METER_RELATION_VALUE <>", value, "meterRelationValue");
            return (Criteria) this;
        }

        public Criteria andMeterRelationValueGreaterThan(BigDecimal value) {
            addCriterion("METER_RELATION_VALUE >", value, "meterRelationValue");
            return (Criteria) this;
        }

        public Criteria andMeterRelationValueGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("METER_RELATION_VALUE >=", value, "meterRelationValue");
            return (Criteria) this;
        }

        public Criteria andMeterRelationValueLessThan(BigDecimal value) {
            addCriterion("METER_RELATION_VALUE <", value, "meterRelationValue");
            return (Criteria) this;
        }

        public Criteria andMeterRelationValueLessThanOrEqualTo(BigDecimal value) {
            addCriterion("METER_RELATION_VALUE <=", value, "meterRelationValue");
            return (Criteria) this;
        }

        public Criteria andMeterRelationValueIn(List<BigDecimal> values) {
            addCriterion("METER_RELATION_VALUE in", values, "meterRelationValue");
            return (Criteria) this;
        }

        public Criteria andMeterRelationValueNotIn(List<BigDecimal> values) {
            addCriterion("METER_RELATION_VALUE not in", values, "meterRelationValue");
            return (Criteria) this;
        }

        public Criteria andMeterRelationValueBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("METER_RELATION_VALUE between", value1, value2, "meterRelationValue");
            return (Criteria) this;
        }

        public Criteria andMeterRelationValueNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("METER_RELATION_VALUE not between", value1, value2, "meterRelationValue");
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

        public Criteria andUpdateDateIsNull() {
            addCriterion("UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("UPDATE_DATE =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("UPDATE_DATE <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("UPDATE_DATE >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("UPDATE_DATE <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("UPDATE_DATE <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("UPDATE_DATE in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("UPDATE_DATE not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("UPDATE_DATE not between", value1, value2, "updateDate");
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