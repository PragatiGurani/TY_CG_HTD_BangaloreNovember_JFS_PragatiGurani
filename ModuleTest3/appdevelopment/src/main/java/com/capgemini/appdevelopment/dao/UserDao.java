package com.capgemini.appdevelopment.dao;

import com.capgemini.appdevelopment.dto.UsersInfoBean;

public interface UserDao {

	public boolean createProfile(UsersInfoBean usersInfoBean);
	
	UsersInfoBean login(UsersInfoBean usersInfoBean);
	
	boolean updatePassword(int user_id, String password);
}
