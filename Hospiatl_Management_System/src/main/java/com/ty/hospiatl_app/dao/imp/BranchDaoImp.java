package com.ty.hospiatl_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospiatl_app.dao.BranchDao;
import com.ty.hospiatl_app.dto.Branch;
import com.ty.hospiatl_app.dto.Hospital;

public class BranchDaoImp implements BranchDao
{

	public Branch saveBranch(int hid, Branch branch) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Hospital hospital=entityManager.find(Hospital.class, hid);
		if(hospital!=null)
		{
			entityTransaction.begin();
			entityManager.persist(branch);
			entityTransaction.commit();
			return branch;
		}
		else
		{
			return null;
		}
	}

	public Branch getBranchById(int bid) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();	
		Branch branch =entityManager.find(Branch.class,bid);
		return branch;
	}

	public boolean deleteBrancheById(int bid) 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Branch branch=entityManager.find(Branch.class, bid);
		if(branch!=null)
		{
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		}
		else
		{
			return false;
		}
	}

	public Branch updateBranch(int hid, Branch branch) 
	{

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction =entityManager.getTransaction();
		Branch branch2=entityManager.find(Branch.class, hid);
		if(branch2!=null)
		{
			branch2.setName(branch.getName());
			branch2.setPhNo(branch.getPhNo());
			branch2.setEmail(branch.getEmail());
            entityTransaction.begin();
            entityManager.merge(branch2);
            return branch2 ;
		}
		else
		{
			return null;
		}
	}

	public List<Branch> getAllBranch() 
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        Query query = entityManager.createQuery("select v from Branch v"); 
        List<Branch> branch=query.getResultList();     
		return branch;
	}

}
