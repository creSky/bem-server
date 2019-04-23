package com.bem.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_DECLARE_INFO")
public class AppDeclareInfo {
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 工作单ID
     */
    @Column(name = "APP_ID")
    private Long appId;

    /**
     * 工程编号
     */
    @Column(name = "PROJECT_CODE")
    private String projectCode;

    /**
     * 工程名称
     */
    @Column(name = "PROJECT_NAME")
    private String projectName;

    /**
     * 工程规模
     */
    @Column(name = "PRO_DIMENSION")
    private Integer proDimension;

    /**
     * 施工容量
     */
    @Column(name = "SG_CAPACITY")
    private String sgCapacity;

    /**
     * 施工类别
     */
    @Column(name = "SG_CLASSIFIED")
    private Integer sgClassified;

    /**
     * 客户代表
     */
    @Column(name = "PERSON_DEPUTY")
    private String personDeputy;

    /**
     * 项目负责人
     */
    @Column(name = "PROJECT_MANAGER")
    private String projectManager;

    /**
     * 工程类型1：电房2：台架3：箱变
     */
    @Column(name = "PROJECT_TYPE")
    private Integer projectType;

    /**
     * 土建设计单位代码
     */
    @Column(name = "CIVIL_DESIGN_CODE")
    private String civilDesignCode;

    /**
     * 土建设计单位资格证编号
     */
    @Column(name = "CIVIL_DESIGN_NO")
    private String civilDesignNo;

    /**
     * 土建设计单位资质等级
     */
    @Column(name = "CIVIL_DESIGN_LEVEL")
    private Integer civilDesignLevel;

    /**
     * 土建设计单位资质有效期限
     */
    @Column(name = "CIVIL_DESIGN_LIMIT")
    private Date civilDesignLimit;

    /**
     * 土建设计单位经手人
     */
    @Column(name = "CIVIL_DESIGN_PASS")
    private String civilDesignPass;

    /**
     * 土建施工单位代码
     */
    @Column(name = "CIVIL_CONST_CODE")
    private String civilConstCode;

    /**
     * 土建施工单位资格证编号
     */
    @Column(name = "CIVIL_CONST_NO")
    private String civilConstNo;

    /**
     * 土建施工单位资质等级
     */
    @Column(name = "CIVIL_CONST_LEVEL")
    private Integer civilConstLevel;

    /**
     * 土建施工单位资质有效期限
     */
    @Column(name = "CIVIL_CONST_LIMIT")
    private Date civilConstLimit;

    /**
     * 土建施工单位经手人
     */
    @Column(name = "CIVIL_CONST_PASS")
    private String civilConstPass;

    /**
     * 电气设计单位代码
     */
    @Column(name = "ENERGY_DESIGN_CODE")
    private String energyDesignCode;

    /**
     * 电气设计单位资格证编号
     */
    @Column(name = "ENERGY_DESIGN_NO")
    private String energyDesignNo;

    /**
     * 电气设计单位资质等级
     */
    @Column(name = "ENERGY_DESIGN_LEVEL")
    private Integer energyDesignLevel;

    /**
     * 电气设计单位资质有效期限
     */
    @Column(name = "ENERGY_DESIGN_LIMIT")
    private Date energyDesignLimit;

    /**
     * 电气设计单位经手人
     */
    @Column(name = "ENERGY_DESIGN_PASS")
    private String energyDesignPass;

    /**
     * 电气施工单位代码
     */
    @Column(name = "ENERGY_CONST_CODE")
    private String energyConstCode;

    /**
     * 电气施工单位资格证编号
     */
    @Column(name = "ENERGY_CONST_NO")
    private String energyConstNo;

    /**
     * 电气施工单位资质等级
     */
    @Column(name = "ENERGY_CONST_LEVEL")
    private Integer energyConstLevel;

    /**
     * 电气施工单位资质有效期限
     */
    @Column(name = "ENERGY_CONSTD_LIMIT")
    private Date energyConstdLimit;

    /**
     * 电气施工单位经手人
     */
    @Column(name = "ENERGY_CONST_PASS")
    private String energyConstPass;

