package com.cts.shop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.shop.config.AppConfig;
import com.cts.shop.service.BillingServiceImpl;

public class Test {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };
		String[] cart2 = { "Item1", "Item2" };
		
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		

		BillingServiceImpl biller = ac.getBean(BillingServiceImpl.class); // dependent class

		
		
		double total = biller.getCartTotal(cart1);

		System.out.println("Cart1 Total: " + total);

		total = biller.getCartTotal(cart2);

		System.out.println("Cart2 Total: " + total);

	}

}
