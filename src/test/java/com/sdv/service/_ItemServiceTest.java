package com.sdv.service;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sdv.model.Item;

class _ItemServiceTest {

	@Test
	void logic() {
		ItemService service = new ItemService();
		Item item = service.generateTestItem();
		assertEquals("Check generated value for id field", 1l, item.getId());
		assertEquals("Check generated value for name field", "Pen", item.getName());
	}

}
