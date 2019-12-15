package com.capgemini.exception.checkedexception;

public class ExceptionA 
{
 public static void main(String[] args) 
 {
	 System.out.println("main strated");
	try
	{
	  Class c1= Class.forName("checkedException.Person");
	  System.out.println("Class is found");
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("Class is not found");
	}
	System.out.println("main ended");
 }
}
