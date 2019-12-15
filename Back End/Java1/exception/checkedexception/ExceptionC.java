package com.capgemini.exception.checkedexception;

public class ExceptionC 
{
  public static void main(String[] args) 
  {
	  System.out.println("main started");
		Employee e1= new Employee();
		 
		try
		{
			Object o1=e1.clone();
			try
			{
				Class c1 = Class.forName("nestedTry.Employee");
			  System.out.println("class is found");
			}catch (ClassNotFoundException c)
			{
				System.out.println("class not found");
			}	
		}	
		catch (CloneNotSupportedException e)
		{
			System.out.println("clone not supported");
		}
		
		System.out.println("main ended");	
  }
}
