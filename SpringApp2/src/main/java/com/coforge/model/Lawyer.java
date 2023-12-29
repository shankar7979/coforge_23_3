package com.coforge.model;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Lawyer {

	private int id;
	private  String name;
	private  float salary;
	
	@PostConstruct
	public void init() {
		this.id=98998;
		this.name="suresh kumar";
		this.salary=90000;
	System.out.println("init called");
	}
	
	@PreDestroy
	public  void cleanup() {
		System.out.println("clean up called ");
	}
}
