package com.sdv.model;

public class Item {
	private long id;
	private String name;
	
	public Item() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Item newItem() {
		return new Item();
	}

	public static Item newTestItem() {
		Item item = Item.newItem();
		item.setId(1);
		item.setName("Pen");
		return item;
	}

}
