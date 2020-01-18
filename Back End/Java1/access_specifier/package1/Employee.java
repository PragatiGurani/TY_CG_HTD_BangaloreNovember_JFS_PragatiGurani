package com.capgemini.access.pack1;

public class Employee 
{
	public static int num=10;
	public String name;
	
	public void empDetails()
	{
		System.out.println("Employee name is  "+name);
	}
	
	public static void empNum()
	{
		System.out.println("Employee num is  "+num);
	}
    public Employee(String name)
    {
    	this.name=name;
    }
}
