package com.capgemini.phoneapplication.appDAO;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.phoneapplication.appbean.PhoneBean;

public class ContactDAOImpl implements ContactDAO
{
	FileReader reader;
	Properties prop;
	PhoneBean p1;

	public ContactDAOImpl()
	{
		try
		{
			reader = new FileReader("db.Properties");
			prop = new Properties();
			prop.load(reader);
			Class.forName(prop.getProperty("driverClass"));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	@Override
	public boolean insert(PhoneBean p1) 
	{
		try(Connection con= DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("addContactQuery"));
				)	
		{
			pstmt.setString(1, p1.getName());
			pstmt.setInt(2, p1.getNumber());
			pstmt.setString(3, p1.getGroupname());

			int count = pstmt.executeUpdate();

			if(count  > 0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(String name, int number) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("deleteContactQuery"));
				)	
		{
			pstmt.setString(1, name);
			pstmt.setInt(2, number);

			int count = pstmt.executeUpdate();

			if(count  > 0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(String name, int number) {
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("updateContactQuery"));
				)	
		{
			pstmt.setString(2, name);
			pstmt.setInt(1, number);
			
			int count = pstmt.executeUpdate();

			if(count  > 0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public List<PhoneBean> getAllContact() 
	{
		List<PhoneBean> l1 = new ArrayList<PhoneBean>();
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery(prop.getProperty("getContactQuery"));
				)	
		{
            p1 = new PhoneBean();
			while(rs.next())
		   {
             p1.setName(rs.getString(1));
             p1.setNumber(rs.getInt(2));
             p1.setGroupname(rs.getString(3));
             l1.add(p1);
		   }
			return l1;
		}
		catch(Exception e)
		{
		e.printStackTrace();
		}

		return null;
	}

	@Override
	public boolean search(String name) 
	{
		try(Connection con=DriverManager.getConnection(prop.getProperty("dbUrl"),
				prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				PreparedStatement pstmt=con.prepareStatement(prop.getProperty("searchContactQuery"));
				)	
		{
			pstmt.setString(1, name);

			int count = pstmt.executeUpdate();

			if(count  > 0)
			{
				return true;
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}
}
