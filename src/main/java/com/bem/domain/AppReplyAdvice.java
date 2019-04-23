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
}