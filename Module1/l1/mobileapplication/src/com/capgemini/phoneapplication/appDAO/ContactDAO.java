package com.capgemini.phoneapplication.appDAO;

import java.util.List;

import com.capgemini.phoneapplication.appbean.PhoneBean;

public interface ContactDAO 
{
   boolean insert(PhoneBean p1);
   boolean delete(String name,int number);
   boolean update(String name,int number);
   List<PhoneBean> getAllContact();
   boolean search(String name);
}
