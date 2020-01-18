//Upcasting and downcasting
package com.tyss.typecasting.pack2;

public class TestAnimal
{
	public static void main(String[] args)
	{
		Animal a=new Animal();
		a.walk();
		Animal a1=new Dog();
		a1.walk();
		//a1.run();
		Animal a2=new Lion();
		a2.walk();
		
		
		
		System.out.println("------------------------------");
		Lion l= (Lion) a2;
		l.eat();
		l.walk();
		Dog d= (Dog) a1;
		d.walk();
		d.run();
	
	}

}
