package com.ty.hospiatl_app.service;

import java.util.List;

import com.ty.hospiatl_app.dao.imp.BranchDaoImp;
import com.ty.hospiatl_app.dto.Branch;

public class BranchService
{
	public void saveBranch(Branch branch,int hid)
	{
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch2= daoImp.saveBranch(hid,branch);
		if(branch2!=null)
		{
			System.out.println("Branch saved");
		}
		else
		{
			System.out.println("Unfortunately Branch not saved");
		}
	}
	public Branch getBranch(int bid)
	{
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch2= daoImp.getBranchById(bid);	
		if(branch2!=null)
		{
			return branch2;
		}
		else
		{
			return null;
		}		
	}
	public void deleteBranch(int bid)
	{
		BranchDaoImp daoImp=new BranchDaoImp();
		boolean branch2= daoImp.deleteBrancheById(bid);
		if(branch2)
		{
			System.out.println("Branch deleted");
		}
		else
		{
			System.out.println("Unfortunately Branch not deleted");
		}
	}
	public Branch updateBranch(int bid, Branch branch)
	{
		BranchDaoImp daoImp=new BranchDaoImp();
		Branch branch2= daoImp.updateBranch(bid,branch);
		if(branch2!=null)
		{
			return branch2;
		}
		else
		{
			return null;
		}
	}
	public List<Branch> getAllBranch() 
	{
		BranchDaoImp daoImp=new BranchDaoImp();
		List<Branch> branch2= daoImp.getAllBranch();	
		if(branch2!=null)
		{
			return branch2;
		}
		else
		{
			return null;
		}		
	}


}

