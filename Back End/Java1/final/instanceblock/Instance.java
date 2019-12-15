// initializing final variable using STB and Instance Instantiation Block
package com.capgemini.instanceblock;

public class Instance 
{
	final int MAXIMUM;
	static final double PI;
	public Instance()
	{
	  System.out.println("In constructor called");	
	}
	
	public Instance(int a)
	{
		System.out.println("In constructor overloaded");
	}
	
	{
		System.out.println("Instance intializer block");
		this.MAXIMUM=300;
	}
	
    static
    {
    	System.out.println("static intializer block");
    	PI=3.142;
    	System.out.println(PI);
    }
}
