package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Lawyer;

public class LawyerMain {

	public static void main(String[] args) {

		// ApplicationContext applicationContext
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

		Lawyer bean = applicationContext.getBean(Lawyer.class);

		System.out.println(bean);
		applicationContext.close();
	}
}
