package com.cts.eshop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.cts.eshop.service,com.cts.eshop.dao,com.cts.eshop.aop")
@EnableAspectJAutoProxy
public class AppConfig {
	

}
