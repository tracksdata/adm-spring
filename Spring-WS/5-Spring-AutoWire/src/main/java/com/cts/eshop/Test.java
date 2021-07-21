package com.cts.eshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.eshop.config.AppConfig;
import com.cts.eshop.service.ProductService;
import com.cts.eshop.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	
		ProductService ps = ac.getBean(ProductServiceImpl.class);
		
		ps.saveProduct();
		
		

	}

}