package com.capgemini.inheritance.inheritance1;

public class TestPerson 
{
	public static void main(String[] args)
	{
	 Person p=new Person();
	 p.name="Anu";
	 p.age=23;
	 
	 p.personDetails();
	 
	 Person p1=new Person();
	 p1.initialize(40, "Chinnu");
	 p1.personDetails();
	}

}