    /**
     * 工程变更信息
     */
    @Column(name = "PRJ_CHANGE_INFO")
    private String prjChangeInfo;

    /**
     * 工程造价信息
     */
    @Column(name = "PRJ_COST_INFO")
    private String prjCostInfo;

    /**
     * 质量评定信息
     */
    @Column(name = "PRJ_QUALITY_INFO")
    private String prjQualityInfo;

    /**
     * 报验时间
     */
    @Column(name = "DECLARE_DATE")
    private Date declareDate;

    /**
     * 报验人
     */
    @Column(name = "DECLARE_MAN")
    private String declareMan;

    /**
     * 报验人电话
     */
    @Column(name = "TEL")
    private String tel;

    /**
     * 开工日期
     */
    @Column(name = "START_DATE")
    private Date startDate;

    /**
     * 施工内容
     */
    @Column(name = "BUILD_CONTENT")
    private String buildContent;

    /**
     * 交工日期
     */
    @Column(name = "END_DATE")
    private Date endDate;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

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
    public Long getAppId() {
        return appId;
    }

    /**
     * 设置工作单ID
     *
     * @param appId 工作单ID
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * 获取工程编号
     *
     * @return PROJECT_CODE - 工程编号
     */
    public String getProjectCode() {
        return projectCode;
    }

    /**
     * 设置工程编号
     *
     * @param projectCode 工程编号
     */
    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    /**
     * 获取工程名称
     *
     * @return PROJECT_NAME - 工程名称
     */
    public String getProjectName() {
        return projectName;
    }

    /**
     * 设置工程名称
     *
     * @param projectName 工程名称
     */
    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    /**
     * 获取工程规模
     *
     * @return PRO_DIMENSION - 工程规模
     */
    public Integer getProDimension() {
        return proDimension;
    }

    /**
     * 设置工程规模
     *
     * @param proDimension 工程规模
     */
    public void setProDimension(Integer proDimension) {
        this.proDimension = proDimension;
    }

    /**
     * 获取施工容量
     *
     * @return SG_CAPACITY - 施工容量
     */
    public String getSgCapacity() {
        return sgCapacity;
    }

    /**
     * 设置施工容量
     *
     * @param sgCapacity 施工容量
     */
    public void setSgCapacity(String sgCapacity) {
        this.sgCapacity = sgCapacity == null ? null : sgCapacity.trim();
    }

    /**
     * 获取施工类别
     *
     * @return SG_CLASSIFIED - 施工类别
     */
    public Integer getSgClassified() {
        return sgClassified;
    }

    /**
     * 设置施工类别
     *
     * @param sgClassified 施工类别
     */
    public void setSgClassified(Integer sgClassified) {
        this.sgClassified = sgClassified;
    }

    /**
     * 获取客户代表
     *
     * @return PERSON_DEPUTY - 客户代表
     */
    public String getPersonDeputy() {
        return personDeputy;
    }

    /**
     * 设置客户代表
     *
     * @param personDeputy 客户代表
     */
    public void setPersonDeputy(String personDeputy) {
        this.personDeputy = personDeputy == null ? null : personDeputy.trim();
    }

    /**
     * 获取项目负责人
     *
     * @return PROJECT_MANAGER - 项目负责人
     */
    public String getProjectManager() {
        return projectManager;
    }

    /**
     * 设置项目负责人
     *
     * @param projectManager 项目负责人
     */
    public void setProjectManager(String projectManager) {
        this.projectManager = projectManager == null ? null : projectManager.trim();
    }

    /**
     * 获取工程类型1：电房2：台架3：箱变
     *
     * @return PROJECT_TYPE - 工程类型1：电房2：台架3：箱变
     */
    public Integer getProjectType() {
        return projectType;
    }

    /**
     * 设置工程类型1：电房2：台架3：箱变
     *
     * @param projectType 工程类型1：电房2：台架3：箱变
     */
    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    /**
     * 获取土建设计单位代码
     *
     * @return CIVIL_DESIGN_CODE - 土建设计单位代码
     */
    public String getCivilDesignCode() {
        return civilDesignCode;
    }

