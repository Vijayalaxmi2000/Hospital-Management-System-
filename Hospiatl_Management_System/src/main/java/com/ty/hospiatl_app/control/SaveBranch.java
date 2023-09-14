package com.ty.hospiatl_app.control;

import com.ty.hospiatl_app.dto.Branch;
import com.ty.hospiatl_app.service.BranchService;

public class SaveBranch 
{
	public static void main(String[] args) 
	{
		BranchService service=new BranchService();
//		
//		Branch branch1=new Branch();
//		branch1.setName("Belagavi");
//		branch1.setPhNo(8836451423l);
//		branch1.setEmail("www.dentalcare.apollo.belagavi.com");
//		
//		Branch branch2=new Branch();
//		branch2.setName("Bengalore");
//		branch2.setPhNo(8836451523l);
//		branch2.setEmail("www.eyecare.apollo.bengalore.com");
//		
//		Branch branch3=new Branch();
//		branch3.setName("Delhi");
//		branch3.setPhNo(8836451623l);
//		branch3.setEmail("www.eyecare.apollo.delhi.com");
		
		Branch branch4=new Branch();
		branch4.setName("Delhi");
		branch4.setPhNo(8836451623l);
		branch4.setEmail("www.eyecare.kle.delhi.com");
//		
//		service.saveBranch(branch1, 1);
//		service.saveBranch(branch2, 1);
//		service.saveBranch(branch3, 1);
		service.saveBranch(branch4, 4);
	}

}
