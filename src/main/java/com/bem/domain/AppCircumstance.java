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
     * 是否具备接入条件
     */
    @Column(name = "IS_ACCESS")
    private Integer isAccess;

    /**
     * 接入条件说明
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
     * 获取是否具备接入条件
     *
     * @return IS_ACCESS - 是否具备接入条件
     */
    public Integer getIsAccess() {
        return isAccess;
    }

    /**
     * 设置是否具备接入条件
     *
     * @param isAccess 是否具备接入条件
     */
    public void setIsAccess(Integer isAccess) {
        this.isAccess = isAccess;
    }

    /**
     * 获取接入条件说明
     *
     * @return ACCESS_REMARK - 接入条件说明
     */
    public String getAccessRemark() {
        return accessRemark;
    }

    /**
     * 设置接入条件说明
     *
     * @param accessRemark 接入条件说明
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
}