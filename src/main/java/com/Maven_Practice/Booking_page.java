package com.Maven_Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_page {

	public WebDriver driver ;
	
	@FindBy(xpath="//input[@name='first_name']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	private WebElement lastName;
	
	@FindBy(name="address")
	private WebElement Address;
	
	@FindBy(xpath="//input[@name='cc_num']")
	private WebElement cardNo;
	
	@FindBy(xpath="//select[@name='cc_type']")
	private WebElement cardSelection ;
	
	@FindBy(xpath="//select[@name='cc_exp_month']")
	private WebElement month ;
	
	@FindBy(xpath="//select[@name='cc_exp_year']")
	private WebElement year ;
	
	@FindBy(xpath="//input[@name='cc_cvv']")	
	private WebElement ccv ;
	
	@FindBy(xpath="//input[@name='book_now']")
	private WebElement bookNow ;

	public Booking_page(WebDriver driver2) {

	this.driver = driver2;
	
	PageFactory.initElements(driver2, this);
	
	
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAddress() {
		return Address;
	}

	public WebElement getCardNo() {
		return cardNo;
	}

	public WebElement getCardSelection() {
		return cardSelection;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getCcv() {
		return ccv;
	}

	public WebElement getBookNow() {
		return bookNow;
	}
	
	
	
	
}
