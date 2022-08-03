package com.build.test.maven.java.TestMavenApp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo_class extends base_class {

	public Pojo_class() {
		PageFactory.initElements(driver, this);

	}
@FindBy(xpath = "//input[@name='email']")
WebElement email;

@FindBy(xpath = "//input[@name='pass']")
	WebElement pass;
@FindBy(xpath = "//button[@type='submit']")
WebElement submit;
public WebElement getEmail() {
	return email;
}
public void setEmail(WebElement email) {
	this.email = email;
}
public WebElement getPass() {
	return pass;
}
public void setPass(WebElement pass) {
	this.pass = pass;
}
public WebElement getSubmit() {
	return submit;
}
public void setSubmit(WebElement submit) {
	this.submit = submit;
}

}
