package com.iti.jwt;

public class AUthenticationResponse {
	
	private  String jwt;

	public AUthenticationResponse(String jwt) {
		// TODO Auto-generated constructor stub
		this.jwt=jwt;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

}
