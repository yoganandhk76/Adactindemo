package com.testNG;

import org.testng.annotations.Test;

public class DepondsOnMethods {
    
	@Test
	private void Browser() {
	System.out.println("Chrome");

	}
	@Test(dependsOnMethods = "login")
	private void getUrl() {
		System.out.println("url");
	}
	
	@Test(dependsOnMethods = "Browser")
	private void login() {
	System.out.println("login");
	}
	@Test(dependsOnMethods = "getUrl")
	private void logout() {
		System.out.println("logout");

	}
}
