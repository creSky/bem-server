package com.bem.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AppDeclareInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AppDeclareInfoExample() {
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

        public Criteria andProjectCodeIsNull() {
            addCriterion("PROJECT_CODE is null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIsNotNull() {
            addCriterion("PROJECT_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectCodeEqualTo(String value) {
            addCriterion("PROJECT_CODE =", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotEqualTo(String value) {
            addCriterion("PROJECT_CODE <>", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThan(String value) {
            addCriterion("PROJECT_CODE >", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeGreaterThanOrEqualTo(String value) {
            addCriterion("PROJECT_CODE >=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThan(String value) {
            addCriterion("PROJECT_CODE <", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLessThanOrEqualTo(String value) {
            addCriterion("PROJECT_CODE <=", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeLike(String value) {
            addCriterion("PROJECT_CODE like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotLike(String value) {
            addCriterion("PROJECT_CODE not like", value, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeIn(List<String> values) {
            addCriterion("PROJECT_CODE in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotIn(List<String> values) {
            addCriterion("PROJECT_CODE not in", values, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeBetween(String value1, String value2) {
            addCriterion("PROJECT_CODE between", value1, value2, "projectCode");
            return (Criteria) this;
        }

        public Criteria andProjectCodeNotBetween(String value1, String value2) {
            addCriterion("PROJECT_CODE not between", value1, value2, "projectCode");
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

        public Criteria andProDimensionIsNull() {
            addCriterion("PRO_DIMENSION is null");
            return (Criteria) this;
        }

        public Criteria andProDimensionIsNotNull() {
            addCriterion("PRO_DIMENSION is not null");
            return (Criteria) this;
        }

        public Criteria andProDimensionEqualTo(Integer value) {
            addCriterion("PRO_DIMENSION =", value, "proDimension");
            return (Criteria) this;
        }

        public Criteria andProDimensionNotEqualTo(Integer value) {
            addCriterion("PRO_DIMENSION <>", value, "proDimension");
            return (Criteria) this;
        }

        public Criteria andProDimensionGreaterThan(Integer value) {
            addCriterion("PRO_DIMENSION >", value, "proDimension");
            return (Criteria) this;
        }

        public Criteria andProDimensionGreaterThanOrEqualTo(Integer value) {
            addCriterion("PRO_DIMENSION >=", value, "proDimension");
            return (Criteria) this;
        }

        public Criteria andProDimensionLessThan(Integer value) {
            addCriterion("PRO_DIMENSION <", value, "proDimension");
            return (Criteria) this;
        }

        public Criteria andProDimensionLessThanOrEqualTo(Integer value) {
            addCriterion("PRO_DIMENSION <=", value, "proDimension");
            return (Criteria) this;
        }

        public Criteria andProDimensionIn(List<Integer> values) {
            addCriterion("PRO_DIMENSION in", values, "proDimension");
            return (Criteria) this;
        }

        public Criteria andProDimensionNotIn(List<Integer> values) {
            addCriterion("PRO_DIMENSION not in", values, "proDimension");
            return (Criteria) this;
        }

        public Criteria andProDimensionBetween(Integer value1, Integer value2) {
            addCriterion("PRO_DIMENSION between", value1, value2, "proDimension");
            return (Criteria) this;
        }

        public Criteria andProDimensionNotBetween(Integer value1, Integer value2) {
            addCriterion("PRO_DIMENSION not between", value1, value2, "proDimension");
            return (Criteria) this;
        }

        public Criteria andSgCapacityIsNull() {
            addCriterion("SG_CAPACITY is null");
            return (Criteria) this;
        }

        public Criteria andSgCapacityIsNotNull() {
            addCriterion("SG_CAPACITY is not null");
            return (Criteria) this;
        }

        public Criteria andSgCapacityEqualTo(String value) {
            addCriterion("SG_CAPACITY =", value, "sgCapacity");
            return (Criteria) this;
        }

        public Criteria andSgCapacityNotEqualTo(String value) {
            addCriterion("SG_CAPACITY <>", value, "sgCapacity");
            return (Criteria) this;
        }

        public Criteria andSgCapacityGreaterThan(String value) {
            addCriterion("SG_CAPACITY >", value, "sgCapacity");
            return (Criteria) this;
        }

        public Criteria andSgCapacityGreaterThanOrEqualTo(String value) {
            addCriterion("SG_CAPACITY >=", value, "sgCapacity");
            return (Criteria) this;
        }

        public Criteria andSgCapacityLessThan(String value) {
            addCriterion("SG_CAPACITY <", value, "sgCapacity");
            return (Criteria) this;
        }

        public Criteria andSgCapacityLessThanOrEqualTo(String value) {
            addCriterion("SG_CAPACITY <=", value, "sgCapacity");
            return (Criteria) this;
        }

        public Criteria andSgCapacityLike(String value) {
            addCriterion("SG_CAPACITY like", value, "sgCapacity");
            return (Criteria) this;
        }

        public Criteria andSgCapacityNotLike(String value) {
            addCriterion("SG_CAPACITY not like", value, "sgCapacity");
            return (Criteria) this;
        }

        public Criteria andSgCapacityIn(List<String> values) {
            addCriterion("SG_CAPACITY in", values, "sgCapacity");
            return (Criteria) this;
        }

        public Criteria andSgCapacityNotIn(List<String> values) {
            addCriterion("SG_CAPACITY not in", values, "sgCapacity");
            return (Criteria) this;
        }

        public Criteria andSgCapacityBetween(String value1, String value2) {
            addCriterion("SG_CAPACITY between", value1, value2, "sgCapacity");
            return (Criteria) this;
        }

        public Criteria andSgCapacityNotBetween(String value1, String value2) {
            addCriterion("SG_CAPACITY not between", value1, value2, "sgCapacity");
            return (Criteria) this;
        }

        public Criteria andSgClassifiedIsNull() {
            addCriterion("SG_CLASSIFIED is null");
            return (Criteria) this;
        }

        public Criteria andSgClassifiedIsNotNull() {
            addCriterion("SG_CLASSIFIED is not null");
            return (Criteria) this;
        }

        public Criteria andSgClassifiedEqualTo(Integer value) {
            addCriterion("SG_CLASSIFIED =", value, "sgClassified");
            return (Criteria) this;
        }

        public Criteria andSgClassifiedNotEqualTo(Integer value) {
            addCriterion("SG_CLASSIFIED <>", value, "sgClassified");
            return (Criteria) this;
        }

        public Criteria andSgClassifiedGreaterThan(Integer value) {
            addCriterion("SG_CLASSIFIED >", value, "sgClassified");
            return (Criteria) this;
        }

        public Criteria andSgClassifiedGreaterThanOrEqualTo(Integer value) {
            addCriterion("SG_CLASSIFIED >=", value, "sgClassified");
            return (Criteria) this;
        }

        public Criteria andSgClassifiedLessThan(Integer value) {
            addCriterion("SG_CLASSIFIED <", value, "sgClassified");
            return (Criteria) this;
        }

        public Criteria andSgClassifiedLessThanOrEqualTo(Integer value) {
            addCriterion("SG_CLASSIFIED <=", value, "sgClassified");
            return (Criteria) this;
        }

        public Criteria andSgClassifiedIn(List<Integer> values) {
            addCriterion("SG_CLASSIFIED in", values, "sgClassified");
            return (Criteria) this;
        }

        public Criteria andSgClassifiedNotIn(List<Integer> values) {
            addCriterion("SG_CLASSIFIED not in", values, "sgClassified");
            return (Criteria) this;
        }

        public Criteria andSgClassifiedBetween(Integer value1, Integer value2) {
            addCriterion("SG_CLASSIFIED between", value1, value2, "sgClassified");
            return (Criteria) this;
        }

        public Criteria andSgClassifiedNotBetween(Integer value1, Integer value2) {
            addCriterion("SG_CLASSIFIED not between", value1, value2, "sgClassified");
            return (Criteria) this;
        }

        public Criteria andPersonDeputyIsNull() {
            addCriterion("PERSON_DEPUTY is null");
            return (Criteria) this;
        }

        public Criteria andPersonDeputyIsNotNull() {
            addCriterion("PERSON_DEPUTY is not null");
            return (Criteria) this;
        }

        public Criteria andPersonDeputyEqualTo(String value) {
            addCriterion("PERSON_DEPUTY =", value, "personDeputy");
            return (Criteria) this;
        }

        public Criteria andPersonDeputyNotEqualTo(String value) {
            addCriterion("PERSON_DEPUTY <>", value, "personDeputy");
            return (Criteria) this;
        }

        public Criteria andPersonDeputyGreaterThan(String value) {
            addCriterion("PERSON_DEPUTY >", value, "personDeputy");
            return (Criteria) this;
        }

        public Criteria andPersonDeputyGreaterThanOrEqualTo(String value) {
            addCriterion("PERSON_DEPUTY >=", value, "personDeputy");
            return (Criteria) this;
        }

        public Criteria andPersonDeputyLessThan(String value) {
            addCriterion("PERSON_DEPUTY <", value, "personDeputy");
            return (Criteria) this;
        }

        public Criteria andPersonDeputyLessThanOrEqualTo(String value) {
            addCriterion("PERSON_DEPUTY <=", value, "personDeputy");
            return (Criteria) this;
        }

        public Criteria andPersonDeputyLike(String value) {
            addCriterion("PERSON_DEPUTY like", value, "personDeputy");
            return (Criteria) this;
        }

        public Criteria andPersonDeputyNotLike(String value) {
            addCriterion("PERSON_DEPUTY not like", value, "personDeputy");
            return (Criteria) this;
        }

        public Criteria andPersonDeputyIn(List<String> values) {
            addCriterion("PERSON_DEPUTY in", values, "personDeputy");
            return (Criteria) this;
        }

        public Criteria andPersonDeputyNotIn(List<String> values) {
            addCriterion("PERSON_DEPUTY not in", values, "personDeputy");
            return (Criteria) this;
        }

        public Criteria andPersonDeputyBetween(String value1, String value2) {
            addCriterion("PERSON_DEPUTY between", value1, value2, "personDeputy");
            return (Criteria) this;
        }

        public Criteria andPersonDeputyNotBetween(String value1, String value2) {
            addCriterion("PERSON_DEPUTY not between", value1, value2, "personDeputy");
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

        public Criteria andProjectTypeIsNull() {
            addCriterion("PROJECT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("PROJECT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(Integer value) {
            addCriterion("PROJECT_TYPE =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(Integer value) {
            addCriterion("PROJECT_TYPE <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(Integer value) {
            addCriterion("PROJECT_TYPE >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_TYPE >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(Integer value) {
            addCriterion("PROJECT_TYPE <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("PROJECT_TYPE <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<Integer> values) {
            addCriterion("PROJECT_TYPE in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<Integer> values) {
            addCriterion("PROJECT_TYPE not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_TYPE between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("PROJECT_TYPE not between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeIsNull() {
            addCriterion("CIVIL_DESIGN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeIsNotNull() {
            addCriterion("CIVIL_DESIGN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_CODE =", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeNotEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_CODE <>", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeGreaterThan(String value) {
            addCriterion("CIVIL_DESIGN_CODE >", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_CODE >=", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeLessThan(String value) {
            addCriterion("CIVIL_DESIGN_CODE <", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeLessThanOrEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_CODE <=", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeLike(String value) {
            addCriterion("CIVIL_DESIGN_CODE like", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeNotLike(String value) {
            addCriterion("CIVIL_DESIGN_CODE not like", value, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeIn(List<String> values) {
            addCriterion("CIVIL_DESIGN_CODE in", values, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeNotIn(List<String> values) {
            addCriterion("CIVIL_DESIGN_CODE not in", values, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeBetween(String value1, String value2) {
            addCriterion("CIVIL_DESIGN_CODE between", value1, value2, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignCodeNotBetween(String value1, String value2) {
            addCriterion("CIVIL_DESIGN_CODE not between", value1, value2, "civilDesignCode");
            return (Criteria) this;
        }

        public Criteria andCivilDesignNoIsNull() {
            addCriterion("CIVIL_DESIGN_NO is null");
            return (Criteria) this;
        }

        public Criteria andCivilDesignNoIsNotNull() {
            addCriterion("CIVIL_DESIGN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCivilDesignNoEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_NO =", value, "civilDesignNo");
            return (Criteria) this;
        }

        public Criteria andCivilDesignNoNotEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_NO <>", value, "civilDesignNo");
            return (Criteria) this;
        }

        public Criteria andCivilDesignNoGreaterThan(String value) {
            addCriterion("CIVIL_DESIGN_NO >", value, "civilDesignNo");
            return (Criteria) this;
        }

        public Criteria andCivilDesignNoGreaterThanOrEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_NO >=", value, "civilDesignNo");
            return (Criteria) this;
        }

        public Criteria andCivilDesignNoLessThan(String value) {
            addCriterion("CIVIL_DESIGN_NO <", value, "civilDesignNo");
            return (Criteria) this;
        }

        public Criteria andCivilDesignNoLessThanOrEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_NO <=", value, "civilDesignNo");
            return (Criteria) this;
        }

        public Criteria andCivilDesignNoLike(String value) {
            addCriterion("CIVIL_DESIGN_NO like", value, "civilDesignNo");
            return (Criteria) this;
        }

        public Criteria andCivilDesignNoNotLike(String value) {
            addCriterion("CIVIL_DESIGN_NO not like", value, "civilDesignNo");
            return (Criteria) this;
        }

        public Criteria andCivilDesignNoIn(List<String> values) {
            addCriterion("CIVIL_DESIGN_NO in", values, "civilDesignNo");
            return (Criteria) this;
        }

        public Criteria andCivilDesignNoNotIn(List<String> values) {
            addCriterion("CIVIL_DESIGN_NO not in", values, "civilDesignNo");
            return (Criteria) this;
        }

        public Criteria andCivilDesignNoBetween(String value1, String value2) {
            addCriterion("CIVIL_DESIGN_NO between", value1, value2, "civilDesignNo");
            return (Criteria) this;
        }

        public Criteria andCivilDesignNoNotBetween(String value1, String value2) {
            addCriterion("CIVIL_DESIGN_NO not between", value1, value2, "civilDesignNo");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLevelIsNull() {
            addCriterion("CIVIL_DESIGN_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLevelIsNotNull() {
            addCriterion("CIVIL_DESIGN_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLevelEqualTo(Integer value) {
            addCriterion("CIVIL_DESIGN_LEVEL =", value, "civilDesignLevel");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLevelNotEqualTo(Integer value) {
            addCriterion("CIVIL_DESIGN_LEVEL <>", value, "civilDesignLevel");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLevelGreaterThan(Integer value) {
            addCriterion("CIVIL_DESIGN_LEVEL >", value, "civilDesignLevel");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("CIVIL_DESIGN_LEVEL >=", value, "civilDesignLevel");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLevelLessThan(Integer value) {
            addCriterion("CIVIL_DESIGN_LEVEL <", value, "civilDesignLevel");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLevelLessThanOrEqualTo(Integer value) {
            addCriterion("CIVIL_DESIGN_LEVEL <=", value, "civilDesignLevel");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLevelIn(List<Integer> values) {
            addCriterion("CIVIL_DESIGN_LEVEL in", values, "civilDesignLevel");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLevelNotIn(List<Integer> values) {
            addCriterion("CIVIL_DESIGN_LEVEL not in", values, "civilDesignLevel");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLevelBetween(Integer value1, Integer value2) {
            addCriterion("CIVIL_DESIGN_LEVEL between", value1, value2, "civilDesignLevel");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("CIVIL_DESIGN_LEVEL not between", value1, value2, "civilDesignLevel");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLimitIsNull() {
            addCriterion("CIVIL_DESIGN_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLimitIsNotNull() {
            addCriterion("CIVIL_DESIGN_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLimitEqualTo(Date value) {
            addCriterionForJDBCDate("CIVIL_DESIGN_LIMIT =", value, "civilDesignLimit");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLimitNotEqualTo(Date value) {
            addCriterionForJDBCDate("CIVIL_DESIGN_LIMIT <>", value, "civilDesignLimit");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLimitGreaterThan(Date value) {
            addCriterionForJDBCDate("CIVIL_DESIGN_LIMIT >", value, "civilDesignLimit");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLimitGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CIVIL_DESIGN_LIMIT >=", value, "civilDesignLimit");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLimitLessThan(Date value) {
            addCriterionForJDBCDate("CIVIL_DESIGN_LIMIT <", value, "civilDesignLimit");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLimitLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CIVIL_DESIGN_LIMIT <=", value, "civilDesignLimit");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLimitIn(List<Date> values) {
            addCriterionForJDBCDate("CIVIL_DESIGN_LIMIT in", values, "civilDesignLimit");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLimitNotIn(List<Date> values) {
            addCriterionForJDBCDate("CIVIL_DESIGN_LIMIT not in", values, "civilDesignLimit");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLimitBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CIVIL_DESIGN_LIMIT between", value1, value2, "civilDesignLimit");
            return (Criteria) this;
        }

        public Criteria andCivilDesignLimitNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CIVIL_DESIGN_LIMIT not between", value1, value2, "civilDesignLimit");
            return (Criteria) this;
        }

        public Criteria andCivilDesignPassIsNull() {
            addCriterion("CIVIL_DESIGN_PASS is null");
            return (Criteria) this;
        }

        public Criteria andCivilDesignPassIsNotNull() {
            addCriterion("CIVIL_DESIGN_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andCivilDesignPassEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_PASS =", value, "civilDesignPass");
            return (Criteria) this;
        }

        public Criteria andCivilDesignPassNotEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_PASS <>", value, "civilDesignPass");
            return (Criteria) this;
        }

        public Criteria andCivilDesignPassGreaterThan(String value) {
            addCriterion("CIVIL_DESIGN_PASS >", value, "civilDesignPass");
            return (Criteria) this;
        }

        public Criteria andCivilDesignPassGreaterThanOrEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_PASS >=", value, "civilDesignPass");
            return (Criteria) this;
        }

        public Criteria andCivilDesignPassLessThan(String value) {
            addCriterion("CIVIL_DESIGN_PASS <", value, "civilDesignPass");
            return (Criteria) this;
        }

        public Criteria andCivilDesignPassLessThanOrEqualTo(String value) {
            addCriterion("CIVIL_DESIGN_PASS <=", value, "civilDesignPass");
            return (Criteria) this;
        }

        public Criteria andCivilDesignPassLike(String value) {
            addCriterion("CIVIL_DESIGN_PASS like", value, "civilDesignPass");
            return (Criteria) this;
        }

        public Criteria andCivilDesignPassNotLike(String value) {
            addCriterion("CIVIL_DESIGN_PASS not like", value, "civilDesignPass");
            return (Criteria) this;
        }

        public Criteria andCivilDesignPassIn(List<String> values) {
            addCriterion("CIVIL_DESIGN_PASS in", values, "civilDesignPass");
            return (Criteria) this;
        }

        public Criteria andCivilDesignPassNotIn(List<String> values) {
            addCriterion("CIVIL_DESIGN_PASS not in", values, "civilDesignPass");
            return (Criteria) this;
        }

        public Criteria andCivilDesignPassBetween(String value1, String value2) {
            addCriterion("CIVIL_DESIGN_PASS between", value1, value2, "civilDesignPass");
            return (Criteria) this;
        }

        public Criteria andCivilDesignPassNotBetween(String value1, String value2) {
            addCriterion("CIVIL_DESIGN_PASS not between", value1, value2, "civilDesignPass");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeIsNull() {
            addCriterion("CIVIL_CONST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeIsNotNull() {
            addCriterion("CIVIL_CONST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeEqualTo(String value) {
            addCriterion("CIVIL_CONST_CODE =", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeNotEqualTo(String value) {
            addCriterion("CIVIL_CONST_CODE <>", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeGreaterThan(String value) {
            addCriterion("CIVIL_CONST_CODE >", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CIVIL_CONST_CODE >=", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeLessThan(String value) {
            addCriterion("CIVIL_CONST_CODE <", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeLessThanOrEqualTo(String value) {
            addCriterion("CIVIL_CONST_CODE <=", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeLike(String value) {
            addCriterion("CIVIL_CONST_CODE like", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeNotLike(String value) {
            addCriterion("CIVIL_CONST_CODE not like", value, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeIn(List<String> values) {
            addCriterion("CIVIL_CONST_CODE in", values, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeNotIn(List<String> values) {
            addCriterion("CIVIL_CONST_CODE not in", values, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeBetween(String value1, String value2) {
            addCriterion("CIVIL_CONST_CODE between", value1, value2, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstCodeNotBetween(String value1, String value2) {
            addCriterion("CIVIL_CONST_CODE not between", value1, value2, "civilConstCode");
            return (Criteria) this;
        }

        public Criteria andCivilConstNoIsNull() {
            addCriterion("CIVIL_CONST_NO is null");
            return (Criteria) this;
        }

        public Criteria andCivilConstNoIsNotNull() {
            addCriterion("CIVIL_CONST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andCivilConstNoEqualTo(String value) {
            addCriterion("CIVIL_CONST_NO =", value, "civilConstNo");
            return (Criteria) this;
        }

        public Criteria andCivilConstNoNotEqualTo(String value) {
            addCriterion("CIVIL_CONST_NO <>", value, "civilConstNo");
            return (Criteria) this;
        }

        public Criteria andCivilConstNoGreaterThan(String value) {
            addCriterion("CIVIL_CONST_NO >", value, "civilConstNo");
            return (Criteria) this;
        }

        public Criteria andCivilConstNoGreaterThanOrEqualTo(String value) {
            addCriterion("CIVIL_CONST_NO >=", value, "civilConstNo");
            return (Criteria) this;
        }

        public Criteria andCivilConstNoLessThan(String value) {
            addCriterion("CIVIL_CONST_NO <", value, "civilConstNo");
            return (Criteria) this;
        }

        public Criteria andCivilConstNoLessThanOrEqualTo(String value) {
            addCriterion("CIVIL_CONST_NO <=", value, "civilConstNo");
            return (Criteria) this;
        }

        public Criteria andCivilConstNoLike(String value) {
            addCriterion("CIVIL_CONST_NO like", value, "civilConstNo");
            return (Criteria) this;
        }

        public Criteria andCivilConstNoNotLike(String value) {
            addCriterion("CIVIL_CONST_NO not like", value, "civilConstNo");
            return (Criteria) this;
        }

        public Criteria andCivilConstNoIn(List<String> values) {
            addCriterion("CIVIL_CONST_NO in", values, "civilConstNo");
            return (Criteria) this;
        }

        public Criteria andCivilConstNoNotIn(List<String> values) {
            addCriterion("CIVIL_CONST_NO not in", values, "civilConstNo");
            return (Criteria) this;
        }

        public Criteria andCivilConstNoBetween(String value1, String value2) {
            addCriterion("CIVIL_CONST_NO between", value1, value2, "civilConstNo");
            return (Criteria) this;
        }

        public Criteria andCivilConstNoNotBetween(String value1, String value2) {
            addCriterion("CIVIL_CONST_NO not between", value1, value2, "civilConstNo");
            return (Criteria) this;
        }

        public Criteria andCivilConstLevelIsNull() {
            addCriterion("CIVIL_CONST_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andCivilConstLevelIsNotNull() {
            addCriterion("CIVIL_CONST_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andCivilConstLevelEqualTo(Integer value) {
            addCriterion("CIVIL_CONST_LEVEL =", value, "civilConstLevel");
            return (Criteria) this;
        }

        public Criteria andCivilConstLevelNotEqualTo(Integer value) {
            addCriterion("CIVIL_CONST_LEVEL <>", value, "civilConstLevel");
            return (Criteria) this;
        }

        public Criteria andCivilConstLevelGreaterThan(Integer value) {
            addCriterion("CIVIL_CONST_LEVEL >", value, "civilConstLevel");
            return (Criteria) this;
        }

        public Criteria andCivilConstLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("CIVIL_CONST_LEVEL >=", value, "civilConstLevel");
            return (Criteria) this;
        }

        public Criteria andCivilConstLevelLessThan(Integer value) {
            addCriterion("CIVIL_CONST_LEVEL <", value, "civilConstLevel");
            return (Criteria) this;
        }

        public Criteria andCivilConstLevelLessThanOrEqualTo(Integer value) {
            addCriterion("CIVIL_CONST_LEVEL <=", value, "civilConstLevel");
            return (Criteria) this;
        }

        public Criteria andCivilConstLevelIn(List<Integer> values) {
            addCriterion("CIVIL_CONST_LEVEL in", values, "civilConstLevel");
            return (Criteria) this;
        }

        public Criteria andCivilConstLevelNotIn(List<Integer> values) {
            addCriterion("CIVIL_CONST_LEVEL not in", values, "civilConstLevel");
            return (Criteria) this;
        }

        public Criteria andCivilConstLevelBetween(Integer value1, Integer value2) {
            addCriterion("CIVIL_CONST_LEVEL between", value1, value2, "civilConstLevel");
            return (Criteria) this;
        }

        public Criteria andCivilConstLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("CIVIL_CONST_LEVEL not between", value1, value2, "civilConstLevel");
            return (Criteria) this;
        }

        public Criteria andCivilConstLimitIsNull() {
            addCriterion("CIVIL_CONST_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andCivilConstLimitIsNotNull() {
            addCriterion("CIVIL_CONST_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andCivilConstLimitEqualTo(Date value) {
            addCriterionForJDBCDate("CIVIL_CONST_LIMIT =", value, "civilConstLimit");
            return (Criteria) this;
        }

        public Criteria andCivilConstLimitNotEqualTo(Date value) {
            addCriterionForJDBCDate("CIVIL_CONST_LIMIT <>", value, "civilConstLimit");
            return (Criteria) this;
        }

        public Criteria andCivilConstLimitGreaterThan(Date value) {
            addCriterionForJDBCDate("CIVIL_CONST_LIMIT >", value, "civilConstLimit");
            return (Criteria) this;
        }

        public Criteria andCivilConstLimitGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CIVIL_CONST_LIMIT >=", value, "civilConstLimit");
            return (Criteria) this;
        }

        public Criteria andCivilConstLimitLessThan(Date value) {
            addCriterionForJDBCDate("CIVIL_CONST_LIMIT <", value, "civilConstLimit");
            return (Criteria) this;
        }

        public Criteria andCivilConstLimitLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("CIVIL_CONST_LIMIT <=", value, "civilConstLimit");
            return (Criteria) this;
        }

        public Criteria andCivilConstLimitIn(List<Date> values) {
            addCriterionForJDBCDate("CIVIL_CONST_LIMIT in", values, "civilConstLimit");
            return (Criteria) this;
        }

        public Criteria andCivilConstLimitNotIn(List<Date> values) {
            addCriterionForJDBCDate("CIVIL_CONST_LIMIT not in", values, "civilConstLimit");
            return (Criteria) this;
        }

        public Criteria andCivilConstLimitBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CIVIL_CONST_LIMIT between", value1, value2, "civilConstLimit");
            return (Criteria) this;
        }

        public Criteria andCivilConstLimitNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("CIVIL_CONST_LIMIT not between", value1, value2, "civilConstLimit");
            return (Criteria) this;
        }

        public Criteria andCivilConstPassIsNull() {
            addCriterion("CIVIL_CONST_PASS is null");
            return (Criteria) this;
        }

        public Criteria andCivilConstPassIsNotNull() {
            addCriterion("CIVIL_CONST_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andCivilConstPassEqualTo(String value) {
            addCriterion("CIVIL_CONST_PASS =", value, "civilConstPass");
            return (Criteria) this;
        }

        public Criteria andCivilConstPassNotEqualTo(String value) {
            addCriterion("CIVIL_CONST_PASS <>", value, "civilConstPass");
            return (Criteria) this;
        }

        public Criteria andCivilConstPassGreaterThan(String value) {
            addCriterion("CIVIL_CONST_PASS >", value, "civilConstPass");
            return (Criteria) this;
        }

        public Criteria andCivilConstPassGreaterThanOrEqualTo(String value) {
            addCriterion("CIVIL_CONST_PASS >=", value, "civilConstPass");
            return (Criteria) this;
        }

        public Criteria andCivilConstPassLessThan(String value) {
            addCriterion("CIVIL_CONST_PASS <", value, "civilConstPass");
            return (Criteria) this;
        }

        public Criteria andCivilConstPassLessThanOrEqualTo(String value) {
            addCriterion("CIVIL_CONST_PASS <=", value, "civilConstPass");
            return (Criteria) this;
        }

        public Criteria andCivilConstPassLike(String value) {
            addCriterion("CIVIL_CONST_PASS like", value, "civilConstPass");
            return (Criteria) this;
        }

        public Criteria andCivilConstPassNotLike(String value) {
            addCriterion("CIVIL_CONST_PASS not like", value, "civilConstPass");
            return (Criteria) this;
        }

        public Criteria andCivilConstPassIn(List<String> values) {
            addCriterion("CIVIL_CONST_PASS in", values, "civilConstPass");
            return (Criteria) this;
        }

        public Criteria andCivilConstPassNotIn(List<String> values) {
            addCriterion("CIVIL_CONST_PASS not in", values, "civilConstPass");
            return (Criteria) this;
        }

        public Criteria andCivilConstPassBetween(String value1, String value2) {
            addCriterion("CIVIL_CONST_PASS between", value1, value2, "civilConstPass");
            return (Criteria) this;
        }

        public Criteria andCivilConstPassNotBetween(String value1, String value2) {
            addCriterion("CIVIL_CONST_PASS not between", value1, value2, "civilConstPass");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeIsNull() {
            addCriterion("ENERGY_DESIGN_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeIsNotNull() {
            addCriterion("ENERGY_DESIGN_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_CODE =", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeNotEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_CODE <>", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeGreaterThan(String value) {
            addCriterion("ENERGY_DESIGN_CODE >", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_CODE >=", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeLessThan(String value) {
            addCriterion("ENERGY_DESIGN_CODE <", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeLessThanOrEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_CODE <=", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeLike(String value) {
            addCriterion("ENERGY_DESIGN_CODE like", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeNotLike(String value) {
            addCriterion("ENERGY_DESIGN_CODE not like", value, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeIn(List<String> values) {
            addCriterion("ENERGY_DESIGN_CODE in", values, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeNotIn(List<String> values) {
            addCriterion("ENERGY_DESIGN_CODE not in", values, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeBetween(String value1, String value2) {
            addCriterion("ENERGY_DESIGN_CODE between", value1, value2, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignCodeNotBetween(String value1, String value2) {
            addCriterion("ENERGY_DESIGN_CODE not between", value1, value2, "energyDesignCode");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignNoIsNull() {
            addCriterion("ENERGY_DESIGN_NO is null");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignNoIsNotNull() {
            addCriterion("ENERGY_DESIGN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignNoEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_NO =", value, "energyDesignNo");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignNoNotEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_NO <>", value, "energyDesignNo");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignNoGreaterThan(String value) {
            addCriterion("ENERGY_DESIGN_NO >", value, "energyDesignNo");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignNoGreaterThanOrEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_NO >=", value, "energyDesignNo");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignNoLessThan(String value) {
            addCriterion("ENERGY_DESIGN_NO <", value, "energyDesignNo");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignNoLessThanOrEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_NO <=", value, "energyDesignNo");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignNoLike(String value) {
            addCriterion("ENERGY_DESIGN_NO like", value, "energyDesignNo");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignNoNotLike(String value) {
            addCriterion("ENERGY_DESIGN_NO not like", value, "energyDesignNo");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignNoIn(List<String> values) {
            addCriterion("ENERGY_DESIGN_NO in", values, "energyDesignNo");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignNoNotIn(List<String> values) {
            addCriterion("ENERGY_DESIGN_NO not in", values, "energyDesignNo");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignNoBetween(String value1, String value2) {
            addCriterion("ENERGY_DESIGN_NO between", value1, value2, "energyDesignNo");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignNoNotBetween(String value1, String value2) {
            addCriterion("ENERGY_DESIGN_NO not between", value1, value2, "energyDesignNo");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLevelIsNull() {
            addCriterion("ENERGY_DESIGN_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLevelIsNotNull() {
            addCriterion("ENERGY_DESIGN_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLevelEqualTo(Integer value) {
            addCriterion("ENERGY_DESIGN_LEVEL =", value, "energyDesignLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLevelNotEqualTo(Integer value) {
            addCriterion("ENERGY_DESIGN_LEVEL <>", value, "energyDesignLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLevelGreaterThan(Integer value) {
            addCriterion("ENERGY_DESIGN_LEVEL >", value, "energyDesignLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENERGY_DESIGN_LEVEL >=", value, "energyDesignLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLevelLessThan(Integer value) {
            addCriterion("ENERGY_DESIGN_LEVEL <", value, "energyDesignLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLevelLessThanOrEqualTo(Integer value) {
            addCriterion("ENERGY_DESIGN_LEVEL <=", value, "energyDesignLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLevelIn(List<Integer> values) {
            addCriterion("ENERGY_DESIGN_LEVEL in", values, "energyDesignLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLevelNotIn(List<Integer> values) {
            addCriterion("ENERGY_DESIGN_LEVEL not in", values, "energyDesignLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLevelBetween(Integer value1, Integer value2) {
            addCriterion("ENERGY_DESIGN_LEVEL between", value1, value2, "energyDesignLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("ENERGY_DESIGN_LEVEL not between", value1, value2, "energyDesignLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLimitIsNull() {
            addCriterion("ENERGY_DESIGN_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLimitIsNotNull() {
            addCriterion("ENERGY_DESIGN_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLimitEqualTo(Date value) {
            addCriterionForJDBCDate("ENERGY_DESIGN_LIMIT =", value, "energyDesignLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLimitNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENERGY_DESIGN_LIMIT <>", value, "energyDesignLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLimitGreaterThan(Date value) {
            addCriterionForJDBCDate("ENERGY_DESIGN_LIMIT >", value, "energyDesignLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLimitGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENERGY_DESIGN_LIMIT >=", value, "energyDesignLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLimitLessThan(Date value) {
            addCriterionForJDBCDate("ENERGY_DESIGN_LIMIT <", value, "energyDesignLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLimitLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENERGY_DESIGN_LIMIT <=", value, "energyDesignLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLimitIn(List<Date> values) {
            addCriterionForJDBCDate("ENERGY_DESIGN_LIMIT in", values, "energyDesignLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLimitNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENERGY_DESIGN_LIMIT not in", values, "energyDesignLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLimitBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENERGY_DESIGN_LIMIT between", value1, value2, "energyDesignLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignLimitNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENERGY_DESIGN_LIMIT not between", value1, value2, "energyDesignLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignPassIsNull() {
            addCriterion("ENERGY_DESIGN_PASS is null");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignPassIsNotNull() {
            addCriterion("ENERGY_DESIGN_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignPassEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_PASS =", value, "energyDesignPass");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignPassNotEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_PASS <>", value, "energyDesignPass");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignPassGreaterThan(String value) {
            addCriterion("ENERGY_DESIGN_PASS >", value, "energyDesignPass");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignPassGreaterThanOrEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_PASS >=", value, "energyDesignPass");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignPassLessThan(String value) {
            addCriterion("ENERGY_DESIGN_PASS <", value, "energyDesignPass");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignPassLessThanOrEqualTo(String value) {
            addCriterion("ENERGY_DESIGN_PASS <=", value, "energyDesignPass");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignPassLike(String value) {
            addCriterion("ENERGY_DESIGN_PASS like", value, "energyDesignPass");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignPassNotLike(String value) {
            addCriterion("ENERGY_DESIGN_PASS not like", value, "energyDesignPass");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignPassIn(List<String> values) {
            addCriterion("ENERGY_DESIGN_PASS in", values, "energyDesignPass");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignPassNotIn(List<String> values) {
            addCriterion("ENERGY_DESIGN_PASS not in", values, "energyDesignPass");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignPassBetween(String value1, String value2) {
            addCriterion("ENERGY_DESIGN_PASS between", value1, value2, "energyDesignPass");
            return (Criteria) this;
        }

        public Criteria andEnergyDesignPassNotBetween(String value1, String value2) {
            addCriterion("ENERGY_DESIGN_PASS not between", value1, value2, "energyDesignPass");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeIsNull() {
            addCriterion("ENERGY_CONST_CODE is null");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeIsNotNull() {
            addCriterion("ENERGY_CONST_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeEqualTo(String value) {
            addCriterion("ENERGY_CONST_CODE =", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeNotEqualTo(String value) {
            addCriterion("ENERGY_CONST_CODE <>", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeGreaterThan(String value) {
            addCriterion("ENERGY_CONST_CODE >", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeGreaterThanOrEqualTo(String value) {
            addCriterion("ENERGY_CONST_CODE >=", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeLessThan(String value) {
            addCriterion("ENERGY_CONST_CODE <", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeLessThanOrEqualTo(String value) {
            addCriterion("ENERGY_CONST_CODE <=", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeLike(String value) {
            addCriterion("ENERGY_CONST_CODE like", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeNotLike(String value) {
            addCriterion("ENERGY_CONST_CODE not like", value, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeIn(List<String> values) {
            addCriterion("ENERGY_CONST_CODE in", values, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeNotIn(List<String> values) {
            addCriterion("ENERGY_CONST_CODE not in", values, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeBetween(String value1, String value2) {
            addCriterion("ENERGY_CONST_CODE between", value1, value2, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstCodeNotBetween(String value1, String value2) {
            addCriterion("ENERGY_CONST_CODE not between", value1, value2, "energyConstCode");
            return (Criteria) this;
        }

        public Criteria andEnergyConstNoIsNull() {
            addCriterion("ENERGY_CONST_NO is null");
            return (Criteria) this;
        }

        public Criteria andEnergyConstNoIsNotNull() {
            addCriterion("ENERGY_CONST_NO is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyConstNoEqualTo(String value) {
            addCriterion("ENERGY_CONST_NO =", value, "energyConstNo");
            return (Criteria) this;
        }

        public Criteria andEnergyConstNoNotEqualTo(String value) {
            addCriterion("ENERGY_CONST_NO <>", value, "energyConstNo");
            return (Criteria) this;
        }

        public Criteria andEnergyConstNoGreaterThan(String value) {
            addCriterion("ENERGY_CONST_NO >", value, "energyConstNo");
            return (Criteria) this;
        }

        public Criteria andEnergyConstNoGreaterThanOrEqualTo(String value) {
            addCriterion("ENERGY_CONST_NO >=", value, "energyConstNo");
            return (Criteria) this;
        }

        public Criteria andEnergyConstNoLessThan(String value) {
            addCriterion("ENERGY_CONST_NO <", value, "energyConstNo");
            return (Criteria) this;
        }

        public Criteria andEnergyConstNoLessThanOrEqualTo(String value) {
            addCriterion("ENERGY_CONST_NO <=", value, "energyConstNo");
            return (Criteria) this;
        }

        public Criteria andEnergyConstNoLike(String value) {
            addCriterion("ENERGY_CONST_NO like", value, "energyConstNo");
            return (Criteria) this;
        }

        public Criteria andEnergyConstNoNotLike(String value) {
            addCriterion("ENERGY_CONST_NO not like", value, "energyConstNo");
            return (Criteria) this;
        }

        public Criteria andEnergyConstNoIn(List<String> values) {
            addCriterion("ENERGY_CONST_NO in", values, "energyConstNo");
            return (Criteria) this;
        }

        public Criteria andEnergyConstNoNotIn(List<String> values) {
            addCriterion("ENERGY_CONST_NO not in", values, "energyConstNo");
            return (Criteria) this;
        }

        public Criteria andEnergyConstNoBetween(String value1, String value2) {
            addCriterion("ENERGY_CONST_NO between", value1, value2, "energyConstNo");
            return (Criteria) this;
        }

        public Criteria andEnergyConstNoNotBetween(String value1, String value2) {
            addCriterion("ENERGY_CONST_NO not between", value1, value2, "energyConstNo");
            return (Criteria) this;
        }

        public Criteria andEnergyConstLevelIsNull() {
            addCriterion("ENERGY_CONST_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andEnergyConstLevelIsNotNull() {
            addCriterion("ENERGY_CONST_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyConstLevelEqualTo(Integer value) {
            addCriterion("ENERGY_CONST_LEVEL =", value, "energyConstLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyConstLevelNotEqualTo(Integer value) {
            addCriterion("ENERGY_CONST_LEVEL <>", value, "energyConstLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyConstLevelGreaterThan(Integer value) {
            addCriterion("ENERGY_CONST_LEVEL >", value, "energyConstLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyConstLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENERGY_CONST_LEVEL >=", value, "energyConstLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyConstLevelLessThan(Integer value) {
            addCriterion("ENERGY_CONST_LEVEL <", value, "energyConstLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyConstLevelLessThanOrEqualTo(Integer value) {
            addCriterion("ENERGY_CONST_LEVEL <=", value, "energyConstLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyConstLevelIn(List<Integer> values) {
            addCriterion("ENERGY_CONST_LEVEL in", values, "energyConstLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyConstLevelNotIn(List<Integer> values) {
            addCriterion("ENERGY_CONST_LEVEL not in", values, "energyConstLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyConstLevelBetween(Integer value1, Integer value2) {
            addCriterion("ENERGY_CONST_LEVEL between", value1, value2, "energyConstLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyConstLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("ENERGY_CONST_LEVEL not between", value1, value2, "energyConstLevel");
            return (Criteria) this;
        }

        public Criteria andEnergyConstdLimitIsNull() {
            addCriterion("ENERGY_CONSTD_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andEnergyConstdLimitIsNotNull() {
            addCriterion("ENERGY_CONSTD_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyConstdLimitEqualTo(Date value) {
            addCriterionForJDBCDate("ENERGY_CONSTD_LIMIT =", value, "energyConstdLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyConstdLimitNotEqualTo(Date value) {
            addCriterionForJDBCDate("ENERGY_CONSTD_LIMIT <>", value, "energyConstdLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyConstdLimitGreaterThan(Date value) {
            addCriterionForJDBCDate("ENERGY_CONSTD_LIMIT >", value, "energyConstdLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyConstdLimitGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENERGY_CONSTD_LIMIT >=", value, "energyConstdLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyConstdLimitLessThan(Date value) {
            addCriterionForJDBCDate("ENERGY_CONSTD_LIMIT <", value, "energyConstdLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyConstdLimitLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ENERGY_CONSTD_LIMIT <=", value, "energyConstdLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyConstdLimitIn(List<Date> values) {
            addCriterionForJDBCDate("ENERGY_CONSTD_LIMIT in", values, "energyConstdLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyConstdLimitNotIn(List<Date> values) {
            addCriterionForJDBCDate("ENERGY_CONSTD_LIMIT not in", values, "energyConstdLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyConstdLimitBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENERGY_CONSTD_LIMIT between", value1, value2, "energyConstdLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyConstdLimitNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ENERGY_CONSTD_LIMIT not between", value1, value2, "energyConstdLimit");
            return (Criteria) this;
        }

        public Criteria andEnergyConstPassIsNull() {
            addCriterion("ENERGY_CONST_PASS is null");
            return (Criteria) this;
        }

        public Criteria andEnergyConstPassIsNotNull() {
            addCriterion("ENERGY_CONST_PASS is not null");
            return (Criteria) this;
        }

        public Criteria andEnergyConstPassEqualTo(String value) {
            addCriterion("ENERGY_CONST_PASS =", value, "energyConstPass");
            return (Criteria) this;
        }

        public Criteria andEnergyConstPassNotEqualTo(String value) {
            addCriterion("ENERGY_CONST_PASS <>", value, "energyConstPass");
            return (Criteria) this;
        }

        public Criteria andEnergyConstPassGreaterThan(String value) {
            addCriterion("ENERGY_CONST_PASS >", value, "energyConstPass");
            return (Criteria) this;
        }

        public Criteria andEnergyConstPassGreaterThanOrEqualTo(String value) {
            addCriterion("ENERGY_CONST_PASS >=", value, "energyConstPass");
            return (Criteria) this;
        }

        public Criteria andEnergyConstPassLessThan(String value) {
            addCriterion("ENERGY_CONST_PASS <", value, "energyConstPass");
            return (Criteria) this;
        }

        public Criteria andEnergyConstPassLessThanOrEqualTo(String value) {
            addCriterion("ENERGY_CONST_PASS <=", value, "energyConstPass");
            return (Criteria) this;
        }

        public Criteria andEnergyConstPassLike(String value) {
            addCriterion("ENERGY_CONST_PASS like", value, "energyConstPass");
            return (Criteria) this;
        }

        public Criteria andEnergyConstPassNotLike(String value) {
            addCriterion("ENERGY_CONST_PASS not like", value, "energyConstPass");
            return (Criteria) this;
        }

        public Criteria andEnergyConstPassIn(List<String> values) {
            addCriterion("ENERGY_CONST_PASS in", values, "energyConstPass");
            return (Criteria) this;
        }

        public Criteria andEnergyConstPassNotIn(List<String> values) {
            addCriterion("ENERGY_CONST_PASS not in", values, "energyConstPass");
            return (Criteria) this;
        }

        public Criteria andEnergyConstPassBetween(String value1, String value2) {
            addCriterion("ENERGY_CONST_PASS between", value1, value2, "energyConstPass");
            return (Criteria) this;
        }

        public Criteria andEnergyConstPassNotBetween(String value1, String value2) {
            addCriterion("ENERGY_CONST_PASS not between", value1, value2, "energyConstPass");
            return (Criteria) this;
        }

        public Criteria andPrjChangeInfoIsNull() {
            addCriterion("PRJ_CHANGE_INFO is null");
            return (Criteria) this;
        }

        public Criteria andPrjChangeInfoIsNotNull() {
            addCriterion("PRJ_CHANGE_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andPrjChangeInfoEqualTo(String value) {
            addCriterion("PRJ_CHANGE_INFO =", value, "prjChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPrjChangeInfoNotEqualTo(String value) {
            addCriterion("PRJ_CHANGE_INFO <>", value, "prjChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPrjChangeInfoGreaterThan(String value) {
            addCriterion("PRJ_CHANGE_INFO >", value, "prjChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPrjChangeInfoGreaterThanOrEqualTo(String value) {
            addCriterion("PRJ_CHANGE_INFO >=", value, "prjChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPrjChangeInfoLessThan(String value) {
            addCriterion("PRJ_CHANGE_INFO <", value, "prjChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPrjChangeInfoLessThanOrEqualTo(String value) {
            addCriterion("PRJ_CHANGE_INFO <=", value, "prjChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPrjChangeInfoLike(String value) {
            addCriterion("PRJ_CHANGE_INFO like", value, "prjChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPrjChangeInfoNotLike(String value) {
            addCriterion("PRJ_CHANGE_INFO not like", value, "prjChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPrjChangeInfoIn(List<String> values) {
            addCriterion("PRJ_CHANGE_INFO in", values, "prjChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPrjChangeInfoNotIn(List<String> values) {
            addCriterion("PRJ_CHANGE_INFO not in", values, "prjChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPrjChangeInfoBetween(String value1, String value2) {
            addCriterion("PRJ_CHANGE_INFO between", value1, value2, "prjChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPrjChangeInfoNotBetween(String value1, String value2) {
            addCriterion("PRJ_CHANGE_INFO not between", value1, value2, "prjChangeInfo");
            return (Criteria) this;
        }

        public Criteria andPrjCostInfoIsNull() {
            addCriterion("PRJ_COST_INFO is null");
            return (Criteria) this;
        }

        public Criteria andPrjCostInfoIsNotNull() {
            addCriterion("PRJ_COST_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andPrjCostInfoEqualTo(String value) {
            addCriterion("PRJ_COST_INFO =", value, "prjCostInfo");
            return (Criteria) this;
        }

        public Criteria andPrjCostInfoNotEqualTo(String value) {
            addCriterion("PRJ_COST_INFO <>", value, "prjCostInfo");
            return (Criteria) this;
        }

        public Criteria andPrjCostInfoGreaterThan(String value) {
            addCriterion("PRJ_COST_INFO >", value, "prjCostInfo");
            return (Criteria) this;
        }

        public Criteria andPrjCostInfoGreaterThanOrEqualTo(String value) {
            addCriterion("PRJ_COST_INFO >=", value, "prjCostInfo");
            return (Criteria) this;
        }

        public Criteria andPrjCostInfoLessThan(String value) {
            addCriterion("PRJ_COST_INFO <", value, "prjCostInfo");
            return (Criteria) this;
        }

        public Criteria andPrjCostInfoLessThanOrEqualTo(String value) {
            addCriterion("PRJ_COST_INFO <=", value, "prjCostInfo");
            return (Criteria) this;
        }

        public Criteria andPrjCostInfoLike(String value) {
            addCriterion("PRJ_COST_INFO like", value, "prjCostInfo");
            return (Criteria) this;
        }

        public Criteria andPrjCostInfoNotLike(String value) {
            addCriterion("PRJ_COST_INFO not like", value, "prjCostInfo");
            return (Criteria) this;
        }

        public Criteria andPrjCostInfoIn(List<String> values) {
            addCriterion("PRJ_COST_INFO in", values, "prjCostInfo");
            return (Criteria) this;
        }

        public Criteria andPrjCostInfoNotIn(List<String> values) {
            addCriterion("PRJ_COST_INFO not in", values, "prjCostInfo");
            return (Criteria) this;
        }

        public Criteria andPrjCostInfoBetween(String value1, String value2) {
            addCriterion("PRJ_COST_INFO between", value1, value2, "prjCostInfo");
            return (Criteria) this;
        }

        public Criteria andPrjCostInfoNotBetween(String value1, String value2) {
            addCriterion("PRJ_COST_INFO not between", value1, value2, "prjCostInfo");
            return (Criteria) this;
        }

        public Criteria andPrjQualityInfoIsNull() {
            addCriterion("PRJ_QUALITY_INFO is null");
            return (Criteria) this;
        }

        public Criteria andPrjQualityInfoIsNotNull() {
            addCriterion("PRJ_QUALITY_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andPrjQualityInfoEqualTo(String value) {
            addCriterion("PRJ_QUALITY_INFO =", value, "prjQualityInfo");
            return (Criteria) this;
        }

        public Criteria andPrjQualityInfoNotEqualTo(String value) {
            addCriterion("PRJ_QUALITY_INFO <>", value, "prjQualityInfo");
            return (Criteria) this;
        }

        public Criteria andPrjQualityInfoGreaterThan(String value) {
            addCriterion("PRJ_QUALITY_INFO >", value, "prjQualityInfo");
            return (Criteria) this;
        }

        public Criteria andPrjQualityInfoGreaterThanOrEqualTo(String value) {
            addCriterion("PRJ_QUALITY_INFO >=", value, "prjQualityInfo");
            return (Criteria) this;
        }

        public Criteria andPrjQualityInfoLessThan(String value) {
            addCriterion("PRJ_QUALITY_INFO <", value, "prjQualityInfo");
            return (Criteria) this;
        }

        public Criteria andPrjQualityInfoLessThanOrEqualTo(String value) {
            addCriterion("PRJ_QUALITY_INFO <=", value, "prjQualityInfo");
            return (Criteria) this;
        }

        public Criteria andPrjQualityInfoLike(String value) {
            addCriterion("PRJ_QUALITY_INFO like", value, "prjQualityInfo");
            return (Criteria) this;
        }

        public Criteria andPrjQualityInfoNotLike(String value) {
            addCriterion("PRJ_QUALITY_INFO not like", value, "prjQualityInfo");
            return (Criteria) this;
        }

        public Criteria andPrjQualityInfoIn(List<String> values) {
            addCriterion("PRJ_QUALITY_INFO in", values, "prjQualityInfo");
            return (Criteria) this;
        }

        public Criteria andPrjQualityInfoNotIn(List<String> values) {
            addCriterion("PRJ_QUALITY_INFO not in", values, "prjQualityInfo");
            return (Criteria) this;
        }

        public Criteria andPrjQualityInfoBetween(String value1, String value2) {
            addCriterion("PRJ_QUALITY_INFO between", value1, value2, "prjQualityInfo");
            return (Criteria) this;
        }

        public Criteria andPrjQualityInfoNotBetween(String value1, String value2) {
            addCriterion("PRJ_QUALITY_INFO not between", value1, value2, "prjQualityInfo");
            return (Criteria) this;
        }

        public Criteria andDeclareDateIsNull() {
            addCriterion("DECLARE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDeclareDateIsNotNull() {
            addCriterion("DECLARE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareDateEqualTo(Date value) {
            addCriterionForJDBCDate("DECLARE_DATE =", value, "declareDate");
            return (Criteria) this;
        }

        public Criteria andDeclareDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("DECLARE_DATE <>", value, "declareDate");
            return (Criteria) this;
        }

        public Criteria andDeclareDateGreaterThan(Date value) {
            addCriterionForJDBCDate("DECLARE_DATE >", value, "declareDate");
            return (Criteria) this;
        }

        public Criteria andDeclareDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DECLARE_DATE >=", value, "declareDate");
            return (Criteria) this;
        }

        public Criteria andDeclareDateLessThan(Date value) {
            addCriterionForJDBCDate("DECLARE_DATE <", value, "declareDate");
            return (Criteria) this;
        }

        public Criteria andDeclareDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("DECLARE_DATE <=", value, "declareDate");
            return (Criteria) this;
        }

        public Criteria andDeclareDateIn(List<Date> values) {
            addCriterionForJDBCDate("DECLARE_DATE in", values, "declareDate");
            return (Criteria) this;
        }

        public Criteria andDeclareDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("DECLARE_DATE not in", values, "declareDate");
            return (Criteria) this;
        }

        public Criteria andDeclareDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DECLARE_DATE between", value1, value2, "declareDate");
            return (Criteria) this;
        }

        public Criteria andDeclareDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("DECLARE_DATE not between", value1, value2, "declareDate");
            return (Criteria) this;
        }

        public Criteria andDeclareManIsNull() {
            addCriterion("DECLARE_MAN is null");
            return (Criteria) this;
        }

        public Criteria andDeclareManIsNotNull() {
            addCriterion("DECLARE_MAN is not null");
            return (Criteria) this;
        }

        public Criteria andDeclareManEqualTo(String value) {
            addCriterion("DECLARE_MAN =", value, "declareMan");
            return (Criteria) this;
        }

        public Criteria andDeclareManNotEqualTo(String value) {
            addCriterion("DECLARE_MAN <>", value, "declareMan");
            return (Criteria) this;
        }

        public Criteria andDeclareManGreaterThan(String value) {
            addCriterion("DECLARE_MAN >", value, "declareMan");
            return (Criteria) this;
        }

        public Criteria andDeclareManGreaterThanOrEqualTo(String value) {
            addCriterion("DECLARE_MAN >=", value, "declareMan");
            return (Criteria) this;
        }

        public Criteria andDeclareManLessThan(String value) {
            addCriterion("DECLARE_MAN <", value, "declareMan");
            return (Criteria) this;
        }

        public Criteria andDeclareManLessThanOrEqualTo(String value) {
            addCriterion("DECLARE_MAN <=", value, "declareMan");
            return (Criteria) this;
        }

        public Criteria andDeclareManLike(String value) {
            addCriterion("DECLARE_MAN like", value, "declareMan");
            return (Criteria) this;
        }

        public Criteria andDeclareManNotLike(String value) {
            addCriterion("DECLARE_MAN not like", value, "declareMan");
            return (Criteria) this;
        }

        public Criteria andDeclareManIn(List<String> values) {
            addCriterion("DECLARE_MAN in", values, "declareMan");
            return (Criteria) this;
        }

        public Criteria andDeclareManNotIn(List<String> values) {
            addCriterion("DECLARE_MAN not in", values, "declareMan");
            return (Criteria) this;
        }

        public Criteria andDeclareManBetween(String value1, String value2) {
            addCriterion("DECLARE_MAN between", value1, value2, "declareMan");
            return (Criteria) this;
        }

        public Criteria andDeclareManNotBetween(String value1, String value2) {
            addCriterion("DECLARE_MAN not between", value1, value2, "declareMan");
            return (Criteria) this;
        }

        public Criteria andTelIsNull() {
            addCriterion("TEL is null");
            return (Criteria) this;
        }

        public Criteria andTelIsNotNull() {
            addCriterion("TEL is not null");
            return (Criteria) this;
        }

        public Criteria andTelEqualTo(String value) {
            addCriterion("TEL =", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotEqualTo(String value) {
            addCriterion("TEL <>", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThan(String value) {
            addCriterion("TEL >", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelGreaterThanOrEqualTo(String value) {
            addCriterion("TEL >=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThan(String value) {
            addCriterion("TEL <", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLessThanOrEqualTo(String value) {
            addCriterion("TEL <=", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelLike(String value) {
            addCriterion("TEL like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotLike(String value) {
            addCriterion("TEL not like", value, "tel");
            return (Criteria) this;
        }

        public Criteria andTelIn(List<String> values) {
            addCriterion("TEL in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotIn(List<String> values) {
            addCriterion("TEL not in", values, "tel");
            return (Criteria) this;
        }

        public Criteria andTelBetween(String value1, String value2) {
            addCriterion("TEL between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andTelNotBetween(String value1, String value2) {
            addCriterion("TEL not between", value1, value2, "tel");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNull() {
            addCriterion("START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andStartDateIsNotNull() {
            addCriterion("START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE =", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <>", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("START_DATE >", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE >=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThan(Date value) {
            addCriterionForJDBCDate("START_DATE <", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("START_DATE <=", value, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("START_DATE not in", values, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("START_DATE not between", value1, value2, "startDate");
            return (Criteria) this;
        }

        public Criteria andBuildContentIsNull() {
            addCriterion("BUILD_CONTENT is null");
            return (Criteria) this;
        }

        public Criteria andBuildContentIsNotNull() {
            addCriterion("BUILD_CONTENT is not null");
            return (Criteria) this;
        }

        public Criteria andBuildContentEqualTo(String value) {
            addCriterion("BUILD_CONTENT =", value, "buildContent");
            return (Criteria) this;
        }

        public Criteria andBuildContentNotEqualTo(String value) {
            addCriterion("BUILD_CONTENT <>", value, "buildContent");
            return (Criteria) this;
        }

        public Criteria andBuildContentGreaterThan(String value) {
            addCriterion("BUILD_CONTENT >", value, "buildContent");
            return (Criteria) this;
        }

        public Criteria andBuildContentGreaterThanOrEqualTo(String value) {
            addCriterion("BUILD_CONTENT >=", value, "buildContent");
            return (Criteria) this;
        }

        public Criteria andBuildContentLessThan(String value) {
            addCriterion("BUILD_CONTENT <", value, "buildContent");
            return (Criteria) this;
        }

        public Criteria andBuildContentLessThanOrEqualTo(String value) {
            addCriterion("BUILD_CONTENT <=", value, "buildContent");
            return (Criteria) this;
        }

        public Criteria andBuildContentLike(String value) {
            addCriterion("BUILD_CONTENT like", value, "buildContent");
            return (Criteria) this;
        }

        public Criteria andBuildContentNotLike(String value) {
            addCriterion("BUILD_CONTENT not like", value, "buildContent");
            return (Criteria) this;
        }

        public Criteria andBuildContentIn(List<String> values) {
            addCriterion("BUILD_CONTENT in", values, "buildContent");
            return (Criteria) this;
        }

        public Criteria andBuildContentNotIn(List<String> values) {
            addCriterion("BUILD_CONTENT not in", values, "buildContent");
            return (Criteria) this;
        }

        public Criteria andBuildContentBetween(String value1, String value2) {
            addCriterion("BUILD_CONTENT between", value1, value2, "buildContent");
            return (Criteria) this;
        }

        public Criteria andBuildContentNotBetween(String value1, String value2) {
            addCriterion("BUILD_CONTENT not between", value1, value2, "buildContent");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("END_DATE >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterionForJDBCDate("END_DATE <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("END_DATE <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("END_DATE not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("END_DATE not between", value1, value2, "endDate");
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