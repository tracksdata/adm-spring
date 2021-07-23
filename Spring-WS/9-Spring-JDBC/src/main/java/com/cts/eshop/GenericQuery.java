package com.cts.eshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.eshop.config.AppConfig;
import com.cts.eshop.dao.ProductDaoImpl;

public class GenericQuery {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductDaoImpl prodDao = ac.getBean(ProductDaoImpl.class);
		
		
		

	}

}
