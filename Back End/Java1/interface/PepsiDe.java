package com.capgemini.interfaces.interface1;

public class PepsiDe implements BottleDefault
{
	public void open()
	   {
		   System.out.println("Open peps bottle");
	   }
	  
	  public void drink()
	  {
		   System.out.println("Drink peps");
	  }
	  
	  //we can't access static close here
	    
	  public void juice() //we can over-ride a method juice
		{
			System.out.println("Peps juice");
		}
}
