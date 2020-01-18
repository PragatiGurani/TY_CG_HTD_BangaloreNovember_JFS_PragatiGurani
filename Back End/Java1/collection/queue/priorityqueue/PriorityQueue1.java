package com.capgemini.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue1 
{
 public static void main(String[] args) 
 {
	Queue p1 = new PriorityQueue();
	p1.offer(76);
	p1.offer(78);
	p1.offer(77);
	p1.offer(79);
	p1.offer(79);
	System.out.println(p1); 
	p1.poll();
	p1.poll();
	System.out.println(p1); //it automatically sorts though you entered in randomly when operation is performed
	System.out.println(p1.element()); 
	
	System.out.println("------for each------");
	for(Object o1:p1)
	{
		System.out.println(o1);
	}
 }
}
