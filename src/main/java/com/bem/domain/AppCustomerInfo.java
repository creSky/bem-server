package com.bem.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "APP_CUSTOMER_INFO")
public class AppCustomerInfo {
    /**
     * ID
     */
    @Id
    @Column(name = "ID")
    private Long id;

    /**
     * 工作单号
     */
    @Column(name = "APP_NO")
    private String appNo;

    /**
     * 工作单号
     */
    @Column(name = "CUSTOMER_ID")
    private Long customerId;

    /**
     * 客户编号
     */
    @Column(name = "CUSTOMER_NO")
    private String customerNo;

    /**
     * 客户名称
     */
    @Column(name = "CUSTOMER_NAME")
    private String customerName;

    /**
     * 名称拼音
     */
    @Column(name = "CUSTOMER_NAME_SPELL")
    private String customerNameSpell;

    /**
     * 地址
     */
    @Column(name = "ADDRESS")
    private String address;

    /**
     * 地址拼音
     */
    @Column(name = "ADDRESS_SPELL")
    private String addressSpell;

    /**
     * 证件类型
     */
    @Column(name = "CARD_TYPE")
    private Short cardType;

    /**
     * 证件号
     */
    @Column(name = "CARD_NO")
    private String cardNo;

    /**
     * 联系人
     */
    @Column(name = "LINK_MAN")
    private String linkMan;

    /**
     * 联系方式
     */
    @Column(name = "CONTACT_INFORMATION")
    private String contactInformation;

    @Column(name = "STATUS")
    private Short status;

    @Column(name = "REMARK")
    private String remark;

    /**
     * 创建日期
     */
    @Column(name = "CREATE_DATE")
    private Date createDate;

    /**
     * 销户日期
     */
    @Column(name = "CANCEL_DATE")
    private Date cancelDate;

    /**
     * 营业区域
     */
    @Column(name = "BUSINESS_PLACE_CODE")
    private Integer businessPlaceCode;

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
     * @return APP_NO - 工作单号
     */
    public String getAppNo() {
        return appNo;
    }

    /**
     * 设置工作单号
     *
     * @param appNo 工作单号
     */
    public void setAppNo(String appNo) {
        this.appNo = appNo == null ? null : appNo.trim();
    }

    /**
     * 获取工作单号
     *
     * @return CUSTOMER_ID - 工作单号
     */
    public Long getCustomerId() {
        return customerId;
    }

    /**
     * 设置工作单号
     *
     * @param customerId 工作单号
     */
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取客户编号
     *
     * @return CUSTOMER_NO - 客户编号
     */
    public String getCustomerNo() {
        return customerNo;
    }

    /**
     * 设置客户编号
     *
     * @param customerNo 客户编号
     */
    public void setCustomerNo(String customerNo) {
        this.customerNo = (customerNo == null ? null : customerNo.trim());
    }

    /**
     * 获取客户名称
     *
     * @return CUSTOMER_NAME - 客户名称
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * 设置客户名称
     *
     * @param customerName 客户名称
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * 获取名称拼音
     *
     * @return CUSTOMER_NAME_SPELL - 名称拼音
     */
    public String getCustomerNameSpell() {
        return customerNameSpell;
    }

    /**
     * 设置名称拼音
     *
     * @param customerNameSpell 名称拼音
     */
    public void setCustomerNameSpell(String customerNameSpell) {
        this.customerNameSpell = customerNameSpell == null ? null : customerNameSpell.trim();
    }

    /**
     * 获取地址
     *
     * @return ADDRESS - 地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置地址
     *
     * @param address 地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取地址拼音
     *
     * @return ADDRESS_SPELL - 地址拼音
     */
    public String getAddressSpell() {
        return addressSpell;
    }

    /**
     * 设置地址拼音
     *
     * @param addressSpell 地址拼音
     */
    public void setAddressSpell(String addressSpell) {
        this.addressSpell = addressSpell == null ? null : addressSpell.trim();
    }

    /**
     * 获取证件类型
     *
     * @return CARD_TYPE - 证件类型
     */
    public Short getCardType() {
        return cardType;
    }

    /**
     * 设置证件类型
     *
     * @param cardType 证件类型
     */
    public void setCardType(Short cardType) {
        this.cardType = cardType;
    }

    /**
     * 获取证件号
     *
     * @return CARD_NO - 证件号
     */
    public String getCardNo() {
        return cardNo;
    }

    /**
     * 设置证件号
     *
     * @param cardNo 证件号
     */
    public void setCardNo(String cardNo) {
        this.cardNo = cardNo == null ? null : cardNo.trim();
    }

    /**
     * 获取联系人
     *
     * @return LINK_MAN - 联系人
     */
    public String getLinkMan() {
        return linkMan;
    }

    /**
     * 设置联系人
     *
     * @param linkMan 联系人
     */
    public void setLinkMan(String linkMan) {
        this.linkMan = linkMan == null ? null : linkMan.trim();
    }

    /**
     * 获取联系方式
     *
     * @return CONTACT_INFORMATION - 联系方式
     */
    public String getContactInformation() {
        return contactInformation;
    }

    /**
     * 设置联系方式
     *
     * @param contactInformation 联系方式
     */
    public void setContactInformation(String contactInformation) {
        this.contactInformation = contactInformation == null ? null : contactInformation.trim();
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

    /**
     * @return REMARK
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取创建日期
     *
     * @return CREATE_DATE - 创建日期
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * 设置创建日期
     *
     * @param createDate 创建日期
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * 获取销户日期
     *
     * @return CANCEL_DATE - 销户日期
     */
    public Date getCancelDate() {
        return cancelDate;
    }

    /**
     * 设置销户日期
     *
     * @param cancelDate 销户日期
     */
    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    /**
     * 获取营业区域
     *
     * @return BUSINESS_PLACE_CODE - 营业区域
     */
    public Integer getBusinessPlaceCode() {
        return businessPlaceCode;
    }

    /**
     * 设置营业区域
     *
     * @param businessPlaceCode 营业区域
     */
    public void setBusinessPlaceCode(Integer businessPlaceCode) {
        this.businessPlaceCode = businessPlaceCode == null ? null : businessPlaceCode;
    }
}