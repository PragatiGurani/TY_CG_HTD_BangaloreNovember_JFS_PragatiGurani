package com.caps.jdbc;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;

//import com.mysql.jdbc.Connection;

public class UserLogin 
{
 public static void main(String[] args)
 {
	 Scanner sc = new Scanner(System.in);
	 Connection conn = null;
	 PreparedStatement pstmt = null;
	 ResultSet rs = null;
	 
	//load the driver
	 try {
		  Driver driver = new com.mysql.jdbc.Driver();
		  DriverManager.registerDriver(driver);
		  System.out.println("Driver Loaded.....");
		  
		//get database connection via driver
		  String dbUrl = "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
		  
		  System.out.println("enter username and password");
		  String dbUser =sc.nextLine();
		  String dbPass = sc.nextLine();
		  conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
		  System.out.println("Connection Establised.........");
		  
		// issues sql query via connection
//		  String query = "select * from users_info where"
//		  		+ " userid= 1001 AND password= '12345' ";
//		  		stmt = conn.createStatement(); //bcz it is present in java.sql.connection interface
//		  		rs = stmt.executeQuery(query);
		  
		         String query = "select * from users_info"
		        		+" where userid =? AND password= ?";
		         pstmt = conn.prepareStatement(query);
		         
		         System.out.println("Enter Userid");  //dynamic so execute with parameter
		         pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
		         System.out.println("Enter password");
		         pstmt.setString(2, sc.nextLine());
		         
		         rs = pstmt.executeQuery();
		         
		  		 System.out.println("Query issued and executed");
				  
		  	// process the results returned
		  		 if(rs.next())  //if returns only one statements
				   {
					System.out.println("Userid: "+rs.getInt(1));  //it takes column index
					System.out.println("UserName: "+rs.getString(2));
					System.out.println("email "+rs.getString(3));
				   }
		  		 else {
		  			 System.err.println("something went wrong");
		  		 }
	    } 
	 catch (SQLException e) 
	 {
		e.printStackTrace();
	 }  
	//close all the JDBC objects
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
	//close all JDBC objects
 }
}
