package com.ty.hospiatl_app.service;

import java.util.List;

import com.ty.hospiatl_app.dao.imp.ObservationsDaoImp;
import com.ty.hospiatl_app.dto.Observation;

public class ObservationService 
{
	public void saveObservation(Observation observation,int eid)
	{
		ObservationsDaoImp daoImp=new ObservationsDaoImp();
		Observation observation2= daoImp.saveObservation(eid,observation);
		if(observation2!=null)
		{
			System.out.println("Observation saved");
		}
		else
		{
			System.out.println("Unfortunately Observation not saved");
		}
	}
	public Observation getObservation(int oid)
	{
		ObservationsDaoImp daoImp=new ObservationsDaoImp();
		Observation observations= daoImp.getObservationById(oid);	
		if(observations!=null)
		{
			return observations;
		}
		else
		{
			return null;
		}		
	}
	public void deleteObservation(int oid)
	{
		ObservationsDaoImp daoImp=new ObservationsDaoImp();
		boolean observation2= daoImp.deleteObservationById(oid);
		if(observation2)
		{
			System.out.println("Observation deleted");
		}
		else
		{
			System.out.println("Unfortunately Observation not deleted");
		}
	}
	public Observation updateObservation(int oid, Observation observation)
	{
		ObservationsDaoImp daoImp=new ObservationsDaoImp();
		Observation observation2= daoImp.saveObservation(oid,observation);
		if(observation2!=null)
		{
			return observation2;
		}
		else
		{
			return null;
		}
	}
	public List<Observation> getMedorderByDoctorName(String name) 
	{
		ObservationsDaoImp daoImp=new ObservationsDaoImp();
		List<Observation> observations= daoImp.getAllObservation();	
		if(observations!=null)
		{
			return observations;
		}
		else
		{
			return null;
		}		
	}


}
