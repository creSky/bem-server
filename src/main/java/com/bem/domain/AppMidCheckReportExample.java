package com.bem.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppMidCheckReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppMidCheckReportExample() {
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

        public Criteria andCheckManagerIsNull() {
            addCriterion("CHECK_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andCheckManagerIsNotNull() {
            addCriterion("CHECK_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andCheckManagerEqualTo(String value) {
            addCriterion("CHECK_MANAGER =", value, "checkManager");
            return (Criteria) this;
        }

        public Criteria andCheckManagerNotEqualTo(String value) {
            addCriterion("CHECK_MANAGER <>", value, "checkManager");
            return (Criteria) this;
        }

        public Criteria andCheckManagerGreaterThan(String value) {
            addCriterion("CHECK_MANAGER >", value, "checkManager");
            return (Criteria) this;
        }

        public Criteria andCheckManagerGreaterThanOrEqualTo(String value) {
            addCriterion("CHECK_MANAGER >=", value, "checkManager");
            return (Criteria) this;
        }

        public Criteria andCheckManagerLessThan(String value) {
            addCriterion("CHECK_MANAGER <", value, "checkManager");
            return (Criteria) this;
        }

        public Criteria andCheckManagerLessThanOrEqualTo(String value) {
            addCriterion("CHECK_MANAGER <=", value, "checkManager");
            return (Criteria) this;
        }

        public Criteria andCheckManagerLike(String value) {
            addCriterion("CHECK_MANAGER like", value, "checkManager");
            return (Criteria) this;
        }

        public Criteria andCheckManagerNotLike(String value) {
            addCriterion("CHECK_MANAGER not like", value, "checkManager");
            return (Criteria) this;
        }

        public Criteria andCheckManagerIn(List<String> values) {
            addCriterion("CHECK_MANAGER in", values, "checkManager");
            return (Criteria) this;
        }

        public Criteria andCheckManagerNotIn(List<String> values) {
            addCriterion("CHECK_MANAGER not in", values, "checkManager");
            return (Criteria) this;
        }

        public Criteria andCheckManagerBetween(String value1, String value2) {
            addCriterion("CHECK_MANAGER between", value1, value2, "checkManager");
            return (Criteria) this;
        }

        public Criteria andCheckManagerNotBetween(String value1, String value2) {
            addCriterion("CHECK_MANAGER not between", value1, value2, "checkManager");
            return (Criteria) this;
        }

        public Criteria andMidChkDateIsNull() {
            addCriterion("MID_CHK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andMidChkDateIsNotNull() {
            addCriterion("MID_CHK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andMidChkDateEqualTo(Date value) {
            addCriterion("MID_CHK_DATE =", value, "midChkDate");
            return (Criteria) this;
        }

        public Criteria andMidChkDateNotEqualTo(Date value) {
            addCriterion("MID_CHK_DATE <>", value, "midChkDate");
            return (Criteria) this;
        }

        public Criteria andMidChkDateGreaterThan(Date value) {
            addCriterion("MID_CHK_DATE >", value, "midChkDate");
            return (Criteria) this;
        }

        public Criteria andMidChkDateGreaterThanOrEqualTo(Date value) {
            addCriterion("MID_CHK_DATE >=", value, "midChkDate");
            return (Criteria) this;
        }

        public Criteria andMidChkDateLessThan(Date value) {
            addCriterion("MID_CHK_DATE <", value, "midChkDate");
            return (Criteria) this;
        }

        public Criteria andMidChkDateLessThanOrEqualTo(Date value) {
            addCriterion("MID_CHK_DATE <=", value, "midChkDate");
            return (Criteria) this;
        }

        public Criteria andMidChkDateIn(List<Date> values) {
            addCriterion("MID_CHK_DATE in", values, "midChkDate");
            return (Criteria) this;
        }

        public Criteria andMidChkDateNotIn(List<Date> values) {
            addCriterion("MID_CHK_DATE not in", values, "midChkDate");
            return (Criteria) this;
        }

        public Criteria andMidChkDateBetween(Date value1, Date value2) {
            addCriterion("MID_CHK_DATE between", value1, value2, "midChkDate");
            return (Criteria) this;
        }

        public Criteria andMidChkDateNotBetween(Date value1, Date value2) {
            addCriterion("MID_CHK_DATE not between", value1, value2, "midChkDate");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIsNull() {
            addCriterion("CHECK_DEPT is null");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIsNotNull() {
            addCriterion("CHECK_DEPT is not null");
            return (Criteria) this;
        }

        public Criteria andCheckDeptEqualTo(Integer value) {
            addCriterion("CHECK_DEPT =", value, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNotEqualTo(Integer value) {
            addCriterion("CHECK_DEPT <>", value, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptGreaterThan(Integer value) {
            addCriterion("CHECK_DEPT >", value, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECK_DEPT >=", value, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptLessThan(Integer value) {
            addCriterion("CHECK_DEPT <", value, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptLessThanOrEqualTo(Integer value) {
            addCriterion("CHECK_DEPT <=", value, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptIn(List<Integer> values) {
            addCriterion("CHECK_DEPT in", values, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNotIn(List<Integer> values) {
            addCriterion("CHECK_DEPT not in", values, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_DEPT between", value1, value2, "checkDept");
            return (Criteria) this;
        }

        public Criteria andCheckDeptNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_DEPT not between", value1, value2, "checkDept");
            return (Criteria) this;
        }

        public Criteria andMidChkManIsNull() {
            addCriterion("MID_CHK_MAN is null");
            return (Criteria) this;
        }

        public Criteria andMidChkManIsNotNull() {
            addCriterion("MID_CHK_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andMidChkManEqualTo(Integer value) {
            addCriterion("MID_CHK_MAN =", value, "midChkMan");
            return (Criteria) this;
        }

        public Criteria andMidChkManNotEqualTo(Integer value) {
            addCriterion("MID_CHK_MAN <>", value, "midChkMan");
            return (Criteria) this;
        }

        public Criteria andMidChkManGreaterThan(Integer value) {
            addCriterion("MID_CHK_MAN >", value, "midChkMan");
            return (Criteria) this;
        }

        public Criteria andMidChkManGreaterThanOrEqualTo(Integer value) {
            addCriterion("MID_CHK_MAN >=", value, "midChkMan");
            return (Criteria) this;
        }

        public Criteria andMidChkManLessThan(Integer value) {
            addCriterion("MID_CHK_MAN <", value, "midChkMan");
            return (Criteria) this;
        }

        public Criteria andMidChkManLessThanOrEqualTo(Integer value) {
            addCriterion("MID_CHK_MAN <=", value, "midChkMan");
            return (Criteria) this;
        }

        public Criteria andMidChkManIn(List<Integer> values) {
            addCriterion("MID_CHK_MAN in", values, "midChkMan");
            return (Criteria) this;
        }

        public Criteria andMidChkManNotIn(List<Integer> values) {
            addCriterion("MID_CHK_MAN not in", values, "midChkMan");
            return (Criteria) this;
        }

        public Criteria andMidChkManBetween(Integer value1, Integer value2) {
            addCriterion("MID_CHK_MAN between", value1, value2, "midChkMan");
            return (Criteria) this;
        }

        public Criteria andMidChkManNotBetween(Integer value1, Integer value2) {
            addCriterion("MID_CHK_MAN not between", value1, value2, "midChkMan");
            return (Criteria) this;
        }

        public Criteria andCheckPassSignIsNull() {
            addCriterion("CHECK_PASS_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andCheckPassSignIsNotNull() {
            addCriterion("CHECK_PASS_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andCheckPassSignEqualTo(Integer value) {
            addCriterion("CHECK_PASS_SIGN =", value, "checkPassSign");
            return (Criteria) this;
        }

        public Criteria andCheckPassSignNotEqualTo(Integer value) {
            addCriterion("CHECK_PASS_SIGN <>", value, "checkPassSign");
            return (Criteria) this;
        }

        public Criteria andCheckPassSignGreaterThan(Integer value) {
            addCriterion("CHECK_PASS_SIGN >", value, "checkPassSign");
            return (Criteria) this;
        }

        public Criteria andCheckPassSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("CHECK_PASS_SIGN >=", value, "checkPassSign");
            return (Criteria) this;
        }

        public Criteria andCheckPassSignLessThan(Integer value) {
            addCriterion("CHECK_PASS_SIGN <", value, "checkPassSign");
            return (Criteria) this;
        }

        public Criteria andCheckPassSignLessThanOrEqualTo(Integer value) {
            addCriterion("CHECK_PASS_SIGN <=", value, "checkPassSign");
            return (Criteria) this;
        }

        public Criteria andCheckPassSignIn(List<Integer> values) {
            addCriterion("CHECK_PASS_SIGN in", values, "checkPassSign");
            return (Criteria) this;
        }

        public Criteria andCheckPassSignNotIn(List<Integer> values) {
            addCriterion("CHECK_PASS_SIGN not in", values, "checkPassSign");
            return (Criteria) this;
        }

        public Criteria andCheckPassSignBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_PASS_SIGN between", value1, value2, "checkPassSign");
            return (Criteria) this;
        }

        public Criteria andCheckPassSignNotBetween(Integer value1, Integer value2) {
            addCriterion("CHECK_PASS_SIGN not between", value1, value2, "checkPassSign");
            return (Criteria) this;
        }

        public Criteria andConstructionDeptCodeIsNull() {
            addCriterion("CONSTRUCTION_DEPT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andConstructionDeptCodeIsNotNull() {
            addCriterion("CONSTRUCTION_DEPT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionDeptCodeEqualTo(Integer value) {
            addCriterion("CONSTRUCTION_DEPT_CODE =", value, "constructionDeptCode");
            return (Criteria) this;
        }

        public Criteria andConstructionDeptCodeNotEqualTo(Integer value) {
            addCriterion("CONSTRUCTION_DEPT_CODE <>", value, "constructionDeptCode");
            return (Criteria) this;
        }

        public Criteria andConstructionDeptCodeGreaterThan(Integer value) {
            addCriterion("CONSTRUCTION_DEPT_CODE >", value, "constructionDeptCode");
            return (Criteria) this;
        }

        public Criteria andConstructionDeptCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("CONSTRUCTION_DEPT_CODE >=", value, "constructionDeptCode");
            return (Criteria) this;
        }

        public Criteria andConstructionDeptCodeLessThan(Integer value) {
            addCriterion("CONSTRUCTION_DEPT_CODE <", value, "constructionDeptCode");
            return (Criteria) this;
        }

        public Criteria andConstructionDeptCodeLessThanOrEqualTo(Integer value) {
            addCriterion("CONSTRUCTION_DEPT_CODE <=", value, "constructionDeptCode");
            return (Criteria) this;
        }

        public Criteria andConstructionDeptCodeIn(List<Integer> values) {
            addCriterion("CONSTRUCTION_DEPT_CODE in", values, "constructionDeptCode");
            return (Criteria) this;
        }

        public Criteria andConstructionDeptCodeNotIn(List<Integer> values) {
            addCriterion("CONSTRUCTION_DEPT_CODE not in", values, "constructionDeptCode");
            return (Criteria) this;
        }

        public Criteria andConstructionDeptCodeBetween(Integer value1, Integer value2) {
            addCriterion("CONSTRUCTION_DEPT_CODE between", value1, value2, "constructionDeptCode");
            return (Criteria) this;
        }

        public Criteria andConstructionDeptCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("CONSTRUCTION_DEPT_CODE not between", value1, value2, "constructionDeptCode");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNull() {
            addCriterion("PROJECT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andProjectNameIsNotNull() {
            addCriterion("PROJECT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andProjectNameEqualTo(String value) {
            addCriterion("PROJECT_NAME =", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotEqualTo(String value) {
            addCriterion("PROJECT_NAME <>", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThan(String value) {
            addCriterion("PROJECT_NAME >", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_NAME >=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThan(String value) {
            addCriterion("PROJECT_NAME <", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_NAME <=", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameLike(String value) {
            addCriterion("PROJECT_NAME like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotLike(String value) {
            addCriterion("PROJECT_NAME not like", value, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameIn(List<String> values) {
            addCriterion("PROJECT_NAME in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotIn(List<String> values) {
            addCriterion("PROJECT_NAME not in", values, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameBetween(String value1, String value2) {
            addCriterion("PROJECT_NAME between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectNameNotBetween(String value1, String value2) {
            addCriterion("PROJECT_NAME not between", value1, value2, "projectName");
            return (Criteria) this;
        }

        public Criteria andProjectManagerIsNull() {
            addCriterion("PROJECT_MANAGER is null");
            return (Criteria) this;
        }

        public Criteria andProjectManagerIsNotNull() {
            addCriterion("PROJECT_MANAGER is not null");
            return (Criteria) this;
        }

        public Criteria andProjectManagerEqualTo(String value) {
            addCriterion("PROJECT_MANAGER =", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotEqualTo(String value) {
            addCriterion("PROJECT_MANAGER <>", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGreaterThan(String value) {
            addCriterion("PROJECT_MANAGER >", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_MANAGER >=", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerLessThan(String value) {
            addCriterion("PROJECT_MANAGER <", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_MANAGER <=", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerLike(String value) {
            addCriterion("PROJECT_MANAGER like", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotLike(String value) {
            addCriterion("PROJECT_MANAGER not like", value, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerIn(List<String> values) {
            addCriterion("PROJECT_MANAGER in", values, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotIn(List<String> values) {
            addCriterion("PROJECT_MANAGER not in", values, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerBetween(String value1, String value2) {
            addCriterion("PROJECT_MANAGER between", value1, value2, "projectManager");
            return (Criteria) this;
        }

        public Criteria andProjectManagerNotBetween(String value1, String value2) {
            addCriterion("PROJECT_MANAGER not between", value1, value2, "projectManager");
            return (Criteria) this;
        }

        public Criteria andUserChkDateIsNull() {
            addCriterion("USER_CHK_DATE is null");
            return (Criteria) this;
        }

        public Criteria andUserChkDateIsNotNull() {
            addCriterion("USER_CHK_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andUserChkDateEqualTo(Date value) {
            addCriterion("USER_CHK_DATE =", value, "userChkDate");
            return (Criteria) this;
        }

        public Criteria andUserChkDateNotEqualTo(Date value) {
            addCriterion("USER_CHK_DATE <>", value, "userChkDate");
            return (Criteria) this;
        }

        public Criteria andUserChkDateGreaterThan(Date value) {
            addCriterion("USER_CHK_DATE >", value, "userChkDate");
            return (Criteria) this;
        }

        public Criteria andUserChkDateGreaterThanOrEqualTo(Date value) {
            addCriterion("USER_CHK_DATE >=", value, "userChkDate");
            return (Criteria) this;
        }

        public Criteria andUserChkDateLessThan(Date value) {
            addCriterion("USER_CHK_DATE <", value, "userChkDate");
            return (Criteria) this;
        }

        public Criteria andUserChkDateLessThanOrEqualTo(Date value) {
            addCriterion("USER_CHK_DATE <=", value, "userChkDate");
            return (Criteria) this;
        }

        public Criteria andUserChkDateIn(List<Date> values) {
            addCriterion("USER_CHK_DATE in", values, "userChkDate");
            return (Criteria) this;
        }

        public Criteria andUserChkDateNotIn(List<Date> values) {
            addCriterion("USER_CHK_DATE not in", values, "userChkDate");
            return (Criteria) this;
        }

        public Criteria andUserChkDateBetween(Date value1, Date value2) {
            addCriterion("USER_CHK_DATE between", value1, value2, "userChkDate");
            return (Criteria) this;
        }

        public Criteria andUserChkDateNotBetween(Date value1, Date value2) {
            addCriterion("USER_CHK_DATE not between", value1, value2, "userChkDate");
            return (Criteria) this;
        }

        public Criteria andUserChkResultIsNull() {
            addCriterion("USER_CHK_RESULT is null");
            return (Criteria) this;
        }

        public Criteria andUserChkResultIsNotNull() {
            addCriterion("USER_CHK_RESULT is not null");
            return (Criteria) this;
        }

        public Criteria andUserChkResultEqualTo(String value) {
            addCriterion("USER_CHK_RESULT =", value, "userChkResult");
            return (Criteria) this;
        }

        public Criteria andUserChkResultNotEqualTo(String value) {
            addCriterion("USER_CHK_RESULT <>", value, "userChkResult");
            return (Criteria) this;
        }

        public Criteria andUserChkResultGreaterThan(String value) {
            addCriterion("USER_CHK_RESULT >", value, "userChkResult");
            return (Criteria) this;
        }

        public Criteria andUserChkResultGreaterThanOrEqualTo(String value) {
            addCriterion("USER_CHK_RESULT >=", value, "userChkResult");
            return (Criteria) this;
        }

        public Criteria andUserChkResultLessThan(String value) {
            addCriterion("USER_CHK_RESULT <", value, "userChkResult");
            return (Criteria) this;
        }

        public Criteria andUserChkResultLessThanOrEqualTo(String value) {
            addCriterion("USER_CHK_RESULT <=", value, "userChkResult");
            return (Criteria) this;
        }

        public Criteria andUserChkResultLike(String value) {
            addCriterion("USER_CHK_RESULT like", value, "userChkResult");
            return (Criteria) this;
        }

        public Criteria andUserChkResultNotLike(String value) {
            addCriterion("USER_CHK_RESULT not like", value, "userChkResult");
            return (Criteria) this;
        }

        public Criteria andUserChkResultIn(List<String> values) {
            addCriterion("USER_CHK_RESULT in", values, "userChkResult");
            return (Criteria) this;
        }

        public Criteria andUserChkResultNotIn(List<String> values) {
            addCriterion("USER_CHK_RESULT not in", values, "userChkResult");
            return (Criteria) this;
        }

        public Criteria andUserChkResultBetween(String value1, String value2) {
            addCriterion("USER_CHK_RESULT between", value1, value2, "userChkResult");
            return (Criteria) this;
        }

        public Criteria andUserChkResultNotBetween(String value1, String value2) {
            addCriterion("USER_CHK_RESULT not between", value1, value2, "userChkResult");
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

        public Criteria andRemainFaultIsNull() {
            addCriterion("REMAIN_FAULT is null");
            return (Criteria) this;
        }

        public Criteria andRemainFaultIsNotNull() {
            addCriterion("REMAIN_FAULT is not null");
            return (Criteria) this;
        }

        public Criteria andRemainFaultEqualTo(String value) {
            addCriterion("REMAIN_FAULT =", value, "remainFault");
            return (Criteria) this;
        }

        public Criteria andRemainFaultNotEqualTo(String value) {
            addCriterion("REMAIN_FAULT <>", value, "remainFault");
            return (Criteria) this;
        }

        public Criteria andRemainFaultGreaterThan(String value) {
            addCriterion("REMAIN_FAULT >", value, "remainFault");
            return (Criteria) this;
        }

        public Criteria andRemainFaultGreaterThanOrEqualTo(String value) {
            addCriterion("REMAIN_FAULT >=", value, "remainFault");
            return (Criteria) this;
        }

        public Criteria andRemainFaultLessThan(String value) {
            addCriterion("REMAIN_FAULT <", value, "remainFault");
            return (Criteria) this;
        }

        public Criteria andRemainFaultLessThanOrEqualTo(String value) {
            addCriterion("REMAIN_FAULT <=", value, "remainFault");
            return (Criteria) this;
        }

        public Criteria andRemainFaultLike(String value) {
            addCriterion("REMAIN_FAULT like", value, "remainFault");
            return (Criteria) this;
        }

        public Criteria andRemainFaultNotLike(String value) {
            addCriterion("REMAIN_FAULT not like", value, "remainFault");
            return (Criteria) this;
        }

        public Criteria andRemainFaultIn(List<String> values) {
            addCriterion("REMAIN_FAULT in", values, "remainFault");
            return (Criteria) this;
        }

        public Criteria andRemainFaultNotIn(List<String> values) {
            addCriterion("REMAIN_FAULT not in", values, "remainFault");
            return (Criteria) this;
        }

        public Criteria andRemainFaultBetween(String value1, String value2) {
            addCriterion("REMAIN_FAULT between", value1, value2, "remainFault");
            return (Criteria) this;
        }

        public Criteria andRemainFaultNotBetween(String value1, String value2) {
            addCriterion("REMAIN_FAULT not between", value1, value2, "remainFault");
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