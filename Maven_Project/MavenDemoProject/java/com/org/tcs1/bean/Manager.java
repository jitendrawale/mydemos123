package com.org.tcs1.bean;

public class Manager implements Employee {
	
	DevClass dev;
	ProdClass prod;
	OpClass op;
	
public Manager(DevClass dev,ProdClass prod,OpClass op) {
	this.dev=dev;
	this.op=op;
	this.prod=op;
}
	
	@Override
	public void doWork() {
		// TODO Auto-generated method stub
		System.out.println("Manager is managing all the teams");

	}
	public void callMeeting() {
		dev.doWork();
		op.doWork();
		prod.doWork();
		
		
	}

}
