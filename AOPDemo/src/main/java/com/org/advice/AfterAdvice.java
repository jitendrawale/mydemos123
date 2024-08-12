package com.org.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Before;

public class AfterAdvice {
	@After("execution(* com.org.demo.*.add(..))")
public void allDaoAddMethod(JoinPoint joinPoint) {
	System.out.println("Intercepted method :"+joinPoint);
	System.out.println("Arguments:"+joinPoint.getArgs());
	System.out.println(joinPoint.getTarget());
}
	@After ("execution(* com.org.demo.*.*(..))")
	public void allDaoAnyMethod(JoinPoint joinPoint) {
		System.out.println("Intercepted method:"+joinPoint);
		System.out.println("Arguments:"+joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
}
}
