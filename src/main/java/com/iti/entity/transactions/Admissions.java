package com.iti.entity.transactions;


import java.sql.Date;
import java.sql.Timestamp;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.iti.util.HstoreDataType;

@Entity
@Table(name="iti_admissions", schema = "admissions")
public class Admissions {
	@Id
	private String regid;
	private String name;
	private String fname;
	private String addr;
	private String mname;
	private Long phno;
	private String adarno;
	private String gender;
	private String caste;
	private Boolean ssc_passed;
	private Boolean inter_passed;
	private Integer inter_marks;
	private String local;
	private Boolean phc;
	private Boolean exservice;
	private String iti_code;
	private String admNum;
	private String res_category;
	private String year_of_admission;
	private Integer current_year;
	private String mode_adm;
	private Date fromd_training;
	private Date tod_training;
	private Integer trade_code;
	private String dist_code;
	private String olddist_code;
	private String olditi_code;
	private String attendance;
	private Date dob;
	private String pincode;
	private String idmarks1;
	private String idmarks2;
	private Long trno;
	private String ssc_regno;
	private String ssc_board;
	private String ssc_year;
	private String ssc_month;
	private Date date_of_admission;
	private String type_admission;
	private Integer phase;
	private String regno;
	private String estcode;
	private String center_code;
	private String newadmnum;
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> int_marks = new HashMap<>();
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> tot_marks = new HashMap<>();
	
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> year_of_attempt = new HashMap<>();
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> result = new HashMap<>();
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> grace_marks = new HashMap<>();
	
	private Boolean final_result;
	private String final_year_of_pass;
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> ext_marks = new HashMap<>();
	
	private Integer attempt_no;
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> categories = new HashMap<>();
	
	private String sem_nonsem;
	private String dgettrade_code;
	private String noof_sems;
	private String finaltrade_code;
	private String engg_nonengg;
	private String htno;
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> paper_result = new HashMap<>();
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> paper_tot_marks = new HashMap<>();
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> sem_paper_result = new HashMap<>();
	
	private Boolean sem_paper_finalresult; 
	private String current_sem;
	private String oldhtno;
	private String remarks;
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> year_of_pass = new HashMap<>();
	
	private Integer est_code;
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> certificate_number = new HashMap<>();
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> sem_finalresult = new HashMap<>();
	
	@Column(columnDefinition = "hstore")
	@Convert(converter = HstoreDataType.class)
	private Map<String, String> sem_wise_attempt_no = new HashMap<>();
	
