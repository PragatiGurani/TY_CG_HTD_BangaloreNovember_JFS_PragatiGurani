package com.capgemini.appdevelopment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.appdevelopment.dto.OrderInfoBean;
import com.capgemini.appdevelopment.dto.OrderInfoResponse;
import com.capgemini.appdevelopment.service.OrderService;
import com.capgemini.appdevelopment.service.ProductService;
@RestController
public class OrderDetails {

	@Autowired
	private OrderService service;
	
	@PostMapping(path = "/add-Order", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public OrderInfoResponse addOrder(@RequestBody OrderInfoBean orderInfoBean) {
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
