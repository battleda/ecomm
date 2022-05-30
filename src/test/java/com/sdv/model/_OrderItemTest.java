package com.sdv.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _OrderItemTest {

	@Test
	void constructor() {
		OrderItem orderItem = new OrderItem();
		assertNotNull("Check init", orderItem);
		
		orderItem = new OrderItem(Item.newTestItem());
		assertEquals("Check getter/setter for id field", 1l, orderItem.getId());
		assertEquals("Check getter/setter for name field", "Pen", orderItem.getName());
		assertEquals("Check getter/setter for amount field", 0, orderItem.getAmount());
		assertEquals("Check getter/setter for sumPerItem field", 0, orderItem.getSumPerItem(), 0.00f);
	}
	
	@Test
	void getterSetter() {
		OrderItem orderItem = new OrderItem();
		orderItem.setAmount(4);
		orderItem.setSumPerItem(21.7f);
		assertEquals("Check getter/setter for amount field", 4, orderItem.getAmount());
		assertEquals("Check getter/setter for sumPerItem field", 21.7f, orderItem.getSumPerItem(), 0.00f);
	}
	
	@Test
	void testDataGenerators() {
		OrderItem orderItem = OrderItem.newOrderItem();
		assertNotNull("Check init", orderItem);
		
		orderItem = OrderItem.newTestOrderItem();
		assertEquals("Check generated value for id field", 1l, orderItem.getId());
		assertEquals("Check generated value for name field", "Pen", orderItem.getName());
		assertEquals("Check getter/setter for amount field", 4, orderItem.getAmount());
		assertEquals("Check getter/setter for sumPerItem field", 21.7f, orderItem.getSumPerItem(), 0.00f);
		
		orderItem = OrderItem.newTestOrderItemAnother();
		assertEquals("Check generated value for id field", 2l, orderItem.getId());
		assertEquals("Check generated value for name field", "Pencil", orderItem.getName());
		assertEquals("Check getter/setter for amount field", 3, orderItem.getAmount());
		assertEquals("Check getter/setter for sumPerItem field", 16.7f, orderItem.getSumPerItem(), 0.00f);
		
		
	}
	
	@Test
	void logic() {
		OrderItem orderItem = OrderItem.newTestOrderItem();
		assertEquals("Check getTotalSum method", 86.8f, orderItem.getTotalSum(), 0.0f);
	}
}
