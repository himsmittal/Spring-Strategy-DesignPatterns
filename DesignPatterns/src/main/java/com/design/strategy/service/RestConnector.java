package com.design.strategy.service;

import org.springframework.web.client.RestTemplate;

import com.design.strategy.IRestStrategy;

public class RestConnector {

	public IRestStrategy restStrategy;
	
	public RestConnector(IRestStrategy restStrategy) {
		this.restStrategy = restStrategy;
	}
	
	public RestTemplate getRestTemplateBasedOnStrategy() {
		return restStrategy.createRestTemplate();
	}
}
