package com.capgemini.exception.customexception;

public class DayLimitException extends RuntimeException
{
  String msg="limit exceed";
  public DayLimitException()
  {
	  
  }
   public DayLimitException(String msg) 
   {
	super();
	this.msg = msg;
   }
   
   public String getMessage()
   {
	   return msg;
   }
  
}
