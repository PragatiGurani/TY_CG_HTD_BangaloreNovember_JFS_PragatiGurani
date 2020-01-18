package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Update
{
	public static void main(String[] args) 
	{	
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			EntityManager entityManager	= entityManagerFactory.createEntityManager();
			EntityTransaction transaction = entityManager.getTransaction();
			transaction.begin();
			String jpql="Update Movie set mname ='XYZ' where mid = 54";
			Query query=entityManager.createQuery(jpql);
			query.executeUpdate();
			System.out.println("table updated");
			transaction.commit();
	}
}