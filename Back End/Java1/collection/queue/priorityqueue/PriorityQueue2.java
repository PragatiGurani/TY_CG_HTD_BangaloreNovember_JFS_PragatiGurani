package com.capgemini.queue.priorityqueue;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue2
{
 public static void main(String[] args)
 {
	 PriorityQueue<Student> p1 = new PriorityQueue<Student>();
	 p1.add(new Student(18 , "Divya"));
	 p1.add(new Student(15, "Anu"));
	 p1.add(new Student(18 , "Divya"));
	 
	 for(Student o1 : p1)
	 {
	   System.out.println("Student age=" + o1.age + ", name=" + o1.name );
	 }
	 
 }
}
