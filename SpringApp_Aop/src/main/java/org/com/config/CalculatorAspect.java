package org.com.config;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CalculatorAspect {

	@Before("execution(* org.com.model.Calculator.addition(..))")
	public void beforeAddition(JoinPoint joinPoint) {
		System.out.println("before addition method called ");

		System.out.println("signature "+joinPoint.getSignature());
		System.out.println("target "+joinPoint.getTarget());
		System.out.println("arguments "+Arrays.toString( joinPoint.getArgs()));
	}
	@After("execution(* org.com.model.Calculator.addition(..))")
	public void afterAddition(JoinPoint joinPoint) {
		System.out.println("after addition method called ");
		
		System.out.println("signature "+joinPoint.getSignature());
		System.out.println("target "+joinPoint.getTarget());
		System.out.println("arguments "+Arrays.toString( joinPoint.getArgs()));
	}
}
