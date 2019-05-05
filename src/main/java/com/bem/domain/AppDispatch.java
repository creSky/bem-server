package com.bem.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_DISPATCH")
public class AppDispatch {
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
    @Column(name = "REMARK")
    private String remark;

    /**
     * 派工人
     */
    @Column(name = "DISPATCH_MAN")
    private Integer dispatchMan;

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
     * @return REMARK - 审批意见
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置审批意见
     *
     * @param remark 审批意见
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取派工人
     *
     * @return DISPATCH_MAN - 派工人
     */
    public Integer getDispatchMan() {
        return dispatchMan;
    }

    /**
     * 设置派工人
     *
     * @param dispatchMan 派工人
     */
    public void setDispatchMan(Integer dispatchMan) {
        this.dispatchMan = dispatchMan;
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
}