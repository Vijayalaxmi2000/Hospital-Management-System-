package com.ty.hospiatl_app.control;

import com.ty.hospiatl_app.dto.Hospital;
import com.ty.hospiatl_app.service.HospitalService;

public class TestUpdateHospital 
{
	public static void main(String[] args)
	{
		
		HospitalService service= new HospitalService();
		Hospital hospital= new Hospital();
		hospital.setName("KLE Medical");
		hospital.setWebsite("www.klemedical.com");
		service.updateHospitalById(4, hospital);
		
		
		
	}

}