    /**
     * 设置土建设计单位代码
     *
     * @param civilDesignCode 土建设计单位代码
     */
    public void setCivilDesignCode(String civilDesignCode) {
        this.civilDesignCode = civilDesignCode == null ? null : civilDesignCode.trim();
    }

    /**
     * 获取土建设计单位资格证编号
     *
     * @return CIVIL_DESIGN_NO - 土建设计单位资格证编号
     */
    public String getCivilDesignNo() {
        return civilDesignNo;
    }

    /**
     * 设置土建设计单位资格证编号
     *
     * @param civilDesignNo 土建设计单位资格证编号
     */
    public void setCivilDesignNo(String civilDesignNo) {
        this.civilDesignNo = civilDesignNo == null ? null : civilDesignNo.trim();
    }

    /**
     * 获取土建设计单位资质等级
     *
     * @return CIVIL_DESIGN_LEVEL - 土建设计单位资质等级
     */
    public Integer getCivilDesignLevel() {
        return civilDesignLevel;
    }

    /**
     * 设置土建设计单位资质等级
     *
     * @param civilDesignLevel 土建设计单位资质等级
     */
    public void setCivilDesignLevel(Integer civilDesignLevel) {
        this.civilDesignLevel = civilDesignLevel;
    }

    /**
     * 获取土建设计单位资质有效期限
     *
     * @return CIVIL_DESIGN_LIMIT - 土建设计单位资质有效期限
     */
    public Date getCivilDesignLimit() {
        return civilDesignLimit;
    }

    /**
     * 设置土建设计单位资质有效期限
     *
     * @param civilDesignLimit 土建设计单位资质有效期限
     */
    public void setCivilDesignLimit(Date civilDesignLimit) {
        this.civilDesignLimit = civilDesignLimit;
    }

    /**
     * 获取土建设计单位经手人
     *
     * @return CIVIL_DESIGN_PASS - 土建设计单位经手人
     */
    public String getCivilDesignPass() {
        return civilDesignPass;
    }

    /**
     * 设置土建设计单位经手人
     *
     * @param civilDesignPass 土建设计单位经手人
     */
    public void setCivilDesignPass(String civilDesignPass) {
        this.civilDesignPass = civilDesignPass == null ? null : civilDesignPass.trim();
    }

    /**
     * 获取土建施工单位代码
     *
     * @return CIVIL_CONST_CODE - 土建施工单位代码
     */
    public String getCivilConstCode() {
        return civilConstCode;
    }

    /**
     * 设置土建施工单位代码
     *
     * @param civilConstCode 土建施工单位代码
     */
    public void setCivilConstCode(String civilConstCode) {
        this.civilConstCode = civilConstCode == null ? null : civilConstCode.trim();
    }

    /**
     * 获取土建施工单位资格证编号
     *
     * @return CIVIL_CONST_NO - 土建施工单位资格证编号
     */
    public String getCivilConstNo() {
        return civilConstNo;
    }

    /**
     * 设置土建施工单位资格证编号
     *
     * @param civilConstNo 土建施工单位资格证编号
     */
    public void setCivilConstNo(String civilConstNo) {
        this.civilConstNo = civilConstNo == null ? null : civilConstNo.trim();
    }

    /**
     * 获取土建施工单位资质等级
     *
     * @return CIVIL_CONST_LEVEL - 土建施工单位资质等级
     */
    public Integer getCivilConstLevel() {
        return civilConstLevel;
    }

    /**
     * 设置土建施工单位资质等级
     *
     * @param civilConstLevel 土建施工单位资质等级
     */
    public void setCivilConstLevel(Integer civilConstLevel) {
        this.civilConstLevel = civilConstLevel;
    }

    /**
     * 获取土建施工单位资质有效期限
     *
     * @return CIVIL_CONST_LIMIT - 土建施工单位资质有效期限
     */
    public Date getCivilConstLimit() {
        return civilConstLimit;
    }

    /**
     * 设置土建施工单位资质有效期限
     *
     * @param civilConstLimit 土建施工单位资质有效期限
     */
    public void setCivilConstLimit(Date civilConstLimit) {
        this.civilConstLimit = civilConstLimit;
    }

    /**
     * 获取土建施工单位经手人
     *
     * @return CIVIL_CONST_PASS - 土建施工单位经手人
     */
    public String getCivilConstPass() {
        return civilConstPass;
    }

