package com.bem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.math.BigDecimal;

//余额
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreChargeEntity {
	private Long id;
	// 结算户
	private Long settlementId;
	// 余额
	private BigDecimal balance;
	private Integer status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSettlementId() {
		return settlementId;
	}

	public void setSettlementId(Long settlementId) {
		this.settlementId = settlementId;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
}
