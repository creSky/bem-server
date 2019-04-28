package com.bem.domain;

import java.util.ArrayList;
import java.util.List;

public class AppReplyAdviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppReplyAdviceExample() {
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

        public Criteria andReplyAdviceIsNull() {
            addCriterion("REPLY_ADVICE is null");
            return (Criteria) this;
        }

        public Criteria andReplyAdviceIsNotNull() {
            addCriterion("REPLY_ADVICE is not null");
            return (Criteria) this;
        }

        public Criteria andReplyAdviceEqualTo(String value) {
            addCriterion("REPLY_ADVICE =", value, "replyAdvice");
            return (Criteria) this;
        }

        public Criteria andReplyAdviceNotEqualTo(String value) {
            addCriterion("REPLY_ADVICE <>", value, "replyAdvice");
            return (Criteria) this;
        }

        public Criteria andReplyAdviceGreaterThan(String value) {
            addCriterion("REPLY_ADVICE >", value, "replyAdvice");
            return (Criteria) this;
        }

        public Criteria andReplyAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("REPLY_ADVICE >=", value, "replyAdvice");
            return (Criteria) this;
        }

        public Criteria andReplyAdviceLessThan(String value) {
            addCriterion("REPLY_ADVICE <", value, "replyAdvice");
            return (Criteria) this;
        }

        public Criteria andReplyAdviceLessThanOrEqualTo(String value) {
            addCriterion("REPLY_ADVICE <=", value, "replyAdvice");
            return (Criteria) this;
        }

        public Criteria andReplyAdviceLike(String value) {
            addCriterion("REPLY_ADVICE like", value, "replyAdvice");
            return (Criteria) this;
        }

        public Criteria andReplyAdviceNotLike(String value) {
            addCriterion("REPLY_ADVICE not like", value, "replyAdvice");
            return (Criteria) this;
        }

        public Criteria andReplyAdviceIn(List<String> values) {
            addCriterion("REPLY_ADVICE in", values, "replyAdvice");
            return (Criteria) this;
        }

        public Criteria andReplyAdviceNotIn(List<String> values) {
            addCriterion("REPLY_ADVICE not in", values, "replyAdvice");
            return (Criteria) this;
        }

        public Criteria andReplyAdviceBetween(String value1, String value2) {
            addCriterion("REPLY_ADVICE between", value1, value2, "replyAdvice");
            return (Criteria) this;
        }

        public Criteria andReplyAdviceNotBetween(String value1, String value2) {
            addCriterion("REPLY_ADVICE not between", value1, value2, "replyAdvice");
            return (Criteria) this;
        }

        public Criteria andIsAccessIsNull() {
            addCriterion("IS_ACCESS is null");
            return (Criteria) this;
        }

        public Criteria andIsAccessIsNotNull() {
            addCriterion("IS_ACCESS is not null");
            return (Criteria) this;
        }

        public Criteria andIsAccessEqualTo(Integer value) {
            addCriterion("IS_ACCESS =", value, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessNotEqualTo(Integer value) {
            addCriterion("IS_ACCESS <>", value, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessGreaterThan(Integer value) {
            addCriterion("IS_ACCESS >", value, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ACCESS >=", value, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessLessThan(Integer value) {
            addCriterion("IS_ACCESS <", value, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessLessThanOrEqualTo(Integer value) {
            addCriterion("IS_ACCESS <=", value, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessIn(List<Integer> values) {
            addCriterion("IS_ACCESS in", values, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessNotIn(List<Integer> values) {
            addCriterion("IS_ACCESS not in", values, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessBetween(Integer value1, Integer value2) {
            addCriterion("IS_ACCESS between", value1, value2, "isAccess");
            return (Criteria) this;
        }

        public Criteria andIsAccessNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ACCESS not between", value1, value2, "isAccess");
            return (Criteria) this;
        }

        public Criteria andHavaProjectIsNull() {
            addCriterion("HAVA_PROJECT is null");
            return (Criteria) this;
        }

        public Criteria andHavaProjectIsNotNull() {
            addCriterion("HAVA_PROJECT is not null");
            return (Criteria) this;
        }

        public Criteria andHavaProjectEqualTo(Integer value) {
            addCriterion("HAVA_PROJECT =", value, "havaProject");
            return (Criteria) this;
        }

        public Criteria andHavaProjectNotEqualTo(Integer value) {
            addCriterion("HAVA_PROJECT <>", value, "havaProject");
            return (Criteria) this;
        }

        public Criteria andHavaProjectGreaterThan(Integer value) {
            addCriterion("HAVA_PROJECT >", value, "havaProject");
            return (Criteria) this;
        }

        public Criteria andHavaProjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("HAVA_PROJECT >=", value, "havaProject");
            return (Criteria) this;
        }

        public Criteria andHavaProjectLessThan(Integer value) {
            addCriterion("HAVA_PROJECT <", value, "havaProject");
            return (Criteria) this;
        }

        public Criteria andHavaProjectLessThanOrEqualTo(Integer value) {
            addCriterion("HAVA_PROJECT <=", value, "havaProject");
            return (Criteria) this;
        }

        public Criteria andHavaProjectIn(List<Integer> values) {
            addCriterion("HAVA_PROJECT in", values, "havaProject");
            return (Criteria) this;
        }

        public Criteria andHavaProjectNotIn(List<Integer> values) {
            addCriterion("HAVA_PROJECT not in", values, "havaProject");
            return (Criteria) this;
        }

        public Criteria andHavaProjectBetween(Integer value1, Integer value2) {
            addCriterion("HAVA_PROJECT between", value1, value2, "havaProject");
            return (Criteria) this;
        }

        public Criteria andHavaProjectNotBetween(Integer value1, Integer value2) {
            addCriterion("HAVA_PROJECT not between", value1, value2, "havaProject");
            return (Criteria) this;
        }

        public Criteria andIsAnswerIsNull() {
            addCriterion("IS_ANSWER is null");
            return (Criteria) this;
        }

        public Criteria andIsAnswerIsNotNull() {
            addCriterion("IS_ANSWER is not null");
            return (Criteria) this;
        }

        public Criteria andIsAnswerEqualTo(Integer value) {
            addCriterion("IS_ANSWER =", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerNotEqualTo(Integer value) {
            addCriterion("IS_ANSWER <>", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerGreaterThan(Integer value) {
            addCriterion("IS_ANSWER >", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_ANSWER >=", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerLessThan(Integer value) {
            addCriterion("IS_ANSWER <", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerLessThanOrEqualTo(Integer value) {
            addCriterion("IS_ANSWER <=", value, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerIn(List<Integer> values) {
            addCriterion("IS_ANSWER in", values, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerNotIn(List<Integer> values) {
            addCriterion("IS_ANSWER not in", values, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerBetween(Integer value1, Integer value2) {
            addCriterion("IS_ANSWER between", value1, value2, "isAnswer");
            return (Criteria) this;
        }

        public Criteria andIsAnswerNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_ANSWER not between", value1, value2, "isAnswer");
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