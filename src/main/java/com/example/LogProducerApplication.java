package com.example;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.LogControl;
import com.example.producer.LogControlProducer;

@SpringBootApplication
public class LogProducerApplication {

	private @Autowired LogControlProducer producer;
	
	public static void main(String[] args) {
		SpringApplication.run(LogProducerApplication.class, args);
	}
	
	@PostConstruct
	public void init() {
		
		LogControl logControl = LogControl.builder()
			.transaccion("9959dbac-b34d-4944-bb72-94edb740c874")
			.fechaTransaccion("2021-09-15")
			.horaTransaccion("15:09:41")
			.build();

		this.producer.enviarLogControl(logControl);
		
	}

}
