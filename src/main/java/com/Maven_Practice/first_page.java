package com.Maven_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class first_page {

	public WebDriver driver;
	
	@FindBy(id="location")
     private WebElement location ;
	
	@FindBy(id="hotels")
	 private WebElement  hotels ; 
	
	@FindBy(xpath="//select[@name='room_type']")
	private WebElement room ;
	
	@FindBy(xpath="//select[@name='room_nos']")
	private WebElement type;
	
	@FindBy(xpath="//select[@name='adult_room']")
	private WebElement perroom ;
	
	@FindBy(xpath="//select[@name='child_room']")
	private WebElement childroom;
	
	@FindBy(name="Submit")
	private WebElement submit;

	public first_page(WebDriver driver2) {

		this.driver = driver2;
		PageFactory.initElements(driver, this);
		
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom() {
		return room;
	}

	public WebElement getType() {
		return type;
	}

	public WebElement getPerroom() {
		return perroom;
	}

	public WebElement getChildroom() {
		return childroom;
	}

	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
