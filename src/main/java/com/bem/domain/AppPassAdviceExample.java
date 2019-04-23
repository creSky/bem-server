package com.bem.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppPassAdviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppPassAdviceExample() {
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

        public Criteria andPassAdviceIsNull() {
            addCriterion("PASS_ADVICE is null");
            return (Criteria) this;
        }

        public Criteria andPassAdviceIsNotNull() {
            addCriterion("PASS_ADVICE is not null");
            return (Criteria) this;
        }

        public Criteria andPassAdviceEqualTo(String value) {
            addCriterion("PASS_ADVICE =", value, "passAdvice");
            return (Criteria) this;
        }

        public Criteria andPassAdviceNotEqualTo(String value) {
            addCriterion("PASS_ADVICE <>", value, "passAdvice");
            return (Criteria) this;
        }

        public Criteria andPassAdviceGreaterThan(String value) {
            addCriterion("PASS_ADVICE >", value, "passAdvice");
            return (Criteria) this;
        }

        public Criteria andPassAdviceGreaterThanOrEqualTo(String value) {
            addCriterion("PASS_ADVICE >=", value, "passAdvice");
            return (Criteria) this;
        }

        public Criteria andPassAdviceLessThan(String value) {
            addCriterion("PASS_ADVICE <", value, "passAdvice");
            return (Criteria) this;
        }

        public Criteria andPassAdviceLessThanOrEqualTo(String value) {
            addCriterion("PASS_ADVICE <=", value, "passAdvice");
            return (Criteria) this;
        }

        public Criteria andPassAdviceLike(String value) {
            addCriterion("PASS_ADVICE like", value, "passAdvice");
            return (Criteria) this;
        }

        public Criteria andPassAdviceNotLike(String value) {
            addCriterion("PASS_ADVICE not like", value, "passAdvice");
            return (Criteria) this;
        }

        public Criteria andPassAdviceIn(List<String> values) {
            addCriterion("PASS_ADVICE in", values, "passAdvice");
            return (Criteria) this;
        }

        public Criteria andPassAdviceNotIn(List<String> values) {
            addCriterion("PASS_ADVICE not in", values, "passAdvice");
            return (Criteria) this;
        }

        public Criteria andPassAdviceBetween(String value1, String value2) {
            addCriterion("PASS_ADVICE between", value1, value2, "passAdvice");
            return (Criteria) this;
        }

        public Criteria andPassAdviceNotBetween(String value1, String value2) {
            addCriterion("PASS_ADVICE not between", value1, value2, "passAdvice");
            return (Criteria) this;
        }

        public Criteria andArgeeFlagIsNull() {
            addCriterion("ARGEE_FLAG is null");
            return (Criteria) this;
        }

        public Criteria andArgeeFlagIsNotNull() {
            addCriterion("ARGEE_FLAG is not null");
            return (Criteria) this;
        }

        public Criteria andArgeeFlagEqualTo(Short value) {
            addCriterion("ARGEE_FLAG =", value, "argeeFlag");
            return (Criteria) this;
        }

        public Criteria andArgeeFlagNotEqualTo(Short value) {
            addCriterion("ARGEE_FLAG <>", value, "argeeFlag");
            return (Criteria) this;
        }

        public Criteria andArgeeFlagGreaterThan(Short value) {
            addCriterion("ARGEE_FLAG >", value, "argeeFlag");
            return (Criteria) this;
        }

        public Criteria andArgeeFlagGreaterThanOrEqualTo(Short value) {
            addCriterion("ARGEE_FLAG >=", value, "argeeFlag");
            return (Criteria) this;
        }

        public Criteria andArgeeFlagLessThan(Short value) {
            addCriterion("ARGEE_FLAG <", value, "argeeFlag");
            return (Criteria) this;
        }

        public Criteria andArgeeFlagLessThanOrEqualTo(Short value) {
            addCriterion("ARGEE_FLAG <=", value, "argeeFlag");
            return (Criteria) this;
        }

        public Criteria andArgeeFlagIn(List<Short> values) {
            addCriterion("ARGEE_FLAG in", values, "argeeFlag");
            return (Criteria) this;
        }

        public Criteria andArgeeFlagNotIn(List<Short> values) {
            addCriterion("ARGEE_FLAG not in", values, "argeeFlag");
            return (Criteria) this;
        }

        public Criteria andArgeeFlagBetween(Short value1, Short value2) {
            addCriterion("ARGEE_FLAG between", value1, value2, "argeeFlag");
            return (Criteria) this;
        }

        public Criteria andArgeeFlagNotBetween(Short value1, Short value2) {
            addCriterion("ARGEE_FLAG not between", value1, value2, "argeeFlag");
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

        public Criteria andArgeeOidIsNull() {
            addCriterion("ARGEE_OID is null");
            return (Criteria) this;
        }

        public Criteria andArgeeOidIsNotNull() {
            addCriterion("ARGEE_OID is not null");
            return (Criteria) this;
        }

        public Criteria andArgeeOidEqualTo(String value) {
            addCriterion("ARGEE_OID =", value, "argeeOid");
            return (Criteria) this;
        }

        public Criteria andArgeeOidNotEqualTo(String value) {
            addCriterion("ARGEE_OID <>", value, "argeeOid");
            return (Criteria) this;
        }

        public Criteria andArgeeOidGreaterThan(String value) {
            addCriterion("ARGEE_OID >", value, "argeeOid");
            return (Criteria) this;
        }

        public Criteria andArgeeOidGreaterThanOrEqualTo(String value) {
            addCriterion("ARGEE_OID >=", value, "argeeOid");
            return (Criteria) this;
        }

        public Criteria andArgeeOidLessThan(String value) {
            addCriterion("ARGEE_OID <", value, "argeeOid");
            return (Criteria) this;
        }

        public Criteria andArgeeOidLessThanOrEqualTo(String value) {
            addCriterion("ARGEE_OID <=", value, "argeeOid");
            return (Criteria) this;
        }

        public Criteria andArgeeOidLike(String value) {
            addCriterion("ARGEE_OID like", value, "argeeOid");
            return (Criteria) this;
        }

        public Criteria andArgeeOidNotLike(String value) {
            addCriterion("ARGEE_OID not like", value, "argeeOid");
            return (Criteria) this;
        }

        public Criteria andArgeeOidIn(List<String> values) {
            addCriterion("ARGEE_OID in", values, "argeeOid");
            return (Criteria) this;
        }

        public Criteria andArgeeOidNotIn(List<String> values) {
            addCriterion("ARGEE_OID not in", values, "argeeOid");
            return (Criteria) this;
        }

        public Criteria andArgeeOidBetween(String value1, String value2) {
            addCriterion("ARGEE_OID between", value1, value2, "argeeOid");
            return (Criteria) this;
        }

        public Criteria andArgeeOidNotBetween(String value1, String value2) {
            addCriterion("ARGEE_OID not between", value1, value2, "argeeOid");
            return (Criteria) this;
        }

        public Criteria andArgeeDateIsNull() {
            addCriterion("ARGEE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andArgeeDateIsNotNull() {
            addCriterion("ARGEE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andArgeeDateEqualTo(Date value) {
            addCriterion("ARGEE_DATE =", value, "argeeDate");
            return (Criteria) this;
        }

        public Criteria andArgeeDateNotEqualTo(Date value) {
            addCriterion("ARGEE_DATE <>", value, "argeeDate");
            return (Criteria) this;
        }

        public Criteria andArgeeDateGreaterThan(Date value) {
            addCriterion("ARGEE_DATE >", value, "argeeDate");
            return (Criteria) this;
        }

        public Criteria andArgeeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ARGEE_DATE >=", value, "argeeDate");
            return (Criteria) this;
        }

        public Criteria andArgeeDateLessThan(Date value) {
            addCriterion("ARGEE_DATE <", value, "argeeDate");
            return (Criteria) this;
        }

        public Criteria andArgeeDateLessThanOrEqualTo(Date value) {
            addCriterion("ARGEE_DATE <=", value, "argeeDate");
            return (Criteria) this;
        }

        public Criteria andArgeeDateIn(List<Date> values) {
            addCriterion("ARGEE_DATE in", values, "argeeDate");
            return (Criteria) this;
        }

        public Criteria andArgeeDateNotIn(List<Date> values) {
            addCriterion("ARGEE_DATE not in", values, "argeeDate");
            return (Criteria) this;
        }

        public Criteria andArgeeDateBetween(Date value1, Date value2) {
            addCriterion("ARGEE_DATE between", value1, value2, "argeeDate");
            return (Criteria) this;
        }

        public Criteria andArgeeDateNotBetween(Date value1, Date value2) {
            addCriterion("ARGEE_DATE not between", value1, value2, "argeeDate");
            return (Criteria) this;
        }

        public Criteria andArgeeOnameIsNull() {
            addCriterion("ARGEE_ONAME is null");
            return (Criteria) this;
        }

        public Criteria andArgeeOnameIsNotNull() {
            addCriterion("ARGEE_ONAME is not null");
            return (Criteria) this;
        }

        public Criteria andArgeeOnameEqualTo(String value) {
            addCriterion("ARGEE_ONAME =", value, "argeeOname");
            return (Criteria) this;
        }

        public Criteria andArgeeOnameNotEqualTo(String value) {
            addCriterion("ARGEE_ONAME <>", value, "argeeOname");
            return (Criteria) this;
        }

        public Criteria andArgeeOnameGreaterThan(String value) {
            addCriterion("ARGEE_ONAME >", value, "argeeOname");
            return (Criteria) this;
        }

        public Criteria andArgeeOnameGreaterThanOrEqualTo(String value) {
            addCriterion("ARGEE_ONAME >=", value, "argeeOname");
            return (Criteria) this;
        }

        public Criteria andArgeeOnameLessThan(String value) {
            addCriterion("ARGEE_ONAME <", value, "argeeOname");
            return (Criteria) this;
        }

        public Criteria andArgeeOnameLessThanOrEqualTo(String value) {
            addCriterion("ARGEE_ONAME <=", value, "argeeOname");
            return (Criteria) this;
        }

        public Criteria andArgeeOnameLike(String value) {
            addCriterion("ARGEE_ONAME like", value, "argeeOname");
            return (Criteria) this;
        }

        public Criteria andArgeeOnameNotLike(String value) {
            addCriterion("ARGEE_ONAME not like", value, "argeeOname");
            return (Criteria) this;
        }

        public Criteria andArgeeOnameIn(List<String> values) {
            addCriterion("ARGEE_ONAME in", values, "argeeOname");
            return (Criteria) this;
        }

        public Criteria andArgeeOnameNotIn(List<String> values) {
            addCriterion("ARGEE_ONAME not in", values, "argeeOname");
            return (Criteria) this;
        }

        public Criteria andArgeeOnameBetween(String value1, String value2) {
            addCriterion("ARGEE_ONAME between", value1, value2, "argeeOname");
            return (Criteria) this;
        }

        public Criteria andArgeeOnameNotBetween(String value1, String value2) {
            addCriterion("ARGEE_ONAME not between", value1, value2, "argeeOname");
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