package com.ty.hospiatl_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospiatl_app.dao.PersonDao;
import com.ty.hospiatl_app.dto.Encounter;
import com.ty.hospiatl_app.dto.Person;

public class PersonDaoImp implements PersonDao 
{

	public Person savePerson(int eid, Person person) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Encounter encounter=entityManager.find(Encounter.class, eid);
		if(encounter!=null)
		{
			entityTransaction.begin();
			entityManager.persist(person);
			entityTransaction.commit();
			return person;
		}
		else
		{
			return null;
		}

	}

	public Person getPersonId(int pid) 
	{

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	
		Person person =entityManager.find(Person.class,pid);
		return person;
	}

	public boolean deletePersonId(int pid) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Person person =entityManager.find(Person.class,pid);
		if(person!=null)
		{
			entityTransaction.begin();
			entityManager.refresh(person);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

	public Person updateBranch(int eid, Person person) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Person persons =entityManager.find(Person.class,eid);
		if(persons!=null)
		{
			persons.setName(person.getName());
			persons.setAge(person.getAge());
			persons.setPhNo(person.getPhNo());
			persons.setGender(person.getGender());
            entityTransaction.begin();
            entityManager.merge(person);
            return persons;
		}
		else
		{
			return null;
		}
	}

	public List<Person> getAllPerson() 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select v from Person v "); 
        List<Person> persons=query.getResultList();     
		return persons;
	}

	public List<Person> getPersonByAge(int age)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select v from Person v where age=?"); 
        List<Person> persons=query.getResultList();     
		return persons;
	}

	public List<Person> getPersonByPhNo(long phNo) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select v from Personh v where phNo=?"); 
        List<Person> persons=query.getResultList();     
		return persons;
	}

}
