package com.capgemini.threads;

public class PVRMain
{
  public static void main(String[] args) 
  {
	  System.out.println("main started");
	  PVR p = new PVR();
	  User u1 = new User(p);
	  u1.start();
	  
	  try 
		{
			Thread.sleep(500);
		} catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	  
	  p.leaveMe();
	  
	  System.out.println("main ended");
  }
}
