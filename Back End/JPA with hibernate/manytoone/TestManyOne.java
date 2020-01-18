package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

public class TestManyOne
{
 public static void main(String[] args)
 {
	 EmployeeInfo info = new EmployeeInfo();
	 info.setEid(50);
	 info.setName("Sneha");
	 info.setEmail("sne@gmail.com");
	 info.setPassword("sneha");
	 
	 EmployeeExperience exp = new EmployeeExperience();
	 exp.setCname("Infosys");
	 exp.setExpId(33);
	 exp.setNoOfYear(30);
	 

	 EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(exp);   //to insert into table
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
