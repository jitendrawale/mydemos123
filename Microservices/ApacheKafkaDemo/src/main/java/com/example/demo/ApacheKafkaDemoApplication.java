package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;
@EnableKafka
@SpringBootApplication
public class ApacheKafkaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApacheKafkaDemoApplication.class, args);
	}

}
