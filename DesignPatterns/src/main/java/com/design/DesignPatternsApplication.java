package com.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.design.strategy.RestWithoutProxyStrategy;
import com.design.strategy.service.RestConnector;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		
		RestConnector restConnector = new RestConnector(new RestWithoutProxyStrategy());
		RestTemplate restTemp = restConnector.getRestTemplateBasedOnStrategy();
	}
}
