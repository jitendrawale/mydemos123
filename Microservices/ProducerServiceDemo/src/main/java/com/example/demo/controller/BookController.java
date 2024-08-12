package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;

@RestController
@RequestMapping("/book")
public class BookController {

	@Autowired
	Environment env;
	@GetMapping("/data")
	public String getBookData() {
		return env.getProperty("local.server.port");
	}
	@GetMapping("/id")
	public Book getBookById(@PathVariable Integer id) {
		return new Book();
	}
	@GetMapping("/all")
	public List<Book> getAllBook(){
		new Book(1, "Demo", "5000");
		new Book(1, "SAmple", "10000");
		new Book(3, "Test", "15000");
		
		return List.of();
	}
}
