package com.build.test.maven.java.TestMavenApp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Creating_Fb {
	   
	  public static WebDriver driver; //interface and variable
		 public static void web() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\javaselenium\\Driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	}	
		 public static void fburl(String txt) {
			driver.get(txt);

		}
	 public static void first_name(WebElement fn, String txt1) {
	 	fn.sendKeys(txt1);
	}
     public static void surname(WebElement sr, String txt2) {
	   sr.sendKeys(txt2);
	}
    public static void Mobile_num(WebElement mo, String num) {
    	mo.sendKeys(num);
    }
    public static void New_password(WebElement np, String pass){
    	np.sendKeys(pass);
    	}
    public static void drop_down(WebElement dd, String day) {
    	Select s = new Select(dd);
    	s.selectByValue(day);
    	} 

    public static void drop_down1(WebElement dd1, String month) {
    	Select s = new Select(dd1);
    	s.selectByValue(month);
    	} 
    public static void drop_down2(WebElement dd2, String year) {
    	Select s = new Select(dd2);
    	s.selectByValue(year);
    	} 
    public static void Gender(WebElement g) {
    	
    	g.click();
    }
    public static void login(WebElement login) {
    	login.click();
    }
}





