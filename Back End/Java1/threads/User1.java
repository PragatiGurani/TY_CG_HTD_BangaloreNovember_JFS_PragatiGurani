package com.capgemini.threads;

public class User1 extends Thread
{
	   IRCTC i;
	  
	   public User1(IRCTC i)
	   {
			super();
			this.i = i;
		}
	   @Override
		public void run()
	   {
			i.confirmTicket();
		}

}
