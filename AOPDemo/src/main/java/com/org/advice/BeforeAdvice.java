package com.org.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;
@Configuration
@Aspect
public class BeforeAdvice {
@Before("execution(* com.org.demo.*.add(..))")
	public void allDaoAddMethods(JoinPoint joinPoint) {
		System.out.println("Intercepted method :"+joinPoint);
		System.out.println("Arguments:"+joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
	@Before("execution(* com.org.demo.*.*(..))")
	public void allDaoAnyMethod(JoinPoint joinPoint) {
		System.out.println("Intercepted method:"+joinPoint);
		System.out.println("Arguments:"+joinPoint.getArgs());
		System.out.println(joinPoint.getTarget());
	}
}
