package com.testNG;

import org.testng.annotations.Test;

public class SoftAssert {
	
	
	@Test
	private void demo3() {
		
		String actual = "google";
		String expected ="Google";
		
	org.testng.asserts.SoftAssert s = new org.testng.asserts.SoftAssert();
	s.assertEquals(actual, expected);
	}

}
