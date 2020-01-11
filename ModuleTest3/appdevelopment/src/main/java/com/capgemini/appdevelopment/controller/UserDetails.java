package com.capgemini.appdevelopment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.capgemini.appdevelopment.dto.OrderInfoBean;
import com.capgemini.appdevelopment.dto.OrderInfoResponse;
import com.capgemini.appdevelopment.service.OrderService;
import com.capgemini.appdevelopment.service.UserService;

public class UserDetails {

	@Autowired
	private UserService service;
	
	@PostMapping(path = "/add-User", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public UserInfoResponse addUser(@RequestBody OrderInfoBean orderInfoBean) {
		OrderInfoResponse response = new OrderInfoResponse();
		if (service.addToCart(orderInfoBean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Orders Added to cart added");
		} else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Orders not Added to cart added");
		}
		return response;
	}
}
