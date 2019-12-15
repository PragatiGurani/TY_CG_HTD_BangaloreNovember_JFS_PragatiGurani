package com.capgemini.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Array1
{
  public static void main(String[] args) 
  {
	ArrayList<Integer> a1 = new ArrayList<Integer>();
	a1.add(50);
	a1.add(51);
	a1.add(53);
	a1.add(54);
	
	a1.add(2,50);
	
	a1.remove(2);
	
	//itearating an arraylist using for loop

	System.out.println("----------forloop--------");
	for(int i=0; i<a1.size(); i++)
    {
  	  System.out.println(a1.get(i));
    }
	  
	 //itearating an arraylist using foreachloop
	System.out.println("*************");
	System.out.println("-----------foreachloop--------");
		for( Integer i1:a1)
	    {
	  	  System.out.println(i1);
	    }
		
		//itearator mathod
		System.out.println("************************");
		System.out.println("-----------iterator--------");
		Iterator<Integer> itr = a1.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("**************************");
		System.out.println("-----------list iterator--------");
		ListIterator<Integer> itr1 = a1.listIterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		System.out.println("**************************");
		System.out.println("----------with last index--------");
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
		
		System.out.println("**************************");
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(38);
		a2.add(45);
		System.out.println(a2);
		a2.remove(new Integer(38));
		System.out.println(a2);
  }
 
}
