package com.ty.hospiatl_app.dao;

import java.util.List;

import com.ty.hospiatl_app.dto.Address;

public interface AddressDao 
{
	public Address saveAddress(int bid, Address address);

	public Address getAddressById(int aid);

	public boolean deleteAddressById(int aid);

	public Address updateAddress(int aid, Address address);
	
	public List<Address> getAllAddress();

}
