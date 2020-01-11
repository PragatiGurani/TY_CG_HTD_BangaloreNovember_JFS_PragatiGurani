package com.capgemini.appdevelopment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.appdevelopment.dao.UserDao;
import com.capgemini.appdevelopment.dto.UsersInfoBean;

@Service
public class UserServiceImpl implements UserService {

	
	@Autowired
	UserDao dao;
	
	@Override
	public boolean createProfile(UsersInfoBean usersInfoBean) {
		return dao.createProfile(usersInfoBean);
	}

	@Override
	public boolean updatePassword(int user_id, String password) {
		return dao.updatePassword(user_id, password);
	}

	@Override
	public UsersInfoBean login(UsersInfoBean usersInfoBean) {
		return dao.login(usersInfoBean);
	}
}