package com.bem.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Table(name = "APP_DESIGN_APPRAISE")
public class AppDesignAppraise {
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 工作单ID
     */
    @Column(name = "APP_ID")
    private String appId;

    /**
     * 环节号
     */
    @Column(name = "TASK_ID")
    private Integer taskId;

    /**
     * 是否通过
     */
    @Column(name = "IS_AGREE")
    private Integer isAgree;

    /**
     * 是否通过
     */
    @Transient
    private List<String> relativePath;

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
     * 获取工作单ID
     *
     * @return APP_ID - 工作单ID
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置工作单ID
     *
     * @param appId 工作单ID
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
     * 获取是否通过
     *
     * @return IS_AGREE - 是否通过
     */
    public Integer getIsAgree() {
        return isAgree;
    }

    /**
     * 设置是否通过
     *
     * @param isAgree 是否通过
     */
    public void setIsAgree(Integer isAgree) {
        this.isAgree = isAgree;
    }

    public List<String> getRelativePath() {
        return new ArrayList<>();
    }

}