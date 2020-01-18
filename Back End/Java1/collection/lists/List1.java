package com.capgemini.list.lists;

import java.util.ArrayList;
import java.util.List;

public class List1 
{
   public static void main(String[] args)
   {
	List l1 = new ArrayList();
	l1.add(0,5);
	l1.add(1,10);
	l1.add(2,20);
	l1.add(3,30);
	l1.add(4,40);    // cant add the middle 
	System.out.println(l1);
	
	System.out.println("-----remove-----");
	List l2 = new ArrayList();
	l2.add(0,24);
	l2.add(1,25);
	l2.add(2,26);
	l2.add(3,27);
	l2.add(4,28);    // cant add the middle 
	System.out.println(l2);
	l2.remove(2);
	System.out.println(l2);
	
	System.out.println("-----index of-----");
	System.out.println(l2.indexOf(27));
	l2.add(100);
    
	System.out.println("*************");
	System.out.println(l2);
	System.out.println(l2.lastIndexOf(100));
	
	
	System.out.println("*************");
	System.out.println("--------sizeof--list iterator----");
	for(int i=0; i<l2.size(); i++)
    {
  	  System.out.println(l2.get(i));
    }
	System.out.println("*************");
	List l4 = new ArrayList();
	l4.add(50);
	l4.add(51);
	l4.add(53);
	l4.add(54);
	l4.add(1,1000); 
	System.out.println(l4);
	
	System.out.println("*************");
	System.out.println("--------sublist------");
	List l6 =l4.subList(0, 2);
	System.out.println(l6);
   }
   
   
}
