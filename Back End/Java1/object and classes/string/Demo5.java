package com.capgemini.string;

public class Demo5 
{
  public static void main(String[] args) 
  { 
	  String s1=new String("John");  //immutable so diff hashcode value
	  s1=new String("Mickel");
	  System.out.println(s1.hashCode());
	  s1=s1.concat("Marsh");
	  System.out.println(s1.hashCode());
   }
}
