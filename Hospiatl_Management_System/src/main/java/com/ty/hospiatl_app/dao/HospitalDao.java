package com.ty.hospiatl_app.dao;

import com.ty.hospiatl_app.dto.Hospital;

public interface HospitalDao 
{
	public Hospital saveHospital(Hospital hospital);
	
	public Hospital getHospitalById(int hid);
	
	public boolean deleteHospitalById(int hid);
	
	public Hospital updateHospitalById(int hid,Hospital hospital);

}
