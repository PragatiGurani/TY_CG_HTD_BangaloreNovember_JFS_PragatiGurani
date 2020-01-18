package com.capgemini.exception.multipleexception;

public class ExceptionA 
{
  void exception(int a, String b)
  {
	 try
	 {
		 System.out.println(500/a);    //next statement does not execute
		 System.out.println(b.length());
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("dont deal with zero");
	 }
	 catch(NullPointerException n)
	 {
		 System.out.println("dont deal with null"); 
	 }	 
  }
}
