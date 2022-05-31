package com.sdv.service;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.sdv.model.Order;

class _OrderServiceTest {

	@Test
	void logic() {
		OrderService orderService = new OrderService();
		Order order = orderService.generateTestOrder();
		assertEquals("Check getOrderTotalSum method", 223.70f, order.getOrderTotalSum(), 0.001f);
		assertEquals("Check getOrderRowCount method", 3, order.getOrderRowCount());
		assertEquals("Check getOrderItemCount method", 2, order.getOrderItemCount());
	}

}
