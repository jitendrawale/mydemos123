package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repository.MessageRepository;
import com.example.demo.model.MessageProducer;

@RestController
public class KafkaRestController {
@Autowired
	private MessageProducer producer;
@Autowired 
private MessageRepository messageRepo;
@GetMapping("/send")
public String sendMsg(@RequestParam("msg") String message ) {
	producer.sendMessage(message);
	return ""+""+message+""+"sent succesfully !";
}
@GetMapping("/getAll")
public String getAllMessages() {
	return messageRepo.getAllMessages();
}
}
