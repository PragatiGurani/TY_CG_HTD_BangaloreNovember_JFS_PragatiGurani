package com.capgemini.appdevelopment.service;

import java.util.List;

import com.capgemini.appdevelopment.dto.OrderInfoBean;

public interface OrderService {
	
	public List<OrderInfoBean> getAllOrder();
	
	public boolean addToCart(OrderInfoBean orderInfoBean);
}
