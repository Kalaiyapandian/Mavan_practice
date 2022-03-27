package com.Maven_Practice;

import org.openqa.selenium.WebDriver;

public class Page_Object_Manager {

	public WebDriver driver;
	
	private Login_page l ;
	private first_page fp;
	private Second_page sp;
	private Booking_page Bp;
	private Logout_page logout;
	public Page_Object_Manager(WebDriver driver2) {

		this.driver =driver2;
	}
	public WebDriver getDriver() {
		return driver;
	}
	public Login_page get_Instance_L() {
		if (l==null) {
			
		l = new Login_page(driver);
		
		}
		return l;
	}
	public first_page get_Instance_Fp() {
	if (fp==null) {
		
		fp=new first_page(driver);
		
	}	
		
		return fp;
	}
	public Second_page get_Instance_Sp() {
		
		if (sp==null) {
			sp=new Second_page(driver);
		}
		
		return sp;
	}
	public Booking_page get_Instance_Bp() {
		
		if (Bp==null) {
			Bp=new Booking_page(driver);
		}
		
		return Bp;
	}
	public Logout_page get_Instance_Logout() {

if (logout==null) {
	logout = new Logout_page(driver);
}
		
		return logout;
	}
	
	
	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
