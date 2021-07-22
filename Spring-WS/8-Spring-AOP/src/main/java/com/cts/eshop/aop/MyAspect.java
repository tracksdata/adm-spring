package com.cts.eshop.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect {
	public MyAspect() {
		System.out.println(">>> MyAspect object creatted...");
	}

	@Before("execution(void *save*())")
	public void f1(JoinPoint jp) {
		//-------
		System.out.println(">>>>>> Before calling "+jp.getSignature()+" method");
	}
	
	@After("execution(void *save*())")
	public void f2(JoinPoint jp) {
		//-------
		System.out.println(">>>>>> After calling "+jp.getSignature()+" method");
	}

}
