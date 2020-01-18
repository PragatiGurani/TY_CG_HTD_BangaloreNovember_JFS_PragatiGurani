package com.capgemini.appdevelopment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;

import org.springframework.stereotype.Repository;

import com.capgemini.appdevelopment.dto.ProductInfoBean;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;

	@Override
	public ProductInfoBean searchProduct(int product_id) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		ProductInfoBean productInfoBean = entityManager.find(ProductInfoBean.class, product_id);
		return productInfoBean;
	}

	@Override
	public boolean add(ProductInfoBean productInfoBean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(productInfoBean);
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
		}
		entityManager.close();
		return false;
	}
}