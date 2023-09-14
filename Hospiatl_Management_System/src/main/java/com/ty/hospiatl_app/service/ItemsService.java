package com.ty.hospiatl_app.service;

import java.util.List;

import com.ty.hospiatl_app.dao.imp.ItemsDaoImp;
import com.ty.hospiatl_app.dto.Items;

public class ItemsService 
{
	public void saveItems(Items items,int mid)
	{
		ItemsDaoImp daoImp=new ItemsDaoImp();
		Items items2= daoImp.saveItems(mid,items);
		if(items2!=null)
		{
			System.out.println("Items saved");
		}
		else
		{
			System.out.println("Unfortunately Items not saved");
		}
	}
	public Items getItems(int iid)
	{
		ItemsDaoImp daoImp=new ItemsDaoImp();
		Items items2= daoImp.getItemsById(iid);	
		if(items2!=null)
		{
			return items2;
		}
		else
		{
			return null;
		}		
	}
	public void deleteItems(int iid)
	{
		ItemsDaoImp daoImp=new ItemsDaoImp();
		boolean items= daoImp.deleteItemsById(iid);
		if(items)
		{
			System.out.println("Items deleted");
		}
		else
		{
			System.out.println("Unfortunately Items not deleted");
		}
	}
	public Items updateAddress(int iid, Items items)
	{
		ItemsDaoImp daoImp=new ItemsDaoImp();
		Items items2= daoImp.saveItems(iid,items);
		if(items2!=null)
		{
			return items2;
		}
		else
		{
			return null;
		}
	}
	public List<Items> getAllItems()
	{
		ItemsDaoImp daoImp=new ItemsDaoImp();
		List<Items> items2= daoImp.getAllItems();	
		if(items2!=null)
		{
			return items2;
		}
		else
		{
			return null;
		}	
		
	}


}
