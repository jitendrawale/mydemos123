package com.demo;

import java.util.Optional;

public class OptionalDemo {
	String s="someshwar";
	public static void main(String[] args) {
		
	Integer a[]=new Integer[20]	;
	//a[10].intValue();
	Optional<Integer> op=Optional.ofNullable(10);
	if(op.isPresent()){
			System.out.println("op is present");
	}else {
		System.out.println("Value is not present");
	}
		Employee emp=new Employee(1, "ram", 010, "male", "java", 01/1/2024, 100);
		Optional<Employee> op1=Optional.ofNullable(emp);
		op1.ifPresent(s->System.out.println("name is "+s.getName()));
	Optional<Object> op3=Optional.empty();
	System.out.println(op3);
		
			
		}
	
	

}
