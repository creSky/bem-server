package com.bem.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_PASS_ADVICE")
public class AppPassAdvice {
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
     * 审批意见
     */
    @Column(name = "PASS_ADVICE")
    private String passAdvice;

    /**
     * 审批结论
     */
    @Column(name = "ARGEE_FLAG")
    private Short argeeFlag;

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
     * 审批人id
     */
    @Column(name = "ARGEE_OID")
    private Integer argeeOid;

    /**
     * 审批时间
     */
    @Column(name = "ARGEE_DATE")
    private Date argeeDate;

    /**
     * 审批人名
     */
    @Column(name = "ARGEE_ONAME")
    private String argeeOname;

    /**
     * 是否有工程
     */
    @Column(name = "HAVA_PROJECT")
    private Integer havaProject;

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
     * 获取审批意见
     *
     * @return PASS_ADVICE - 审批意见
     */
    public String getPassAdvice() {
        return passAdvice;
    }

    /**
     * 设置审批意见
     *
     * @param passAdvice 审批意见
     */
    public void setPassAdvice(String passAdvice) {
        this.passAdvice = passAdvice == null ? null : passAdvice.trim();
    }

    /**
     * 获取审批结论
     *
     * @return ARGEE_FLAG - 审批结论
     */
    public Short getArgeeFlag() {
        return argeeFlag;
    }

    /**
     * 设置审批结论
     *
     * @param argeeFlag 审批结论
     */
    public void setArgeeFlag(Short argeeFlag) {
        this.argeeFlag = argeeFlag;
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
     * 获取审批人id
     *
     * @return ARGEE_OID - 审批人id
     */
    public Integer getArgeeOid() {
        return argeeOid;
    }

    /**
     * 设置审批人id
     *
     * @param argeeOid 审批人id
     */
    public void setArgeeOid(Integer argeeOid) {
        this.argeeOid = argeeOid;
    }

    /**
     * 获取审批时间
     *
     * @return ARGEE_DATE - 审批时间
     */
    public Date getArgeeDate() {
        return argeeDate;
    }

    /**
     * 设置审批时间
     *
     * @param argeeDate 审批时间
     */
    public void setArgeeDate(Date argeeDate) {
        this.argeeDate = argeeDate;
    }

    /**
     * 获取审批人名
     *
     * @return ARGEE_ONAME - 审批人名
     */
    public String getArgeeOname() {
        return argeeOname;
    }

    /**
     * 设置审批人名
     *
     * @param argeeOname 审批人名
     */
    public void setArgeeOname(String argeeOname) {
        this.argeeOname = argeeOname == null ? null : argeeOname.trim();
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
}