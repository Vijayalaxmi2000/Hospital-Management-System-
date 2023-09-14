package com.ty.hospiatl_app.service;


import com.ty.hospiatl_app.dao.imp.MedorderDaoImp;
import com.ty.hospiatl_app.dto.MedOrder;

public class MedorderService 
{
	public void saveMedOrder(MedOrder medorder,int eid)
	{
		MedorderDaoImp daoImp=new MedorderDaoImp();
		MedOrder medOrder2= daoImp.saveMedOrder(eid,medorder);
		if(medOrder2!=null)
		{
			System.out.println("MedOrder saved");
		}
		else
		{
			System.out.println("Unfortunately MedOrder not saved");
		}
	}
	public MedOrder getMedOrder(int mid)
	{
		MedorderDaoImp daoImp=new MedorderDaoImp();
		MedOrder medorder= daoImp.getMedOrderById(mid);	
		if(medorder!=null)
		{
			return medorder;
		}
		else
		{
			return null;
		}		
	}
	public void deleteMedOrder(int mid)
	{
		MedorderDaoImp daoImp=new MedorderDaoImp();
		boolean medorder2= daoImp.deleteMedOrderById(mid);
		if(medorder2)
		{
			System.out.println("MedOrder deleted");
		}
		else
		{
			System.out.println("Unfortunately MedOrder not deleted");
		}
	}
	public  MedOrder updateMedOrder(int aid, MedOrder medorder)
	{
		MedorderDaoImp daoImp=new MedorderDaoImp();
		MedOrder medorder2= daoImp.saveMedOrder(aid,medorder);
		if(medorder2!=null)
		{
			return medorder2;
		}
		else
		{
			return null;
		}
	}


}
