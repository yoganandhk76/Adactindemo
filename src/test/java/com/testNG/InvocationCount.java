package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class InvocationCount {
	@Test(timeOut = 2000)
private void Browserlanuch() {

	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\TestMavenApp\\Driver\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.tamilblasters.ink/");
	

}
}

