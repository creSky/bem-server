package com.bem.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_USER_INFO")
public class AppUserInfo {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 工作单号
     */
    @Column(name = "APP_NO")
    private String appNo;

    /**
     * 业务类别
     */
    @Column(name = "TEMPLATE_ID")
    private Integer templateId;

    /**
     * 用电户 客户关联id
     */
    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    /**
     * 用电户编号
     */
    @Column(name = "USER_NO")
    private String userNo;

    /**
     * 用电户名称
     */
    @Column(name = "USER_NAME")
    private String userName;

    /**
     * 用电地址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 营业区域
     */
    @Column(name = "BUSINESS_PLACE_CODE")
    private Integer businessPlaceCode;

    /**
     * 抄表区段
     */
    @Column(name = "WRITE_SECT_ID")
    private String writeSectId;

    /**
     * 合同容量
     */
    @Column(name = "ALL_CAPACITY")
    private BigDecimal allCapacity;

    /**
     * 行业类别
     */
    @Column(name = "TRADE_TYPE")
    private Short tradeType;

    /**
     * 用电类别
     */
    @Column(name = "ELEC_TYPE")
    private Short elecType;

    /**
     * 电压等级
     */
    @Column(name = "VOLT_LEVEL_TYPE")
    private Short voltLevelType;

    /**
     * 计量方式
     */
    @Column(name = "MS_MODE_TYPE")
    private Short msModeType;

    /**
     * 负荷类别
     */
    @Column(name = "LOAD_TYPE")
    private Short loadType;

    /**
     * 高可靠性标志
     */
    @Column(name = "IS_HIGH_TYPE")
    private Short isHighType;

    /**
     * 临时用电标志
     */
    @Column(name = "TEMP_TYPE")
    private Short tempType;

    /**
     * 信誉等级
     */
    @Column(name = "CREDIT_RANK_TYPE")
    private Short creditRankType;

    /**
     * 抄表周期
     */
    @Column(name = "WRITE_TYPE")
    private Short writeType;

    /**
     * 分类标识
     */
    @Column(name = "USER_TYPE")
    private Short userType;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    @Column(name = "STATUS")
    private Short status;

    /**
     * 创建时间（短信通知依据时间）
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 完成时间（短信通知依据时间）
     */
    @Column(name = "SUBMIT_DATE")
    private Date submitDate;

    /**
     * activiti实例编号
     */
    @Column(name = "PROC_INST_ID")
    private String procInstId;

    /**
     * 申请时间
     */
    @Column(name = "APPLY_DATE")
    private Date applyDate;

    /**
     * 电话
     */
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    /**
     * 流程状态标识 Y正在运行 N作废 C是已完成
     */
    @Column(name = "APP_STATUS")
    private String appStatus;

    @Column(name = "TASK_ID")
    private String taskId;

    /**
     * 1网站2微信3智能终端4大厅
     */
    @Column(name = "SOURCE")
    private String source;

    /**
     * 台区
     */
    @Column(name = "TG_ID")
    private Long tgId;

    /**
     * 获取ID
     *
     * @return ID - ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置ID
     *
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取工作单号
     *
     * @return APP_NO - 工作单号
     */
    public String getAppNo() {
        return appNo;
    }

    /**
     * 设置工作单号
     *
     * @param appNo 工作单号
     */
    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    /**
     * 获取业务类别
     *
     * @return TEMPLATE_ID - 业务类别
     */
    public Integer getTemplateId() {
        return templateId;
    }

    /**
     * 设置业务类别
     *
     * @param templateId 业务类别
     */
    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    /**
     * 获取用电户 客户关联id
     *
     * @return CUSTOMER_ID - 用电户 客户关联id
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 设置用电户 客户关联id
     *
     * @param customerId 用电户 客户关联id
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取用电户编号
     *
     * @return USER_NO - 用电户编号
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * 设置用电户编号
     *
     * @param userNo 用电户编号
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    /**
     * 获取用电户名称
     *
     * @return USER_NAME - 用电户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用电户名称
     *
     * @param userName 用电户名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * 获取用电地址
     *
     * @return ADDRESS - 用电地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置用电地址
     *
     * @param address 用电地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取营业区域
     *
     * @return BUSINESS_PLACE_CODE - 营业区域
     */
    public Integer getBusinessPlaceCode() {
        return businessPlaceCode;
    }

    /**
     * 设置营业区域
     *
     * @param businessPlaceCode 营业区域
     */
    public void setBusinessPlaceCode(Integer businessPlaceCode) {
        this.businessPlaceCode = businessPlaceCode;
    }

    /**
     * 获取抄表区段
     *
     * @return WRITE_SECT_ID - 抄表区段
     */
    public String getWriteSectId() {
        return writeSectId;
    }

    /**
     * 设置抄表区段
     *
     * @param writeSectId 抄表区段
     */
    public void setWriteSectId(String writeSectId) {
        this.writeSectId = writeSectId == null ? null : writeSectId.trim();
    }

    /**
     * 获取合同容量
     *
     * @return ALL_CAPACITY - 合同容量
     */
    public BigDecimal getAllCapacity() {
        return allCapacity;
    }

    /**
     * 设置合同容量
     *
     * @param allCapacity 合同容量
     */
    public void setAllCapacity(BigDecimal allCapacity) {
        this.allCapacity = allCapacity;
    }

    /**
     * 获取行业类别
     *
     * @return TRADE_TYPE - 行业类别
     */
    public Short getTradeType() {
        return tradeType;
    }

