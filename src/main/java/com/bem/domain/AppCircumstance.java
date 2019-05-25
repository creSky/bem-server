package com.bem.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_CIRCUMSTANCE")
public class AppCircumstance {
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 工单号
     */
    @Column(name = "APP_ID")
    private String appId;

    /**
     * 环节号
     */
    @Column(name = "TASK_ID")
    private Integer taskId;

    /**
     * 实例号
     */
    @Column(name = "PROCESS_INSTANCE_ID")
    private Long processInstanceId;

    /**
     * 创建日期
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 创建人
     */
    @Column(name = "CREATE_MAN")
    private Integer createMan;

    /**
     * 是否具备供电条件
     */
    @Column(name = "IS_ACCESS")
    private Integer isAccess;

    /**
     * 供电条件说明
     */
    @Column(name = "ACCESS_REMARK")
    private String accessRemark;

    /**
     * 是否有工程
     */
    @Column(name = "HAVA_PROJECT")
    private Integer havaProject;

    /**
     * 工程说明
     */
    @Column(name = "PROJECT_REMARK")
    private String projectRemark;

    /**
     * 是否答复
     */
    @Column(name = "IS_ANSWER")
    private Integer isAnswer;

    /**
     * 答复说明
     */
    @Column(name = "ANSWER_REMARK")
    private String answerRemark;

    /**
     * 勘察人
     */
    @Column(name = "CIRCUMSTANCE_MAN")
    private String circumstanceMan;

    /**
     * 勘察时间
     */
    @Column(name = "CIRCUMSTANCE_DATE")
    private Date circumstanceDate;

    /**
     * 勘察情况说明
     */
    @Column(name = "CIRCUMSTANCE_REMARK")
    private String circumstanceRemark;

    /**
     * 供电方案交付用户时间
     */
    @Column(name = "POWER_SUPPLY_DATE")
    private Date powerSupplyDate;

    /**
     * 供电方案说明
     */
    @Column(name = "POWER_SUPPLY_EXPLAIN")
    private String powerSupplyExplain;

    /**
     * 供电方案是否通过
     */
    @Column(name = "POWER_SUPPLY_ACCESS")
    private Integer powerSupplyAccess;

    /**
     * 供电方案是否通过说明
     */
    @Column(name = "POWER_SUPPLY_REMARK")
    private String powerSupplyRemark;

    /**
     * 是否具备销户/换表/改类/更名条件
     */
    @Column(name = "IS_COMMON")
    private Integer isCommon;

    /**
     * 是否具备销户/换表/改类/更名条件说明
     */
    @Column(name = "COMMON_REMARK")
    private String commonRemark;

    /**
     * 提交日期
     */
    @Column(name = "SUBMIT_DATE")
    private Date submitDate;

