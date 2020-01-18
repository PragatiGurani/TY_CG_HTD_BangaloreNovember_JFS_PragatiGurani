package com.capg.map.hashmap;

import java.util.Collection;
import java.util.HashMap;

public class HashMap2 
{
  public static void main(String[] args)
  {
	  HashMap<Integer, Student> h1 = new HashMap<Integer, Student>();
	   h1.put(10, new Student(28, "Divya"));
	   h1.put(15, new Student(22, "Anu"));
	   h1.put(15, new Student(89, "Anu"));
	   h1.put(null, null);
	   
	   System.out.println("---------for only values----------");
	  Collection<Student> c1 = h1.values();
	  
	  for(Student s1 : c1)
	  {
		  System.out.println(s1);
	  }

	  System.out.println("---------for only key----------");
	  Collection<Integer> i1 = h1.keySet();
	  for(Integer i2 : i1)
	  {
		  System.out.println(i2);
	  }

	  
	  System.out.println(h1.containsKey(15));
	  System.out.println(new Student(28, "Divya"));
	  System.out.println(h1.get(15));
 }
}
