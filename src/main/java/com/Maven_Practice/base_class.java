package com.Maven_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.ScreenshotException;
import org.openqa.selenium.support.ui.Select;

public  class base_class {

	public static WebDriver driver;
	public static  String value ;
	public static WebDriver browser_configuration (String type) {
	
	//driver 
		if (type.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\joker\\eclipse-workspace\\Maven_Practice\\driver\\chromedriver1.exe");
			
			driver = new ChromeDriver();
		}
		else if (type.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.chrome.driver", "value");
			driver = new FirefoxDriver();
			}
		driver.manage().window().maximize();
		return driver;

	}
	
	public static void getUrl(String url) {

		driver.get(url);
	}
	
	
	public static void clickOnElement(WebElement element) {

		element.click();
	}
	
	public static void inputValueElement(WebElement element ,String data) {
     element.sendKeys(data);
	}
	
public static void dropDown(String type,WebElement element, String value) {
 
	Select s = new Select(element);
	
	if (type.equalsIgnoreCase("byvalue")) {
		s.selectByValue(value);
	}
	
	else if (type.equalsIgnoreCase("bytext")) {
		s.selectByVisibleText(value);
	}
	
	else if (type.equalsIgnoreCase("byindex")) {
		int index = Integer.parseInt(value);
		s.selectByIndex(index);
	}
	

}
	


public static void screenshot1() throws  Exception {


        TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\joker\\eclipse-workspace\\Maven_Practice\\screenshot\\booking.png");
		FileUtils.copyFile(scr, dest);
	
	
}
	
public static String Particular_CellData (String path,int row_index,int cell_index) throws Exception {

	File f = new File(path);
	
	FileInputStream fis =new FileInputStream(f);
	
	Workbook wb = new XSSFWorkbook(fis);
	
	Sheet s= wb.getSheetAt(1);
	
	Row r = s.getRow(row_index);
	
	Cell c = r.getCell(cell_index);
	
	CellType type = c.getCellType();
	
	if (type.equals(CellType.STRING)) {
		
		value = c.getStringCellValue();
		
		
	}
	else if (type.equals(CellType.NUMERIC)) {
	
		double numvalue = c.getNumericCellValue();
		long val = (long) numvalue;
		value = String.valueOf(val);

	}
	
	return value;
	
	
}


	
	
	



}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
