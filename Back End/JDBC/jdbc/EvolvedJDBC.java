// using try with resources
package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class EvolvedJDBC
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//get db connection
		String dbUrl= "jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
		System.out.println("enter db username and password");
		String user=sc.nextLine(); 
		String password = sc.nextLine();
		String query = "select * from users_info";
        
		try(Connection conn = DriverManager.getConnection(dbUrl, user, password);
				Statement stmt = conn.createStatement();
				ResultSet rs = stmt.executeQuery(query)
			)
		  {
			while (rs.next())
			{
				System.out.println("Userid "+ rs.getInt(1));
				System.out.println("UserNAME "+ rs.getString("username"));
				System.out.println("email "+ rs.getString(3));
				System.out.println("**************************");
			}
			sc.close();
		  }
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	
	}
}