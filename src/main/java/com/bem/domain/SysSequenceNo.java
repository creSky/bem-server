package com.bem.domain;

import javax.persistence.*;

@Table(name = "SYS_SEQUENCE_NO")
public class SysSequenceNo {
    @Id
    @Column(name = "CODE")
    private String code;

    @Column(name = "NAME")
    private String name;

    @Column(name = "MAX_NO")
    private Integer maxNo;

    @Column(name = "FORMAT")
    private String format;

    @Column(name = "PREFIX")
    private String prefix;

    /**
     * @return CODE
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code
     */
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    /**
     * @return NAME
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * @return MAX_NO
     */
    public Integer getMaxNo() {
        return maxNo;
    }

    /**
     * @param maxNo
     */
    public void setMaxNo(Integer maxNo) {
        this.maxNo = maxNo;
    }

    /**
     * @return FORMAT
     */
    public String getFormat() {
        return format;
    }

    /**
     * @param format
     */
    public void setFormat(String format) {
        this.format = format == null ? null : format.trim();
    }

    /**
     * @return PREFIX
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * @param prefix
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix == null ? null : prefix.trim();
    }
}