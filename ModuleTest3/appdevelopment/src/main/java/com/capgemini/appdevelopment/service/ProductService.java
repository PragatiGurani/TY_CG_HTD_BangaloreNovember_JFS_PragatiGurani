package com.capgemini.appdevelopment.service;

import com.capgemini.appdevelopment.dto.ProductInfoBean;

public interface ProductService {

	ProductInfoBean searchProduct(int product_id);
	
	public boolean add(ProductInfoBean productInfoBean);
}
