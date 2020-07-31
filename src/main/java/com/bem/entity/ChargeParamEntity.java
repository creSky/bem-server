package com.bem.entity;

import java.math.BigDecimal;
import java.util.List;

public class ChargeParamEntity {
    private String settleMentNo;
    private Integer fChargeMode;
    private BigDecimal shouldMoney;
    private BigDecimal factMoney;
    private BigDecimal factChange;
    private List<Long> arrearageDetails;
    private BigDecimal balance;
    private BigDecimal ycys;

    public String getSettleMentNo() {
        return settleMentNo;
    }

    public void setSettleMentNo(String settleMentNo) {
        this.settleMentNo = settleMentNo;
    }

    public Integer getfChargeMode() {
        return fChargeMode;
    }

    public void setfChargeMode(Integer fChargeMode) {
        this.fChargeMode = fChargeMode;
    }

    public BigDecimal getShouldMoney() {
        return shouldMoney;
    }

    public void setShouldMoney(BigDecimal shouldMoney) {
        this.shouldMoney = shouldMoney;
    }

    public BigDecimal getFactMoney() {
        return factMoney;
    }

    public void setFactMoney(BigDecimal factMoney) {
        this.factMoney = factMoney;
    }

    public BigDecimal getFactChange() {
        return factChange;
    }

    public void setFactChange(BigDecimal factChange) {
        this.factChange = factChange;
    }

    public List<Long> getArrearageDetails() {
        return arrearageDetails;
    }

    public void setArrearageDetails(List<Long> arrearageDetails) {
        this.arrearageDetails = arrearageDetails;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public BigDecimal getYcys() {
        return ycys;
    }

    public void setYcys(BigDecimal ycys) {
        this.ycys = ycys;
    }
}
