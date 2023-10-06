package com.iti.entity.placements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "placements_schedules", schema = "placements")
public class PlcmtScheduleEntry {
	
	@Id
	@GeneratedValue
	private Long plcmtId;
	
	private Long scheduleId;
	private String scheduleType;
	private String scheduleDate;
	private String scheduleLocation;
	private String scheduleDesc;
	private String dist_code;
	
	
	
	
	
	public PlcmtScheduleEntry(Long plcmtId, Long scheduleId, String scheduleType, String scheduleDate,
			String scheduleLocation, String scheduleDesc, String dist_code) {
		super();
		this.plcmtId = plcmtId;
		this.scheduleId = scheduleId;
		this.scheduleType = scheduleType;
		this.scheduleDate = scheduleDate;
		this.scheduleLocation = scheduleLocation;
		this.scheduleDesc = scheduleDesc;
		this.dist_code = dist_code;
	}
	public PlcmtScheduleEntry() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDist_code() {
		return dist_code;
	}
	public void setDist_code(String dist_code) {
		this.dist_code = dist_code;
	}
	public Long getPlcmtId() {
		return plcmtId;
	}
	public void setPlcmtId(Long plcmtId) {
		this.plcmtId = plcmtId;
	}
	public Long getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(Long scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getScheduleType() {
		return scheduleType;
	}
	public void setScheduleType(String scheduleType) {
		this.scheduleType = scheduleType;
	}
	public String getScheduleDate() {
		return scheduleDate;
	}
	public void setScheduleDate(String scheduleDate) {
		this.scheduleDate = scheduleDate;
	}
	public String getScheduleLocation() {
		return scheduleLocation;
	}
	public void setScheduleLocation(String scheduleLocation) {
		this.scheduleLocation = scheduleLocation;
	}
	public String getScheduleDesc() {
		return scheduleDesc;
	}
	public void setScheduleDesc(String scheduleDesc) {
		this.scheduleDesc = scheduleDesc;
	}
	@Override
	public String toString() {
		return "PlcmtScheduleEntry [plcmtId=" + plcmtId + ", scheduleId=" + scheduleId + ", scheduleType="
				+ scheduleType + ", scheduleDate=" + scheduleDate + ", scheduleLocation=" + scheduleLocation
				+ ", scheduleDesc=" + scheduleDesc + ", dist_code=" + dist_code + "]";
	}
	
	
	
	

}
