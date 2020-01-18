package com.capgemini.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection3 
{
  public static void main(String[] args) 
  {
	  Collection c1 = new ArrayList();	
	  c1.add(13);
	  c1.add(14);
	  c1.add(15);
	  c1.add(16);
	  System.out.println(c1);
	  
	  Collection c2 = new ArrayList();	
	  c2.add(23);
	  c2.add(24);
	  c2.add(25);
	  c2.add(26);
	  //c2.remove(24);
	  System.out.println(c2);
	  
	  System.out.println("------add all-----");
	  c1.addAll(c2);
	  System.out.println(c1);
	  
	  System.out.println("-----retian all-----");
	  Collection c3 = new ArrayList();	
	  c3.add(100);
	  c3.add(200);
	  c3.add(24);
	  c3.add(26);
	  System.out.println(c2);
	  c2.retainAll(c3);
	  System.out.println(c2);
	  
	  
	  System.out.println("contains------");
	  System.out.println(c3);
	  System.out.println(c2.containsAll(c3));
	  
	  
	  System.out.println("Clear------");
	  System.out.println(c2);
	  c2.clear();
	  System.out.println(c2);
	  
       System.out.println("----toArray----");
       Collection c4 = new ArrayList();	
 	  c4.add(1);
 	  c4.add(2);
 	 c4.add(3);
 	c4.add(4);
      Object a[] = c4.toArray(); // int wont take integer
      
      for(int i=0; i<a.length; i++)
      {
    	  System.out.println(a[i]);
      }
	  
	  
  }
}
