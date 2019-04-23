package com.bem.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;

@Table(name = "V_TASKLIST")
public class TaskList {
    @Column(name = "ID")
    private String id;

    @Column(name = "PROC_INST_ID")
    private String procInstId;

    @Column(name = "EXECUTION_ID")
    private String executionId;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TASK_DEF_KEY")
    private String taskDefKey;

    @Column(name = "CREATE_TIME")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createTime;

    @Column(name = "GROUP_ID")
    private String groupId;

    @Column(name = "USER_ID")
    private String userId;

    @Column(name = "BUSINESS_KEY")
    private String businessKey;
    

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return PROC_INST_ID
     */
    public String getProcInstId() {
        return procInstId;
    }

    /**
     * @param procInstId
     */
    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId == null ? null : procInstId.trim();
    }

    /**
     * @return EXECUTION_ID
     */
    public String getExecutionId() {
        return executionId;
    }

    /**
     * @param executionId
     */
    public void setExecutionId(String executionId) {
        this.executionId = executionId == null ? null : executionId.trim();
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return TASK_DEF_KEY
     */
    public String getTaskDefKey() {
        return taskDefKey;
    }

    /**
     * @param taskDefKey
     */
    public void setTaskDefKey(String taskDefKey) {
        this.taskDefKey = taskDefKey == null ? null : taskDefKey.trim();
    }

    /**
     * @return CREATE_TIME
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    /**
     * @return GROUP_ID
     */
    public String getGroupId() {
        return groupId;
    }

    /**
     * @param groupId
     */
    public void setGroupId(String groupId) {
        this.groupId = groupId == null ? null : groupId.trim();
    }

    /**
     * @return USER_ID
     */
    public String getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * @return BUSINESS_KEY
     */
    public String getBusinessKey() {
        return businessKey;
    }

    /**
     * @param businessKey
     */
    public void setBusinessKey(String businessKey) {
        this.businessKey = businessKey == null ? null : businessKey.trim();
    }

}