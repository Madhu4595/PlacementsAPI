package com.iti.entity.master;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="category_mast")
public class CasteMaster {
	@Id
	private String category_code;
	private String category_name;
	private Integer category_order;
	private String meta_category_name;
	private String category;
	public CasteMaster() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CasteMaster(String category_code, String category_name, Integer category_order, String meta_category_name,
			String category) {
		super();
		this.category_code = category_code;
		this.category_name = category_name;
		this.category_order = category_order;
		this.meta_category_name = meta_category_name;
		this.category = category;
	}
	public String getCategory_code() {
		return category_code;
	}
	public void setCategory_code(String category_code) {
		this.category_code = category_code;
	}
	public String getCategory_name() {
		return category_name;
	}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}
	public Integer getCategory_order() {
		return category_order;
	}
	public void setCategory_order(Integer category_order) {
		this.category_order = category_order;
	}
	public String getMeta_category_name() {
		return meta_category_name;
	}
	public void setMeta_category_name(String meta_category_name) {
		this.meta_category_name = meta_category_name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "CasteMaster [category_code=" + category_code + ", category_name=" + category_name + ", category_order="
				+ category_order + ", meta_category_name=" + meta_category_name + ", category=" + category + "]";
	}
	
	
	 
	
	

}
