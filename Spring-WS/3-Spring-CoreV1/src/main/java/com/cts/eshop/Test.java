package com.cts.eshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.eshop.config.AppConfig;

public class Test {

	public static void main(String[] args) {

		System.out.println(">>> main :: main method...");

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

	}

}
