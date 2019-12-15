package com.capgemini.set.treeset;

public class Employee implements Comparable<Employee>
{
 int age;
 int sal;
 String name;
public Employee(int age, int sal, String name) 
{
	super();
	this.age = age;
	this.sal = sal;
	this.name = name;
}
//@Override
//public int compareTo(Employee o) //sort by sal
//{
//	if(this.sal > o.sal)
//		return 1;
//	else if(this.sal < o.sal)
//		return -1;
//	else
//		return 0;
//}


@Override
public int compareTo(Employee o) // since sorting by name by using camparable
{
	return this.name.compareTo(o.name); //ascending
//	return o.name.compareTo(this.name);
}
 
}
