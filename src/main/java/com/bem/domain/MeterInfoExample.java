package com.bem.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MeterInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MeterInfoExample() {
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

        public Criteria andSetAddressIsNull() {
            addCriterion("SET_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andSetAddressIsNotNull() {
            addCriterion("SET_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andSetAddressEqualTo(String value) {
            addCriterion("SET_ADDRESS =", value, "setAddress");
            return (Criteria) this;
        }

        public Criteria andSetAddressNotEqualTo(String value) {
            addCriterion("SET_ADDRESS <>", value, "setAddress");
            return (Criteria) this;
        }

        public Criteria andSetAddressGreaterThan(String value) {
            addCriterion("SET_ADDRESS >", value, "setAddress");
            return (Criteria) this;
        }

        public Criteria andSetAddressGreaterThanOrEqualTo(String value) {
            addCriterion("SET_ADDRESS >=", value, "setAddress");
            return (Criteria) this;
        }

        public Criteria andSetAddressLessThan(String value) {
            addCriterion("SET_ADDRESS <", value, "setAddress");
            return (Criteria) this;
        }

        public Criteria andSetAddressLessThanOrEqualTo(String value) {
            addCriterion("SET_ADDRESS <=", value, "setAddress");
            return (Criteria) this;
        }

        public Criteria andSetAddressLike(String value) {
            addCriterion("SET_ADDRESS like", value, "setAddress");
            return (Criteria) this;
        }

        public Criteria andSetAddressNotLike(String value) {
            addCriterion("SET_ADDRESS not like", value, "setAddress");
            return (Criteria) this;
        }

        public Criteria andSetAddressIn(List<String> values) {
            addCriterion("SET_ADDRESS in", values, "setAddress");
            return (Criteria) this;
        }

        public Criteria andSetAddressNotIn(List<String> values) {
            addCriterion("SET_ADDRESS not in", values, "setAddress");
            return (Criteria) this;
        }

        public Criteria andSetAddressBetween(String value1, String value2) {
            addCriterion("SET_ADDRESS between", value1, value2, "setAddress");
            return (Criteria) this;
        }

        public Criteria andSetAddressNotBetween(String value1, String value2) {
            addCriterion("SET_ADDRESS not between", value1, value2, "setAddress");
            return (Criteria) this;
        }

        public Criteria andCtAssetsIdIsNull() {
            addCriterion("CT_ASSETS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCtAssetsIdIsNotNull() {
            addCriterion("CT_ASSETS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCtAssetsIdEqualTo(Long value) {
            addCriterion("CT_ASSETS_ID =", value, "ctAssetsId");
            return (Criteria) this;
        }

        public Criteria andCtAssetsIdNotEqualTo(Long value) {
            addCriterion("CT_ASSETS_ID <>", value, "ctAssetsId");
            return (Criteria) this;
        }

        public Criteria andCtAssetsIdGreaterThan(Long value) {
            addCriterion("CT_ASSETS_ID >", value, "ctAssetsId");
            return (Criteria) this;
        }

        public Criteria andCtAssetsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CT_ASSETS_ID >=", value, "ctAssetsId");
            return (Criteria) this;
        }

        public Criteria andCtAssetsIdLessThan(Long value) {
            addCriterion("CT_ASSETS_ID <", value, "ctAssetsId");
            return (Criteria) this;
        }

        public Criteria andCtAssetsIdLessThanOrEqualTo(Long value) {
            addCriterion("CT_ASSETS_ID <=", value, "ctAssetsId");
            return (Criteria) this;
        }

        public Criteria andCtAssetsIdIn(List<Long> values) {
            addCriterion("CT_ASSETS_ID in", values, "ctAssetsId");
            return (Criteria) this;
        }

        public Criteria andCtAssetsIdNotIn(List<Long> values) {
            addCriterion("CT_ASSETS_ID not in", values, "ctAssetsId");
            return (Criteria) this;
        }

        public Criteria andCtAssetsIdBetween(Long value1, Long value2) {
            addCriterion("CT_ASSETS_ID between", value1, value2, "ctAssetsId");
            return (Criteria) this;
        }

        public Criteria andCtAssetsIdNotBetween(Long value1, Long value2) {
            addCriterion("CT_ASSETS_ID not between", value1, value2, "ctAssetsId");
            return (Criteria) this;
        }

        public Criteria andPtAssetsIdIsNull() {
            addCriterion("PT_ASSETS_ID is null");
            return (Criteria) this;
        }

        public Criteria andPtAssetsIdIsNotNull() {
            addCriterion("PT_ASSETS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPtAssetsIdEqualTo(Long value) {
            addCriterion("PT_ASSETS_ID =", value, "ptAssetsId");
            return (Criteria) this;
        }

        public Criteria andPtAssetsIdNotEqualTo(Long value) {
            addCriterion("PT_ASSETS_ID <>", value, "ptAssetsId");
            return (Criteria) this;
        }

        public Criteria andPtAssetsIdGreaterThan(Long value) {
            addCriterion("PT_ASSETS_ID >", value, "ptAssetsId");
            return (Criteria) this;
        }

        public Criteria andPtAssetsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PT_ASSETS_ID >=", value, "ptAssetsId");
            return (Criteria) this;
        }

        public Criteria andPtAssetsIdLessThan(Long value) {
            addCriterion("PT_ASSETS_ID <", value, "ptAssetsId");
            return (Criteria) this;
        }

        public Criteria andPtAssetsIdLessThanOrEqualTo(Long value) {
            addCriterion("PT_ASSETS_ID <=", value, "ptAssetsId");
            return (Criteria) this;
        }

        public Criteria andPtAssetsIdIn(List<Long> values) {
            addCriterion("PT_ASSETS_ID in", values, "ptAssetsId");
            return (Criteria) this;
        }

        public Criteria andPtAssetsIdNotIn(List<Long> values) {
            addCriterion("PT_ASSETS_ID not in", values, "ptAssetsId");
            return (Criteria) this;
        }

        public Criteria andPtAssetsIdBetween(Long value1, Long value2) {
            addCriterion("PT_ASSETS_ID between", value1, value2, "ptAssetsId");
            return (Criteria) this;
        }

        public Criteria andPtAssetsIdNotBetween(Long value1, Long value2) {
            addCriterion("PT_ASSETS_ID not between", value1, value2, "ptAssetsId");
            return (Criteria) this;
        }

        public Criteria andCtValueIsNull() {
            addCriterion("CT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andCtValueIsNotNull() {
            addCriterion("CT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andCtValueEqualTo(String value) {
            addCriterion("CT_VALUE =", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueNotEqualTo(String value) {
            addCriterion("CT_VALUE <>", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueGreaterThan(String value) {
            addCriterion("CT_VALUE >", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueGreaterThanOrEqualTo(String value) {
            addCriterion("CT_VALUE >=", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueLessThan(String value) {
            addCriterion("CT_VALUE <", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueLessThanOrEqualTo(String value) {
            addCriterion("CT_VALUE <=", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueLike(String value) {
            addCriterion("CT_VALUE like", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueNotLike(String value) {
            addCriterion("CT_VALUE not like", value, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueIn(List<String> values) {
            addCriterion("CT_VALUE in", values, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueNotIn(List<String> values) {
            addCriterion("CT_VALUE not in", values, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueBetween(String value1, String value2) {
            addCriterion("CT_VALUE between", value1, value2, "ctValue");
            return (Criteria) this;
        }

        public Criteria andCtValueNotBetween(String value1, String value2) {
            addCriterion("CT_VALUE not between", value1, value2, "ctValue");
            return (Criteria) this;
        }

        public Criteria andPtValueIsNull() {
            addCriterion("PT_VALUE is null");
            return (Criteria) this;
        }

        public Criteria andPtValueIsNotNull() {
            addCriterion("PT_VALUE is not null");
            return (Criteria) this;
        }

        public Criteria andPtValueEqualTo(String value) {
            addCriterion("PT_VALUE =", value, "ptValue");
            return (Criteria) this;
        }

        public Criteria andPtValueNotEqualTo(String value) {
            addCriterion("PT_VALUE <>", value, "ptValue");
            return (Criteria) this;
        }

        public Criteria andPtValueGreaterThan(String value) {
            addCriterion("PT_VALUE >", value, "ptValue");
            return (Criteria) this;
        }

        public Criteria andPtValueGreaterThanOrEqualTo(String value) {
            addCriterion("PT_VALUE >=", value, "ptValue");
            return (Criteria) this;
        }

        public Criteria andPtValueLessThan(String value) {
            addCriterion("PT_VALUE <", value, "ptValue");
            return (Criteria) this;
        }

        public Criteria andPtValueLessThanOrEqualTo(String value) {
            addCriterion("PT_VALUE <=", value, "ptValue");
            return (Criteria) this;
        }

        public Criteria andPtValueLike(String value) {
            addCriterion("PT_VALUE like", value, "ptValue");
            return (Criteria) this;
        }

        public Criteria andPtValueNotLike(String value) {
            addCriterion("PT_VALUE not like", value, "ptValue");
            return (Criteria) this;
        }

        public Criteria andPtValueIn(List<String> values) {
            addCriterion("PT_VALUE in", values, "ptValue");
            return (Criteria) this;
        }

        public Criteria andPtValueNotIn(List<String> values) {
            addCriterion("PT_VALUE not in", values, "ptValue");
            return (Criteria) this;
        }

        public Criteria andPtValueBetween(String value1, String value2) {
            addCriterion("PT_VALUE between", value1, value2, "ptValue");
            return (Criteria) this;
        }

        public Criteria andPtValueNotBetween(String value1, String value2) {
            addCriterion("PT_VALUE not between", value1, value2, "ptValue");
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

        public Criteria andNeedIndexIsNull() {
            addCriterion("NEED_INDEX is null");
            return (Criteria) this;
        }

        public Criteria andNeedIndexIsNotNull() {
            addCriterion("NEED_INDEX is not null");
            return (Criteria) this;
        }

        public Criteria andNeedIndexEqualTo(Integer value) {
            addCriterion("NEED_INDEX =", value, "needIndex");
            return (Criteria) this;
        }

        public Criteria andNeedIndexNotEqualTo(Integer value) {
            addCriterion("NEED_INDEX <>", value, "needIndex");
            return (Criteria) this;
        }

        public Criteria andNeedIndexGreaterThan(Integer value) {
            addCriterion("NEED_INDEX >", value, "needIndex");
            return (Criteria) this;
        }

        public Criteria andNeedIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("NEED_INDEX >=", value, "needIndex");
            return (Criteria) this;
        }

        public Criteria andNeedIndexLessThan(Integer value) {
            addCriterion("NEED_INDEX <", value, "needIndex");
            return (Criteria) this;
        }

        public Criteria andNeedIndexLessThanOrEqualTo(Integer value) {
            addCriterion("NEED_INDEX <=", value, "needIndex");
            return (Criteria) this;
        }

        public Criteria andNeedIndexIn(List<Integer> values) {
            addCriterion("NEED_INDEX in", values, "needIndex");
            return (Criteria) this;
        }

        public Criteria andNeedIndexNotIn(List<Integer> values) {
            addCriterion("NEED_INDEX not in", values, "needIndex");
            return (Criteria) this;
        }

        public Criteria andNeedIndexBetween(Integer value1, Integer value2) {
            addCriterion("NEED_INDEX between", value1, value2, "needIndex");
            return (Criteria) this;
        }

        public Criteria andNeedIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("NEED_INDEX not between", value1, value2, "needIndex");
            return (Criteria) this;
        }

        public Criteria andVoltLevelTypeIsNull() {
            addCriterion("VOLT_LEVEL_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVoltLevelTypeIsNotNull() {
            addCriterion("VOLT_LEVEL_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVoltLevelTypeEqualTo(Short value) {
            addCriterion("VOLT_LEVEL_TYPE =", value, "voltLevelType");
            return (Criteria) this;
        }

        public Criteria andVoltLevelTypeNotEqualTo(Short value) {
            addCriterion("VOLT_LEVEL_TYPE <>", value, "voltLevelType");
            return (Criteria) this;
        }

        public Criteria andVoltLevelTypeGreaterThan(Short value) {
            addCriterion("VOLT_LEVEL_TYPE >", value, "voltLevelType");
            return (Criteria) this;
        }

        public Criteria andVoltLevelTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("VOLT_LEVEL_TYPE >=", value, "voltLevelType");
            return (Criteria) this;
        }

        public Criteria andVoltLevelTypeLessThan(Short value) {
            addCriterion("VOLT_LEVEL_TYPE <", value, "voltLevelType");
            return (Criteria) this;
        }

        public Criteria andVoltLevelTypeLessThanOrEqualTo(Short value) {
            addCriterion("VOLT_LEVEL_TYPE <=", value, "voltLevelType");
            return (Criteria) this;
        }

        public Criteria andVoltLevelTypeIn(List<Short> values) {
            addCriterion("VOLT_LEVEL_TYPE in", values, "voltLevelType");
            return (Criteria) this;
        }

        public Criteria andVoltLevelTypeNotIn(List<Short> values) {
            addCriterion("VOLT_LEVEL_TYPE not in", values, "voltLevelType");
            return (Criteria) this;
        }

        public Criteria andVoltLevelTypeBetween(Short value1, Short value2) {
            addCriterion("VOLT_LEVEL_TYPE between", value1, value2, "voltLevelType");
            return (Criteria) this;
        }

        public Criteria andVoltLevelTypeNotBetween(Short value1, Short value2) {
            addCriterion("VOLT_LEVEL_TYPE not between", value1, value2, "voltLevelType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeIsNull() {
            addCriterion("METER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMeterTypeIsNotNull() {
            addCriterion("METER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMeterTypeEqualTo(Short value) {
            addCriterion("METER_TYPE =", value, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeNotEqualTo(Short value) {
            addCriterion("METER_TYPE <>", value, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeGreaterThan(Short value) {
            addCriterion("METER_TYPE >", value, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("METER_TYPE >=", value, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeLessThan(Short value) {
            addCriterion("METER_TYPE <", value, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeLessThanOrEqualTo(Short value) {
            addCriterion("METER_TYPE <=", value, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeIn(List<Short> values) {
            addCriterion("METER_TYPE in", values, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeNotIn(List<Short> values) {
            addCriterion("METER_TYPE not in", values, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeBetween(Short value1, Short value2) {
            addCriterion("METER_TYPE between", value1, value2, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterTypeNotBetween(Short value1, Short value2) {
            addCriterion("METER_TYPE not between", value1, value2, "meterType");
            return (Criteria) this;
        }

        public Criteria andMeterClassTypeIsNull() {
            addCriterion("METER_CLASS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMeterClassTypeIsNotNull() {
            addCriterion("METER_CLASS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMeterClassTypeEqualTo(Short value) {
            addCriterion("METER_CLASS_TYPE =", value, "meterClassType");
            return (Criteria) this;
        }

        public Criteria andMeterClassTypeNotEqualTo(Short value) {
            addCriterion("METER_CLASS_TYPE <>", value, "meterClassType");
            return (Criteria) this;
        }

        public Criteria andMeterClassTypeGreaterThan(Short value) {
            addCriterion("METER_CLASS_TYPE >", value, "meterClassType");
            return (Criteria) this;
        }

        public Criteria andMeterClassTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("METER_CLASS_TYPE >=", value, "meterClassType");
            return (Criteria) this;
        }

        public Criteria andMeterClassTypeLessThan(Short value) {
            addCriterion("METER_CLASS_TYPE <", value, "meterClassType");
            return (Criteria) this;
        }

        public Criteria andMeterClassTypeLessThanOrEqualTo(Short value) {
            addCriterion("METER_CLASS_TYPE <=", value, "meterClassType");
            return (Criteria) this;
        }

        public Criteria andMeterClassTypeIn(List<Short> values) {
            addCriterion("METER_CLASS_TYPE in", values, "meterClassType");
            return (Criteria) this;
        }

        public Criteria andMeterClassTypeNotIn(List<Short> values) {
            addCriterion("METER_CLASS_TYPE not in", values, "meterClassType");
            return (Criteria) this;
        }

        public Criteria andMeterClassTypeBetween(Short value1, Short value2) {
            addCriterion("METER_CLASS_TYPE between", value1, value2, "meterClassType");
            return (Criteria) this;
        }

        public Criteria andMeterClassTypeNotBetween(Short value1, Short value2) {
            addCriterion("METER_CLASS_TYPE not between", value1, value2, "meterClassType");
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

        public Criteria andTradeTypeIsNull() {
            addCriterion("TRADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIsNotNull() {
            addCriterion("TRADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTradeTypeEqualTo(Short value) {
            addCriterion("TRADE_TYPE =", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotEqualTo(Short value) {
            addCriterion("TRADE_TYPE <>", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThan(Short value) {
            addCriterion("TRADE_TYPE >", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TRADE_TYPE >=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThan(Short value) {
            addCriterion("TRADE_TYPE <", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeLessThanOrEqualTo(Short value) {
            addCriterion("TRADE_TYPE <=", value, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeIn(List<Short> values) {
            addCriterion("TRADE_TYPE in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotIn(List<Short> values) {
            addCriterion("TRADE_TYPE not in", values, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeBetween(Short value1, Short value2) {
            addCriterion("TRADE_TYPE between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTradeTypeNotBetween(Short value1, Short value2) {
            addCriterion("TRADE_TYPE not between", value1, value2, "tradeType");
            return (Criteria) this;
        }

        public Criteria andTsTypeIsNull() {
            addCriterion("TS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTsTypeIsNotNull() {
            addCriterion("TS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTsTypeEqualTo(Short value) {
            addCriterion("TS_TYPE =", value, "tsType");
            return (Criteria) this;
        }

        public Criteria andTsTypeNotEqualTo(Short value) {
            addCriterion("TS_TYPE <>", value, "tsType");
            return (Criteria) this;
        }

        public Criteria andTsTypeGreaterThan(Short value) {
            addCriterion("TS_TYPE >", value, "tsType");
            return (Criteria) this;
        }

        public Criteria andTsTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TS_TYPE >=", value, "tsType");
            return (Criteria) this;
        }

        public Criteria andTsTypeLessThan(Short value) {
            addCriterion("TS_TYPE <", value, "tsType");
            return (Criteria) this;
        }

        public Criteria andTsTypeLessThanOrEqualTo(Short value) {
            addCriterion("TS_TYPE <=", value, "tsType");
            return (Criteria) this;
        }

        public Criteria andTsTypeIn(List<Short> values) {
            addCriterion("TS_TYPE in", values, "tsType");
            return (Criteria) this;
        }

        public Criteria andTsTypeNotIn(List<Short> values) {
            addCriterion("TS_TYPE not in", values, "tsType");
            return (Criteria) this;
        }

        public Criteria andTsTypeBetween(Short value1, Short value2) {
            addCriterion("TS_TYPE between", value1, value2, "tsType");
            return (Criteria) this;
        }

        public Criteria andTsTypeNotBetween(Short value1, Short value2) {
            addCriterion("TS_TYPE not between", value1, value2, "tsType");
            return (Criteria) this;
        }

        public Criteria andTransLostTypeIsNull() {
            addCriterion("TRANS_LOST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTransLostTypeIsNotNull() {
            addCriterion("TRANS_LOST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTransLostTypeEqualTo(Short value) {
            addCriterion("TRANS_LOST_TYPE =", value, "transLostType");
            return (Criteria) this;
        }

        public Criteria andTransLostTypeNotEqualTo(Short value) {
            addCriterion("TRANS_LOST_TYPE <>", value, "transLostType");
            return (Criteria) this;
        }

        public Criteria andTransLostTypeGreaterThan(Short value) {
            addCriterion("TRANS_LOST_TYPE >", value, "transLostType");
            return (Criteria) this;
        }

        public Criteria andTransLostTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TRANS_LOST_TYPE >=", value, "transLostType");
            return (Criteria) this;
        }

        public Criteria andTransLostTypeLessThan(Short value) {
            addCriterion("TRANS_LOST_TYPE <", value, "transLostType");
            return (Criteria) this;
        }

        public Criteria andTransLostTypeLessThanOrEqualTo(Short value) {
            addCriterion("TRANS_LOST_TYPE <=", value, "transLostType");
            return (Criteria) this;
        }

        public Criteria andTransLostTypeIn(List<Short> values) {
            addCriterion("TRANS_LOST_TYPE in", values, "transLostType");
            return (Criteria) this;
        }

        public Criteria andTransLostTypeNotIn(List<Short> values) {
            addCriterion("TRANS_LOST_TYPE not in", values, "transLostType");
            return (Criteria) this;
        }

        public Criteria andTransLostTypeBetween(Short value1, Short value2) {
            addCriterion("TRANS_LOST_TYPE between", value1, value2, "transLostType");
            return (Criteria) this;
        }

        public Criteria andTransLostTypeNotBetween(Short value1, Short value2) {
            addCriterion("TRANS_LOST_TYPE not between", value1, value2, "transLostType");
            return (Criteria) this;
        }

        public Criteria andTransLostNumIsNull() {
            addCriterion("TRANS_LOST_NUM is null");
            return (Criteria) this;
        }

        public Criteria andTransLostNumIsNotNull() {
            addCriterion("TRANS_LOST_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andTransLostNumEqualTo(BigDecimal value) {
            addCriterion("TRANS_LOST_NUM =", value, "transLostNum");
            return (Criteria) this;
        }

        public Criteria andTransLostNumNotEqualTo(BigDecimal value) {
            addCriterion("TRANS_LOST_NUM <>", value, "transLostNum");
            return (Criteria) this;
        }

        public Criteria andTransLostNumGreaterThan(BigDecimal value) {
            addCriterion("TRANS_LOST_NUM >", value, "transLostNum");
            return (Criteria) this;
        }

        public Criteria andTransLostNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_LOST_NUM >=", value, "transLostNum");
            return (Criteria) this;
        }

        public Criteria andTransLostNumLessThan(BigDecimal value) {
            addCriterion("TRANS_LOST_NUM <", value, "transLostNum");
            return (Criteria) this;
        }

        public Criteria andTransLostNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANS_LOST_NUM <=", value, "transLostNum");
            return (Criteria) this;
        }

        public Criteria andTransLostNumIn(List<BigDecimal> values) {
            addCriterion("TRANS_LOST_NUM in", values, "transLostNum");
            return (Criteria) this;
        }

        public Criteria andTransLostNumNotIn(List<BigDecimal> values) {
            addCriterion("TRANS_LOST_NUM not in", values, "transLostNum");
            return (Criteria) this;
        }

        public Criteria andTransLostNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_LOST_NUM between", value1, value2, "transLostNum");
            return (Criteria) this;
        }

        public Criteria andTransLostNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANS_LOST_NUM not between", value1, value2, "transLostNum");
            return (Criteria) this;
        }

        public Criteria andQTransLostNumIsNull() {
            addCriterion("Q_TRANS_LOST_NUM is null");
            return (Criteria) this;
        }

        public Criteria andQTransLostNumIsNotNull() {
            addCriterion("Q_TRANS_LOST_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andQTransLostNumEqualTo(BigDecimal value) {
            addCriterion("Q_TRANS_LOST_NUM =", value, "qTransLostNum");
            return (Criteria) this;
        }

        public Criteria andQTransLostNumNotEqualTo(BigDecimal value) {
            addCriterion("Q_TRANS_LOST_NUM <>", value, "qTransLostNum");
            return (Criteria) this;
        }

        public Criteria andQTransLostNumGreaterThan(BigDecimal value) {
            addCriterion("Q_TRANS_LOST_NUM >", value, "qTransLostNum");
            return (Criteria) this;
        }

        public Criteria andQTransLostNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Q_TRANS_LOST_NUM >=", value, "qTransLostNum");
            return (Criteria) this;
        }

        public Criteria andQTransLostNumLessThan(BigDecimal value) {
            addCriterion("Q_TRANS_LOST_NUM <", value, "qTransLostNum");
            return (Criteria) this;
        }

        public Criteria andQTransLostNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Q_TRANS_LOST_NUM <=", value, "qTransLostNum");
            return (Criteria) this;
        }

        public Criteria andQTransLostNumIn(List<BigDecimal> values) {
            addCriterion("Q_TRANS_LOST_NUM in", values, "qTransLostNum");
            return (Criteria) this;
        }

        public Criteria andQTransLostNumNotIn(List<BigDecimal> values) {
            addCriterion("Q_TRANS_LOST_NUM not in", values, "qTransLostNum");
            return (Criteria) this;
        }

        public Criteria andQTransLostNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Q_TRANS_LOST_NUM between", value1, value2, "qTransLostNum");
            return (Criteria) this;
        }

        public Criteria andQTransLostNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Q_TRANS_LOST_NUM not between", value1, value2, "qTransLostNum");
            return (Criteria) this;
        }

        public Criteria andLineLostTypeIsNull() {
            addCriterion("LINE_LOST_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLineLostTypeIsNotNull() {
            addCriterion("LINE_LOST_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLineLostTypeEqualTo(Short value) {
            addCriterion("LINE_LOST_TYPE =", value, "lineLostType");
            return (Criteria) this;
        }

        public Criteria andLineLostTypeNotEqualTo(Short value) {
            addCriterion("LINE_LOST_TYPE <>", value, "lineLostType");
            return (Criteria) this;
        }

        public Criteria andLineLostTypeGreaterThan(Short value) {
            addCriterion("LINE_LOST_TYPE >", value, "lineLostType");
            return (Criteria) this;
        }

        public Criteria andLineLostTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("LINE_LOST_TYPE >=", value, "lineLostType");
            return (Criteria) this;
        }

        public Criteria andLineLostTypeLessThan(Short value) {
            addCriterion("LINE_LOST_TYPE <", value, "lineLostType");
            return (Criteria) this;
        }

        public Criteria andLineLostTypeLessThanOrEqualTo(Short value) {
            addCriterion("LINE_LOST_TYPE <=", value, "lineLostType");
            return (Criteria) this;
        }

        public Criteria andLineLostTypeIn(List<Short> values) {
            addCriterion("LINE_LOST_TYPE in", values, "lineLostType");
            return (Criteria) this;
        }

        public Criteria andLineLostTypeNotIn(List<Short> values) {
            addCriterion("LINE_LOST_TYPE not in", values, "lineLostType");
            return (Criteria) this;
        }

        public Criteria andLineLostTypeBetween(Short value1, Short value2) {
            addCriterion("LINE_LOST_TYPE between", value1, value2, "lineLostType");
            return (Criteria) this;
        }

        public Criteria andLineLostTypeNotBetween(Short value1, Short value2) {
            addCriterion("LINE_LOST_TYPE not between", value1, value2, "lineLostType");
            return (Criteria) this;
        }

        public Criteria andLineLostNumIsNull() {
            addCriterion("LINE_LOST_NUM is null");
            return (Criteria) this;
        }

        public Criteria andLineLostNumIsNotNull() {
            addCriterion("LINE_LOST_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andLineLostNumEqualTo(BigDecimal value) {
            addCriterion("LINE_LOST_NUM =", value, "lineLostNum");
            return (Criteria) this;
        }

        public Criteria andLineLostNumNotEqualTo(BigDecimal value) {
            addCriterion("LINE_LOST_NUM <>", value, "lineLostNum");
            return (Criteria) this;
        }

        public Criteria andLineLostNumGreaterThan(BigDecimal value) {
            addCriterion("LINE_LOST_NUM >", value, "lineLostNum");
            return (Criteria) this;
        }

        public Criteria andLineLostNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("LINE_LOST_NUM >=", value, "lineLostNum");
            return (Criteria) this;
        }

        public Criteria andLineLostNumLessThan(BigDecimal value) {
            addCriterion("LINE_LOST_NUM <", value, "lineLostNum");
            return (Criteria) this;
        }

        public Criteria andLineLostNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("LINE_LOST_NUM <=", value, "lineLostNum");
            return (Criteria) this;
        }

        public Criteria andLineLostNumIn(List<BigDecimal> values) {
            addCriterion("LINE_LOST_NUM in", values, "lineLostNum");
            return (Criteria) this;
        }

        public Criteria andLineLostNumNotIn(List<BigDecimal> values) {
            addCriterion("LINE_LOST_NUM not in", values, "lineLostNum");
            return (Criteria) this;
        }

        public Criteria andLineLostNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LINE_LOST_NUM between", value1, value2, "lineLostNum");
            return (Criteria) this;
        }

        public Criteria andLineLostNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("LINE_LOST_NUM not between", value1, value2, "lineLostNum");
            return (Criteria) this;
        }

        public Criteria andQLineLostNumIsNull() {
            addCriterion("Q_LINE_LOST_NUM is null");
            return (Criteria) this;
        }

        public Criteria andQLineLostNumIsNotNull() {
            addCriterion("Q_LINE_LOST_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andQLineLostNumEqualTo(BigDecimal value) {
            addCriterion("Q_LINE_LOST_NUM =", value, "qLineLostNum");
            return (Criteria) this;
        }

        public Criteria andQLineLostNumNotEqualTo(BigDecimal value) {
            addCriterion("Q_LINE_LOST_NUM <>", value, "qLineLostNum");
            return (Criteria) this;
        }

        public Criteria andQLineLostNumGreaterThan(BigDecimal value) {
            addCriterion("Q_LINE_LOST_NUM >", value, "qLineLostNum");
            return (Criteria) this;
        }

        public Criteria andQLineLostNumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("Q_LINE_LOST_NUM >=", value, "qLineLostNum");
            return (Criteria) this;
        }

        public Criteria andQLineLostNumLessThan(BigDecimal value) {
            addCriterion("Q_LINE_LOST_NUM <", value, "qLineLostNum");
            return (Criteria) this;
        }

        public Criteria andQLineLostNumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("Q_LINE_LOST_NUM <=", value, "qLineLostNum");
            return (Criteria) this;
        }

        public Criteria andQLineLostNumIn(List<BigDecimal> values) {
            addCriterion("Q_LINE_LOST_NUM in", values, "qLineLostNum");
            return (Criteria) this;
        }

        public Criteria andQLineLostNumNotIn(List<BigDecimal> values) {
            addCriterion("Q_LINE_LOST_NUM not in", values, "qLineLostNum");
            return (Criteria) this;
        }

        public Criteria andQLineLostNumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Q_LINE_LOST_NUM between", value1, value2, "qLineLostNum");
            return (Criteria) this;
        }

        public Criteria andQLineLostNumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("Q_LINE_LOST_NUM not between", value1, value2, "qLineLostNum");
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

        public Criteria andTgIdIsNull() {
            addCriterion("TG_ID is null");
            return (Criteria) this;
        }

        public Criteria andTgIdIsNotNull() {
            addCriterion("TG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTgIdEqualTo(Long value) {
            addCriterion("TG_ID =", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdNotEqualTo(Long value) {
            addCriterion("TG_ID <>", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdGreaterThan(Long value) {
            addCriterion("TG_ID >", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("TG_ID >=", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdLessThan(Long value) {
            addCriterion("TG_ID <", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdLessThanOrEqualTo(Long value) {
            addCriterion("TG_ID <=", value, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdIn(List<Long> values) {
            addCriterion("TG_ID in", values, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdNotIn(List<Long> values) {
            addCriterion("TG_ID not in", values, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdBetween(Long value1, Long value2) {
            addCriterion("TG_ID between", value1, value2, "tgId");
            return (Criteria) this;
        }

        public Criteria andTgIdNotBetween(Long value1, Long value2) {
            addCriterion("TG_ID not between", value1, value2, "tgId");
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

        public Criteria andWriteSectionIdIsNull() {
            addCriterion("WRITE_SECTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdIsNotNull() {
            addCriterion("WRITE_SECTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdEqualTo(Long value) {
            addCriterion("WRITE_SECTION_ID =", value, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdNotEqualTo(Long value) {
            addCriterion("WRITE_SECTION_ID <>", value, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdGreaterThan(Long value) {
            addCriterion("WRITE_SECTION_ID >", value, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("WRITE_SECTION_ID >=", value, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdLessThan(Long value) {
            addCriterion("WRITE_SECTION_ID <", value, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdLessThanOrEqualTo(Long value) {
            addCriterion("WRITE_SECTION_ID <=", value, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdIn(List<Long> values) {
            addCriterion("WRITE_SECTION_ID in", values, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdNotIn(List<Long> values) {
            addCriterion("WRITE_SECTION_ID not in", values, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdBetween(Long value1, Long value2) {
            addCriterion("WRITE_SECTION_ID between", value1, value2, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andWriteSectionIdNotBetween(Long value1, Long value2) {
            addCriterion("WRITE_SECTION_ID not between", value1, value2, "writeSectionId");
            return (Criteria) this;
        }

        public Criteria andKeepPowerFlagIsNull() {
            addCriterion("KEEP_POWER_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andKeepPowerFlagIsNotNull() {
            addCriterion("KEEP_POWER_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andKeepPowerFlagEqualTo(Short value) {
            addCriterion("KEEP_POWER_FLAG =", value, "keepPowerFlag");
            return (Criteria) this;
        }

        public Criteria andKeepPowerFlagNotEqualTo(Short value) {
            addCriterion("KEEP_POWER_FLAG <>", value, "keepPowerFlag");
            return (Criteria) this;
        }

        public Criteria andKeepPowerFlagGreaterThan(Short value) {
            addCriterion("KEEP_POWER_FLAG >", value, "keepPowerFlag");
            return (Criteria) this;
        }

        public Criteria andKeepPowerFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("KEEP_POWER_FLAG >=", value, "keepPowerFlag");
            return (Criteria) this;
        }

        public Criteria andKeepPowerFlagLessThan(Short value) {
            addCriterion("KEEP_POWER_FLAG <", value, "keepPowerFlag");
            return (Criteria) this;
        }

        public Criteria andKeepPowerFlagLessThanOrEqualTo(Short value) {
            addCriterion("KEEP_POWER_FLAG <=", value, "keepPowerFlag");
            return (Criteria) this;
        }

        public Criteria andKeepPowerFlagIn(List<Short> values) {
            addCriterion("KEEP_POWER_FLAG in", values, "keepPowerFlag");
            return (Criteria) this;
        }

        public Criteria andKeepPowerFlagNotIn(List<Short> values) {
            addCriterion("KEEP_POWER_FLAG not in", values, "keepPowerFlag");
            return (Criteria) this;
        }

        public Criteria andKeepPowerFlagBetween(Short value1, Short value2) {
            addCriterion("KEEP_POWER_FLAG between", value1, value2, "keepPowerFlag");
            return (Criteria) this;
        }

        public Criteria andKeepPowerFlagNotBetween(Short value1, Short value2) {
            addCriterion("KEEP_POWER_FLAG not between", value1, value2, "keepPowerFlag");
            return (Criteria) this;
        }

        public Criteria andDemolitionFlagIsNull() {
            addCriterion("DEMOLITION_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andDemolitionFlagIsNotNull() {
            addCriterion("DEMOLITION_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andDemolitionFlagEqualTo(Short value) {
            addCriterion("DEMOLITION_FLAG =", value, "demolitionFlag");
            return (Criteria) this;
        }

        public Criteria andDemolitionFlagNotEqualTo(Short value) {
            addCriterion("DEMOLITION_FLAG <>", value, "demolitionFlag");
            return (Criteria) this;
        }

        public Criteria andDemolitionFlagGreaterThan(Short value) {
            addCriterion("DEMOLITION_FLAG >", value, "demolitionFlag");
            return (Criteria) this;
        }

        public Criteria andDemolitionFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("DEMOLITION_FLAG >=", value, "demolitionFlag");
            return (Criteria) this;
        }

        public Criteria andDemolitionFlagLessThan(Short value) {
            addCriterion("DEMOLITION_FLAG <", value, "demolitionFlag");
            return (Criteria) this;
        }

        public Criteria andDemolitionFlagLessThanOrEqualTo(Short value) {
            addCriterion("DEMOLITION_FLAG <=", value, "demolitionFlag");
            return (Criteria) this;
        }

        public Criteria andDemolitionFlagIn(List<Short> values) {
            addCriterion("DEMOLITION_FLAG in", values, "demolitionFlag");
            return (Criteria) this;
        }

        public Criteria andDemolitionFlagNotIn(List<Short> values) {
            addCriterion("DEMOLITION_FLAG not in", values, "demolitionFlag");
            return (Criteria) this;
        }

        public Criteria andDemolitionFlagBetween(Short value1, Short value2) {
            addCriterion("DEMOLITION_FLAG between", value1, value2, "demolitionFlag");
            return (Criteria) this;
        }

        public Criteria andDemolitionFlagNotBetween(Short value1, Short value2) {
            addCriterion("DEMOLITION_FLAG not between", value1, value2, "demolitionFlag");
            return (Criteria) this;
        }

        public Criteria andDemolitionDateIsNull() {
            addCriterion("DEMOLITION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDemolitionDateIsNotNull() {
            addCriterion("DEMOLITION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDemolitionDateEqualTo(Date value) {
            addCriterion("DEMOLITION_DATE =", value, "demolitionDate");
            return (Criteria) this;
        }

        public Criteria andDemolitionDateNotEqualTo(Date value) {
            addCriterion("DEMOLITION_DATE <>", value, "demolitionDate");
            return (Criteria) this;
        }

        public Criteria andDemolitionDateGreaterThan(Date value) {
            addCriterion("DEMOLITION_DATE >", value, "demolitionDate");
            return (Criteria) this;
        }

        public Criteria andDemolitionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DEMOLITION_DATE >=", value, "demolitionDate");
            return (Criteria) this;
        }

        public Criteria andDemolitionDateLessThan(Date value) {
            addCriterion("DEMOLITION_DATE <", value, "demolitionDate");
            return (Criteria) this;
        }

        public Criteria andDemolitionDateLessThanOrEqualTo(Date value) {
            addCriterion("DEMOLITION_DATE <=", value, "demolitionDate");
            return (Criteria) this;
        }

        public Criteria andDemolitionDateIn(List<Date> values) {
            addCriterion("DEMOLITION_DATE in", values, "demolitionDate");
            return (Criteria) this;
        }

        public Criteria andDemolitionDateNotIn(List<Date> values) {
            addCriterion("DEMOLITION_DATE not in", values, "demolitionDate");
            return (Criteria) this;
        }

        public Criteria andDemolitionDateBetween(Date value1, Date value2) {
            addCriterion("DEMOLITION_DATE between", value1, value2, "demolitionDate");
            return (Criteria) this;
        }

        public Criteria andDemolitionDateNotBetween(Date value1, Date value2) {
            addCriterion("DEMOLITION_DATE not between", value1, value2, "demolitionDate");
            return (Criteria) this;
        }

        public Criteria andBillFlagIsNull() {
            addCriterion("BILL_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andBillFlagIsNotNull() {
            addCriterion("BILL_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andBillFlagEqualTo(Short value) {
            addCriterion("BILL_FLAG =", value, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagNotEqualTo(Short value) {
            addCriterion("BILL_FLAG <>", value, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagGreaterThan(Short value) {
            addCriterion("BILL_FLAG >", value, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("BILL_FLAG >=", value, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagLessThan(Short value) {
            addCriterion("BILL_FLAG <", value, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagLessThanOrEqualTo(Short value) {
            addCriterion("BILL_FLAG <=", value, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagIn(List<Short> values) {
            addCriterion("BILL_FLAG in", values, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagNotIn(List<Short> values) {
            addCriterion("BILL_FLAG not in", values, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagBetween(Short value1, Short value2) {
            addCriterion("BILL_FLAG between", value1, value2, "billFlag");
            return (Criteria) this;
        }

        public Criteria andBillFlagNotBetween(Short value1, Short value2) {
            addCriterion("BILL_FLAG not between", value1, value2, "billFlag");
            return (Criteria) this;
        }

        public Criteria andOverdueFineFlagIsNull() {
            addCriterion("OVERDUE_FINE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andOverdueFineFlagIsNotNull() {
            addCriterion("OVERDUE_FINE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andOverdueFineFlagEqualTo(Short value) {
            addCriterion("OVERDUE_FINE_FLAG =", value, "overdueFineFlag");
            return (Criteria) this;
        }

        public Criteria andOverdueFineFlagNotEqualTo(Short value) {
            addCriterion("OVERDUE_FINE_FLAG <>", value, "overdueFineFlag");
            return (Criteria) this;
        }

        public Criteria andOverdueFineFlagGreaterThan(Short value) {
            addCriterion("OVERDUE_FINE_FLAG >", value, "overdueFineFlag");
            return (Criteria) this;
        }

        public Criteria andOverdueFineFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("OVERDUE_FINE_FLAG >=", value, "overdueFineFlag");
            return (Criteria) this;
        }

        public Criteria andOverdueFineFlagLessThan(Short value) {
            addCriterion("OVERDUE_FINE_FLAG <", value, "overdueFineFlag");
            return (Criteria) this;
        }

        public Criteria andOverdueFineFlagLessThanOrEqualTo(Short value) {
            addCriterion("OVERDUE_FINE_FLAG <=", value, "overdueFineFlag");
            return (Criteria) this;
        }

        public Criteria andOverdueFineFlagIn(List<Short> values) {
            addCriterion("OVERDUE_FINE_FLAG in", values, "overdueFineFlag");
            return (Criteria) this;
        }

        public Criteria andOverdueFineFlagNotIn(List<Short> values) {
            addCriterion("OVERDUE_FINE_FLAG not in", values, "overdueFineFlag");
            return (Criteria) this;
        }

        public Criteria andOverdueFineFlagBetween(Short value1, Short value2) {
            addCriterion("OVERDUE_FINE_FLAG between", value1, value2, "overdueFineFlag");
            return (Criteria) this;
        }

        public Criteria andOverdueFineFlagNotBetween(Short value1, Short value2) {
            addCriterion("OVERDUE_FINE_FLAG not between", value1, value2, "overdueFineFlag");
            return (Criteria) this;
        }

        public Criteria andTieredPriceFlagIsNull() {
            addCriterion("TIERED_PRICE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andTieredPriceFlagIsNotNull() {
            addCriterion("TIERED_PRICE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andTieredPriceFlagEqualTo(Short value) {
            addCriterion("TIERED_PRICE_FLAG =", value, "tieredPriceFlag");
            return (Criteria) this;
        }

        public Criteria andTieredPriceFlagNotEqualTo(Short value) {
            addCriterion("TIERED_PRICE_FLAG <>", value, "tieredPriceFlag");
            return (Criteria) this;
        }

        public Criteria andTieredPriceFlagGreaterThan(Short value) {
            addCriterion("TIERED_PRICE_FLAG >", value, "tieredPriceFlag");
            return (Criteria) this;
        }

        public Criteria andTieredPriceFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("TIERED_PRICE_FLAG >=", value, "tieredPriceFlag");
            return (Criteria) this;
        }

        public Criteria andTieredPriceFlagLessThan(Short value) {
            addCriterion("TIERED_PRICE_FLAG <", value, "tieredPriceFlag");
            return (Criteria) this;
        }

        public Criteria andTieredPriceFlagLessThanOrEqualTo(Short value) {
            addCriterion("TIERED_PRICE_FLAG <=", value, "tieredPriceFlag");
            return (Criteria) this;
        }

        public Criteria andTieredPriceFlagIn(List<Short> values) {
            addCriterion("TIERED_PRICE_FLAG in", values, "tieredPriceFlag");
            return (Criteria) this;
        }

        public Criteria andTieredPriceFlagNotIn(List<Short> values) {
            addCriterion("TIERED_PRICE_FLAG not in", values, "tieredPriceFlag");
            return (Criteria) this;
        }

        public Criteria andTieredPriceFlagBetween(Short value1, Short value2) {
            addCriterion("TIERED_PRICE_FLAG between", value1, value2, "tieredPriceFlag");
            return (Criteria) this;
        }

        public Criteria andTieredPriceFlagNotBetween(Short value1, Short value2) {
            addCriterion("TIERED_PRICE_FLAG not between", value1, value2, "tieredPriceFlag");
            return (Criteria) this;
        }

        public Criteria andWriteMethodIsNull() {
            addCriterion("WRITE_METHOD is null");
            return (Criteria) this;
        }

        public Criteria andWriteMethodIsNotNull() {
            addCriterion("WRITE_METHOD is not null");
            return (Criteria) this;
        }

        public Criteria andWriteMethodEqualTo(Short value) {
            addCriterion("WRITE_METHOD =", value, "writeMethod");
            return (Criteria) this;
        }

        public Criteria andWriteMethodNotEqualTo(Short value) {
            addCriterion("WRITE_METHOD <>", value, "writeMethod");
            return (Criteria) this;
        }

        public Criteria andWriteMethodGreaterThan(Short value) {
            addCriterion("WRITE_METHOD >", value, "writeMethod");
            return (Criteria) this;
        }

        public Criteria andWriteMethodGreaterThanOrEqualTo(Short value) {
            addCriterion("WRITE_METHOD >=", value, "writeMethod");
            return (Criteria) this;
        }

        public Criteria andWriteMethodLessThan(Short value) {
            addCriterion("WRITE_METHOD <", value, "writeMethod");
            return (Criteria) this;
        }

        public Criteria andWriteMethodLessThanOrEqualTo(Short value) {
            addCriterion("WRITE_METHOD <=", value, "writeMethod");
            return (Criteria) this;
        }

        public Criteria andWriteMethodIn(List<Short> values) {
            addCriterion("WRITE_METHOD in", values, "writeMethod");
            return (Criteria) this;
        }

        public Criteria andWriteMethodNotIn(List<Short> values) {
            addCriterion("WRITE_METHOD not in", values, "writeMethod");
            return (Criteria) this;
        }

        public Criteria andWriteMethodBetween(Short value1, Short value2) {
            addCriterion("WRITE_METHOD between", value1, value2, "writeMethod");
            return (Criteria) this;
        }

        public Criteria andWriteMethodNotBetween(Short value1, Short value2) {
            addCriterion("WRITE_METHOD not between", value1, value2, "writeMethod");
            return (Criteria) this;
        }

        public Criteria andRateFlagIsNull() {
            addCriterion("RATE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andRateFlagIsNotNull() {
            addCriterion("RATE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andRateFlagEqualTo(Short value) {
            addCriterion("RATE_FLAG =", value, "rateFlag");
            return (Criteria) this;
        }

        public Criteria andRateFlagNotEqualTo(Short value) {
            addCriterion("RATE_FLAG <>", value, "rateFlag");
            return (Criteria) this;
        }

        public Criteria andRateFlagGreaterThan(Short value) {
            addCriterion("RATE_FLAG >", value, "rateFlag");
            return (Criteria) this;
        }

        public Criteria andRateFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("RATE_FLAG >=", value, "rateFlag");
            return (Criteria) this;
        }

        public Criteria andRateFlagLessThan(Short value) {
            addCriterion("RATE_FLAG <", value, "rateFlag");
            return (Criteria) this;
        }

        public Criteria andRateFlagLessThanOrEqualTo(Short value) {
            addCriterion("RATE_FLAG <=", value, "rateFlag");
            return (Criteria) this;
        }

        public Criteria andRateFlagIn(List<Short> values) {
            addCriterion("RATE_FLAG in", values, "rateFlag");
            return (Criteria) this;
        }

        public Criteria andRateFlagNotIn(List<Short> values) {
            addCriterion("RATE_FLAG not in", values, "rateFlag");
            return (Criteria) this;
        }

        public Criteria andRateFlagBetween(Short value1, Short value2) {
            addCriterion("RATE_FLAG between", value1, value2, "rateFlag");
            return (Criteria) this;
        }

        public Criteria andRateFlagNotBetween(Short value1, Short value2) {
            addCriterion("RATE_FLAG not between", value1, value2, "rateFlag");
            return (Criteria) this;
        }

        public Criteria andPowerCutFlagIsNull() {
            addCriterion("POWER_CUT_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andPowerCutFlagIsNotNull() {
            addCriterion("POWER_CUT_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andPowerCutFlagEqualTo(Short value) {
            addCriterion("POWER_CUT_FLAG =", value, "powerCutFlag");
            return (Criteria) this;
        }

        public Criteria andPowerCutFlagNotEqualTo(Short value) {
            addCriterion("POWER_CUT_FLAG <>", value, "powerCutFlag");
            return (Criteria) this;
        }

        public Criteria andPowerCutFlagGreaterThan(Short value) {
            addCriterion("POWER_CUT_FLAG >", value, "powerCutFlag");
            return (Criteria) this;
        }

        public Criteria andPowerCutFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("POWER_CUT_FLAG >=", value, "powerCutFlag");
            return (Criteria) this;
        }

        public Criteria andPowerCutFlagLessThan(Short value) {
            addCriterion("POWER_CUT_FLAG <", value, "powerCutFlag");
            return (Criteria) this;
        }

        public Criteria andPowerCutFlagLessThanOrEqualTo(Short value) {
            addCriterion("POWER_CUT_FLAG <=", value, "powerCutFlag");
            return (Criteria) this;
        }

        public Criteria andPowerCutFlagIn(List<Short> values) {
            addCriterion("POWER_CUT_FLAG in", values, "powerCutFlag");
            return (Criteria) this;
        }

        public Criteria andPowerCutFlagNotIn(List<Short> values) {
            addCriterion("POWER_CUT_FLAG not in", values, "powerCutFlag");
            return (Criteria) this;
        }

        public Criteria andPowerCutFlagBetween(Short value1, Short value2) {
            addCriterion("POWER_CUT_FLAG between", value1, value2, "powerCutFlag");
            return (Criteria) this;
        }

        public Criteria andPowerCutFlagNotBetween(Short value1, Short value2) {
            addCriterion("POWER_CUT_FLAG not between", value1, value2, "powerCutFlag");
            return (Criteria) this;
        }

        public Criteria andPhaseSeqIsNull() {
            addCriterion("PHASE_SEQ is null");
            return (Criteria) this;
        }

        public Criteria andPhaseSeqIsNotNull() {
            addCriterion("PHASE_SEQ is not null");
            return (Criteria) this;
        }

        public Criteria andPhaseSeqEqualTo(Short value) {
            addCriterion("PHASE_SEQ =", value, "phaseSeq");
            return (Criteria) this;
        }

        public Criteria andPhaseSeqNotEqualTo(Short value) {
            addCriterion("PHASE_SEQ <>", value, "phaseSeq");
            return (Criteria) this;
        }

        public Criteria andPhaseSeqGreaterThan(Short value) {
            addCriterion("PHASE_SEQ >", value, "phaseSeq");
            return (Criteria) this;
        }

        public Criteria andPhaseSeqGreaterThanOrEqualTo(Short value) {
            addCriterion("PHASE_SEQ >=", value, "phaseSeq");
            return (Criteria) this;
        }

        public Criteria andPhaseSeqLessThan(Short value) {
            addCriterion("PHASE_SEQ <", value, "phaseSeq");
            return (Criteria) this;
        }

        public Criteria andPhaseSeqLessThanOrEqualTo(Short value) {
            addCriterion("PHASE_SEQ <=", value, "phaseSeq");
            return (Criteria) this;
        }

        public Criteria andPhaseSeqIn(List<Short> values) {
            addCriterion("PHASE_SEQ in", values, "phaseSeq");
            return (Criteria) this;
        }

        public Criteria andPhaseSeqNotIn(List<Short> values) {
            addCriterion("PHASE_SEQ not in", values, "phaseSeq");
            return (Criteria) this;
        }

        public Criteria andPhaseSeqBetween(Short value1, Short value2) {
            addCriterion("PHASE_SEQ between", value1, value2, "phaseSeq");
            return (Criteria) this;
        }

        public Criteria andPhaseSeqNotBetween(Short value1, Short value2) {
            addCriterion("PHASE_SEQ not between", value1, value2, "phaseSeq");
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