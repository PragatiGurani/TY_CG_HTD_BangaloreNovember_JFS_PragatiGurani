package com.capgemini.set.treeset;

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

@Override
public String toString() //since its giving hashcode
{
	return "Student [age=" + age + ", name=" + name + "]";
}

@Override          //no need so equals and hashcode bcz comaparartor does that
   public int compareTo(Student o) 
   {
	if(this.age > o.age)
	return 1;
	else if(this.age <  o.age)
		return -1;
	else
		return 0;
   } 
}