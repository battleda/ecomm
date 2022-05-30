package com.sdv.model;

import java.util.ArrayList;
import java.util.HashSet;

public class Order {
	
	private long id;
	private ArrayList<OrderItem> items;
	
	public Order() {
		this.items = new ArrayList<OrderItem>();
	}
	
	public int getOrderRowCount() {
		return this.getItems().size();
	}
	
	public int getOrderItemCount() {
		HashSet<Long> filter = new HashSet<Long>();
		for(OrderItem item: this.getItems()) {
			filter.add(item.getId());
		}
		return filter.size();
	}
	
	public float getOrderTotalSum() {
		float result = 0.0f;
		for(OrderItem item: this.getItems()) {
			result += item.getTotalSum();
		}
		return result;
	}
	
	public void addOrderItem(OrderItem item) {
		this.getItems().add(item);
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ArrayList<OrderItem> getItems() {
		return items;
	}

	public void setItems(ArrayList<OrderItem> items) {
		this.items = items;
	}

	public static Order newOrder() {
		return new Order();
	}

	public static Order newTestOrder() {
		Order order = Order.newOrder();
		order.setId(1l);
		
		ArrayList<OrderItem> items = new ArrayList<OrderItem>();
		items.add(OrderItem.newTestOrderItem());
		items.add(OrderItem.newTestOrderItem());
		items.add(OrderItem.newTestOrderItemAnother());
		
		order.setItems(items);
		return order;
	}
}
