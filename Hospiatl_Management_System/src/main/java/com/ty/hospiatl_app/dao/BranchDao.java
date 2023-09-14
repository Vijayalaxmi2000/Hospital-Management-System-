package com.ty.hospiatl_app.dao;

import java.util.List;

import com.ty.hospiatl_app.dto.Branch;

public interface BranchDao 
{
	public Branch saveBranch(int hid, Branch branch);
	
	public Branch getBranchById(int bid);
	
	public boolean deleteBrancheById(int bid);
	
	public Branch updateBranch(int hid, Branch branch);
	
	public List<Branch> getAllBranch();
	
	

}
