package com.capgemini.interfaces.interface1;

public class BottleMain 
{
	public static void main(String[] args) 
	{
		Peps p= new Peps();
		p.drink();
		p.open();
		Fanta f= new Fanta();
		f.drink();
		f.open();
	}

}
