package com.bem.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_REFUND_PRE_MONEY_INFO")
public class AppRefundPreMoneyInfo {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 工作单号
     */
    @Column(name = "APP_ID")
    private String appId;

    /**
     * 环节id
     */
    @Column(name = "TASK_ID")
    private String taskId;

    /**
     * 结算户id
     */
    @Column(name = "SETTLEMENT_ID")
    private Long settlementId;

    /**
     * 结算户号
     */
    @Column(name = "SETTLEMENT_NO")
    private String settlementNo;

    /**
     * 结算户名称
     */
    @Column(name = "SETTLEMENT_NAME")
    private String settlementName;

    /**
     * 申请人id
     */
    @Column(name = "APPLY_MAN")
    private Integer applyMan;

    /**
     * 申请日期
     */
    @Column(name = "APPLY_DATE")
    private Date applyDate;

    /**
     * 经办人
     */
    @Column(name = "MAN_NAME")
    private String manName;

    /**
     * 经办人时间
     */
    @Column(name = "MAN_PHONE")
    private String manPhone;

    /**
     * 审批人id
     */
    @Column(name = "PASS_MAN")
    private Integer passMan;

    /**
     * 审批时间
     */
    @Column(name = "PASS_DATE")
    private Date passDate;

    /**
     * 审批结论
     */
    @Column(name = "PASS_OPTION")
    private Integer passOption;

    /**
     * 退费金额
     */
    @Column(name = "BACK_MONEY")
    private BigDecimal backMoney;

    /**
     * 退费类型
     */
    @Column(name = "BACK_TYPE")
    private Integer backType;

    /**
     * 退费原因
     */
    @Column(name = "BACK_REASON")
    private String backReason;

    /**
     * 实例号
     */
    @Column(name = "PROCESS_INSTANCE_ID")
    private Long processInstanceId;

    /**
     * 退款方式
     */
    @Column(name = "F_CHARGE_MODE")
    private Integer fChargeMode;

    /**
     *  账户实际余额
     */
    @Column(name = "PRE_CHARGE")
    private BigDecimal preCharge;

    /**
     * 是否缴费
     */
    @Column(name = "IS_PAY")
    private Integer isPay;

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
     * @return APP_ID - 工作单号
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置工作单号
     *
     * @param appId 工作单号
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
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
     * 获取结算户id
     *
     * @return SETTLEMENT_ID - 结算户id
     */
    public Long getSettlementId() {
        return settlementId;
    }

    /**
     * 设置结算户id
     *
     * @param settlementId 结算户id
     */
    public void setSettlementId(Long settlementId) {
        this.settlementId = settlementId;
    }

    /**
     * 获取结算户号
     *
     * @return SETTLEMENT_NO - 结算户号
     */
    public String getSettlementNo() {
        return settlementNo;
    }

    /**
     * 设置结算户号
     *
     * @param settlementNo 结算户号
     */
    public void setSettlementNo(String settlementNo) {
        this.settlementNo = settlementNo == null ? null : settlementNo.trim();
    }

    /**
     * 获取结算户名称
     *
     * @return SETTLEMENT_NAME - 结算户名称
     */
    public String getSettlementName() {
        return settlementName;
    }

    /**
     * 设置结算户名称
     *
     * @param settlementName 结算户名称
     */
    public void setSettlementName(String settlementName) {
        this.settlementName = settlementName == null ? null : settlementName.trim();
    }

    /**
     * 获取申请人id
     *
     * @return APPLY_MAN - 申请人id
     */
    public Integer getApplyMan() {
        return applyMan;
    }

    /**
     * 设置申请人id
     *
     * @param applyMan 申请人id
     */
    public void setApplyMan(Integer applyMan) {
        this.applyMan = applyMan;
    }

    /**
     * 获取申请日期
     *
     * @return APPLY_DATE - 申请日期
     */
    public Date getApplyDate() {
        return applyDate;
    }

