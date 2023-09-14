package com.ty.hospiatl_app.control;

import com.ty.hospiatl_app.service.BranchService;

public class DeleteBranchById 
{
	public static void main(String[] args) 
	{
		BranchService  service=new BranchService();
		service.deleteBranch(4);
		
	}

}
