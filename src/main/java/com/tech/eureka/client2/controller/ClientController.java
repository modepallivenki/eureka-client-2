package com.tech.eureka.client2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ClientController {

	@Autowired
	RestTemplate template;
	
	@GetMapping("/pay/{amount}")
	public String payment(@PathVariable int amount) {
		String url = "http://EUREKA-CLIENT-1/payment/"+amount;
		
		return template.getForObject(url, String.class);
	}	
}
