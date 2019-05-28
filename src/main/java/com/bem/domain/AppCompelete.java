package com.bem.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Table(name = "APP_COMPELETE")
public class AppCompelete {
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 工单号
     */
    @Column(name = "APP_ID")
    private String appId;

    /**
     * 环节号
     */
    @Column(name = "TASK_ID")
    private Integer taskId;

    /**
     * 实例号
     */
    @Column(name = "PROCESS_INSTANCE_ID")
    private Long processInstanceId;

    /**
     * 装表人
     */
    @Column(name = "ASSEM_MAN")
    private String assemMan;

    /**
     * 装表时间
     */
    @Column(name = "ASSEM_DATE")
    private Date assemDate;

    /**
     * 创建时间（短信通知依据时间）
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 完成时间（短信通知依据时间）
     */
    @Column(name = "SUBMIT_DATE")
    private Date submitDate;

    /**
     * 设计类型
     */
    @Column(name = "DESIGN_TYPE")
    private Integer designType;

    /**
     * 设计是否通过
     */
    @Column(name = "IS_DESIGN")
    private Integer isDesign;

    /**
     * 设计备注
     */
    @Column(name = "DESIGN_REMARK")
    private String designRemark;

    /**
     * 非典型设计单位
     */
    @Column(name = "DESIGN_COMPANY")
    private String designCompany;

    /**
     * 施工单位名称
     */
    @Column(name = "CONSTRUCTION_NAME")
    private String constructionName;

    /**
     * 申请竣工验收时间
     */
    @Column(name = "CONSTRUCTION_DATE")
    private Date constructionDate;

    /**
     * 验收人员姓名
     */
    @Column(name = "COMPLETE_MAN")
    private String completeMan;

    /**
     * 验收时间
     */
    @Column(name = "COMPLETE_DATE")
    private Date completeDate;

    /**
     * 验收是否通过
     */
    @Column(name = "IS_COMPLETE")
    private Integer isComplete;

    /**
     * 验收说明
     */
    @Column(name = "COMPLETE_REMARK")
    private String completeRemark;


    @Transient
    private List<String> relativePath;

    public List<String> getRelativePath() {
        return new ArrayList<>();
    }

    public void setRelativePath(List<String> relativePath) {
        this.relativePath = relativePath;
    }
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
     * 获取工单号
     *
     * @return APP_ID - 工单号
     */
    public String getAppId() {
        return appId;
    }

    /**
     * 设置工单号
     *
     * @param appId 工单号
     */
    public void setAppId(String appId) {
        this.appId = appId == null ? null : appId.trim();
    }

    /**
     * 获取环节号
     *
     * @return TASK_ID - 环节号
     */
    public Integer getTaskId() {
        return taskId;
    }

    /**
     * 设置环节号
     *
     * @param taskId 环节号
     */
    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    /**
     * 获取实例号
     *
     * @return PROCESS_INSTANCE_ID - 实例号
     */
    public Long getProcessInstanceId() {
        return processInstanceId;
    }

    /**
     * 设置实例号
     *
     * @param processInstanceId 实例号
     */
    public void setProcessInstanceId(Long processInstanceId) {
        this.processInstanceId = processInstanceId;
    }

    /**
     * 获取装表人
     *
     * @return ASSEM_MAN - 装表人
     */
    public String getAssemMan() {
        return assemMan;
    }

    /**
     * 设置装表人
     *
     * @param assemMan 装表人
     */
    public void setAssemMan(String assemMan) {
        this.assemMan = assemMan == null ? null : assemMan.trim();
    }

    /**
     * 获取装表时间
     *
     * @return ASSEM_DATE - 装表时间
     */
    public Date getAssemDate() {
        return assemDate;
    }

    /**
     * 设置装表时间
     *
     * @param assemDate 装表时间
     */
    public void setAssemDate(Date assemDate) {
        this.assemDate = assemDate;
    }

    /**
     * 获取创建时间（短信通知依据时间）
     *
     * @return CREATE_DATE - 创建时间（短信通知依据时间）
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建时间（短信通知依据时间）
     *
     * @param createDate 创建时间（短信通知依据时间）
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取完成时间（短信通知依据时间）
     *
     * @return SUBMIT_DATE - 完成时间（短信通知依据时间）
     */
    public Date getSubmitDate() {
        return submitDate;
    }

