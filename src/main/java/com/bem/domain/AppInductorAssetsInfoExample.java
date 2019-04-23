package com.bem.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AppInductorAssetsInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppInductorAssetsInfoExample() {
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

        public Criteria andMeterIdIsNull() {
            addCriterion("METER_ID is null");
            return (Criteria) this;
        }

        public Criteria andMeterIdIsNotNull() {
            addCriterion("METER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMeterIdEqualTo(Integer value) {
            addCriterion("METER_ID =", value, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdNotEqualTo(Integer value) {
            addCriterion("METER_ID <>", value, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdGreaterThan(Integer value) {
            addCriterion("METER_ID >", value, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("METER_ID >=", value, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdLessThan(Integer value) {
            addCriterion("METER_ID <", value, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdLessThanOrEqualTo(Integer value) {
            addCriterion("METER_ID <=", value, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdIn(List<Integer> values) {
            addCriterion("METER_ID in", values, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdNotIn(List<Integer> values) {
            addCriterion("METER_ID not in", values, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdBetween(Integer value1, Integer value2) {
            addCriterion("METER_ID between", value1, value2, "meterId");
            return (Criteria) this;
        }

        public Criteria andMeterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("METER_ID not between", value1, value2, "meterId");
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

        public Criteria andInductorAssetsNoIsNull() {
            addCriterion("INDUCTOR_ASSETS_NO is null");
            return (Criteria) this;
        }

        public Criteria andInductorAssetsNoIsNotNull() {
            addCriterion("INDUCTOR_ASSETS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andInductorAssetsNoEqualTo(String value) {
            addCriterion("INDUCTOR_ASSETS_NO =", value, "inductorAssetsNo");
            return (Criteria) this;
        }

        public Criteria andInductorAssetsNoNotEqualTo(String value) {
            addCriterion("INDUCTOR_ASSETS_NO <>", value, "inductorAssetsNo");
            return (Criteria) this;
        }

        public Criteria andInductorAssetsNoGreaterThan(String value) {
            addCriterion("INDUCTOR_ASSETS_NO >", value, "inductorAssetsNo");
            return (Criteria) this;
        }

        public Criteria andInductorAssetsNoGreaterThanOrEqualTo(String value) {
            addCriterion("INDUCTOR_ASSETS_NO >=", value, "inductorAssetsNo");
            return (Criteria) this;
        }

        public Criteria andInductorAssetsNoLessThan(String value) {
            addCriterion("INDUCTOR_ASSETS_NO <", value, "inductorAssetsNo");
            return (Criteria) this;
        }

        public Criteria andInductorAssetsNoLessThanOrEqualTo(String value) {
            addCriterion("INDUCTOR_ASSETS_NO <=", value, "inductorAssetsNo");
            return (Criteria) this;
        }

        public Criteria andInductorAssetsNoLike(String value) {
            addCriterion("INDUCTOR_ASSETS_NO like", value, "inductorAssetsNo");
            return (Criteria) this;
        }

        public Criteria andInductorAssetsNoNotLike(String value) {
            addCriterion("INDUCTOR_ASSETS_NO not like", value, "inductorAssetsNo");
            return (Criteria) this;
        }

        public Criteria andInductorAssetsNoIn(List<String> values) {
            addCriterion("INDUCTOR_ASSETS_NO in", values, "inductorAssetsNo");
            return (Criteria) this;
        }

        public Criteria andInductorAssetsNoNotIn(List<String> values) {
            addCriterion("INDUCTOR_ASSETS_NO not in", values, "inductorAssetsNo");
            return (Criteria) this;
        }

        public Criteria andInductorAssetsNoBetween(String value1, String value2) {
            addCriterion("INDUCTOR_ASSETS_NO between", value1, value2, "inductorAssetsNo");
            return (Criteria) this;
        }

        public Criteria andInductorAssetsNoNotBetween(String value1, String value2) {
            addCriterion("INDUCTOR_ASSETS_NO not between", value1, value2, "inductorAssetsNo");
            return (Criteria) this;
        }

        public Criteria andInductorTypeIsNull() {
            addCriterion("INDUCTOR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInductorTypeIsNotNull() {
            addCriterion("INDUCTOR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInductorTypeEqualTo(Short value) {
            addCriterion("INDUCTOR_TYPE =", value, "inductorType");
            return (Criteria) this;
        }

        public Criteria andInductorTypeNotEqualTo(Short value) {
            addCriterion("INDUCTOR_TYPE <>", value, "inductorType");
            return (Criteria) this;
        }

        public Criteria andInductorTypeGreaterThan(Short value) {
            addCriterion("INDUCTOR_TYPE >", value, "inductorType");
            return (Criteria) this;
        }

        public Criteria andInductorTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("INDUCTOR_TYPE >=", value, "inductorType");
            return (Criteria) this;
        }

        public Criteria andInductorTypeLessThan(Short value) {
            addCriterion("INDUCTOR_TYPE <", value, "inductorType");
            return (Criteria) this;
        }

        public Criteria andInductorTypeLessThanOrEqualTo(Short value) {
            addCriterion("INDUCTOR_TYPE <=", value, "inductorType");
            return (Criteria) this;
        }

        public Criteria andInductorTypeIn(List<Short> values) {
            addCriterion("INDUCTOR_TYPE in", values, "inductorType");
            return (Criteria) this;
        }

        public Criteria andInductorTypeNotIn(List<Short> values) {
            addCriterion("INDUCTOR_TYPE not in", values, "inductorType");
            return (Criteria) this;
        }

        public Criteria andInductorTypeBetween(Short value1, Short value2) {
            addCriterion("INDUCTOR_TYPE between", value1, value2, "inductorType");
            return (Criteria) this;
        }

        public Criteria andInductorTypeNotBetween(Short value1, Short value2) {
            addCriterion("INDUCTOR_TYPE not between", value1, value2, "inductorType");
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