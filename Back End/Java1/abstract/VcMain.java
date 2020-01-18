package com.capgemini.abstractclass.abstract1;

public class VcMain
{
	public static void main(String[] args) 
	{
		Car c=new Car();
		c.strat();
		c.stop();
		
		Vehicle v=new Car();
		v.strat();
		v.stop();
	}

}
