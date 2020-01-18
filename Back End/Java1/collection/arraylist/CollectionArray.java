package com.capgemini.list.arraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

public class CollectionArray
{
 public static void main(String[] args) 
 {
	 ArrayList<String> c1 = new ArrayList<String>();	
	  c1.add("Chinnu");
	  c1.add("Tanu");
	  c1.add("Anu");
	  System.out.println(c1);
	  
	  System.out.println("**********************************");
	  System.out.println("----------forloop--------");
		for(int i=0; i<c1.size(); i++)
	    {
	  	  System.out.println(((ArrayList<String>) c1).get(i));
	    }
		
		//itearating an arraylist using foreachloop
		System.out.println("*****************************");
		System.out.println("-----------foreachloop--------");
			for( String i1:c1)
		    {
		  	  System.out.println(i1);
		    }
			
			//itearator method
			System.out.println("********************************");
			System.out.println("-----------iterator--------");
			Iterator<String> itr = c1.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("**************************");
			System.out.println("-----------list iterator--------");
			ListIterator<String> itr1 = c1.listIterator();
//			ListIterator<String> itr1 = c1.listIterator();
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
			Collection<String> a2 = new ArrayList<String>();
			a2.add("Pallavi");
			a2.add("Pragati");
			System.out.println(a2);
			a2.remove(new String("Pragati"));
			System.out.println(a2);
 }
}
