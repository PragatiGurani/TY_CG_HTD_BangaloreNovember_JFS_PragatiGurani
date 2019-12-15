package com.capgemini.interfaces.interface1;

public class Robot implements Moment,Sound
{
  public void move()
  {
	  System.out.println("moving");
  }
  public void talk()
  {
	  System.out.println("talking");
  }
}
