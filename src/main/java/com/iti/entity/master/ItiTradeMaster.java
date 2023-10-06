package com.iti.entity.master;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.iti.util.HstoreDataType;

@Entity
@Table(name="ititrade_master")
public class ItiTradeMaster {

	@Id
	private String tradeShort;
	private String tradeName;
	private Integer durationyrs;
	private String engNonengg;
	private String minQual;
	private Integer tradeFreeze;
	private Integer convApproval;
	private Integer tradeCode;
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> maxInternalMarks = new HashMap<String, String>();
	private String typeAdmission;
	private String drNondr;
	private Integer unitStrength;
	private Integer displayOrder;
	public ItiTradeMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItiTradeMaster(String tradeShort, String tradeName, Integer durationyrs, String engNonengg, String minQual,
			Integer tradeFreeze, Integer convApproval, Integer tradeCode, Map<String, String> maxInternalMarks,
			String typeAdmission, String drNondr, Integer unitStrength, Integer displayOrder) {
		super();
		this.tradeShort = tradeShort;
		this.tradeName = tradeName;
		this.durationyrs = durationyrs;
		this.engNonengg = engNonengg;
		this.minQual = minQual;
		this.tradeFreeze = tradeFreeze;
		this.convApproval = convApproval;
		this.tradeCode = tradeCode;
		this.maxInternalMarks = maxInternalMarks;
		this.typeAdmission = typeAdmission;
		this.drNondr = drNondr;
		this.unitStrength = unitStrength;
		this.displayOrder = displayOrder;
	}
	public String getTradeShort() {
		return tradeShort;
	}
	public void setTradeShort(String tradeShort) {
		this.tradeShort = tradeShort;
	}
	public String getTradeName() {
		return tradeName;
	}
	public void setTradeName(String tradeName) {
		this.tradeName = tradeName;
	}
	public Integer getDurationyrs() {
		return durationyrs;
	}
	public void setDurationyrs(Integer durationyrs) {
		this.durationyrs = durationyrs;
	}
	public String getEngNonengg() {
		return engNonengg;
	}
	public void setEngNonengg(String engNonengg) {
		this.engNonengg = engNonengg;
	}
	public String getMinQual() {
		return minQual;
	}
	public void setMinQual(String minQual) {
		this.minQual = minQual;
	}
	public Integer getTradeFreeze() {
		return tradeFreeze;
	}
	public void setTradeFreeze(Integer tradeFreeze) {
		this.tradeFreeze = tradeFreeze;
	}
	public Integer getConvApproval() {
		return convApproval;
	}
	public void setConvApproval(Integer convApproval) {
		this.convApproval = convApproval;
	}
	public Integer getTradeCode() {
		return tradeCode;
	}
	public void setTradeCode(Integer tradeCode) {
		this.tradeCode = tradeCode;
	}
	public Map<String, String> getMaxInternalMarks() {
		return maxInternalMarks;
	}
	public void setMaxInternalMarks(Map<String, String> maxInternalMarks) {
		this.maxInternalMarks = maxInternalMarks;
	}
	public String getTypeAdmission() {
		return typeAdmission;
	}
	public void setTypeAdmission(String typeAdmission) {
		this.typeAdmission = typeAdmission;
	}
	public String getDrNondr() {
		return drNondr;
	}
	public void setDrNondr(String drNondr) {
		this.drNondr = drNondr;
	}
	public Integer getUnitStrength() {
		return unitStrength;
	}
	public void setUnitStrength(Integer unitStrength) {
		this.unitStrength = unitStrength;
	}
	public Integer getDisplayOrder() {
		return displayOrder;
	}
	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}
	@Override
	public String toString() {
		return "ItiTradeMaster [tradeShort=" + tradeShort + ", tradeName=" + tradeName + ", durationyrs=" + durationyrs
				+ ", engNonengg=" + engNonengg + ", minQual=" + minQual + ", tradeFreeze=" + tradeFreeze
				+ ", convApproval=" + convApproval + ", tradeCode=" + tradeCode + ", maxInternalMarks="
				+ maxInternalMarks + ", typeAdmission=" + typeAdmission + ", drNondr=" + drNondr + ", unitStrength="
				+ unitStrength + ", displayOrder=" + displayOrder + "]";
	}
	
	
	
}
