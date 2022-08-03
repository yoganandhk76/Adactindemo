package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	
	
	@Test(retryAnalyzer = MyRetryAnalyzer.class)
	private void demo() {
		
		//String actual = "Google";
		//String expected = "google";

		//Assert.assertEquals(actual, expected);


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\TestMavenApp\\Driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");

		//String title = driver.getTitle();
		//System.out.println("title =" +title);
		String expected = "Facebook – log in or sign up";
		Assert.assertEquals(driver.getTitle(), expected);
		
		
	}	 
	//@Test(retryAnalyzer = MyRetryAnalyzer.class)
	//private void demo1() {
	//System.out.println("Retry");

	//}
	
	

}
