package com.ty.hospiatl_app.control;

import com.ty.hospiatl_app.dto.Branch;
import com.ty.hospiatl_app.service.BranchService;

public class UpdateBranchById 
{
	public static void main(String[] args)
	{
		BranchService service=new BranchService();
		Branch branch=new Branch();
		branch.setName("Belgaum");
		branch.setEmail("www.dentalcare.apollo.belgaum.com");
		service.updateBranch(1, branch);		
	}

}
