package com.design.strategy;


public class RestWithProxyStrategy implements IRestStrategy {

	@Override
	public String createRestTemplate() {
		return "I am proxy enabled";
	}

}
