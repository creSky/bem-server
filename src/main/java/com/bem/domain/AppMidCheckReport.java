package com.bem.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_MID_CHECK_REPORT")
public class AppMidCheckReport {
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 工作单号
     */
    @Column(name = "APP_ID")
    private Long appId;

    /**
     * 验收组织人
     */
    @Column(name = "CHECK_MANAGER")
    private String checkManager;

    /**
     * 中间检查日期
     */
    @Column(name = "MID_CHK_DATE")
    private Date midChkDate;

    /**
     * 查验单位
     */
    @Column(name = "CHECK_DEPT")
    private Integer checkDept;

    /**
     * 检查部门人员
     */
    @Column(name = "MID_CHK_MAN")
    private Integer midChkMan;

    /**
     * 合格标识
     */
    @Column(name = "CHECK_PASS_SIGN")
    private Integer checkPassSign;

    /**
     * 承装单位代码
     */
    @Column(name = "CONSTRUCTION_DEPT_CODE")
    private Integer constructionDeptCode;

    /**
     * 项目名称
     */
    @Column(name = "PROJECT_NAME")
    private String projectName;

    /**
     * 工程负责人
     */
    @Column(name = "PROJECT_MANAGER")
    private String projectManager;

    /**
     * 用户自检日期
     */
    @Column(name = "USER_CHK_DATE")
    private Date userChkDate;

    /**
     * 自检结果
     */
    @Column(name = "USER_CHK_RESULT")
    private String userChkResult;

    /**
     * 检查结果
     */
    @Column(name = "CHECK_RESULT")
    private String checkResult;

    /**
     * 遗留问题及处理意见
     */
    @Column(name = "REMAIN_FAULT")
    private String remainFault;

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
     * 获取验收组织人
     *
     * @return CHECK_MANAGER - 验收组织人
     */
    public String getCheckManager() {
        return checkManager;
    }

    /**
     * 设置验收组织人
     *
     * @param checkManager 验收组织人
     */
    public void setCheckManager(String checkManager) {
        this.checkManager = checkManager == null ? null : checkManager.trim();
    }

    /**
     * 获取中间检查日期
     *
     * @return MID_CHK_DATE - 中间检查日期
     */
    public Date getMidChkDate() {
        return midChkDate;
    }

    /**
     * 设置中间检查日期
     *
     * @param midChkDate 中间检查日期
     */
    public void setMidChkDate(Date midChkDate) {
        this.midChkDate = midChkDate;
    }

    /**
     * 获取查验单位
     *
     * @return CHECK_DEPT - 查验单位
     */
    public Integer getCheckDept() {
        return checkDept;
    }

    /**
     * 设置查验单位
     *
     * @param checkDept 查验单位
     */
    public void setCheckDept(Integer checkDept) {
        this.checkDept = checkDept;
    }

    /**
     * 获取检查部门人员
     *
     * @return MID_CHK_MAN - 检查部门人员
     */
    public Integer getMidChkMan() {
        return midChkMan;
    }

    /**
     * 设置检查部门人员
     *
     * @param midChkMan 检查部门人员
     */
    public void setMidChkMan(Integer midChkMan) {
        this.midChkMan = midChkMan;
    }

    /**
     * 获取合格标识
     *
     * @return CHECK_PASS_SIGN - 合格标识
     */
    public Integer getCheckPassSign() {
        return checkPassSign;
    }

    /**
     * 设置合格标识
     *
     * @param checkPassSign 合格标识
     */
    public void setCheckPassSign(Integer checkPassSign) {
        this.checkPassSign = checkPassSign;
    }

    /**
     * 获取承装单位代码
     *
     * @return CONSTRUCTION_DEPT_CODE - 承装单位代码
     */
    public Integer getConstructionDeptCode() {
        return constructionDeptCode;
    }

    /**
     * 设置承装单位代码
     *
     * @param constructionDeptCode 承装单位代码
     */
    public void setConstructionDeptCode(Integer constructionDeptCode) {
        this.constructionDeptCode = constructionDeptCode;
    }

    /**
     * 获取项目名称
     *
     * @return PROJECT_NAME - 项目名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置项目名称
     *
     * @param projectName 项目名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * 获取工程负责人
     *
     * @return PROJECT_MANAGER - 工程负责人
     */
    public String getProjectManager() {
        return projectManager;
    }

    /**
     * 设置工程负责人
     *
     * @param projectManager 工程负责人
     */
    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager == null ? null : projectManager.trim();
    }

    /**
     * 获取用户自检日期
     *
     * @return USER_CHK_DATE - 用户自检日期
     */
    public Date getUserChkDate() {
        return userChkDate;
    }

    /**
     * 设置用户自检日期
     *
     * @param userChkDate 用户自检日期
     */
    public void setUserChkDate(Date userChkDate) {
        this.userChkDate = userChkDate;
    }

    /**
     * 获取自检结果
     *
     * @return USER_CHK_RESULT - 自检结果
     */
    public String getUserChkResult() {
        return userChkResult;
    }

    /**
     * 设置自检结果
     *
     * @param userChkResult 自检结果
     */
    public void setUserChkResult(String userChkResult) {
        this.userChkResult = userChkResult == null ? null : userChkResult.trim();
    }

    /**
     * 获取检查结果
     *
     * @return CHECK_RESULT - 检查结果
     */
    public String getCheckResult() {
        return checkResult;
    }

    /**
     * 设置检查结果
     *
     * @param checkResult 检查结果
     */
    public void setCheckResult(String checkResult) {
        this.checkResult = checkResult == null ? null : checkResult.trim();
    }

    /**
     * 获取遗留问题及处理意见
     *
     * @return REMAIN_FAULT - 遗留问题及处理意见
     */
    public String getRemainFault() {
        return remainFault;
    }

    /**
     * 设置遗留问题及处理意见
     *
     * @param remainFault 遗留问题及处理意见
     */
    public void setRemainFault(String remainFault) {
        this.remainFault = remainFault == null ? null : remainFault.trim();
    }
}