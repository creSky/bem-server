package com.bem.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_POWER_RECALL")
public class AppPowerRecall {
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 工作单号
     */
    @Column(name = "APP_ID")
    private String appId;

    /**
     * 环节号
     */
    @Column(name = "TASK_ID")
    private Integer taskId;

    /**
     * 实例号
     */
    @Column(name = "PROCESS_INSTANCE_ID")
    private Long processInstanceId;

    /**
     * 客户编号
     */
    @Column(name = "USER_ID")
    private Long userId;

    /**
     * 客户编号
     */
    @Column(name = "USER_NO")
    private String userNo;

    /**
     * 客户名称
     */
    @Column(name = "USER_NAME")
    private String userName;

    @Column(name = "METER_ID")
    private Long meterId;

    @Column(name = "METER_NO")
    private String meterNo;

    /**
     * 表序号
     */
    @Column(name = "METER_ORDER")
    private Integer meterOrder;

    @Column(name = "METER_NAME")
    private String meterName;

    /**
     * 抄表区段号
     */
    @Column(name = "WRITE_SECTION_ID")
    private Integer writeSectionId;

    /**
     * 抄表区段号
     */
    @Column(name = "WRITE_SECT_NAME")
    private String writeSectName;

    /**
     * 资产编号
     */
    @Column(name = "METER_ASSETS_ID")
    private Long meterAssetsId;

    /**
     * 资产编号
     */
    @Column(name = "METER_ASSETS_NO")
    private String meterAssetsNo;

    /**
     * 功能代码
     */
    @Column(name = "FUNCTION_CODE")
    private Integer functionCode;

    /**
     * 退补原因
     */
    @Column(name = "REASON_CODE")
    private Integer reasonCode;

    /**
     * 退补的是哪个月的
     */
    @Column(name = "RP_MON")
    private Integer rpMon;

    /**
     * 应退补电量
     */
    @Column(name = "SHD_ADD_POWER")
    private BigDecimal shdAddPower;

    /**
     * Y参与变线损计算,N不参与变线损计算
     */
    @Column(name = "IS_LINELOST")
    private Integer isLinelost;

    /**
     * 分时标志
     */
    @Column(name = "TS_FLAG")
    private Integer tsFlag;

    /**
     * 是否参与力调计算
     */
    @Column(name = "IS_COS")
    private Integer isCos;

    /**
     * 如果是走工作单，则申请人、审批人等信息不用再记录
     */
    @Column(name = "APPLY_PERSON")
    private String applyPerson;

    /**
     * 申请日期
     */
    @Column(name = "APPLY_DATE")
    private Date applyDate;

    /**
     * 申请原因
     */
    @Column(name = "APPLY_REASON")
    private String applyReason;

    /**
     * 审批人
     */
    @Column(name = "PASS_PERSON")
    private String passPerson;

    /**
     * 审批日期
     */
    @Column(name = "PASS_DATE")
    private Date passDate;

    /**
     * 生效月份
     */
    @Column(name = "MON")
    private Integer mon;

    /**
     * 生效月份次数
     */
    @Column(name = "MON_SN")
    private Short monSn;

    @Column(name = "ACTIVE_WRITE_POWER_1")
    private BigDecimal activeWritePower1;

    @Column(name = "ACTIVE_WRITE_POWER_2")
    private BigDecimal activeWritePower2;

    @Column(name = "ACTIVE_WRITE_POWER_3")
    private BigDecimal activeWritePower3;

    @Column(name = "ACTIVE_WRITE_POWER_4")
    private BigDecimal activeWritePower4;

    /**
     * 功率方向
     */
    @Column(name = "POWER_DIRECTION")
    private Integer powerDirection;

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
     * 获取环节号
     *
     * @return TASK_ID - 环节号
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * 设置环节号
     *
     * @param taskId 环节号
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
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
     * 获取客户编号
     *
     * @return USER_ID - 客户编号
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置客户编号
     *
     * @param userId 客户编号
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取客户编号
     *
     * @return USER_NO - 客户编号
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * 设置客户编号
     *
     * @param userNo 客户编号
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    /**
     * 获取客户名称
     *
     * @return USER_NAME - 客户名称
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置客户名称
     *
     * @param userName 客户名称
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * @return METER_ID
     */
    public Long getMeterId() {
        return meterId;
    }

    /**
     * @param meterId
     */
    public void setMeterId(Long meterId) {
        this.meterId = meterId;
    }

