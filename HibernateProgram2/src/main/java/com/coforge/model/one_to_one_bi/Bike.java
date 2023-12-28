package com.coforge.model.one_to_one_bi;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
public class Bike {

	@Id
	@GeneratedValue
	private int bikeRegNo;
	private String bikeModel;
	private float bikeCost;

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "bike")
	private User user; 
	
}


