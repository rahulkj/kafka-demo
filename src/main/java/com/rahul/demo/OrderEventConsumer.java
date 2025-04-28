package com.rahul.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class OrderEventConsumer {

	@KafkaListener(topics = {"order_events"}, groupId = "orders_group")
	public void receiveMessage(String orderEvent) {
		System.out.println("Received Order Event: " + orderEvent);
	}
}
