package com.ty.hospiatl_app.dao;

import java.util.List;

import com.ty.hospiatl_app.dto.User;

public interface UserDao
{
public User saveUser(User user);
	
	public User getUserid(int uid);
	
	public boolean deleteUserId(int uid);
	
	public User updateUser(int uid, User user);
	
	public List<User> getAllUser();
	
	public List<User> getUserByrole(String role);

}
