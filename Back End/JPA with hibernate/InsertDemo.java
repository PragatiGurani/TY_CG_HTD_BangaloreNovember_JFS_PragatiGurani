package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class InsertDemo 
{
	public static void main(String[] args) 
	{

		Movie movie = new Movie();
		movie.setMid(89);  //should give different value every time you run code,because once you run it considers as PrimaryKey
		movie.setMname("tyu");
		movie.setRating("Good");

		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(movie);   //to insert into table
			System.out.println("records are saved");
			transaction.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();      //trace the exception
			transaction.rollback();
		}
		//transaction.commit();
		entityManager.close();	 
	}
}
