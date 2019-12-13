package com.capgemini.phoneapplication.appservices;

import java.util.List;

import com.capgemini.phoneapplication.appDAO.ContactDAO;
import com.capgemini.phoneapplication.appbean.PhoneBean;
import com.capgemini.phoneapplication.appfactory.AppFactory;

public class ContactServicesImpl implements ContactServices
{
   ContactDAO dao = AppFactory.instanceOfContactDAOImpl();
   
	@Override
	public boolean insert(PhoneBean p1) {
		return dao.insert(p1);
	}

	@Override
	public boolean delete(String name, int number) {
		return dao.delete(name, number);
	}

	@Override
	public boolean update(String name, int number) {
		return dao.update(name, number);
	}

	@Override
	public List<PhoneBean> getAllContact() {
		return dao.getAllContact();
	}

	@Override
	public boolean search(String name) {
		return dao.search(name);
	}

}
