package com.rahul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

	@Autowired
	private OrderEventProducer eventProducer;
	
	@PostMapping("/orders")
	public ResponseEntity<String> createOrder(@RequestBody String orderEvent) {
		eventProducer.sendMessage(orderEvent);
		return ResponseEntity.ok("Order created successfully");
	}
}
