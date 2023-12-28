package com.coforge.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.coforge.model.Employee;

public class EmployeeMain {

	public static void main(String[] args) {
		 
	  ApplicationContext beanFactory	= new       
	    		    ClassPathXmlApplicationContext("beans.xml");

		Employee emp= beanFactory.getBean("emp1",Employee.class);
		
		System.out.println("\nemployee data ");
		System.out.println("\temployee id  "+emp.getEmpId());
		System.out.println("\temployee name  "+emp.getEmpName());
		System.out.println("\temployee salary  "+emp.getEmpSalary());
		
		
	}
}
