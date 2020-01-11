package com.capgemini.appdevelopment.dto;

import java.util.List;

public class OrderInfoResponse {

	private int statusCode;
	private String message;
	private String description;
	private List<OrderInfoBean> orderInfoBean;
	
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
	public List<OrderInfoBean> getOrderInfo() {
		return orderInfoBean;
	}
	public void setOrderInfo(List<OrderInfoBean> orderInfoBean) {
		this.orderInfoBean = orderInfoBean;
	}
	
}
