package com.iti.entity.placements;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "placements", schema = "placements")
public class Placement {

	@Id
	@GeneratedValue
	private Long pid;
	private String adm_num;
	private String name;
	private String dist_name;
	private String iti_name;
	private String year_of_admission;
	private String passmonth;
	private String passyear;

	private String ptype;

	private String pname_of_company;
	private String pstate;
	private String pdistrict;
	private String paddress;
	private String ppostname;
	private String psalary;
	private String phrno;
	private String ptrade;
	private String pstipendamt;
	private String paaprstartdate;
	private String paaprenddate;
	private String pcoursename;
	private String pclgname;
	private String pselfemp;
	private String pmonthincome;

	private String dist_code;
	private String iti_code;

	private String trade_code;
	private String trade_name;
	private String scheduleId;
	
	private String entry_by;
	private String entry_distcode;

	
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}

	 
	public Placement(Long pid, String adm_num, String name, String dist_name, String iti_name, String year_of_admission,
			String passmonth, String passyear, String ptype, String pname_of_company, String pstate, String pdistrict,
			String paddress, String ppostname, String psalary, String phrno, String ptrade, String pstipendamt,
			String paaprstartdate, String paaprenddate, String pcoursename, String pclgname, String pselfemp,
			String pmonthincome, String dist_code, String iti_code, String trade_code, String trade_name,
			String scheduleId, String entry_by, String entry_distcode) {
		super();
		this.pid = pid;
		this.adm_num = adm_num;
		this.name = name;
		this.dist_name = dist_name;
		this.iti_name = iti_name;
		this.year_of_admission = year_of_admission;
		this.passmonth = passmonth;
		this.passyear = passyear;
		this.ptype = ptype;
		this.pname_of_company = pname_of_company;
		this.pstate = pstate;
		this.pdistrict = pdistrict;
		this.paddress = paddress;
		this.ppostname = ppostname;
		this.psalary = psalary;
		this.phrno = phrno;
		this.ptrade = ptrade;
		this.pstipendamt = pstipendamt;
		this.paaprstartdate = paaprstartdate;
		this.paaprenddate = paaprenddate;
		this.pcoursename = pcoursename;
		this.pclgname = pclgname;
		this.pselfemp = pselfemp;
		this.pmonthincome = pmonthincome;
		this.dist_code = dist_code;
		this.iti_code = iti_code;
		this.trade_code = trade_code;
		this.trade_name = trade_name;
		this.scheduleId = scheduleId;
		this.entry_by = entry_by;
		this.entry_distcode = entry_distcode;
	}


	public String getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Long getPid() {
		return pid;
	}

	public String getEntry_distcode() {
		return entry_distcode;
	}


	public void setEntry_distcode(String entry_distcode) {
		this.entry_distcode = entry_distcode;
	}


	public void setPid(Long pid) {
		this.pid = pid;
	}

	public String getEntry_by() {
		return entry_by;
	}

	public void setEntry_by(String entry_by) {
		this.entry_by = entry_by;
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

	public String getDist_name() {
		return dist_name;
	}

	public void setDist_name(String dist_name) {
		this.dist_name = dist_name;
	}

	public String getIti_name() {
		return iti_name;
	}

	public void setIti_name(String iti_name) {
		this.iti_name = iti_name;
	}

	public String getYear_of_admission() {
		return year_of_admission;
	}

	public void setYear_of_admission(String year_of_admission) {
		this.year_of_admission = year_of_admission;
	}

	public String getPassmonth() {
		return passmonth;
	}

	public void setPassmonth(String passmonth) {
		this.passmonth = passmonth;
	}

	public String getPassyear() {
		return passyear;
	}

	public void setPassyear(String passyear) {
		this.passyear = passyear;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getPname_of_company() {
		return pname_of_company;
	}

	public void setPname_of_company(String pname_of_company) {
		this.pname_of_company = pname_of_company;
	}

	public String getPstate() {
		return pstate;
	}

	public void setPstate(String pstate) {
		this.pstate = pstate;
	}

	public String getPdistrict() {
		return pdistrict;
	}

	public void setPdistrict(String pdistrict) {
		this.pdistrict = pdistrict;
	}

	public String getPaddress() {
		return paddress;
	}

	public void setPaddress(String paddress) {
		this.paddress = paddress;
	}

	public String getPpostname() {
		return ppostname;
	}

	public void setPpostname(String ppostname) {
		this.ppostname = ppostname;
	}

	public String getPsalary() {
		return psalary;
	}

	public void setPsalary(String psalary) {
		this.psalary = psalary;
	}

	public String getPhrno() {
		return phrno;
	}

	public void setPhrno(String phrno) {
		this.phrno = phrno;
	}

	public String getPtrade() {
		return ptrade;
	}

	public void setPtrade(String ptrade) {
		this.ptrade = ptrade;
	}

	public String getPstipendamt() {
		return pstipendamt;
	}

	public void setPstipendamt(String pstipendamt) {
		this.pstipendamt = pstipendamt;
	}

	public String getPaaprstartdate() {
		return paaprstartdate;
	}

	public void setPaaprstartdate(String paaprstartdate) {
		this.paaprstartdate = paaprstartdate;
	}

	public String getPaaprenddate() {
		return paaprenddate;
	}

	public void setPaaprenddate(String paaprenddate) {
		this.paaprenddate = paaprenddate;
	}

	public String getPcoursename() {
		return pcoursename;
	}

	public void setPcoursename(String pcoursename) {
		this.pcoursename = pcoursename;
	}

	public String getPclgname() {
		return pclgname;
	}

	public void setPclgname(String pclgname) {
		this.pclgname = pclgname;
	}

	public String getPselfemp() {
		return pselfemp;
	}

	public void setPselfemp(String pselfemp) {
		this.pselfemp = pselfemp;
	}

	public String getPmonthincome() {
		return pmonthincome;
	}

	public void setPmonthincome(String pmonthincome) {
		this.pmonthincome = pmonthincome;
	}

	public String getDist_code() {
		return dist_code;
	}

	public void setDist_code(String dist_code) {
		this.dist_code = dist_code;
	}

	public String getIti_code() {
		return iti_code;
	}

	public void setIti_code(String iti_code) {
		this.iti_code = iti_code;
	}

	public String getTrade_code() {
		return trade_code;
	}

	public void setTrade_code(String trade_code) {
		this.trade_code = trade_code;
	}

	public String getTrade_name() {
		return trade_name;
	}

	public void setTrade_name(String trade_name) {
		this.trade_name = trade_name;
	}


	@Override
	public String toString() {
		return "Placement [pid=" + pid + ", adm_num=" + adm_num + ", name=" + name + ", dist_name=" + dist_name
				+ ", iti_name=" + iti_name + ", year_of_admission=" + year_of_admission + ", passmonth=" + passmonth
				+ ", passyear=" + passyear + ", ptype=" + ptype + ", pname_of_company=" + pname_of_company + ", pstate="
				+ pstate + ", pdistrict=" + pdistrict + ", paddress=" + paddress + ", ppostname=" + ppostname
				+ ", psalary=" + psalary + ", phrno=" + phrno + ", ptrade=" + ptrade + ", pstipendamt=" + pstipendamt
				+ ", paaprstartdate=" + paaprstartdate + ", paaprenddate=" + paaprenddate + ", pcoursename="
				+ pcoursename + ", pclgname=" + pclgname + ", pselfemp=" + pselfemp + ", pmonthincome=" + pmonthincome
				+ ", dist_code=" + dist_code + ", iti_code=" + iti_code + ", trade_code=" + trade_code + ", trade_name="
				+ trade_name + ", scheduleId=" + scheduleId + ", entry_by=" + entry_by + ", entry_distcode="
				+ entry_distcode + "]";
	}

 

	 

}