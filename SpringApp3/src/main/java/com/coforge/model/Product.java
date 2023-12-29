package com.coforge.model;

import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Product {
	private long id; 
	private  String name; 
	private  float  cost; 
}
