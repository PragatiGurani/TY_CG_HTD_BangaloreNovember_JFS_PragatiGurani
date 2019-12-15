package com.capgemini.javabean;

public class PersonMain
{
 public static void main(String[] args) 
 {
	Person p1= new Person();
	
	p1.setAge(21);
	p1.setName("Anu");
	
	System.out.println(p1.getAge());
	System.out.println(p1.getName());
 }
}
