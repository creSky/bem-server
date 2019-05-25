package com.bem.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppCircumstanceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppCircumstanceExample() {
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

        public Criteria andCreateManIsNull() {
            addCriterion("CREATE_MAN is null");
            return (Criteria) this;
        }

        public Criteria andCreateManIsNotNull() {
            addCriterion("CREATE_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andCreateManEqualTo(Integer value) {
            addCriterion("CREATE_MAN =", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManNotEqualTo(Integer value) {
            addCriterion("CREATE_MAN <>", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManGreaterThan(Integer value) {
            addCriterion("CREATE_MAN >", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManGreaterThanOrEqualTo(Integer value) {
            addCriterion("CREATE_MAN >=", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManLessThan(Integer value) {
            addCriterion("CREATE_MAN <", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManLessThanOrEqualTo(Integer value) {
            addCriterion("CREATE_MAN <=", value, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManIn(List<Integer> values) {
            addCriterion("CREATE_MAN in", values, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManNotIn(List<Integer> values) {
            addCriterion("CREATE_MAN not in", values, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_MAN between", value1, value2, "createMan");
            return (Criteria) this;
        }

        public Criteria andCreateManNotBetween(Integer value1, Integer value2) {
            addCriterion("CREATE_MAN not between", value1, value2, "createMan");
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

        public Criteria andAccessRemarkIsNull() {
            addCriterion("ACCESS_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andAccessRemarkIsNotNull() {
            addCriterion("ACCESS_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andAccessRemarkEqualTo(String value) {
            addCriterion("ACCESS_REMARK =", value, "accessRemark");
            return (Criteria) this;
        }

        public Criteria andAccessRemarkNotEqualTo(String value) {
            addCriterion("ACCESS_REMARK <>", value, "accessRemark");
            return (Criteria) this;
        }

        public Criteria andAccessRemarkGreaterThan(String value) {
            addCriterion("ACCESS_REMARK >", value, "accessRemark");
            return (Criteria) this;
        }

        public Criteria andAccessRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ACCESS_REMARK >=", value, "accessRemark");
            return (Criteria) this;
        }

        public Criteria andAccessRemarkLessThan(String value) {
            addCriterion("ACCESS_REMARK <", value, "accessRemark");
            return (Criteria) this;
        }

        public Criteria andAccessRemarkLessThanOrEqualTo(String value) {
            addCriterion("ACCESS_REMARK <=", value, "accessRemark");
            return (Criteria) this;
        }

        public Criteria andAccessRemarkLike(String value) {
            addCriterion("ACCESS_REMARK like", value, "accessRemark");
            return (Criteria) this;
        }

        public Criteria andAccessRemarkNotLike(String value) {
            addCriterion("ACCESS_REMARK not like", value, "accessRemark");
            return (Criteria) this;
        }

        public Criteria andAccessRemarkIn(List<String> values) {
            addCriterion("ACCESS_REMARK in", values, "accessRemark");
            return (Criteria) this;
        }

        public Criteria andAccessRemarkNotIn(List<String> values) {
            addCriterion("ACCESS_REMARK not in", values, "accessRemark");
            return (Criteria) this;
        }

        public Criteria andAccessRemarkBetween(String value1, String value2) {
            addCriterion("ACCESS_REMARK between", value1, value2, "accessRemark");
            return (Criteria) this;
        }

        public Criteria andAccessRemarkNotBetween(String value1, String value2) {
            addCriterion("ACCESS_REMARK not between", value1, value2, "accessRemark");
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

        public Criteria andProjectRemarkIsNull() {
            addCriterion("PROJECT_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkIsNotNull() {
            addCriterion("PROJECT_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkEqualTo(String value) {
            addCriterion("PROJECT_REMARK =", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkNotEqualTo(String value) {
            addCriterion("PROJECT_REMARK <>", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkGreaterThan(String value) {
            addCriterion("PROJECT_REMARK >", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_REMARK >=", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkLessThan(String value) {
            addCriterion("PROJECT_REMARK <", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_REMARK <=", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkLike(String value) {
            addCriterion("PROJECT_REMARK like", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkNotLike(String value) {
            addCriterion("PROJECT_REMARK not like", value, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkIn(List<String> values) {
            addCriterion("PROJECT_REMARK in", values, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkNotIn(List<String> values) {
            addCriterion("PROJECT_REMARK not in", values, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkBetween(String value1, String value2) {
            addCriterion("PROJECT_REMARK between", value1, value2, "projectRemark");
            return (Criteria) this;
        }

        public Criteria andProjectRemarkNotBetween(String value1, String value2) {
            addCriterion("PROJECT_REMARK not between", value1, value2, "projectRemark");
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

        public Criteria andAnswerRemarkIsNull() {
            addCriterion("ANSWER_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andAnswerRemarkIsNotNull() {
            addCriterion("ANSWER_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andAnswerRemarkEqualTo(String value) {
            addCriterion("ANSWER_REMARK =", value, "answerRemark");
            return (Criteria) this;
        }

        public Criteria andAnswerRemarkNotEqualTo(String value) {
            addCriterion("ANSWER_REMARK <>", value, "answerRemark");
            return (Criteria) this;
        }

        public Criteria andAnswerRemarkGreaterThan(String value) {
            addCriterion("ANSWER_REMARK >", value, "answerRemark");
            return (Criteria) this;
        }

        public Criteria andAnswerRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ANSWER_REMARK >=", value, "answerRemark");
            return (Criteria) this;
        }

        public Criteria andAnswerRemarkLessThan(String value) {
            addCriterion("ANSWER_REMARK <", value, "answerRemark");
            return (Criteria) this;
        }

        public Criteria andAnswerRemarkLessThanOrEqualTo(String value) {
            addCriterion("ANSWER_REMARK <=", value, "answerRemark");
            return (Criteria) this;
        }

        public Criteria andAnswerRemarkLike(String value) {
            addCriterion("ANSWER_REMARK like", value, "answerRemark");
            return (Criteria) this;
        }

        public Criteria andAnswerRemarkNotLike(String value) {
            addCriterion("ANSWER_REMARK not like", value, "answerRemark");
            return (Criteria) this;
        }

        public Criteria andAnswerRemarkIn(List<String> values) {
            addCriterion("ANSWER_REMARK in", values, "answerRemark");
            return (Criteria) this;
        }

        public Criteria andAnswerRemarkNotIn(List<String> values) {
            addCriterion("ANSWER_REMARK not in", values, "answerRemark");
            return (Criteria) this;
        }

        public Criteria andAnswerRemarkBetween(String value1, String value2) {
            addCriterion("ANSWER_REMARK between", value1, value2, "answerRemark");
            return (Criteria) this;
        }

        public Criteria andAnswerRemarkNotBetween(String value1, String value2) {
            addCriterion("ANSWER_REMARK not between", value1, value2, "answerRemark");
            return (Criteria) this;
        }

        public Criteria andCircumstanceManIsNull() {
            addCriterion("CIRCUMSTANCE_MAN is null");
            return (Criteria) this;
        }

        public Criteria andCircumstanceManIsNotNull() {
            addCriterion("CIRCUMSTANCE_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andCircumstanceManEqualTo(String value) {
            addCriterion("CIRCUMSTANCE_MAN =", value, "circumstanceMan");
            return (Criteria) this;
        }

        public Criteria andCircumstanceManNotEqualTo(String value) {
            addCriterion("CIRCUMSTANCE_MAN <>", value, "circumstanceMan");
            return (Criteria) this;
        }

        public Criteria andCircumstanceManGreaterThan(String value) {
            addCriterion("CIRCUMSTANCE_MAN >", value, "circumstanceMan");
            return (Criteria) this;
        }

        public Criteria andCircumstanceManGreaterThanOrEqualTo(String value) {
            addCriterion("CIRCUMSTANCE_MAN >=", value, "circumstanceMan");
            return (Criteria) this;
        }

        public Criteria andCircumstanceManLessThan(String value) {
            addCriterion("CIRCUMSTANCE_MAN <", value, "circumstanceMan");
            return (Criteria) this;
        }

        public Criteria andCircumstanceManLessThanOrEqualTo(String value) {
            addCriterion("CIRCUMSTANCE_MAN <=", value, "circumstanceMan");
            return (Criteria) this;
        }

        public Criteria andCircumstanceManLike(String value) {
            addCriterion("CIRCUMSTANCE_MAN like", value, "circumstanceMan");
            return (Criteria) this;
        }

        public Criteria andCircumstanceManNotLike(String value) {
            addCriterion("CIRCUMSTANCE_MAN not like", value, "circumstanceMan");
            return (Criteria) this;
        }

        public Criteria andCircumstanceManIn(List<String> values) {
            addCriterion("CIRCUMSTANCE_MAN in", values, "circumstanceMan");
            return (Criteria) this;
        }

        public Criteria andCircumstanceManNotIn(List<String> values) {
            addCriterion("CIRCUMSTANCE_MAN not in", values, "circumstanceMan");
            return (Criteria) this;
        }

        public Criteria andCircumstanceManBetween(String value1, String value2) {
            addCriterion("CIRCUMSTANCE_MAN between", value1, value2, "circumstanceMan");
            return (Criteria) this;
        }

        public Criteria andCircumstanceManNotBetween(String value1, String value2) {
            addCriterion("CIRCUMSTANCE_MAN not between", value1, value2, "circumstanceMan");
            return (Criteria) this;
        }

        public Criteria andCircumstanceDateIsNull() {
            addCriterion("CIRCUMSTANCE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCircumstanceDateIsNotNull() {
            addCriterion("CIRCUMSTANCE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCircumstanceDateEqualTo(Date value) {
            addCriterion("CIRCUMSTANCE_DATE =", value, "circumstanceDate");
            return (Criteria) this;
        }

        public Criteria andCircumstanceDateNotEqualTo(Date value) {
            addCriterion("CIRCUMSTANCE_DATE <>", value, "circumstanceDate");
            return (Criteria) this;
        }

        public Criteria andCircumstanceDateGreaterThan(Date value) {
            addCriterion("CIRCUMSTANCE_DATE >", value, "circumstanceDate");
            return (Criteria) this;
        }

        public Criteria andCircumstanceDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CIRCUMSTANCE_DATE >=", value, "circumstanceDate");
            return (Criteria) this;
        }

        public Criteria andCircumstanceDateLessThan(Date value) {
            addCriterion("CIRCUMSTANCE_DATE <", value, "circumstanceDate");
            return (Criteria) this;
        }

        public Criteria andCircumstanceDateLessThanOrEqualTo(Date value) {
            addCriterion("CIRCUMSTANCE_DATE <=", value, "circumstanceDate");
            return (Criteria) this;
        }

        public Criteria andCircumstanceDateIn(List<Date> values) {
            addCriterion("CIRCUMSTANCE_DATE in", values, "circumstanceDate");
            return (Criteria) this;
        }

        public Criteria andCircumstanceDateNotIn(List<Date> values) {
            addCriterion("CIRCUMSTANCE_DATE not in", values, "circumstanceDate");
            return (Criteria) this;
        }

        public Criteria andCircumstanceDateBetween(Date value1, Date value2) {
            addCriterion("CIRCUMSTANCE_DATE between", value1, value2, "circumstanceDate");
            return (Criteria) this;
        }

        public Criteria andCircumstanceDateNotBetween(Date value1, Date value2) {
            addCriterion("CIRCUMSTANCE_DATE not between", value1, value2, "circumstanceDate");
            return (Criteria) this;
        }

        public Criteria andCircumstanceRemarkIsNull() {
            addCriterion("CIRCUMSTANCE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCircumstanceRemarkIsNotNull() {
            addCriterion("CIRCUMSTANCE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCircumstanceRemarkEqualTo(String value) {
            addCriterion("CIRCUMSTANCE_REMARK =", value, "circumstanceRemark");
            return (Criteria) this;
        }

        public Criteria andCircumstanceRemarkNotEqualTo(String value) {
            addCriterion("CIRCUMSTANCE_REMARK <>", value, "circumstanceRemark");
            return (Criteria) this;
        }

        public Criteria andCircumstanceRemarkGreaterThan(String value) {
            addCriterion("CIRCUMSTANCE_REMARK >", value, "circumstanceRemark");
            return (Criteria) this;
        }

        public Criteria andCircumstanceRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("CIRCUMSTANCE_REMARK >=", value, "circumstanceRemark");
            return (Criteria) this;
        }

        public Criteria andCircumstanceRemarkLessThan(String value) {
            addCriterion("CIRCUMSTANCE_REMARK <", value, "circumstanceRemark");
            return (Criteria) this;
        }

        public Criteria andCircumstanceRemarkLessThanOrEqualTo(String value) {
            addCriterion("CIRCUMSTANCE_REMARK <=", value, "circumstanceRemark");
            return (Criteria) this;
        }

        public Criteria andCircumstanceRemarkLike(String value) {
            addCriterion("CIRCUMSTANCE_REMARK like", value, "circumstanceRemark");
            return (Criteria) this;
        }

        public Criteria andCircumstanceRemarkNotLike(String value) {
            addCriterion("CIRCUMSTANCE_REMARK not like", value, "circumstanceRemark");
            return (Criteria) this;
        }

        public Criteria andCircumstanceRemarkIn(List<String> values) {
            addCriterion("CIRCUMSTANCE_REMARK in", values, "circumstanceRemark");
            return (Criteria) this;
        }

        public Criteria andCircumstanceRemarkNotIn(List<String> values) {
            addCriterion("CIRCUMSTANCE_REMARK not in", values, "circumstanceRemark");
            return (Criteria) this;
        }

        public Criteria andCircumstanceRemarkBetween(String value1, String value2) {
            addCriterion("CIRCUMSTANCE_REMARK between", value1, value2, "circumstanceRemark");
            return (Criteria) this;
        }

        public Criteria andCircumstanceRemarkNotBetween(String value1, String value2) {
            addCriterion("CIRCUMSTANCE_REMARK not between", value1, value2, "circumstanceRemark");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyDateIsNull() {
            addCriterion("POWER_SUPPLY_DATE is null");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyDateIsNotNull() {
            addCriterion("POWER_SUPPLY_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyDateEqualTo(Date value) {
            addCriterion("POWER_SUPPLY_DATE =", value, "powerSupplyDate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyDateNotEqualTo(Date value) {
            addCriterion("POWER_SUPPLY_DATE <>", value, "powerSupplyDate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyDateGreaterThan(Date value) {
            addCriterion("POWER_SUPPLY_DATE >", value, "powerSupplyDate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("POWER_SUPPLY_DATE >=", value, "powerSupplyDate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyDateLessThan(Date value) {
            addCriterion("POWER_SUPPLY_DATE <", value, "powerSupplyDate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyDateLessThanOrEqualTo(Date value) {
            addCriterion("POWER_SUPPLY_DATE <=", value, "powerSupplyDate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyDateIn(List<Date> values) {
            addCriterion("POWER_SUPPLY_DATE in", values, "powerSupplyDate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyDateNotIn(List<Date> values) {
            addCriterion("POWER_SUPPLY_DATE not in", values, "powerSupplyDate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyDateBetween(Date value1, Date value2) {
            addCriterion("POWER_SUPPLY_DATE between", value1, value2, "powerSupplyDate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyDateNotBetween(Date value1, Date value2) {
            addCriterion("POWER_SUPPLY_DATE not between", value1, value2, "powerSupplyDate");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyExplainIsNull() {
            addCriterion("POWER_SUPPLY_EXPLAIN is null");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyExplainIsNotNull() {
            addCriterion("POWER_SUPPLY_EXPLAIN is not null");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyExplainEqualTo(String value) {
            addCriterion("POWER_SUPPLY_EXPLAIN =", value, "powerSupplyExplain");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyExplainNotEqualTo(String value) {
            addCriterion("POWER_SUPPLY_EXPLAIN <>", value, "powerSupplyExplain");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyExplainGreaterThan(String value) {
            addCriterion("POWER_SUPPLY_EXPLAIN >", value, "powerSupplyExplain");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyExplainGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_SUPPLY_EXPLAIN >=", value, "powerSupplyExplain");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyExplainLessThan(String value) {
            addCriterion("POWER_SUPPLY_EXPLAIN <", value, "powerSupplyExplain");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyExplainLessThanOrEqualTo(String value) {
            addCriterion("POWER_SUPPLY_EXPLAIN <=", value, "powerSupplyExplain");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyExplainLike(String value) {
            addCriterion("POWER_SUPPLY_EXPLAIN like", value, "powerSupplyExplain");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyExplainNotLike(String value) {
            addCriterion("POWER_SUPPLY_EXPLAIN not like", value, "powerSupplyExplain");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyExplainIn(List<String> values) {
            addCriterion("POWER_SUPPLY_EXPLAIN in", values, "powerSupplyExplain");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyExplainNotIn(List<String> values) {
            addCriterion("POWER_SUPPLY_EXPLAIN not in", values, "powerSupplyExplain");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyExplainBetween(String value1, String value2) {
            addCriterion("POWER_SUPPLY_EXPLAIN between", value1, value2, "powerSupplyExplain");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyExplainNotBetween(String value1, String value2) {
            addCriterion("POWER_SUPPLY_EXPLAIN not between", value1, value2, "powerSupplyExplain");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyAccessIsNull() {
            addCriterion("POWER_SUPPLY_ACCESS is null");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyAccessIsNotNull() {
            addCriterion("POWER_SUPPLY_ACCESS is not null");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyAccessEqualTo(Integer value) {
            addCriterion("POWER_SUPPLY_ACCESS =", value, "powerSupplyAccess");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyAccessNotEqualTo(Integer value) {
            addCriterion("POWER_SUPPLY_ACCESS <>", value, "powerSupplyAccess");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyAccessGreaterThan(Integer value) {
            addCriterion("POWER_SUPPLY_ACCESS >", value, "powerSupplyAccess");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyAccessGreaterThanOrEqualTo(Integer value) {
            addCriterion("POWER_SUPPLY_ACCESS >=", value, "powerSupplyAccess");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyAccessLessThan(Integer value) {
            addCriterion("POWER_SUPPLY_ACCESS <", value, "powerSupplyAccess");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyAccessLessThanOrEqualTo(Integer value) {
            addCriterion("POWER_SUPPLY_ACCESS <=", value, "powerSupplyAccess");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyAccessIn(List<Integer> values) {
            addCriterion("POWER_SUPPLY_ACCESS in", values, "powerSupplyAccess");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyAccessNotIn(List<Integer> values) {
            addCriterion("POWER_SUPPLY_ACCESS not in", values, "powerSupplyAccess");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyAccessBetween(Integer value1, Integer value2) {
            addCriterion("POWER_SUPPLY_ACCESS between", value1, value2, "powerSupplyAccess");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyAccessNotBetween(Integer value1, Integer value2) {
            addCriterion("POWER_SUPPLY_ACCESS not between", value1, value2, "powerSupplyAccess");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRemarkIsNull() {
            addCriterion("POWER_SUPPLY_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRemarkIsNotNull() {
            addCriterion("POWER_SUPPLY_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRemarkEqualTo(String value) {
            addCriterion("POWER_SUPPLY_REMARK =", value, "powerSupplyRemark");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRemarkNotEqualTo(String value) {
            addCriterion("POWER_SUPPLY_REMARK <>", value, "powerSupplyRemark");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRemarkGreaterThan(String value) {
            addCriterion("POWER_SUPPLY_REMARK >", value, "powerSupplyRemark");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("POWER_SUPPLY_REMARK >=", value, "powerSupplyRemark");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRemarkLessThan(String value) {
            addCriterion("POWER_SUPPLY_REMARK <", value, "powerSupplyRemark");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRemarkLessThanOrEqualTo(String value) {
            addCriterion("POWER_SUPPLY_REMARK <=", value, "powerSupplyRemark");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRemarkLike(String value) {
            addCriterion("POWER_SUPPLY_REMARK like", value, "powerSupplyRemark");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRemarkNotLike(String value) {
            addCriterion("POWER_SUPPLY_REMARK not like", value, "powerSupplyRemark");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRemarkIn(List<String> values) {
            addCriterion("POWER_SUPPLY_REMARK in", values, "powerSupplyRemark");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRemarkNotIn(List<String> values) {
            addCriterion("POWER_SUPPLY_REMARK not in", values, "powerSupplyRemark");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRemarkBetween(String value1, String value2) {
            addCriterion("POWER_SUPPLY_REMARK between", value1, value2, "powerSupplyRemark");
            return (Criteria) this;
        }

        public Criteria andPowerSupplyRemarkNotBetween(String value1, String value2) {
            addCriterion("POWER_SUPPLY_REMARK not between", value1, value2, "powerSupplyRemark");
            return (Criteria) this;
        }

        public Criteria andIsCommonIsNull() {
            addCriterion("IS_COMMON is null");
            return (Criteria) this;
        }

        public Criteria andIsCommonIsNotNull() {
            addCriterion("IS_COMMON is not null");
            return (Criteria) this;
        }

        public Criteria andIsCommonEqualTo(Integer value) {
            addCriterion("IS_COMMON =", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonNotEqualTo(Integer value) {
            addCriterion("IS_COMMON <>", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonGreaterThan(Integer value) {
            addCriterion("IS_COMMON >", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_COMMON >=", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonLessThan(Integer value) {
            addCriterion("IS_COMMON <", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonLessThanOrEqualTo(Integer value) {
            addCriterion("IS_COMMON <=", value, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonIn(List<Integer> values) {
            addCriterion("IS_COMMON in", values, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonNotIn(List<Integer> values) {
            addCriterion("IS_COMMON not in", values, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonBetween(Integer value1, Integer value2) {
            addCriterion("IS_COMMON between", value1, value2, "isCommon");
            return (Criteria) this;
        }

        public Criteria andIsCommonNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_COMMON not between", value1, value2, "isCommon");
            return (Criteria) this;
        }

        public Criteria andCommonRemarkIsNull() {
            addCriterion("COMMON_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCommonRemarkIsNotNull() {
            addCriterion("COMMON_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCommonRemarkEqualTo(String value) {
            addCriterion("COMMON_REMARK =", value, "commonRemark");
            return (Criteria) this;
        }

        public Criteria andCommonRemarkNotEqualTo(String value) {
            addCriterion("COMMON_REMARK <>", value, "commonRemark");
            return (Criteria) this;
        }

        public Criteria andCommonRemarkGreaterThan(String value) {
            addCriterion("COMMON_REMARK >", value, "commonRemark");
            return (Criteria) this;
        }

        public Criteria andCommonRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("COMMON_REMARK >=", value, "commonRemark");
            return (Criteria) this;
        }

        public Criteria andCommonRemarkLessThan(String value) {
            addCriterion("COMMON_REMARK <", value, "commonRemark");
            return (Criteria) this;
        }

        public Criteria andCommonRemarkLessThanOrEqualTo(String value) {
            addCriterion("COMMON_REMARK <=", value, "commonRemark");
            return (Criteria) this;
        }

        public Criteria andCommonRemarkLike(String value) {
            addCriterion("COMMON_REMARK like", value, "commonRemark");
            return (Criteria) this;
        }

        public Criteria andCommonRemarkNotLike(String value) {
            addCriterion("COMMON_REMARK not like", value, "commonRemark");
            return (Criteria) this;
        }

        public Criteria andCommonRemarkIn(List<String> values) {
            addCriterion("COMMON_REMARK in", values, "commonRemark");
            return (Criteria) this;
        }

        public Criteria andCommonRemarkNotIn(List<String> values) {
            addCriterion("COMMON_REMARK not in", values, "commonRemark");
            return (Criteria) this;
        }

        public Criteria andCommonRemarkBetween(String value1, String value2) {
            addCriterion("COMMON_REMARK between", value1, value2, "commonRemark");
            return (Criteria) this;
        }

        public Criteria andCommonRemarkNotBetween(String value1, String value2) {
            addCriterion("COMMON_REMARK not between", value1, value2, "commonRemark");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNull() {
            addCriterion("SUBMIT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIsNotNull() {
            addCriterion("SUBMIT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDateEqualTo(Date value) {
            addCriterion("SUBMIT_DATE =", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotEqualTo(Date value) {
            addCriterion("SUBMIT_DATE <>", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThan(Date value) {
            addCriterion("SUBMIT_DATE >", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SUBMIT_DATE >=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThan(Date value) {
            addCriterion("SUBMIT_DATE <", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateLessThanOrEqualTo(Date value) {
            addCriterion("SUBMIT_DATE <=", value, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateIn(List<Date> values) {
            addCriterion("SUBMIT_DATE in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotIn(List<Date> values) {
            addCriterion("SUBMIT_DATE not in", values, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateBetween(Date value1, Date value2) {
            addCriterion("SUBMIT_DATE between", value1, value2, "submitDate");
            return (Criteria) this;
        }

        public Criteria andSubmitDateNotBetween(Date value1, Date value2) {
            addCriterion("SUBMIT_DATE not between", value1, value2, "submitDate");
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