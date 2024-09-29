package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {

	@GetMapping("/home")
	public String home() {
		
		return "this is home page ";
	}
	
	
	
}
