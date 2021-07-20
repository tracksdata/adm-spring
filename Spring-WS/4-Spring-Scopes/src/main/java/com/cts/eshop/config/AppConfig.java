package com.cts.eshop.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

//@ComponentScan("com.cts.eshop.service,com.cts.eshop.dao")
@Configuration
@ComponentScans(value ={@ComponentScan("com.cts.eshop.service"),@ComponentScan("com.cts.eshop.dao")})
public class AppConfig {

}
