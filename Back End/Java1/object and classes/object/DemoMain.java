package com.capgemini.object;

public class DemoMain
{
  public static void main(String[] args)
  {
	String s1= "shree";
	String s2= "shree";
	//String s2= new String("shree");
	
	
	System.out.println(s1.equals(s2));
	System.out.println(s1 == s2);
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
  }
}
