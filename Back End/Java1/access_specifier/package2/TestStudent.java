package com.capgemini.access.pack2;

import com.capgemini.access.pack1.Student;
public class TestStudent extends Student
{

	protected TestStudent(String name) 
	{
		super(name);
	} 
	void studentDetails() 
	{
		 System.out.println("Sname is  "+name);
	}
    
	public static void main(String[] args)
	{
//		Student s=new Student("Chinnu");
//   	 System.out.println(s.name); 
//   	 s.studDetails();
		
		TestStudent t= new TestStudent("John");
		System.out.println(t.name);
		t.studDetails();
		t.studentDetails();
	}
}
