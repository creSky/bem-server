package com.bem.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppRefundPreMoneyInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppRefundPreMoneyInfoExample() {
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

        public Criteria andTaskIdEqualTo(String value) {
            addCriterion("TASK_ID =", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotEqualTo(String value) {
            addCriterion("TASK_ID <>", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThan(String value) {
            addCriterion("TASK_ID >", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdGreaterThanOrEqualTo(String value) {
            addCriterion("TASK_ID >=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThan(String value) {
            addCriterion("TASK_ID <", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLessThanOrEqualTo(String value) {
            addCriterion("TASK_ID <=", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdLike(String value) {
            addCriterion("TASK_ID like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotLike(String value) {
            addCriterion("TASK_ID not like", value, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdIn(List<String> values) {
            addCriterion("TASK_ID in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotIn(List<String> values) {
            addCriterion("TASK_ID not in", values, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdBetween(String value1, String value2) {
            addCriterion("TASK_ID between", value1, value2, "taskId");
            return (Criteria) this;
        }

        public Criteria andTaskIdNotBetween(String value1, String value2) {
            addCriterion("TASK_ID not between", value1, value2, "taskId");
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

        public Criteria andSettlementNoIsNull() {
            addCriterion("SETTLEMENT_NO is null");
            return (Criteria) this;
        }

        public Criteria andSettlementNoIsNotNull() {
            addCriterion("SETTLEMENT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementNoEqualTo(String value) {
            addCriterion("SETTLEMENT_NO =", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoNotEqualTo(String value) {
            addCriterion("SETTLEMENT_NO <>", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoGreaterThan(String value) {
            addCriterion("SETTLEMENT_NO >", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_NO >=", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoLessThan(String value) {
            addCriterion("SETTLEMENT_NO <", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_NO <=", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoLike(String value) {
            addCriterion("SETTLEMENT_NO like", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoNotLike(String value) {
            addCriterion("SETTLEMENT_NO not like", value, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoIn(List<String> values) {
            addCriterion("SETTLEMENT_NO in", values, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoNotIn(List<String> values) {
            addCriterion("SETTLEMENT_NO not in", values, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_NO between", value1, value2, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNoNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_NO not between", value1, value2, "settlementNo");
            return (Criteria) this;
        }

        public Criteria andSettlementNameIsNull() {
            addCriterion("SETTLEMENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSettlementNameIsNotNull() {
            addCriterion("SETTLEMENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementNameEqualTo(String value) {
            addCriterion("SETTLEMENT_NAME =", value, "settlementName");
            return (Criteria) this;
        }

        public Criteria andSettlementNameNotEqualTo(String value) {
            addCriterion("SETTLEMENT_NAME <>", value, "settlementName");
            return (Criteria) this;
        }

        public Criteria andSettlementNameGreaterThan(String value) {
            addCriterion("SETTLEMENT_NAME >", value, "settlementName");
            return (Criteria) this;
        }

        public Criteria andSettlementNameGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_NAME >=", value, "settlementName");
            return (Criteria) this;
        }

        public Criteria andSettlementNameLessThan(String value) {
            addCriterion("SETTLEMENT_NAME <", value, "settlementName");
            return (Criteria) this;
        }

        public Criteria andSettlementNameLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_NAME <=", value, "settlementName");
            return (Criteria) this;
        }

        public Criteria andSettlementNameLike(String value) {
            addCriterion("SETTLEMENT_NAME like", value, "settlementName");
            return (Criteria) this;
        }

        public Criteria andSettlementNameNotLike(String value) {
            addCriterion("SETTLEMENT_NAME not like", value, "settlementName");
            return (Criteria) this;
        }

        public Criteria andSettlementNameIn(List<String> values) {
            addCriterion("SETTLEMENT_NAME in", values, "settlementName");
            return (Criteria) this;
        }

        public Criteria andSettlementNameNotIn(List<String> values) {
            addCriterion("SETTLEMENT_NAME not in", values, "settlementName");
            return (Criteria) this;
        }

        public Criteria andSettlementNameBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_NAME between", value1, value2, "settlementName");
            return (Criteria) this;
        }

        public Criteria andSettlementNameNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_NAME not between", value1, value2, "settlementName");
            return (Criteria) this;
        }

        public Criteria andApplyManIsNull() {
            addCriterion("APPLY_MAN is null");
            return (Criteria) this;
        }

        public Criteria andApplyManIsNotNull() {
            addCriterion("APPLY_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andApplyManEqualTo(Integer value) {
            addCriterion("APPLY_MAN =", value, "applyMan");
            return (Criteria) this;
        }

        public Criteria andApplyManNotEqualTo(Integer value) {
            addCriterion("APPLY_MAN <>", value, "applyMan");
            return (Criteria) this;
        }

        public Criteria andApplyManGreaterThan(Integer value) {
            addCriterion("APPLY_MAN >", value, "applyMan");
            return (Criteria) this;
        }

        public Criteria andApplyManGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPLY_MAN >=", value, "applyMan");
            return (Criteria) this;
        }

        public Criteria andApplyManLessThan(Integer value) {
            addCriterion("APPLY_MAN <", value, "applyMan");
            return (Criteria) this;
        }

        public Criteria andApplyManLessThanOrEqualTo(Integer value) {
            addCriterion("APPLY_MAN <=", value, "applyMan");
            return (Criteria) this;
        }

        public Criteria andApplyManIn(List<Integer> values) {
            addCriterion("APPLY_MAN in", values, "applyMan");
            return (Criteria) this;
        }

        public Criteria andApplyManNotIn(List<Integer> values) {
            addCriterion("APPLY_MAN not in", values, "applyMan");
            return (Criteria) this;
        }

        public Criteria andApplyManBetween(Integer value1, Integer value2) {
            addCriterion("APPLY_MAN between", value1, value2, "applyMan");
            return (Criteria) this;
        }

        public Criteria andApplyManNotBetween(Integer value1, Integer value2) {
            addCriterion("APPLY_MAN not between", value1, value2, "applyMan");
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

        public Criteria andManNameIsNull() {
            addCriterion("MAN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andManNameIsNotNull() {
            addCriterion("MAN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andManNameEqualTo(String value) {
            addCriterion("MAN_NAME =", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotEqualTo(String value) {
            addCriterion("MAN_NAME <>", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameGreaterThan(String value) {
            addCriterion("MAN_NAME >", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameGreaterThanOrEqualTo(String value) {
            addCriterion("MAN_NAME >=", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLessThan(String value) {
            addCriterion("MAN_NAME <", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLessThanOrEqualTo(String value) {
            addCriterion("MAN_NAME <=", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameLike(String value) {
            addCriterion("MAN_NAME like", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotLike(String value) {
            addCriterion("MAN_NAME not like", value, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameIn(List<String> values) {
            addCriterion("MAN_NAME in", values, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotIn(List<String> values) {
            addCriterion("MAN_NAME not in", values, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameBetween(String value1, String value2) {
            addCriterion("MAN_NAME between", value1, value2, "manName");
            return (Criteria) this;
        }

        public Criteria andManNameNotBetween(String value1, String value2) {
            addCriterion("MAN_NAME not between", value1, value2, "manName");
            return (Criteria) this;
        }

        public Criteria andManPhoneIsNull() {
            addCriterion("MAN_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andManPhoneIsNotNull() {
            addCriterion("MAN_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andManPhoneEqualTo(String value) {
            addCriterion("MAN_PHONE =", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneNotEqualTo(String value) {
            addCriterion("MAN_PHONE <>", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneGreaterThan(String value) {
            addCriterion("MAN_PHONE >", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("MAN_PHONE >=", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneLessThan(String value) {
            addCriterion("MAN_PHONE <", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneLessThanOrEqualTo(String value) {
            addCriterion("MAN_PHONE <=", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneLike(String value) {
            addCriterion("MAN_PHONE like", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneNotLike(String value) {
            addCriterion("MAN_PHONE not like", value, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneIn(List<String> values) {
            addCriterion("MAN_PHONE in", values, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneNotIn(List<String> values) {
            addCriterion("MAN_PHONE not in", values, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneBetween(String value1, String value2) {
            addCriterion("MAN_PHONE between", value1, value2, "manPhone");
            return (Criteria) this;
        }

        public Criteria andManPhoneNotBetween(String value1, String value2) {
            addCriterion("MAN_PHONE not between", value1, value2, "manPhone");
            return (Criteria) this;
        }

        public Criteria andPassManIsNull() {
            addCriterion("PASS_MAN is null");
            return (Criteria) this;
        }

        public Criteria andPassManIsNotNull() {
            addCriterion("PASS_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andPassManEqualTo(Integer value) {
            addCriterion("PASS_MAN =", value, "passMan");
            return (Criteria) this;
        }

        public Criteria andPassManNotEqualTo(Integer value) {
            addCriterion("PASS_MAN <>", value, "passMan");
            return (Criteria) this;
        }

        public Criteria andPassManGreaterThan(Integer value) {
            addCriterion("PASS_MAN >", value, "passMan");
            return (Criteria) this;
        }

        public Criteria andPassManGreaterThanOrEqualTo(Integer value) {
            addCriterion("PASS_MAN >=", value, "passMan");
            return (Criteria) this;
        }

        public Criteria andPassManLessThan(Integer value) {
            addCriterion("PASS_MAN <", value, "passMan");
            return (Criteria) this;
        }

        public Criteria andPassManLessThanOrEqualTo(Integer value) {
            addCriterion("PASS_MAN <=", value, "passMan");
            return (Criteria) this;
        }

        public Criteria andPassManIn(List<Integer> values) {
            addCriterion("PASS_MAN in", values, "passMan");
            return (Criteria) this;
        }

        public Criteria andPassManNotIn(List<Integer> values) {
            addCriterion("PASS_MAN not in", values, "passMan");
            return (Criteria) this;
        }

        public Criteria andPassManBetween(Integer value1, Integer value2) {
            addCriterion("PASS_MAN between", value1, value2, "passMan");
            return (Criteria) this;
        }

        public Criteria andPassManNotBetween(Integer value1, Integer value2) {
            addCriterion("PASS_MAN not between", value1, value2, "passMan");
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

        public Criteria andPassOptionIsNull() {
            addCriterion("PASS_OPTION is null");
            return (Criteria) this;
        }

        public Criteria andPassOptionIsNotNull() {
            addCriterion("PASS_OPTION is not null");
            return (Criteria) this;
        }

        public Criteria andPassOptionEqualTo(Integer value) {
            addCriterion("PASS_OPTION =", value, "passOption");
            return (Criteria) this;
        }

        public Criteria andPassOptionNotEqualTo(Integer value) {
            addCriterion("PASS_OPTION <>", value, "passOption");
            return (Criteria) this;
        }

        public Criteria andPassOptionGreaterThan(Integer value) {
            addCriterion("PASS_OPTION >", value, "passOption");
            return (Criteria) this;
        }

        public Criteria andPassOptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("PASS_OPTION >=", value, "passOption");
            return (Criteria) this;
        }

        public Criteria andPassOptionLessThan(Integer value) {
            addCriterion("PASS_OPTION <", value, "passOption");
            return (Criteria) this;
        }

        public Criteria andPassOptionLessThanOrEqualTo(Integer value) {
            addCriterion("PASS_OPTION <=", value, "passOption");
            return (Criteria) this;
        }

        public Criteria andPassOptionIn(List<Integer> values) {
            addCriterion("PASS_OPTION in", values, "passOption");
            return (Criteria) this;
        }

        public Criteria andPassOptionNotIn(List<Integer> values) {
            addCriterion("PASS_OPTION not in", values, "passOption");
            return (Criteria) this;
        }

        public Criteria andPassOptionBetween(Integer value1, Integer value2) {
            addCriterion("PASS_OPTION between", value1, value2, "passOption");
            return (Criteria) this;
        }

        public Criteria andPassOptionNotBetween(Integer value1, Integer value2) {
            addCriterion("PASS_OPTION not between", value1, value2, "passOption");
            return (Criteria) this;
        }

        public Criteria andBackMoneyIsNull() {
            addCriterion("BACK_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andBackMoneyIsNotNull() {
            addCriterion("BACK_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andBackMoneyEqualTo(BigDecimal value) {
            addCriterion("BACK_MONEY =", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyNotEqualTo(BigDecimal value) {
            addCriterion("BACK_MONEY <>", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyGreaterThan(BigDecimal value) {
            addCriterion("BACK_MONEY >", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BACK_MONEY >=", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyLessThan(BigDecimal value) {
            addCriterion("BACK_MONEY <", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BACK_MONEY <=", value, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyIn(List<BigDecimal> values) {
            addCriterion("BACK_MONEY in", values, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyNotIn(List<BigDecimal> values) {
            addCriterion("BACK_MONEY not in", values, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACK_MONEY between", value1, value2, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BACK_MONEY not between", value1, value2, "backMoney");
            return (Criteria) this;
        }

        public Criteria andBackTypeIsNull() {
            addCriterion("BACK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andBackTypeIsNotNull() {
            addCriterion("BACK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andBackTypeEqualTo(Integer value) {
            addCriterion("BACK_TYPE =", value, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeNotEqualTo(Integer value) {
            addCriterion("BACK_TYPE <>", value, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeGreaterThan(Integer value) {
            addCriterion("BACK_TYPE >", value, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BACK_TYPE >=", value, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeLessThan(Integer value) {
            addCriterion("BACK_TYPE <", value, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeLessThanOrEqualTo(Integer value) {
            addCriterion("BACK_TYPE <=", value, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeIn(List<Integer> values) {
            addCriterion("BACK_TYPE in", values, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeNotIn(List<Integer> values) {
            addCriterion("BACK_TYPE not in", values, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeBetween(Integer value1, Integer value2) {
            addCriterion("BACK_TYPE between", value1, value2, "backType");
            return (Criteria) this;
        }

        public Criteria andBackTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("BACK_TYPE not between", value1, value2, "backType");
            return (Criteria) this;
        }

        public Criteria andBackReasonIsNull() {
            addCriterion("BACK_REASON is null");
            return (Criteria) this;
        }

        public Criteria andBackReasonIsNotNull() {
            addCriterion("BACK_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andBackReasonEqualTo(String value) {
            addCriterion("BACK_REASON =", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonNotEqualTo(String value) {
            addCriterion("BACK_REASON <>", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonGreaterThan(String value) {
            addCriterion("BACK_REASON >", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonGreaterThanOrEqualTo(String value) {
            addCriterion("BACK_REASON >=", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonLessThan(String value) {
            addCriterion("BACK_REASON <", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonLessThanOrEqualTo(String value) {
            addCriterion("BACK_REASON <=", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonLike(String value) {
            addCriterion("BACK_REASON like", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonNotLike(String value) {
            addCriterion("BACK_REASON not like", value, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonIn(List<String> values) {
            addCriterion("BACK_REASON in", values, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonNotIn(List<String> values) {
            addCriterion("BACK_REASON not in", values, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonBetween(String value1, String value2) {
            addCriterion("BACK_REASON between", value1, value2, "backReason");
            return (Criteria) this;
        }

        public Criteria andBackReasonNotBetween(String value1, String value2) {
            addCriterion("BACK_REASON not between", value1, value2, "backReason");
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

        public Criteria andFChargeModeIsNull() {
            addCriterion("F_CHARGE_MODE is null");
            return (Criteria) this;
        }

        public Criteria andFChargeModeIsNotNull() {
            addCriterion("F_CHARGE_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andFChargeModeEqualTo(Integer value) {
            addCriterion("F_CHARGE_MODE =", value, "fChargeMode");
            return (Criteria) this;
        }

        public Criteria andFChargeModeNotEqualTo(Integer value) {
            addCriterion("F_CHARGE_MODE <>", value, "fChargeMode");
            return (Criteria) this;
        }

        public Criteria andFChargeModeGreaterThan(Integer value) {
            addCriterion("F_CHARGE_MODE >", value, "fChargeMode");
            return (Criteria) this;
        }

        public Criteria andFChargeModeGreaterThanOrEqualTo(Integer value) {
            addCriterion("F_CHARGE_MODE >=", value, "fChargeMode");
            return (Criteria) this;
        }

        public Criteria andFChargeModeLessThan(Integer value) {
            addCriterion("F_CHARGE_MODE <", value, "fChargeMode");
            return (Criteria) this;
        }

        public Criteria andFChargeModeLessThanOrEqualTo(Integer value) {
            addCriterion("F_CHARGE_MODE <=", value, "fChargeMode");
            return (Criteria) this;
        }

        public Criteria andFChargeModeIn(List<Integer> values) {
            addCriterion("F_CHARGE_MODE in", values, "fChargeMode");
            return (Criteria) this;
        }

        public Criteria andFChargeModeNotIn(List<Integer> values) {
            addCriterion("F_CHARGE_MODE not in", values, "fChargeMode");
            return (Criteria) this;
        }

        public Criteria andFChargeModeBetween(Integer value1, Integer value2) {
            addCriterion("F_CHARGE_MODE between", value1, value2, "fChargeMode");
            return (Criteria) this;
        }

        public Criteria andFChargeModeNotBetween(Integer value1, Integer value2) {
            addCriterion("F_CHARGE_MODE not between", value1, value2, "fChargeMode");
            return (Criteria) this;
        }

        public Criteria andPreChargeIsNull() {
            addCriterion("PRE_CHARGE is null");
            return (Criteria) this;
        }

        public Criteria andPreChargeIsNotNull() {
            addCriterion("PRE_CHARGE is not null");
            return (Criteria) this;
        }

        public Criteria andPreChargeEqualTo(BigDecimal value) {
            addCriterion("PRE_CHARGE =", value, "preCharge");
            return (Criteria) this;
        }

        public Criteria andPreChargeNotEqualTo(BigDecimal value) {
            addCriterion("PRE_CHARGE <>", value, "preCharge");
            return (Criteria) this;
        }

        public Criteria andPreChargeGreaterThan(BigDecimal value) {
            addCriterion("PRE_CHARGE >", value, "preCharge");
            return (Criteria) this;
        }

        public Criteria andPreChargeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRE_CHARGE >=", value, "preCharge");
            return (Criteria) this;
        }

        public Criteria andPreChargeLessThan(BigDecimal value) {
            addCriterion("PRE_CHARGE <", value, "preCharge");
            return (Criteria) this;
        }

        public Criteria andPreChargeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRE_CHARGE <=", value, "preCharge");
            return (Criteria) this;
        }

        public Criteria andPreChargeIn(List<BigDecimal> values) {
            addCriterion("PRE_CHARGE in", values, "preCharge");
            return (Criteria) this;
        }

        public Criteria andPreChargeNotIn(List<BigDecimal> values) {
            addCriterion("PRE_CHARGE not in", values, "preCharge");
            return (Criteria) this;
        }

        public Criteria andPreChargeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRE_CHARGE between", value1, value2, "preCharge");
            return (Criteria) this;
        }

        public Criteria andPreChargeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRE_CHARGE not between", value1, value2, "preCharge");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNull() {
            addCriterion("IS_PAY is null");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNotNull() {
            addCriterion("IS_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEqualTo(Integer value) {
            addCriterion("IS_PAY =", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotEqualTo(Integer value) {
            addCriterion("IS_PAY <>", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThan(Integer value) {
            addCriterion("IS_PAY >", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_PAY >=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThan(Integer value) {
            addCriterion("IS_PAY <", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThanOrEqualTo(Integer value) {
            addCriterion("IS_PAY <=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayIn(List<Integer> values) {
            addCriterion("IS_PAY in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotIn(List<Integer> values) {
            addCriterion("IS_PAY not in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayBetween(Integer value1, Integer value2) {
            addCriterion("IS_PAY between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_PAY not between", value1, value2, "isPay");
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