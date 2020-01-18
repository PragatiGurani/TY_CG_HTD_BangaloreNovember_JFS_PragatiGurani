package com.capgemini.exception.customexception;

public class SBIatm 
{
  public static void main(String[] args) 
  {
	System.out.println("main strated");
	ATMSimulator a1= new ATMSimulator();
	try
	{
	a1.withdraw(41000);
	}
	catch(DayLimitException d)
	{
		System.out.println(d.getMessage());
	}
	System.out.println("main ended");
  }
}
