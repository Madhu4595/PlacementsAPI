package com.iti.model;

public class ResponseRest {
	private String msg;

	public ResponseRest() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseRest(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "ResponseRest [msg=" + msg + "]";
	}
	
}
