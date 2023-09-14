package com.ty.hospiatl_app.control;

import com.ty.hospiatl_app.dto.Hospital;
import com.ty.hospiatl_app.service.HospitalService;

public class GetHospitalById 
{
	public static void main(String[] args) 
	{
		HospitalService service= new HospitalService();
		Hospital hospital= service.getHospital(2);
		
		System.out.println(hospital.getHid());
		System.out.println(hospital.getName());
		System.out.println(hospital.getWebsite());
		
		
	}

}
