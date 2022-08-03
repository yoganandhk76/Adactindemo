package com.testNG;

import org.testng.annotations.Test;

public class InvocationCountTest {
  
	
	@Test(invocationCount = 2)
	private void car() {
    System.out.println("civic");

	}
	@Test
	private void bike() {
		System.out.println("Rx100");

	}
	@Test(invocationCount = 4)
	private void Aeroplane() {
	System.out.println("A56AirBow");

	}
	
	
}
