package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movie;

public class GetReference
{
	public static void main(String[] args)
	{
		
		
		//EntityManager entityManager = null;
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager =entityManagerFactory.createEntityManager();
	   

		//Movie m = entityManager.find(Movie.class, 100);
		Movie m = entityManager.getReference(Movie.class, 100);
		
		//Movie m1 = entityManager.getReference(Movie.class, 99);
		System.out.println(m.getClass());
		
		System.out.println(m.getMid());
		System.out.println(m.getMname());
		System.out.println(m.getRating());
		
		entityManager.close();
	}
}
