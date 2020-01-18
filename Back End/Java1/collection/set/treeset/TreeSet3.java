package com.capgemini.set.treeset;

import java.util.TreeSet;

public class TreeSet3 
{
 public static void main(String[] args)
 {
	 EmployeeName e1 = new EmployeeName();
	 EmployeeSal e2 = new EmployeeSal();
	 EmployeeAge e3 = new EmployeeAge();
	 TreeSet<Employee> t1 = new TreeSet<Employee>(e2);
	 t1.add(new Employee(65, 30000, "Paramesh"));
	 t1.add(new Employee(34, 40000, "Bhanu"));
	 t1.add(new Employee(65, 35000, "Paramesh"));
	 t1.add(new Employee(42, 10000, "Gopal"));
	 
	 for(Employee employee :t1)  //for each loop
	 {
		 System.out.println("emp name is "+ employee.name);
		 System.out.println("emp sal is "+ employee.sal);
		 System.out.println("emp age is "+ employee.age);
		 System.out.println("-----------------------------------");
	 }
}
}
