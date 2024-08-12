package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.BookRestConsumer;

	@RestController
@RequestMapping("/student")
public class BookRestController {
@Autowired
		private BookRestConsumer consumer;
@GetMapping("/data")
public String getStudentInfo() {
	System.out.println(consumer.getClass().getName());
	return "Accesing form STUDENT-SERVICE===> "+consumer.getBookData();
	
}
@GetMapping("/allBooks")
public String getBooksInfo() {
	return "Accessing from STUDENT-SERVICE ==> "+consumer.getAllBook();
	
}
@GetMapping("/getOneBook/{id}")
public String getOneBookForstd(@PathVariable Integer id) {
	return "Accessing from STUDENT-SERVICE ==> "+consumer.getBookById(id);
}

}
