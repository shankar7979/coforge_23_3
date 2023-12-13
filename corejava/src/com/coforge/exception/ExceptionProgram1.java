package com.coforge.exception;

public class ExceptionProgram1 {

	
	public static void main(String[] args) {
		
		System.out.println("program starts ");
		
		int ar[]= {1,2,3,4,5};
		try {
		System.out.println("fifth element is "+ar[5]);
		//ArrayIndexOutOfBoundsException
		}
		catch (Exception e) {
			System.out.println("some error");
		}
		System.out.println("program ends ");
		
		
	}
	
	
}
