package com.example.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyCoolAppController {
	
	@GetMapping("/")
	public String sayHello() {
		return "Hello From Spring Boot";
	}
	
	@GetMapping("/test")
	public String sayTest() {
		return "Hello From Spring Boot Test";
	}
	
	@GetMapping("/test2")
	public String sayTest2() {
		return "Hello From Spring Boot Test";
	}
}
