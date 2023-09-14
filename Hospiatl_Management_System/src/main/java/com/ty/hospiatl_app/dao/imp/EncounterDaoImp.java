package com.ty.hospiatl_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospiatl_app.dao.EncounterDao;
import com.ty.hospiatl_app.dto.Branch;
import com.ty.hospiatl_app.dto.Encounter;

public class EncounterDaoImp implements EncounterDao 
{

	public Encounter saveEncounter(int bid, Encounter encounter) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Branch branch=entityManager.find(Branch.class, bid);
		if(branch!=null)
		{
			entityTransaction.begin();
			entityManager.persist(encounter);
			entityTransaction.commit();
			return encounter;
		}
		else
		{
			return null;
		}
	}

	public Encounter getEncounterById(int eid) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	
		Encounter encounter =entityManager.find(Encounter.class,eid);
		return encounter;
	}

	public boolean deleteEncounterById(int eid) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if(encounter!=null)
		{
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public Encounter updateEncounter(int eid, Encounter encounter) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Encounter encounter2=entityManager.find(Encounter.class, eid);
		if(encounter2!=null)
		{
			encounter2.setDateOfJoin(encounter.getDateOfJoin());
			encounter2.setReason(encounter.getReason());
			encounter2.setDateOfDischarge(encounter2.getDateOfDischarge());;
            entityTransaction.begin();
            entityManager.merge(encounter);
            return encounter2;
		}
		else
		{
			return null;
		}
	}

	public List<Encounter> getAllEncounter()
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select v from Encounter v"); 
        List<Encounter> encounter=query.getResultList();     
		return encounter;
	}

}
