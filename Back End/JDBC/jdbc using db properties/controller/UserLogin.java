package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UserLogin 
{
 public static void main(String[] args) 
 {
	
	 UserServices services = UserFactory.instanceOfUserServices();
     UserBean user = new UserBean();
     Scanner sc = new Scanner(System.in);
     
     System.out.println("Enter Username.....");
     user.setUsername(sc.nextLine());
    
     System.out.println("Enter Password.....");
     user.setPassword(sc.nextLine());
     
    UserBean user1 = services.userLogin(user.getUsername(), user.getPassword());
     if(user1 != null)
     {
    	 System.out.println("userid is "+user1.getUserid());
    	 System.out.println("username is "+user1.getUsername());
    	 System.out.println("email is +"+user1.getEmailid());
     }
     else
     {
    	 System.err.println("something went wrong"); 
     }
 }
}