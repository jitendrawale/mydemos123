package com.example.demo;

public class HelloService {
	int countMin;
	int countMax;
	public int getCountMin() {
		return countMin;
	}
	public void setCountMin(int countMin) {
		this.countMin = countMin;
	}
	public int getCountMax() {
		return countMax;
	}
	public void setCountMax(int countMax) {
		this.countMax = countMax;
	}
	public HelloService(int countMin, int countMax) {
		super();
		this.countMin = countMin;
		this.countMax = countMax;
	}
	public HelloService() {
		super();
	}
	

}
