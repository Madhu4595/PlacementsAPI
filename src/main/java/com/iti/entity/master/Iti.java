package com.iti.entity.master;

import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.iti.util.HstoreDataType;

@Entity
public class Iti {

	@Id
	private String itiCode;
	private String itiName;
	private String govt;
	private String distCode;
	private String itiNoniti;
	private String olditicode;
	private Integer capacity;
	private Integer allocated;
	private Integer remainingCapacity;
	private Integer totStrength;
	private Timestamp ts;
	private String ipAddress;
	private String username;
	private String password;
	private String address;
	private String cityTown;
	private Integer MandalCode;
	private String email;
	private String principalname;
	private Integer roleId;
	private String description;
	private String mobile;
	private String landlinenumber;
	private String yearEst;
	private Integer trno;
	private String itiType;
	private String appcode;
	private boolean vtp;
	private String vtpRegno;
	private String land;
	private String builtupArea;
	private Integer noofToilets;
	private boolean availableDrinkingwater;
	private Integer noofLabs;
	private Integer noofClassrooms;
	private Integer examconductingStrength;
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> strength = new HashMap<>();
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> strengthVacant = new HashMap<>();
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> strengthFill = new HashMap<>();
	
	private boolean admissionPermission;
	private String dgetItiCode;
	private String region;
	private String urbanRural;
	private String webItiCode;
	private boolean toolStatus;
	private String rec_status;
	private String website;
	private String gradePoint;
	private String ncvtCode;
	private Integer pinCode;
	public Iti() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Iti(String itiCode, String itiName, String govt, String distCode, String itiNoniti, String olditicode,
			Integer capacity, Integer allocated, Integer remainingCapacity, Integer totStrength, Timestamp ts,
			String ipAddress, String username, String password, String address, String cityTown, Integer mandalCode,
			String email, String principalname, Integer roleId, String description, String mobile,
			String landlinenumber, String yearEst, Integer trno, String itiType, String appcode, boolean vtp,
			String vtpRegno, String land, String builtupArea, Integer noofToilets, boolean availableDrinkingwater,
			Integer noofLabs, Integer noofClassrooms, Integer examconductingStrength, Map<String, String> strength,
			Map<String, String> strengthVacant, Map<String, String> strengthFill, boolean admissionPermission,
			String dgetItiCode, String region, String urbanRural, String webItiCode, boolean toolStatus,
			String rec_status, String website, String gradePoint, String ncvtCode, Integer pinCode) {
		super();
		this.itiCode = itiCode;
		this.itiName = itiName;
		this.govt = govt;
		this.distCode = distCode;
		this.itiNoniti = itiNoniti;
		this.olditicode = olditicode;
		this.capacity = capacity;
		this.allocated = allocated;
		this.remainingCapacity = remainingCapacity;
		this.totStrength = totStrength;
		this.ts = ts;
		this.ipAddress = ipAddress;
		this.username = username;
		this.password = password;
		this.address = address;
		this.cityTown = cityTown;
		MandalCode = mandalCode;
		this.email = email;
		this.principalname = principalname;
		this.roleId = roleId;
		this.description = description;
		this.mobile = mobile;
		this.landlinenumber = landlinenumber;
		this.yearEst = yearEst;
		this.trno = trno;
		this.itiType = itiType;
		this.appcode = appcode;
		this.vtp = vtp;
		this.vtpRegno = vtpRegno;
		this.land = land;
		this.builtupArea = builtupArea;
		this.noofToilets = noofToilets;
		this.availableDrinkingwater = availableDrinkingwater;
		this.noofLabs = noofLabs;
		this.noofClassrooms = noofClassrooms;
		this.examconductingStrength = examconductingStrength;
		this.strength = strength;
		this.strengthVacant = strengthVacant;
		this.strengthFill = strengthFill;
		this.admissionPermission = admissionPermission;
		this.dgetItiCode = dgetItiCode;
		this.region = region;
		this.urbanRural = urbanRural;
		this.webItiCode = webItiCode;
		this.toolStatus = toolStatus;
		this.rec_status = rec_status;
		this.website = website;
		this.gradePoint = gradePoint;
		this.ncvtCode = ncvtCode;
		this.pinCode = pinCode;
	}
	public String getItiCode() {
		return itiCode;
	}
	public void setItiCode(String itiCode) {
		this.itiCode = itiCode;
	}
	public String getItiName() {
		return itiName;
	}
	public void setItiName(String itiName) {
		this.itiName = itiName;
	}
	public String getGovt() {
		return govt;
	}
	public void setGovt(String govt) {
		this.govt = govt;
	}
	public String getDistCode() {
		return distCode;
	}
	public void setDistCode(String distCode) {
		this.distCode = distCode;
	}
	public String getItiNoniti() {
		return itiNoniti;
	}
	public void setItiNoniti(String itiNoniti) {
		this.itiNoniti = itiNoniti;
	}
	public String getOlditicode() {
		return olditicode;
	}
	public void setOlditicode(String olditicode) {
		this.olditicode = olditicode;
	}
	public Integer getCapacity() {
		return capacity;
	}
	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
	}
	public Integer getAllocated() {
		return allocated;
	}
	public void setAllocated(Integer allocated) {
		this.allocated = allocated;
	}
	public Integer getRemainingCapacity() {
		return remainingCapacity;
	}
	public void setRemainingCapacity(Integer remainingCapacity) {
		this.remainingCapacity = remainingCapacity;
	}
	public Integer getTotStrength() {
		return totStrength;
	}
	public void setTotStrength(Integer totStrength) {
		this.totStrength = totStrength;
	}
	public Timestamp getTs() {
		return ts;
	}
	public void setTs(Timestamp ts) {
		this.ts = ts;
	}
	public String getIpAddress() {
		return ipAddress;
	}
	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCityTown() {
		return cityTown;
	}
	public void setCityTown(String cityTown) {
		this.cityTown = cityTown;
	}
	public Integer getMandalCode() {
		return MandalCode;
	}
	public void setMandalCode(Integer mandalCode) {
		MandalCode = mandalCode;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPrincipalname() {
		return principalname;
	}
	public void setPrincipalname(String principalname) {
		this.principalname = principalname;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLandlinenumber() {
		return landlinenumber;
	}
	public void setLandlinenumber(String landlinenumber) {
		this.landlinenumber = landlinenumber;
	}
	public String getYearEst() {
		return yearEst;
	}
	public void setYearEst(String yearEst) {
		this.yearEst = yearEst;
	}
	public Integer getTrno() {
		return trno;
	}
	public void setTrno(Integer trno) {
		this.trno = trno;
	}
	public String getItiType() {
		return itiType;
	}
	public void setItiType(String itiType) {
		this.itiType = itiType;
	}
	public String getAppcode() {
		return appcode;
	}
	public void setAppcode(String appcode) {
		this.appcode = appcode;
	}
	public boolean isVtp() {
		return vtp;
	}
	public void setVtp(boolean vtp) {
		this.vtp = vtp;
	}
	public String getVtpRegno() {
		return vtpRegno;
	}
	public void setVtpRegno(String vtpRegno) {
		this.vtpRegno = vtpRegno;
	}
	public String getLand() {
		return land;
	}
	public void setLand(String land) {
		this.land = land;
	}
	public String getBuiltupArea() {
		return builtupArea;
	}
	public void setBuiltupArea(String builtupArea) {
		this.builtupArea = builtupArea;
	}
	public Integer getNoofToilets() {
		return noofToilets;
	}
	public void setNoofToilets(Integer noofToilets) {
		this.noofToilets = noofToilets;
	}
	public boolean isavailableDrinkingwater() {
		return availableDrinkingwater;
	}
	public void setavailableDrinkingwater(boolean availableDrinkingwater) {
		this.availableDrinkingwater = availableDrinkingwater;
	}
	public Integer getNoofLabs() {
		return noofLabs;
	}
	public void setNoofLabs(Integer noofLabs) {
		this.noofLabs = noofLabs;
	}
	public Integer getNoofClassrooms() {
		return noofClassrooms;
	}
	public void setNoofClassrooms(Integer noofClassrooms) {
		this.noofClassrooms = noofClassrooms;
	}
	public Integer getExamconductingStrength() {
		return examconductingStrength;
	}
	public void setExamconductingStrength(Integer examconductingStrength) {
		this.examconductingStrength = examconductingStrength;
	}
	public Map<String, String> getStrength() {
		return strength;
	}
	public void setStrength(Map<String, String> strength) {
		this.strength = strength;
	}
	public Map<String, String> getStrengthVacant() {
		return strengthVacant;
	}
	public void setStrengthVacant(Map<String, String> strengthVacant) {
		this.strengthVacant = strengthVacant;
	}
	public Map<String, String> getStrengthFill() {
		return strengthFill;
	}
	public void setStrengthFill(Map<String, String> strengthFill) {
		this.strengthFill = strengthFill;
	}
	public boolean isAdmissionPermission() {
		return admissionPermission;
	}
	public void setAdmissionPermission(boolean admissionPermission) {
		this.admissionPermission = admissionPermission;
	}
	public String getDgetItiCode() {
		return dgetItiCode;
	}
	public void setDgetItiCode(String dgetItiCode) {
		this.dgetItiCode = dgetItiCode;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getUrbanRural() {
		return urbanRural;
	}
	public void setUrbanRural(String urbanRural) {
		this.urbanRural = urbanRural;
	}
	public String getWebItiCode() {
		return webItiCode;
	}
	public void setWebItiCode(String webItiCode) {
		this.webItiCode = webItiCode;
	}
	public boolean isToolStatus() {
		return toolStatus;
	}
	public void setToolStatus(boolean toolStatus) {
		this.toolStatus = toolStatus;
	}
	public String getRec_status() {
		return rec_status;
	}
	public void setRec_status(String rec_status) {
		this.rec_status = rec_status;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getGradePoint() {
		return gradePoint;
	}
	public void setGradePoint(String gradePoint) {
		this.gradePoint = gradePoint;
	}
	public String getNcvtCode() {
		return ncvtCode;
	}
	public void setNcvtCode(String ncvtCode) {
		this.ncvtCode = ncvtCode;
	}
	public Integer getPinCode() {
		return pinCode;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Iti [itiCode=" + itiCode + ", itiName=" + itiName + ", govt=" + govt + ", distCode=" + distCode
				+ ", itiNoniti=" + itiNoniti + ", olditicode=" + olditicode + ", capacity=" + capacity + ", allocated="
				+ allocated + ", remainingCapacity=" + remainingCapacity + ", totStrength=" + totStrength + ", ts=" + ts
				+ ", ipAddress=" + ipAddress + ", username=" + username + ", password=" + password + ", address="
				+ address + ", cityTown=" + cityTown + ", MandalCode=" + MandalCode + ", email=" + email
				+ ", principalname=" + principalname + ", roleId=" + roleId + ", description=" + description
				+ ", mobile=" + mobile + ", landlinenumber=" + landlinenumber + ", yearEst=" + yearEst + ", trno="
				+ trno + ", itiType=" + itiType + ", appcode=" + appcode + ", vtp=" + vtp + ", vtpRegno=" + vtpRegno
				+ ", land=" + land + ", builtupArea=" + builtupArea + ", noofToilets=" + noofToilets
				+ ", availableDrinkingwater=" + availableDrinkingwater + ", noofLabs=" + noofLabs + ", noofClassrooms="
				+ noofClassrooms + ", examconductingStrength=" + examconductingStrength + ", strength=" + strength
				+ ", strengthVacant=" + strengthVacant + ", strengthFill=" + strengthFill + ", admissionPermission="
				+ admissionPermission + ", dgetItiCode=" + dgetItiCode + ", region=" + region + ", urbanRural="
				+ urbanRural + ", webItiCode=" + webItiCode + ", toolStatus=" + toolStatus + ", rec_status="
				+ rec_status + ", website=" + website + ", gradePoint=" + gradePoint + ", ncvtCode=" + ncvtCode
				+ ", pinCode=" + pinCode + "]";
	}
	
}
