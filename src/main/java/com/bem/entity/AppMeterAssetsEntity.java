package com.bem.entity;

import java.util.Date;
/**
 * /电量退补 用户电表传输对象
 */
public class AppMeterAssetsEntity extends VerificationEntity{

    /**
     * 计量点号
     */
    private Long meterId;

    private String meterAssetsNo;

    /**
     * 计量点号
     */
    private String meterNo;
    /**
     * 计量点名称
     */
    private String meterName;
    /**
     * 功能代码
     */
    private Integer functionCode;
    /**
     * // 功率性质
     */
    private Integer powerDirection;
    /**
     * 抄表区段
     */
    private String writeSectName;

    private Integer writeSectionId;
    //表序号
    private Integer meterOrder;

    //客户编号
    private String userNo;

    private Long userId;

    private String userName;

    private Integer tsFlag;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getTsFlag() {
        return tsFlag;
    }

    public void setTsFlag(Integer tsFlag) {
        this.tsFlag = tsFlag;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    private Long meterAssetsId;

    public Long getMeterAssetsId() {
        return meterAssetsId;
    }

    public void setMeterAssetsId(Long meterAssetsId) {
        this.meterAssetsId = meterAssetsId;
    }

    public Integer getWriteSectionId() {
        return writeSectionId;
    }

    public void setWriteSectionId(Integer writeSectionId) {
        this.writeSectionId = writeSectionId;
    }


    public Long getMeterId() {
        return meterId;
    }

    public void setMeterId(Long meterId) {
        this.meterId = meterId;
    }

    public String getMeterAssetsNo() {
        return meterAssetsNo;
    }

    public void setMeterAssetsNo(String meterAssetsNo) {
        this.meterAssetsNo = meterAssetsNo;
    }

    public String getMeterNo() {
        return meterNo;
    }

    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo;
    }

    public String getMeterName() {
        return meterName;
    }

    public void setMeterName(String meterName) {
        this.meterName = meterName;
    }

    public Integer getFunctionCode() {
        return functionCode;
    }

    public void setFunctionCode(Integer functionCode) {
        this.functionCode = functionCode;
    }

    public Integer getPowerDirection() {
        return powerDirection;
    }

    public void setPowerDirection(Integer powerDirection) {
        this.powerDirection = powerDirection;
    }

    public String getWriteSectName() {
        return writeSectName;
    }

    public void setWriteSectName(String writeSectName) {
        this.writeSectName = writeSectName;
    }

    public Integer getMeterOrder() {
        return meterOrder;
    }

    public void setMeterOrder(Integer meterOrder) {
        this.meterOrder = meterOrder;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }
}