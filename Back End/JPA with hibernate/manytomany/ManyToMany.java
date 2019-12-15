package com.capgemini.jpawithhibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

public class ManyToMany 
{
	public static void main(String[] args)
	{
		EmployeeInfo info =	new EmployeeInfo();
            info.setEid(78);
            info.setName("Aman");
            info.setEmail("a@gmail.com");
            info.setPassword("1234");
            

    		EmployeeInfo info1 =	new EmployeeInfo();
                info1.setEid(88);
                info1.setName("Anuja");
                info1.setEmail("anu@gmail.com");
                info1.setPassword("18977");

		List<EmployeeInfo> eList=new ArrayList<EmployeeInfo>();
		eList.add(info);
		eList.add(info1);
		
		TrainingInfo t1 = new TrainingInfo();
		t1.setTid(34);
		t1.setTname("Java");
		t1.setEList(eList);
		
		EntityManagerFactory entityManagerFactory=null;
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		try {
			 entityManagerFactory  = Persistence.createEntityManagerFactory("Test");
			entityManager = entityManagerFactory.createEntityManager();
			transaction = entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(t1);
			//entityManager.persist(info1);
			System.out.println("records are saved");
			transaction.commit();
		}
		catch (Exception e)
		{
			e.printStackTrace();      //trace the exception
		}
		entityManager.close();	 
	}
}