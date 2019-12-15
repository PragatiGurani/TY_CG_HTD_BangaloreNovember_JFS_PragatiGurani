package com.capgemini.exception.customchecked;

public class AgeLimitException extends Exception
{
   String msg="age should be more than 18";
   public AgeLimitException()
   {
   }
   public AgeLimitException(String msg) 
   {
	super();
	this.msg = msg;
   }
   
   public String getMessage()
   {
	   return msg;
   }
   
}
 