package com.bem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.riozenc.titanTool.annotation.TablePrimaryKey;
import com.riozenc.titanTool.mybatis.MybatisEntity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

//计量点电费计算信息
public class MeterMoneyMogoEntity {

	private Long id;// ID ID bigint TRUE FALSE TRUE
	private Long meterId;// 计量点ID METER_ID bigint FALSE FALSE FALSE
	private Integer mon;// 电费年月 MON int FALSE FALSE FALSE
	private Byte sn;// 当月次数 SN smallint FALSE FALSE FALSE
	private BigDecimal activeWritePower;// 有功抄见电量 ACTIVE_WRITE_POWER decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal reactiveWritePower;// 正向无功抄见电量 REACTIVE_WRITE_POWER decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal reverseActiveWritePower;// 反向有功抄见电力 REVERSE_ACTIVE_WRITE_POWER decimal(12,2) 12 2 FALSE FALSE
												// FALSE
	private BigDecimal reverseReactiveWritePower;// 反向无功抄见电量 REVERSE_REACTIVE_WRITE_POWER decimal(12,2) 12 2 FALSE FALSE
													// FALSE
	private BigDecimal activeWritePower1;// 峰有功抄见电量 ACTIVE_WRITE_POWER_1 decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal activeWritePower2;// 平有功抄见电量 ACTIVE_WRITE_POWER_2 decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal activeWritePower3;// 谷有功抄见电量 ACTIVE_WRITE_POWER_3 decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal activeWritePower4;// 尖有功抄见电量 ACTIVE_WRITE_POWER_4 decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal reactiveWritePower1;// 峰无功抄见电量 REACTIVE_WRITE_POWER_1 decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal reactiveWritePower2;// 平无功抄见电量 REACTIVE_WRITE_POWER_2 decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal reactiveWritePower3;// 谷无功抄见电量 REACTIVE_WRITE_POWER_3 decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal reactiveWritePower4;// 尖无功抄见电量 REACTIVE_WRITE_POWER_4 decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal chgPower;// 有功换表电量 CHG_POWER decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal qChgPower;// 无功换表电量 Q_CHG_POWER decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal addPower;// 有功增减电量 ADD_POWER decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal qAddPower;// 无功增减电量 Q_ADD_POWER decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal activeDeductionPower;// 有功扣表电量 ACTIVE_DEDUCTION_POWER decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal reactiveDeductionPower;// 无功扣表电量 REACTIVE_DEDUCTION_POWER decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal activeLineLossPower;// 有功线损电量 ACTIVE_LINE_LOSS_POWER decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal reactiveLineLossPower;// 无功线损电量 REACTIVE_LINE_LOSS_POWER decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal activeTransformerLossPower;// 有功变损电量 ACTIVE_TRANSFORMER_LOSS_POWER decimal(12,2) 12 2 FALSE FALSE
													// FALSE
	private BigDecimal reactiveTransformerLossPower;// 无功变损电量 REACTIVE_TRANSFORMER_LOSS_POWER decimal(12,2) 12 2 FALSE
													// FALSE FALSE
	private BigDecimal totalPower;// 有功总电量 TOTAL_POWER decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal qTotalPower;// 无功总电量 Q_TOTAL_POWER decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal cos;// 功率因数 COS decimal(5,2) 5 2 FALSE FALSE FALSE
	private BigDecimal calCapacity;// 计费容量(最大需量) CAL_CAPACITY decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal shareCapacity;// 分摊容量 SHARE_CAPACITY decimal(12,2) 12 2 FALSE FALSE FALSE
	private BigDecimal volumeCharge;// 电度电费 VOLUME_CHARGE decimal(14,4) 14 4 FALSE FALSE FALSE
	private BigDecimal basicMoney;// 基本电费 BASIC_MONEY decimal(14,4) 14 4 FALSE FALSE FALSE
	private BigDecimal powerRateMoney;// 力调电费 POWER_RATE_MONEY decimal(14,4) 14 4 FALSE FALSE FALSE
	private BigDecimal surcharges;// 附加费 SURCHARGES decimal(14,4) 14 4 FALSE FALSE FALSE
	private BigDecimal amount;// 总电费 AMOUNT decimal(14,4) 14 4 FALSE FALSE FALSE
	private Date createDate;// 创建时间 CREATE_DATE datetime FALSE FALSE FALSE
	private String remark;// 备注 REMARK varchar(256) 256 FALSE FALSE FALSE
	private Byte status;// 状态 STATUS smallint FALSE FALSE FALSE
	private Long priceTypeId;
	private Map<String,BigDecimal> surchargeDetail;// 附加费

