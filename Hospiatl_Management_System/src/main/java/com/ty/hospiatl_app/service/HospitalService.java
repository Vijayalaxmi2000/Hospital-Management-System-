package com.ty.hospiatl_app.service;

import com.ty.hospiatl_app.dao.imp.HospitalDaoImp;
import com.ty.hospiatl_app.dto.Hospital;

public class HospitalService 
{
	public void saveHospital(Hospital hospital)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital2= daoImp.saveHospital(hospital);
		if(hospital2!=null)
		{
			System.out.println("Data saved");
		}
		else
		{
			System.out.println("Unfortunately data not saved");
		}
	}
	public Hospital getHospital(int hid)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospital=daoImp.getHospitalById(hid);
		if(hospital!=null)
		{
			return hospital;
		}
		else
		{
			return null;
		}		
	}
	public void deleteHospital(int hid)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();
		boolean  hospital= daoImp.deleteHospitalById(hid);
		if(hospital)
		{
			System.out.println("Data deleted");
		}
		else
		{
			System.out.println("Unfortunately data not deleted");
		}
	}
	public Hospital updateHospitalById(int hid, Hospital hospital)
	{
		HospitalDaoImp daoImp=new HospitalDaoImp();
		Hospital hospitals= daoImp.updateHospitalById(hid, hospital);
		if(hospitals!=null)
		{
			return hospitals;
		}
		else
		{
			return null;
		}
	}

}
