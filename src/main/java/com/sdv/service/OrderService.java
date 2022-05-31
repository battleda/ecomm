package com.sdv.service;

import org.springframework.stereotype.Service;

import com.sdv.model.Order;

@Service
public class OrderService {

	public OrderService() {
		
	}
	
	public Order generateTestOrder() {
		return Order.newTestOrder();
	}
	
}
