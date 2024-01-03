package org.com.config;

import org.com.model.Calculator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class AspectConfig {

	@Bean
	public Calculator getCalculator() {
		return new Calculator();
	}
	
}
