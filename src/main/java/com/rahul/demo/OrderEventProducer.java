package com.rahul.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class OrderEventProducer {

	private final KafkaTemplate<String, String> kafkaTemplate;
	private final String topicName = "order_events";
	
	@Autowired
	public OrderEventProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}
	
	public void sendMessage(String orderEvent) {
		kafkaTemplate.send(topicName, orderEvent);
	}
}
