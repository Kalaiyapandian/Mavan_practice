package com.Maven_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Second_page {

	public WebDriver driver ;
	
	@FindBy(xpath="//input[@type='radio']")
	private WebElement radioBtn;
	
	@FindBy(id="continue")
	private WebElement Btn;

	public Second_page(WebDriver driver2) {

	this.driver = driver2;
	
	PageFactory.initElements(driver, this);
	
	
	
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRadioBtn() {
		return radioBtn;
	}

	public WebElement getBtn() {
		return Btn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
