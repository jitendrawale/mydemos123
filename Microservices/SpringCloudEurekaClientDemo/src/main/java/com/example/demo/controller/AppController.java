package com.example.demo.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/app")
public class AppController {
	@GetMapping("/path")
public Response getProducts() {
	Product p1=new Product("Apple i phone", 70000);
	Product p2=new Product("samsung ", 60000);
	Product p3=new Product("vivo", 50000);
	Product p4=new Product("oppo ", 40000);
	Product p5=new Product("redmi ", 30000);
	
	
	ArrayList<Product> products=new ArrayList<Product>();
	products.add(p1);
	products.add(p2);
	products.add(p3);
	products.add(p4);
	products.add(p5);
	Response response=new Response(101, "record fetch succesfully", null);
	
	return response;
}
}
