package com.testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class crossbrowser {
    @Test
    @Parameters({"url"})
	private void LaunchBrowser(String url) {
			if (url.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\javaselenium\\Driver\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.get("https://www.amazon.in/");
			}
			else if (url.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Admin\\eclipse-workspace\\javaselenium\\Driver\\geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.youtube.com/");
			}
			}
	}
	

