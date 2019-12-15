package com.capgemini.inheritance.inheritance1;

public class Person 
{
	int age;
	String name;
	
	void personDetails()
	{
		System.out.println("Name is  "+name+"Age is  "+age);
	}
    void initialize(int a, String n)
    {
    	age=a;
    	name=n;
    }
    
}
