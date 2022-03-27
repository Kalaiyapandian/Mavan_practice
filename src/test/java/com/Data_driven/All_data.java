package com.Data_driven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class All_data {
	public static void All_data() throws IOException {

		File f = new File("C:\\Users\\joker\\eclipse-workspace\\Maven_Practice\\Sample_data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fis);
		Sheet s = wb.getSheetAt(0);
		
		for (int i = 0; i < s.getPhysicalNumberOfRows(); i++) {
			
			Row r = s.getRow(i);
			
			for (int j = 0; j < r.getPhysicalNumberOfCells(); j++) {
				
				Cell  c = r.getCell(j);
				
				CellType type = c.getCellType();
				
				if (c.equals(CellType.STRING)) {
					String value = c.getStringCellValue();
					System.out.println(value);
				}
				else if (c.equals(CellType.NUMERIC)) {
					
					double numericCellValue = c.getNumericCellValue();
					int v = (int) numericCellValue;
					String value = Integer.toString(v);
					System.out.println(value);
					
				}

			}
				
		}	
				
			wb.close();	
	}
				
				public static void main(String[] args) throws Exception  {
					All_data();
					
					
				}
}
