package com.ty.hospiatl_app.dao;

import java.util.List;

import com.ty.hospiatl_app.dto.Person;

public interface PersonDao 
{
	public Person savePerson(int eid, Person person);

	public Person getPersonId(int pid);
 
	public boolean deletePersonId(int pid);

	public Person updateBranch(int eid, Person person);
	
	public List<Person> getAllPerson();
	
	public List<Person> getPersonByAge(int age);
	
	public List<Person> getPersonByPhNo(long phNo);

}
