package com.cts.eshop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cts.eshop.config.AppConfig;
import com.cts.eshop.dao.ProductDaoImpl;

public class Test {

	public static void main(String[] args) {

		System.out.println(">>>> main");

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		//ApplicationContext ac2 = new AnnotationConfigApplicationContext(AppConfig.class);


		//ProductDaoImpl prodDao = ac1.getBean(ProductDaoImpl.class);
		// ProductDaoImpl prodDao = ac.getBean("prodRepo",ProductDaoImpl.class);
		// Object obj = ac.getBean("prodRepo");
		// ProductDaoImpl prodDao = (ProductDaoImpl) obj;
		//CartDaoImpl cartDao = ac1.getBean(CartDaoImpl.class);

		//prodDao.save();
		
		//---------------
		// SCOPES
		//---------------
		/*
		 * ------------------------------
		 * 1. singleton - default
		 * 2. prototype
		 * 3. application - web
		 * 4. request - web
		 * 5. session - web
		 * ------------------------------
		 * 
		 */
		
		ProductDaoImpl prodDao1 = ac.getBean(ProductDaoImpl.class);
		ProductDaoImpl prodDao2 = ac.getBean(ProductDaoImpl.class);
		
		prodDao1.save();
		prodDao2.save();
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
