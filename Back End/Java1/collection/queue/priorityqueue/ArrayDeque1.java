package com.capgemini.queue.priorityqueue;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDeque1 
{
  public static void main(String[] args) 
  {
	  ArrayDeque a1 = new ArrayDeque();
	  a1.add(10);
	  a1.add(20);
	  a1.addFirst(40);
	  a1.add(50);
	  a1.addLast(80);
	 System.out.println("----------iterator----------"); 
	  Iterator itr = a1.iterator();
	  while(itr.hasNext())
	  {
		  System.out.println(itr.next());
	  }
	  
	      System.out.println("----------getFirst and last----------"); 
		  System.out.println(a1.getFirst());
		  System.out.println(a1.getLast());
		  
	    System.out.println("----------removeFirst and removelast----------");
	    a1.removeFirst();
	    a1.removeLast();
	    System.out.println(a1);
	    a1.add(50);
	    System.out.println(a1);
	    
	    System.out.println("----------removeFirstOcuurence and last------");
	    a1.removeFirstOccurrence(50);
	    a1.removeLastOccurrence(50);
	    System.out.println(a1);
  }
}
