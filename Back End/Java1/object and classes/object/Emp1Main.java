package com.capgemini.object;

public class Emp1Main 
{
 public static void main(String[] args)
 {
	 Emp e1= new Emp(20, "abc");
	 Emp e2= new Emp(20, "abc");
	 System.out.println(e1.equals(e2)); // equals is over-riden
	 System.out.println(e1.hashCode());
	 System.out.println(e1.hashCode());
 
	 Emp e3= new Emp(50, "abc");
	 Emp e4= new Emp(50, "tyu");
	 System.out.println(e3.equals(e4)); //hashcode & equals is over-riden so same value but content is diff so false
	 System.out.println(e3.hashCode());
	 System.out.println(e4.hashCode());
 }
 
 
}
