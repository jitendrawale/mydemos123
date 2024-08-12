package com.org.bean;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee {

	DevClass dev;
	ProdClass prod;
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("All team is doing work");
	}
	public Manager(DevClass dev, ProdClass prod) {
		super();
		this.dev = dev;
		this.prod = prod;
	}
	public void callMeeting() {
		dev.doWork();
		prod.doWork();
	}

}
