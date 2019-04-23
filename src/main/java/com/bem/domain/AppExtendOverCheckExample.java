package com.bem.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AppExtendOverCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppExtendOverCheckExample() {
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

        public Criteria andCivilDesignCodeIsNull() {
            addCriterion("CIVIL_DESIGN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeIsNotNull() {
            addCriterion("CIVIL_DESIGN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_CODE =", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeNotEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_CODE <>", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeGreaterThan(String value) {
            addCriterion("CIVIL_DESIGN_CODE >", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_CODE >=", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeLessThan(String value) {
            addCriterion("CIVIL_DESIGN_CODE <", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeLessThanOrEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_CODE <=", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeLike(String value) {
            addCriterion("CIVIL_DESIGN_CODE like", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeNotLike(String value) {
            addCriterion("CIVIL_DESIGN_CODE not like", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeIn(List<String> values) {
            addCriterion("CIVIL_DESIGN_CODE in", values, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeNotIn(List<String> values) {
            addCriterion("CIVIL_DESIGN_CODE not in", values, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeBetween(String value1, String value2) {
            addCriterion("CIVIL_DESIGN_CODE between", value1, value2, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeNotBetween(String value1, String value2) {
            addCriterion("CIVIL_DESIGN_CODE not between", value1, value2, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeIsNull() {
            addCriterion("CIVIL_CONST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeIsNotNull() {
            addCriterion("CIVIL_CONST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeEqualTo(String value) {
            addCriterion("CIVIL_CONST_CODE =", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeNotEqualTo(String value) {
            addCriterion("CIVIL_CONST_CODE <>", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeGreaterThan(String value) {
            addCriterion("CIVIL_CONST_CODE >", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CIVIL_CONST_CODE >=", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeLessThan(String value) {
            addCriterion("CIVIL_CONST_CODE <", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeLessThanOrEqualTo(String value) {
            addCriterion("CIVIL_CONST_CODE <=", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeLike(String value) {
            addCriterion("CIVIL_CONST_CODE like", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeNotLike(String value) {
            addCriterion("CIVIL_CONST_CODE not like", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeIn(List<String> values) {
            addCriterion("CIVIL_CONST_CODE in", values, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeNotIn(List<String> values) {
            addCriterion("CIVIL_CONST_CODE not in", values, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeBetween(String value1, String value2) {
            addCriterion("CIVIL_CONST_CODE between", value1, value2, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeNotBetween(String value1, String value2) {
            addCriterion("CIVIL_CONST_CODE not between", value1, value2, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeIsNull() {
            addCriterion("ENERGY_DESIGN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeIsNotNull() {
            addCriterion("ENERGY_DESIGN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_CODE =", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeNotEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_CODE <>", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeGreaterThan(String value) {
            addCriterion("ENERGY_DESIGN_CODE >", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_CODE >=", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeLessThan(String value) {
            addCriterion("ENERGY_DESIGN_CODE <", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeLessThanOrEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_CODE <=", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeLike(String value) {
            addCriterion("ENERGY_DESIGN_CODE like", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeNotLike(String value) {
            addCriterion("ENERGY_DESIGN_CODE not like", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeIn(List<String> values) {
            addCriterion("ENERGY_DESIGN_CODE in", values, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeNotIn(List<String> values) {
            addCriterion("ENERGY_DESIGN_CODE not in", values, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeBetween(String value1, String value2) {
            addCriterion("ENERGY_DESIGN_CODE between", value1, value2, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeNotBetween(String value1, String value2) {
            addCriterion("ENERGY_DESIGN_CODE not between", value1, value2, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeIsNull() {
            addCriterion("ENERGY_CONST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeIsNotNull() {
            addCriterion("ENERGY_CONST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeEqualTo(String value) {
            addCriterion("ENERGY_CONST_CODE =", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeNotEqualTo(String value) {
            addCriterion("ENERGY_CONST_CODE <>", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeGreaterThan(String value) {
            addCriterion("ENERGY_CONST_CODE >", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ENERGY_CONST_CODE >=", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeLessThan(String value) {
            addCriterion("ENERGY_CONST_CODE <", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeLessThanOrEqualTo(String value) {
            addCriterion("ENERGY_CONST_CODE <=", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeLike(String value) {
            addCriterion("ENERGY_CONST_CODE like", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeNotLike(String value) {
            addCriterion("ENERGY_CONST_CODE not like", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeIn(List<String> values) {
            addCriterion("ENERGY_CONST_CODE in", values, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeNotIn(List<String> values) {
            addCriterion("ENERGY_CONST_CODE not in", values, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeBetween(String value1, String value2) {
            addCriterion("ENERGY_CONST_CODE between", value1, value2, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeNotBetween(String value1, String value2) {
            addCriterion("ENERGY_CONST_CODE not between", value1, value2, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andSelfTestResultIsNull() {
            addCriterion("SELF_TEST_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andSelfTestResultIsNotNull() {
            addCriterion("SELF_TEST_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andSelfTestResultEqualTo(String value) {
            addCriterion("SELF_TEST_RESULT =", value, "selfTestResult");
            return (Criteria) this;
        }

        public Criteria andSelfTestResultNotEqualTo(String value) {
            addCriterion("SELF_TEST_RESULT <>", value, "selfTestResult");
            return (Criteria) this;
        }

        public Criteria andSelfTestResultGreaterThan(String value) {
            addCriterion("SELF_TEST_RESULT >", value, "selfTestResult");
            return (Criteria) this;
        }

        public Criteria andSelfTestResultGreaterThanOrEqualTo(String value) {
            addCriterion("SELF_TEST_RESULT >=", value, "selfTestResult");
            return (Criteria) this;
        }

        public Criteria andSelfTestResultLessThan(String value) {
            addCriterion("SELF_TEST_RESULT <", value, "selfTestResult");
            return (Criteria) this;
        }

        public Criteria andSelfTestResultLessThanOrEqualTo(String value) {
            addCriterion("SELF_TEST_RESULT <=", value, "selfTestResult");
            return (Criteria) this;
        }

        public Criteria andSelfTestResultLike(String value) {
            addCriterion("SELF_TEST_RESULT like", value, "selfTestResult");
            return (Criteria) this;
        }

        public Criteria andSelfTestResultNotLike(String value) {
            addCriterion("SELF_TEST_RESULT not like", value, "selfTestResult");
            return (Criteria) this;
        }

        public Criteria andSelfTestResultIn(List<String> values) {
            addCriterion("SELF_TEST_RESULT in", values, "selfTestResult");
            return (Criteria) this;
        }

        public Criteria andSelfTestResultNotIn(List<String> values) {
            addCriterion("SELF_TEST_RESULT not in", values, "selfTestResult");
            return (Criteria) this;
        }

        public Criteria andSelfTestResultBetween(String value1, String value2) {
            addCriterion("SELF_TEST_RESULT between", value1, value2, "selfTestResult");
            return (Criteria) this;
        }

        public Criteria andSelfTestResultNotBetween(String value1, String value2) {
            addCriterion("SELF_TEST_RESULT not between", value1, value2, "selfTestResult");
            return (Criteria) this;
        }

        public Criteria andSelfTestDateIsNull() {
            addCriterion("SELF_TEST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSelfTestDateIsNotNull() {
            addCriterion("SELF_TEST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSelfTestDateEqualTo(Date value) {
            addCriterionForJDBCDate("SELF_TEST_DATE =", value, "selfTestDate");
            return (Criteria) this;
        }

        public Criteria andSelfTestDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("SELF_TEST_DATE <>", value, "selfTestDate");
            return (Criteria) this;
        }

        public Criteria andSelfTestDateGreaterThan(Date value) {
            addCriterionForJDBCDate("SELF_TEST_DATE >", value, "selfTestDate");
            return (Criteria) this;
        }

        public Criteria andSelfTestDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SELF_TEST_DATE >=", value, "selfTestDate");
            return (Criteria) this;
        }

        public Criteria andSelfTestDateLessThan(Date value) {
            addCriterionForJDBCDate("SELF_TEST_DATE <", value, "selfTestDate");
            return (Criteria) this;
        }

        public Criteria andSelfTestDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("SELF_TEST_DATE <=", value, "selfTestDate");
            return (Criteria) this;
        }

        public Criteria andSelfTestDateIn(List<Date> values) {
            addCriterionForJDBCDate("SELF_TEST_DATE in", values, "selfTestDate");
            return (Criteria) this;
        }

        public Criteria andSelfTestDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("SELF_TEST_DATE not in", values, "selfTestDate");
            return (Criteria) this;
        }

        public Criteria andSelfTestDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SELF_TEST_DATE between", value1, value2, "selfTestDate");
            return (Criteria) this;
        }

        public Criteria andSelfTestDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("SELF_TEST_DATE not between", value1, value2, "selfTestDate");
            return (Criteria) this;
        }

        public Criteria andCheckManIsNull() {
            addCriterion("CHECK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andCheckManIsNotNull() {
            addCriterion("CHECK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andCheckManEqualTo(String value) {
            addCriterion("CHECK_MAN =", value, "checkMan");
            return (Criteria) this;
        }

        public Criteria andCheckManNotEqualTo(String value) {
            addCriterion("CHECK_MAN <>", value, "checkMan");
            return (Criteria) this;
        }

        public Criteria andCheckManGreaterThan(String value) {
            addCriterion("CHECK_MAN >", value, "checkMan");
            return (Criteria) this;
        }

        public Criteria andCheckManGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_MAN >=", value, "checkMan");
            return (Criteria) this;
        }

        public Criteria andCheckManLessThan(String value) {
            addCriterion("CHECK_MAN <", value, "checkMan");
            return (Criteria) this;
        }

        public Criteria andCheckManLessThanOrEqualTo(String value) {
            addCriterion("CHECK_MAN <=", value, "checkMan");
            return (Criteria) this;
        }

        public Criteria andCheckManLike(String value) {
            addCriterion("CHECK_MAN like", value, "checkMan");
            return (Criteria) this;
        }

        public Criteria andCheckManNotLike(String value) {
            addCriterion("CHECK_MAN not like", value, "checkMan");
            return (Criteria) this;
        }

        public Criteria andCheckManIn(List<String> values) {
            addCriterion("CHECK_MAN in", values, "checkMan");
            return (Criteria) this;
        }

        public Criteria andCheckManNotIn(List<String> values) {
            addCriterion("CHECK_MAN not in", values, "checkMan");
            return (Criteria) this;
        }

        public Criteria andCheckManBetween(String value1, String value2) {
            addCriterion("CHECK_MAN between", value1, value2, "checkMan");
            return (Criteria) this;
        }

        public Criteria andCheckManNotBetween(String value1, String value2) {
            addCriterion("CHECK_MAN not between", value1, value2, "checkMan");
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
            addCriterionForJDBCDate("APPLY_DATE =", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("APPLY_DATE <>", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThan(Date value) {
            addCriterionForJDBCDate("APPLY_DATE >", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("APPLY_DATE >=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThan(Date value) {
            addCriterionForJDBCDate("APPLY_DATE <", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("APPLY_DATE <=", value, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateIn(List<Date> values) {
            addCriterionForJDBCDate("APPLY_DATE in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("APPLY_DATE not in", values, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("APPLY_DATE between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andApplyDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("APPLY_DATE not between", value1, value2, "applyDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNull() {
            addCriterion("CHECK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckDateIsNotNull() {
            addCriterion("CHECK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDateEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_DATE =", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_DATE <>", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThan(Date value) {
            addCriterionForJDBCDate("CHECK_DATE >", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_DATE >=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThan(Date value) {
            addCriterionForJDBCDate("CHECK_DATE <", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CHECK_DATE <=", value, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateIn(List<Date> values) {
            addCriterionForJDBCDate("CHECK_DATE in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("CHECK_DATE not in", values, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHECK_DATE between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CHECK_DATE not between", value1, value2, "checkDate");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNull() {
            addCriterion("CHECK_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNotNull() {
            addCriterion("CHECK_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckResultEqualTo(String value) {
            addCriterion("CHECK_RESULT =", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotEqualTo(String value) {
            addCriterion("CHECK_RESULT <>", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThan(String value) {
            addCriterion("CHECK_RESULT >", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_RESULT >=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThan(String value) {
            addCriterion("CHECK_RESULT <", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThanOrEqualTo(String value) {
            addCriterion("CHECK_RESULT <=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLike(String value) {
            addCriterion("CHECK_RESULT like", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotLike(String value) {
            addCriterion("CHECK_RESULT not like", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultIn(List<String> values) {
            addCriterion("CHECK_RESULT in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotIn(List<String> values) {
            addCriterion("CHECK_RESULT not in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultBetween(String value1, String value2) {
            addCriterion("CHECK_RESULT between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotBetween(String value1, String value2) {
            addCriterion("CHECK_RESULT not between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andConclusionIsNull() {
            addCriterion("CONCLUSION is null");
            return (Criteria) this;
        }

        public Criteria andConclusionIsNotNull() {
            addCriterion("CONCLUSION is not null");
            return (Criteria) this;
        }

        public Criteria andConclusionEqualTo(String value) {
            addCriterion("CONCLUSION =", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotEqualTo(String value) {
            addCriterion("CONCLUSION <>", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionGreaterThan(String value) {
            addCriterion("CONCLUSION >", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionGreaterThanOrEqualTo(String value) {
            addCriterion("CONCLUSION >=", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLessThan(String value) {
            addCriterion("CONCLUSION <", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLessThanOrEqualTo(String value) {
            addCriterion("CONCLUSION <=", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionLike(String value) {
            addCriterion("CONCLUSION like", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotLike(String value) {
            addCriterion("CONCLUSION not like", value, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionIn(List<String> values) {
            addCriterion("CONCLUSION in", values, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotIn(List<String> values) {
            addCriterion("CONCLUSION not in", values, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionBetween(String value1, String value2) {
            addCriterion("CONCLUSION between", value1, value2, "conclusion");
            return (Criteria) this;
        }

        public Criteria andConclusionNotBetween(String value1, String value2) {
            addCriterion("CONCLUSION not between", value1, value2, "conclusion");
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