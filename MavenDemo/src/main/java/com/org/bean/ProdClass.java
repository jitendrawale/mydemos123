package com.org.bean;

import org.springframework.stereotype.Component;

@Component
public class ProdClass implements Employee {

	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Doing Production");
	}

}
