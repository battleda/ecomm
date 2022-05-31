package com.sdv.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sdv.model.Order;
import com.sdv.service.OrderService;

@RestController
@CrossOrigin(origins = "*")
public class OrderRESTController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(
            value = "/api/test/order",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Order> getTestOrder() {
		Order result = orderService.generateTestOrder();
		return new ResponseEntity<Order>(result,
                HttpStatus.OK);
	}

}
