package com.example.producer;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Component;

import com.example.model.LogControl;

@Component
public class LogControlProducer {

	private final RabbitTemplate rabbitTemplate;
	
	public LogControlProducer(RabbitTemplate rabbitTemplate) {
		this.rabbitTemplate = rabbitTemplate;
	}
	
	public void enviarLogControl(LogControl logControl) {
		this.rabbitTemplate.convertAndSend("direct-exchange", "smo.log", logControl);
	}
	
}
