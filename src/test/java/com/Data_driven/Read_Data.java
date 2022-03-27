package com.Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.math3.ode.MainStateJacobianProvider;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Data {

	public static void Particular_CellData() throws IOException {

		File f = new File("C:\\Users\\joker\\eclipse-workspace\\Maven_Practice\\Sample_data.xlsx");
		
		FileInputStream fis =new FileInputStream(f);
		
		Workbook wb = new XSSFWorkbook(fis);
		
		Sheet s= wb.getSheetAt(0);
		
		Row r = s.getRow(2);
		
		Cell c = r.getCell(1);
		
		CellType type = c.getCellType();
		
		if (type.equals(CellType.STRING)) {
			
			String cellValue = c.getStringCellValue();
			System.out.println(cellValue);
			
		}
		else if (type.equals(CellType.NUMERIC)) {
		
			double cellValue = c.getNumericCellValue();
			int value = (int) cellValue;
			System.out.println(value);
		}
		wb.close();
	}
	public static void main(String[] args) throws IOException {
		Particular_CellData();
	}
	
	
}
				
				
				
				
				
				
				
				
				
				
				
				
				