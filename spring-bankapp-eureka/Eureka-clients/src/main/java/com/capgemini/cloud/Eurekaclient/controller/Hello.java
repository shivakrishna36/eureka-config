package com.capgemini.cloud.Eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

	@RequestMapping("/")
	public String hello()
	{
		return "HI";
	}
}
