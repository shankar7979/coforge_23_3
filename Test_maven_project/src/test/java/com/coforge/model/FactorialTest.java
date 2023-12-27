package com.coforge.model;

import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void testGetFactorial() {
		System.out.println("factorial test");
		assertEquals(Factorial.getFactorial(5), 120);
	}
	//@Test
	@para
	void testGetFactorial1() {
		System.out.println("factorial test");
		assertEquals(Factorial.getFactorial(5), 120);
	}

}
