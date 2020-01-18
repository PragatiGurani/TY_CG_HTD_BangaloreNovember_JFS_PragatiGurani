package com.capgemini.object;

public class TestPerson extends Person //since package name is same it is accessing
{ 
	public TestPerson(String name)
	{
		super(name);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws Throwable
	{
		System.out.println("main started");
		Person p1= new Person("John");
		p1.finalize(); //by user to ref is nt loaded in garbage 
		p1=null;
		System.gc();
		System.out.println("main ended");
	}

}
