package org.com.model;

import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Book {

	private long isbn;
	private String bname;
	private float cost;
}
