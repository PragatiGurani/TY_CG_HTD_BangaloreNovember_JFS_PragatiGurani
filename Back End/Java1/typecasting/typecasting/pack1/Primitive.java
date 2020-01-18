package com.tyss.typecasting.pack1;

public class Primitive
{ 
	//implicit
	byte a=4;
	short s=a;
	int i=a;
	double d=a;
	
	void m1()
	{
		System.out.println("short "+s);
		System.out.println("int "+i);
		System.out.println("double "+d);
	}
	
	//explicit
		double b=4.28;
		int j=(int)b;
		double k=b;
		
		void m2()
		{
			System.out.println("int "+j);
			System.out.println("double "+k);
		}
	

}
