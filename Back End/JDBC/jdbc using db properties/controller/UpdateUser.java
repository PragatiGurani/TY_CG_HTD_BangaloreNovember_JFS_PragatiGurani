package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UpdateUser 
{
  public static void main(String[] args)
  {
	     UserServices services = UserFactory.instanceOfUserServices();
	     UserBean user = new UserBean();
	     
	     Scanner sc = new Scanner(System.in);
	     
	     System.out.println("Enter Userid.....");
	     user.setUserid(Integer.parseInt(sc.nextLine()));
	     
	     System.out.println("Enter Password.....");
	     user.setPassword(sc.nextLine());
	     
	     System.out.println("Enter emailid.....");
	     user.setEmailid(sc.nextLine());
	     
		if(services.updateUser(user.getUserid(), user.getPassword(), user.getEmailid()))
	     {
	    	 System.out.println("user updated");
	     }
	     else
	     {
	    	 System.err.println("something went wrong"); 
	     }
  }
}