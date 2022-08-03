package com.build.test.maven.java.TestMavenApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fb_values extends Creating_Fb {
	
	public Fb_values() {
		PageFactory.initElements(driver, this);
	}
	 @FindBy(name = "firstname")
	 WebElement firstname;
	 @FindBy(name = "lastname")
	 WebElement lastname;
	 @FindBy (xpath = "//input[@type='text'][@name='reg_email__']")
	 WebElement text;
	 @FindBy(id = "password_step_input")
	 WebElement password;
	 @FindBy(id = "day")
	 WebElement day;
	 @FindBy(id = "month")
	 WebElement month;
	 public WebElement getFirstname() {
		return firstname;
	}
	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}
	public WebElement getText() {
		return text;
	}
	public void setText(WebElement text) {
		this.text = text;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getDay() {
		return day;
	}
	public void setDay(WebElement day) {
		this.day = day;
	}
	public WebElement getMonth() {
		return month;
	}
	public void setMonth(WebElement month) {
		this.month = month;
	}
	public WebElement getYear() {
		return year;
	}
	public void setYear(WebElement year) {
		this.year = year;
	}
	public WebElement getGender() {
		return sex;
	}
	public void setGender(WebElement gender) {
		this.sex = gender;
	}
	public WebElement getSignin() {
		return signin;
	}
	public void setSignin(WebElement signin) {
		this.signin = signin;
	}
	@FindBy(xpath = "//select[@id='year']")
	 WebElement year;
	 @FindBy(name = "sex")
	 WebElement sex;
	 @FindBy(name = "websubmit")
	 WebElement signin;
	 
}
