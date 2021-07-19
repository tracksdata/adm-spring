package com.cts.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.product.config.AppConfig;

public class Test {

	public static void main(String[] args) {
		
		System.out.println(">>> main");
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
	//ApplicationContext ac1=new ClassPathXmlApplicationContext("spring.xml");
		
		
		

	}

}
