package com.capgemini.phoneapplication.appfactory;

import com.capgemini.phoneapplication.appDAO.ContactDAO;
import com.capgemini.phoneapplication.appDAO.ContactDAOImpl;
import com.capgemini.phoneapplication.appservices.ContactServices;
import com.capgemini.phoneapplication.appservices.ContactServicesImpl;

public class AppFactory 
{
 // ContactDAO dao = new ContactDAOImpl();
  
  public static ContactDAO instanceOfContactDAOImpl()
  {
	  ContactDAO dao = new ContactDAOImpl();
	  return dao;
  }
  
  public static ContactServices instanceOfContactServicesImpl()
  {
	  ContactServices services = new ContactServicesImpl();
	  return services;
  }
}
