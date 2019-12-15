package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UserInput 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager	= entityManagerFactory.createEntityManager();
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		String jpql="Update Movie set mname =:nm where mid =:id"; //dynamic value
		Query query=entityManager.createQuery(jpql);
		query.setParameter("id", 89);   //which is already present in table
		query.setParameter("nm", "DFG");
		int result=query.executeUpdate();
		System.out.println(result);
		System.out.println("table updated");
		transaction.commit();
        entityManager.close();

	}
}