package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
public static WebDriver driver;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email;
	@FindBy(xpath = "//input[@name='passwd']")
	private WebElement password;
	@FindBy(xpath = "//*[@id=\"SubmitLogin\"]/span")
	private WebElement submitBtn;
	
	
	
	public loginPage(WebDriver driver2) {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
		
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	
}
