package com.capgemini.interfaces.interface1;

public class RobotMain 
{
   public static void main(String[] args)
   {
	   Robot r= new Robot();
	   r.move();
	   r.talk();
	   
	   Moment m= new Robot();
	   m.move();   //super class method since over-riden in subclass
//	   m.talk();
}
}
