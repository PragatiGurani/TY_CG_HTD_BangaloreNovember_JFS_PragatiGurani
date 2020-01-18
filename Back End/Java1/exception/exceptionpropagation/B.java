package com.capgemini.exception.exceptionpropagation;

public class B 
{
	static void m() throws ClassNotFoundException
	{
		C.n();
	}
}
