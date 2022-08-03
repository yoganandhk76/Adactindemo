package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SimpleAnnotation {
	
	@Test
	private void color() {
		System.out.println("red");

	}
	
	@Test 
	private void car() {
		System.out.println("honda");
	}
	@Test
	private void model() {
		System.out.println("Civic");
	}
}