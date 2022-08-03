package com.build.test.maven.java.TestMavenApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {
	
	public static void Particular_Data() throws IOException {
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\TestMavenApp\\Book1.xlsx");
		FileInputStream fis= new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet sheetAt = wb.getSheetAt(0);
		Row row = sheetAt.getRow(2);
		Cell cell = row.getCell(1);
		double numericCellValue = cell.getNumericCellValue();
		int value = (int) numericCellValue;
		System.out.println(value);
		
	}
	
	public static void All_Data() throws IOException {
		 File f = new File("C:\\Users\\Admin\\eclipse-workspace\\TestMavenApp\\Book1.xlsx");
         FileInputStream fis = new FileInputStream(f);
         Workbook wb= new XSSFWorkbook(fis);
         Sheet sheetAt = wb.getSheetAt(0);
         int rowsize = sheetAt.getPhysicalNumberOfRows();
         
         
         
          for (int i = 0; i < rowsize; i++) {
        	  Row row = sheetAt.getRow(i);
        	  int cellsize = row.getPhysicalNumberOfCells();
        	  
			for (int j = 0; j < cellsize; j++) {
				Cell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				if (cellType.equals(cellType.STRING)) {
					String stringCellValue = cell.getStringCellValue();
					System.out.println(stringCellValue);
					
				}
				else if (cellType.equals(cellType.NUMERIC)) {
					double numericCellValue = cell.getNumericCellValue();
					
					int value = (int) numericCellValue;
					System.out.println(value);
				}
				
			}
			
		}
		
	}

	 public static void main(String[] args) throws IOException {
		
		 Particular_Data();
		 All_Data();
	}
}
