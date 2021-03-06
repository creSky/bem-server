package com.bem.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppUserInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppUserInfoExample() {
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

        public Criteria andAppNoIsNull() {
            addCriterion("APP_NO is null");
            return (Criteria) this;
        }

        public Criteria andAppNoIsNotNull() {
            addCriterion("APP_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAppNoEqualTo(String value) {
            addCriterion("APP_NO =", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoNotEqualTo(String value) {
            addCriterion("APP_NO <>", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoGreaterThan(String value) {
            addCriterion("APP_NO >", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoGreaterThanOrEqualTo(String value) {
            addCriterion("APP_NO >=", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoLessThan(String value) {
            addCriterion("APP_NO <", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoLessThanOrEqualTo(String value) {
            addCriterion("APP_NO <=", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoLike(String value) {
            addCriterion("APP_NO like", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoNotLike(String value) {
            addCriterion("APP_NO not like", value, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoIn(List<String> values) {
            addCriterion("APP_NO in", values, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoNotIn(List<String> values) {
            addCriterion("APP_NO not in", values, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoBetween(String value1, String value2) {
            addCriterion("APP_NO between", value1, value2, "appNo");
            return (Criteria) this;
        }

        public Criteria andAppNoNotBetween(String value1, String value2) {
            addCriterion("APP_NO not between", value1, value2, "appNo");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNull() {
            addCriterion("TEMPLATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIsNotNull() {
            addCriterion("TEMPLATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTemplateIdEqualTo(Integer value) {
            addCriterion("TEMPLATE_ID =", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotEqualTo(Integer value) {
            addCriterion("TEMPLATE_ID <>", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThan(Integer value) {
            addCriterion("TEMPLATE_ID >", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("TEMPLATE_ID >=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThan(Integer value) {
            addCriterion("TEMPLATE_ID <", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdLessThanOrEqualTo(Integer value) {
            addCriterion("TEMPLATE_ID <=", value, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdIn(List<Integer> values) {
            addCriterion("TEMPLATE_ID in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotIn(List<Integer> values) {
            addCriterion("TEMPLATE_ID not in", values, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdBetween(Integer value1, Integer value2) {
            addCriterion("TEMPLATE_ID between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andTemplateIdNotBetween(Integer value1, Integer value2) {
            addCriterion("TEMPLATE_ID not between", value1, value2, "templateId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Long value) {
            addCriterion("CUSTOMER_ID =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Long value) {
            addCriterion("CUSTOMER_ID <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Long value) {
            addCriterion("CUSTOMER_ID >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("CUSTOMER_ID >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Long value) {
            addCriterion("CUSTOMER_ID <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("CUSTOMER_ID <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Long> values) {
            addCriterion("CUSTOMER_ID in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Long> values) {
            addCriterion("CUSTOMER_ID not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Long value1, Long value2) {
            addCriterion("CUSTOMER_ID between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("CUSTOMER_ID not between", value1, value2, "customerId");
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

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
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

        public Criteria andBusinessPlaceCodeEqualTo(String value) {
            addCriterion("BUSINESS_PLACE_CODE =", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeNotEqualTo(String value) {
            addCriterion("BUSINESS_PLACE_CODE <>", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeGreaterThan(String value) {
            addCriterion("BUSINESS_PLACE_CODE >", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("BUSINESS_PLACE_CODE >=", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeLessThan(String value) {
            addCriterion("BUSINESS_PLACE_CODE <", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeLessThanOrEqualTo(String value) {
            addCriterion("BUSINESS_PLACE_CODE <=", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeLike(String value) {
            addCriterion("BUSINESS_PLACE_CODE like", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeNotLike(String value) {
            addCriterion("BUSINESS_PLACE_CODE not like", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeIn(List<String> values) {
            addCriterion("BUSINESS_PLACE_CODE in", values, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeNotIn(List<String> values) {
            addCriterion("BUSINESS_PLACE_CODE not in", values, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeBetween(String value1, String value2) {
            addCriterion("BUSINESS_PLACE_CODE between", value1, value2, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeNotBetween(String value1, String value2) {
            addCriterion("BUSINESS_PLACE_CODE not between", value1, value2, "businessPlaceCode");
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

        public Criteria andAllCapacityIsNull() {
            addCriterion("ALL_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andAllCapacityIsNotNull() {
            addCriterion("ALL_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andAllCapacityEqualTo(BigDecimal value) {
            addCriterion("ALL_CAPACITY =", value, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityNotEqualTo(BigDecimal value) {
            addCriterion("ALL_CAPACITY <>", value, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityGreaterThan(BigDecimal value) {
            addCriterion("ALL_CAPACITY >", value, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ALL_CAPACITY >=", value, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityLessThan(BigDecimal value) {
            addCriterion("ALL_CAPACITY <", value, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ALL_CAPACITY <=", value, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityIn(List<BigDecimal> values) {
            addCriterion("ALL_CAPACITY in", values, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityNotIn(List<BigDecimal> values) {
            addCriterion("ALL_CAPACITY not in", values, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALL_CAPACITY between", value1, value2, "allCapacity");
            return (Criteria) this;
        }

        public Criteria andAllCapacityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ALL_CAPACITY not between", value1, value2, "allCapacity");
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

        public Criteria andElecTypeIsNull() {
            addCriterion("ELEC_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andElecTypeIsNotNull() {
            addCriterion("ELEC_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andElecTypeEqualTo(Short value) {
            addCriterion("ELEC_TYPE =", value, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeNotEqualTo(Short value) {
            addCriterion("ELEC_TYPE <>", value, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeGreaterThan(Short value) {
            addCriterion("ELEC_TYPE >", value, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("ELEC_TYPE >=", value, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeLessThan(Short value) {
            addCriterion("ELEC_TYPE <", value, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeLessThanOrEqualTo(Short value) {
            addCriterion("ELEC_TYPE <=", value, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeIn(List<Short> values) {
            addCriterion("ELEC_TYPE in", values, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeNotIn(List<Short> values) {
            addCriterion("ELEC_TYPE not in", values, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeBetween(Short value1, Short value2) {
            addCriterion("ELEC_TYPE between", value1, value2, "elecType");
            return (Criteria) this;
        }

        public Criteria andElecTypeNotBetween(Short value1, Short value2) {
            addCriterion("ELEC_TYPE not between", value1, value2, "elecType");
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

        public Criteria andMsModeTypeIsNull() {
            addCriterion("MS_MODE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andMsModeTypeIsNotNull() {
            addCriterion("MS_MODE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andMsModeTypeEqualTo(Short value) {
            addCriterion("MS_MODE_TYPE =", value, "msModeType");
            return (Criteria) this;
        }

        public Criteria andMsModeTypeNotEqualTo(Short value) {
            addCriterion("MS_MODE_TYPE <>", value, "msModeType");
            return (Criteria) this;
        }

        public Criteria andMsModeTypeGreaterThan(Short value) {
            addCriterion("MS_MODE_TYPE >", value, "msModeType");
            return (Criteria) this;
        }

        public Criteria andMsModeTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("MS_MODE_TYPE >=", value, "msModeType");
            return (Criteria) this;
        }

        public Criteria andMsModeTypeLessThan(Short value) {
            addCriterion("MS_MODE_TYPE <", value, "msModeType");
            return (Criteria) this;
        }

        public Criteria andMsModeTypeLessThanOrEqualTo(Short value) {
            addCriterion("MS_MODE_TYPE <=", value, "msModeType");
            return (Criteria) this;
        }

        public Criteria andMsModeTypeIn(List<Short> values) {
            addCriterion("MS_MODE_TYPE in", values, "msModeType");
            return (Criteria) this;
        }

        public Criteria andMsModeTypeNotIn(List<Short> values) {
            addCriterion("MS_MODE_TYPE not in", values, "msModeType");
            return (Criteria) this;
        }

        public Criteria andMsModeTypeBetween(Short value1, Short value2) {
            addCriterion("MS_MODE_TYPE between", value1, value2, "msModeType");
            return (Criteria) this;
        }

        public Criteria andMsModeTypeNotBetween(Short value1, Short value2) {
            addCriterion("MS_MODE_TYPE not between", value1, value2, "msModeType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeIsNull() {
            addCriterion("LOAD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLoadTypeIsNotNull() {
            addCriterion("LOAD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLoadTypeEqualTo(Short value) {
            addCriterion("LOAD_TYPE =", value, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeNotEqualTo(Short value) {
            addCriterion("LOAD_TYPE <>", value, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeGreaterThan(Short value) {
            addCriterion("LOAD_TYPE >", value, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("LOAD_TYPE >=", value, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeLessThan(Short value) {
            addCriterion("LOAD_TYPE <", value, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeLessThanOrEqualTo(Short value) {
            addCriterion("LOAD_TYPE <=", value, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeIn(List<Short> values) {
            addCriterion("LOAD_TYPE in", values, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeNotIn(List<Short> values) {
            addCriterion("LOAD_TYPE not in", values, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeBetween(Short value1, Short value2) {
            addCriterion("LOAD_TYPE between", value1, value2, "loadType");
            return (Criteria) this;
        }

        public Criteria andLoadTypeNotBetween(Short value1, Short value2) {
            addCriterion("LOAD_TYPE not between", value1, value2, "loadType");
            return (Criteria) this;
        }

        public Criteria andIsHighTypeIsNull() {
            addCriterion("IS_HIGH_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andIsHighTypeIsNotNull() {
            addCriterion("IS_HIGH_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andIsHighTypeEqualTo(Short value) {
            addCriterion("IS_HIGH_TYPE =", value, "isHighType");
            return (Criteria) this;
        }

        public Criteria andIsHighTypeNotEqualTo(Short value) {
            addCriterion("IS_HIGH_TYPE <>", value, "isHighType");
            return (Criteria) this;
        }

        public Criteria andIsHighTypeGreaterThan(Short value) {
            addCriterion("IS_HIGH_TYPE >", value, "isHighType");
            return (Criteria) this;
        }

        public Criteria andIsHighTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("IS_HIGH_TYPE >=", value, "isHighType");
            return (Criteria) this;
        }

        public Criteria andIsHighTypeLessThan(Short value) {
            addCriterion("IS_HIGH_TYPE <", value, "isHighType");
            return (Criteria) this;
        }

        public Criteria andIsHighTypeLessThanOrEqualTo(Short value) {
            addCriterion("IS_HIGH_TYPE <=", value, "isHighType");
            return (Criteria) this;
        }

        public Criteria andIsHighTypeIn(List<Short> values) {
            addCriterion("IS_HIGH_TYPE in", values, "isHighType");
            return (Criteria) this;
        }

        public Criteria andIsHighTypeNotIn(List<Short> values) {
            addCriterion("IS_HIGH_TYPE not in", values, "isHighType");
            return (Criteria) this;
        }

        public Criteria andIsHighTypeBetween(Short value1, Short value2) {
            addCriterion("IS_HIGH_TYPE between", value1, value2, "isHighType");
            return (Criteria) this;
        }

        public Criteria andIsHighTypeNotBetween(Short value1, Short value2) {
            addCriterion("IS_HIGH_TYPE not between", value1, value2, "isHighType");
            return (Criteria) this;
        }

        public Criteria andTempTypeIsNull() {
            addCriterion("TEMP_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTempTypeIsNotNull() {
            addCriterion("TEMP_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTempTypeEqualTo(Short value) {
            addCriterion("TEMP_TYPE =", value, "tempType");
            return (Criteria) this;
        }

        public Criteria andTempTypeNotEqualTo(Short value) {
            addCriterion("TEMP_TYPE <>", value, "tempType");
            return (Criteria) this;
        }

        public Criteria andTempTypeGreaterThan(Short value) {
            addCriterion("TEMP_TYPE >", value, "tempType");
            return (Criteria) this;
        }

        public Criteria andTempTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("TEMP_TYPE >=", value, "tempType");
            return (Criteria) this;
        }

        public Criteria andTempTypeLessThan(Short value) {
            addCriterion("TEMP_TYPE <", value, "tempType");
            return (Criteria) this;
        }

        public Criteria andTempTypeLessThanOrEqualTo(Short value) {
            addCriterion("TEMP_TYPE <=", value, "tempType");
            return (Criteria) this;
        }

        public Criteria andTempTypeIn(List<Short> values) {
            addCriterion("TEMP_TYPE in", values, "tempType");
            return (Criteria) this;
        }

        public Criteria andTempTypeNotIn(List<Short> values) {
            addCriterion("TEMP_TYPE not in", values, "tempType");
            return (Criteria) this;
        }

        public Criteria andTempTypeBetween(Short value1, Short value2) {
            addCriterion("TEMP_TYPE between", value1, value2, "tempType");
            return (Criteria) this;
        }

        public Criteria andTempTypeNotBetween(Short value1, Short value2) {
            addCriterion("TEMP_TYPE not between", value1, value2, "tempType");
            return (Criteria) this;
        }

        public Criteria andCreditRankTypeIsNull() {
            addCriterion("CREDIT_RANK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCreditRankTypeIsNotNull() {
            addCriterion("CREDIT_RANK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCreditRankTypeEqualTo(Short value) {
            addCriterion("CREDIT_RANK_TYPE =", value, "creditRankType");
            return (Criteria) this;
        }

        public Criteria andCreditRankTypeNotEqualTo(Short value) {
            addCriterion("CREDIT_RANK_TYPE <>", value, "creditRankType");
            return (Criteria) this;
        }

        public Criteria andCreditRankTypeGreaterThan(Short value) {
            addCriterion("CREDIT_RANK_TYPE >", value, "creditRankType");
            return (Criteria) this;
        }

        public Criteria andCreditRankTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("CREDIT_RANK_TYPE >=", value, "creditRankType");
            return (Criteria) this;
        }

        public Criteria andCreditRankTypeLessThan(Short value) {
            addCriterion("CREDIT_RANK_TYPE <", value, "creditRankType");
            return (Criteria) this;
        }

        public Criteria andCreditRankTypeLessThanOrEqualTo(Short value) {
            addCriterion("CREDIT_RANK_TYPE <=", value, "creditRankType");
            return (Criteria) this;
        }

        public Criteria andCreditRankTypeIn(List<Short> values) {
            addCriterion("CREDIT_RANK_TYPE in", values, "creditRankType");
            return (Criteria) this;
        }

        public Criteria andCreditRankTypeNotIn(List<Short> values) {
            addCriterion("CREDIT_RANK_TYPE not in", values, "creditRankType");
            return (Criteria) this;
        }

        public Criteria andCreditRankTypeBetween(Short value1, Short value2) {
            addCriterion("CREDIT_RANK_TYPE between", value1, value2, "creditRankType");
            return (Criteria) this;
        }

        public Criteria andCreditRankTypeNotBetween(Short value1, Short value2) {
            addCriterion("CREDIT_RANK_TYPE not between", value1, value2, "creditRankType");
            return (Criteria) this;
        }

        public Criteria andWriteTypeIsNull() {
            addCriterion("WRITE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andWriteTypeIsNotNull() {
            addCriterion("WRITE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andWriteTypeEqualTo(Short value) {
            addCriterion("WRITE_TYPE =", value, "writeType");
            return (Criteria) this;
        }

        public Criteria andWriteTypeNotEqualTo(Short value) {
            addCriterion("WRITE_TYPE <>", value, "writeType");
            return (Criteria) this;
        }

        public Criteria andWriteTypeGreaterThan(Short value) {
            addCriterion("WRITE_TYPE >", value, "writeType");
            return (Criteria) this;
        }

        public Criteria andWriteTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("WRITE_TYPE >=", value, "writeType");
            return (Criteria) this;
        }

        public Criteria andWriteTypeLessThan(Short value) {
            addCriterion("WRITE_TYPE <", value, "writeType");
            return (Criteria) this;
        }

        public Criteria andWriteTypeLessThanOrEqualTo(Short value) {
            addCriterion("WRITE_TYPE <=", value, "writeType");
            return (Criteria) this;
        }

        public Criteria andWriteTypeIn(List<Short> values) {
            addCriterion("WRITE_TYPE in", values, "writeType");
            return (Criteria) this;
        }

        public Criteria andWriteTypeNotIn(List<Short> values) {
            addCriterion("WRITE_TYPE not in", values, "writeType");
            return (Criteria) this;
        }

        public Criteria andWriteTypeBetween(Short value1, Short value2) {
            addCriterion("WRITE_TYPE between", value1, value2, "writeType");
            return (Criteria) this;
        }

        public Criteria andWriteTypeNotBetween(Short value1, Short value2) {
            addCriterion("WRITE_TYPE not between", value1, value2, "writeType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("USER_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("USER_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Short value) {
            addCriterion("USER_TYPE =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Short value) {
            addCriterion("USER_TYPE <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Short value) {
            addCriterion("USER_TYPE >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("USER_TYPE >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Short value) {
            addCriterion("USER_TYPE <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Short value) {
            addCriterion("USER_TYPE <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Short> values) {
            addCriterion("USER_TYPE in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Short> values) {
            addCriterion("USER_TYPE not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Short value1, Short value2) {
            addCriterion("USER_TYPE between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Short value1, Short value2) {
            addCriterion("USER_TYPE not between", value1, value2, "userType");
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