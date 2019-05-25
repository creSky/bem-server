package com.bem.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AppCompeleteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppCompeleteExample() {
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

        public Criteria andAssemManIsNull() {
            addCriterion("ASSEM_MAN is null");
            return (Criteria) this;
        }

        public Criteria andAssemManIsNotNull() {
            addCriterion("ASSEM_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andAssemManEqualTo(String value) {
            addCriterion("ASSEM_MAN =", value, "assemMan");
            return (Criteria) this;
        }

        public Criteria andAssemManNotEqualTo(String value) {
            addCriterion("ASSEM_MAN <>", value, "assemMan");
            return (Criteria) this;
        }

        public Criteria andAssemManGreaterThan(String value) {
            addCriterion("ASSEM_MAN >", value, "assemMan");
            return (Criteria) this;
        }

        public Criteria andAssemManGreaterThanOrEqualTo(String value) {
            addCriterion("ASSEM_MAN >=", value, "assemMan");
            return (Criteria) this;
        }

        public Criteria andAssemManLessThan(String value) {
            addCriterion("ASSEM_MAN <", value, "assemMan");
            return (Criteria) this;
        }

        public Criteria andAssemManLessThanOrEqualTo(String value) {
            addCriterion("ASSEM_MAN <=", value, "assemMan");
            return (Criteria) this;
        }

        public Criteria andAssemManLike(String value) {
            addCriterion("ASSEM_MAN like", value, "assemMan");
            return (Criteria) this;
        }

        public Criteria andAssemManNotLike(String value) {
            addCriterion("ASSEM_MAN not like", value, "assemMan");
            return (Criteria) this;
        }

        public Criteria andAssemManIn(List<String> values) {
            addCriterion("ASSEM_MAN in", values, "assemMan");
            return (Criteria) this;
        }

        public Criteria andAssemManNotIn(List<String> values) {
            addCriterion("ASSEM_MAN not in", values, "assemMan");
            return (Criteria) this;
        }

        public Criteria andAssemManBetween(String value1, String value2) {
            addCriterion("ASSEM_MAN between", value1, value2, "assemMan");
            return (Criteria) this;
        }

        public Criteria andAssemManNotBetween(String value1, String value2) {
            addCriterion("ASSEM_MAN not between", value1, value2, "assemMan");
            return (Criteria) this;
        }

        public Criteria andAssemDateIsNull() {
            addCriterion("ASSEM_DATE is null");
            return (Criteria) this;
        }

        public Criteria andAssemDateIsNotNull() {
            addCriterion("ASSEM_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andAssemDateEqualTo(Date value) {
            addCriterion("ASSEM_DATE =", value, "assemDate");
            return (Criteria) this;
        }

        public Criteria andAssemDateNotEqualTo(Date value) {
            addCriterion("ASSEM_DATE <>", value, "assemDate");
            return (Criteria) this;
        }

        public Criteria andAssemDateGreaterThan(Date value) {
            addCriterion("ASSEM_DATE >", value, "assemDate");
            return (Criteria) this;
        }

        public Criteria andAssemDateGreaterThanOrEqualTo(Date value) {
            addCriterion("ASSEM_DATE >=", value, "assemDate");
            return (Criteria) this;
        }

        public Criteria andAssemDateLessThan(Date value) {
            addCriterion("ASSEM_DATE <", value, "assemDate");
            return (Criteria) this;
        }

        public Criteria andAssemDateLessThanOrEqualTo(Date value) {
            addCriterion("ASSEM_DATE <=", value, "assemDate");
            return (Criteria) this;
        }

        public Criteria andAssemDateIn(List<Date> values) {
            addCriterion("ASSEM_DATE in", values, "assemDate");
            return (Criteria) this;
        }

        public Criteria andAssemDateNotIn(List<Date> values) {
            addCriterion("ASSEM_DATE not in", values, "assemDate");
            return (Criteria) this;
        }

        public Criteria andAssemDateBetween(Date value1, Date value2) {
            addCriterion("ASSEM_DATE between", value1, value2, "assemDate");
            return (Criteria) this;
        }

        public Criteria andAssemDateNotBetween(Date value1, Date value2) {
            addCriterion("ASSEM_DATE not between", value1, value2, "assemDate");
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

        public Criteria andDesignTypeIsNull() {
            addCriterion("DESIGN_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDesignTypeIsNotNull() {
            addCriterion("DESIGN_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDesignTypeEqualTo(Integer value) {
            addCriterion("DESIGN_TYPE =", value, "designType");
            return (Criteria) this;
        }

        public Criteria andDesignTypeNotEqualTo(Integer value) {
            addCriterion("DESIGN_TYPE <>", value, "designType");
            return (Criteria) this;
        }

        public Criteria andDesignTypeGreaterThan(Integer value) {
            addCriterion("DESIGN_TYPE >", value, "designType");
            return (Criteria) this;
        }

        public Criteria andDesignTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("DESIGN_TYPE >=", value, "designType");
            return (Criteria) this;
        }

        public Criteria andDesignTypeLessThan(Integer value) {
            addCriterion("DESIGN_TYPE <", value, "designType");
            return (Criteria) this;
        }

        public Criteria andDesignTypeLessThanOrEqualTo(Integer value) {
            addCriterion("DESIGN_TYPE <=", value, "designType");
            return (Criteria) this;
        }

        public Criteria andDesignTypeIn(List<Integer> values) {
            addCriterion("DESIGN_TYPE in", values, "designType");
            return (Criteria) this;
        }

        public Criteria andDesignTypeNotIn(List<Integer> values) {
            addCriterion("DESIGN_TYPE not in", values, "designType");
            return (Criteria) this;
        }

        public Criteria andDesignTypeBetween(Integer value1, Integer value2) {
            addCriterion("DESIGN_TYPE between", value1, value2, "designType");
            return (Criteria) this;
        }

        public Criteria andDesignTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("DESIGN_TYPE not between", value1, value2, "designType");
            return (Criteria) this;
        }

        public Criteria andIsDesignIsNull() {
            addCriterion("IS_DESIGN is null");
            return (Criteria) this;
        }

        public Criteria andIsDesignIsNotNull() {
            addCriterion("IS_DESIGN is not null");
            return (Criteria) this;
        }

        public Criteria andIsDesignEqualTo(Integer value) {
            addCriterion("IS_DESIGN =", value, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignNotEqualTo(Integer value) {
            addCriterion("IS_DESIGN <>", value, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignGreaterThan(Integer value) {
            addCriterion("IS_DESIGN >", value, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_DESIGN >=", value, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignLessThan(Integer value) {
            addCriterion("IS_DESIGN <", value, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignLessThanOrEqualTo(Integer value) {
            addCriterion("IS_DESIGN <=", value, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignIn(List<Integer> values) {
            addCriterion("IS_DESIGN in", values, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignNotIn(List<Integer> values) {
            addCriterion("IS_DESIGN not in", values, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignBetween(Integer value1, Integer value2) {
            addCriterion("IS_DESIGN between", value1, value2, "isDesign");
            return (Criteria) this;
        }

        public Criteria andIsDesignNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_DESIGN not between", value1, value2, "isDesign");
            return (Criteria) this;
        }

        public Criteria andDesignRemarkIsNull() {
            addCriterion("DESIGN_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andDesignRemarkIsNotNull() {
            addCriterion("DESIGN_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andDesignRemarkEqualTo(String value) {
            addCriterion("DESIGN_REMARK =", value, "designRemark");
            return (Criteria) this;
        }

        public Criteria andDesignRemarkNotEqualTo(String value) {
            addCriterion("DESIGN_REMARK <>", value, "designRemark");
            return (Criteria) this;
        }

        public Criteria andDesignRemarkGreaterThan(String value) {
            addCriterion("DESIGN_REMARK >", value, "designRemark");
            return (Criteria) this;
        }

        public Criteria andDesignRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGN_REMARK >=", value, "designRemark");
            return (Criteria) this;
        }

        public Criteria andDesignRemarkLessThan(String value) {
            addCriterion("DESIGN_REMARK <", value, "designRemark");
            return (Criteria) this;
        }

        public Criteria andDesignRemarkLessThanOrEqualTo(String value) {
            addCriterion("DESIGN_REMARK <=", value, "designRemark");
            return (Criteria) this;
        }

        public Criteria andDesignRemarkLike(String value) {
            addCriterion("DESIGN_REMARK like", value, "designRemark");
            return (Criteria) this;
        }

        public Criteria andDesignRemarkNotLike(String value) {
            addCriterion("DESIGN_REMARK not like", value, "designRemark");
            return (Criteria) this;
        }

        public Criteria andDesignRemarkIn(List<String> values) {
            addCriterion("DESIGN_REMARK in", values, "designRemark");
            return (Criteria) this;
        }

        public Criteria andDesignRemarkNotIn(List<String> values) {
            addCriterion("DESIGN_REMARK not in", values, "designRemark");
            return (Criteria) this;
        }

        public Criteria andDesignRemarkBetween(String value1, String value2) {
            addCriterion("DESIGN_REMARK between", value1, value2, "designRemark");
            return (Criteria) this;
        }

        public Criteria andDesignRemarkNotBetween(String value1, String value2) {
            addCriterion("DESIGN_REMARK not between", value1, value2, "designRemark");
            return (Criteria) this;
        }

        public Criteria andDesignCompanyIsNull() {
            addCriterion("DESIGN_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andDesignCompanyIsNotNull() {
            addCriterion("DESIGN_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andDesignCompanyEqualTo(String value) {
            addCriterion("DESIGN_COMPANY =", value, "designCompany");
            return (Criteria) this;
        }

        public Criteria andDesignCompanyNotEqualTo(String value) {
            addCriterion("DESIGN_COMPANY <>", value, "designCompany");
            return (Criteria) this;
        }

        public Criteria andDesignCompanyGreaterThan(String value) {
            addCriterion("DESIGN_COMPANY >", value, "designCompany");
            return (Criteria) this;
        }

        public Criteria andDesignCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("DESIGN_COMPANY >=", value, "designCompany");
            return (Criteria) this;
        }

        public Criteria andDesignCompanyLessThan(String value) {
            addCriterion("DESIGN_COMPANY <", value, "designCompany");
            return (Criteria) this;
        }

        public Criteria andDesignCompanyLessThanOrEqualTo(String value) {
            addCriterion("DESIGN_COMPANY <=", value, "designCompany");
            return (Criteria) this;
        }

        public Criteria andDesignCompanyLike(String value) {
            addCriterion("DESIGN_COMPANY like", value, "designCompany");
            return (Criteria) this;
        }

        public Criteria andDesignCompanyNotLike(String value) {
            addCriterion("DESIGN_COMPANY not like", value, "designCompany");
            return (Criteria) this;
        }

        public Criteria andDesignCompanyIn(List<String> values) {
            addCriterion("DESIGN_COMPANY in", values, "designCompany");
            return (Criteria) this;
        }

        public Criteria andDesignCompanyNotIn(List<String> values) {
            addCriterion("DESIGN_COMPANY not in", values, "designCompany");
            return (Criteria) this;
        }

        public Criteria andDesignCompanyBetween(String value1, String value2) {
            addCriterion("DESIGN_COMPANY between", value1, value2, "designCompany");
            return (Criteria) this;
        }

        public Criteria andDesignCompanyNotBetween(String value1, String value2) {
            addCriterion("DESIGN_COMPANY not between", value1, value2, "designCompany");
            return (Criteria) this;
        }

        public Criteria andConstructionNameIsNull() {
            addCriterion("CONSTRUCTION_NAME is null");
            return (Criteria) this;
        }

        public Criteria andConstructionNameIsNotNull() {
            addCriterion("CONSTRUCTION_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionNameEqualTo(String value) {
            addCriterion("CONSTRUCTION_NAME =", value, "constructionName");
            return (Criteria) this;
        }

        public Criteria andConstructionNameNotEqualTo(String value) {
            addCriterion("CONSTRUCTION_NAME <>", value, "constructionName");
            return (Criteria) this;
        }

        public Criteria andConstructionNameGreaterThan(String value) {
            addCriterion("CONSTRUCTION_NAME >", value, "constructionName");
            return (Criteria) this;
        }

        public Criteria andConstructionNameGreaterThanOrEqualTo(String value) {
            addCriterion("CONSTRUCTION_NAME >=", value, "constructionName");
            return (Criteria) this;
        }

        public Criteria andConstructionNameLessThan(String value) {
            addCriterion("CONSTRUCTION_NAME <", value, "constructionName");
            return (Criteria) this;
        }

        public Criteria andConstructionNameLessThanOrEqualTo(String value) {
            addCriterion("CONSTRUCTION_NAME <=", value, "constructionName");
            return (Criteria) this;
        }

        public Criteria andConstructionNameLike(String value) {
            addCriterion("CONSTRUCTION_NAME like", value, "constructionName");
            return (Criteria) this;
        }

        public Criteria andConstructionNameNotLike(String value) {
            addCriterion("CONSTRUCTION_NAME not like", value, "constructionName");
            return (Criteria) this;
        }

        public Criteria andConstructionNameIn(List<String> values) {
            addCriterion("CONSTRUCTION_NAME in", values, "constructionName");
            return (Criteria) this;
        }

        public Criteria andConstructionNameNotIn(List<String> values) {
            addCriterion("CONSTRUCTION_NAME not in", values, "constructionName");
            return (Criteria) this;
        }

        public Criteria andConstructionNameBetween(String value1, String value2) {
            addCriterion("CONSTRUCTION_NAME between", value1, value2, "constructionName");
            return (Criteria) this;
        }

        public Criteria andConstructionNameNotBetween(String value1, String value2) {
            addCriterion("CONSTRUCTION_NAME not between", value1, value2, "constructionName");
            return (Criteria) this;
        }

        public Criteria andConstructionDateIsNull() {
            addCriterion("CONSTRUCTION_DATE is null");
            return (Criteria) this;
        }

        public Criteria andConstructionDateIsNotNull() {
            addCriterion("CONSTRUCTION_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andConstructionDateEqualTo(Date value) {
            addCriterion("CONSTRUCTION_DATE =", value, "constructionDate");
            return (Criteria) this;
        }

        public Criteria andConstructionDateNotEqualTo(Date value) {
            addCriterion("CONSTRUCTION_DATE <>", value, "constructionDate");
            return (Criteria) this;
        }

        public Criteria andConstructionDateGreaterThan(Date value) {
            addCriterion("CONSTRUCTION_DATE >", value, "constructionDate");
            return (Criteria) this;
        }

        public Criteria andConstructionDateGreaterThanOrEqualTo(Date value) {
            addCriterion("CONSTRUCTION_DATE >=", value, "constructionDate");
            return (Criteria) this;
        }

        public Criteria andConstructionDateLessThan(Date value) {
            addCriterion("CONSTRUCTION_DATE <", value, "constructionDate");
            return (Criteria) this;
        }

        public Criteria andConstructionDateLessThanOrEqualTo(Date value) {
            addCriterion("CONSTRUCTION_DATE <=", value, "constructionDate");
            return (Criteria) this;
        }

        public Criteria andConstructionDateIn(List<Date> values) {
            addCriterion("CONSTRUCTION_DATE in", values, "constructionDate");
            return (Criteria) this;
        }

        public Criteria andConstructionDateNotIn(List<Date> values) {
            addCriterion("CONSTRUCTION_DATE not in", values, "constructionDate");
            return (Criteria) this;
        }

        public Criteria andConstructionDateBetween(Date value1, Date value2) {
            addCriterion("CONSTRUCTION_DATE between", value1, value2, "constructionDate");
            return (Criteria) this;
        }

        public Criteria andConstructionDateNotBetween(Date value1, Date value2) {
            addCriterion("CONSTRUCTION_DATE not between", value1, value2, "constructionDate");
            return (Criteria) this;
        }

        public Criteria andCompleteManIsNull() {
            addCriterion("COMPLETE_MAN is null");
            return (Criteria) this;
        }

        public Criteria andCompleteManIsNotNull() {
            addCriterion("COMPLETE_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteManEqualTo(String value) {
            addCriterion("COMPLETE_MAN =", value, "completeMan");
            return (Criteria) this;
        }

        public Criteria andCompleteManNotEqualTo(String value) {
            addCriterion("COMPLETE_MAN <>", value, "completeMan");
            return (Criteria) this;
        }

        public Criteria andCompleteManGreaterThan(String value) {
            addCriterion("COMPLETE_MAN >", value, "completeMan");
            return (Criteria) this;
        }

        public Criteria andCompleteManGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLETE_MAN >=", value, "completeMan");
            return (Criteria) this;
        }

        public Criteria andCompleteManLessThan(String value) {
            addCriterion("COMPLETE_MAN <", value, "completeMan");
            return (Criteria) this;
        }

        public Criteria andCompleteManLessThanOrEqualTo(String value) {
            addCriterion("COMPLETE_MAN <=", value, "completeMan");
            return (Criteria) this;
        }

        public Criteria andCompleteManLike(String value) {
            addCriterion("COMPLETE_MAN like", value, "completeMan");
            return (Criteria) this;
        }

        public Criteria andCompleteManNotLike(String value) {
            addCriterion("COMPLETE_MAN not like", value, "completeMan");
            return (Criteria) this;
        }

        public Criteria andCompleteManIn(List<String> values) {
            addCriterion("COMPLETE_MAN in", values, "completeMan");
            return (Criteria) this;
        }

        public Criteria andCompleteManNotIn(List<String> values) {
            addCriterion("COMPLETE_MAN not in", values, "completeMan");
            return (Criteria) this;
        }

        public Criteria andCompleteManBetween(String value1, String value2) {
            addCriterion("COMPLETE_MAN between", value1, value2, "completeMan");
            return (Criteria) this;
        }

        public Criteria andCompleteManNotBetween(String value1, String value2) {
            addCriterion("COMPLETE_MAN not between", value1, value2, "completeMan");
            return (Criteria) this;
        }

        public Criteria andCompleteDateIsNull() {
            addCriterion("COMPLETE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andCompleteDateIsNotNull() {
            addCriterion("COMPLETE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteDateEqualTo(Date value) {
            addCriterion("COMPLETE_DATE =", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateNotEqualTo(Date value) {
            addCriterion("COMPLETE_DATE <>", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateGreaterThan(Date value) {
            addCriterion("COMPLETE_DATE >", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateGreaterThanOrEqualTo(Date value) {
            addCriterion("COMPLETE_DATE >=", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateLessThan(Date value) {
            addCriterion("COMPLETE_DATE <", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateLessThanOrEqualTo(Date value) {
            addCriterion("COMPLETE_DATE <=", value, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateIn(List<Date> values) {
            addCriterion("COMPLETE_DATE in", values, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateNotIn(List<Date> values) {
            addCriterion("COMPLETE_DATE not in", values, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateBetween(Date value1, Date value2) {
            addCriterion("COMPLETE_DATE between", value1, value2, "completeDate");
            return (Criteria) this;
        }

        public Criteria andCompleteDateNotBetween(Date value1, Date value2) {
            addCriterion("COMPLETE_DATE not between", value1, value2, "completeDate");
            return (Criteria) this;
        }

        public Criteria andIsCompleteIsNull() {
            addCriterion("IS_COMPLETE is null");
            return (Criteria) this;
        }

        public Criteria andIsCompleteIsNotNull() {
            addCriterion("IS_COMPLETE is not null");
            return (Criteria) this;
        }

        public Criteria andIsCompleteEqualTo(Integer value) {
            addCriterion("IS_COMPLETE =", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteNotEqualTo(Integer value) {
            addCriterion("IS_COMPLETE <>", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteGreaterThan(Integer value) {
            addCriterion("IS_COMPLETE >", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteGreaterThanOrEqualTo(Integer value) {
            addCriterion("IS_COMPLETE >=", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteLessThan(Integer value) {
            addCriterion("IS_COMPLETE <", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteLessThanOrEqualTo(Integer value) {
            addCriterion("IS_COMPLETE <=", value, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteIn(List<Integer> values) {
            addCriterion("IS_COMPLETE in", values, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteNotIn(List<Integer> values) {
            addCriterion("IS_COMPLETE not in", values, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteBetween(Integer value1, Integer value2) {
            addCriterion("IS_COMPLETE between", value1, value2, "isComplete");
            return (Criteria) this;
        }

        public Criteria andIsCompleteNotBetween(Integer value1, Integer value2) {
            addCriterion("IS_COMPLETE not between", value1, value2, "isComplete");
            return (Criteria) this;
        }

        public Criteria andCompleteRemarkIsNull() {
            addCriterion("COMPLETE_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andCompleteRemarkIsNotNull() {
            addCriterion("COMPLETE_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteRemarkEqualTo(String value) {
            addCriterion("COMPLETE_REMARK =", value, "completeRemark");
            return (Criteria) this;
        }

        public Criteria andCompleteRemarkNotEqualTo(String value) {
            addCriterion("COMPLETE_REMARK <>", value, "completeRemark");
            return (Criteria) this;
        }

        public Criteria andCompleteRemarkGreaterThan(String value) {
            addCriterion("COMPLETE_REMARK >", value, "completeRemark");
            return (Criteria) this;
        }

        public Criteria andCompleteRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("COMPLETE_REMARK >=", value, "completeRemark");
            return (Criteria) this;
        }

        public Criteria andCompleteRemarkLessThan(String value) {
            addCriterion("COMPLETE_REMARK <", value, "completeRemark");
            return (Criteria) this;
        }

        public Criteria andCompleteRemarkLessThanOrEqualTo(String value) {
            addCriterion("COMPLETE_REMARK <=", value, "completeRemark");
            return (Criteria) this;
        }

        public Criteria andCompleteRemarkLike(String value) {
            addCriterion("COMPLETE_REMARK like", value, "completeRemark");
            return (Criteria) this;
        }

        public Criteria andCompleteRemarkNotLike(String value) {
            addCriterion("COMPLETE_REMARK not like", value, "completeRemark");
            return (Criteria) this;
        }

        public Criteria andCompleteRemarkIn(List<String> values) {
            addCriterion("COMPLETE_REMARK in", values, "completeRemark");
            return (Criteria) this;
        }

        public Criteria andCompleteRemarkNotIn(List<String> values) {
            addCriterion("COMPLETE_REMARK not in", values, "completeRemark");
            return (Criteria) this;
        }

        public Criteria andCompleteRemarkBetween(String value1, String value2) {
            addCriterion("COMPLETE_REMARK between", value1, value2, "completeRemark");
            return (Criteria) this;
        }

        public Criteria andCompleteRemarkNotBetween(String value1, String value2) {
            addCriterion("COMPLETE_REMARK not between", value1, value2, "completeRemark");
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