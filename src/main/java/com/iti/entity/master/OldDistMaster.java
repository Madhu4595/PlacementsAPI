package com.iti.entity.master;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="dist_mst")
public class OldDistMaster {
	
	
	private String statecode;
	@Id
	private String dist_code;
	private String dist_name;
	private String itidist_code;
	private String new_dist;
	public OldDistMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OldDistMaster(String statecode, String dist_code, String dist_name, String itidist_code, String new_dist) {
		super();
		this.statecode = statecode;
		this.dist_code = dist_code;
		this.dist_name = dist_name;
		this.itidist_code = itidist_code;
		this.new_dist = new_dist;
	}
	public String getStatecode() {
		return statecode;
	}
	public void setStatecode(String statecode) {
		this.statecode = statecode;
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
	public String getItidist_code() {
		return itidist_code;
	}
	public void setItidist_code(String itidist_code) {
		this.itidist_code = itidist_code;
	}
	public String getNew_dist() {
		return new_dist;
	}
	public void setNew_dist(String new_dist) {
		this.new_dist = new_dist;
	}
	@Override
	public String toString() {
		return "OldDistMaster [statecode=" + statecode + ", dist_code=" + dist_code + ", dist_name=" + dist_name
				+ ", itidist_code=" + itidist_code + ", new_dist=" + new_dist + "]";
	}
	
	

}