    /**
     * 设置完成时间（短信通知依据时间）
     *
     * @param submitDate 完成时间（短信通知依据时间）
     */
    public void setSubmitDate(Date submitDate) {
        this.submitDate = submitDate;
    }

    /**
     * 获取设计类型
     *
     * @return DESIGN_TYPE - 设计类型
     */
    public Integer getDesignType() {
        return designType;
    }

    /**
     * 设置设计类型
     *
     * @param designType 设计类型
     */
    public void setDesignType(Integer designType) {
        this.designType = designType;
    }

    /**
     * 获取设计是否通过
     *
     * @return IS_DESIGN - 设计是否通过
     */
    public Integer getIsDesign() {
        return isDesign;
    }

    /**
     * 设置设计是否通过
     *
     * @param isDesign 设计是否通过
     */
    public void setIsDesign(Integer isDesign) {
        this.isDesign = isDesign;
    }

    /**
     * 获取设计备注
     *
     * @return DESIGN_REMARK - 设计备注
     */
    public String getDesignRemark() {
        return designRemark;
    }

    /**
     * 设置设计备注
     *
     * @param designRemark 设计备注
     */
    public void setDesignRemark(String designRemark) {
        this.designRemark = designRemark == null ? null : designRemark.trim();
    }

    /**
     * 获取非典型设计单位
     *
     * @return DESIGN_COMPANY - 非典型设计单位
     */
    public String getDesignCompany() {
        return designCompany;
    }

    /**
     * 设置非典型设计单位
     *
     * @param designCompany 非典型设计单位
     */
    public void setDesignCompany(String designCompany) {
        this.designCompany = designCompany == null ? null : designCompany.trim();
    }

    /**
     * 获取施工单位名称
     *
     * @return CONSTRUCTION_NAME - 施工单位名称
     */
    public String getConstructionName() {
        return constructionName;
    }

    /**
     * 设置施工单位名称
     *
     * @param constructionName 施工单位名称
     */
    public void setConstructionName(String constructionName) {
        this.constructionName = constructionName == null ? null : constructionName.trim();
    }

    /**
     * 获取申请竣工验收时间
     *
     * @return CONSTRUCTION_DATE - 申请竣工验收时间
     */
    public Date getConstructionDate() {
        return constructionDate;
    }

    /**
     * 设置申请竣工验收时间
     *
     * @param constructionDate 申请竣工验收时间
     */
    public void setConstructionDate(Date constructionDate) {
        this.constructionDate = constructionDate;
    }

    /**
     * 获取验收人员姓名
     *
     * @return COMPLETE_MAN - 验收人员姓名
     */
    public String getCompleteMan() {
        return completeMan;
    }

    /**
     * 设置验收人员姓名
     *
     * @param completeMan 验收人员姓名
     */
    public void setCompleteMan(String completeMan) {
        this.completeMan = completeMan == null ? null : completeMan.trim();
    }

    /**
     * 获取验收时间
     *
     * @return COMPLETE_DATE - 验收时间
     */
    public Date getCompleteDate() {
        return completeDate;
    }

    /**
     * 设置验收时间
     *
     * @param completeDate 验收时间
     */
    public void setCompleteDate(Date completeDate) {
        this.completeDate = completeDate;
    }

    /**
     * 获取验收是否通过
     *
     * @return IS_COMPLETE - 验收是否通过
     */
    public Integer getIsComplete() {
        return isComplete;
    }

    /**
     * 设置验收是否通过
     *
     * @param isComplete 验收是否通过
     */
    public void setIsComplete(Integer isComplete) {
        this.isComplete = isComplete;
    }

    /**
     * 获取验收说明
     *
     * @return COMPLETE_REMARK - 验收说明
     */
    public String getCompleteRemark() {
        return completeRemark;
    }

    /**
     * 设置验收说明
     *
     * @param completeRemark 验收说明
     */
    public void setCompleteRemark(String completeRemark) {
        this.completeRemark = completeRemark == null ? null : completeRemark.trim();
    }
}