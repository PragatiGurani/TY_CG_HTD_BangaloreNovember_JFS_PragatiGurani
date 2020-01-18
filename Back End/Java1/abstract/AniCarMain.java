package com.capgemini.abstractclass.abstract1;

public class AniCarMain
{
	public static void main(String[] args)
	{
		Dog d1=new Dog("pinky");
		System.out.println(d1.name);
		Animal a1=new Dog("jimi");
		System.out.println(a1.name);
	}

}
