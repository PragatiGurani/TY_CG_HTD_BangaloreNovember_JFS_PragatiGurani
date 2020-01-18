package com.capgemini.exception.multipleexception;

public class AMain
{
  public static void main(String[] args) 
  {
	  System.out.println("main started");
	  ExceptionA a = new ExceptionA();
	  a.exception(2, null);
	  a.exception(0, "Rama");
	  System.out.println("main ended");
  }
}
