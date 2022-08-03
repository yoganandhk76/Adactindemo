package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Operations {
	public static WebDriver driver;
	@FindBy(xpath = "//body[@id='category']")               //(//a[@title='Dresses'])[1]
	private WebElement womens;
	@FindBy(xpath = "//a[text()='Blouses']")
	private WebElement blouses;
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[2]/span")   ////*[@id="center_column"]/ul/li[1]/div/div[1]/div/div[1]/a/i
	private WebElement quickview;
	@FindBy(xpath = "//*[@id=\"add_to_cart\"]/button")
	private  WebElement addcard;
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span/text()")   ////*[@id="layer_cart"]/div[1]/div[2]/div[4]/a/span ////i[@class='icon-chevron-right right'])[2]
	private WebElement paymentMade;
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]/span")
	private WebElement Summary;
	@FindBy(xpath = "(//i[@class='icon-chevron-right right'])[7]")
	private WebElement Address;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement Checkbox;
	@FindBy(xpath = "(//i[@class='icon-chevron-right right'])[3]")
	private WebElement Shipping;
	
	
	
	public  Operations(WebDriver driver2) {
		this.driver= driver2;
		PageFactory.initElements(driver, this);
	
	}



	public static WebDriver getDriver() {
		return driver;
	}



	public WebElement getWomens() {
		return womens;
	}



	public WebElement getBlouses() {
		return blouses;
	}



	public WebElement getQuickview() {
		return quickview;
	}



	public WebElement getAddcard() {
		return addcard;
	}



	public WebElement getPaymentMade() {
		return paymentMade;
	}



	public WebElement getSummary() {
		return Summary;
	}



	public WebElement getAddress() {
		return Address;
	}



	public WebElement getCheckbox() {
		return Checkbox;
	}



	public WebElement getShipping() {
		return Shipping;
	}

}
