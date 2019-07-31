package com.bem.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "METER_INFO")
public class MeterInfo {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "METER_NO")
    private String meterNo;

    @Column(name = "METER_NAME")
    private String meterName;

    @Column(name = "METER_ORDER")
    private Integer meterOrder;

    @Column(name = "METER_ASSETS_ID")
    private Long meterAssetsId;

    /**
     * 安装地点
     */
    @Column(name = "SET_ADDRESS")
    private String setAddress;

    @Column(name = "CT_ASSETS_ID")
    private Long ctAssetsId;

    @Column(name = "PT_ASSETS_ID")
    private Long ptAssetsId;

    /**
     * CT变比
     */
    @Column(name = "CT_VALUE")
    private String ctValue;

    /**
     * PT变比
     */
    @Column(name = "PT_VALUE")
    private String ptValue;

    /**
     * 电价编码
     */
    @Column(name = "PRICE_TYPE")
    private Short priceType;

    /**
     * 需量定值
     */
    @Column(name = "NEED_INDEX")
    private Integer needIndex;

    /**
     * 计量电压
     */
    @Column(name = "VOLT_LEVEL_TYPE")
    private Short voltLevelType;

    /**
     * 计费表
            考核表
            定量表
            定比表
     */
    @Column(name = "METER_TYPE")
    private Short meterType;

    /**
     * 一类用户
            二类用户
            三类用户
            根据电压区分等
     */
    @Column(name = "METER_CLASS_TYPE")
    private Short meterClassType;

    /**
     * 一般工商业
            大工业
            居民生活
     */
    @Column(name = "ELEC_TYPE_CODE")
    private Short elecTypeCode;

    /**
     * 基本电费计算方法:0不计算;1按最大需量计算;2按容量计算;8按容量计算(化肥)
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
     * 分时计费标志
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

    @Column(name = "TG_ID")
    private Long tgId;

    @Column(name = "LINE_ID")
    private Long lineId;

    @Column(name = "SUBS_ID")
    private Long subsId;

    @Column(name = "USER_ID")
    private Long userId;

    @Column(name = "TRANSFORMER_ID")
    private Long transformerId;

    @Column(name = "SETTLEMENT_ID")
    private Long settlementId;

    @Column(name = "WRITE_SECTION_ID")
    private Long writeSectionId;

    /**
     * 保电标识
     */
    @Column(name = "KEEP_POWER_FLAG")
    private Short keepPowerFlag;

    /**
     * 扒房标识
     */
    @Column(name = "DEMOLITION_FLAG")
    private Short demolitionFlag;

    /**
     * 扒房日期
     */
    @Column(name = "DEMOLITION_DATE")
    private Date demolitionDate;

    /**
     * 发票打印标识
     */
    @Column(name = "BILL_FLAG")
    private Short billFlag;

    /**
     * 滞纳金标识
     */
    @Column(name = "OVERDUE_FINE_FLAG")
    private Short overdueFineFlag;

    /**
     * 阶梯电价标识
     */
    @Column(name = "TIERED_PRICE_FLAG")
    private Short tieredPriceFlag;

    @Column(name = "WRITE_METHOD")
    private Short writeMethod;

    @Column(name = "RATE_FLAG")
    private Short rateFlag;

    @Column(name = "POWER_CUT_FLAG")
    private Short powerCutFlag;

    /**
     * 相序
     */
    @Column(name = "PHASE_SEQ")
    private Short phaseSeq;

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
     * @return METER_ORDER
     */
    public Integer getMeterOrder() {
        return meterOrder;
    }

    /**
     * @param meterOrder
     */
    public void setMeterOrder(Integer meterOrder) {
        this.meterOrder = meterOrder;
    }

    /**
     * @return METER_ASSETS_ID
     */
    public Long getMeterAssetsId() {
        return meterAssetsId;
    }

    /**
     * @param meterAssetsId
     */
    public void setMeterAssetsId(Long meterAssetsId) {
        this.meterAssetsId = meterAssetsId;
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
     * @return CT_ASSETS_ID
     */
    public Long getCtAssetsId() {
        return ctAssetsId;
    }

    /**
     * @param ctAssetsId
     */
    public void setCtAssetsId(Long ctAssetsId) {
        this.ctAssetsId = ctAssetsId;
    }

    /**
     * @return PT_ASSETS_ID
     */
    public Long getPtAssetsId() {
        return ptAssetsId;
    }

    /**
     * @param ptAssetsId
     */
    public void setPtAssetsId(Long ptAssetsId) {
        this.ptAssetsId = ptAssetsId;
    }

    /**
     * 获取CT变比
     *
     * @return CT_VALUE - CT变比
     */
    public String getCtValue() {
        return ctValue;
    }

    /**
     * 设置CT变比
     *
     * @param ctValue CT变比
     */
    public void setCtValue(String ctValue) {
        this.ctValue = ctValue == null ? null : ctValue.trim();
    }

    /**
     * 获取PT变比
     *
     * @return PT_VALUE - PT变比
     */
    public String getPtValue() {
        return ptValue;
    }

    /**
     * 设置PT变比
     *
     * @param ptValue PT变比
     */
    public void setPtValue(String ptValue) {
        this.ptValue = ptValue == null ? null : ptValue.trim();
    }

    /**
     * 获取电价编码
     *
     * @return PRICE_TYPE - 电价编码
     */
    public Short getPriceType() {
        return priceType;
    }

    /**
     * 设置电价编码
     *
     * @param priceType 电价编码
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
     * 获取计量电压
     *
     * @return VOLT_LEVEL_TYPE - 计量电压
     */
    public Short getVoltLevelType() {
        return voltLevelType;
    }

    /**
     * 设置计量电压
     *
     * @param voltLevelType 计量电压
     */
    public void setVoltLevelType(Short voltLevelType) {
        this.voltLevelType = voltLevelType;
    }

    /**
     * 获取计费表
            考核表
            定量表
            定比表
     *
     * @return METER_TYPE - 计费表
            考核表
            定量表
            定比表
     */
    public Short getMeterType() {
        return meterType;
    }

    /**
     * 设置计费表
            考核表
            定量表
            定比表
     *
     * @param meterType 计费表
            考核表
            定量表
            定比表
     */
    public void setMeterType(Short meterType) {
        this.meterType = meterType;
    }

    /**
     * 获取一类用户
            二类用户
            三类用户
            根据电压区分等
     *
     * @return METER_CLASS_TYPE - 一类用户
            二类用户
            三类用户
            根据电压区分等
     */
    public Short getMeterClassType() {
        return meterClassType;
    }

    /**
     * 设置一类用户
            二类用户
            三类用户
            根据电压区分等
     *
     * @param meterClassType 一类用户
            二类用户
            三类用户
            根据电压区分等
     */
    public void setMeterClassType(Short meterClassType) {
        this.meterClassType = meterClassType;
    }

    /**
     * 获取一般工商业
            大工业
            居民生活
     *
     * @return ELEC_TYPE_CODE - 一般工商业
            大工业
            居民生活
     */
    public Short getElecTypeCode() {
        return elecTypeCode;
    }

    /**
     * 设置一般工商业
            大工业
            居民生活
     *
     * @param elecTypeCode 一般工商业
            大工业
            居民生活
     */
    public void setElecTypeCode(Short elecTypeCode) {
        this.elecTypeCode = elecTypeCode;
    }

    /**
     * 获取基本电费计算方法:0不计算;1按最大需量计算;2按容量计算;8按容量计算(化肥)
     *
     * @return BASE_MONEY_FLAG - 基本电费计算方法:0不计算;1按最大需量计算;2按容量计算;8按容量计算(化肥)
     */
    public Short getBaseMoneyFlag() {
        return baseMoneyFlag;
    }

    /**
     * 设置基本电费计算方法:0不计算;1按最大需量计算;2按容量计算;8按容量计算(化肥)
     *
     * @param baseMoneyFlag 基本电费计算方法:0不计算;1按最大需量计算;2按容量计算;8按容量计算(化肥)
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
     * 获取分时计费标志
     *
     * @return TS_TYPE - 分时计费标志
     */
    public Short getTsType() {
        return tsType;
    }

    /**
     * 设置分时计费标志
     *
     * @param tsType 分时计费标志
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
     * @return TG_ID
     */
    public Long getTgId() {
        return tgId;
    }

    /**
     * @param tgId
     */
    public void setTgId(Long tgId) {
        this.tgId = tgId;
    }

    /**
     * @return LINE_ID
     */
    public Long getLineId() {
        return lineId;
    }

    /**
     * @param lineId
     */
    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    /**
     * @return SUBS_ID
     */
    public Long getSubsId() {
        return subsId;
    }

    /**
     * @param subsId
     */
    public void setSubsId(Long subsId) {
        this.subsId = subsId;
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
     * @return TRANSFORMER_ID
     */
    public Long getTransformerId() {
        return transformerId;
    }

    /**
     * @param transformerId
     */
    public void setTransformerId(Long transformerId) {
        this.transformerId = transformerId;
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
     * 获取保电标识
     *
     * @return KEEP_POWER_FLAG - 保电标识
     */
    public Short getKeepPowerFlag() {
        return keepPowerFlag;
    }

    /**
     * 设置保电标识
     *
     * @param keepPowerFlag 保电标识
     */
    public void setKeepPowerFlag(Short keepPowerFlag) {
        this.keepPowerFlag = keepPowerFlag;
    }

    /**
     * 获取扒房标识
     *
     * @return DEMOLITION_FLAG - 扒房标识
     */
    public Short getDemolitionFlag() {
        return demolitionFlag;
    }

    /**
     * 设置扒房标识
     *
     * @param demolitionFlag 扒房标识
     */
    public void setDemolitionFlag(Short demolitionFlag) {
        this.demolitionFlag = demolitionFlag;
    }

    /**
     * 获取扒房日期
     *
     * @return DEMOLITION_DATE - 扒房日期
     */
    public Date getDemolitionDate() {
        return demolitionDate;
    }

    /**
     * 设置扒房日期
     *
     * @param demolitionDate 扒房日期
     */
    public void setDemolitionDate(Date demolitionDate) {
        this.demolitionDate = demolitionDate;
    }

    /**
     * 获取发票打印标识
     *
     * @return BILL_FLAG - 发票打印标识
     */
    public Short getBillFlag() {
        return billFlag;
    }

    /**
     * 设置发票打印标识
     *
     * @param billFlag 发票打印标识
     */
    public void setBillFlag(Short billFlag) {
        this.billFlag = billFlag;
    }

    /**
     * 获取滞纳金标识
     *
     * @return OVERDUE_FINE_FLAG - 滞纳金标识
     */
    public Short getOverdueFineFlag() {
        return overdueFineFlag;
    }

    /**
     * 设置滞纳金标识
     *
     * @param overdueFineFlag 滞纳金标识
     */
    public void setOverdueFineFlag(Short overdueFineFlag) {
        this.overdueFineFlag = overdueFineFlag;
    }

    /**
     * 获取阶梯电价标识
     *
     * @return TIERED_PRICE_FLAG - 阶梯电价标识
     */
    public Short getTieredPriceFlag() {
        return tieredPriceFlag;
    }

    /**
     * 设置阶梯电价标识
     *
     * @param tieredPriceFlag 阶梯电价标识
     */
    public void setTieredPriceFlag(Short tieredPriceFlag) {
        this.tieredPriceFlag = tieredPriceFlag;
    }

    /**
     * @return WRITE_METHOD
     */
    public Short getWriteMethod() {
        return writeMethod;
    }

    /**
     * @param writeMethod
     */
    public void setWriteMethod(Short writeMethod) {
        this.writeMethod = writeMethod;
    }

    /**
     * @return RATE_FLAG
     */
    public Short getRateFlag() {
        return rateFlag;
    }

    /**
     * @param rateFlag
     */
    public void setRateFlag(Short rateFlag) {
        this.rateFlag = rateFlag;
    }

    /**
     * @return POWER_CUT_FLAG
     */
    public Short getPowerCutFlag() {
        return powerCutFlag;
    }

    /**
     * @param powerCutFlag
     */
    public void setPowerCutFlag(Short powerCutFlag) {
        this.powerCutFlag = powerCutFlag;
    }

    /**
     * 获取相序
     *
     * @return PHASE_SEQ - 相序
     */
    public Short getPhaseSeq() {
        return phaseSeq;
    }

    /**
     * 设置相序
     *
     * @param phaseSeq 相序
     */
    public void setPhaseSeq(Short phaseSeq) {
        this.phaseSeq = phaseSeq;
    }
}