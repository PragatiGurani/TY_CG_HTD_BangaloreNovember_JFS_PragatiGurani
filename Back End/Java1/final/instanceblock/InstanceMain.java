package com.capgemini.instanceblock;

public class InstanceMain 
{
	public static void main(String[] args)
	{
		Instance i=new Instance();
		System.out.println(i.MAXIMUM);
		
		Instance i1=new Instance(20);
		System.out.println(i1.MAXIMUM);
	}

}
