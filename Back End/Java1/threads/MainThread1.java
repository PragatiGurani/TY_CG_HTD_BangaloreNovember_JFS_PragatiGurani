package com.capgemini.threads;

public class MainThread1 
{
 public static void main(String[] args)
 {
	 System.out.println("main started");
	 Thread1 t1 = new Thread1();
	 t1.start();
	 System.out.println("main ended");
 }
}
