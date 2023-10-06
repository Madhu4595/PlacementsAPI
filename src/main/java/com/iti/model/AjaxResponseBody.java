package com.iti.model;

import java.util.List;

import com.iti.entity.master.Dist_mast;
import com.iti.entity.master.ItiTradeMaster;
import com.iti.entity.master.States_mast;



public class AjaxResponseBody {

	List<Dist_mast> dists;
	List<States_mast> states;
	List<ItiTradeMaster> trades;
	
	String msg;
	AdmissionModel result;
	String jwtToken;
	
//	List<FindingAdmNum> adm_nums;
//	List<Iti_Master> itis;
//	List<PlcmtScheduleEntry> plcmtScheduleEntry;
//	List<OldDistMaster> oldDists;
//	List<CasteMaster> caste;
	
	
	public AjaxResponseBody() {
		super();
		// TODO Auto-generated constructor stub
	}

public AjaxResponseBody(List<Dist_mast> dists, List<States_mast> states, List<ItiTradeMaster> trades, String msg,
		AdmissionModel result, String jwtToken) {
	super();
	this.dists = dists;
	this.states = states;
	this.trades = trades;
	this.msg = msg;
	this.result = result;
	this.jwtToken = jwtToken;
}

public List<Dist_mast> getDists() {
	return dists;
}

public void setDists(List<Dist_mast> dists) {
	this.dists = dists;
}

public List<States_mast> getStates() {
	return states;
}

public void setStates(List<States_mast> states) {
	this.states = states;
}

public List<ItiTradeMaster> getTrades() {
	return trades;
}

public void setTrades(List<ItiTradeMaster> trades) {
	this.trades = trades;
}

public String getMsg() {
	return msg;
}

public void setMsg(String msg) {
	this.msg = msg;
}

public AdmissionModel getResult() {
	return result;
}

public void setResult(AdmissionModel result) {
	this.result = result;
}

public String getJwtToken() {
	return jwtToken;
}

public void setJwtToken(String jwtToken) {
	this.jwtToken = jwtToken;
}

@Override
public String toString() {
	return "AjaxResponseBody [dists=" + dists + ", states=" + states + ", trades=" + trades + ", msg=" + msg
			+ ", result=" + result + ", jwtToken=" + jwtToken + "]";
}
	
	
	
}