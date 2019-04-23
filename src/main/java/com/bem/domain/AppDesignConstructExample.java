package com.bem.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AppDesignConstructExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppDesignConstructExample() {
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

        public Criteria andDeptCodeIsNull() {
            addCriterion("DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIsNotNull() {
            addCriterion("DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andDeptCodeEqualTo(String value) {
            addCriterion("DEPT_CODE =", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotEqualTo(String value) {
            addCriterion("DEPT_CODE <>", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThan(String value) {
            addCriterion("DEPT_CODE >", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE >=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThan(String value) {
            addCriterion("DEPT_CODE <", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLessThanOrEqualTo(String value) {
            addCriterion("DEPT_CODE <=", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeLike(String value) {
            addCriterion("DEPT_CODE like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotLike(String value) {
            addCriterion("DEPT_CODE not like", value, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeIn(List<String> values) {
            addCriterion("DEPT_CODE in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotIn(List<String> values) {
            addCriterion("DEPT_CODE not in", values, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeBetween(String value1, String value2) {
            addCriterion("DEPT_CODE between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptCodeNotBetween(String value1, String value2) {
            addCriterion("DEPT_CODE not between", value1, value2, "deptCode");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNull() {
            addCriterion("DEPT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andDeptNameIsNotNull() {
            addCriterion("DEPT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andDeptNameEqualTo(String value) {
            addCriterion("DEPT_NAME =", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotEqualTo(String value) {
            addCriterion("DEPT_NAME <>", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThan(String value) {
            addCriterion("DEPT_NAME >", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameGreaterThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME >=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThan(String value) {
            addCriterion("DEPT_NAME <", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLessThanOrEqualTo(String value) {
            addCriterion("DEPT_NAME <=", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameLike(String value) {
            addCriterion("DEPT_NAME like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotLike(String value) {
            addCriterion("DEPT_NAME not like", value, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameIn(List<String> values) {
            addCriterion("DEPT_NAME in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotIn(List<String> values) {
            addCriterion("DEPT_NAME not in", values, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameBetween(String value1, String value2) {
            addCriterion("DEPT_NAME between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andDeptNameNotBetween(String value1, String value2) {
            addCriterion("DEPT_NAME not between", value1, value2, "deptName");
            return (Criteria) this;
        }

        public Criteria andQualNoIsNull() {
            addCriterion("QUAL_NO is null");
            return (Criteria) this;
        }

        public Criteria andQualNoIsNotNull() {
            addCriterion("QUAL_NO is not null");
            return (Criteria) this;
        }

        public Criteria andQualNoEqualTo(String value) {
            addCriterion("QUAL_NO =", value, "qualNo");
            return (Criteria) this;
        }

        public Criteria andQualNoNotEqualTo(String value) {
            addCriterion("QUAL_NO <>", value, "qualNo");
            return (Criteria) this;
        }

        public Criteria andQualNoGreaterThan(String value) {
            addCriterion("QUAL_NO >", value, "qualNo");
            return (Criteria) this;
        }

        public Criteria andQualNoGreaterThanOrEqualTo(String value) {
            addCriterion("QUAL_NO >=", value, "qualNo");
            return (Criteria) this;
        }

        public Criteria andQualNoLessThan(String value) {
            addCriterion("QUAL_NO <", value, "qualNo");
            return (Criteria) this;
        }

        public Criteria andQualNoLessThanOrEqualTo(String value) {
            addCriterion("QUAL_NO <=", value, "qualNo");
            return (Criteria) this;
        }

        public Criteria andQualNoLike(String value) {
            addCriterion("QUAL_NO like", value, "qualNo");
            return (Criteria) this;
        }

        public Criteria andQualNoNotLike(String value) {
            addCriterion("QUAL_NO not like", value, "qualNo");
            return (Criteria) this;
        }

        public Criteria andQualNoIn(List<String> values) {
            addCriterion("QUAL_NO in", values, "qualNo");
            return (Criteria) this;
        }

        public Criteria andQualNoNotIn(List<String> values) {
            addCriterion("QUAL_NO not in", values, "qualNo");
            return (Criteria) this;
        }

        public Criteria andQualNoBetween(String value1, String value2) {
            addCriterion("QUAL_NO between", value1, value2, "qualNo");
            return (Criteria) this;
        }

        public Criteria andQualNoNotBetween(String value1, String value2) {
            addCriterion("QUAL_NO not between", value1, value2, "qualNo");
            return (Criteria) this;
        }

        public Criteria andDeptLevelIsNull() {
            addCriterion("DEPT_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andDeptLevelIsNotNull() {
            addCriterion("DEPT_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andDeptLevelEqualTo(Integer value) {
            addCriterion("DEPT_LEVEL =", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelNotEqualTo(Integer value) {
            addCriterion("DEPT_LEVEL <>", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelGreaterThan(Integer value) {
            addCriterion("DEPT_LEVEL >", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("DEPT_LEVEL >=", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelLessThan(Integer value) {
            addCriterion("DEPT_LEVEL <", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelLessThanOrEqualTo(Integer value) {
            addCriterion("DEPT_LEVEL <=", value, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelIn(List<Integer> values) {
            addCriterion("DEPT_LEVEL in", values, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelNotIn(List<Integer> values) {
            addCriterion("DEPT_LEVEL not in", values, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelBetween(Integer value1, Integer value2) {
            addCriterion("DEPT_LEVEL between", value1, value2, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andDeptLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("DEPT_LEVEL not between", value1, value2, "deptLevel");
            return (Criteria) this;
        }

        public Criteria andCardLimitIsNull() {
            addCriterion("CARD_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andCardLimitIsNotNull() {
            addCriterion("CARD_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andCardLimitEqualTo(Date value) {
            addCriterionForJDBCDate("CARD_LIMIT =", value, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitNotEqualTo(Date value) {
            addCriterionForJDBCDate("CARD_LIMIT <>", value, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitGreaterThan(Date value) {
            addCriterionForJDBCDate("CARD_LIMIT >", value, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CARD_LIMIT >=", value, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitLessThan(Date value) {
            addCriterionForJDBCDate("CARD_LIMIT <", value, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CARD_LIMIT <=", value, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitIn(List<Date> values) {
            addCriterionForJDBCDate("CARD_LIMIT in", values, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitNotIn(List<Date> values) {
            addCriterionForJDBCDate("CARD_LIMIT not in", values, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CARD_LIMIT between", value1, value2, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andCardLimitNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CARD_LIMIT not between", value1, value2, "cardLimit");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("TYPE is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("TYPE =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("TYPE <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("TYPE >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("TYPE >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("TYPE <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("TYPE <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("TYPE like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("TYPE not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("TYPE in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("TYPE not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("TYPE between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("TYPE not between", value1, value2, "type");
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