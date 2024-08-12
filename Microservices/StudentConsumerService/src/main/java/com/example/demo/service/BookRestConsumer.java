package com.example.demo.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Book;
@FeignClient(name="ProducerServiceDemo")
public interface BookRestConsumer {
	@GetMapping("/book/data")
	public String getBookData();

	@GetMapping("/book/{id}")
	public Book getBookById(@PathVariable Integer Id);

	@GetMapping("/book/all")
	public List<Book> getAllBook();
}
