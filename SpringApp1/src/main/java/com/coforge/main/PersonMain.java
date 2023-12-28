package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Employee;
import com.coforge.model.Person;

public class PersonMain {

	public static void main(String[] args) {
		 
	  ApplicationContext beanFactory	= new       
	    		    ClassPathXmlApplicationContext("application.xml");

		 
	  Person bean = beanFactory.getBean(Person.class);
	  System.out.println(bean);
	
	  
	}
}