    /**
     * 设置土建施工单位经手人
     *
     * @param civilConstPass 土建施工单位经手人
     */
    public void setCivilConstPass(String civilConstPass) {
        this.civilConstPass = civilConstPass == null ? null : civilConstPass.trim();
    }

    /**
     * 获取电气设计单位代码
     *
     * @return ENERGY_DESIGN_CODE - 电气设计单位代码
     */
    public String getEnergyDesignCode() {
        return energyDesignCode;
    }

    /**
     * 设置电气设计单位代码
     *
     * @param energyDesignCode 电气设计单位代码
     */
    public void setEnergyDesignCode(String energyDesignCode) {
        this.energyDesignCode = energyDesignCode == null ? null : energyDesignCode.trim();
    }

    /**
     * 获取电气设计单位资格证编号
     *
     * @return ENERGY_DESIGN_NO - 电气设计单位资格证编号
     */
    public String getEnergyDesignNo() {
        return energyDesignNo;
    }

    /**
     * 设置电气设计单位资格证编号
     *
     * @param energyDesignNo 电气设计单位资格证编号
     */
    public void setEnergyDesignNo(String energyDesignNo) {
        this.energyDesignNo = energyDesignNo == null ? null : energyDesignNo.trim();
    }

    /**
     * 获取电气设计单位资质等级
     *
     * @return ENERGY_DESIGN_LEVEL - 电气设计单位资质等级
     */
    public Integer getEnergyDesignLevel() {
        return energyDesignLevel;
    }

    /**
     * 设置电气设计单位资质等级
     *
     * @param energyDesignLevel 电气设计单位资质等级
     */
    public void setEnergyDesignLevel(Integer energyDesignLevel) {
        this.energyDesignLevel = energyDesignLevel;
    }

    /**
     * 获取电气设计单位资质有效期限
     *
     * @return ENERGY_DESIGN_LIMIT - 电气设计单位资质有效期限
     */
    public Date getEnergyDesignLimit() {
        return energyDesignLimit;
    }

    /**
     * 设置电气设计单位资质有效期限
     *
     * @param energyDesignLimit 电气设计单位资质有效期限
     */
    public void setEnergyDesignLimit(Date energyDesignLimit) {
        this.energyDesignLimit = energyDesignLimit;
    }

    /**
     * 获取电气设计单位经手人
     *
     * @return ENERGY_DESIGN_PASS - 电气设计单位经手人
     */
    public String getEnergyDesignPass() {
        return energyDesignPass;
    }

    /**
     * 设置电气设计单位经手人
     *
     * @param energyDesignPass 电气设计单位经手人
     */
    public void setEnergyDesignPass(String energyDesignPass) {
        this.energyDesignPass = energyDesignPass == null ? null : energyDesignPass.trim();
    }

    /**
     * 获取电气施工单位代码
     *
     * @return ENERGY_CONST_CODE - 电气施工单位代码
     */
    public String getEnergyConstCode() {
        return energyConstCode;
    }

    /**
     * 设置电气施工单位代码
     *
     * @param energyConstCode 电气施工单位代码
     */
    public void setEnergyConstCode(String energyConstCode) {
        this.energyConstCode = energyConstCode == null ? null : energyConstCode.trim();
    }

    /**
     * 获取电气施工单位资格证编号
     *
     * @return ENERGY_CONST_NO - 电气施工单位资格证编号
     */
    public String getEnergyConstNo() {
        return energyConstNo;
    }

    /**
     * 设置电气施工单位资格证编号
     *
     * @param energyConstNo 电气施工单位资格证编号
     */
    public void setEnergyConstNo(String energyConstNo) {
        this.energyConstNo = energyConstNo == null ? null : energyConstNo.trim();
    }

    /**
     * 获取电气施工单位资质等级
     *
     * @return ENERGY_CONST_LEVEL - 电气施工单位资质等级
     */
    public Integer getEnergyConstLevel() {
        return energyConstLevel;
    }

