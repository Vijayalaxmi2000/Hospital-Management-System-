package com.ty.hospiatl_app.dao;


import java.util.List;

import com.ty.hospiatl_app.dto.Items;

public interface ItemsDao
{
	public Items saveItems(int mid, Items items);

	public Items getItemsById(int iid);

	public boolean deleteItemsById(int iid);

	public Items updateItems(int iid, Items items);
	
	public List<Items> getAllItems();

}
