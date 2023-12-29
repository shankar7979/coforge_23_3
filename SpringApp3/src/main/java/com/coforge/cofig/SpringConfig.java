package com.coforge.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.coforge.model.User;

@Configuration
public class SpringConfig {

	@Bean
	public User getUser() {
		// return new User();
		User user = new User();
		user.setUserId(5656567);
		user.setUserName("lalit kumar");
		user.setUserSalary(34000);
		return user;
	}
}
