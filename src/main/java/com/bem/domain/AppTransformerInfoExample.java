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

        public Criteria andTransformerAssetsNoIsNull() {
            addCriterion("TRANSFORMER_ASSETS_NO is null");
            return (Criteria) this;
        }

        public Criteria andTransformerAssetsNoIsNotNull() {
            addCriterion("TRANSFORMER_ASSETS_NO is not null");
            return (Criteria) this;
        }

        public Criteria andTransformerAssetsNoEqualTo(String value) {
            addCriterion("TRANSFORMER_ASSETS_NO =", value, "transformerAssetsNo");
            return (Criteria) this;
        }

        public Criteria andTransformerAssetsNoNotEqualTo(String value) {
            addCriterion("TRANSFORMER_ASSETS_NO <>", value, "transformerAssetsNo");
            return (Criteria) this;
        }

        public Criteria andTransformerAssetsNoGreaterThan(String value) {
            addCriterion("TRANSFORMER_ASSETS_NO >", value, "transformerAssetsNo");
            return (Criteria) this;
        }

        public Criteria andTransformerAssetsNoGreaterThanOrEqualTo(String value) {
            addCriterion("TRANSFORMER_ASSETS_NO >=", value, "transformerAssetsNo");
            return (Criteria) this;
        }

        public Criteria andTransformerAssetsNoLessThan(String value) {
            addCriterion("TRANSFORMER_ASSETS_NO <", value, "transformerAssetsNo");
            return (Criteria) this;
        }

        public Criteria andTransformerAssetsNoLessThanOrEqualTo(String value) {
            addCriterion("TRANSFORMER_ASSETS_NO <=", value, "transformerAssetsNo");
            return (Criteria) this;
        }

        public Criteria andTransformerAssetsNoLike(String value) {
            addCriterion("TRANSFORMER_ASSETS_NO like", value, "transformerAssetsNo");
            return (Criteria) this;
        }

        public Criteria andTransformerAssetsNoNotLike(String value) {
            addCriterion("TRANSFORMER_ASSETS_NO not like", value, "transformerAssetsNo");
            return (Criteria) this;
        }

        public Criteria andTransformerAssetsNoIn(List<String> values) {
            addCriterion("TRANSFORMER_ASSETS_NO in", values, "transformerAssetsNo");
            return (Criteria) this;
        }

        public Criteria andTransformerAssetsNoNotIn(List<String> values) {
            addCriterion("TRANSFORMER_ASSETS_NO not in", values, "transformerAssetsNo");
            return (Criteria) this;
        }

        public Criteria andTransformerAssetsNoBetween(String value1, String value2) {
            addCriterion("TRANSFORMER_ASSETS_NO between", value1, value2, "transformerAssetsNo");
            return (Criteria) this;
        }

        public Criteria andTransformerAssetsNoNotBetween(String value1, String value2) {
            addCriterion("TRANSFORMER_ASSETS_NO not between", value1, value2, "transformerAssetsNo");
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

        public Criteria andCosStdCodeIsNull() {
            addCriterion("COS_STD_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCosStdCodeIsNotNull() {
            addCriterion("COS_STD_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCosStdCodeEqualTo(Integer value) {
            addCriterion("COS_STD_CODE =", value, "cosStdCode");
            return (Criteria) this;
        }

        public Criteria andCosStdCodeNotEqualTo(Integer value) {
            addCriterion("COS_STD_CODE <>", value, "cosStdCode");
            return (Criteria) this;
        }

        public Criteria andCosStdCodeGreaterThan(Integer value) {
            addCriterion("COS_STD_CODE >", value, "cosStdCode");
            return (Criteria) this;
        }

        public Criteria andCosStdCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("COS_STD_CODE >=", value, "cosStdCode");
            return (Criteria) this;
        }

        public Criteria andCosStdCodeLessThan(Integer value) {
            addCriterion("COS_STD_CODE <", value, "cosStdCode");
            return (Criteria) this;
        }

        public Criteria andCosStdCodeLessThanOrEqualTo(Integer value) {
            addCriterion("COS_STD_CODE <=", value, "cosStdCode");
            return (Criteria) this;
        }

        public Criteria andCosStdCodeIn(List<Integer> values) {
            addCriterion("COS_STD_CODE in", values, "cosStdCode");
            return (Criteria) this;
        }

        public Criteria andCosStdCodeNotIn(List<Integer> values) {
            addCriterion("COS_STD_CODE not in", values, "cosStdCode");
            return (Criteria) this;
        }

        public Criteria andCosStdCodeBetween(Integer value1, Integer value2) {
            addCriterion("COS_STD_CODE between", value1, value2, "cosStdCode");
            return (Criteria) this;
        }

        public Criteria andCosStdCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("COS_STD_CODE not between", value1, value2, "cosStdCode");
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

        public Criteria andTransformerGroupHpIsNull() {
            addCriterion("TRANSFORMER_GROUP_HP is null");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupHpIsNotNull() {
            addCriterion("TRANSFORMER_GROUP_HP is not null");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupHpEqualTo(Short value) {
            addCriterion("TRANSFORMER_GROUP_HP =", value, "transformerGroupHp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupHpNotEqualTo(Short value) {
            addCriterion("TRANSFORMER_GROUP_HP <>", value, "transformerGroupHp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupHpGreaterThan(Short value) {
            addCriterion("TRANSFORMER_GROUP_HP >", value, "transformerGroupHp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupHpGreaterThanOrEqualTo(Short value) {
            addCriterion("TRANSFORMER_GROUP_HP >=", value, "transformerGroupHp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupHpLessThan(Short value) {
            addCriterion("TRANSFORMER_GROUP_HP <", value, "transformerGroupHp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupHpLessThanOrEqualTo(Short value) {
            addCriterion("TRANSFORMER_GROUP_HP <=", value, "transformerGroupHp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupHpIn(List<Short> values) {
            addCriterion("TRANSFORMER_GROUP_HP in", values, "transformerGroupHp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupHpNotIn(List<Short> values) {
            addCriterion("TRANSFORMER_GROUP_HP not in", values, "transformerGroupHp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupHpBetween(Short value1, Short value2) {
            addCriterion("TRANSFORMER_GROUP_HP between", value1, value2, "transformerGroupHp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupHpNotBetween(Short value1, Short value2) {
            addCriterion("TRANSFORMER_GROUP_HP not between", value1, value2, "transformerGroupHp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupLpIsNull() {
            addCriterion("TRANSFORMER_GROUP_LP is null");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupLpIsNotNull() {
            addCriterion("TRANSFORMER_GROUP_LP is not null");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupLpEqualTo(Short value) {
            addCriterion("TRANSFORMER_GROUP_LP =", value, "transformerGroupLp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupLpNotEqualTo(Short value) {
            addCriterion("TRANSFORMER_GROUP_LP <>", value, "transformerGroupLp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupLpGreaterThan(Short value) {
            addCriterion("TRANSFORMER_GROUP_LP >", value, "transformerGroupLp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupLpGreaterThanOrEqualTo(Short value) {
            addCriterion("TRANSFORMER_GROUP_LP >=", value, "transformerGroupLp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupLpLessThan(Short value) {
            addCriterion("TRANSFORMER_GROUP_LP <", value, "transformerGroupLp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupLpLessThanOrEqualTo(Short value) {
            addCriterion("TRANSFORMER_GROUP_LP <=", value, "transformerGroupLp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupLpIn(List<Short> values) {
            addCriterion("TRANSFORMER_GROUP_LP in", values, "transformerGroupLp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupLpNotIn(List<Short> values) {
            addCriterion("TRANSFORMER_GROUP_LP not in", values, "transformerGroupLp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupLpBetween(Short value1, Short value2) {
            addCriterion("TRANSFORMER_GROUP_LP between", value1, value2, "transformerGroupLp");
            return (Criteria) this;
        }

        public Criteria andTransformerGroupLpNotBetween(Short value1, Short value2) {
            addCriterion("TRANSFORMER_GROUP_LP not between", value1, value2, "transformerGroupLp");
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

        public Criteria andRunDateIsNull() {
            addCriterion("RUN_DATE is null");
            return (Criteria) this;
        }

        public Criteria andRunDateIsNotNull() {
            addCriterion("RUN_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andRunDateEqualTo(Date value) {
            addCriterion("RUN_DATE =", value, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateNotEqualTo(Date value) {
            addCriterion("RUN_DATE <>", value, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateGreaterThan(Date value) {
            addCriterion("RUN_DATE >", value, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateGreaterThanOrEqualTo(Date value) {
            addCriterion("RUN_DATE >=", value, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateLessThan(Date value) {
            addCriterion("RUN_DATE <", value, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateLessThanOrEqualTo(Date value) {
            addCriterion("RUN_DATE <=", value, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateIn(List<Date> values) {
            addCriterion("RUN_DATE in", values, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateNotIn(List<Date> values) {
            addCriterion("RUN_DATE not in", values, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateBetween(Date value1, Date value2) {
            addCriterion("RUN_DATE between", value1, value2, "runDate");
            return (Criteria) this;
        }

        public Criteria andRunDateNotBetween(Date value1, Date value2) {
            addCriterion("RUN_DATE not between", value1, value2, "runDate");
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

        public Criteria andLossTypeIsNull() {
            addCriterion("LOSS_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andLossTypeIsNotNull() {
            addCriterion("LOSS_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andLossTypeEqualTo(Short value) {
            addCriterion("LOSS_TYPE =", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeNotEqualTo(Short value) {
            addCriterion("LOSS_TYPE <>", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeGreaterThan(Short value) {
            addCriterion("LOSS_TYPE >", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("LOSS_TYPE >=", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeLessThan(Short value) {
            addCriterion("LOSS_TYPE <", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeLessThanOrEqualTo(Short value) {
            addCriterion("LOSS_TYPE <=", value, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeIn(List<Short> values) {
            addCriterion("LOSS_TYPE in", values, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeNotIn(List<Short> values) {
            addCriterion("LOSS_TYPE not in", values, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeBetween(Short value1, Short value2) {
            addCriterion("LOSS_TYPE between", value1, value2, "lossType");
            return (Criteria) this;
        }

        public Criteria andLossTypeNotBetween(Short value1, Short value2) {
            addCriterion("LOSS_TYPE not between", value1, value2, "lossType");
            return (Criteria) this;
        }

        public Criteria andStationCodeIsNull() {
            addCriterion("STATION_CODE is null");
            return (Criteria) this;
        }

        public Criteria andStationCodeIsNotNull() {
            addCriterion("STATION_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andStationCodeEqualTo(Integer value) {
            addCriterion("STATION_CODE =", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeNotEqualTo(Integer value) {
            addCriterion("STATION_CODE <>", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeGreaterThan(Integer value) {
            addCriterion("STATION_CODE >", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("STATION_CODE >=", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeLessThan(Integer value) {
            addCriterion("STATION_CODE <", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeLessThanOrEqualTo(Integer value) {
            addCriterion("STATION_CODE <=", value, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeIn(List<Integer> values) {
            addCriterion("STATION_CODE in", values, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeNotIn(List<Integer> values) {
            addCriterion("STATION_CODE not in", values, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeBetween(Integer value1, Integer value2) {
            addCriterion("STATION_CODE between", value1, value2, "stationCode");
            return (Criteria) this;
        }

        public Criteria andStationCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("STATION_CODE not between", value1, value2, "stationCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeIsNull() {
            addCriterion("LINE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andLineCodeIsNotNull() {
            addCriterion("LINE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andLineCodeEqualTo(Integer value) {
            addCriterion("LINE_CODE =", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotEqualTo(Integer value) {
            addCriterion("LINE_CODE <>", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeGreaterThan(Integer value) {
            addCriterion("LINE_CODE >", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("LINE_CODE >=", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLessThan(Integer value) {
            addCriterion("LINE_CODE <", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeLessThanOrEqualTo(Integer value) {
            addCriterion("LINE_CODE <=", value, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeIn(List<Integer> values) {
            addCriterion("LINE_CODE in", values, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotIn(List<Integer> values) {
            addCriterion("LINE_CODE not in", values, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeBetween(Integer value1, Integer value2) {
            addCriterion("LINE_CODE between", value1, value2, "lineCode");
            return (Criteria) this;
        }

        public Criteria andLineCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("LINE_CODE not between", value1, value2, "lineCode");
            return (Criteria) this;
        }

        public Criteria andVoltTypeIsNull() {
            addCriterion("VOLT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVoltTypeIsNotNull() {
            addCriterion("VOLT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVoltTypeEqualTo(Short value) {
            addCriterion("VOLT_TYPE =", value, "voltType");
            return (Criteria) this;
        }

        public Criteria andVoltTypeNotEqualTo(Short value) {
            addCriterion("VOLT_TYPE <>", value, "voltType");
            return (Criteria) this;
        }

        public Criteria andVoltTypeGreaterThan(Short value) {
            addCriterion("VOLT_TYPE >", value, "voltType");
            return (Criteria) this;
        }

        public Criteria andVoltTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("VOLT_TYPE >=", value, "voltType");
            return (Criteria) this;
        }

        public Criteria andVoltTypeLessThan(Short value) {
            addCriterion("VOLT_TYPE <", value, "voltType");
            return (Criteria) this;
        }

        public Criteria andVoltTypeLessThanOrEqualTo(Short value) {
            addCriterion("VOLT_TYPE <=", value, "voltType");
            return (Criteria) this;
        }

        public Criteria andVoltTypeIn(List<Short> values) {
            addCriterion("VOLT_TYPE in", values, "voltType");
            return (Criteria) this;
        }

        public Criteria andVoltTypeNotIn(List<Short> values) {
            addCriterion("VOLT_TYPE not in", values, "voltType");
            return (Criteria) this;
        }

        public Criteria andVoltTypeBetween(Short value1, Short value2) {
            addCriterion("VOLT_TYPE between", value1, value2, "voltType");
            return (Criteria) this;
        }

        public Criteria andVoltTypeNotBetween(Short value1, Short value2) {
            addCriterion("VOLT_TYPE not between", value1, value2, "voltType");
            return (Criteria) this;
        }

        public Criteria andChargeManIsNull() {
            addCriterion("CHARGE_MAN is null");
            return (Criteria) this;
        }

        public Criteria andChargeManIsNotNull() {
            addCriterion("CHARGE_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andChargeManEqualTo(String value) {
            addCriterion("CHARGE_MAN =", value, "chargeMan");
            return (Criteria) this;
        }

        public Criteria andChargeManNotEqualTo(String value) {
            addCriterion("CHARGE_MAN <>", value, "chargeMan");
            return (Criteria) this;
        }

        public Criteria andChargeManGreaterThan(String value) {
            addCriterion("CHARGE_MAN >", value, "chargeMan");
            return (Criteria) this;
        }

        public Criteria andChargeManGreaterThanOrEqualTo(String value) {
            addCriterion("CHARGE_MAN >=", value, "chargeMan");
            return (Criteria) this;
        }

        public Criteria andChargeManLessThan(String value) {
            addCriterion("CHARGE_MAN <", value, "chargeMan");
            return (Criteria) this;
        }

        public Criteria andChargeManLessThanOrEqualTo(String value) {
            addCriterion("CHARGE_MAN <=", value, "chargeMan");
            return (Criteria) this;
        }

        public Criteria andChargeManLike(String value) {
            addCriterion("CHARGE_MAN like", value, "chargeMan");
            return (Criteria) this;
        }

        public Criteria andChargeManNotLike(String value) {
            addCriterion("CHARGE_MAN not like", value, "chargeMan");
            return (Criteria) this;
        }

        public Criteria andChargeManIn(List<String> values) {
            addCriterion("CHARGE_MAN in", values, "chargeMan");
            return (Criteria) this;
        }

        public Criteria andChargeManNotIn(List<String> values) {
            addCriterion("CHARGE_MAN not in", values, "chargeMan");
            return (Criteria) this;
        }

        public Criteria andChargeManBetween(String value1, String value2) {
            addCriterion("CHARGE_MAN between", value1, value2, "chargeMan");
            return (Criteria) this;
        }

        public Criteria andChargeManNotBetween(String value1, String value2) {
            addCriterion("CHARGE_MAN not between", value1, value2, "chargeMan");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNoIsNull() {
            addCriterion("WORK_AREA_NO is null");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNoIsNotNull() {
            addCriterion("WORK_AREA_NO is not null");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNoEqualTo(String value) {
            addCriterion("WORK_AREA_NO =", value, "workAreaNo");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNoNotEqualTo(String value) {
            addCriterion("WORK_AREA_NO <>", value, "workAreaNo");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNoGreaterThan(String value) {
            addCriterion("WORK_AREA_NO >", value, "workAreaNo");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNoGreaterThanOrEqualTo(String value) {
            addCriterion("WORK_AREA_NO >=", value, "workAreaNo");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNoLessThan(String value) {
            addCriterion("WORK_AREA_NO <", value, "workAreaNo");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNoLessThanOrEqualTo(String value) {
            addCriterion("WORK_AREA_NO <=", value, "workAreaNo");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNoLike(String value) {
            addCriterion("WORK_AREA_NO like", value, "workAreaNo");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNoNotLike(String value) {
            addCriterion("WORK_AREA_NO not like", value, "workAreaNo");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNoIn(List<String> values) {
            addCriterion("WORK_AREA_NO in", values, "workAreaNo");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNoNotIn(List<String> values) {
            addCriterion("WORK_AREA_NO not in", values, "workAreaNo");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNoBetween(String value1, String value2) {
            addCriterion("WORK_AREA_NO between", value1, value2, "workAreaNo");
            return (Criteria) this;
        }

        public Criteria andWorkAreaNoNotBetween(String value1, String value2) {
            addCriterion("WORK_AREA_NO not between", value1, value2, "workAreaNo");
            return (Criteria) this;
        }

        public Criteria andSetFormatIsNull() {
            addCriterion("SET_FORMAT is null");
            return (Criteria) this;
        }

        public Criteria andSetFormatIsNotNull() {
            addCriterion("SET_FORMAT is not null");
            return (Criteria) this;
        }

        public Criteria andSetFormatEqualTo(Short value) {
            addCriterion("SET_FORMAT =", value, "setFormat");
            return (Criteria) this;
        }

        public Criteria andSetFormatNotEqualTo(Short value) {
            addCriterion("SET_FORMAT <>", value, "setFormat");
            return (Criteria) this;
        }

        public Criteria andSetFormatGreaterThan(Short value) {
            addCriterion("SET_FORMAT >", value, "setFormat");
            return (Criteria) this;
        }

        public Criteria andSetFormatGreaterThanOrEqualTo(Short value) {
            addCriterion("SET_FORMAT >=", value, "setFormat");
            return (Criteria) this;
        }

        public Criteria andSetFormatLessThan(Short value) {
            addCriterion("SET_FORMAT <", value, "setFormat");
            return (Criteria) this;
        }

        public Criteria andSetFormatLessThanOrEqualTo(Short value) {
            addCriterion("SET_FORMAT <=", value, "setFormat");
            return (Criteria) this;
        }

        public Criteria andSetFormatIn(List<Short> values) {
            addCriterion("SET_FORMAT in", values, "setFormat");
            return (Criteria) this;
        }

        public Criteria andSetFormatNotIn(List<Short> values) {
            addCriterion("SET_FORMAT not in", values, "setFormat");
            return (Criteria) this;
        }

        public Criteria andSetFormatBetween(Short value1, Short value2) {
            addCriterion("SET_FORMAT between", value1, value2, "setFormat");
            return (Criteria) this;
        }

        public Criteria andSetFormatNotBetween(Short value1, Short value2) {
            addCriterion("SET_FORMAT not between", value1, value2, "setFormat");
            return (Criteria) this;
        }

        public Criteria andAreaNoIsNull() {
            addCriterion("AREA_NO is null");
            return (Criteria) this;
        }

        public Criteria andAreaNoIsNotNull() {
            addCriterion("AREA_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAreaNoEqualTo(String value) {
            addCriterion("AREA_NO =", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotEqualTo(String value) {
            addCriterion("AREA_NO <>", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoGreaterThan(String value) {
            addCriterion("AREA_NO >", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoGreaterThanOrEqualTo(String value) {
            addCriterion("AREA_NO >=", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoLessThan(String value) {
            addCriterion("AREA_NO <", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoLessThanOrEqualTo(String value) {
            addCriterion("AREA_NO <=", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoLike(String value) {
            addCriterion("AREA_NO like", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotLike(String value) {
            addCriterion("AREA_NO not like", value, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoIn(List<String> values) {
            addCriterion("AREA_NO in", values, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotIn(List<String> values) {
            addCriterion("AREA_NO not in", values, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoBetween(String value1, String value2) {
            addCriterion("AREA_NO between", value1, value2, "areaNo");
            return (Criteria) this;
        }

        public Criteria andAreaNoNotBetween(String value1, String value2) {
            addCriterion("AREA_NO not between", value1, value2, "areaNo");
            return (Criteria) this;
        }

        public Criteria andSupplyRoomIsNull() {
            addCriterion("SUPPLY_ROOM is null");
            return (Criteria) this;
        }

        public Criteria andSupplyRoomIsNotNull() {
            addCriterion("SUPPLY_ROOM is not null");
            return (Criteria) this;
        }

        public Criteria andSupplyRoomEqualTo(String value) {
            addCriterion("SUPPLY_ROOM =", value, "supplyRoom");
            return (Criteria) this;
        }

        public Criteria andSupplyRoomNotEqualTo(String value) {
            addCriterion("SUPPLY_ROOM <>", value, "supplyRoom");
            return (Criteria) this;
        }

        public Criteria andSupplyRoomGreaterThan(String value) {
            addCriterion("SUPPLY_ROOM >", value, "supplyRoom");
            return (Criteria) this;
        }

        public Criteria andSupplyRoomGreaterThanOrEqualTo(String value) {
            addCriterion("SUPPLY_ROOM >=", value, "supplyRoom");
            return (Criteria) this;
        }

        public Criteria andSupplyRoomLessThan(String value) {
            addCriterion("SUPPLY_ROOM <", value, "supplyRoom");
            return (Criteria) this;
        }

        public Criteria andSupplyRoomLessThanOrEqualTo(String value) {
            addCriterion("SUPPLY_ROOM <=", value, "supplyRoom");
            return (Criteria) this;
        }

        public Criteria andSupplyRoomLike(String value) {
            addCriterion("SUPPLY_ROOM like", value, "supplyRoom");
            return (Criteria) this;
        }

        public Criteria andSupplyRoomNotLike(String value) {
            addCriterion("SUPPLY_ROOM not like", value, "supplyRoom");
            return (Criteria) this;
        }

        public Criteria andSupplyRoomIn(List<String> values) {
            addCriterion("SUPPLY_ROOM in", values, "supplyRoom");
            return (Criteria) this;
        }

        public Criteria andSupplyRoomNotIn(List<String> values) {
            addCriterion("SUPPLY_ROOM not in", values, "supplyRoom");
            return (Criteria) this;
        }

        public Criteria andSupplyRoomBetween(String value1, String value2) {
            addCriterion("SUPPLY_ROOM between", value1, value2, "supplyRoom");
            return (Criteria) this;
        }

        public Criteria andSupplyRoomNotBetween(String value1, String value2) {
            addCriterion("SUPPLY_ROOM not between", value1, value2, "supplyRoom");
            return (Criteria) this;
        }

        public Criteria andVillageNoIsNull() {
            addCriterion("VILLAGE_NO is null");
            return (Criteria) this;
        }

        public Criteria andVillageNoIsNotNull() {
            addCriterion("VILLAGE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVillageNoEqualTo(String value) {
            addCriterion("VILLAGE_NO =", value, "villageNo");
            return (Criteria) this;
        }

        public Criteria andVillageNoNotEqualTo(String value) {
            addCriterion("VILLAGE_NO <>", value, "villageNo");
            return (Criteria) this;
        }

        public Criteria andVillageNoGreaterThan(String value) {
            addCriterion("VILLAGE_NO >", value, "villageNo");
            return (Criteria) this;
        }

        public Criteria andVillageNoGreaterThanOrEqualTo(String value) {
            addCriterion("VILLAGE_NO >=", value, "villageNo");
            return (Criteria) this;
        }

        public Criteria andVillageNoLessThan(String value) {
            addCriterion("VILLAGE_NO <", value, "villageNo");
            return (Criteria) this;
        }

        public Criteria andVillageNoLessThanOrEqualTo(String value) {
            addCriterion("VILLAGE_NO <=", value, "villageNo");
            return (Criteria) this;
        }

        public Criteria andVillageNoLike(String value) {
            addCriterion("VILLAGE_NO like", value, "villageNo");
            return (Criteria) this;
        }

        public Criteria andVillageNoNotLike(String value) {
            addCriterion("VILLAGE_NO not like", value, "villageNo");
            return (Criteria) this;
        }

        public Criteria andVillageNoIn(List<String> values) {
            addCriterion("VILLAGE_NO in", values, "villageNo");
            return (Criteria) this;
        }

        public Criteria andVillageNoNotIn(List<String> values) {
            addCriterion("VILLAGE_NO not in", values, "villageNo");
            return (Criteria) this;
        }

        public Criteria andVillageNoBetween(String value1, String value2) {
            addCriterion("VILLAGE_NO between", value1, value2, "villageNo");
            return (Criteria) this;
        }

        public Criteria andVillageNoNotBetween(String value1, String value2) {
            addCriterion("VILLAGE_NO not between", value1, value2, "villageNo");
            return (Criteria) this;
        }

        public Criteria andTransChangeIsNull() {
            addCriterion("TRANS_CHANGE is null");
            return (Criteria) this;
        }

        public Criteria andTransChangeIsNotNull() {
            addCriterion("TRANS_CHANGE is not null");
            return (Criteria) this;
        }

        public Criteria andTransChangeEqualTo(String value) {
            addCriterion("TRANS_CHANGE =", value, "transChange");
            return (Criteria) this;
        }

        public Criteria andTransChangeNotEqualTo(String value) {
            addCriterion("TRANS_CHANGE <>", value, "transChange");
            return (Criteria) this;
        }

        public Criteria andTransChangeGreaterThan(String value) {
            addCriterion("TRANS_CHANGE >", value, "transChange");
            return (Criteria) this;
        }

        public Criteria andTransChangeGreaterThanOrEqualTo(String value) {
            addCriterion("TRANS_CHANGE >=", value, "transChange");
            return (Criteria) this;
        }

        public Criteria andTransChangeLessThan(String value) {
            addCriterion("TRANS_CHANGE <", value, "transChange");
            return (Criteria) this;
        }

        public Criteria andTransChangeLessThanOrEqualTo(String value) {
            addCriterion("TRANS_CHANGE <=", value, "transChange");
            return (Criteria) this;
        }

        public Criteria andTransChangeLike(String value) {
            addCriterion("TRANS_CHANGE like", value, "transChange");
            return (Criteria) this;
        }

        public Criteria andTransChangeNotLike(String value) {
            addCriterion("TRANS_CHANGE not like", value, "transChange");
            return (Criteria) this;
        }

        public Criteria andTransChangeIn(List<String> values) {
            addCriterion("TRANS_CHANGE in", values, "transChange");
            return (Criteria) this;
        }

        public Criteria andTransChangeNotIn(List<String> values) {
            addCriterion("TRANS_CHANGE not in", values, "transChange");
            return (Criteria) this;
        }

        public Criteria andTransChangeBetween(String value1, String value2) {
            addCriterion("TRANS_CHANGE between", value1, value2, "transChange");
            return (Criteria) this;
        }

        public Criteria andTransChangeNotBetween(String value1, String value2) {
            addCriterion("TRANS_CHANGE not between", value1, value2, "transChange");
            return (Criteria) this;
        }

        public Criteria andInputNodeCodeIsNull() {
            addCriterion("INPUT_NODE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andInputNodeCodeIsNotNull() {
            addCriterion("INPUT_NODE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andInputNodeCodeEqualTo(String value) {
            addCriterion("INPUT_NODE_CODE =", value, "inputNodeCode");
            return (Criteria) this;
        }

        public Criteria andInputNodeCodeNotEqualTo(String value) {
            addCriterion("INPUT_NODE_CODE <>", value, "inputNodeCode");
            return (Criteria) this;
        }

        public Criteria andInputNodeCodeGreaterThan(String value) {
            addCriterion("INPUT_NODE_CODE >", value, "inputNodeCode");
            return (Criteria) this;
        }

        public Criteria andInputNodeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("INPUT_NODE_CODE >=", value, "inputNodeCode");
            return (Criteria) this;
        }

        public Criteria andInputNodeCodeLessThan(String value) {
            addCriterion("INPUT_NODE_CODE <", value, "inputNodeCode");
            return (Criteria) this;
        }

        public Criteria andInputNodeCodeLessThanOrEqualTo(String value) {
            addCriterion("INPUT_NODE_CODE <=", value, "inputNodeCode");
            return (Criteria) this;
        }

        public Criteria andInputNodeCodeLike(String value) {
            addCriterion("INPUT_NODE_CODE like", value, "inputNodeCode");
            return (Criteria) this;
        }

        public Criteria andInputNodeCodeNotLike(String value) {
            addCriterion("INPUT_NODE_CODE not like", value, "inputNodeCode");
            return (Criteria) this;
        }

        public Criteria andInputNodeCodeIn(List<String> values) {
            addCriterion("INPUT_NODE_CODE in", values, "inputNodeCode");
            return (Criteria) this;
        }

        public Criteria andInputNodeCodeNotIn(List<String> values) {
            addCriterion("INPUT_NODE_CODE not in", values, "inputNodeCode");
            return (Criteria) this;
        }

        public Criteria andInputNodeCodeBetween(String value1, String value2) {
            addCriterion("INPUT_NODE_CODE between", value1, value2, "inputNodeCode");
            return (Criteria) this;
        }

        public Criteria andInputNodeCodeNotBetween(String value1, String value2) {
            addCriterion("INPUT_NODE_CODE not between", value1, value2, "inputNodeCode");
            return (Criteria) this;
        }

        public Criteria andCapcitorCapacityIsNull() {
            addCriterion("CAPCITOR_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andCapcitorCapacityIsNotNull() {
            addCriterion("CAPCITOR_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andCapcitorCapacityEqualTo(BigDecimal value) {
            addCriterion("CAPCITOR_CAPACITY =", value, "capcitorCapacity");
            return (Criteria) this;
        }

        public Criteria andCapcitorCapacityNotEqualTo(BigDecimal value) {
            addCriterion("CAPCITOR_CAPACITY <>", value, "capcitorCapacity");
            return (Criteria) this;
        }

        public Criteria andCapcitorCapacityGreaterThan(BigDecimal value) {
            addCriterion("CAPCITOR_CAPACITY >", value, "capcitorCapacity");
            return (Criteria) this;
        }

        public Criteria andCapcitorCapacityGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("CAPCITOR_CAPACITY >=", value, "capcitorCapacity");
            return (Criteria) this;
        }

        public Criteria andCapcitorCapacityLessThan(BigDecimal value) {
            addCriterion("CAPCITOR_CAPACITY <", value, "capcitorCapacity");
            return (Criteria) this;
        }

        public Criteria andCapcitorCapacityLessThanOrEqualTo(BigDecimal value) {
            addCriterion("CAPCITOR_CAPACITY <=", value, "capcitorCapacity");
            return (Criteria) this;
        }

        public Criteria andCapcitorCapacityIn(List<BigDecimal> values) {
            addCriterion("CAPCITOR_CAPACITY in", values, "capcitorCapacity");
            return (Criteria) this;
        }

        public Criteria andCapcitorCapacityNotIn(List<BigDecimal> values) {
            addCriterion("CAPCITOR_CAPACITY not in", values, "capcitorCapacity");
            return (Criteria) this;
        }

        public Criteria andCapcitorCapacityBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAPCITOR_CAPACITY between", value1, value2, "capcitorCapacity");
            return (Criteria) this;
        }

        public Criteria andCapcitorCapacityNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("CAPCITOR_CAPACITY not between", value1, value2, "capcitorCapacity");
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
            addCriterion("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterion("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterion("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterion("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterion("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterion("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterion("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterion("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterion("START_DATE not between", value1, value2, "startDate");
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