    /**
     * 设置申请日期
     *
     * @param applyDate 申请日期
     */
    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * 获取经办人
     *
     * @return MAN_NAME - 经办人
     */
    public String getManName() {
        return manName;
    }

    /**
     * 设置经办人
     *
     * @param manName 经办人
     */
    public void setManName(String manName) {
        this.manName = manName == null ? null : manName.trim();
    }

    /**
     * 获取经办人时间
     *
     * @return MAN_PHONE - 经办人时间
     */
    public String getManPhone() {
        return manPhone;
    }

    /**
     * 设置经办人时间
     *
     * @param manPhone 经办人时间
     */
    public void setManPhone(String manPhone) {
        this.manPhone = manPhone == null ? null : manPhone.trim();
    }

    /**
     * 获取审批人id
     *
     * @return PASS_MAN - 审批人id
     */
    public Integer getPassMan() {
        return passMan;
    }

    /**
     * 设置审批人id
     *
     * @param passMan 审批人id
     */
    public void setPassMan(Integer passMan) {
        this.passMan = passMan;
    }

    /**
     * 获取审批时间
     *
     * @return PASS_DATE - 审批时间
     */
    public Date getPassDate() {
        return passDate;
    }

    /**
     * 设置审批时间
     *
     * @param passDate 审批时间
     */
    public void setPassDate(Date passDate) {
        this.passDate = passDate;
    }

    /**
     * 获取审批结论
     *
     * @return PASS_OPTION - 审批结论
     */
    public Integer getPassOption() {
        return passOption;
    }

    /**
     * 设置审批结论
     *
     * @param passOption 审批结论
     */
    public void setPassOption(Integer passOption) {
        this.passOption = passOption;
    }

    /**
     * 获取退费金额
     *
     * @return BACK_MONEY - 退费金额
     */
    public BigDecimal getBackMoney() {
        return backMoney;
    }

    /**
     * 设置退费金额
     *
     * @param backMoney 退费金额
     */
    public void setBackMoney(BigDecimal backMoney) {
        this.backMoney = backMoney;
    }

    /**
     * 获取退费类型
     *
     * @return BACK_TYPE - 退费类型
     */
    public Integer getBackType() {
        return backType;
    }

    /**
     * 设置退费类型
     *
     * @param backType 退费类型
     */
    public void setBackType(Integer backType) {
        this.backType = backType;
    }

    /**
     * 获取退费原因
     *
     * @return BACK_REASON - 退费原因
     */
    public String getBackReason() {
        return backReason;
    }

    /**
     * 设置退费原因
     *
     * @param backReason 退费原因
     */
    public void setBackReason(String backReason) {
        this.backReason = backReason == null ? null : backReason.trim();
    }

    /**
     * 获取实例号
     *
     * @return PROCESS_INSTANCE_ID - 实例号
     */
    public Long getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * 设置实例号
     *
     * @param processInstanceId 实例号
     */
    public void setProcessInstanceId(Long processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    /**
     * 获取退款方式
     *
     * @return F_CHARGE_MODE - 退款方式
     */
    public Integer getfChargeMode() {
        return fChargeMode;
    }

    /**
     * 设置退款方式
     *
     * @param fChargeMode 退款方式
     */
    public void setfChargeMode(Integer fChargeMode) {
        this.fChargeMode = fChargeMode;
    }

    /**
     * 获取 账户实际余额
     *
     * @return PRE_CHARGE -  账户实际余额
     */
    public BigDecimal getPreCharge() {
        return preCharge;
    }

    /**
     * 设置 账户实际余额
     *
     * @param preCharge  账户实际余额
     */
    public void setPreCharge(BigDecimal preCharge) {
        this.preCharge = preCharge;
    }

    /**
     * 获取是否缴费
     *
     * @return IS_PAY - 是否缴费
     */
    public Integer getIsPay() {
        return isPay;
    }

    /**
     * 设置是否缴费
     *
     * @param isPay 是否缴费
     */
    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }
}