	public Map<String, BigDecimal> getSurchargeDetail() {
		return surchargeDetail;
	}

	public void setSurchargeDetail(Map<String, BigDecimal> surchargeDetail) {
		this.surchargeDetail = surchargeDetail;
	}

	public Long getPriceTypeId() {
		return priceTypeId;
	}

	public void setPriceTypeId(Long priceTypeId) {
		this.priceTypeId = priceTypeId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMeterId() {
		return meterId;
	}

	public void setMeterId(Long meterId) {
		this.meterId = meterId;
	}

	public Integer getMon() {
		return mon;
	}

	public void setMon(Integer mon) {
		this.mon = mon;
	}

	public Byte getSn() {
		return sn;
	}

	public void setSn(Byte sn) {
		this.sn = sn;
	}

	public BigDecimal getActiveWritePower() {
		return activeWritePower;
	}

	public void setActiveWritePower(BigDecimal activeWritePower) {
		this.activeWritePower = activeWritePower;
	}

	public BigDecimal getReactiveWritePower() {
		return reactiveWritePower;
	}

	public void setReactiveWritePower(BigDecimal reactiveWritePower) {
		this.reactiveWritePower = reactiveWritePower;
	}

	public BigDecimal getReverseActiveWritePower() {
		return reverseActiveWritePower;
	}

	public void setReverseActiveWritePower(BigDecimal reverseActiveWritePower) {
		this.reverseActiveWritePower = reverseActiveWritePower;
	}

	public BigDecimal getReverseReactiveWritePower() {
		return reverseReactiveWritePower;
	}

	public void setReverseReactiveWritePower(BigDecimal reverseReactiveWritePower) {
		this.reverseReactiveWritePower = reverseReactiveWritePower;
	}

	public BigDecimal getActiveWritePower1() {
		return activeWritePower1;
	}

	public void setActiveWritePower1(BigDecimal activeWritePower1) {
		this.activeWritePower1 = activeWritePower1;
	}

	public BigDecimal getActiveWritePower2() {
		return activeWritePower2;
	}

	public void setActiveWritePower2(BigDecimal activeWritePower2) {
		this.activeWritePower2 = activeWritePower2;
	}

	public BigDecimal getActiveWritePower3() {
		return activeWritePower3;
	}

	public void setActiveWritePower3(BigDecimal activeWritePower3) {
		this.activeWritePower3 = activeWritePower3;
	}

	public BigDecimal getActiveWritePower4() {
		return activeWritePower4;
	}

	public void setActiveWritePower4(BigDecimal activeWritePower4) {
		this.activeWritePower4 = activeWritePower4;
	}

	public BigDecimal getReactiveWritePower1() {
		return reactiveWritePower1;
	}

	public void setReactiveWritePower1(BigDecimal reactiveWritePower1) {
		this.reactiveWritePower1 = reactiveWritePower1;
	}

	public BigDecimal getReactiveWritePower2() {
		return reactiveWritePower2;
	}

	public void setReactiveWritePower2(BigDecimal reactiveWritePower2) {
		this.reactiveWritePower2 = reactiveWritePower2;
	}

	public BigDecimal getReactiveWritePower3() {
		return reactiveWritePower3;
	}

	public void setReactiveWritePower3(BigDecimal reactiveWritePower3) {
		this.reactiveWritePower3 = reactiveWritePower3;
	}

	public BigDecimal getReactiveWritePower4() {
		return reactiveWritePower4;
	}

	public void setReactiveWritePower4(BigDecimal reactiveWritePower4) {
		this.reactiveWritePower4 = reactiveWritePower4;
	}

	public BigDecimal getChgPower() {
		return chgPower;
	}

	public void setChgPower(BigDecimal chgPower) {
		this.chgPower = chgPower;
	}

	public BigDecimal getqChgPower() {
		return qChgPower;
	}

	public void setqChgPower(BigDecimal qChgPower) {
		this.qChgPower = qChgPower;
	}

	public BigDecimal getAddPower() {
		return addPower;
	}

	public void setAddPower(BigDecimal addPower) {
		this.addPower = addPower;
	}

	public BigDecimal getqAddPower() {
		return qAddPower;
	}

	public void setqAddPower(BigDecimal qAddPower) {
		this.qAddPower = qAddPower;
	}

	public BigDecimal getActiveDeductionPower() {
		return activeDeductionPower;
	}

	public void setActiveDeductionPower(BigDecimal activeDeductionPower) {
		this.activeDeductionPower = activeDeductionPower;
	}

	public BigDecimal getReactiveDeductionPower() {
		return reactiveDeductionPower;
	}

	public void setReactiveDeductionPower(BigDecimal reactiveDeductionPower) {
		this.reactiveDeductionPower = reactiveDeductionPower;
	}

	public BigDecimal getActiveLineLossPower() {
		return activeLineLossPower;
	}

	public void setActiveLineLossPower(BigDecimal activeLineLossPower) {
		this.activeLineLossPower = activeLineLossPower;
	}

	public BigDecimal getReactiveLineLossPower() {
		return reactiveLineLossPower;
	}

	public void setReactiveLineLossPower(BigDecimal reactiveLineLossPower) {
		this.reactiveLineLossPower = reactiveLineLossPower;
	}

	public BigDecimal getActiveTransformerLossPower() {
		return activeTransformerLossPower;
	}

	public void setActiveTransformerLossPower(BigDecimal activeTransformerLossPower) {
		this.activeTransformerLossPower = activeTransformerLossPower;
	}

	public BigDecimal getReactiveTransformerLossPower() {
		return reactiveTransformerLossPower;
	}

	public void setReactiveTransformerLossPower(BigDecimal reactiveTransformerLossPower) {
		this.reactiveTransformerLossPower = reactiveTransformerLossPower;
	}

	public BigDecimal getTotalPower() {
		return totalPower;
	}

	public void setTotalPower(BigDecimal totalPower) {
		this.totalPower = totalPower;
	}

	public BigDecimal getqTotalPower() {
		return qTotalPower;
	}

	public void setqTotalPower(BigDecimal qTotalPower) {
		this.qTotalPower = qTotalPower;
	}

	public BigDecimal getCos() {
		return cos;
	}

	public void setCos(BigDecimal cos) {
		this.cos = cos;
	}

	public BigDecimal getCalCapacity() {
		return calCapacity;
	}

	public void setCalCapacity(BigDecimal calCapacity) {
		this.calCapacity = calCapacity;
	}

	public BigDecimal getShareCapacity() {
		return shareCapacity;
	}

	public void setShareCapacity(BigDecimal shareCapacity) {
		this.shareCapacity = shareCapacity;
	}

	public BigDecimal getVolumeCharge() {
		return volumeCharge;
	}

	public void setVolumeCharge(BigDecimal volumeCharge) {
		this.volumeCharge = volumeCharge;
	}

	public BigDecimal getBasicMoney() {
		return basicMoney;
	}

	public void setBasicMoney(BigDecimal basicMoney) {
		this.basicMoney = basicMoney;
	}

	public BigDecimal getPowerRateMoney() {
		return powerRateMoney;
	}

	public void setPowerRateMoney(BigDecimal powerRateMoney) {
		this.powerRateMoney = powerRateMoney;
	}

	public BigDecimal getSurcharges() {
		return surcharges;
	}

	public void setSurcharges(BigDecimal surcharges) {
		this.surcharges = surcharges;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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

}
