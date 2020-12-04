package com.bem.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_SETTLEMENT_INFO")
public class AppSettlementInfo {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "SETTLEMENT_ID")
    private Long settlementId;

    /**
     * 工作单号
     */
    @Column(name = "APP_NO")
    private String appNo;

    /**
     * 环节id
     */
    @Column(name = "TASK_ID")
    private String taskId;

    /**
     * 业务类别
     */
    @Column(name = "TEMPLATE_ID")
    private Integer templateId;

    @Column(name = "SETTLEMENT_NO")
    private String settlementNo;

    @Column(name = "SETTLEMENT_NAME")
    private String settlementName;

    @Column(name = "SETTLEMENT_PHONE")
    private String settlementPhone;

    @Column(name = "CHARGE_MODE_TYPE")
    private Short chargeModeType;

    @Column(name = "CONNECT_BANK")
    private Short connectBank;

    @Column(name = "BANK_NO")
    private String bankNo;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "REMARK")
    private String remark;

    @Column(name = "APP_STATUS")
    private String appStatus;

    @Column(name = "ACCOUNT_NAME")
    private String accountName;

    @Column(name = "ACCOUNT_NO")
    private String accountNo;

    @Column(name = "CUSCC")
    private String cuscc;

    @Column(name = "BUSINESS_PLACE_CODE")
    private Long businessPlaceCode;

    @Column(name = "INVOICE_TYPE")
    private Short invoiceType;

    @Column(name = "INVOICE_PRINT_TYPE")
    private Short invoicePrintType;

    @Column(name = "OPENDING_BANK")
    private Short opendingBank;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "APPLY_MAN_ID")
    private Integer applyManId;

    @Column(name = "APPLY_DATE")
    private Date applyDate;

    /**
     * 1网站2微信3智能终端4大厅
     */
    @Column(name = "SOURCE")
    private String source;

    /**
     * activiti实例编号
     */
    @Column(name = "PROC_INST_ID")
    private String procInstId;

    @Transient
    private Long appId;

    @Transient
    private Long status;

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

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
     * @return SETTLEMENT_ID
     */
    public Long getSettlementId() {
        return settlementId;
    }

    /**
     * @param settlementId
     */
    public void setSettlementId(Long settlementId) {
        this.settlementId = settlementId;
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
     * 获取环节id
     *
     * @return TASK_ID - 环节id
     */
    public String getTaskId() {
        return taskId;
    }

    /**
     * 设置环节id
     *
     * @param taskId 环节id
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId == null ? null : taskId.trim();
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
     * @return SETTLEMENT_NO
     */
    public String getSettlementNo() {
        return settlementNo;
    }

    /**
     * @param settlementNo
     */
    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo == null ? null : settlementNo.trim();
    }

    /**
     * @return SETTLEMENT_NAME
     */
    public String getSettlementName() {
        return settlementName;
    }

    /**
     * @param settlementName
     */
    public void setSettlementName(String settlementName) {
        this.settlementName = settlementName == null ? null : settlementName.trim();
    }

    /**
     * @return SETTLEMENT_PHONE
     */
    public String getSettlementPhone() {
        return settlementPhone;
    }

    /**
     * @param settlementPhone
     */
    public void setSettlementPhone(String settlementPhone) {
        this.settlementPhone = settlementPhone == null ? null : settlementPhone.trim();
    }

    /**
     * @return CHARGE_MODE_TYPE
     */
    public Short getChargeModeType() {
        return chargeModeType;
    }

    /**
     * @param chargeModeType
     */
    public void setChargeModeType(Short chargeModeType) {
        this.chargeModeType = chargeModeType;
    }

    /**
     * @return CONNECT_BANK
     */
    public Short getConnectBank() {
        return connectBank;
    }

    /**
     * @param connectBank
     */
    public void setConnectBank(Short connectBank) {
        this.connectBank = connectBank;
    }

    /**
     * @return BANK_NO
     */
    public String getBankNo() {
        return bankNo;
    }

    /**
     * @param bankNo
     */
    public void setBankNo(String bankNo) {
        this.bankNo = bankNo == null ? null : bankNo.trim();
    }

    /**
     * @return CREATE_DATE
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * @param createDate
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * @return APP_STATUS
     */
    public String getAppStatus() {
        return appStatus;
    }

    /**
     * @param appStatus
     */
    public void setAppStatus(String appStatus) {
        this.appStatus = appStatus == null ? null : appStatus.trim();
    }

    /**
     * @return ACCOUNT_NAME
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * @param accountName
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * @return ACCOUNT_NO
     */
    public String getAccountNo() {
        return accountNo;
    }

    /**
     * @param accountNo
     */
    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo == null ? null : accountNo.trim();
    }

    /**
     * @return CUSCC
     */
    public String getCuscc() {
        return cuscc;
    }

    /**
     * @param cuscc
     */
    public void setCuscc(String cuscc) {
        this.cuscc = cuscc == null ? null : cuscc.trim();
    }

    /**
     * @return BUSINESS_PLACE_CODE
     */
    public Long getBusinessPlaceCode() {
        return businessPlaceCode;
    }

    /**
     * @param businessPlaceCode
     */
    public void setBusinessPlaceCode(Long businessPlaceCode) {
        this.businessPlaceCode = businessPlaceCode;
    }

    /**
     * @return INVOICE_TYPE
     */
    public Short getInvoiceType() {
        return invoiceType;
    }

    /**
     * @param invoiceType
     */
    public void setInvoiceType(Short invoiceType) {
        this.invoiceType = invoiceType;
    }

    /**
     * @return INVOICE_PRINT_TYPE
     */
    public Short getInvoicePrintType() {
        return invoicePrintType;
    }

    /**
     * @param invoicePrintType
     */
    public void setInvoicePrintType(Short invoicePrintType) {
        this.invoicePrintType = invoicePrintType;
    }

    /**
     * @return OPENDING_BANK
     */
    public Short getOpendingBank() {
        return opendingBank;
    }

    /**
     * @param opendingBank
     */
    public void setOpendingBank(Short opendingBank) {
        this.opendingBank = opendingBank;
    }

    /**
     * @return ADDRESS
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * @return APPLY_MAN_ID
     */
    public Integer getApplyManId() {
        return applyManId;
    }

    /**
     * @param applyManId
     */
    public void setApplyManId(Integer applyManId) {
        this.applyManId = applyManId;
    }

    /**
     * @return APPLY_DATE
     */
    public Date getApplyDate() {
        return applyDate;
    }

    /**
     * @param applyDate
     */
    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
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
}