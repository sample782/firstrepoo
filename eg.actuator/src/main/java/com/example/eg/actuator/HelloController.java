package com.example.eg.actuator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


	@Value("${customm.property}")
	String value;
	
	@GetMapping
	String met() {
		return "Hello, World!!!"+value;
	}
}
