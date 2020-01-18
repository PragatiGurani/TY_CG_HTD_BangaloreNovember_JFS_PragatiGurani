package com.capgemini.interfaces.interface1;

public interface BottleDefault 
{
	void open();
	void drink();
	
	default void juice()
	{
		System.out.println("juice name");
	}
    
	static void close()
	{
		System.out.println("Close bottle");
	}
}
