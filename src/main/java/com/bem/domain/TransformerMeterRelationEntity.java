package com.bem.domain;

import java.util.Date;
//档案更新 变压器关系 实体
public class TransformerMeterRelationEntity {
    private Long id;// ID ID bigint TRUE FALSE TRUE
    private Long transformerId;// 变压器ID TRANSFORMER_ID bigint FALSE FALSE FALSE
    private Long meterId;// 计量点ID METER_ID bigint FALSE FALSE FALSE
    private Short msType;// 计量方式 MS_TYPE smallint(2) 2 FALSE FALSE FALSE
    private String transformerGroupNo;// 变压器组号 TRANSFORMER_GROUP_HP smallint FALSE FALSE FALSE
    private Date createDate;// 创建时间 CREATE_DATE datetime FALSE FALSE FALSE
    private String remark;// 备注 REMARK varchar(256) 256 FALSE FALSE FALSE
    private Byte status;
    private Integer loadChangeSign;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTransformerId() {
        return transformerId;
    }

    public void setTransformerId(Long transformerId) {
        this.transformerId = transformerId;
    }

    public Long getMeterId() {
        return meterId;
    }

    public void setMeterId(Long meterId) {
        this.meterId = meterId;
    }

    public Short getMsType() {
        return msType;
    }

    public void setMsType(Short msType) {
        this.msType = msType;
    }

    public String getTransformerGroupNo() {
        return transformerGroupNo;
    }

    public void setTransformerGroupNo(String transformerGroupNo) {
        this.transformerGroupNo = transformerGroupNo;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public Integer getLoadChangeSign() {
        return loadChangeSign;
    }

    public void setLoadChangeSign(Integer loadChangeSign) {
        this.loadChangeSign = loadChangeSign;
    }
}
