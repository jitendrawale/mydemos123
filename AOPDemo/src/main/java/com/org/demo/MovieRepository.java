package com.org.demo;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Repository;

@Repository
public class MovieRepository {
	public MovieRepository add(String MovieName) {
		if(MovieName==null) {
			throw new RuntimeException("moviename not found ", new NullPointerException());
		}else {
			System.out.println("Movie added Succesfully "+MovieName);
		}
		return this;
	}
 public boolean delete(String MovieName) {
	 if(MovieName==null) {
		 throw new RuntimeException();
		 
	 }else {
		 return true;
	 }
 }
}
