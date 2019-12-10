package com.bem.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_METER_INFO")
public class AppMeterInfo {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 计量点id
     */
    @Column(name = "METER_ID")
    private Long meterId;

    /**
     * 工作单号
     */
    @Column(name = "APP_ID")
    private Long appId;

    /**
     * 计量点号
     */
    @Column(name = "METER_NO")
    private String meterNo;

    /**
     * 计量点名称
     */
    @Column(name = "METER_NAME")
    private String meterName;

    /**
     * 安装地点
     */
    @Column(name = "SET_ADDRESS")
    private String setAddress;

    /**
     * 电价
     */
    @Column(name = "PRICE_TYPE")
    private Short priceType;

    /**
     * 需量定值
     */
    @Column(name = "NEED_INDEX")
    private Integer needIndex;

    /**
     * 计量点电压
     */
    @Column(name = "VOLT_LEVEL_TYPE")
    private Short voltLevelType;

    /**
     * 计量点类别
     */
    @Column(name = "METER_TYPE")
    private Short meterType;

    /**
     * 计量点分类
     */
    @Column(name = "METER_CLASS_TYPE")
    private Short meterClassType;

    /**
     * 计量方式
     */
    @Column(name = "MS_TYPE")
    private Short msType;

    /**
     * 用电类别
     */
    @Column(name = "ELEC_TYPE_CODE")
    private Short elecTypeCode;

    /**
     * 基本电费计算方法
     */
    @Column(name = "BASE_MONEY_FLAG")
    private Short baseMoneyFlag;

    /**
     * 力率标准
     */
    @Column(name = "COS_TYPE")
    private Short cosType;

    /**
     * 行业用电分类
     */
    @Column(name = "TRADE_TYPE")
    private Short tradeType;

    /**
     * 分时计费标准
     */
    @Column(name = "TS_TYPE")
    private Short tsType;

    /**
     * 变损分摊方式
     */
    @Column(name = "TRANS_LOST_TYPE")
    private Short transLostType;

    /**
     * 变损率or变损值
     */
    @Column(name = "TRANS_LOST_NUM")
    private BigDecimal transLostNum;

    /**
     * 无功变损率or值
     */
    @Column(name = "Q_TRANS_LOST_NUM")
    private BigDecimal qTransLostNum;

    /**
     * 线损计算方法
     */
    @Column(name = "LINE_LOST_TYPE")
    private Short lineLostType;

    /**
     * 线损率or线损值
     */
    @Column(name = "LINE_LOST_NUM")
    private BigDecimal lineLostNum;

    /**
     * 无功线损率or值
     */
    @Column(name = "Q_LINE_LOST_NUM")
    private BigDecimal qLineLostNum;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    @Column(name = "STATUS")
    private Short status;

    /**
     * 变压器资产编号
     */
    @Column(name = "TRANS_ASSETS_NO")
    private String transAssetsNo;

    @Column(name = "WRITE_SECTION_ID")
    private Long writeSectionId;

    /**
     * 抄表区段名称
     */
    @Column(name = "WRITE_SECT_NAME")
    private String writeSectName;

    /**
     * 户号
     */
    @Column(name = "USER_NO")
    private String userNo;

    @Column(name = "USER_ID")
    private Long userId;

    /**
     * 计量点序号
     */
    @Column(name = "METER_ORDER")
    private Integer meterOrder;

    /**
     * 算费次数
     */
    @Column(name = "COUNT_TIMES")
    private Integer countTimes;

    /**
     * 停电标识
     */
    @Column(name = "POWER_CUT_FLAG")
    private Short powerCutFlag;

    /**
     * 抄表方式
     */
    @Column(name = "WRITE_METHOD")
    private Short writeMethod;

    /**
     * 基本电价代码
     */
    @Column(name = "BASIC_PRICE")
    private Short basicPrice;

    /**
     * 计费容量
     */
    @Column(name = "CHARGING_CAPACITY")
    private BigDecimal chargingCapacity;

