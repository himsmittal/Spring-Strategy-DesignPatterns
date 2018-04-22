package com.design.strategy;

import org.springframework.web.client.RestTemplate;

/* 
 * Strategy Interface to create rest template
 */
public interface IRestStrategy {
	
	public RestTemplate createRestTemplate();
}
