package com.ty.hospiatl_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospiatl_app.dao.UserDao;
import com.ty.hospiatl_app.dto.User;

public class UserDaoImp implements UserDao
{

	public User saveUser(User user) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public User getUserid(int uid) 
	{

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	
		User user=entityManager.find(User.class,uid);
		return user;
	}

	public boolean deleteUserId(int uid) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		User user=entityManager.find(User.class,uid);
		if(user!=null)
		{
			entityTransaction.begin();
			entityManager.refresh(user);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public User updateUser(int uid, User user)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		User users=entityManager.find(User.class,uid);
		if(users!=null)
		{
			users.setName(user.getName());
			users.setEmail(user.getEmail());
			users.setPassword(user.getPassword());
			users.setPhNo(user.getPhNo());
			users.setRole(user.getRole());
            entityTransaction.begin();
            entityManager.merge(users);
            return users;
		}
		else
		{
			return null;
		}
	}

	public List<User> getAllUser() 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select v from User v"); 
        List<User> user=query.getResultList();     
		return user;
	}

	public List<User> getUserByrole(String role) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select v from User v where role=?"); 
        List<User> user=query.getResultList();     
		return user;
	}



}
