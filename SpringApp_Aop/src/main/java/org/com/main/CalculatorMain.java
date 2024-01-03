package org.com.main;

import org.com.config.AspectConfig;
import org.com.model.Calculator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorMain {

	public static void main(String[] args) {
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext
				(AspectConfig.class);
		
		Calculator calculator = ctx.getBean(Calculator.class);
		
		calculator.addition(11, 22);
		
	}
}
