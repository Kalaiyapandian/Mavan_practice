package com.Maven_Practice;

import java.io.File;
import java.io.IOException;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.logger_practice.Property_configuration;

public class Runner_class extends base_class {
	public static WebDriver driver =  browser_configuration("chrome") ;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);	public static Logger Log = Logger.getLogger(Runner_class.class);
	public static void main(String[] args) throws Exception {
	PropertyConfigurator.configure("log4j.properties");
	
	String url = file_reader_manager.get_instance_FRM().get_instance_CR().get_config_url();
	
	getUrl(url);
//	getUrl("http://adactinhotelapp.com/");
		// login
	Log.info("Login process");
	
		inputValueElement(pom.get_Instance_L().getUsername(),Particular_CellData("C:\\Users\\joker\\eclipse-workspace\\Maven_Practice\\Test case adactin.xlsx", 1, 5));
		inputValueElement(pom.get_Instance_L().getPassword(), Particular_CellData("C:\\Users\\joker\\eclipse-workspace\\Maven_Practice\\Test case adactin.xlsx", 2, 5));
		clickOnElement(pom.get_Instance_L().getLogin());
		
		// firstPage
		dropDown("byvalue",pom.get_Instance_Fp().getLocation(),"Melbourne");
        dropDown("byindex", pom.get_Instance_Fp().getHotels(), "1");
        dropDown("byvalue", pom.get_Instance_Fp().getRoom(), "Standard");
		dropDown("byvalue", pom.get_Instance_Fp().getType(), "2");
		dropDown("byvalue", pom.get_Instance_Fp().getPerroom(), "2");
		dropDown("Byindex",pom.get_Instance_Fp().getChildroom() , "2");
		clickOnElement(pom.get_Instance_Fp().getSubmit());
		
		// 2nd page
		clickOnElement(pom.get_Instance_Sp().getRadioBtn());
		clickOnElement(pom.get_Instance_Sp().getBtn());
		
		// booking page
		inputValueElement(pom.get_Instance_Bp().getFirstName(),Particular_CellData("C:\\Users\\joker\\eclipse-workspace\\Maven_Practice\\Test case adactin.xlsx", 15,5 ));
		inputValueElement(pom.get_Instance_Bp().getLastName(), Particular_CellData("C:\\Users\\joker\\eclipse-workspace\\Maven_Practice\\Test case adactin.xlsx", 16, 5));
		inputValueElement(pom.get_Instance_Bp().getAddress(), Particular_CellData("C:\\Users\\joker\\eclipse-workspace\\Maven_Practice\\Test case adactin.xlsx", 17, 5));
		inputValueElement(pom.get_Instance_Bp().getCardNo(),Particular_CellData("C:\\Users\\joker\\eclipse-workspace\\Maven_Practice\\Test case adactin.xlsx", 18, 5));
		dropDown("byindex",pom.get_Instance_Bp().getCardSelection() , "2");
		dropDown("byvalue",pom.get_Instance_Bp().getMonth() , "9");
		dropDown("bytext", pom.get_Instance_Bp().getYear(), "2022");
		inputValueElement(pom.get_Instance_Bp().getCcv(), Particular_CellData("C:\\Users\\joker\\eclipse-workspace\\Maven_Practice\\Test case adactin.xlsx", 21, 5));
		clickOnElement(pom.get_Instance_Bp().getBookNow());
		Thread.sleep(7000);
		
		// screenshot
		screenshot1();
		
       //logout 
		Log.info("Logout Process");
		clickOnElement(pom.get_Instance_Logout().getLogout());
	}

}


