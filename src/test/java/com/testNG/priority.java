package com.testNG;

import org.testng.annotations.Test;

public class priority {
	
	
	@Test(priority = -1)
	private void color() {
		System.out.println("red");

	}
	
	@Test (priority= 2)
	private void car() {
		System.out.println("honda");
	}
	@Test
	private void model() {
		System.out.println("Civic");
	}


}
