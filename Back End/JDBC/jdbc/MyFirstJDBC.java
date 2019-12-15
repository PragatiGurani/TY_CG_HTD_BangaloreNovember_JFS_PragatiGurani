package com.caps.jdbc;

import java.sql.SQLException;

import java.sql.Statement;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Connection;

//import com.mysql.jdbc.Statement;

public class MyFirstJDBC 
{ 
	public static void main(String[] args)
	{
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			//Load the Driver
			Driver driver = new com.mysql.jdbc.Driver();  
			DriverManager.registerDriver(driver);
			//Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver Loaded...");
			
			//get the databases connection via driver
		    String dbUrl ="jdbc:mysql://localhost:3306/ty_cg_nov6"+"?user=root&password=root";
		    conn = DriverManager.getConnection(dbUrl);
		    System.out.println("Connection Establised...");
		    
		  //issue SQL queries via connection
		    String query = "SELECT * FROM users_info";
		    stmt = conn.createStatement();
		    rs = stmt.executeQuery(query);
		    System.out.println("Query issued");
		    System.out.println("*******************");
		   
		 //process the result returned by sql queries
		  while(rs.next())
		   {
			System.out.println("Userid: "+rs.getInt("userid"));
			System.out.println("UserName: "+rs.getString("username"));
			System.out.println("Email: "+rs.getString("emailid"));
			System.out.println("Password: "+rs.getString("password"));
			System.out.println("*******************************");
		   }
	   }
		catch(SQLException e) 
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
			    	if(stmt != null)
					   stmt.close();
			    } 
			    	catch (SQLException e)
			    {
				    
					  e.printStackTrace();
				  
			    }
		  }
//				    try 
//				    {
//				    	if(rs != null)
//				    		rs.close();
//				    }
//				    catch (SQLException e) 
//				    {
//					   e.printStackTrace();
//				    }
//			    }
	         }
         }
