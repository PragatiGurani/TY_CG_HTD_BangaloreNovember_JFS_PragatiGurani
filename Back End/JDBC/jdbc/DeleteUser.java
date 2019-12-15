package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser 
{
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 Connection conn = null;
	 PreparedStatement pstmt = null;
   //load the driver
	 try 
	 {
//		Driver driver = new com.mysql.jdbc.Driver();
//		DriverManager.registerDriver(driver);
		 Class.forName("com.mysql.jdbc.Driver");
		 System.out.println("Driver Loaded.....");
		  
		//get database connection to driver
		  String dbUrl= "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
		  System.out.println("enter db username and password");
		  String user=sc.nextLine(); 
		  String password = sc.nextLine();
		  conn = DriverManager.getConnection(dbUrl, user, password);
		  
		//issue sql query to conn
		  String query="DELETE from users_info where userid=?"
				  +" and password= ?";
		  pstmt = conn.prepareStatement(query);
		  
		     System.out.println("Enter Userid"); //dynamic so execute with parameter
	         pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
	         System.out.println("Enter password");
	         pstmt.setString(2, sc.nextLine()); //its second parameter so
		  
		  int count = pstmt.executeUpdate();
		  if(count>0)
		  {
			  System.out.println("User deleted");
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
	 finally
	  {
		try{
		     if(conn != null)
			    conn.close();
		   }
		      catch (Exception e)
		      {
			    e.printStackTrace();
		      }

		    try
		    {
		    	if(pstmt != null)
				   pstmt.close();
		    } 
		    	catch (Exception e)
		    {
			    
				  e.printStackTrace();
			  
		    }
	  }	
	 
	 
	 //process the result returned 
	 //close all JDBC object
 }
}
