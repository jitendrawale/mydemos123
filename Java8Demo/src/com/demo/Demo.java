package com.demo;

import java.util.List;
import java.util.stream.Collectors;
//method reference program
public class Demo {


		
public static Integer solve(int n,int x) {
	try {
		return n/x;
	}catch(Exception e) {
		System.out.println(e);
	}
	return -1;
}
public static List<Integer> divide(List<Integer> l1, Integer x){
	return l1.stream().map(n->solve(n,x)).collect(Collectors.toList());
	}

}
