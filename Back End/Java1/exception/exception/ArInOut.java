package com.capgemini.exception.exception;

public class ArInOut 
{
  public static void main(String[] args) 
  {
	  System.out.println("Main started");
	int[] a = new int[2];
	a[0]=10;
	a[1]=20;
	try
	{
	  a[2]=30;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("out of size");
	}
	System.out.println("Main ended");
  }
}
