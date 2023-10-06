package com.iti.entity.login;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "rolesapi")
public class Role {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int role_id;
	
	@Column(length = 20)
	private String name;
	
	@JsonIgnore
	@ManyToMany(mappedBy = "roles")
	private Set<Users> users=new HashSet<>();
	
	public Set<Users> getUsers() {
		return users;
	}

	public void setUsers(Set<Users> users) {
		this.users = users;
	}
	public Role() {

	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Role [role_id=" + role_id + ", name=" + name + ", users=" + users + "]";
	}

	

}
