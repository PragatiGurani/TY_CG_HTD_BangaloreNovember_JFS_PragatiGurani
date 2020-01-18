package com.capgemini.vectors.vector;

import java.util.Vector;

public class Vector2 
{
 public static void main(String[] args) 
 {
	 Vector v1 = new Vector();
	 System.out.println(v1.size());
	 System.out.println(v1.capacity());
		v1.add(23);
		v1.add(56);
		v1.add(78);
		v1.add(100);
		System.out.println("----------after inserting ele---------");
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println("----------after triming size---------");
		v1.trimToSize();
		System.out.println(v1.size());
		System.out.println(v1.capacity());
		System.out.println("--------set size to 10----------");
		v1.setSize(10);
		System.out.println(v1.size());
		System.out.println(v1);
		System.out.println("-----------add ele at last pos------");
		v1.add(200);
		System.out.println(v1.size());
		System.out.println(v1);
		System.out.println("-----------set value in middle------------");
		v1.set(5,600);
		System.out.println(v1);
 }
}
