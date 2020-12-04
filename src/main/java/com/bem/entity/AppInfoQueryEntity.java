package com.bem.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.riozenc.titanTool.mybatis.pagination.Page;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

//业扩流程查询参数
@JsonIgnoreProperties(ignoreUnknown = true)
public class AppInfoQueryEntity {
    private Long businessPlaceCode;
    private Integer templateType;
    private Long elecTypeCode;
    private Date startApplyDate;
    private Date startFinishDate;
    private Date endApplyDate;
    private Date endFinishDate;
    private Long appStatus;
    private List<Long> businessPlaceCodes;

    public Long getBusinessPlaceCode() {
        return businessPlaceCode;
    }

    public void setBusinessPlaceCode(Long businessPlaceCode) {
        this.businessPlaceCode = businessPlaceCode;
    }

    public Integer getTemplateType() {
        return templateType;
    }

    public void setTemplateType(Integer templateType) {
        this.templateType = templateType;
    }

    public Long getElecTypeCode() {
        return elecTypeCode;
    }

    public void setElecTypeCode(Long elecTypeCode) {
        this.elecTypeCode = elecTypeCode;
    }

    public Date getStartApplyDate() {
        return startApplyDate;
    }

    public void setStartApplyDate(Date startApplyDate) {
        this.startApplyDate = startApplyDate;
    }

    public Date getStartFinishDate() {
        return startFinishDate;
    }

    public void setStartFinishDate(Date startFinishDate) {
        this.startFinishDate = startFinishDate;
    }

    public Date getEndApplyDate() {
        return endApplyDate;
    }

    public void setEndApplyDate(Date endApplyDate) {
        this.endApplyDate = endApplyDate;
    }

    public Date getEndFinishDate() {
        return endFinishDate;
    }

    public void setEndFinishDate(Date endFinishDate) {
        this.endFinishDate = endFinishDate;
    }

    public Long getAppStatus() {
        return appStatus;
    }

    public void setAppStatus(Long appStatus) {
        this.appStatus = appStatus;
    }

    public List<Long> getBusinessPlaceCodes() {
        return businessPlaceCodes;
    }

    public void setBusinessPlaceCodes(List<Long> businessPlaceCodes) {
        this.businessPlaceCodes = businessPlaceCodes;
    }
}