    /**
     * 设置电气施工单位资质等级
     *
     * @param energyConstLevel 电气施工单位资质等级
     */
    public void setEnergyConstLevel(Integer energyConstLevel) {
        this.energyConstLevel = energyConstLevel;
    }

    /**
     * 获取电气施工单位资质有效期限
     *
     * @return ENERGY_CONSTD_LIMIT - 电气施工单位资质有效期限
     */
    public Date getEnergyConstdLimit() {
        return energyConstdLimit;
    }

    /**
     * 设置电气施工单位资质有效期限
     *
     * @param energyConstdLimit 电气施工单位资质有效期限
     */
    public void setEnergyConstdLimit(Date energyConstdLimit) {
        this.energyConstdLimit = energyConstdLimit;
    }

    /**
     * 获取电气施工单位经手人
     *
     * @return ENERGY_CONST_PASS - 电气施工单位经手人
     */
    public String getEnergyConstPass() {
        return energyConstPass;
    }

    /**
     * 设置电气施工单位经手人
     *
     * @param energyConstPass 电气施工单位经手人
     */
    public void setEnergyConstPass(String energyConstPass) {
        this.energyConstPass = energyConstPass == null ? null : energyConstPass.trim();
    }

    /**
     * 获取工程变更信息
     *
     * @return PRJ_CHANGE_INFO - 工程变更信息
     */
    public String getPrjChangeInfo() {
        return prjChangeInfo;
    }

    /**
     * 设置工程变更信息
     *
     * @param prjChangeInfo 工程变更信息
     */
    public void setPrjChangeInfo(String prjChangeInfo) {
        this.prjChangeInfo = prjChangeInfo == null ? null : prjChangeInfo.trim();
    }

    /**
     * 获取工程造价信息
     *
     * @return PRJ_COST_INFO - 工程造价信息
     */
    public String getPrjCostInfo() {
        return prjCostInfo;
    }

    /**
     * 设置工程造价信息
     *
     * @param prjCostInfo 工程造价信息
     */
    public void setPrjCostInfo(String prjCostInfo) {
        this.prjCostInfo = prjCostInfo == null ? null : prjCostInfo.trim();
    }

    /**
     * 获取质量评定信息
     *
     * @return PRJ_QUALITY_INFO - 质量评定信息
     */
    public String getPrjQualityInfo() {
        return prjQualityInfo;
    }

    /**
     * 设置质量评定信息
     *
     * @param prjQualityInfo 质量评定信息
     */
    public void setPrjQualityInfo(String prjQualityInfo) {
        this.prjQualityInfo = prjQualityInfo == null ? null : prjQualityInfo.trim();
    }

    /**
     * 获取报验时间
     *
     * @return DECLARE_DATE - 报验时间
     */
    public Date getDeclareDate() {
        return declareDate;
    }

    /**
     * 设置报验时间
     *
     * @param declareDate 报验时间
     */
    public void setDeclareDate(Date declareDate) {
        this.declareDate = declareDate;
    }

    /**
     * 获取报验人
     *
     * @return DECLARE_MAN - 报验人
     */
    public String getDeclareMan() {
        return declareMan;
    }

    /**
     * 设置报验人
     *
     * @param declareMan 报验人
     */
    public void setDeclareMan(String declareMan) {
        this.declareMan = declareMan == null ? null : declareMan.trim();
    }

    /**
     * 获取报验人电话
     *
     * @return TEL - 报验人电话
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置报验人电话
     *
     * @param tel 报验人电话
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * 获取开工日期
     *
     * @return START_DATE - 开工日期
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开工日期
     *
     * @param startDate 开工日期
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取施工内容
     *
     * @return BUILD_CONTENT - 施工内容
     */
    public String getBuildContent() {
        return buildContent;
    }

    /**
     * 设置施工内容
     *
     * @param buildContent 施工内容
     */
    public void setBuildContent(String buildContent) {
        this.buildContent = buildContent == null ? null : buildContent.trim();
    }

    /**
     * 获取交工日期
     *
     * @return END_DATE - 交工日期
     */
    public Date getEndDate() {
        return endDate;
    }

    /**
     * 设置交工日期
     *
     * @param endDate 交工日期
     */
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    /**
     * 获取备注
     *
     * @return REMARK - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}