package com.bem.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_DESIGN_CONSTRUCT")
public class AppDesignConstruct {
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 单位代码
     */
    @Column(name = "DEPT_CODE")
    private String deptCode;

    /**
     * 单位名称
     */
    @Column(name = "DEPT_NAME")
    private String deptName;

    /**
     * 单位资质编号：qualification_no
     */
    @Column(name = "QUAL_NO")
    private String qualNo;

    /**
     * 单位资质等级
     */
    @Column(name = "DEPT_LEVEL")
    private Integer deptLevel;

    /**
     * 单位资质有效期限
     */
    @Column(name = "CARD_LIMIT")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date cardLimit;

    /**
     * 类型关系下拉表
     */
    @Column(name = "TYPE")
    private String type;

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
     * 获取单位代码
     *
     * @return DEPT_CODE - 单位代码
     */
    public String getDeptCode() {
        return deptCode;
    }

    /**
     * 设置单位代码
     *
     * @param deptCode 单位代码
     */
    public void setDeptCode(String deptCode) {
        this.deptCode = deptCode == null ? null : deptCode.trim();
    }

    /**
     * 获取单位名称
     *
     * @return DEPT_NAME - 单位名称
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 设置单位名称
     *
     * @param deptName 单位名称
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }

    /**
     * 获取单位资质编号：qualification_no
     *
     * @return QUAL_NO - 单位资质编号：qualification_no
     */
    public String getQualNo() {
        return qualNo;
    }

    /**
     * 设置单位资质编号：qualification_no
     *
     * @param qualNo 单位资质编号：qualification_no
     */
    public void setQualNo(String qualNo) {
        this.qualNo = qualNo == null ? null : qualNo.trim();
    }

    /**
     * 获取单位资质等级
     *
     * @return DEPT_LEVEL - 单位资质等级
     */
    public Integer getDeptLevel() {
        return deptLevel;
    }

    /**
     * 设置单位资质等级
     *
     * @param deptLevel 单位资质等级
     */
    public void setDeptLevel(Integer deptLevel) {
        this.deptLevel = deptLevel;
    }

    /**
     * 获取单位资质有效期限
     *
     * @return CARD_LIMIT - 单位资质有效期限
     */
    public Date getCardLimit() {
        return cardLimit;
    }

    /**
     * 设置单位资质有效期限
     *
     * @param cardLimit 单位资质有效期限
     */
    public void setCardLimit(Date cardLimit) {
        this.cardLimit = cardLimit;
    }

    /**
     * 获取类型关系下拉表
     *
     * @return TYPE - 类型关系下拉表
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型关系下拉表
     *
     * @param type 类型关系下拉表
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}