package com.ty.hospiatl_app.control;

import com.ty.hospiatl_app.dto.Hospital;
import com.ty.hospiatl_app.service.HospitalService;

public class TestSaveHospital
{
	public static void main(String[] args) 
	{
		HospitalService service=new HospitalService();
		
//		Hospital hospital1 = new Hospital();
//		hospital1.setName("Apollo");
//		hospital1.setWebsite("www.apollo.com");
//		service.saveHospital(hospital1);
//		
		Hospital hospital2 = new Hospital();
		hospital2.setName("KLE's");
		hospital2.setWebsite("www.kle.com");
		service.saveHospital(hospital2);
		
//		Hospital hospital3 = new Hospital();
//		hospital3.setName("Shanti Sagar");
//		hospital3.setWebsite("www.shantisagar.com");
//		service.saveHospital(hospital3);
		
		
	}

}
