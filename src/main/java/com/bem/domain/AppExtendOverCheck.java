package com.bem.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_EXTEND_OVER_CHECK")
public class AppExtendOverCheck {
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 工作单号
     */
    @Column(name = "APP_ID")
    private Long appId;

    /**
     * 土建设计单位
     */
    @Column(name = "CIVIL_DESIGN_CODE")
    private String civilDesignCode;

    /**
     * 土建施工单位
     */
    @Column(name = "CIVIL_CONST_CODE")
    private String civilConstCode;

    /**
     * 电气设计单位
     */
    @Column(name = "ENERGY_DESIGN_CODE")
    private String energyDesignCode;

    /**
     * 电气施工单位
     */
    @Column(name = "ENERGY_CONST_CODE")
    private String energyConstCode;

    /**
     * 客户自检结果
     */
    @Column(name = "SELF_TEST_RESULT")
    private String selfTestResult;

    /**
     * 自检日期
     */
    @Column(name = "SELF_TEST_DATE")
    private Date selfTestDate;

    /**
     * 检查人
     */
    @Column(name = "CHECK_MAN")
    private String checkMan;

    /**
     * 报查时间
     */
    @Column(name = "APPLY_DATE")
    private Date applyDate;

    /**
     * 检查日期
     */
    @Column(name = "CHECK_DATE")
    private Date checkDate;

    /**
     * 自检结果
     */
    @Column(name = "CHECK_RESULT")
    private String checkResult;

    /**
     * 检查结论
     */
    @Column(name = "CONCLUSION")
    private String conclusion;

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
     * 获取土建设计单位
     *
     * @return CIVIL_DESIGN_CODE - 土建设计单位
     */
    public String getCivilDesignCode() {
        return civilDesignCode;
    }

    /**
     * 设置土建设计单位
     *
     * @param civilDesignCode 土建设计单位
     */
    public void setCivilDesignCode(String civilDesignCode) {
        this.civilDesignCode = civilDesignCode == null ? null : civilDesignCode.trim();
    }

    /**
     * 获取土建施工单位
     *
     * @return CIVIL_CONST_CODE - 土建施工单位
     */
    public String getCivilConstCode() {
        return civilConstCode;
    }

    /**
     * 设置土建施工单位
     *
     * @param civilConstCode 土建施工单位
     */
    public void setCivilConstCode(String civilConstCode) {
        this.civilConstCode = civilConstCode == null ? null : civilConstCode.trim();
    }

    /**
     * 获取电气设计单位
     *
     * @return ENERGY_DESIGN_CODE - 电气设计单位
     */
    public String getEnergyDesignCode() {
        return energyDesignCode;
    }

    /**
     * 设置电气设计单位
     *
     * @param energyDesignCode 电气设计单位
     */
    public void setEnergyDesignCode(String energyDesignCode) {
        this.energyDesignCode = energyDesignCode == null ? null : energyDesignCode.trim();
    }

    /**
     * 获取电气施工单位
     *
     * @return ENERGY_CONST_CODE - 电气施工单位
     */
    public String getEnergyConstCode() {
        return energyConstCode;
    }

    /**
     * 设置电气施工单位
     *
     * @param energyConstCode 电气施工单位
     */
    public void setEnergyConstCode(String energyConstCode) {
        this.energyConstCode = energyConstCode == null ? null : energyConstCode.trim();
    }

    /**
     * 获取客户自检结果
     *
     * @return SELF_TEST_RESULT - 客户自检结果
     */
    public String getSelfTestResult() {
        return selfTestResult;
    }

    /**
     * 设置客户自检结果
     *
     * @param selfTestResult 客户自检结果
     */
    public void setSelfTestResult(String selfTestResult) {
        this.selfTestResult = selfTestResult == null ? null : selfTestResult.trim();
    }

    /**
     * 获取自检日期
     *
     * @return SELF_TEST_DATE - 自检日期
     */
    public Date getSelfTestDate() {
        return selfTestDate;
    }

    /**
     * 设置自检日期
     *
     * @param selfTestDate 自检日期
     */
    public void setSelfTestDate(Date selfTestDate) {
        this.selfTestDate = selfTestDate;
    }

    /**
     * 获取检查人
     *
     * @return CHECK_MAN - 检查人
     */
    public String getCheckMan() {
        return checkMan;
    }

    /**
     * 设置检查人
     *
     * @param checkMan 检查人
     */
    public void setCheckMan(String checkMan) {
        this.checkMan = checkMan == null ? null : checkMan.trim();
    }

    /**
     * 获取报查时间
     *
     * @return APPLY_DATE - 报查时间
     */
    public Date getApplyDate() {
        return applyDate;
    }

    /**
     * 设置报查时间
     *
     * @param applyDate 报查时间
     */
    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * 获取检查日期
     *
     * @return CHECK_DATE - 检查日期
     */
    public Date getCheckDate() {
        return checkDate;
    }

    /**
     * 设置检查日期
     *
     * @param checkDate 检查日期
     */
    public void setCheckDate(Date checkDate) {
        this.checkDate = checkDate;
    }

    /**
     * 获取自检结果
     *
     * @return CHECK_RESULT - 自检结果
     */
    public String getCheckResult() {
        return checkResult;
    }

    /**
     * 设置自检结果
     *
     * @param checkResult 自检结果
     */
    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult == null ? null : checkResult.trim();
    }

    /**
     * 获取检查结论
     *
     * @return CONCLUSION - 检查结论
     */
    public String getConclusion() {
        return conclusion;
    }

    /**
     * 设置检查结论
     *
     * @param conclusion 检查结论
     */
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion == null ? null : conclusion.trim();
    }
}