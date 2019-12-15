package com.capgemini.string;

public class Demo2
{
  public static void main(String[] args)
  {
	   String s1= new String("Anu");
	   System.out.println("s1 hashcode"+s1.hashCode());
	   String s2= new String("Chinnu");
	   System.out.println("s2 hashcode"+s2.hashCode());
	   String s3= new String("Anu");
	   System.out.println("s3 hashcode"+s3.hashCode());
	   s1=new String("Divya");
	   System.out.println("s1 hashcode"+s1.hashCode());  //value is changed bcz string is changed
  }
}
