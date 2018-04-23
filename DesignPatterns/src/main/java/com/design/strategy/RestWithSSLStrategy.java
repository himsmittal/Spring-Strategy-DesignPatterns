package com.design.strategy;

public class RestWithSSLStrategy implements IRestStrategy {

	@Override
	public String createRestTemplate() {
		return "I am SSL enabled";
	}

}