    /**
     * 设置行业类别
     *
     * @param tradeType 行业类别
     */
    public void setTradeType(Short tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * 获取用电类别
     *
     * @return ELEC_TYPE - 用电类别
     */
    public Short getElecType() {
        return elecType;
    }

    /**
     * 设置用电类别
     *
     * @param elecType 用电类别
     */
    public void setElecType(Short elecType) {
        this.elecType = elecType;
    }

    /**
     * 获取电压等级
     *
     * @return VOLT_LEVEL_TYPE - 电压等级
     */
    public Short getVoltLevelType() {
        return voltLevelType;
    }

    /**
     * 设置电压等级
     *
     * @param voltLevelType 电压等级
     */
    public void setVoltLevelType(Short voltLevelType) {
        this.voltLevelType = voltLevelType;
    }

    /**
     * 获取计量方式
     *
     * @return MS_MODE_TYPE - 计量方式
     */
    public Short getMsModeType() {
        return msModeType;
    }

    /**
     * 设置计量方式
     *
     * @param msModeType 计量方式
     */
    public void setMsModeType(Short msModeType) {
        this.msModeType = msModeType;
    }

    /**
     * 获取负荷类别
     *
     * @return LOAD_TYPE - 负荷类别
     */
    public Short getLoadType() {
        return loadType;
    }

    /**
     * 设置负荷类别
     *
     * @param loadType 负荷类别
     */
    public void setLoadType(Short loadType) {
        this.loadType = loadType;
    }

    /**
     * 获取高可靠性标志
     *
     * @return IS_HIGH_TYPE - 高可靠性标志
     */
    public Short getIsHighType() {
        return isHighType;
    }

    /**
     * 设置高可靠性标志
     *
     * @param isHighType 高可靠性标志
     */
    public void setIsHighType(Short isHighType) {
        this.isHighType = isHighType;
    }

    /**
     * 获取临时用电标志
     *
     * @return TEMP_TYPE - 临时用电标志
     */
    public Short getTempType() {
        return tempType;
    }

    /**
     * 设置临时用电标志
     *
     * @param tempType 临时用电标志
     */
    public void setTempType(Short tempType) {
        this.tempType = tempType;
    }

    /**
     * 获取信誉等级
     *
     * @return CREDIT_RANK_TYPE - 信誉等级
     */
    public Short getCreditRankType() {
        return creditRankType;
    }

    /**
     * 设置信誉等级
     *
     * @param creditRankType 信誉等级
     */
    public void setCreditRankType(Short creditRankType) {
        this.creditRankType = creditRankType;
    }

    /**
     * 获取抄表周期
     *
     * @return WRITE_TYPE - 抄表周期
     */
    public Short getWriteType() {
        return writeType;
    }

    /**
     * 设置抄表周期
     *
     * @param writeType 抄表周期
     */
    public void setWriteType(Short writeType) {
        this.writeType = writeType;
    }

    /**
     * 获取分类标识
     *
     * @return USER_TYPE - 分类标识
     */
    public Short getUserType() {
        return userType;
    }

    /**
     * 设置分类标识
     *
     * @param userType 分类标识
     */
    public void setUserType(Short userType) {
        this.userType = userType;
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

    /**
     * @return STATUS
     */
    public Short getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取创建时间（短信通知依据时间）
     *
     * @return CREATE_DATE - 创建时间（短信通知依据时间）
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间（短信通知依据时间）
     *
     * @param createDate 创建时间（短信通知依据时间）
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取完成时间（短信通知依据时间）
     *
     * @return SUBMIT_DATE - 完成时间（短信通知依据时间）
     */
    public Date getSubmitDate() {
        return submitDate;
    }

    /**
     * 设置完成时间（短信通知依据时间）
     *
     * @param submitDate 完成时间（短信通知依据时间）
     */
    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    /**
     * 获取activiti实例编号
     *
     * @return PROC_INST_ID - activiti实例编号
     */
    public String getProcInstId() {
        return procInstId;
    }

    /**
     * 设置activiti实例编号
     *
     * @param procInstId activiti实例编号
     */
    public void setProcInstId(String procInstId) {
        this.procInstId = procInstId == null ? null : procInstId.trim();
    }

    /**
     * 获取申请时间
     *
     * @return APPLY_DATE - 申请时间
     */
    public Date getApplyDate() {
        return applyDate;
    }

    /**
     * 设置申请时间
     *
     * @param applyDate 申请时间
     */
    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * 获取电话
     *
     * @return PHONE_NUMBER - 电话
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * 设置电话
     *
     * @param phoneNumber 电话
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    /**
     * 获取流程状态标识 Y正在运行 N作废 C是已完成
     *
     * @return APP_STATUS - 流程状态标识 Y正在运行 N作废 C是已完成
     */
    public String getAppStatus() {
        return appStatus;
    }

    /**
     * 设置流程状态标识 Y正在运行 N作废 C是已完成
     *
     * @param appStatus 流程状态标识 Y正在运行 N作废 C是已完成
     */
    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus == null ? null : appStatus.trim();
    }

    /**
     * @return TASK_ID
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * @param taskId
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
    }

    /**
     * 获取1网站2微信3智能终端4大厅
     *
     * @return SOURCE - 1网站2微信3智能终端4大厅
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置1网站2微信3智能终端4大厅
     *
     * @param source 1网站2微信3智能终端4大厅
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    /**
     * 获取台区
     *
     * @return TG_ID - 台区
     */
    public Long getTgId() {
        return tgId;
    }

    /**
     * 设置台区
     *
     * @param tgId 台区
     */
    public void setTgId(Long tgId) {
        this.tgId = tgId;
    }
}