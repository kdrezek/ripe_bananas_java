package com.ripe.models;

public class ApiToken {
	
	private static final long serialVersionUID = 1L;
	
	private String token;

	public ApiToken(String token) {
		super();
		this.token = token;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}


	
	
}