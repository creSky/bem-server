package com.bem.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppSettlementInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppSettlementInfoExample() {
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

        public Criteria andSettlementPhoneIsNull() {
            addCriterion("SETTLEMENT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andSettlementPhoneIsNotNull() {
            addCriterion("SETTLEMENT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementPhoneEqualTo(String value) {
            addCriterion("SETTLEMENT_PHONE =", value, "settlementPhone");
            return (Criteria) this;
        }

        public Criteria andSettlementPhoneNotEqualTo(String value) {
            addCriterion("SETTLEMENT_PHONE <>", value, "settlementPhone");
            return (Criteria) this;
        }

        public Criteria andSettlementPhoneGreaterThan(String value) {
            addCriterion("SETTLEMENT_PHONE >", value, "settlementPhone");
            return (Criteria) this;
        }

        public Criteria andSettlementPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_PHONE >=", value, "settlementPhone");
            return (Criteria) this;
        }

        public Criteria andSettlementPhoneLessThan(String value) {
            addCriterion("SETTLEMENT_PHONE <", value, "settlementPhone");
            return (Criteria) this;
        }

        public Criteria andSettlementPhoneLessThanOrEqualTo(String value) {
            addCriterion("SETTLEMENT_PHONE <=", value, "settlementPhone");
            return (Criteria) this;
        }

        public Criteria andSettlementPhoneLike(String value) {
            addCriterion("SETTLEMENT_PHONE like", value, "settlementPhone");
            return (Criteria) this;
        }

        public Criteria andSettlementPhoneNotLike(String value) {
            addCriterion("SETTLEMENT_PHONE not like", value, "settlementPhone");
            return (Criteria) this;
        }

        public Criteria andSettlementPhoneIn(List<String> values) {
            addCriterion("SETTLEMENT_PHONE in", values, "settlementPhone");
            return (Criteria) this;
        }

        public Criteria andSettlementPhoneNotIn(List<String> values) {
            addCriterion("SETTLEMENT_PHONE not in", values, "settlementPhone");
            return (Criteria) this;
        }

        public Criteria andSettlementPhoneBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_PHONE between", value1, value2, "settlementPhone");
            return (Criteria) this;
        }

        public Criteria andSettlementPhoneNotBetween(String value1, String value2) {
            addCriterion("SETTLEMENT_PHONE not between", value1, value2, "settlementPhone");
            return (Criteria) this;
        }

        public Criteria andChargeModeTypeIsNull() {
            addCriterion("CHARGE_MODE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andChargeModeTypeIsNotNull() {
            addCriterion("CHARGE_MODE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andChargeModeTypeEqualTo(Short value) {
            addCriterion("CHARGE_MODE_TYPE =", value, "chargeModeType");
            return (Criteria) this;
        }

        public Criteria andChargeModeTypeNotEqualTo(Short value) {
            addCriterion("CHARGE_MODE_TYPE <>", value, "chargeModeType");
            return (Criteria) this;
        }

        public Criteria andChargeModeTypeGreaterThan(Short value) {
            addCriterion("CHARGE_MODE_TYPE >", value, "chargeModeType");
            return (Criteria) this;
        }

        public Criteria andChargeModeTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("CHARGE_MODE_TYPE >=", value, "chargeModeType");
            return (Criteria) this;
        }

        public Criteria andChargeModeTypeLessThan(Short value) {
            addCriterion("CHARGE_MODE_TYPE <", value, "chargeModeType");
            return (Criteria) this;
        }

        public Criteria andChargeModeTypeLessThanOrEqualTo(Short value) {
            addCriterion("CHARGE_MODE_TYPE <=", value, "chargeModeType");
            return (Criteria) this;
        }

        public Criteria andChargeModeTypeIn(List<Short> values) {
            addCriterion("CHARGE_MODE_TYPE in", values, "chargeModeType");
            return (Criteria) this;
        }

        public Criteria andChargeModeTypeNotIn(List<Short> values) {
            addCriterion("CHARGE_MODE_TYPE not in", values, "chargeModeType");
            return (Criteria) this;
        }

        public Criteria andChargeModeTypeBetween(Short value1, Short value2) {
            addCriterion("CHARGE_MODE_TYPE between", value1, value2, "chargeModeType");
            return (Criteria) this;
        }

        public Criteria andChargeModeTypeNotBetween(Short value1, Short value2) {
            addCriterion("CHARGE_MODE_TYPE not between", value1, value2, "chargeModeType");
            return (Criteria) this;
        }

        public Criteria andConnectBankIsNull() {
            addCriterion("CONNECT_BANK is null");
            return (Criteria) this;
        }

        public Criteria andConnectBankIsNotNull() {
            addCriterion("CONNECT_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andConnectBankEqualTo(Short value) {
            addCriterion("CONNECT_BANK =", value, "connectBank");
            return (Criteria) this;
        }

        public Criteria andConnectBankNotEqualTo(Short value) {
            addCriterion("CONNECT_BANK <>", value, "connectBank");
            return (Criteria) this;
        }

        public Criteria andConnectBankGreaterThan(Short value) {
            addCriterion("CONNECT_BANK >", value, "connectBank");
            return (Criteria) this;
        }

        public Criteria andConnectBankGreaterThanOrEqualTo(Short value) {
            addCriterion("CONNECT_BANK >=", value, "connectBank");
            return (Criteria) this;
        }

        public Criteria andConnectBankLessThan(Short value) {
            addCriterion("CONNECT_BANK <", value, "connectBank");
            return (Criteria) this;
        }

        public Criteria andConnectBankLessThanOrEqualTo(Short value) {
            addCriterion("CONNECT_BANK <=", value, "connectBank");
            return (Criteria) this;
        }

        public Criteria andConnectBankIn(List<Short> values) {
            addCriterion("CONNECT_BANK in", values, "connectBank");
            return (Criteria) this;
        }

        public Criteria andConnectBankNotIn(List<Short> values) {
            addCriterion("CONNECT_BANK not in", values, "connectBank");
            return (Criteria) this;
        }

        public Criteria andConnectBankBetween(Short value1, Short value2) {
            addCriterion("CONNECT_BANK between", value1, value2, "connectBank");
            return (Criteria) this;
        }

        public Criteria andConnectBankNotBetween(Short value1, Short value2) {
            addCriterion("CONNECT_BANK not between", value1, value2, "connectBank");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNull() {
            addCriterion("BANK_NO is null");
            return (Criteria) this;
        }

        public Criteria andBankNoIsNotNull() {
            addCriterion("BANK_NO is not null");
            return (Criteria) this;
        }

        public Criteria andBankNoEqualTo(String value) {
            addCriterion("BANK_NO =", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotEqualTo(String value) {
            addCriterion("BANK_NO <>", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThan(String value) {
            addCriterion("BANK_NO >", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoGreaterThanOrEqualTo(String value) {
            addCriterion("BANK_NO >=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThan(String value) {
            addCriterion("BANK_NO <", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLessThanOrEqualTo(String value) {
            addCriterion("BANK_NO <=", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoLike(String value) {
            addCriterion("BANK_NO like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotLike(String value) {
            addCriterion("BANK_NO not like", value, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoIn(List<String> values) {
            addCriterion("BANK_NO in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotIn(List<String> values) {
            addCriterion("BANK_NO not in", values, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoBetween(String value1, String value2) {
            addCriterion("BANK_NO between", value1, value2, "bankNo");
            return (Criteria) this;
        }

        public Criteria andBankNoNotBetween(String value1, String value2) {
            addCriterion("BANK_NO not between", value1, value2, "bankNo");
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

        public Criteria andAppStatusIsNull() {
            addCriterion("APP_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andAppStatusIsNotNull() {
            addCriterion("APP_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andAppStatusEqualTo(String value) {
            addCriterion("APP_STATUS =", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotEqualTo(String value) {
            addCriterion("APP_STATUS <>", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusGreaterThan(String value) {
            addCriterion("APP_STATUS >", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusGreaterThanOrEqualTo(String value) {
            addCriterion("APP_STATUS >=", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusLessThan(String value) {
            addCriterion("APP_STATUS <", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusLessThanOrEqualTo(String value) {
            addCriterion("APP_STATUS <=", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusLike(String value) {
            addCriterion("APP_STATUS like", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotLike(String value) {
            addCriterion("APP_STATUS not like", value, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusIn(List<String> values) {
            addCriterion("APP_STATUS in", values, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotIn(List<String> values) {
            addCriterion("APP_STATUS not in", values, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusBetween(String value1, String value2) {
            addCriterion("APP_STATUS between", value1, value2, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAppStatusNotBetween(String value1, String value2) {
            addCriterion("APP_STATUS not between", value1, value2, "appStatus");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNull() {
            addCriterion("ACCOUNT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andAccountNameIsNotNull() {
            addCriterion("ACCOUNT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNameEqualTo(String value) {
            addCriterion("ACCOUNT_NAME =", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <>", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThan(String value) {
            addCriterion("ACCOUNT_NAME >", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME >=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThan(String value) {
            addCriterion("ACCOUNT_NAME <", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NAME <=", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameLike(String value) {
            addCriterion("ACCOUNT_NAME like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotLike(String value) {
            addCriterion("ACCOUNT_NAME not like", value, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameIn(List<String> values) {
            addCriterion("ACCOUNT_NAME in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotIn(List<String> values) {
            addCriterion("ACCOUNT_NAME not in", values, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNameNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NAME not between", value1, value2, "accountName");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNull() {
            addCriterion("ACCOUNT_NO is null");
            return (Criteria) this;
        }

        public Criteria andAccountNoIsNotNull() {
            addCriterion("ACCOUNT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andAccountNoEqualTo(String value) {
            addCriterion("ACCOUNT_NO =", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotEqualTo(String value) {
            addCriterion("ACCOUNT_NO <>", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThan(String value) {
            addCriterion("ACCOUNT_NO >", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NO >=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThan(String value) {
            addCriterion("ACCOUNT_NO <", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT_NO <=", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoLike(String value) {
            addCriterion("ACCOUNT_NO like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotLike(String value) {
            addCriterion("ACCOUNT_NO not like", value, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoIn(List<String> values) {
            addCriterion("ACCOUNT_NO in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotIn(List<String> values) {
            addCriterion("ACCOUNT_NO not in", values, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NO between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andAccountNoNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT_NO not between", value1, value2, "accountNo");
            return (Criteria) this;
        }

        public Criteria andCusccIsNull() {
            addCriterion("CUSCC is null");
            return (Criteria) this;
        }

        public Criteria andCusccIsNotNull() {
            addCriterion("CUSCC is not null");
            return (Criteria) this;
        }

        public Criteria andCusccEqualTo(String value) {
            addCriterion("CUSCC =", value, "cuscc");
            return (Criteria) this;
        }

        public Criteria andCusccNotEqualTo(String value) {
            addCriterion("CUSCC <>", value, "cuscc");
            return (Criteria) this;
        }

        public Criteria andCusccGreaterThan(String value) {
            addCriterion("CUSCC >", value, "cuscc");
            return (Criteria) this;
        }

        public Criteria andCusccGreaterThanOrEqualTo(String value) {
            addCriterion("CUSCC >=", value, "cuscc");
            return (Criteria) this;
        }

        public Criteria andCusccLessThan(String value) {
            addCriterion("CUSCC <", value, "cuscc");
            return (Criteria) this;
        }

        public Criteria andCusccLessThanOrEqualTo(String value) {
            addCriterion("CUSCC <=", value, "cuscc");
            return (Criteria) this;
        }

        public Criteria andCusccLike(String value) {
            addCriterion("CUSCC like", value, "cuscc");
            return (Criteria) this;
        }

        public Criteria andCusccNotLike(String value) {
            addCriterion("CUSCC not like", value, "cuscc");
            return (Criteria) this;
        }

        public Criteria andCusccIn(List<String> values) {
            addCriterion("CUSCC in", values, "cuscc");
            return (Criteria) this;
        }

        public Criteria andCusccNotIn(List<String> values) {
            addCriterion("CUSCC not in", values, "cuscc");
            return (Criteria) this;
        }

        public Criteria andCusccBetween(String value1, String value2) {
            addCriterion("CUSCC between", value1, value2, "cuscc");
            return (Criteria) this;
        }

        public Criteria andCusccNotBetween(String value1, String value2) {
            addCriterion("CUSCC not between", value1, value2, "cuscc");
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

        public Criteria andInvoiceTypeIsNull() {
            addCriterion("INVOICE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIsNotNull() {
            addCriterion("INVOICE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeEqualTo(Short value) {
            addCriterion("INVOICE_TYPE =", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotEqualTo(Short value) {
            addCriterion("INVOICE_TYPE <>", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThan(Short value) {
            addCriterion("INVOICE_TYPE >", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("INVOICE_TYPE >=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThan(Short value) {
            addCriterion("INVOICE_TYPE <", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeLessThanOrEqualTo(Short value) {
            addCriterion("INVOICE_TYPE <=", value, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeIn(List<Short> values) {
            addCriterion("INVOICE_TYPE in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotIn(List<Short> values) {
            addCriterion("INVOICE_TYPE not in", values, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeBetween(Short value1, Short value2) {
            addCriterion("INVOICE_TYPE between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoiceTypeNotBetween(Short value1, Short value2) {
            addCriterion("INVOICE_TYPE not between", value1, value2, "invoiceType");
            return (Criteria) this;
        }

        public Criteria andInvoicePrintTypeIsNull() {
            addCriterion("INVOICE_PRINT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePrintTypeIsNotNull() {
            addCriterion("INVOICE_PRINT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePrintTypeEqualTo(Short value) {
            addCriterion("INVOICE_PRINT_TYPE =", value, "invoicePrintType");
            return (Criteria) this;
        }

        public Criteria andInvoicePrintTypeNotEqualTo(Short value) {
            addCriterion("INVOICE_PRINT_TYPE <>", value, "invoicePrintType");
            return (Criteria) this;
        }

        public Criteria andInvoicePrintTypeGreaterThan(Short value) {
            addCriterion("INVOICE_PRINT_TYPE >", value, "invoicePrintType");
            return (Criteria) this;
        }

        public Criteria andInvoicePrintTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("INVOICE_PRINT_TYPE >=", value, "invoicePrintType");
            return (Criteria) this;
        }

        public Criteria andInvoicePrintTypeLessThan(Short value) {
            addCriterion("INVOICE_PRINT_TYPE <", value, "invoicePrintType");
            return (Criteria) this;
        }

        public Criteria andInvoicePrintTypeLessThanOrEqualTo(Short value) {
            addCriterion("INVOICE_PRINT_TYPE <=", value, "invoicePrintType");
            return (Criteria) this;
        }

        public Criteria andInvoicePrintTypeIn(List<Short> values) {
            addCriterion("INVOICE_PRINT_TYPE in", values, "invoicePrintType");
            return (Criteria) this;
        }

        public Criteria andInvoicePrintTypeNotIn(List<Short> values) {
            addCriterion("INVOICE_PRINT_TYPE not in", values, "invoicePrintType");
            return (Criteria) this;
        }

        public Criteria andInvoicePrintTypeBetween(Short value1, Short value2) {
            addCriterion("INVOICE_PRINT_TYPE between", value1, value2, "invoicePrintType");
            return (Criteria) this;
        }

        public Criteria andInvoicePrintTypeNotBetween(Short value1, Short value2) {
            addCriterion("INVOICE_PRINT_TYPE not between", value1, value2, "invoicePrintType");
            return (Criteria) this;
        }

        public Criteria andOpendingBankIsNull() {
            addCriterion("OPENDING_BANK is null");
            return (Criteria) this;
        }

        public Criteria andOpendingBankIsNotNull() {
            addCriterion("OPENDING_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andOpendingBankEqualTo(Short value) {
            addCriterion("OPENDING_BANK =", value, "opendingBank");
            return (Criteria) this;
        }

        public Criteria andOpendingBankNotEqualTo(Short value) {
            addCriterion("OPENDING_BANK <>", value, "opendingBank");
            return (Criteria) this;
        }

        public Criteria andOpendingBankGreaterThan(Short value) {
            addCriterion("OPENDING_BANK >", value, "opendingBank");
            return (Criteria) this;
        }

        public Criteria andOpendingBankGreaterThanOrEqualTo(Short value) {
            addCriterion("OPENDING_BANK >=", value, "opendingBank");
            return (Criteria) this;
        }

        public Criteria andOpendingBankLessThan(Short value) {
            addCriterion("OPENDING_BANK <", value, "opendingBank");
            return (Criteria) this;
        }

        public Criteria andOpendingBankLessThanOrEqualTo(Short value) {
            addCriterion("OPENDING_BANK <=", value, "opendingBank");
            return (Criteria) this;
        }

        public Criteria andOpendingBankIn(List<Short> values) {
            addCriterion("OPENDING_BANK in", values, "opendingBank");
            return (Criteria) this;
        }

        public Criteria andOpendingBankNotIn(List<Short> values) {
            addCriterion("OPENDING_BANK not in", values, "opendingBank");
            return (Criteria) this;
        }

        public Criteria andOpendingBankBetween(Short value1, Short value2) {
            addCriterion("OPENDING_BANK between", value1, value2, "opendingBank");
            return (Criteria) this;
        }

        public Criteria andOpendingBankNotBetween(Short value1, Short value2) {
            addCriterion("OPENDING_BANK not between", value1, value2, "opendingBank");
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

        public Criteria andApplyManIdIsNull() {
            addCriterion("APPLY_MAN_ID is null");
            return (Criteria) this;
        }

        public Criteria andApplyManIdIsNotNull() {
            addCriterion("APPLY_MAN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andApplyManIdEqualTo(Integer value) {
            addCriterion("APPLY_MAN_ID =", value, "applyManId");
            return (Criteria) this;
        }

        public Criteria andApplyManIdNotEqualTo(Integer value) {
            addCriterion("APPLY_MAN_ID <>", value, "applyManId");
            return (Criteria) this;
        }

        public Criteria andApplyManIdGreaterThan(Integer value) {
            addCriterion("APPLY_MAN_ID >", value, "applyManId");
            return (Criteria) this;
        }

        public Criteria andApplyManIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("APPLY_MAN_ID >=", value, "applyManId");
            return (Criteria) this;
        }

        public Criteria andApplyManIdLessThan(Integer value) {
            addCriterion("APPLY_MAN_ID <", value, "applyManId");
            return (Criteria) this;
        }

        public Criteria andApplyManIdLessThanOrEqualTo(Integer value) {
            addCriterion("APPLY_MAN_ID <=", value, "applyManId");
            return (Criteria) this;
        }

        public Criteria andApplyManIdIn(List<Integer> values) {
            addCriterion("APPLY_MAN_ID in", values, "applyManId");
            return (Criteria) this;
        }

        public Criteria andApplyManIdNotIn(List<Integer> values) {
            addCriterion("APPLY_MAN_ID not in", values, "applyManId");
            return (Criteria) this;
        }

        public Criteria andApplyManIdBetween(Integer value1, Integer value2) {
            addCriterion("APPLY_MAN_ID between", value1, value2, "applyManId");
            return (Criteria) this;
        }

        public Criteria andApplyManIdNotBetween(Integer value1, Integer value2) {
            addCriterion("APPLY_MAN_ID not between", value1, value2, "applyManId");
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

        public Criteria andSourceIsNull() {
            addCriterion("SOURCE is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("SOURCE is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("SOURCE =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("SOURCE <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("SOURCE >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("SOURCE >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("SOURCE <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("SOURCE <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("SOURCE like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("SOURCE not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("SOURCE in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("SOURCE not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("SOURCE between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("SOURCE not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andProcInstIdIsNull() {
            addCriterion("PROC_INST_ID is null");
            return (Criteria) this;
        }

        public Criteria andProcInstIdIsNotNull() {
            addCriterion("PROC_INST_ID is not null");
            return (Criteria) this;
        }

        public Criteria andProcInstIdEqualTo(String value) {
            addCriterion("PROC_INST_ID =", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdNotEqualTo(String value) {
            addCriterion("PROC_INST_ID <>", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdGreaterThan(String value) {
            addCriterion("PROC_INST_ID >", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdGreaterThanOrEqualTo(String value) {
            addCriterion("PROC_INST_ID >=", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdLessThan(String value) {
            addCriterion("PROC_INST_ID <", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdLessThanOrEqualTo(String value) {
            addCriterion("PROC_INST_ID <=", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdLike(String value) {
            addCriterion("PROC_INST_ID like", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdNotLike(String value) {
            addCriterion("PROC_INST_ID not like", value, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdIn(List<String> values) {
            addCriterion("PROC_INST_ID in", values, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdNotIn(List<String> values) {
            addCriterion("PROC_INST_ID not in", values, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdBetween(String value1, String value2) {
            addCriterion("PROC_INST_ID between", value1, value2, "procInstId");
            return (Criteria) this;
        }

        public Criteria andProcInstIdNotBetween(String value1, String value2) {
            addCriterion("PROC_INST_ID not between", value1, value2, "procInstId");
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