package com.capgemini.appdevelopment.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.appdevelopment.dto.UsersInfoBean;
import com.capgemini.appdevelopment.service.exception.AppException;

@Repository
public class UserDaoImpl implements UserDao{

	@PersistenceUnit
	EntityManagerFactory entityManagerFactory;
	@Override
	public boolean createProfile(UsersInfoBean usersInfoBean) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(usersInfoBean);
			transaction.commit();
			
		} catch (Exception e) {
			transaction.rollback();
		}
		entityManager.close();
		return false;
	}

	@Override
	public UsersInfoBean login(UsersInfoBean usersInfoBean) {
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		String jpql = "from UsersInfo where name=:name and password=:password";
		TypedQuery<UsersInfoBean> query = entityManager.createQuery(jpql, UsersInfoBean.class);
		query.setParameter("name", usersInfoBean.getName());
		query.setParameter("email", usersInfoBean.getEmail());
			UsersInfoBean account = query.getSingleResult();
			if (account.getPassword().equals(usersInfoBean.getPassword())) {
				return account;
			} else {
				System.out.println("Valid Credentials");
				return null;
			}
	}

	@Override
	public boolean updatePassword(int user_id, String password) {
		EntityManager entityManager = null;
		EntityTransaction transaction = null;
		try {
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			UsersInfoBean usersInfoBean = entityManager.find(UsersInfoBean.class, user_id);
			usersInfoBean.setUser_id(user_id);
			usersInfoBean.setPassword(password);
			transaction.commit();
			return true;
		} catch (Exception e) {
			// e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
		return false;
	}

}