    /**
     * @return METER_NO
     */
    public String getMeterNo() {
        return meterNo;
    }

    /**
     * @param meterNo
     */
    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo == null ? null : meterNo.trim();
    }

    /**
     * 获取表序号
     *
     * @return METER_ORDER - 表序号
     */
    public Integer getMeterOrder() {
        return meterOrder;
    }

    /**
     * 设置表序号
     *
     * @param meterOrder 表序号
     */
    public void setMeterOrder(Integer meterOrder) {
        this.meterOrder = meterOrder;
    }

    /**
     * @return METER_NAME
     */
    public String getMeterName() {
        return meterName;
    }

    /**
     * @param meterName
     */
    public void setMeterName(String meterName) {
        this.meterName = meterName == null ? null : meterName.trim();
    }

    /**
     * 获取抄表区段号
     *
     * @return WRITE_SECTION_ID - 抄表区段号
     */
    public Integer getWriteSectionId() {
        return writeSectionId;
    }

    /**
     * 设置抄表区段号
     *
     * @param writeSectionId 抄表区段号
     */
    public void setWriteSectionId(Integer writeSectionId) {
        this.writeSectionId = writeSectionId;
    }

    /**
     * 获取抄表区段号
     *
     * @return WRITE_SECT_NAME - 抄表区段号
     */
    public String getWriteSectName() {
        return writeSectName;
    }

    /**
     * 设置抄表区段号
     *
     * @param writeSectName 抄表区段号
     */
    public void setWriteSectName(String writeSectName) {
        this.writeSectName = writeSectName == null ? null : writeSectName.trim();
    }

    /**
     * 获取资产编号
     *
     * @return METER_ASSETS_ID - 资产编号
     */
    public Long getMeterAssetsId() {
        return meterAssetsId;
    }

    /**
     * 设置资产编号
     *
     * @param meterAssetsId 资产编号
     */
    public void setMeterAssetsId(Long meterAssetsId) {
        this.meterAssetsId = meterAssetsId;
    }

    /**
     * 获取资产编号
     *
     * @return METER_ASSETS_NO - 资产编号
     */
    public String getMeterAssetsNo() {
        return meterAssetsNo;
    }

    /**
     * 设置资产编号
     *
     * @param meterAssetsNo 资产编号
     */
    public void setMeterAssetsNo(String meterAssetsNo) {
        this.meterAssetsNo = meterAssetsNo == null ? null : meterAssetsNo.trim();
    }

    /**
     * 获取功能代码
     *
     * @return FUNCTION_CODE - 功能代码
     */
    public Integer getFunctionCode() {
        return functionCode;
    }

    /**
     * 设置功能代码
     *
     * @param functionCode 功能代码
     */
    public void setFunctionCode(Integer functionCode) {
        this.functionCode = functionCode;
    }

    /**
     * 获取退补原因
     *
     * @return REASON_CODE - 退补原因
     */
    public Integer getReasonCode() {
        return reasonCode;
    }

    /**
     * 设置退补原因
     *
     * @param reasonCode 退补原因
     */
    public void setReasonCode(Integer reasonCode) {
        this.reasonCode = reasonCode;
    }

    /**
     * 获取退补的是哪个月的
     *
     * @return RP_MON - 退补的是哪个月的
     */
    public Integer getRpMon() {
        return rpMon;
    }

    /**
     * 设置退补的是哪个月的
     *
     * @param rpMon 退补的是哪个月的
     */
    public void setRpMon(Integer rpMon) {
        this.rpMon = rpMon;
    }

    /**
     * 获取应退补电量
     *
     * @return SHD_ADD_POWER - 应退补电量
     */
    public BigDecimal getShdAddPower() {
        return shdAddPower;
    }

    /**
     * 设置应退补电量
     *
     * @param shdAddPower 应退补电量
     */
    public void setShdAddPower(BigDecimal shdAddPower) {
        this.shdAddPower = shdAddPower;
    }

    /**
     * 获取Y参与变线损计算,N不参与变线损计算
     *
     * @return IS_LINELOST - Y参与变线损计算,N不参与变线损计算
     */
    public Integer getIsLinelost() {
        return isLinelost;
    }

    /**
     * 设置Y参与变线损计算,N不参与变线损计算
     *
     * @param isLinelost Y参与变线损计算,N不参与变线损计算
     */
    public void setIsLinelost(Integer isLinelost) {
        this.isLinelost = isLinelost;
    }

    /**
     * 获取分时标志
     *
     * @return TS_FLAG - 分时标志
     */
    public Integer getTsFlag() {
        return tsFlag;
    }

    /**
     * 设置分时标志
     *
     * @param tsFlag 分时标志
     */
    public void setTsFlag(Integer tsFlag) {
        this.tsFlag = tsFlag;
    }

    /**
     * 获取是否参与力调计算
     *
     * @return IS_COS - 是否参与力调计算
     */
    public Integer getIsCos() {
        return isCos;
    }

    /**
     * 设置是否参与力调计算
     *
     * @param isCos 是否参与力调计算
     */
    public void setIsCos(Integer isCos) {
        this.isCos = isCos;
    }

    /**
     * 获取如果是走工作单，则申请人、审批人等信息不用再记录
     *
     * @return APPLY_PERSON - 如果是走工作单，则申请人、审批人等信息不用再记录
     */
    public String getApplyPerson() {
        return applyPerson;
    }

    /**
     * 设置如果是走工作单，则申请人、审批人等信息不用再记录
     *
     * @param applyPerson 如果是走工作单，则申请人、审批人等信息不用再记录
     */
    public void setApplyPerson(String applyPerson) {
        this.applyPerson = applyPerson == null ? null : applyPerson.trim();
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
     * 获取申请原因
     *
     * @return APPLY_REASON - 申请原因
     */
    public String getApplyReason() {
        return applyReason;
    }

    /**
     * 设置申请原因
     *
     * @param applyReason 申请原因
     */
    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason == null ? null : applyReason.trim();
    }

    /**
     * 获取审批人
     *
     * @return PASS_PERSON - 审批人
     */
    public String getPassPerson() {
        return passPerson;
    }

    /**
     * 设置审批人
     *
     * @param passPerson 审批人
     */
    public void setPassPerson(String passPerson) {
        this.passPerson = passPerson == null ? null : passPerson.trim();
    }

    /**
     * 获取审批日期
     *
     * @return PASS_DATE - 审批日期
     */
    public Date getPassDate() {
        return passDate;
    }

    /**
     * 设置审批日期
     *
     * @param passDate 审批日期
     */
    public void setPassDate(Date passDate) {
        this.passDate = passDate;
    }

    /**
     * 获取生效月份
     *
     * @return MON - 生效月份
     */
    public Integer getMon() {
        return mon;
    }

    /**
     * 设置生效月份
     *
     * @param mon 生效月份
     */
    public void setMon(Integer mon) {
        this.mon = mon;
    }

    /**
     * 获取生效月份次数
     *
     * @return MON_SN - 生效月份次数
     */
    public Short getMonSn() {
        return monSn;
    }

    /**
     * 设置生效月份次数
     *
     * @param monSn 生效月份次数
     */
    public void setMonSn(Short monSn) {
        this.monSn = monSn;
    }

    /**
     * @return ACTIVE_WRITE_POWER_1
     */
    public BigDecimal getActiveWritePower1() {
        return activeWritePower1;
    }

    /**
     * @param activeWritePower1
     */
    public void setActiveWritePower1(BigDecimal activeWritePower1) {
        this.activeWritePower1 = activeWritePower1;
    }

    /**
     * @return ACTIVE_WRITE_POWER_2
     */
    public BigDecimal getActiveWritePower2() {
        return activeWritePower2;
    }

    /**
     * @param activeWritePower2
     */
    public void setActiveWritePower2(BigDecimal activeWritePower2) {
        this.activeWritePower2 = activeWritePower2;
    }

    /**
     * @return ACTIVE_WRITE_POWER_3
     */
    public BigDecimal getActiveWritePower3() {
        return activeWritePower3;
    }

    /**
     * @param activeWritePower3
     */
    public void setActiveWritePower3(BigDecimal activeWritePower3) {
        this.activeWritePower3 = activeWritePower3;
    }

    /**
     * @return ACTIVE_WRITE_POWER_4
     */
    public BigDecimal getActiveWritePower4() {
        return activeWritePower4;
    }

    /**
     * @param activeWritePower4
     */
    public void setActiveWritePower4(BigDecimal activeWritePower4) {
        this.activeWritePower4 = activeWritePower4;
    }

    /**
     * 获取功率方向
     *
     * @return POWER_DIRECTION - 功率方向
     */
    public Integer getPowerDirection() {
        return powerDirection;
    }

    /**
     * 设置功率方向
     *
     * @param powerDirection 功率方向
     */
    public void setPowerDirection(Integer powerDirection) {
        this.powerDirection = powerDirection;
    }
}