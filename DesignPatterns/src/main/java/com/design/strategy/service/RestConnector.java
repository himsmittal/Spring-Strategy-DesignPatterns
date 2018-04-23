package com.design.strategy.service;

import com.design.strategy.IRestStrategy;

public class RestConnector {

	public IRestStrategy restStrategy;
	
	public RestConnector(IRestStrategy restStrategy) {
		this.restStrategy = restStrategy;
	}
	
	public String getRestTemplateBasedOnStrategy() {
		return restStrategy.createRestTemplate();
	}
}
