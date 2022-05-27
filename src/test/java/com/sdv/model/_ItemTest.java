package com.sdv.model;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _ItemTest {

	@Test
	void constructor() {
		Item item = new Item();
		assertNotNull("Check init", item);
	}
	
	@Test
	void getterSetter() {
		Item item = new Item();
		item.setId(1);
		item.setName("Pen");
		assertEquals("Check getter/setter for id field", 1l, item.getId());
		assertEquals("Check getter/setter for name field", "Pen", item.getName());
	}
	
	@Test
	void testDataGenerators() {
		Item item = Item.newItem();
		assertNotNull("Check init", item);
		item = Item.newTestItem();
		assertEquals("Check generated value for id field", 1l, item.getId());
		assertEquals("Check generated value for name field", "Pen", item.getName());
	}

}
