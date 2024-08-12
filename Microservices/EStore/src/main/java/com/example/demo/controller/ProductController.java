package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.ProductRepository;
import com.example.demo.model.Product;
import com.example.demo.model.Response;

@RestController
@RequestMapping(path="/products")
public class ProductController {
	@Autowired
	ProductRepository repository;
	@PostMapping(path="/add")
	public ResponseEntity<Response> addProduct(@RequestParam String name,@RequestParam String brandName,@RequestParam Integer price) {
Product product=new Product(null, name, brandName, price);
System.out.println("Product : "+product);
try {
	repository.save(product);
	Response response= new Response(101, "product "+name+" Saved succesfully");
	return new ResponseEntity<Response>(response,HttpStatus.OK);
}catch(Exception exception) {
	Response response=new Response(701, "product "+name+"not saved succesfully.Exception"+exception.getMessage());
return new ResponseEntity<Response>(response,HttpStatus.OK);
}
	}

}