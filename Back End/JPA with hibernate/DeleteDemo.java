package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Transaction;

import com.capgemini.jpawithhibernate.dto.Movie;

public class DeleteDemo 
{
  public static void main(String[] args) 
  {
//	    Movie movie = new Movie();
//		movie.setMid(108);  //should give different value every time you run code,because once you run it considers as PrimaryKey
//		movie.setMname("ABCD");
//		movie.setRating("Good");
		
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
	try {
		EntityManagerFactory entityManagerFactory	= Persistence.createEntityManagerFactory("Test");
		 entityManager = entityManagerFactory.createEntityManager();
		 transaction = entityManager.getTransaction();
		 transaction.begin();
		 Movie record= entityManager.find(Movie.class,108 );
		 entityManager.remove(record);
		 System.out.println("record deleted");
		 transaction.commit();
		 
	} catch (Exception e) {
		e.printStackTrace();
	}
	entityManager.close();
  }
}
