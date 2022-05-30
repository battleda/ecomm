package com.sdv.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

class _OrderTest {

	@Test
	void constructor() {
		Order order = new Order();
		assertNotNull("Check init", order);
		assertEquals("Check items init", 0, order.getItems().size());
	}
	
	@Test
	void getterSetter() {
		Order order = new Order();
		order.setId(1l);
		
		ArrayList<OrderItem> items = new ArrayList<OrderItem>();
		items.add(OrderItem.newTestOrderItem());
		items.add(OrderItem.newTestOrderItem());
		items.add(OrderItem.newTestOrderItemAnother());
		
		order.setItems(items);
		assertEquals("Check getter/setter for id field", 1l, order.getId());
		assertEquals("Check getter/setter for items field", 3, order.getItems().size());
	}
	
	@Test
	void testDataGenerators() {
		Order order = Order.newOrder();
		assertNotNull("Check init", order);
		
		order = Order.newTestOrder();
		assertEquals("Check getter/setter for id field", 1l, order.getId());
		assertEquals("Check getter/setter for items field", 3, order.getItems().size());
	}
	
	@Test
	void logic() {
		Order order = Order.newTestOrder();
		assertEquals("Check getOrderTotalSum method", 223.70f, order.getOrderTotalSum(), 0.001f);
		assertEquals("Check getOrderRowCount method", 3, order.getOrderRowCount());
		assertEquals("Check getOrderItemCount method", 2, order.getOrderItemCount());
	}

}
