package com.iti.model;

public class AdmissionModel {

	private String roleid;
	private String ins_code;
	private String userName;

	private String adm_num;
	private String name;
	private String iti_code;
	private String iti_name;
	private String dist_code;
	private String dist_name;
	private String year_of_admission;
	private String trade_name;
	private String trade_code;
	private String secretkey;
	private String message;
	private String action;
	
	//for placement schedule entry
	private Long scheduleId;
	private String scheduleType;
	private String scheduleDate;
	private String scheduleLocation;
	private String scheduleDesc;
	
	//plcmtType
	private String plcmtType;
	
	
	

	public String getPlcmtType() {
		return plcmtType;
	}

	public void setPlcmtType(String plcmtType) {
		this.plcmtType = plcmtType;
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
 

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getIns_code() {
		return ins_code;
	}

	public void setIns_code(String ins_code) {
		this.ins_code = ins_code;
	}

	public String getUserName() {
		return userName;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getAdm_num() {
		return adm_num;
	}

	public void setAdm_num(String adm_num) {
		this.adm_num = adm_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIti_code() {
		return iti_code;
	}

	public void setIti_code(String iti_code) {
		this.iti_code = iti_code;
	}

	public String getIti_name() {
		return iti_name;
	}

	public void setIti_name(String iti_name) {
		this.iti_name = iti_name;
	}

	public String getDist_code() {
		return dist_code;
	}

	public void setDist_code(String dist_code) {
		this.dist_code = dist_code;
	}

	public String getDist_name() {
		return dist_name;
	}

	public void setDist_name(String dist_name) {
		this.dist_name = dist_name;
	}

	public String getYear_of_admission() {
		return year_of_admission;
	}

	public void setYear_of_admission(String year_of_admission) {
		this.year_of_admission = year_of_admission;
	}

	public String getTrade_name() {
		return trade_name;
	}

	public void setTrade_name(String trade_name) {
		this.trade_name = trade_name;
	}

	public String getTrade_code() {
		return trade_code;
	}

	public void setTrade_code(String trade_code) {
		this.trade_code = trade_code;
	}

	public String getSecretkey() {
		return secretkey;
	}

	public void setSecretkey(String secretkey) {
		this.secretkey = secretkey;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Admission [roleid=" + roleid + ", ins_code=" + ins_code + ", userName=" + userName + ", adm_num="
				+ adm_num + ", name=" + name + ", iti_code=" + iti_code + ", iti_name=" + iti_name + ", dist_code="
				+ dist_code + ", dist_name=" + dist_name + ", year_of_admission=" + year_of_admission + ", trade_name="
				+ trade_name + ", trade_code=" + trade_code + ", secretkey=" + secretkey + ", message=" + message
				+ ", action=" + action + ", scheduleId=" + scheduleId + ", scheduleType=" + scheduleType
				+ ", scheduleDate=" + scheduleDate + ", scheduleLocation=" + scheduleLocation + ", scheduleDesc="
				+ scheduleDesc + ", plcmtType=" + plcmtType + "]";
	}

}

