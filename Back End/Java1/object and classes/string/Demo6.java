package com.capgemini.string;

public class Demo6 
{
	public static void main(String[] args)
	{
		StringBuffer s1=new StringBuffer("Divya"); //StringBuffe  
		System.out.println(s1.hashCode());
		s1=s1.append("Borger");
		System.out.println(s1.hashCode());
	}
}
