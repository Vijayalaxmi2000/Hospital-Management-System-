package com.ty.hospiatl_app.service;

import java.util.List;

import com.ty.hospiatl_app.dao.imp.AddressDaoImp;
import com.ty.hospiatl_app.dto.Address;

public class AddressSevice 
{
	public void saveAddress(Address address,int hid)
	{
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address2= daoImp.saveAddress(hid,address);
		if(address2!=null)
		{
			System.out.println("Address saved");
		}
		else
		{
			System.out.println("Unfortunately Address not saved");
		}
	}
	public Address getAddressById(int aid)
	{
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address2= daoImp.getAddressById(aid);	
		if(address2!=null)
		{
			return address2;
		}
		else
		{
			return null;
		}		
	}
	public void deleteAddress(int aid)
	{
		AddressDaoImp daoImp=new AddressDaoImp();
		boolean address2= daoImp.deleteAddressById(aid);
		if(address2)
		{
			System.out.println("Address deleted");
		}
		else
		{
			System.out.println("Unfortunately Address not deleted");
		}
	}
	public Address updateAddress(int aid, Address address)
	{
		AddressDaoImp daoImp=new AddressDaoImp();
		Address address2= daoImp.saveAddress(aid,address);
		if(address2!=null)
		{
			return address2;
		}
		else
		{
			return null;
		}
	}
	public List<Address> getAllAddress()
	{
		AddressDaoImp daoImp=new AddressDaoImp();
		List<Address> address2= daoImp.getAllAddress();	
		if(address2!=null)
		{
			return address2;
		}
		else
		{
			return null;
		}		
	}

}