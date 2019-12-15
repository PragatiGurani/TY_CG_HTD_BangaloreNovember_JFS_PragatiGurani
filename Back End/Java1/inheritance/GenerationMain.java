package com.capgemini.inheritance.inheritance1;

public class GenerationMain 
{
	public static void main(String[] args)
	{
		FirstGen f1= new FirstGen();
		f1.call();
		f1.msg();
		SecondGen s1= new SecondGen();
		s1.call();
		s1.msg();
		s1.radio();
		ThirdGen t1 =new ThirdGen();
		t1.call();
		t1.msg();
		t1.radio();
		t1.camera();
	}

}
