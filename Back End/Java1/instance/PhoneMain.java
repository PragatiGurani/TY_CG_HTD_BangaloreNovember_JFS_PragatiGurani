package com.capgemini.instance;

public class PhoneMain
{
	public static void main(String[] args) 
	{
		Crush c1=new Crush();
		
		BasicSet b=new BasicSet();
		Oppo o=new Oppo();
		OnePlus op=new OnePlus();
		Apple a=new Apple();
		
		c1.receive(o);
		
	}

}
