package com.bem.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Table(name = "APP_ASSEM")
public class AppAssem {
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
     * 装表人
     */
    @Column(name = "ASSEM_MAN")
    private Integer assemMan;

    /**
     * 装表时间
     */
    @Column(name = "ASSEM_DATE")
    private Date assemDate;

    /**
     * 创建时间（短信通知依据时间）
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 完成时间（短信通知依据时间）
     */
    @Column(name = "SUBMIT_DATE")
    private Date submitDate;

    @Transient
    private List<String> relativePath;

    public List<String> getRelativePath() {
        return new ArrayList<>();
    }


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
     * 获取装表人
     *
     * @return ASSEM_MAN - 装表人
     */
    public Integer getAssemMan() {
        return assemMan;
    }

    /**
     * 设置装表人
     *
     * @param assemMan 装表人
     */
    public void setAssemMan(Integer assemMan) {
        this.assemMan = assemMan;
    }

    /**
     * 获取装表时间
     *
     * @return ASSEM_DATE - 装表时间
     */
    public Date getAssemDate() {
        return assemDate;
    }

    /**
     * 设置装表时间
     *
     * @param assemDate 装表时间
     */
    public void setAssemDate(Date assemDate) {
        this.assemDate = assemDate;
    }

    /**
     * 获取创建时间（短信通知依据时间）
     *
     * @return CREATE_DATE - 创建时间（短信通知依据时间）
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间（短信通知依据时间）
     *
     * @param createDate 创建时间（短信通知依据时间）
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取完成时间（短信通知依据时间）
     *
     * @return SUBMIT_DATE - 完成时间（短信通知依据时间）
     */
    public Date getSubmitDate() {
        return submitDate;
    }

    /**
     * 设置完成时间（短信通知依据时间）
     *
     * @param submitDate 完成时间（短信通知依据时间）
     */
    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }
}