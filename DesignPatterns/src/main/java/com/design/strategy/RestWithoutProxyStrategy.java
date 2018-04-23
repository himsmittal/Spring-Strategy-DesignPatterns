package com.design.strategy;


public class RestWithoutProxyStrategy implements IRestStrategy {

	@Override
	public String createRestTemplate() {
		return "I am not proxy enabled";
	}

}
