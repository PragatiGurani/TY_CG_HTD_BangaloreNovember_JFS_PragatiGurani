package com.capgemini.appdevelopment.dao;

import java.util.List;

import com.capgemini.appdevelopment.dto.OrderInfoBean;

public interface OrderDao {
	
	public List<OrderInfoBean> getAllOrder();
	
	public boolean addToCart(OrderInfoBean orderInfoBean);
}
