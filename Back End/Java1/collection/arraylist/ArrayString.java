package com.capgemini.list.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayString 
{
	public static void main(String[] args) 
	  {
		ArrayList<String> a1 = new ArrayList<String>();
		a1.add("Chinnu");
		a1.add("Tanu");
		a1.add("Pinky");
		
		//itearating an arraylist using for loop

		System.out.println("----------forloop--------");
		for(int i=0; i<a1.size(); i++)
	    {
	  	  System.out.println(a1.get(i));
	    }
		  
		 //itearating an arraylist using foreachloop
		System.out.println("******************************");
		System.out.println("-----------foreachloop--------");
			for( String i1:a1)
		    {
		  	  System.out.println(i1);
		    }
			
			//itearator mathod
			System.out.println("*******************************");
			System.out.println("-----------iterator--------");
			Iterator<String> itr = a1.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			
			System.out.println("******************************");
			System.out.println("-----------list iterator from starting index--------");
			ListIterator<String> itr1 = a1.listIterator();
			while(itr1.hasNext())
			{
				System.out.println(itr1.next());
			}
			
			System.out.println("******************************");
			System.out.println("----------with last index--------"); // should give size of last index but now its [pointing at lAST
			while(itr1.hasPrevious())
			{
				System.out.println(itr1.previous());
			}
			
			System.out.println("*******************************");
			ArrayList<String> a2 = new ArrayList<String>();
			a2.add("Pallavi");
			a2.add("Pragati");
			System.out.println(a2);
			a2.remove(new String("Pragati"));
			System.out.println(a2);
	  }
}
