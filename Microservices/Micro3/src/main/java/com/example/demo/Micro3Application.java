package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class Micro3Application {

	public static void main(String[] args) {
		SpringApplication.run(Micro3Application.class, args);
	}

}
