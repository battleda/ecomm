package com.sdv.service;

import com.sdv.model.Item;

public class ItemService {
	public ItemService() {
		
	}
	
	public Item generateTestItem() {
		return Item.newTestItem();
	}
}
