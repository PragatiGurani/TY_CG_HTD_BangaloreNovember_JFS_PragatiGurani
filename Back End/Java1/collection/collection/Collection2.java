package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2 
{
	 public static void main(String[] args) 
	  {
		Collection c2 = new ArrayList();
		
		//adding an element
		c2.add("Chinnu");
		System.out.println(c2);
		
		//removing an element
		c2.remove("Chinnu");
		System.out.println(c2);
		
		//finding the size of collection
		System.out.println(c2.size());
		
		////checking the collection is empty or nt
		System.out.println(c2.isEmpty());
		c2.add("Chinnu");
		
		// checking whether 12 object is there or not
		System.out.println(c2.contains("Chinnu"));
	  }
}
