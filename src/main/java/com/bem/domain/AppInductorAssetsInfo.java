package com.bem.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_INDUCTOR_ASSETS_INFO")
public class AppInductorAssetsInfo {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "METER_ID")
    private Integer meterId;

    /**
     * 工作单号
     */
    @Column(name = "APP_ID")
    private Long appId;

    /**
     * 装拆标识
     */
    @Column(name = "LOAD_CHANGE_SIGN")
    private Integer loadChangeSign;

    /**
     * 资产编号
     */
    @Column(name = "INDUCTOR_ASSETS_NO")
    private String inductorAssetsNo;

    /**
     * 互感器类型
     */
    @Column(name = "INDUCTOR_TYPE")
    private Short inductorType;

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
     * @return METER_ID
     */
    public Integer getMeterId() {
        return meterId;
    }

    /**
     * @param meterId
     */
    public void setMeterId(Integer meterId) {
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
     * @return INDUCTOR_ASSETS_NO - 资产编号
     */
    public String getInductorAssetsNo() {
        return inductorAssetsNo;
    }

    /**
     * 设置资产编号
     *
     * @param inductorAssetsNo 资产编号
     */
    public void setInductorAssetsNo(String inductorAssetsNo) {
        this.inductorAssetsNo = inductorAssetsNo == null ? null : inductorAssetsNo.trim();
    }

    /**
     * 获取互感器类型
     *
     * @return INDUCTOR_TYPE - 互感器类型
     */
    public Short getInductorType() {
        return inductorType;
    }

    /**
     * 设置互感器类型
     *
     * @param inductorType 互感器类型
     */
    public void setInductorType(Short inductorType) {
        this.inductorType = inductorType;
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