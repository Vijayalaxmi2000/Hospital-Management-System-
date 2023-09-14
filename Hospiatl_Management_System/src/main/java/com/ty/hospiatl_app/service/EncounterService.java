package com.ty.hospiatl_app.service;

import java.util.List;

import com.ty.hospiatl_app.dao.imp.EncounterDaoImp;
import com.ty.hospiatl_app.dto.Encounter;

public class EncounterService 
{
	public void saveEncounter(Encounter encounter,int bid)
	{
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter2= daoImp.saveEncounter(bid,encounter);
		if(encounter2!=null)
		{
			System.out.println("Encounter saved");
		}
		else
		{
			System.out.println("Unfortunately Encounter not saved");
		}
	}
	public Encounter getEncounter(int eid)
	{
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter2= daoImp.getEncounterById(eid);	
		if(encounter2!=null)
		{
			return encounter2;
		}
		else
		{
			return null;
		}		
	}
	public void deleteEncounter(int eid)
	{
		EncounterDaoImp daoImp=new EncounterDaoImp();
		boolean encounter2= daoImp.deleteEncounterById(eid);
		if(encounter2)
		{
			System.out.println("Encounter deleted");
		}
		else
		{
			System.out.println("Unfortunately Encounter not deleted");
		}
	}
	public Encounter updateEncounter(int eid, Encounter address)
	{
		EncounterDaoImp daoImp=new EncounterDaoImp();
		Encounter encounter2= daoImp.saveEncounter(eid,address);
		if(encounter2!=null)
		{
			return encounter2;
		}
		else
		{
			return null;
		}
	}
	public List<Encounter> getAllEncounter()
	{
		EncounterDaoImp daoImp=new EncounterDaoImp();
		List<Encounter> encounter2= daoImp.getAllEncounter();	
		if(encounter2!=null)
		{
			return encounter2;
		}
		else
		{
			return null;
		}	
	}


}
