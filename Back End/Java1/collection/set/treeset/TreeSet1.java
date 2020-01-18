package com.capgemini.set.treeset;

import java.util.TreeSet;

public class TreeSet1
{
 public static void main(String[] args)
 {
	 TreeSet t1 = new TreeSet();
	 t1.add(86);
	 t1.add(12);
	 t1.add(72);
	 t1.add(12);
	 //t1.add(null); //doesnt allow null value give NPException
	//t1.add(43.56);  //its homogeneous
	 
	 for(Object o1 : t1)
	 {
		 System.out.println(o1); // it always prints in acending order
	 }
	 
	 System.out.println("*****************************************");
	 
	 TreeSet<Integer> t2 = new TreeSet<Integer>();
	 t2.add(98);
	 t2.add(64);
	 t2.add(72);
	 t2.add(64);
	 
	 for(Object o2 : t2)
	 {
		 System.out.println(o2); // it always prints in acending order
	 }
 }
}
