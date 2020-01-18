package com.capgemini.object;

public class Student
{
	int stId;
	String stName;
	public Student(int stId, String stName)
	{
		super();
		this.stId = stId;
		this.stName = stName;
	}
	@Override
	public String toString()
	{
		return "Student stId=" + stId + " stName=" + stName + "";
	}
	
	
	

}
