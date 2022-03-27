package com.logger_practice;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Property_configuration {
//factory Design pattern
	static Logger Log = Logger.getLogger(Property_configuration.class);
	
	public static void main(String[] args) {
		
		
		PropertyConfigurator.configure("log4j.properties");
		
		
		
		
		Log.debug("Debug");
		Log.info("info");
		Log.warn("warning");
		Log.error("error");
		Log.fatal("fatal");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
