package com.sdv.model;

public class OrderItem extends Item {
	private float sumPerItem;
	private int amount;
	
	public OrderItem() {
		
	}
	
	public OrderItem(Item item) {
		this.setId(item.getId());
		this.setName(item.getName());
		this.sumPerItem = 0.0f;
		this.amount = 0;
	}
	
	public float getTotalSum() {
		return this.sumPerItem * this.amount;
	}

	public float getSumPerItem() {
		return sumPerItem;
	}

	public void setSumPerItem(float sumPerItem) {
		this.sumPerItem = sumPerItem;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public static OrderItem newOrderItem() {
		return new OrderItem();
	}

	public static OrderItem newTestOrderItem() {
		OrderItem result = new OrderItem(Item.newTestItem());
		result.setAmount(4);
		result.setSumPerItem(21.7f);
		return result;
	}

	public static OrderItem newTestOrderItemAnother() {
		OrderItem result = new OrderItem(Item.newTestItemAnother());
		result.setAmount(3);
		result.setSumPerItem(16.7f);
		return result;
	}
}
