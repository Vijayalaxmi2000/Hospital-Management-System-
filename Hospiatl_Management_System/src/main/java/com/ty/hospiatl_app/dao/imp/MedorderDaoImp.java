package com.ty.hospiatl_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospiatl_app.dao.MedorderDao;
import com.ty.hospiatl_app.dto.Encounter;
import com.ty.hospiatl_app.dto.MedOrder;

public class MedorderDaoImp implements MedorderDao
{

	public MedOrder saveMedOrder(int eid, MedOrder medOrder) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if(encounter!=null)
		{
			entityTransaction.begin();
			entityManager.persist(medOrder);
			entityTransaction.commit();
			return medOrder;
		}
		else
		{
			return null;
		}

	}

	public MedOrder getMedOrderById(int mid) 
	{

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	
		MedOrder medOrder =entityManager.find(MedOrder.class,mid);
		return medOrder;
	}

	public boolean deleteMedOrderById(int mid)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		MedOrder medOrder =entityManager.find(MedOrder.class,mid);
		if(medOrder!=null)
		{
			entityTransaction.begin();
			entityManager.refresh(medOrder);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public MedOrder updateMedOrder(int mid, MedOrder medOrder) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		MedOrder order =entityManager.find(MedOrder.class,mid);
		if(order!=null)
		{
			order.setDname(medOrder.getDname());
			order.setOrderDate(medOrder.getOrderDate());
            entityTransaction.begin();
            entityManager.merge(order);
            return order;
		}
		else
		{
			return null;
		}
	}

	public List<MedOrder> getMedorderByDoctorName(String name) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select v from MedOrder v"); 
        List<MedOrder> medOrders=query.getResultList();     
		return medOrders;
	}

}
