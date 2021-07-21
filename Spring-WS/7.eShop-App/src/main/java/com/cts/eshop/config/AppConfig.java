package com.cts.eshop.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.cts.eshop.dao.InmemoryDB;

@ComponentScan("com.cts.eshop.service,com.cts.eshop.dao")
public class AppConfig {

	@Autowired
	private InmemoryDB db;

	// DB Configuration
	@Bean
	public void initDatabase() {
		db.initDb();
		System.out.println(">>>>>> Database is initialized.....");
	}

	// 1 . data source / register driver class

	// 2. Connection POOL

	// 3. Transaction manger

}
