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

    @Column(name = "METER_ID")
    private Long meterId;

    /**
     * 装拆表示 0新装
     */
    @Column(name = "LOAD_CHANGE_SIGN")
    private Integer loadChangeSign;

    /**
     * 组号
     */
    @Column(name = "TRANSFORMER_GROUP_NO")
    private String transformerGroupNo;

    @Column(name = "TRANSFORMER_ID")
    private Long transformerId;

    /**
     * 变电站
     */
    @Column(name = "SUBS_ID")
    private Long subsId;

    /**
     * 线路号
     */
    @Column(name = "LINE_ID")
    private Long lineId;

    /**
     * 高
            中
            低
     */
    @Column(name = "MS_TYPE")
    private Short msType;

    /**
     * 变压器容量
     */
    @Column(name = "CAPACITY")
    private BigDecimal capacity;

    /**
     * 公用变标志
     */
    @Column(name = "IS_PUB_TYPE")
    private Short isPubType;

    /**
     * 标准时间
     */
    @Column(name = "STAND_TIME")
    private Integer standTime;

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
     * 变压器名称
     */
    @Column(name = "DESK_NAME")
    private String deskName;

    @Column(name = "TRANSFORMER_REL_ID")
    private Long transformerRelId;

    /**
     * 资产号
     */
    @Column(name = "TRANSFORMER_NO")
    private Long transformerNo;

    /**
     * 变电站号
     */
    @Column(name = "SUBS_NAME")
    private String subsName;

    /**
     * 线路号
     */
    @Column(name = "LINE_NAME")
    private String lineName;

    /**
     * 变损计算方法
     */
    @Column(name = "TRANSFORMER_LOSS_TYPE")
    private Short transformerLossType;

    /**
     * 供电所
     */
    @Column(name = "BUSINESS_PLACE_CODE")
    private Long businessPlaceCode;

    @Column(name = "TASK_ID")
    private Long taskId;

    /**
     * 初始化处理标识
     */
    @Column(name = "FLAG")
    private Short flag;

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
     * 获取组号
     *
     * @return TRANSFORMER_GROUP_NO - 组号
     */
    public String getTransformerGroupNo() {
        return transformerGroupNo;
    }

    /**
     * 设置组号
     *
     * @param transformerGroupNo 组号
     */
    public void setTransformerGroupNo(String transformerGroupNo) {
        this.transformerGroupNo = transformerGroupNo == null ? null : transformerGroupNo.trim();
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
     * 获取变电站
     *
     * @return SUBS_ID - 变电站
     */
    public Long getSubsId() {
        return subsId;
    }

    /**
     * 设置变电站
     *
     * @param subsId 变电站
     */
    public void setSubsId(Long subsId) {
        this.subsId = subsId;
    }

    /**
     * 获取线路号
     *
     * @return LINE_ID - 线路号
     */
    public Long getLineId() {
        return lineId;
    }

    /**
     * 设置线路号
     *
     * @param lineId 线路号
     */
    public void setLineId(Long lineId) {
        this.lineId = lineId;
    }

    /**
     * 获取高
            中
            低
     *
     * @return MS_TYPE - 高
            中
            低
     */
    public Short getMsType() {
        return msType;
    }

    /**
     * 设置高
            中
            低
     *
     * @param msType 高
            中
            低
     */
    public void setMsType(Short msType) {
        this.msType = msType;
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
     * @return TRANSFORMER_REL_ID
     */
    public Long getTransformerRelId() {
        return transformerRelId;
    }

    /**
     * @param transformerRelId
     */
    public void setTransformerRelId(Long transformerRelId) {
        this.transformerRelId = transformerRelId;
    }

    /**
     * 获取资产号
     *
     * @return TRANSFORMER_NO - 资产号
     */
    public Long getTransformerNo() {
        return transformerNo;
    }

    /**
     * 设置资产号
     *
     * @param transformerNo 资产号
     */
    public void setTransformerNo(Long transformerNo) {
        this.transformerNo = transformerNo;
    }

    /**
     * 获取变电站号
     *
     * @return SUBS_NAME - 变电站号
     */
    public String getSubsName() {
        return subsName;
    }

    /**
     * 设置变电站号
     *
     * @param subsName 变电站号
     */
    public void setSubsName(String subsName) {
        this.subsName = subsName == null ? null : subsName.trim();
    }

    /**
     * 获取线路号
     *
     * @return LINE_NAME - 线路号
     */
    public String getLineName() {
        return lineName;
    }

    /**
     * 设置线路号
     *
     * @param lineName 线路号
     */
    public void setLineName(String lineName) {
        this.lineName = lineName == null ? null : lineName.trim();
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
    public Long getBusinessPlaceCode() {
        return businessPlaceCode;
    }

    /**
     * 设置供电所
     *
     * @param businessPlaceCode 供电所
     */
    public void setBusinessPlaceCode(Long businessPlaceCode) {
        this.businessPlaceCode = businessPlaceCode;
    }

    /**
     * @return TASK_ID
     */
    public Long getTaskId() {
        return taskId;
    }

    /**
     * @param taskId
     */
    public void setTaskId(Long taskId) {
        this.taskId = taskId;
    }

    /**
     * 获取初始化处理标识
     *
     * @return FLAG - 初始化处理标识
     */
    public Short getFlag() {
        return flag;
    }

    /**
     * 设置初始化处理标识
     *
     * @param flag 初始化处理标识
     */
    public void setFlag(Short flag) {
        this.flag = flag;
    }
}