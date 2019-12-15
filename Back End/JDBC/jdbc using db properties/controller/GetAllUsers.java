package com.capgemini.jdbc.controller;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class GetAllUsers
{
  public static void main(String[] args)
  {
	  UserServices services = UserFactory.instanceOfUserServices();
	  List<UserBean> list = services.getAllUsers();
	  
	  if(list != null)
	  {
		  for(UserBean user : list)  //calling with for each loop
		  {
			  System.out.println(user);
		  }
	  }
  }
}