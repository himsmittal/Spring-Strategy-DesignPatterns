package com.design;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.design.strategy.RestWithoutProxyStrategy;
import com.design.strategy.service.RestConnector;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);
		
		// this should be set based on condition
		RestConnector restConnector = new RestConnector(new RestWithoutProxyStrategy());
		
		String restTemp = restConnector.getRestTemplateBasedOnStrategy();
		
		System.out.println("Template:"+ restTemp);
	}
}
