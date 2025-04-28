package com.rahul.demo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentEventConsumer {

	@KafkaListener(topics = {"payment_events"}, groupId = "payment_group")
	public void receiveMessage(String paymentEvent) {
		System.out.println("Received Payment Event: " + paymentEvent);
	}
}
