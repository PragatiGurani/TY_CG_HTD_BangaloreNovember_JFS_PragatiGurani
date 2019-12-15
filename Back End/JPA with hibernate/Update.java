package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Update 
{
	public static void main(String[] args) 
	{
		Movie movie = new Movie();
		movie.setMid(54);  //should give different value every time you run code,because once you run it considers as PrimaryKey
		movie.setMname("NMB");
		movie.setRating("Good");

		EntityManager entityManager=null;
		EntityTransaction transaction=null;
	try {
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			Movie record = entityManager.find(Movie.class, 54); // to set first we should fetch the data then we can set the value
			record.setMname("Dil to pagal hai");
			System.out.println("record updated");
			transaction.commit();  
		} 
		catch (Exception e)
		{
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}

}
