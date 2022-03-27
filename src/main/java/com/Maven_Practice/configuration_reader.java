package com.Maven_Practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configuration_reader {
public static  Properties p;

public configuration_reader() throws IOException {

File f = new File("C:\\Users\\joker\\eclipse-workspace\\Maven_Practice\\configuration.properties");
FileInputStream fis = new  FileInputStream(f);
p = new Properties();
p.load(fis);
}

public String get_config_url() {
String value = p.getProperty("url");

return value;
	
}











}
