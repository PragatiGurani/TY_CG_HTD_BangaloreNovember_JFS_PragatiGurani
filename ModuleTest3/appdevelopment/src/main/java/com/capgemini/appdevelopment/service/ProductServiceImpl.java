package com.capgemini.appdevelopment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.appdevelopment.dao.ProductDao;
import com.capgemini.appdevelopment.dto.ProductInfoBean;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductDao dao;
	
	@Override
	public ProductInfoBean searchProduct(int product_id) {
		return dao.searchProduct(product_id);
	}

	@Override
	public boolean add(ProductInfoBean productInfoBean) {
		return dao.add(productInfoBean);
	}

}
