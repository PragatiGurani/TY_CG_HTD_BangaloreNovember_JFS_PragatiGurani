package com.capgemini.threads;

public class IRCTC 
{
	synchronized void confirmTicket()
	  {
		  for( int i=0; i<4 ; i++)
			{
				System.out.println(i);
				
//				try 
//				{
//					Thread.sleep(1000);
//				} catch (InterruptedException e)
//				{
//					System.out.println(e.getMessage());
//				}
				
				try {
					wait();
				} 
				catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
	  }
	
	synchronized void leaveMe()
	  {
		  System.out.println("notify called");
		  //notify();  //it release one threads from waiting
		  notifyAll(); //it release all threads from waiting
	  }
}
