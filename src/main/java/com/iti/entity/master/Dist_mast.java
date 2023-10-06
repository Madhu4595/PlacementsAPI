package com.iti.entity.master;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dists_statewise")
public class Dist_mast {

	@Id
	private String distcode;
	private String distname;
	private String statecode;
	private String statename;

	public Dist_mast() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Dist_mast(String distcode, String distname, String statecode, String statename) {
		super();
		this.distcode = distcode;
		this.distname = distname;
		this.statecode = statecode;
		this.statename = statename;
	}

	public String getDistcode() {
		return distcode;
	}

	public void setDistcode(String distcode) {
		this.distcode = distcode;
	}

	public String getDistname() {
		return distname;
	}

	public void setDistname(String distname) {
		this.distname = distname;
	}

	public String getStatecode() {
		return statecode;
	}

	public void setStatecode(String statecode) {
		this.statecode = statecode;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	@Override
	public String toString() {
		return "Dist_mast [distcode=" + distcode + ", distname=" + distname + ", statecode=" + statecode
				+ ", statename=" + statename + "]";
	}

}