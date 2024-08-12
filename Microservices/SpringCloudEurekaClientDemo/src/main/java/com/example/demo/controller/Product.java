package com.example.demo.controller;

public class Product {
	String name;
	Integer Price;
	public Product() {
		
	}
	
	public Product(String name, Integer price) {
		super();
		this.name = name;
		Price = price;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return Price;
	}
	public void setPrice(Integer price) {
		Price = price;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", Price=" + Price + "]";
	}

}
