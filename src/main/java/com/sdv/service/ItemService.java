package com.sdv.service;

import org.springframework.stereotype.Service;

import com.sdv.model.Item;

@Service
public class ItemService {
	public ItemService() {
		
	}
	
	public Item generateTestItem() {
		return Item.newTestItem();
	}
}
