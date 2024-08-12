package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/getdata")
	public HelloService retrieveLimit() {
		return new HelloService (1000,500);
	}
}
