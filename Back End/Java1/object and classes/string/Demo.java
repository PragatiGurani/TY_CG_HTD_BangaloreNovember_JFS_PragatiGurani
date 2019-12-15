package com.capgemini.string;

public class Demo 
{
	public static void main(String[] args) 
	{
	   String s1="Anu";
	   System.out.println("s1 hashcode"+s1.hashCode());
	   String s2="Chinnu";
	   
	    s1= "Pinky";
	   System.out.println("s2 hashcode"+s2.hashCode());
	   System.out.println("s1 hashcode"+s1.hashCode());
	   String s3="Anu";
	   System.out.println("s3 hashcode"+s3.hashCode());// same as s1 value
	}

}
