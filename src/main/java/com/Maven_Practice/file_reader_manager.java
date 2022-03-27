package com.Maven_Practice;

import java.io.IOException;

public class file_reader_manager {

	private file_reader_manager() {
		// TODO Auto-generated constructor stub
	}
	
	public static file_reader_manager get_instance_FRM() {
		file_reader_manager helper = new file_reader_manager();
		return helper;
	}
	
	public configuration_reader get_instance_CR() throws IOException {
	
		configuration_reader reader = new configuration_reader();
		return reader;
	}
	
	
	
	
	
	
	
	
	
	
	
}
