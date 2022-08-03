package com.pageobjectmanager;

import org.openqa.selenium.WebDriver;

import com.pom.Operations;
import com.pom.SignInPage;
import com.pom.loginPage;

public class PageObjectManager {
 public static WebDriver driver;
	
	public PageObjectManager(WebDriver driver2) {
    this.driver=driver2;
}
	public SignInPage getSignInPage() {
		SignInPage sp = new SignInPage(driver);
		return sp;
	}

	public loginPage getLoginPage() {
		loginPage lp = new loginPage(driver);
		return lp;
	}
	 public Operations getOperations() {
		 Operations op= new Operations(driver);
		 return op;
	 }
}

