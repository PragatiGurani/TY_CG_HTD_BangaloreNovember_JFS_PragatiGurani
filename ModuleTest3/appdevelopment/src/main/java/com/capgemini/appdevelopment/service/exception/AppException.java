package com.capgemini.appdevelopment.service.exception;

public class AppException {

   String msg;
	
	public AppException(String msg) {
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}
	
}
