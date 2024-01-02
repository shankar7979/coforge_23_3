package com.coforge.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringAppConfig {

	@Bean
	public DataSource getDataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setUrl("jdbc:mysql://localhost:3306/db4");
		dataSource.setUsername("root");
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setPassword("mysql");
		return dataSource;
	}
}
