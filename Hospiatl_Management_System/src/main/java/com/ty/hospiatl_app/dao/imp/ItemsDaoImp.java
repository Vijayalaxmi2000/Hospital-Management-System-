package com.ty.hospiatl_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospiatl_app.dao.ItemsDao;
import com.ty.hospiatl_app.dto.Items;
import com.ty.hospiatl_app.dto.MedOrder;

public class ItemsDaoImp implements ItemsDao
{

	public Items saveItems(int mid, Items items)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		MedOrder medOrder=entityManager.find(MedOrder.class, mid);
		if(medOrder!=null)
		{
			entityTransaction.begin();
			entityManager.persist(items);
			entityTransaction.commit();
			return items;
		}
		else
		{
			return null;
		}
	}

	public Items getItemsById(int iid)
	{

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	
		Items items =entityManager.find(Items.class,iid);
		return items;
	}

	public boolean deleteItemsById(int iid)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Items items =entityManager.find(Items.class,iid);
		if(items!=null)
		{
			entityTransaction.begin();
			entityManager.remove(items);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public Items updateItems(int iid, Items items) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Items item =entityManager.find(Items.class,iid);
		if(item!=null)
		{
			item.setName(null);
			item.setOrder(items.getOrder());
			item.setQuantity(items.getQuantity());
			item.setCost(items.getCost());
            entityTransaction.begin();
            entityManager.merge(item);
            return item;
		}
		else
		{
			return null;
		}
	}

	public List<Items> getAllItems() 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select v from Items v"); 
        List<Items> items=query.getResultList();     
		return items;
	}

}
