package com.capgemini.object;

public class Emp
{
	int empId;
	String empName;
	public Emp(int empId, String empName) 
	{
		this.empId = empId;
		this.empName = empName;
	}
	  
	public int hashCode()   // by compiler hashcode over-riden
     {
		return 10;
     }
	
//	public int hashCode()   // by compiler hashcode over-riden
//	   {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result + empId;
//		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
//		return result;
//  	}
	
	
	
	public boolean equals(Object obj)   //equals method over-riden by user
	{
		Emp e1=(Emp) obj;
		if(e1.empId == (this.empId))
		{
			if(e1.empName.equals(this.empName))
			{
					return true;
			}
			else
			{
				return false;
			}
		}
		else 
			return false;
	}
	
	
}