    /**
     * 环节号
     */
    @Column(name = "TASK_ID")
    private Long taskId;

    @Transient
    private Integer templateId;

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

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
     * 获取计量点id
     *
     * @return METER_ID - 计量点id
     */
    public Long getMeterId() {
        return meterId;
    }

    /**
     * 设置计量点id
     *
     * @param meterId 计量点id
     */
    public void setMeterId(Long meterId) {
        this.meterId = meterId;
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
     * 获取计量点号
     *
     * @return METER_NO - 计量点号
     */
    public String getMeterNo() {
        return meterNo;
    }

    /**
     * 设置计量点号
     *
     * @param meterNo 计量点号
     */
    public void setMeterNo(String meterNo) {
        this.meterNo = meterNo == null ? null : meterNo.trim();
    }

    /**
     * 获取计量点名称
     *
     * @return METER_NAME - 计量点名称
     */
    public String getMeterName() {
        return meterName;
    }

    /**
     * 设置计量点名称
     *
     * @param meterName 计量点名称
     */
    public void setMeterName(String meterName) {
        this.meterName = meterName == null ? null : meterName.trim();
    }

    /**
     * 获取安装地点
     *
     * @return SET_ADDRESS - 安装地点
     */
    public String getSetAddress() {
        return setAddress;
    }

    /**
     * 设置安装地点
     *
     * @param setAddress 安装地点
     */
    public void setSetAddress(String setAddress) {
        this.setAddress = setAddress == null ? null : setAddress.trim();
    }

    /**
     * 获取电价
     *
     * @return PRICE_TYPE - 电价
     */
    public Short getPriceType() {
        return priceType;
    }

    /**
     * 设置电价
     *
     * @param priceType 电价
     */
    public void setPriceType(Short priceType) {
        this.priceType = priceType;
    }

    /**
     * 获取需量定值
     *
     * @return NEED_INDEX - 需量定值
     */
    public Integer getNeedIndex() {
        return needIndex;
    }

    /**
     * 设置需量定值
     *
     * @param needIndex 需量定值
     */
    public void setNeedIndex(Integer needIndex) {
        this.needIndex = needIndex;
    }

    /**
     * 获取计量点电压
     *
     * @return VOLT_LEVEL_TYPE - 计量点电压
     */
    public Short getVoltLevelType() {
        return voltLevelType;
    }

    /**
     * 设置计量点电压
     *
     * @param voltLevelType 计量点电压
     */
    public void setVoltLevelType(Short voltLevelType) {
        this.voltLevelType = voltLevelType;
    }

    /**
     * 获取计量点类别
     *
     * @return METER_TYPE - 计量点类别
     */
    public Short getMeterType() {
        return meterType;
    }

    /**
     * 设置计量点类别
     *
     * @param meterType 计量点类别
     */
    public void setMeterType(Short meterType) {
        this.meterType = meterType;
    }

    /**
     * 获取计量点分类
     *
     * @return METER_CLASS_TYPE - 计量点分类
     */
    public Short getMeterClassType() {
        return meterClassType;
    }

    /**
     * 设置计量点分类
     *
     * @param meterClassType 计量点分类
     */
    public void setMeterClassType(Short meterClassType) {
        this.meterClassType = meterClassType;
    }

    /**
     * 获取计量方式
     *
     * @return MS_TYPE - 计量方式
     */
    public Short getMsType() {
        return msType;
    }

    /**
     * 设置计量方式
     *
     * @param msType 计量方式
     */
    public void setMsType(Short msType) {
        this.msType = msType;
    }

    /**
     * 获取用电类别
     *
     * @return ELEC_TYPE_CODE - 用电类别
     */
    public Short getElecTypeCode() {
        return elecTypeCode;
    }

    /**
     * 设置用电类别
     *
     * @param elecTypeCode 用电类别
     */
    public void setElecTypeCode(Short elecTypeCode) {
        this.elecTypeCode = elecTypeCode;
    }

    /**
     * 获取基本电费计算方法
     *
     * @return BASE_MONEY_FLAG - 基本电费计算方法
     */
    public Short getBaseMoneyFlag() {
        return baseMoneyFlag;
    }

    /**
     * 设置基本电费计算方法
     *
     * @param baseMoneyFlag 基本电费计算方法
     */
    public void setBaseMoneyFlag(Short baseMoneyFlag) {
        this.baseMoneyFlag = baseMoneyFlag;
    }

    /**
     * 获取力率标准
     *
     * @return COS_TYPE - 力率标准
     */
    public Short getCosType() {
        return cosType;
    }

    /**
     * 设置力率标准
     *
     * @param cosType 力率标准
     */
    public void setCosType(Short cosType) {
        this.cosType = cosType;
    }

    /**
     * 获取行业用电分类
     *
     * @return TRADE_TYPE - 行业用电分类
     */
    public Short getTradeType() {
        return tradeType;
    }

    /**
     * 设置行业用电分类
     *
     * @param tradeType 行业用电分类
     */
    public void setTradeType(Short tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * 获取分时计费标准
     *
     * @return TS_TYPE - 分时计费标准
     */
    public Short getTsType() {
        return tsType;
    }

    /**
     * 设置分时计费标准
     *
     * @param tsType 分时计费标准
     */
    public void setTsType(Short tsType) {
        this.tsType = tsType;
    }

    /**
     * 获取变损分摊方式
     *
     * @return TRANS_LOST_TYPE - 变损分摊方式
     */
    public Short getTransLostType() {
        return transLostType;
    }

    /**
     * 设置变损分摊方式
     *
     * @param transLostType 变损分摊方式
     */
    public void setTransLostType(Short transLostType) {
        this.transLostType = transLostType;
    }

    /**
     * 获取变损率or变损值
     *
     * @return TRANS_LOST_NUM - 变损率or变损值
     */
    public BigDecimal getTransLostNum() {
        return transLostNum;
    }

    /**
     * 设置变损率or变损值
     *
     * @param transLostNum 变损率or变损值
     */
    public void setTransLostNum(BigDecimal transLostNum) {
        this.transLostNum = transLostNum;
    }

    /**
     * 获取无功变损率or值
     *
     * @return Q_TRANS_LOST_NUM - 无功变损率or值
     */
    public BigDecimal getqTransLostNum() {
        return qTransLostNum;
    }

    /**
     * 设置无功变损率or值
     *
     * @param qTransLostNum 无功变损率or值
     */
    public void setqTransLostNum(BigDecimal qTransLostNum) {
        this.qTransLostNum = qTransLostNum;
    }

    /**
     * 获取线损计算方法
     *
     * @return LINE_LOST_TYPE - 线损计算方法
     */
    public Short getLineLostType() {
        return lineLostType;
    }

    /**
     * 设置线损计算方法
     *
     * @param lineLostType 线损计算方法
     */
    public void setLineLostType(Short lineLostType) {
        this.lineLostType = lineLostType;
    }

    /**
     * 获取线损率or线损值
     *
     * @return LINE_LOST_NUM - 线损率or线损值
     */
    public BigDecimal getLineLostNum() {
        return lineLostNum;
    }

    /**
     * 设置线损率or线损值
     *
     * @param lineLostNum 线损率or线损值
     */
    public void setLineLostNum(BigDecimal lineLostNum) {
        this.lineLostNum = lineLostNum;
    }

    /**
     * 获取无功线损率or值
     *
     * @return Q_LINE_LOST_NUM - 无功线损率or值
     */
    public BigDecimal getqLineLostNum() {
        return qLineLostNum;
    }

    /**
     * 设置无功线损率or值
     *
     * @param qLineLostNum 无功线损率or值
     */
    public void setqLineLostNum(BigDecimal qLineLostNum) {
        this.qLineLostNum = qLineLostNum;
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
     * 获取变压器资产编号
     *
     * @return TRANS_ASSETS_NO - 变压器资产编号
     */
    public String getTransAssetsNo() {
        return transAssetsNo;
    }

    /**
     * 设置变压器资产编号
     *
     * @param transAssetsNo 变压器资产编号
     */
    public void setTransAssetsNo(String transAssetsNo) {
        this.transAssetsNo = transAssetsNo == null ? null : transAssetsNo.trim();
    }

    /**
     * @return WRITE_SECTION_ID
     */
    public Long getWriteSectionId() {
        return writeSectionId;
    }

    /**
     * @param writeSectionId
     */
    public void setWriteSectionId(Long writeSectionId) {
        this.writeSectionId = writeSectionId;
    }

    /**
     * 获取抄表区段名称
     *
     * @return WRITE_SECT_NAME - 抄表区段名称
     */
    public String getWriteSectName() {
        return writeSectName;
    }

    /**
     * 设置抄表区段名称
     *
     * @param writeSectName 抄表区段名称
     */
    public void setWriteSectName(String writeSectName) {
        this.writeSectName = writeSectName == null ? null : writeSectName.trim();
    }

    /**
     * 获取户号
     *
     * @return USER_NO - 户号
     */
    public String getUserNo() {
        return userNo;
    }

    /**
     * 设置户号
     *
     * @param userNo 户号
     */
    public void setUserNo(String userNo) {
        this.userNo = userNo == null ? null : userNo.trim();
    }

    /**
     * @return USER_ID
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取计量点序号
     *
     * @return METER_ORDER - 计量点序号
     */
    public Integer getMeterOrder() {
        return meterOrder;
    }

    /**
     * 设置计量点序号
     *
     * @param meterOrder 计量点序号
     */
    public void setMeterOrder(Integer meterOrder) {
        this.meterOrder = meterOrder;
    }

    /**
     * 获取算费次数
     *
     * @return COUNT_TIMES - 算费次数
     */
    public Integer getCountTimes() {
        return countTimes;
    }

    /**
     * 设置算费次数
     *
     * @param countTimes 算费次数
     */
    public void setCountTimes(Integer countTimes) {
        this.countTimes = countTimes;
    }

    /**
     * 获取停电标识
     *
     * @return POWER_CUT_FLAG - 停电标识
     */
    public Short getPowerCutFlag() {
        return powerCutFlag;
    }

    /**
     * 设置停电标识
     *
     * @param powerCutFlag 停电标识
     */
    public void setPowerCutFlag(Short powerCutFlag) {
        this.powerCutFlag = powerCutFlag;
    }

    /**
     * 获取抄表方式
     *
     * @return WRITE_METHOD - 抄表方式
     */
    public Short getWriteMethod() {
        return writeMethod;
    }

    /**
     * 设置抄表方式
     *
     * @param writeMethod 抄表方式
     */
    public void setWriteMethod(Short writeMethod) {
        this.writeMethod = writeMethod;
    }

    /**
     * 获取基本电价代码
     *
     * @return BASIC_PRICE - 基本电价代码
     */
    public Short getBasicPrice() {
        return basicPrice;
    }

    /**
     * 设置基本电价代码
     *
     * @param basicPrice 基本电价代码
     */
    public void setBasicPrice(Short basicPrice) {
        this.basicPrice = basicPrice;
    }

    /**
     * 获取计费容量
     *
     * @return CHARGING_CAPACITY - 计费容量
     */
    public BigDecimal getChargingCapacity() {
        return chargingCapacity;
    }

    /**
     * 设置计费容量
     *
     * @param chargingCapacity 计费容量
     */
    public void setChargingCapacity(BigDecimal chargingCapacity) {
        this.chargingCapacity = chargingCapacity;
    }

    /**
     * 获取环节号
     *
     * @return TASK_ID - 环节号
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * 设置环节号
     *
     * @param taskId 环节号
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }
}