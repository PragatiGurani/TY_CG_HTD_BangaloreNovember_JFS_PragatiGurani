package com.capgemini.exception.exception;

public class ATest 
{
  public static void main(String[] args)
  {
	  System.out.println("Main started");
	   Calc c1 = new Calc();
	   c1.divide(10, 0);
	   System.out.println("Main ended");
  }
}