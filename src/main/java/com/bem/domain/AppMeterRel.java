package com.bem.domain;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_METER_REL")
public class AppMeterRel {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "APP_ID")
    private Long appId;

    @Column(name = "METER_ID")
    private Long meterId;

    @Column(name = "P_METER_ID")
    private Long pMeterId;

    /**
     * 父子关系
            合并关系
            定量关系
            定比关系
     */
    @Column(name = "METER_RELATION_TYPE")
    private Short meterRelationType;

    @Column(name = "METER_RELATION_VALUE")
    private BigDecimal meterRelationValue;

    @Column(name = "CREATE_DATE")
    private Date createDate;

    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    @Column(name = "STATUS")
    private Short status;

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
     * @return P_METER_ID
     */
    public Long getpMeterId() {
        return pMeterId;
    }

    /**
     * @param pMeterId
     */
    public void setpMeterId(Long pMeterId) {
        this.pMeterId = pMeterId;
    }

    /**
     * 获取父子关系
            合并关系
            定量关系
            定比关系
     *
     * @return METER_RELATION_TYPE - 父子关系
            合并关系
            定量关系
            定比关系
     */
    public Short getMeterRelationType() {
        return meterRelationType;
    }

    /**
     * 设置父子关系
            合并关系
            定量关系
            定比关系
     *
     * @param meterRelationType 父子关系
            合并关系
            定量关系
            定比关系
     */
    public void setMeterRelationType(Short meterRelationType) {
        this.meterRelationType = meterRelationType;
    }

    /**
     * @return METER_RELATION_VALUE
     */
    public BigDecimal getMeterRelationValue() {
        return meterRelationValue;
    }

    /**
     * @param meterRelationValue
     */
    public void setMeterRelationValue(BigDecimal meterRelationValue) {
        this.meterRelationValue = meterRelationValue;
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
     * @return UPDATE_DATE
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * @param updateDate
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
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
}