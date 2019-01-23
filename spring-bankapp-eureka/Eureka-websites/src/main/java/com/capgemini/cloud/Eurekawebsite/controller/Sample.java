package com.capgemini.cloud.Eurekawebsite.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class Sample {

	@Autowired
	RestTemplate template;
	
	@RequestMapping("/")
	public ResponseEntity<String> sample()
	{
		ResponseEntity<String> name = template.getForEntity("http://Hello/",String.class );
		return name;
	}
	
}
