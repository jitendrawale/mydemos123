package com.demo;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Demo2 {
	public static void main(String[] args) {
		
	
	
	try {
		Stream<String> stream=Files.lines(Paths.get("/home/labuser/Desktop/Demo.txt"));
		{
			stream.forEach(System.out::println);
		}
	}catch(Exception e) {
		System.out.println(e);
	}

}
}
