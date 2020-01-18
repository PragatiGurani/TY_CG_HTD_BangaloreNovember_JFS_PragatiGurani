package com.capgemini.vectors.vector;

import java.util.Vector;

public class Vector3 
{
	public static void main(String[] args) 
	 {
		 Vector v1 = new Vector();
		 v1.addElement(48);
		 v1.addElement(44);
		 v1.addElement(76);
		 v1.add(98);
		 System.out.println(v1);
		 
		 System.out.println("------remove ele------------");
		 v1.removeElement(new Integer(76));
		 System.out.println(v1);
		 v1.removeElementAt(1);
		 System.out.println(v1);
//		 System.out.println("------remove all ele--------");
//		 v1.removeAllElements();
//		 System.out.println(v1);
		 System.out.println("------copy Info in array-----");
		 Object i1[] = new Object[v1.size()];
		 
		 v1.copyInto(i1);
		 for(int i=0; i<i1.length ; i++)
		 {
			 System.out.println(i1[i]);
		 }
		 System.out.println("*************************");
		 Vector v2 = new Vector();
		 v2.addElement(22);
		 v2.addElement(24);
		 System.out.println(v2.size());
		 System.out.println(v2.capacity());
		 
		 System.out.println("---------after triming size---------");
		 v2.trimToSize();
		 System.out.println(v2.size());
		 System.out.println(v2.capacity());
		 
		 System.out.println("---------changing the capacity------");
		 v2.ensureCapacity(6);
		 v2.setSize(8);
		 System.out.println(v2.size());
		 System.out.println(v2.capacity());// double the size
		 System.out.println(v2);  //elements will be 6 now bcz of size
	 }
}
