package com.capgemini.exception.exception;

public class Calc 
{
   void divide(int a, int b)
   { 
	   try 
	   {
		   System.out.println(a/b);
	   }
	    catch(ArithmeticException e)
	    {
	    	System.out.println("dont divide by zero");
	    }
   }
}
