package com.capgemini.loosecoupling1;

public class Main
{
	public static void main(String[] args)
	{
		Cat c1=new Cat();
		Lays l1=new Lays();
		Kurkure k=new Kurkure();
		Bingo b=new Bingo();
		Chips c=new Chips();
		c1.feedChips(b);
	}

}
