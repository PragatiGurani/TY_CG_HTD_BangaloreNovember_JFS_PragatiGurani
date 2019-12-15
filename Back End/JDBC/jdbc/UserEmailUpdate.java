package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate
{
  public static void main(String[] args) 
  {
	  Scanner sc = new Scanner(System.in);
	 Connection conn = null;
	 PreparedStatement pstmt = null;
	  try 
	  {  // load the driver  
		  Driver driver = new com.mysql.jdbc.Driver();
		  DriverManager.registerDriver(driver);
		  System.out.println("Driver Loaded.....");
		 
		//get database connection to driver
		  String dbUrl= "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
		  System.out.println("enter db username and password");
		  String user=sc.nextLine(); 
		  String password = sc.nextLine();
		  conn = DriverManager.getConnection(dbUrl, user, password);
		  System.out.println("Connection established.............");
		  
		//issue sql query to conn
		  String query="update users_info set emailid= ? where userid= ? and password= ?";		  
		  pstmt = conn.prepareStatement(query);
		  
		     System.out.println("Enter Userid"); //dynamic so execute with parameter
	         pstmt.setInt(2, Integer.parseInt(sc.nextLine()));  //order should be same
	         System.out.println("Enter emailid");
	         pstmt.setString(1, sc.nextLine()); //its first parameter so
	         System.out.println("Enter password");
	         pstmt.setString(3, sc.nextLine()); //its third parameter so
	         
	         int count = pstmt.executeUpdate(); //other than select query we use execte update --insert,update---
	         System.out.println("Query issued.........");
	          
	         //process the result returned by sql query
	         if(count > 0)
	         {
	        	 System.out.println(" Query ok "+ count +" Rows effected");
	         }
	         else
	         {
	        	 System.out.println(" Something went wrong");
	         }
	  } 
	  catch (Exception e)
	  {
		// TODO Auto-generated catch block
		e.printStackTrace();
	  }
	 
  }
}
