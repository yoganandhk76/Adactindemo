package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	private void browser() {
       System.out.println("Chrome");

	}
	@BeforeTest
	private void geturl() {
	System.out.println("url");
	}
   @BeforeClass
	private void navigation() {
       System.out.println("Maximum");

	}
   @BeforeMethod
	private void username() {
	System.out.println("yoga");

	}
   @Test
	private void password() {
	System.out.println("@123");
	

	}
   @AfterMethod
	private void login() {
	System.out.println("signIn");
	
   }
   @AfterClass
	private void waits() {
	System.out.println("2000");

	}
   @AfterTest
	private void close() {
	System.out.println("close");

	}
   @AfterSuite
	private void quit() {
     System.out.println("quit");
	}
}


