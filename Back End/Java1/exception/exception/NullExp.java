package com.capgemini.exception.exception;

public class NullExp 
{
	   void write() 
	   {
		   String s1=null;
		   try
		   {
			   System.out.println("length is"+s1.length());
		   }
		   catch(NullPointerException e)
		   {
			   System.out.println("donot handle null "); 
		   }
	   }  
   public static void main(String[] args)
   {
	NullExp n= new NullExp();
	n.write();
   }
}
   