	private String email_id;
	private String shift;
	private String unit;
	private String pwd_category;
	private Boolean economic_weaker_section;
	private Boolean is_trainee_dual_mode;
	private String rec_status;
	private Timestamp updateddt;
	public Admissions() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admissions(String regid, String name, String fname, String addr, String mname, Long phno, String adarno,
			String gender, String caste, Boolean ssc_passed, Boolean inter_passed, Integer inter_marks, String local,
			Boolean phc, Boolean exservice, String iti_code, String admNum, String res_category,
			String year_of_admission, Integer current_year, String mode_adm, Date fromd_training, Date tod_training,
			Integer trade_code, String dist_code, String olddist_code, String olditi_code, String attendance, Date dob,
			String pincode, String idmarks1, String idmarks2, Long trno, String ssc_regno, String ssc_board,
			String ssc_year, String ssc_month, Date date_of_admission, String type_admission, Integer phase,
			String regno, String estcode, String center_code, String newadmnum, Map<String, String> int_marks,
			Map<String, String> tot_marks, Map<String, String> year_of_attempt, Map<String, String> result,
			Map<String, String> grace_marks, Boolean final_result, String final_year_of_pass,
			Map<String, String> ext_marks, Integer attempt_no, Map<String, String> categories, String sem_nonsem,
			String dgettrade_code, String noof_sems, String finaltrade_code, String engg_nonengg, String htno,
			Map<String, String> paper_result, Map<String, String> paper_tot_marks, Map<String, String> sem_paper_result,
			Boolean sem_paper_finalresult, String current_sem, String oldhtno, String remarks,
			Map<String, String> year_of_pass, Integer est_code, Map<String, String> certificate_number,
			Map<String, String> sem_finalresult, Map<String, String> sem_wise_attempt_no, String email_id, String shift,
			String unit, String pwd_category, Boolean economic_weaker_section, Boolean is_trainee_dual_mode,
			String rec_status, Timestamp updateddt) {
		super();
		this.regid = regid;
		this.name = name;
		this.fname = fname;
		this.addr = addr;
		this.mname = mname;
		this.phno = phno;
		this.adarno = adarno;
		this.gender = gender;
		this.caste = caste;
		this.ssc_passed = ssc_passed;
		this.inter_passed = inter_passed;
		this.inter_marks = inter_marks;
		this.local = local;
		this.phc = phc;
		this.exservice = exservice;
		this.iti_code = iti_code;
		this.admNum = admNum;
		this.res_category = res_category;
		this.year_of_admission = year_of_admission;
		this.current_year = current_year;
		this.mode_adm = mode_adm;
		this.fromd_training = fromd_training;
		this.tod_training = tod_training;
		this.trade_code = trade_code;
		this.dist_code = dist_code;
		this.olddist_code = olddist_code;
		this.olditi_code = olditi_code;
		this.attendance = attendance;
		this.dob = dob;
		this.pincode = pincode;
		this.idmarks1 = idmarks1;
		this.idmarks2 = idmarks2;
		this.trno = trno;
		this.ssc_regno = ssc_regno;
		this.ssc_board = ssc_board;
		this.ssc_year = ssc_year;
		this.ssc_month = ssc_month;
		this.date_of_admission = date_of_admission;
		this.type_admission = type_admission;
		this.phase = phase;
		this.regno = regno;
		this.estcode = estcode;
		this.center_code = center_code;
		this.newadmnum = newadmnum;
		this.int_marks = int_marks;
		this.tot_marks = tot_marks;
		this.year_of_attempt = year_of_attempt;
		this.result = result;
		this.grace_marks = grace_marks;
		this.final_result = final_result;
		this.final_year_of_pass = final_year_of_pass;
		this.ext_marks = ext_marks;
		this.attempt_no = attempt_no;
		this.categories = categories;
		this.sem_nonsem = sem_nonsem;
		this.dgettrade_code = dgettrade_code;
		this.noof_sems = noof_sems;
		this.finaltrade_code = finaltrade_code;
		this.engg_nonengg = engg_nonengg;
		this.htno = htno;
		this.paper_result = paper_result;
		this.paper_tot_marks = paper_tot_marks;
		this.sem_paper_result = sem_paper_result;
		this.sem_paper_finalresult = sem_paper_finalresult;
		this.current_sem = current_sem;
		this.oldhtno = oldhtno;
		this.remarks = remarks;
		this.year_of_pass = year_of_pass;
		this.est_code = est_code;
		this.certificate_number = certificate_number;
		this.sem_finalresult = sem_finalresult;
		this.sem_wise_attempt_no = sem_wise_attempt_no;
		this.email_id = email_id;
		this.shift = shift;
		this.unit = unit;
		this.pwd_category = pwd_category;
		this.economic_weaker_section = economic_weaker_section;
		this.is_trainee_dual_mode = is_trainee_dual_mode;
		this.rec_status = rec_status;
		this.updateddt = updateddt;
	}
	public String getRegid() {
		return regid;
	}
	public void setRegid(String regid) {
		this.regid = regid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public Long getPhno() {
		return phno;
	}
	public void setPhno(Long phno) {
		this.phno = phno;
	}
	public String getAdarno() {
		return adarno;
	}
	public void setAdarno(String adarno) {
		this.adarno = adarno;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public Boolean getSsc_passed() {
		return ssc_passed;
	}
	public void setSsc_passed(Boolean ssc_passed) {
		this.ssc_passed = ssc_passed;
	}
	public Boolean getInter_passed() {
		return inter_passed;
	}
	public void setInter_passed(Boolean inter_passed) {
		this.inter_passed = inter_passed;
	}
	public Integer getInter_marks() {
		return inter_marks;
	}
	public void setInter_marks(Integer inter_marks) {
		this.inter_marks = inter_marks;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public Boolean getPhc() {
		return phc;
	}
	public void setPhc(Boolean phc) {
		this.phc = phc;
	}
	public Boolean getExservice() {
		return exservice;
	}
	public void setExservice(Boolean exservice) {
		this.exservice = exservice;
	}
	public String getIti_code() {
		return iti_code;
	}
	public void setIti_code(String iti_code) {
		this.iti_code = iti_code;
	}
	public String getAdmNum() {
		return admNum;
	}
	public void setAdmNum(String admNum) {
		this.admNum = admNum;
	}
	public String getRes_category() {
		return res_category;
	}
	public void setRes_category(String res_category) {
		this.res_category = res_category;
	}
	public String getYear_of_admission() {
		return year_of_admission;
	}
	public void setYear_of_admission(String year_of_admission) {
		this.year_of_admission = year_of_admission;
	}
	public Integer getCurrent_year() {
		return current_year;
	}
	public void setCurrent_year(Integer current_year) {
		this.current_year = current_year;
	}
	public String getMode_adm() {
		return mode_adm;
	}
	public void setMode_adm(String mode_adm) {
		this.mode_adm = mode_adm;
	}
	public Date getFromd_training() {
		return fromd_training;
	}
	public void setFromd_training(Date fromd_training) {
		this.fromd_training = fromd_training;
	}
	public Date getTod_training() {
		return tod_training;
	}
	public void setTod_training(Date tod_training) {
		this.tod_training = tod_training;
	}
	public Integer getTrade_code() {
		return trade_code;
	}
	public void setTrade_code(Integer trade_code) {
		this.trade_code = trade_code;
	}
	public String getDist_code() {
		return dist_code;
	}
	public void setDist_code(String dist_code) {
		this.dist_code = dist_code;
	}
	public String getOlddist_code() {
		return olddist_code;
	}
	public void setOlddist_code(String olddist_code) {
		this.olddist_code = olddist_code;
	}
	public String getOlditi_code() {
		return olditi_code;
	}
	public void setOlditi_code(String olditi_code) {
		this.olditi_code = olditi_code;
	}
	public String getAttendance() {
		return attendance;
	}
	public void setAttendance(String attendance) {
		this.attendance = attendance;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getIdmarks1() {
		return idmarks1;
	}
	public void setIdmarks1(String idmarks1) {
		this.idmarks1 = idmarks1;
	}
	public String getIdmarks2() {
		return idmarks2;
	}
	public void setIdmarks2(String idmarks2) {
		this.idmarks2 = idmarks2;
	}
	public Long getTrno() {
		return trno;
	}
	public void setTrno(Long trno) {
		this.trno = trno;
	}
	public String getSsc_regno() {
		return ssc_regno;
	}
	public void setSsc_regno(String ssc_regno) {
		this.ssc_regno = ssc_regno;
	}
	public String getSsc_board() {
		return ssc_board;
	}
	public void setSsc_board(String ssc_board) {
		this.ssc_board = ssc_board;
	}
	public String getSsc_year() {
		return ssc_year;
	}
	public void setSsc_year(String ssc_year) {
		this.ssc_year = ssc_year;
	}
	public String getSsc_month() {
		return ssc_month;
	}
	public void setSsc_month(String ssc_month) {
		this.ssc_month = ssc_month;
	}
	public Date getDate_of_admission() {
		return date_of_admission;
	}
	public void setDate_of_admission(Date date_of_admission) {
		this.date_of_admission = date_of_admission;
	}
	public String getType_admission() {
		return type_admission;
	}
	public void setType_admission(String type_admission) {
		this.type_admission = type_admission;
	}
	public Integer getPhase() {
		return phase;
	}
	public void setPhase(Integer phase) {
		this.phase = phase;
	}
	public String getRegno() {
		return regno;
	}
	public void setRegno(String regno) {
		this.regno = regno;
	}
	public String getEstcode() {
		return estcode;
	}
	public void setEstcode(String estcode) {
		this.estcode = estcode;
	}
	public String getCenter_code() {
		return center_code;
	}
	public void setCenter_code(String center_code) {
		this.center_code = center_code;
	}
	public String getNewadmnum() {
		return newadmnum;
	}
	public void setNewadmnum(String newadmnum) {
		this.newadmnum = newadmnum;
	}
	public Map<String, String> getInt_marks() {
		return int_marks;
	}
	public void setInt_marks(Map<String, String> int_marks) {
		this.int_marks = int_marks;
	}
	public Map<String, String> getTot_marks() {
		return tot_marks;
	}
	public void setTot_marks(Map<String, String> tot_marks) {
		this.tot_marks = tot_marks;
	}
	public Map<String, String> getYear_of_attempt() {
		return year_of_attempt;
	}
	public void setYear_of_attempt(Map<String, String> year_of_attempt) {
		this.year_of_attempt = year_of_attempt;
	}
	public Map<String, String> getResult() {
		return result;
	}
	public void setResult(Map<String, String> result) {
		this.result = result;
	}
	public Map<String, String> getGrace_marks() {
		return grace_marks;
	}
	public void setGrace_marks(Map<String, String> grace_marks) {
		this.grace_marks = grace_marks;
	}
	public Boolean getFinal_result() {
		return final_result;
	}
	public void setFinal_result(Boolean final_result) {
		this.final_result = final_result;
	}
	public String getFinal_year_of_pass() {
		return final_year_of_pass;
	}
	public void setFinal_year_of_pass(String final_year_of_pass) {
		this.final_year_of_pass = final_year_of_pass;
	}
	public Map<String, String> getExt_marks() {
		return ext_marks;
	}
	public void setExt_marks(Map<String, String> ext_marks) {
		this.ext_marks = ext_marks;
	}
	public Integer getAttempt_no() {
		return attempt_no;
	}
	public void setAttempt_no(Integer attempt_no) {
		this.attempt_no = attempt_no;
	}
	public Map<String, String> getCategories() {
		return categories;
	}
	public void setCategories(Map<String, String> categories) {
		this.categories = categories;
	}
	public String getSem_nonsem() {
		return sem_nonsem;
	}
	public void setSem_nonsem(String sem_nonsem) {
		this.sem_nonsem = sem_nonsem;
	}
	public String getDgettrade_code() {
		return dgettrade_code;
	}
	public void setDgettrade_code(String dgettrade_code) {
		this.dgettrade_code = dgettrade_code;
	}
	public String getNoof_sems() {
		return noof_sems;
	}
	public void setNoof_sems(String noof_sems) {
		this.noof_sems = noof_sems;
	}
	public String getFinaltrade_code() {
		return finaltrade_code;
	}
	public void setFinaltrade_code(String finaltrade_code) {
		this.finaltrade_code = finaltrade_code;
	}
	public String getEngg_nonengg() {
		return engg_nonengg;
	}
	public void setEngg_nonengg(String engg_nonengg) {
		this.engg_nonengg = engg_nonengg;
	}
	public String getHtno() {
		return htno;
	}
	public void setHtno(String htno) {
		this.htno = htno;
	}
	public Map<String, String> getPaper_result() {
		return paper_result;
	}
	public void setPaper_result(Map<String, String> paper_result) {
		this.paper_result = paper_result;
	}
	public Map<String, String> getPaper_tot_marks() {
		return paper_tot_marks;
	}
	public void setPaper_tot_marks(Map<String, String> paper_tot_marks) {
		this.paper_tot_marks = paper_tot_marks;
	}
	public Map<String, String> getSem_paper_result() {
		return sem_paper_result;
	}
	public void setSem_paper_result(Map<String, String> sem_paper_result) {
		this.sem_paper_result = sem_paper_result;
	}
	public Boolean getSem_paper_finalresult() {
		return sem_paper_finalresult;
	}
	public void setSem_paper_finalresult(Boolean sem_paper_finalresult) {
		this.sem_paper_finalresult = sem_paper_finalresult;
	}
	public String getCurrent_sem() {
		return current_sem;
	}
	public void setCurrent_sem(String current_sem) {
		this.current_sem = current_sem;
	}
	public String getOldhtno() {
		return oldhtno;
	}
	public void setOldhtno(String oldhtno) {
		this.oldhtno = oldhtno;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public Map<String, String> getYear_of_pass() {
		return year_of_pass;
	}
	public void setYear_of_pass(Map<String, String> year_of_pass) {
		this.year_of_pass = year_of_pass;
	}
	public Integer getEst_code() {
		return est_code;
	}
	public void setEst_code(Integer est_code) {
		this.est_code = est_code;
	}
	public Map<String, String> getCertificate_number() {
		return certificate_number;
	}
	public void setCertificate_number(Map<String, String> certificate_number) {
		this.certificate_number = certificate_number;
	}
	public Map<String, String> getSem_finalresult() {
		return sem_finalresult;
	}
	public void setSem_finalresult(Map<String, String> sem_finalresult) {
		this.sem_finalresult = sem_finalresult;
	}
	public Map<String, String> getSem_wise_attempt_no() {
		return sem_wise_attempt_no;
	}
	public void setSem_wise_attempt_no(Map<String, String> sem_wise_attempt_no) {
		this.sem_wise_attempt_no = sem_wise_attempt_no;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getShift() {
		return shift;
	}
	public void setShift(String shift) {
		this.shift = shift;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	public String getPwd_category() {
		return pwd_category;
	}
	public void setPwd_category(String pwd_category) {
		this.pwd_category = pwd_category;
	}
	public Boolean getEconomic_weaker_section() {
		return economic_weaker_section;
	}
	public void setEconomic_weaker_section(Boolean economic_weaker_section) {
		this.economic_weaker_section = economic_weaker_section;
	}
	public Boolean getIs_trainee_dual_mode() {
		return is_trainee_dual_mode;
	}
	public void setIs_trainee_dual_mode(Boolean is_trainee_dual_mode) {
		this.is_trainee_dual_mode = is_trainee_dual_mode;
	}
	public String getRec_status() {
		return rec_status;
	}
	public void setRec_status(String rec_status) {
		this.rec_status = rec_status;
	}
	public Timestamp getUpdateddt() {
		return updateddt;
	}
	public void setUpdateddt(Timestamp updateddt) {
		this.updateddt = updateddt;
	}
	@Override
	public String toString() {
		return "Admissions [regid=" + regid + ", name=" + name + ", fname=" + fname + ", addr=" + addr + ", mname="
				+ mname + ", phno=" + phno + ", adarno=" + adarno + ", gender=" + gender + ", caste=" + caste
				+ ", ssc_passed=" + ssc_passed + ", inter_passed=" + inter_passed + ", inter_marks=" + inter_marks
				+ ", local=" + local + ", phc=" + phc + ", exservice=" + exservice + ", iti_code=" + iti_code
				+ ", admNum=" + admNum + ", res_category=" + res_category + ", year_of_admission=" + year_of_admission
				+ ", current_year=" + current_year + ", mode_adm=" + mode_adm + ", fromd_training=" + fromd_training
				+ ", tod_training=" + tod_training + ", trade_code=" + trade_code + ", dist_code=" + dist_code
				+ ", olddist_code=" + olddist_code + ", olditi_code=" + olditi_code + ", attendance=" + attendance
				+ ", dob=" + dob + ", pincode=" + pincode + ", idmarks1=" + idmarks1 + ", idmarks2=" + idmarks2
				+ ", trno=" + trno + ", ssc_regno=" + ssc_regno + ", ssc_board=" + ssc_board + ", ssc_year=" + ssc_year
				+ ", ssc_month=" + ssc_month + ", date_of_admission=" + date_of_admission + ", type_admission="
				+ type_admission + ", phase=" + phase + ", regno=" + regno + ", estcode=" + estcode + ", center_code="
				+ center_code + ", newadmnum=" + newadmnum + ", int_marks=" + int_marks + ", tot_marks=" + tot_marks
				+ ", year_of_attempt=" + year_of_attempt + ", result=" + result + ", grace_marks=" + grace_marks
				+ ", final_result=" + final_result + ", final_year_of_pass=" + final_year_of_pass + ", ext_marks="
				+ ext_marks + ", attempt_no=" + attempt_no + ", categories=" + categories + ", sem_nonsem=" + sem_nonsem
				+ ", dgettrade_code=" + dgettrade_code + ", noof_sems=" + noof_sems + ", finaltrade_code="
				+ finaltrade_code + ", engg_nonengg=" + engg_nonengg + ", htno=" + htno + ", paper_result="
				+ paper_result + ", paper_tot_marks=" + paper_tot_marks + ", sem_paper_result=" + sem_paper_result
				+ ", sem_paper_finalresult=" + sem_paper_finalresult + ", current_sem=" + current_sem + ", oldhtno="
				+ oldhtno + ", remarks=" + remarks + ", year_of_pass=" + year_of_pass + ", est_code=" + est_code
				+ ", certificate_number=" + certificate_number + ", sem_finalresult=" + sem_finalresult
				+ ", sem_wise_attempt_no=" + sem_wise_attempt_no + ", email_id=" + email_id + ", shift=" + shift
				+ ", unit=" + unit + ", pwd_category=" + pwd_category + ", economic_weaker_section="
				+ economic_weaker_section + ", is_trainee_dual_mode=" + is_trainee_dual_mode + ", rec_status="
				+ rec_status + ", updateddt=" + updateddt + "]";
	}
	
	
}


