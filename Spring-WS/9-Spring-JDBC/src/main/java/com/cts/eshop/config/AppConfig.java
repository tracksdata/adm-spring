package com.cts.eshop.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.cts.eshop.service,com.cts.eshop.dao")
@PropertySource(value = "application.properties")
public class AppConfig {
	
	

	@Autowired
	private Environment env;

	// define data-source
	@Bean
	public DataSource mysqlDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(env.getProperty("db-driver"));
		dataSource.setUrl(env.getProperty("db-url"));
		dataSource.setUsername(env.getProperty("db-user"));
		dataSource.setPassword(env.getProperty("db-password"));
		return dataSource;
	}

}
