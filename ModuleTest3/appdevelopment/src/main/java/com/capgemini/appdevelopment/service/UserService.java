package com.capgemini.appdevelopment.service;

import com.capgemini.appdevelopment.dto.UsersInfoBean;

public interface UserService {

public boolean createProfile(UsersInfoBean usersInfoBean);
	
UsersInfoBean login(UsersInfoBean usersInfoBean);
	
	boolean updatePassword(int user_id, String password);
	
}
