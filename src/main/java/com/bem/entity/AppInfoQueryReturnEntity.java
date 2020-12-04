package com.bem.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

//业扩流程查询返回实体参数
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppInfoQueryReturnEntity {
    private String appNo;
    private String userNo;
    private String userName;
    private String address;
    private Long elecType;
    private String allCapacity;
    private Long templateId;
    private String appStatus;
    private String phoneNumber;
    private Long    finishMan;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date finishDate;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone="GMT+8")
    private Date applyDate;

    public String getAppNo() {
        return appNo;
    }

    public void setAppNo(String appNo) {
        this.appNo = appNo;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getElecType() {
        return elecType;
    }

    public void setElecType(Long elecType) {
        this.elecType = elecType;
    }

    public String getAllCapacity() {
        return allCapacity;
    }

    public void setAllCapacity(String allCapacity) {
        this.allCapacity = allCapacity;
    }

    public String getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getFinishMan() {
        return finishMan;
    }

    public void setFinishMan(Long finishMan) {
        this.finishMan = finishMan;
    }

    public Date getFinishDate() {
        return finishDate;
    }

    public void setFinishDate(Date finishDate) {
        this.finishDate = finishDate;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public Long getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Long templateId) {
        this.templateId = templateId;
    }
}
