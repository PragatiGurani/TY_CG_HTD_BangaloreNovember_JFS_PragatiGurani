package com.capgemini.object;

public class EmpMain
{
  public static void main(String[] args) 
  {
	  Employee e1= new Employee(10,"Chinnu");
	  System.out.println(e1.hashCode());
	  Employee e2= new Employee(20,"Naina");
	  System.out.println(e2.hashCode());  
	  System.out.println(e2);
	 Object o1 =new Object();
  }
}
