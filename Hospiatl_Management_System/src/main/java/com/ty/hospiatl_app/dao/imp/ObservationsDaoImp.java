package com.ty.hospiatl_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospiatl_app.dao.ObservationsDao;
import com.ty.hospiatl_app.dto.Encounter;
import com.ty.hospiatl_app.dto.Observation;

public class ObservationsDaoImp implements ObservationsDao 
{

	public Observation saveObservation(int eid, Observation observation)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if(encounter!=null)
		{
			entityTransaction.begin();
			entityManager.persist(observation);
			entityTransaction.commit();
			return observation;
		}
		else
		{
			return null;
		}

	}

	public Observation getObservationById(int oid) 
	{

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	
		Observation observation =entityManager.find(Observation.class,oid);
		return observation;
	}

	public boolean deleteObservationById(int oid)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Observation observation =entityManager.find(Observation.class,oid);
		if(observation!=null)
		{
			entityTransaction.begin();
			entityManager.refresh(observation);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public Observation updateObservation(int oid, Observation observation)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Observation observations =entityManager.find(Observation.class,oid);
		if(observations!=null)
		{
			observations.setDname(observation.getDname());
			observations.setReasonOfObservation(observation.getReasonOfObservation());
            entityTransaction.begin();
            entityManager.merge(observation);
            return observations;
		}
		else
		{
			return null;
		}
	}

	public List<Observation> getAllObservation() 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select v from Observation v"); 
        List<Observation> observations=query.getResultList();     
		return observations;
	}

	public List<Observation> getObservationByDoctorName(String name) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select v from Observation v where dname=?"); 
        List<Observation> observations=query.getResultList();     
		return observations;
	}

}