    /**
     * @return ID
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取工单号
     *
     * @return APP_ID - 工单号
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置工单号
     *
     * @param appId 工单号
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * 获取环节号
     *
     * @return TASK_ID - 环节号
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * 设置环节号
     *
     * @param taskId 环节号
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    /**
     * 获取实例号
     *
     * @return PROCESS_INSTANCE_ID - 实例号
     */
    public Long getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * 设置实例号
     *
     * @param processInstanceId 实例号
     */
    public void setProcessInstanceId(Long processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    /**
     * 获取创建日期
     *
     * @return CREATE_DATE - 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     *
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取创建人
     *
     * @return CREATE_MAN - 创建人
     */
    public Integer getCreateMan() {
        return createMan;
    }

    /**
     * 设置创建人
     *
     * @param createMan 创建人
     */
    public void setCreateMan(Integer createMan) {
        this.createMan = createMan;
    }

    /**
     * 获取是否具备供电条件
     *
     * @return IS_ACCESS - 是否具备供电条件
     */
    public Integer getIsAccess() {
        return isAccess;
    }

    /**
     * 设置是否具备供电条件
     *
     * @param isAccess 是否具备供电条件
     */
    public void setIsAccess(Integer isAccess) {
        this.isAccess = isAccess;
    }

    /**
     * 获取供电条件说明
     *
     * @return ACCESS_REMARK - 供电条件说明
     */
    public String getAccessRemark() {
        return accessRemark;
    }

    /**
     * 设置供电条件说明
     *
     * @param accessRemark 供电条件说明
     */
    public void setAccessRemark(String accessRemark) {
        this.accessRemark = accessRemark == null ? null : accessRemark.trim();
    }

    /**
     * 获取是否有工程
     *
     * @return HAVA_PROJECT - 是否有工程
     */
    public Integer getHavaProject() {
        return havaProject;
    }

    /**
     * 设置是否有工程
     *
     * @param havaProject 是否有工程
     */
    public void setHavaProject(Integer havaProject) {
        this.havaProject = havaProject;
    }

    /**
     * 获取工程说明
     *
     * @return PROJECT_REMARK - 工程说明
     */
    public String getProjectRemark() {
        return projectRemark;
    }

    /**
     * 设置工程说明
     *
     * @param projectRemark 工程说明
     */
    public void setProjectRemark(String projectRemark) {
        this.projectRemark = projectRemark == null ? null : projectRemark.trim();
    }

    /**
     * 获取是否答复
     *
     * @return IS_ANSWER - 是否答复
     */
    public Integer getIsAnswer() {
        return isAnswer;
    }

    /**
     * 设置是否答复
     *
     * @param isAnswer 是否答复
     */
    public void setIsAnswer(Integer isAnswer) {
        this.isAnswer = isAnswer;
    }

    /**
     * 获取答复说明
     *
     * @return ANSWER_REMARK - 答复说明
     */
    public String getAnswerRemark() {
        return answerRemark;
    }

    /**
     * 设置答复说明
     *
     * @param answerRemark 答复说明
     */
    public void setAnswerRemark(String answerRemark) {
        this.answerRemark = answerRemark == null ? null : answerRemark.trim();
    }

    /**
     * 获取勘察人
     *
     * @return CIRCUMSTANCE_MAN - 勘察人
     */
    public String getCircumstanceMan() {
        return circumstanceMan;
    }

    /**
     * 设置勘察人
     *
     * @param circumstanceMan 勘察人
     */
    public void setCircumstanceMan(String circumstanceMan) {
        this.circumstanceMan = circumstanceMan == null ? null : circumstanceMan.trim();
    }

    /**
     * 获取勘察时间
     *
     * @return CIRCUMSTANCE_DATE - 勘察时间
     */
    public Date getCircumstanceDate() {
        return circumstanceDate;
    }

    /**
     * 设置勘察时间
     *
     * @param circumstanceDate 勘察时间
     */
    public void setCircumstanceDate(Date circumstanceDate) {
        this.circumstanceDate = circumstanceDate;
    }

    /**
     * 获取勘察情况说明
     *
     * @return CIRCUMSTANCE_REMARK - 勘察情况说明
     */
    public String getCircumstanceRemark() {
        return circumstanceRemark;
    }

    /**
     * 设置勘察情况说明
     *
     * @param circumstanceRemark 勘察情况说明
     */
    public void setCircumstanceRemark(String circumstanceRemark) {
        this.circumstanceRemark = circumstanceRemark == null ? null : circumstanceRemark.trim();
    }

    /**
     * 获取供电方案交付用户时间
     *
     * @return POWER_SUPPLY_DATE - 供电方案交付用户时间
     */
    public Date getPowerSupplyDate() {
        return powerSupplyDate;
    }

    /**
     * 设置供电方案交付用户时间
     *
     * @param powerSupplyDate 供电方案交付用户时间
     */
    public void setPowerSupplyDate(Date powerSupplyDate) {
        this.powerSupplyDate = powerSupplyDate;
    }

    /**
     * 获取供电方案说明
     *
     * @return POWER_SUPPLY_EXPLAIN - 供电方案说明
     */
    public String getPowerSupplyExplain() {
        return powerSupplyExplain;
    }

    /**
     * 设置供电方案说明
     *
     * @param powerSupplyExplain 供电方案说明
     */
    public void setPowerSupplyExplain(String powerSupplyExplain) {
        this.powerSupplyExplain = powerSupplyExplain == null ? null : powerSupplyExplain.trim();
    }

    /**
     * 获取供电方案是否通过
     *
     * @return POWER_SUPPLY_ACCESS - 供电方案是否通过
     */
    public Integer getPowerSupplyAccess() {
        return powerSupplyAccess;
    }

    /**
     * 设置供电方案是否通过
     *
     * @param powerSupplyAccess 供电方案是否通过
     */
    public void setPowerSupplyAccess(Integer powerSupplyAccess) {
        this.powerSupplyAccess = powerSupplyAccess;
    }

    /**
     * 获取供电方案是否通过说明
     *
     * @return POWER_SUPPLY_REMARK - 供电方案是否通过说明
     */
    public String getPowerSupplyRemark() {
        return powerSupplyRemark;
    }

    /**
     * 设置供电方案是否通过说明
     *
     * @param powerSupplyRemark 供电方案是否通过说明
     */
    public void setPowerSupplyRemark(String powerSupplyRemark) {
        this.powerSupplyRemark = powerSupplyRemark == null ? null : powerSupplyRemark.trim();
    }

    /**
     * 获取是否具备销户/换表/改类/更名条件
     *
     * @return IS_COMMON - 是否具备销户/换表/改类/更名条件
     */
    public Integer getIsCommon() {
        return isCommon;
    }

    /**
     * 设置是否具备销户/换表/改类/更名条件
     *
     * @param isCommon 是否具备销户/换表/改类/更名条件
     */
    public void setIsCommon(Integer isCommon) {
        this.isCommon = isCommon;
    }

    /**
     * 获取是否具备销户/换表/改类/更名条件说明
     *
     * @return COMMON_REMARK - 是否具备销户/换表/改类/更名条件说明
     */
    public String getCommonRemark() {
        return commonRemark;
    }

    /**
     * 设置是否具备销户/换表/改类/更名条件说明
     *
     * @param commonRemark 是否具备销户/换表/改类/更名条件说明
     */
    public void setCommonRemark(String commonRemark) {
        this.commonRemark = commonRemark == null ? null : commonRemark.trim();
    }

    /**
     * 获取提交日期
     *
     * @return SUBMIT_DATE - 提交日期
     */
    public Date getSubmitDate() {
        return submitDate;
    }

    /**
     * 设置提交日期
     *
     * @param submitDate 提交日期
     */
    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }
}