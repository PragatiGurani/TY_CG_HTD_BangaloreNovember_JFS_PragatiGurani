package com.capgemini.appdevelopment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.appdevelopment.dao.OrderDao;
import com.capgemini.appdevelopment.dto.OrderInfoBean;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderDao dao;

	@Override
	public List<OrderInfoBean> getAllOrder() {
		return dao.getAllOrder();
	}

	@Override
	public boolean addToCart(OrderInfoBean orderInfoBean) {
		return dao.addToCart(orderInfoBean);
	}

}
