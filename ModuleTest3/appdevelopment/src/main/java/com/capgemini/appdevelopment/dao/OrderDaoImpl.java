package com.capgemini.appdevelopment.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.capgemini.appdevelopment.dto.OrderInfoBean;

@Repository
public class OrderDaoImpl implements OrderDao{

	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;

	@Override
	public List<OrderInfoBean> getAllOrder() {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql = "from OrderInfo";
			Query query = entityManager.createQuery(jpql);
			List<OrderInfoBean> list = query.getResultList();
			return list;
		} catch (Exception e) {
			// e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return null;
	}

	@Override
	public boolean addToCart(OrderInfoBean orderInfoBean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(orderInfoBean);
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
		}
		entityManager.close();
		return false;
	}
}