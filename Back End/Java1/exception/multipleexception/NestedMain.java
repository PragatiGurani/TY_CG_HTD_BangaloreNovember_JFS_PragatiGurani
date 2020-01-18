package com.capgemini.exception.multipleexception;

public class NestedMain 
{
  public static void main(String[] args) 
  {
	  System.out.println("main started");
	  Nestedtry n1 = new Nestedtry();
	  n1.exception(2,null);
	  n1.exception(0, "rama");
	  System.out.println("main ended");
  }
}
