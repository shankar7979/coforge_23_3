package com.example.model;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Data;

@Data
@Component
public class Employee {

	private int id; 
	private  String name; 
	private  float salary;
	
	@PostConstruct
	public void init() {
		System.out.println("init called ");
	 this.id=98998;	
	 this.name="suman kumar";
	 this.salary=90000.0f;
	}
	
	@PreDestroy
	public void clean() {
		System.out.println("destroy called");
	}
	
}
