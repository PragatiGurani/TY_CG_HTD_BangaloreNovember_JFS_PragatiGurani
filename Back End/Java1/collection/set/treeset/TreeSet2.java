package com.capgemini.set.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet2 
{
 public static void main(String[] args)
 {
	 TreeSet<Student> t1 = new TreeSet<Student>();
	 t1.add(new Student(65, "ABC"));
	 t1.add(new Student(34, "PQR"));
	 t1.add(new Student(98, "YUT"));
	 t1.add(new Student(34, "PQR"));
	 
	 Iterator<Student> itr = t1.iterator();
	 while(itr.hasNext())
	 {
		 System.out.println(itr.next());
	 }
	 
 }
}
