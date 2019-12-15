package com.capgemini.interfaces.interface1;

public class BottleDeMain 
{
	public static void main(String[] args)
	{
		PepsiDe p1= new PepsiDe();
		p1.drink();
		p1.open();
		p1.juice(); // since its implementation is given in interface only
		BottleDefault.close();
	}

}
