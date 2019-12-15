package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capgemini.jpawithhibernate.dto.Movie;

public class Retrive 
{
	public static void main(String[] args) 
	{
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager	= entityManagerFactory.createEntityManager();
		//String jpql = "from Movie";
		String jpql = "select mname from Movie";
		Query query = entityManager.createQuery(jpql);
		
		//List<Movie> record = query.getResultList();
		List<String> record = query.getResultList();
		
		for(String movie : record )
		{
//			System.out.println("Movie Id "+movie.getMid());
//			System.out.println("Movie Name "+movie.getMname());
//			System.out.println("Movie Rating "+movie.getRating());
			System.out.println(movie);
		}
		
		entityManager.close();
	}

}
