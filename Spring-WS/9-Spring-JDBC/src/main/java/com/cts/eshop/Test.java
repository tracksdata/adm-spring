package com.cts.eshop;

import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.eshop.config.AppConfig;
import com.cts.eshop.dao.ProductDaoImpl;
import com.cts.eshop.model.Product;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		ProductDaoImpl prodDao = ac.getBean(ProductDaoImpl.class);
		// long count = prodDao.getPersonCount();
		// System.out.println("Count: " + count);

		// Map<String, Object> product = prodDao.findById(4);
		// System.out.println(product);

		// find all products with Generic MAP
		// List<Map<String, Object>> products = prodDao.findAll();
		// System.out.println(products);

		// row mapper for single row with queryForObject method
		//Product product = prodDao.findproductById(4);

		//System.out.println(product);
		
		// row mapper for multi rows with query method
		//prodDao.findAllProducts().forEach(product->{
		//	System.out.println(product);
		//});
		
		// with resutsetextractor interface 
		prodDao.findProductsByResultsetExtractor().forEach(product->{
			System.out.println(product);
		});
		
		

	}

}
