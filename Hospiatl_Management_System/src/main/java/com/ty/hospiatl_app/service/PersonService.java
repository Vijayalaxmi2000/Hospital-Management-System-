package com.ty.hospiatl_app.service;

import java.util.List;


import com.ty.hospiatl_app.dao.imp.PersonDaoImp;

import com.ty.hospiatl_app.dto.Person;

public class PersonService
{
	public void savePerson(Person person,int eid)
	{
		PersonDaoImp daoImp=new PersonDaoImp();
		Person person2= daoImp.savePerson(eid,person);
		if(person2!=null)
		{
			System.out.println("Person saved");
		}
		else
		{
			System.out.println("Unfortunately Person not saved");
		}
	}
	public List<Person> getPerson(int pid,Person address)
	{
		PersonDaoImp daoImp=new PersonDaoImp();
		List<Person> persons=daoImp.getPersonByAge(pid);	
		if(persons!=null)
		{
			return persons;
		}
		else
		{
			return null;
		}		
	}
	public void deletePerson(int pid)
	{
		PersonDaoImp daoImp=new PersonDaoImp();
		boolean person= daoImp.deletePersonId(pid);
		if(person)
		{
			System.out.println("Person deleted");
		}
		else
		{
			System.out.println("Unfortunately Person not deleted");
		}
	}
	public Person updatePerson(int pid, Person person)
	{
		PersonDaoImp daoImp=new PersonDaoImp();
		Person person2= daoImp.updateBranch(pid, person);
		if(person2!=null)
		{
			return person2;
		}
		else
		{
			return null;
		}
	}
	public List<Person> getAllPerson() 
	{
		PersonDaoImp daoImp=new PersonDaoImp();
		List<Person> persons=daoImp.getAllPerson();	
		if(persons!=null)
		{
			return persons;
		}
		else
		{
			return null;
		}		
	}

	public List<Person> getPersonByAge(int age)
	{
		PersonDaoImp daoImp=new PersonDaoImp();
		List<Person> persons=daoImp.getPersonByAge(age);	
		if(persons!=null)
		{
			return persons;
		}
		else
		{
			return null;
		}		
	}

	public List<Person> getPersonByPhNo(long phNo) 
	{
		PersonDaoImp daoImp=new PersonDaoImp();
		List<Person> persons=daoImp.getPersonByPhNo(phNo);	
		if(persons!=null)
		{
			return persons;
		}
		else
		{
			return null;
		}		
	}
	


}
