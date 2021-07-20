package com.cts.eshop.config;

import org.springframework.context.annotation.ComponentScan;
@ComponentScan({"com.cts.eshop.dao,com.cts.eshop.service"})
public class AppConfig {

	public AppConfig() {
		System.out.println(">>> AppCOnfig:: object created...");
	}

}
