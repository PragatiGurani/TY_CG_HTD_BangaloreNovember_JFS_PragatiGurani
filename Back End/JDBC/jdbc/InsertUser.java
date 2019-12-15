package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser
{
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 Connection conn = null;
	 PreparedStatement pstmt = null;
	 
	 try 
	 {
		//load the driver
		Driver driver = new com.mysql.jdbc.Driver();
		DriverManager.registerDriver(driver);
		System.out.println("Driver Loaded.....");
		  
		//get database connection to driver
		  String dbUrl= "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
		  System.out.println("enter db username and password");
		  String user=sc.nextLine(); 
		  String password = sc.nextLine();
		  conn = DriverManager.getConnection(dbUrl, user, password);
		  System.out.println("Connection Establised.........");
		  
		//issue sql query to conn
		  String query="INSERT into users_info values(?,?,?,?)";
		  pstmt = conn.prepareStatement(query);
		  
		     System.out.println("Enter userid"); //dynamic so execute with parameter
	         pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
	         
	         System.out.println("Enter username");
	         pstmt.setString(2, sc.nextLine());
	         
	         System.out.println("Enter email");
	         pstmt.setString(3, sc.nextLine());
	         
	         System.out.println("Enter password");
	         pstmt.setString(4, sc.nextLine());
	         
	         int count = pstmt.executeUpdate();
			  if(count>0)
			  {
				  System.out.println("User added");
			  }
			  else
			  {
				  System.out.println("something went wrong");
			  }
	 }
	 catch (Exception e)
	 {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 //close all JDBC object
	 finally
	  {
		try{
		     if(conn != null)
			    conn.close();
		   }
		      catch (SQLException e)
		      {
			    e.printStackTrace();
		      }

		    try
		    {
		    	if(pstmt != null)
				   pstmt.close();
		    } 
		    	catch (SQLException e)
		    {
			    
				  e.printStackTrace();
			  
		    }
	  }	
 }
}
