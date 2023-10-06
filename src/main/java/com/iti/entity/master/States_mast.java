package com.iti.entity.master;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "states_mast")
public class States_mast {
	@Id
	private String statecode;
	private String statename;

	public States_mast() {
		super();
		// TODO Auto-generated constructor stub
	}

	public States_mast(String statecode, String statename) {
		super();
		this.statecode = statecode;
		this.statename = statename;
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
		return "States_mast [statecode=" + statecode + ", statename=" + statename + "]";
	}

}
