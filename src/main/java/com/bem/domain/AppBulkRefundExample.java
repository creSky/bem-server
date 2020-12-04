package com.bem.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppBulkRefundExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppBulkRefundExample() {
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

        public Criteria andBusinessPlaceCodeIsNull() {
            addCriterion("BUSINESS_PLACE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeIsNotNull() {
            addCriterion("BUSINESS_PLACE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeEqualTo(Integer value) {
            addCriterion("BUSINESS_PLACE_CODE =", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeNotEqualTo(Integer value) {
            addCriterion("BUSINESS_PLACE_CODE <>", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeGreaterThan(Integer value) {
            addCriterion("BUSINESS_PLACE_CODE >", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("BUSINESS_PLACE_CODE >=", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeLessThan(Integer value) {
            addCriterion("BUSINESS_PLACE_CODE <", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeLessThanOrEqualTo(Integer value) {
            addCriterion("BUSINESS_PLACE_CODE <=", value, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeIn(List<Integer> values) {
            addCriterion("BUSINESS_PLACE_CODE in", values, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeNotIn(List<Integer> values) {
            addCriterion("BUSINESS_PLACE_CODE not in", values, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeBetween(Integer value1, Integer value2) {
            addCriterion("BUSINESS_PLACE_CODE between", value1, value2, "businessPlaceCode");
            return (Criteria) this;
        }

        public Criteria andBusinessPlaceCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("BUSINESS_PLACE_CODE not between", value1, value2, "businessPlaceCode");
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

        public Criteria andRefundMoneyIsNull() {
            addCriterion("REFUND_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIsNotNull() {
            addCriterion("REFUND_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyEqualTo(BigDecimal value) {
            addCriterion("REFUND_MONEY =", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotEqualTo(BigDecimal value) {
            addCriterion("REFUND_MONEY <>", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThan(BigDecimal value) {
            addCriterion("REFUND_MONEY >", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUND_MONEY >=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThan(BigDecimal value) {
            addCriterion("REFUND_MONEY <", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("REFUND_MONEY <=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIn(List<BigDecimal> values) {
            addCriterion("REFUND_MONEY in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotIn(List<BigDecimal> values) {
            addCriterion("REFUND_MONEY not in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUND_MONEY between", value1, value2, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("REFUND_MONEY not between", value1, value2, "refundMoney");
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