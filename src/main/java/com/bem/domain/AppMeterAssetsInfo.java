package com.bem.domain;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "APP_METER_ASSETS_INFO")
public class AppMeterAssetsInfo {
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
    private Long appId;

    /**
     * 计量点号
     */
    @Column(name = "METER_ID")
    private Long meterId;

    /**
     * 装拆标识
     */
    @Column(name = "LOAD_CHANGE_SIGN")
    private Integer loadChangeSign;

    /**
     * 资产编号
     */
    @Column(name = "METER_ASSETS_NO")
    private String meterAssetsNo;

    /**
     * 表序号
     */
    @Column(name = "METER_ASSETS_SN")
    private Integer meterAssetsSn;

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
     * 总表码
     */
    @Column(name = "A_NUM")
    private Integer aNum;

    /**
     * 峰表码
     */
    @Column(name = "P_NUM")
    private Integer pNum;

    /**
     * 谷表码
     */
    @Column(name = "V_NUM")
    private Integer vNum;

    /**
     * 平表码
     */
    @Column(name = "N_NUM")
    private Integer nNum;


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
     * @return METER_ID - 计量点号
     */
    public Long getMeterId() {
        return meterId;
    }

    /**
     * 设置计量点号
     *
     * @param meterId 计量点号
     */
    public void setMeterId(Long meterId) {
        this.meterId = meterId;
    }

    /**
     * 获取装拆标识
     *
     * @return LOAD_CHANGE_SIGN - 装拆标识
     */
    public Integer getLoadChangeSign() {
        return loadChangeSign;
    }

    /**
     * 设置装拆标识
     *
     * @param loadChangeSign 装拆标识
     */
    public void setLoadChangeSign(Integer loadChangeSign) {
        this.loadChangeSign = loadChangeSign;
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
     * 获取表序号
     *
     * @return METER_ASSETS_SN - 表序号
     */
    public Integer getMeterAssetsSn() {
        return meterAssetsSn;
    }

    /**
     * 设置表序号
     *
     * @param meterAssetsSn 表序号
     */
    public void setMeterAssetsSn(Integer meterAssetsSn) {
        this.meterAssetsSn = meterAssetsSn;
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
     * 获取总表码
     *
     * @return A_NUM - 总表码
     */
    public Integer getaNum() {
        return aNum;
    }

    /**
     * 设置总表码
     *
     * @param aNum 总表码
     */
    public void setaNum(Integer aNum) {
        this.aNum = aNum;
    }

    /**
     * 获取峰表码
     *
     * @return P_NUM - 峰表码
     */
    public Integer getpNum() {
        return pNum;
    }

    /**
     * 设置峰表码
     *
     * @param pNum 峰表码
     */
    public void setpNum(Integer pNum) {
        this.pNum = pNum;
    }

    /**
     * 获取谷表码
     *
     * @return V_NUM - 谷表码
     */
    public Integer getvNum() {
        return vNum;
    }

    /**
     * 设置谷表码
     *
     * @param vNum 谷表码
     */
    public void setvNum(Integer vNum) {
        this.vNum = vNum;
    }

    /**
     * 获取平表码
     *
     * @return N_NUM - 平表码
     */
    public Integer getnNum() {
        return nNum;
    }

    /**
     * 设置平表码
     *
     * @param nNum 平表码
     */
    public void setnNum(Integer nNum) {
        this.nNum = nNum;
    }
}