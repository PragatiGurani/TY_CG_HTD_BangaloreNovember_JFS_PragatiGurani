package com.capgemini.appdevelopment.dao;

import com.capgemini.appdevelopment.dto.ProductInfoBean;

public interface ProductDao {

	ProductInfoBean searchProduct(int product_id);
	
	public boolean add(ProductInfoBean productInfoBean);
	
}
