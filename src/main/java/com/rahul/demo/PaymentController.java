package com.rahul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

	@Autowired
	private PaymentEventProducer eventProducer;
	
	@PostMapping("/payments")
	public ResponseEntity<String> createOrder(@RequestBody String paymentEvent) {
		eventProducer.sendMessage(paymentEvent);
		return ResponseEntity.ok("Payment processed successfully");
	}
}
