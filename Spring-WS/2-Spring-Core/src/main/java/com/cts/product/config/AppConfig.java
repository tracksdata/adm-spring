package com.cts.product.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan("com.cts.product.service,com.cts.product.dao")
public class AppConfig {
	

	public AppConfig() {
		System.out.println(">>> AppConfig object created...");
	}

	@Bean
	public void f3() {
		System.out.println(">>> AppConfig::f3 method...");

	}

	@Bean
	public void f1() {
		System.out.println(">>> AppConfig::f1 method...");

	}

	@Bean
	public void f2() {
		System.out.println(">>> AppConfig::f2 method...");

	}

	public void f4() {
		System.out.println(">>> AppConfig::f4 method...");

	}

}
