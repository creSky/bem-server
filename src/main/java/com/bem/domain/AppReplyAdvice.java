package com.bem.domain;

import javax.persistence.*;

@Table(name = "APP_REPLY_ADVICE")
public class AppReplyAdvice {
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 工作单号
     */
    @Column(name = "APP_ID")
    private Long appId;

    /**
     * 答复意见
     */
    @Column(name = "REPLY_ADVICE")
    private String replyAdvice;

    /**
     * 是否通过
     */
    @Column(name = "IS_ACCESS")
    private Integer isAccess;

    /**
     * 有无工程
     */
    @Column(name = "HAVA_PROJECT")
    private Integer havaProject;

    /**
     * 是否答复
     */
    @Column(name = "IS_ANSWER")
    private Integer isAnswer;

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
     * 获取工作单号
     *
     * @return APP_ID - 工作单号
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * 设置工作单号
     *
     * @param appId 工作单号
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * 获取答复意见
     *
     * @return REPLY_ADVICE - 答复意见
     */
    public String getReplyAdvice() {
        return replyAdvice;
    }

    /**
     * 设置答复意见
     *
     * @param replyAdvice 答复意见
     */
    public void setReplyAdvice(String replyAdvice) {
        this.replyAdvice = replyAdvice == null ? null : replyAdvice.trim();
    }

    /**
     * 获取是否通过
     *
     * @return IS_ACCESS - 是否通过
     */
    public Integer getIsAccess() {
        return isAccess;
    }

    /**
     * 设置是否通过
     *
     * @param isAccess 是否通过
     */
    public void setIsAccess(Integer isAccess) {
        this.isAccess = isAccess;
    }

    /**
     * 获取有无工程
     *
     * @return HAVA_PROJECT - 有无工程
     */
    public Integer getHavaProject() {
        return havaProject;
    }

    /**
     * 设置有无工程
     *
     * @param havaProject 有无工程
     */
    public void setHavaProject(Integer havaProject) {
        this.havaProject = havaProject;
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
}