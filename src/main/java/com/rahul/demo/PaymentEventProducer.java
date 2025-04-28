package com.rahul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class PaymentEventProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;
	private final String topicName = "payment_events";
	
	@Autowired
	public PaymentEventProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String paymentEvent) {
		kafkaTemplate.send(topicName, paymentEvent);
	}
}
