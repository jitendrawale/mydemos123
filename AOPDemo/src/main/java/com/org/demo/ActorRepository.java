package com.org.demo;

import org.springframework.stereotype.Repository;

@Repository
public class ActorRepository {
	public ActorRepository add(String ActorName) {
		if(ActorName==null) {
			throw new RuntimeException("actorname not found ", new NullPointerException());
		}else {
			System.out.println("Actor got added " +ActorName);
		}
		return new ActorRepository();
	}
	
public boolean delete(String ActorName) {
	if(ActorName==null) {
		 throw new RuntimeException();
		 
	 }else {
		 return true;
	 }
	
}
}
