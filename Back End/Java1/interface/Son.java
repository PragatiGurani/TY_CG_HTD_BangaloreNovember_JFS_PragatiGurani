package com.capgemini.interfaces.interface1;

public class Son implements Father1,Father2
{

	@Override  // click on son its gives option to select
	public void home() 
	{
		Father1.super.home();
	}

}
