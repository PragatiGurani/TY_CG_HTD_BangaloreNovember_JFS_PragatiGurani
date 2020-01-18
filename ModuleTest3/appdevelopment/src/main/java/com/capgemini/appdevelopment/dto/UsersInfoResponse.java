package com.capgemini.appdevelopment.dto;

import java.util.List;

public class UsersInfoResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<UsersInfoBean> usersInfoBean;
	
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<UsersInfoBean> getUsersInfo() {
		return usersInfoBean;
	}
	public void setUsersInfo(List<UsersInfoBean> usersInfoBean) {
		this.usersInfoBean = usersInfoBean;
	}
	
	
	
}
