package com.ty.hospiatl_app.dao;

import java.util.List;

import com.ty.hospiatl_app.dto.MedOrder;

public interface MedorderDao 
{
	public MedOrder saveMedOrder(int eid, MedOrder medOrder);

	public MedOrder getMedOrderById(int mid);

	public boolean deleteMedOrderById(int mid);

	public MedOrder updateMedOrder(int mid, MedOrder medOrder);
	
	public List<MedOrder> getMedorderByDoctorName(String name);
	
	//public List<MedOrder> getMedorderByDate(String date);

}
