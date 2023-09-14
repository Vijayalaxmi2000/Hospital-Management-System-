package com.ty.hospiatl_app.service;

import java.util.List;

import com.ty.hospiatl_app.dao.imp.UserDaoImp;
import com.ty.hospiatl_app.dto.User;

public class UserService 
{
	public void saveUser(User user)
	{
		UserDaoImp daoImp=new UserDaoImp();
		User user2= daoImp.saveUser(user);
		if(user2!=null)
		{
			System.out.println("User saved");
		}
		else
		{
			System.out.println("Unfortunately User not saved");
		}
	}
	public User getUser(int uid)
	{
		UserDaoImp daoImp=new UserDaoImp();
		User user= daoImp.getUserid(uid);	
		if(user!=null)
		{
			return user;
		}
		else
		{
			return null;
		}		
	}
	public void deleteUser(int uid)
	{
		UserDaoImp daoImp=new UserDaoImp();
		boolean user= daoImp.deleteUserId(uid);
		if(user)
		{
			System.out.println("User deleted");
		}
		else
		{
			System.out.println("Unfortunately User not deleted");
		}
	}
	public User updateAddress(int uid, User user)
	{
		UserDaoImp daoImp=new UserDaoImp();
		User user2= daoImp.updateUser(uid,user);
		if(user2!=null)
		{
			return user2;
		}
		else
		{
			return null;
		}
	}

	public List<User> getAllUser() 
	{
		UserDaoImp daoImp=new UserDaoImp();
		List<User> user= daoImp.getAllUser();	
		if(user!=null)
		{
			return user;
		}
		else
		{
			return null;
		}		
	}
	public List<User> getUserByrole(String role) 
	{
		UserDaoImp daoImp=new UserDaoImp();
		List<User> user= daoImp.getUserByrole(role);	
		if(user!=null)
		{
			return user;
		}
		else
		{
			return null;
		}		
	}


}
