package com.Runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature" , glue = "src\\main\\java\\com\\Adackinbase")
public class TestRunner {

	@BeforeClass
	public static void setUp() {
		
		
	}
	@AfterClass
	public static void tearDown() {
		
		
		
	}
}
