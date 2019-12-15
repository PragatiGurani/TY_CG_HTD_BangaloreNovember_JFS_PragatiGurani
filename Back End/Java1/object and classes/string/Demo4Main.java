package com.capgemini.string;

public class Demo4Main 
{
  public static void main(String[] args)
  {
	  Demo4 d1= new Demo4(40,"Abc");
	  System.out.println(d1.hashCode());
	 
//	  int age=d1.getAge(); //create geter and seter by compiler
//	  String name=d1.getName();
	  System.out.println(d1.getAge());
	  System.out.println(d1.getName());
	  
	  System.out.println("---------------");
	   d1= new Demo4(30,"Pqr");
	  System.out.println(d1.hashCode());
	  System.out.println(d1.getAge());
	  System.out.println(d1.getName());
	  
	  
  }
}
