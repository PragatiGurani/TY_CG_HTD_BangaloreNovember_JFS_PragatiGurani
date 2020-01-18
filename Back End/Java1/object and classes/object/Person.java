package com.capgemini.object;

public class Person 
{
	String name;

	public Person(String name) 
	{
		super();
		this.name = name;
	}

	@Override
	protected void finalize() throws Throwable //since protected cant access outside package
	{
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalize method is called");
	}
	
	public static void main(String[] args) throws Throwable 
	{ 
		System.out.println("main started");
		Person p1= new Person("abc");
		p1.finalize();
		p1=null;
		System.gc();
		System.out.println("main ended");
	}
 	
	

}
