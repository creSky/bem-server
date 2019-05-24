package com.bem.domain;

import com.github.pagehelper.PageInfo;

import javax.persistence.*;

@Table(name = "SYSTEM_COMMON_CONFIG")
public class SysCommConfig extends PageInfo {
    @Id
    @Column(name = "ID")
    private Long id;

    @Column(name = "TYPE")
    private String type;

    @Column(name = "PARAM_KEY")
    private Integer paramKey;

    @Column(name = "PARAM_VALUE")
    private String paramValue;

    @Column(name = "REMAKE")
    private String remake;

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
     * @return TYPE
     */
    public String getType() {
        return type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return PARAM_KEY
     */
    public Integer getParamKey() {
        return paramKey;
    }

    /**
     * @param paramKey
     */
    public void setParamKey(Integer paramKey) {
        this.paramKey = paramKey;
    }

    /**
     * @return PARAM_VALUE
     */
    public String getParamValue() {
        return paramValue;
    }

    /**
     * @param paramValue
     */
    public void setParamValue(String paramValue) {
        this.paramValue = paramValue == null ? null : paramValue.trim();
    }

    /**
     * @return REMAKE
     */
    public String getRemake() {
        return remake;
    }

    /**
     * @param remake
     */
    public void setRemake(String remake) {
        this.remake = remake == null ? null : remake.trim();
    }
}