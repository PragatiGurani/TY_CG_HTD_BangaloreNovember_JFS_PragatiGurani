package com.capgemini.queue.priorityqueue;

public class Student implements Comparable<Student>
{
 int age;
 String name;
  public Student(int age, String name)
  {
	super();
	this.age = age;
	this.name = name;
  }
//@Override
//public String toString() 
//{
//	return "Student [age=" + age + ", name=" + name + "]";
//}

@Override
public int compareTo(Student o)  //since sorting is not allowed
{
	return 0;
}
}
