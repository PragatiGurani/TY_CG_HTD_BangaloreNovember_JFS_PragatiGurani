package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection1
{
  public static void main(String[] args) 
  {
	Collection c1 = new ArrayList();
	
	//adding an element
	c1.add(12);
	System.out.println(c1);
	
	//removing an element
	c1.remove(12);
	System.out.println(c1);
	
	//finding the size of collection
	System.out.println(c1.size());
	
	////checking the collection is empty or nt
	System.out.println(c1.isEmpty());
	c1.add(12);
	
	// checking whether 12 object is there or not
	System.out.println(c1.contains(12));
  }
}
