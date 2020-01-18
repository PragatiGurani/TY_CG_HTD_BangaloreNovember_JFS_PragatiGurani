package com.capg.map.treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2
{
 public static void main(String[] args) 
 {
	    SortingAge a1 = new SortingAge();
	 
	 TreeMap<Student, String> t1 = new TreeMap<Student, String>(a1);
		t1.put(new Student(7, "Divya"), "second std");
		t1.put(new Student(8, "Anu"), "third std");
		t1.put(new Student(6, "Reetu"), "first std");
		
		Set<Map.Entry<Student, String>> s1 = t1.entrySet(); 
		
		for(Map.Entry<Student, String > e1 : s1)
		{
			System.out.println(e1.getKey());
			System.out.println(e1.getValue());
			System.out.println("--------------------------------");
		}
 }
}
