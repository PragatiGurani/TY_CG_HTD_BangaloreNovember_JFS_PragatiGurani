package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestOneToOne 
{
	public static void main(String[] args) 
	{
		
	EmployeeInfo emp = new EmployeeInfo();
	emp.setEid(27);
	emp.setName("Ashu");
	emp.setEmail("ah@gmail.com");
	emp.setPassword("1234");
	
	EmployeeOtherInfo other = new EmployeeOtherInfo();
	
	other.setId(17);
	other.setFathername("Suresh");
	other.setMother("Anu");
	other.setPancard("ty12");
	other.setEmp(emp);

	EntityManager entityManager=null;
	EntityTransaction transaction=null;
	
	try {
		EntityManagerFactory entityManagerFactory  = Persistence.createEntityManagerFactory("Test");
		entityManager = entityManagerFactory.createEntityManager();
		transaction = entityManager.getTransaction();
		transaction.begin();
		EmployeeInfo employeeInfo = new EmployeeInfo();
		System.out.println(employeeInfo.getOther().getPancard());
		entityManager.persist(other);   //to insert into table
		System.out.println("records are saved");
		transaction.commit();
	}
	catch (Exception e)
	{
		e.printStackTrace();  
		transaction.rollback();
		//trace the exception
	}
	entityManager.close();	
	}
}
