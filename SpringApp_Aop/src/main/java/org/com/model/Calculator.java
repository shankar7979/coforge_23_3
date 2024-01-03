package org.com.model;

import org.springframework.stereotype.Component;
@Component
public class Calculator {

	public int addition(int a, int b) {
		System.out.println("sum of "+a+" and "+b+" is "+(a+b));
		return a+b;
	}
}
