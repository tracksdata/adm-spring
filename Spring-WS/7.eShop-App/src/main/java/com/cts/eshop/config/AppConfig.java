package com.cts.eshop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.cts.eshop.dao.InmemoryDB;

@ComponentScan("com.cts.eshop.service,com.cts.eshop.dao")
@PropertySource(value = "application.properties")
public class AppConfig {
	
	
	@Autowired
	private Environment env;
	
	@Value("${name}")
	private String personName;

	@Autowired
	private InmemoryDB db;

	// DB Configuration
	@Bean
	public void initDatabase() {
		System.out.println(">>> Person Name:: "+personName);
		System.out.println("City:: "+env.getProperty("city"));
		db.initDb();
		System.out.println(">>>>>> Database is initialized.....");
	}

	// 1 . data source / register driver class

	// 2. Connection POOL

	// 3. Transaction manger

}
