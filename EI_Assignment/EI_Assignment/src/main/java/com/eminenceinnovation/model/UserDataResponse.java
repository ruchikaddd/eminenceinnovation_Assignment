package com.eminenceinnovation.model;

import java.util.Date;

public class UserDataResponse {

	 private String username;
	 private Date expirationTime;
	 
	
	public UserDataResponse(String username, Date expirationTime) {
		super();
		this.username = username;
		this.expirationTime = expirationTime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Date getExpirationTime() {
		return expirationTime;
	}
	public void setExpirationTime(Date expirationTime) {
		this.expirationTime = expirationTime;
	}
	 
	 
}
