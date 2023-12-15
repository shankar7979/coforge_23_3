package edu.coforge.java8;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class java8DatePrg1 {

	public static void main(String[] args) {
		
		//LocalDate date=new LocalDate();  // it is immutable 
		LocalDate date=LocalDate.of(2021, 11, 20);
		
		System.out.println(LocalDate.now());
		
		System.out.println(date);

		LocalDate date1 = date.plus(10,ChronoUnit.DAYS);
		
		System.out.println(date1);
		LocalDate date2 = date.plus(10,ChronoUnit.MONTHS);
		System.out.println(date2);
		
		date.plusMonths(10);
		date.plusYears(20);
		date.minusDays(12);
		
		
	}
}
