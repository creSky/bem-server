package com.bem.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_TRANSFORMER_INFO")
public class AppTransformerInfo {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "APP_ID")
    private Long appId;

    /**
     * 装拆表示 0新装
     */
    @Column(name = "LOAD_CHANGE_SIGN")
    private Integer loadChangeSign;

    /**
     * 变压器资产编号
     */
    @Column(name = "TRANSFORMER_ASSETS_NO")
    private String transformerAssetsNo;

    /**
     * 变压器名称
     */
    @Column(name = "DESK_NAME")
    private String deskName;

    /**
     * 考核功率因数
     */
    @Column(name = "COS_STD_CODE")
    private Integer cosStdCode;

    /**
     * 变压器容量
     */
    @Column(name = "CAPACITY")
    private BigDecimal capacity;

    /**
     * 变压器组号_高压
     */
    @Column(name = "TRANSFORMER_GROUP_HP")
    private Short transformerGroupHp;

    /**
     * 变压器组号_低压
     */
    @Column(name = "TRANSFORMER_GROUP_LP")
    private Short transformerGroupLp;

    /**
     * 公用变标志
     */
    @Column(name = "IS_PUB_TYPE")
    private Short isPubType;

    /**
     * 变损计算方法
     */
    @Column(name = "TRANSFORMER_LOSS_TYPE")
    private Short transformerLossType;

    /**
     * 供电所
     */
    @Column(name = "BUSINESS_PLACE_CODE")
    private String businessPlaceCode;

    /**
     * 投运日期
     */
    @Column(name = "RUN_DATE")
    private Date runDate;

    /**
     * 标准时间
     */
    @Column(name = "STAND_TIME")
    private Integer standTime;

    /**
     * 变损类型
     */
    @Column(name = "LOSS_TYPE")
    private Short lossType;

    /**
     * 变电站
     */
    @Column(name = "STATION_CODE")
    private Integer stationCode;

    /**
     * 线路
     */
    @Column(name = "LINE_CODE")
    private Integer lineCode;

    /**
     * 供电电压
     */
    @Column(name = "VOLT_TYPE")
    private Short voltType;

    /**
     * 责任人
     */
    @Column(name = "CHARGE_MAN")
    private String chargeMan;

    /**
     * 考核班组
     */
    @Column(name = "WORK_AREA_NO")
    private String workAreaNo;

    /**
     * 安装形式
     */
    @Column(name = "SET_FORMAT")
    private Short setFormat;

    /**
     * 片区号
     */
    @Column(name = "AREA_NO")
    private String areaNo;

    /**
     * 配电房编号
     */
    @Column(name = "SUPPLY_ROOM")
    private String supplyRoom;

    /**
     * 村别
     */
    @Column(name = "VILLAGE_NO")
    private String villageNo;

    /**
     * 变台改造情况
     */
    @Column(name = "TRANS_CHANGE")
    private String transChange;

    /**
     * 接入线路对应结束节点编号
     */
    @Column(name = "INPUT_NODE_CODE")
    private String inputNodeCode;

    /**
     * 补偿电容器总容量
     */
    @Column(name = "CAPCITOR_CAPACITY")
    private BigDecimal capcitorCapacity;

    /**
     * 创建日期
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 备注
     */
    @Column(name = "REMARK")
    private String remark;

    /**
     * 状态
     */
    @Column(name = "STATUS")
    private Short status;

    /**
     * 开始运行时间
     */
    @Column(name = "START_DATE")
    private Date startDate;

    /**
     * 装拆人
     */
    @Column(name = "CHG_MAN")
    private Integer chgMan;

    /**
     * 装拆日期
     */
    @Column(name = "CHG_DATE")
    private Date chgDate;

    /**
     * 安装地址
     */
    @Column(name = "CHG_ADDRESS")
    private String chgAddress;

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
     * @return APP_ID
     */
    public Long getAppId() {
        return appId;
    }

    /**
     * @param appId
     */
    public void setAppId(Long appId) {
        this.appId = appId;
    }

    /**
     * 获取装拆表示 0新装
     *
     * @return LOAD_CHANGE_SIGN - 装拆表示 0新装
     */
    public Integer getLoadChangeSign() {
        return loadChangeSign;
    }

    /**
     * 设置装拆表示 0新装
     *
     * @param loadChangeSign 装拆表示 0新装
     */
    public void setLoadChangeSign(Integer loadChangeSign) {
        this.loadChangeSign = loadChangeSign;
    }

    /**
     * 获取变压器资产编号
     *
     * @return TRANSFORMER_ASSETS_NO - 变压器资产编号
     */
    public String getTransformerAssetsNo() {
        return transformerAssetsNo;
    }

    /**
     * 设置变压器资产编号
     *
     * @param transformerAssetsNo 变压器资产编号
     */
    public void setTransformerAssetsNo(String transformerAssetsNo) {
        this.transformerAssetsNo = transformerAssetsNo == null ? null : transformerAssetsNo.trim();
    }

    /**
     * 获取变压器名称
     *
     * @return DESK_NAME - 变压器名称
     */
    public String getDeskName() {
        return deskName;
    }

    /**
     * 设置变压器名称
     *
     * @param deskName 变压器名称
     */
    public void setDeskName(String deskName) {
        this.deskName = deskName == null ? null : deskName.trim();
    }

    /**
     * 获取考核功率因数
     *
     * @return COS_STD_CODE - 考核功率因数
     */
    public Integer getCosStdCode() {
        return cosStdCode;
    }

    /**
     * 设置考核功率因数
     *
     * @param cosStdCode 考核功率因数
     */
    public void setCosStdCode(Integer cosStdCode) {
        this.cosStdCode = cosStdCode;
    }

    /**
     * 获取变压器容量
     *
     * @return CAPACITY - 变压器容量
     */
    public BigDecimal getCapacity() {
        return capacity;
    }

    /**
     * 设置变压器容量
     *
     * @param capacity 变压器容量
     */
    public void setCapacity(BigDecimal capacity) {
        this.capacity = capacity;
    }

    /**
     * 获取变压器组号_高压
     *
     * @return TRANSFORMER_GROUP_HP - 变压器组号_高压
     */
    public Short getTransformerGroupHp() {
        return transformerGroupHp;
    }

    /**
     * 设置变压器组号_高压
     *
     * @param transformerGroupHp 变压器组号_高压
     */
    public void setTransformerGroupHp(Short transformerGroupHp) {
        this.transformerGroupHp = transformerGroupHp;
    }

    /**
     * 获取变压器组号_低压
     *
     * @return TRANSFORMER_GROUP_LP - 变压器组号_低压
     */
    public Short getTransformerGroupLp() {
        return transformerGroupLp;
    }

    /**
     * 设置变压器组号_低压
     *
     * @param transformerGroupLp 变压器组号_低压
     */
    public void setTransformerGroupLp(Short transformerGroupLp) {
        this.transformerGroupLp = transformerGroupLp;
    }

    /**
     * 获取公用变标志
     *
     * @return IS_PUB_TYPE - 公用变标志
     */
    public Short getIsPubType() {
        return isPubType;
    }

    /**
     * 设置公用变标志
     *
     * @param isPubType 公用变标志
     */
    public void setIsPubType(Short isPubType) {
        this.isPubType = isPubType;
    }

    /**
     * 获取变损计算方法
     *
     * @return TRANSFORMER_LOSS_TYPE - 变损计算方法
     */
    public Short getTransformerLossType() {
        return transformerLossType;
    }

    /**
     * 设置变损计算方法
     *
     * @param transformerLossType 变损计算方法
     */
    public void setTransformerLossType(Short transformerLossType) {
        this.transformerLossType = transformerLossType;
    }

    /**
     * 获取供电所
     *
     * @return BUSINESS_PLACE_CODE - 供电所
     */
    public String getBusinessPlaceCode() {
        return businessPlaceCode;
    }

    /**
     * 设置供电所
     *
     * @param businessPlaceCode 供电所
     */
    public void setBusinessPlaceCode(String businessPlaceCode) {
        this.businessPlaceCode = businessPlaceCode == null ? null : businessPlaceCode.trim();
    }

    /**
     * 获取投运日期
     *
     * @return RUN_DATE - 投运日期
     */
    public Date getRunDate() {
        return runDate;
    }

    /**
     * 设置投运日期
     *
     * @param runDate 投运日期
     */
    public void setRunDate(Date runDate) {
        this.runDate = runDate;
    }

    /**
     * 获取标准时间
     *
     * @return STAND_TIME - 标准时间
     */
    public Integer getStandTime() {
        return standTime;
    }

    /**
     * 设置标准时间
     *
     * @param standTime 标准时间
     */
    public void setStandTime(Integer standTime) {
        this.standTime = standTime;
    }

    /**
     * 获取变损类型
     *
     * @return LOSS_TYPE - 变损类型
     */
    public Short getLossType() {
        return lossType;
    }

    /**
     * 设置变损类型
     *
     * @param lossType 变损类型
     */
    public void setLossType(Short lossType) {
        this.lossType = lossType;
    }

    /**
     * 获取变电站
     *
     * @return STATION_CODE - 变电站
     */
    public Integer getStationCode() {
        return stationCode;
    }

    /**
     * 设置变电站
     *
     * @param stationCode 变电站
     */
    public void setStationCode(Integer stationCode) {
        this.stationCode = stationCode;
    }

    /**
     * 获取线路
     *
     * @return LINE_CODE - 线路
     */
    public Integer getLineCode() {
        return lineCode;
    }

    /**
     * 设置线路
     *
     * @param lineCode 线路
     */
    public void setLineCode(Integer lineCode) {
        this.lineCode = lineCode;
    }

    /**
     * 获取供电电压
     *
     * @return VOLT_TYPE - 供电电压
     */
    public Short getVoltType() {
        return voltType;
    }

    /**
     * 设置供电电压
     *
     * @param voltType 供电电压
     */
    public void setVoltType(Short voltType) {
        this.voltType = voltType;
    }

    /**
     * 获取责任人
     *
     * @return CHARGE_MAN - 责任人
     */
    public String getChargeMan() {
        return chargeMan;
    }

    /**
     * 设置责任人
     *
     * @param chargeMan 责任人
     */
    public void setChargeMan(String chargeMan) {
        this.chargeMan = chargeMan == null ? null : chargeMan.trim();
    }

    /**
     * 获取考核班组
     *
     * @return WORK_AREA_NO - 考核班组
     */
    public String getWorkAreaNo() {
        return workAreaNo;
    }

    /**
     * 设置考核班组
     *
     * @param workAreaNo 考核班组
     */
    public void setWorkAreaNo(String workAreaNo) {
        this.workAreaNo = workAreaNo == null ? null : workAreaNo.trim();
    }

    /**
     * 获取安装形式
     *
     * @return SET_FORMAT - 安装形式
     */
    public Short getSetFormat() {
        return setFormat;
    }

    /**
     * 设置安装形式
     *
     * @param setFormat 安装形式
     */
    public void setSetFormat(Short setFormat) {
        this.setFormat = setFormat;
    }

    /**
     * 获取片区号
     *
     * @return AREA_NO - 片区号
     */
    public String getAreaNo() {
        return areaNo;
    }

    /**
     * 设置片区号
     *
     * @param areaNo 片区号
     */
    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo == null ? null : areaNo.trim();
    }

    /**
     * 获取配电房编号
     *
     * @return SUPPLY_ROOM - 配电房编号
     */
    public String getSupplyRoom() {
        return supplyRoom;
    }

    /**
     * 设置配电房编号
     *
     * @param supplyRoom 配电房编号
     */
    public void setSupplyRoom(String supplyRoom) {
        this.supplyRoom = supplyRoom == null ? null : supplyRoom.trim();
    }

    /**
     * 获取村别
     *
     * @return VILLAGE_NO - 村别
     */
    public String getVillageNo() {
        return villageNo;
    }

    /**
     * 设置村别
     *
     * @param villageNo 村别
     */
    public void setVillageNo(String villageNo) {
        this.villageNo = villageNo == null ? null : villageNo.trim();
    }

    /**
     * 获取变台改造情况
     *
     * @return TRANS_CHANGE - 变台改造情况
     */
    public String getTransChange() {
        return transChange;
    }

    /**
     * 设置变台改造情况
     *
     * @param transChange 变台改造情况
     */
    public void setTransChange(String transChange) {
        this.transChange = transChange == null ? null : transChange.trim();
    }

    /**
     * 获取接入线路对应结束节点编号
     *
     * @return INPUT_NODE_CODE - 接入线路对应结束节点编号
     */
    public String getInputNodeCode() {
        return inputNodeCode;
    }

    /**
     * 设置接入线路对应结束节点编号
     *
     * @param inputNodeCode 接入线路对应结束节点编号
     */
    public void setInputNodeCode(String inputNodeCode) {
        this.inputNodeCode = inputNodeCode == null ? null : inputNodeCode.trim();
    }

    /**
     * 获取补偿电容器总容量
     *
     * @return CAPCITOR_CAPACITY - 补偿电容器总容量
     */
    public BigDecimal getCapcitorCapacity() {
        return capcitorCapacity;
    }

    /**
     * 设置补偿电容器总容量
     *
     * @param capcitorCapacity 补偿电容器总容量
     */
    public void setCapcitorCapacity(BigDecimal capcitorCapacity) {
        this.capcitorCapacity = capcitorCapacity;
    }

    /**
     * 获取创建日期
     *
     * @return CREATE_DATE - 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     *
     * @param createDate 创建日期
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
     * 获取状态
     *
     * @return STATUS - 状态
     */
    public Short getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Short status) {
        this.status = status;
    }

    /**
     * 获取开始运行时间
     *
     * @return START_DATE - 开始运行时间
     */
    public Date getStartDate() {
        return startDate;
    }

    /**
     * 设置开始运行时间
     *
     * @param startDate 开始运行时间
     */
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    /**
     * 获取装拆人
     *
     * @return CHG_MAN - 装拆人
     */
    public Integer getChgMan() {
        return chgMan;
    }

    /**
     * 设置装拆人
     *
     * @param chgMan 装拆人
     */
    public void setChgMan(Integer chgMan) {
        this.chgMan = chgMan;
    }

    /**
     * 获取装拆日期
     *
     * @return CHG_DATE - 装拆日期
     */
    public Date getChgDate() {
        return chgDate;
    }

    /**
     * 设置装拆日期
     *
     * @param chgDate 装拆日期
     */
    public void setChgDate(Date chgDate) {
        this.chgDate = chgDate;
    }

    /**
     * 获取安装地址
     *
     * @return CHG_ADDRESS - 安装地址
     */
    public String getChgAddress() {
        return chgAddress;
    }

    /**
     * 设置安装地址
     *
     * @param chgAddress 安装地址
     */
    public void setChgAddress(String chgAddress) {
        this.chgAddress = chgAddress == null ? null : chgAddress.trim();
    }
}