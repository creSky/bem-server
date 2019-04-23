package com.bem.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppCustomerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppCustomerInfoExample() {
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

        public Criteria andCustomerNoIsNull() {
            addCriterion("CUSTOMER_NO is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIsNotNull() {
            addCriterion("CUSTOMER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNoEqualTo(String value) {
            addCriterion("CUSTOMER_NO =", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotEqualTo(String value) {
            addCriterion("CUSTOMER_NO <>", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThan(String value) {
            addCriterion("CUSTOMER_NO >", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NO >=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThan(String value) {
            addCriterion("CUSTOMER_NO <", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NO <=", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoLike(String value) {
            addCriterion("CUSTOMER_NO like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotLike(String value) {
            addCriterion("CUSTOMER_NO not like", value, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoIn(List<String> values) {
            addCriterion("CUSTOMER_NO in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotIn(List<String> values) {
            addCriterion("CUSTOMER_NO not in", values, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NO between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNoNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NO not between", value1, value2, "customerNo");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("CUSTOMER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("CUSTOMER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("CUSTOMER_NAME =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("CUSTOMER_NAME <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("CUSTOMER_NAME like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("CUSTOMER_NAME not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("CUSTOMER_NAME in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameSpellIsNull() {
            addCriterion("CUSTOMER_NAME_SPELL is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameSpellIsNotNull() {
            addCriterion("CUSTOMER_NAME_SPELL is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameSpellEqualTo(String value) {
            addCriterion("CUSTOMER_NAME_SPELL =", value, "customerNameSpell");
            return (Criteria) this;
        }

        public Criteria andCustomerNameSpellNotEqualTo(String value) {
            addCriterion("CUSTOMER_NAME_SPELL <>", value, "customerNameSpell");
            return (Criteria) this;
        }

        public Criteria andCustomerNameSpellGreaterThan(String value) {
            addCriterion("CUSTOMER_NAME_SPELL >", value, "customerNameSpell");
            return (Criteria) this;
        }

        public Criteria andCustomerNameSpellGreaterThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME_SPELL >=", value, "customerNameSpell");
            return (Criteria) this;
        }

        public Criteria andCustomerNameSpellLessThan(String value) {
            addCriterion("CUSTOMER_NAME_SPELL <", value, "customerNameSpell");
            return (Criteria) this;
        }

        public Criteria andCustomerNameSpellLessThanOrEqualTo(String value) {
            addCriterion("CUSTOMER_NAME_SPELL <=", value, "customerNameSpell");
            return (Criteria) this;
        }

        public Criteria andCustomerNameSpellLike(String value) {
            addCriterion("CUSTOMER_NAME_SPELL like", value, "customerNameSpell");
            return (Criteria) this;
        }

        public Criteria andCustomerNameSpellNotLike(String value) {
            addCriterion("CUSTOMER_NAME_SPELL not like", value, "customerNameSpell");
            return (Criteria) this;
        }

        public Criteria andCustomerNameSpellIn(List<String> values) {
            addCriterion("CUSTOMER_NAME_SPELL in", values, "customerNameSpell");
            return (Criteria) this;
        }

        public Criteria andCustomerNameSpellNotIn(List<String> values) {
            addCriterion("CUSTOMER_NAME_SPELL not in", values, "customerNameSpell");
            return (Criteria) this;
        }

        public Criteria andCustomerNameSpellBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME_SPELL between", value1, value2, "customerNameSpell");
            return (Criteria) this;
        }

        public Criteria andCustomerNameSpellNotBetween(String value1, String value2) {
            addCriterion("CUSTOMER_NAME_SPELL not between", value1, value2, "customerNameSpell");
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

        public Criteria andAddressSpellIsNull() {
            addCriterion("ADDRESS_SPELL is null");
            return (Criteria) this;
        }

        public Criteria andAddressSpellIsNotNull() {
            addCriterion("ADDRESS_SPELL is not null");
            return (Criteria) this;
        }

        public Criteria andAddressSpellEqualTo(String value) {
            addCriterion("ADDRESS_SPELL =", value, "addressSpell");
            return (Criteria) this;
        }

        public Criteria andAddressSpellNotEqualTo(String value) {
            addCriterion("ADDRESS_SPELL <>", value, "addressSpell");
            return (Criteria) this;
        }

        public Criteria andAddressSpellGreaterThan(String value) {
            addCriterion("ADDRESS_SPELL >", value, "addressSpell");
            return (Criteria) this;
        }

        public Criteria andAddressSpellGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS_SPELL >=", value, "addressSpell");
            return (Criteria) this;
        }

        public Criteria andAddressSpellLessThan(String value) {
            addCriterion("ADDRESS_SPELL <", value, "addressSpell");
            return (Criteria) this;
        }

        public Criteria andAddressSpellLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS_SPELL <=", value, "addressSpell");
            return (Criteria) this;
        }

        public Criteria andAddressSpellLike(String value) {
            addCriterion("ADDRESS_SPELL like", value, "addressSpell");
            return (Criteria) this;
        }

        public Criteria andAddressSpellNotLike(String value) {
            addCriterion("ADDRESS_SPELL not like", value, "addressSpell");
            return (Criteria) this;
        }

        public Criteria andAddressSpellIn(List<String> values) {
            addCriterion("ADDRESS_SPELL in", values, "addressSpell");
            return (Criteria) this;
        }

        public Criteria andAddressSpellNotIn(List<String> values) {
            addCriterion("ADDRESS_SPELL not in", values, "addressSpell");
            return (Criteria) this;
        }

        public Criteria andAddressSpellBetween(String value1, String value2) {
            addCriterion("ADDRESS_SPELL between", value1, value2, "addressSpell");
            return (Criteria) this;
        }

        public Criteria andAddressSpellNotBetween(String value1, String value2) {
            addCriterion("ADDRESS_SPELL not between", value1, value2, "addressSpell");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("CARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("CARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(Short value) {
            addCriterion("CARD_TYPE =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(Short value) {
            addCriterion("CARD_TYPE <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(Short value) {
            addCriterion("CARD_TYPE >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("CARD_TYPE >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(Short value) {
            addCriterion("CARD_TYPE <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(Short value) {
            addCriterion("CARD_TYPE <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<Short> values) {
            addCriterion("CARD_TYPE in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<Short> values) {
            addCriterion("CARD_TYPE not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(Short value1, Short value2) {
            addCriterion("CARD_TYPE between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(Short value1, Short value2) {
            addCriterion("CARD_TYPE not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("CARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("CARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("CARD_NO =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("CARD_NO <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("CARD_NO >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("CARD_NO >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("CARD_NO <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("CARD_NO <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("CARD_NO like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("CARD_NO not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("CARD_NO in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("CARD_NO not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("CARD_NO between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("CARD_NO not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andLinkManIsNull() {
            addCriterion("LINK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andLinkManIsNotNull() {
            addCriterion("LINK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andLinkManEqualTo(String value) {
            addCriterion("LINK_MAN =", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotEqualTo(String value) {
            addCriterion("LINK_MAN <>", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManGreaterThan(String value) {
            addCriterion("LINK_MAN >", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManGreaterThanOrEqualTo(String value) {
            addCriterion("LINK_MAN >=", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLessThan(String value) {
            addCriterion("LINK_MAN <", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLessThanOrEqualTo(String value) {
            addCriterion("LINK_MAN <=", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManLike(String value) {
            addCriterion("LINK_MAN like", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotLike(String value) {
            addCriterion("LINK_MAN not like", value, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManIn(List<String> values) {
            addCriterion("LINK_MAN in", values, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotIn(List<String> values) {
            addCriterion("LINK_MAN not in", values, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManBetween(String value1, String value2) {
            addCriterion("LINK_MAN between", value1, value2, "linkMan");
            return (Criteria) this;
        }

        public Criteria andLinkManNotBetween(String value1, String value2) {
            addCriterion("LINK_MAN not between", value1, value2, "linkMan");
            return (Criteria) this;
        }

        public Criteria andContactInformationIsNull() {
            addCriterion("CONTACT_INFORMATION is null");
            return (Criteria) this;
        }

        public Criteria andContactInformationIsNotNull() {
            addCriterion("CONTACT_INFORMATION is not null");
            return (Criteria) this;
        }

        public Criteria andContactInformationEqualTo(String value) {
            addCriterion("CONTACT_INFORMATION =", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotEqualTo(String value) {
            addCriterion("CONTACT_INFORMATION <>", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationGreaterThan(String value) {
            addCriterion("CONTACT_INFORMATION >", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACT_INFORMATION >=", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationLessThan(String value) {
            addCriterion("CONTACT_INFORMATION <", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationLessThanOrEqualTo(String value) {
            addCriterion("CONTACT_INFORMATION <=", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationLike(String value) {
            addCriterion("CONTACT_INFORMATION like", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotLike(String value) {
            addCriterion("CONTACT_INFORMATION not like", value, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationIn(List<String> values) {
            addCriterion("CONTACT_INFORMATION in", values, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotIn(List<String> values) {
            addCriterion("CONTACT_INFORMATION not in", values, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationBetween(String value1, String value2) {
            addCriterion("CONTACT_INFORMATION between", value1, value2, "contactInformation");
            return (Criteria) this;
        }

        public Criteria andContactInformationNotBetween(String value1, String value2) {
            addCriterion("CONTACT_INFORMATION not between", value1, value2, "contactInformation");
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

        public Criteria andCancelDateIsNull() {
            addCriterion("CANCEL_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCancelDateIsNotNull() {
            addCriterion("CANCEL_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCancelDateEqualTo(Date value) {
            addCriterion("CANCEL_DATE =", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotEqualTo(Date value) {
            addCriterion("CANCEL_DATE <>", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThan(Date value) {
            addCriterion("CANCEL_DATE >", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CANCEL_DATE >=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThan(Date value) {
            addCriterion("CANCEL_DATE <", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateLessThanOrEqualTo(Date value) {
            addCriterion("CANCEL_DATE <=", value, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateIn(List<Date> values) {
            addCriterion("CANCEL_DATE in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotIn(List<Date> values) {
            addCriterion("CANCEL_DATE not in", values, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateBetween(Date value1, Date value2) {
            addCriterion("CANCEL_DATE between", value1, value2, "cancelDate");
            return (Criteria) this;
        }

        public Criteria andCancelDateNotBetween(Date value1, Date value2) {
            addCriterion("CANCEL_DATE not between", value1, value2, "cancelDate");
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