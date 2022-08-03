package com.build.test.maven.java.TestMavenApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class base_class {
	
	static WebDriver driver;
	
	public static void browser() {
		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\javaselenium\\Driver\\chromedriver.exe");
     driver = new ChromeDriver();
	}
	public static void fblogin(String url) {
		driver.get(url);

	}
	public static void username(WebElement name, String txt) {
		name.sendKeys(txt);
		
	}
	
	public static void passward(WebElement pass, String txt1) {
		pass.sendKeys(txt1);
		
		
	}
	public static void click(WebElement login) {
		login.click();

		
		
	}
	
	
}
