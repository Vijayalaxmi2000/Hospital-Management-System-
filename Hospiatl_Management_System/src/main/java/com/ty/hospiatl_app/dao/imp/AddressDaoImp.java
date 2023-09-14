package com.ty.hospiatl_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospiatl_app.dao.AddressDao;
import com.ty.hospiatl_app.dto.Address;
import com.ty.hospiatl_app.dto.Branch;

public class AddressDaoImp implements AddressDao
{

	public Address saveAddress(int bid, Address address) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Branch branch=entityManager.find(Branch.class, bid);
		if(branch!=null)
		{
			entityTransaction.begin();
			entityManager.persist(address);
			entityTransaction.commit();
			return address;
		}
		else
		{
			return null;
		}
	}

	public Address getAddressById(int aid) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	
		Address address=entityManager.find(Address.class,aid);
		return address;
	}

	public boolean deleteAddressById(int aid)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Address address=entityManager.find(Address.class, aid);
		if(address!=null)
		{
			entityTransaction.begin();
			entityManager.refresh(address);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public Address updateAddress(int aid, Address address)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Address address2=entityManager.find(Address.class, aid);
		if(address2!=null)
		{
			address2.setStreet(address.getStreet());
			address2.setState(address.getState());
			address2.setCountry(address.getCountry());
            entityTransaction.begin();
            entityManager.merge(address);
            return address2;
		}
		else
		{
			return null;
		}
	}

	public List<Address> getAllAddress() 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select v from Addressh v"); 
        List<Address> address=query.getResultList();     
		return address;
	}

}
