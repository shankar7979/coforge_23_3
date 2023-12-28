package com.coforge.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Hello;

public class HelloMain {

	public static void main(String[] args) {

		BeanFactory beanFactory = new ClassPathXmlApplicationContext("beans.xml");

		Hello hello = (Hello) beanFactory.getBean("hello1");
		hello.display();

	}
}
