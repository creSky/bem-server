package com.bem.domain;

import javax.persistence.*;

@Table(name = "APP_POWER_RECALL")
public class AppPowerRecallKey {
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 资产编号
     */
    @Id
    @Column(name = "METER_ASSETS_NO")
    private String meterAssetsNo;

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
}