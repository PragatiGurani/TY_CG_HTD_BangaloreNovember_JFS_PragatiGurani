package com.capgemini.appdevelopment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.appdevelopment.dto.ProductInfoBean;
import com.capgemini.appdevelopment.dto.ProductResponse;
import com.capgemini.appdevelopment.service.ProductService;

@RestController
public class ProductDetails {

	@Autowired
	private ProductService service;

	@PostMapping(path = "/add-Product", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductResponse addProduct(@RequestBody ProductInfoBean productInfoBean) {
		ProductResponse response = new ProductResponse();
		if (service.add(productInfoBean)) {
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Product Details added Successfully.....");
		}else {
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Orders not Added to cart added");
		}
		return response;
	}
	

}
