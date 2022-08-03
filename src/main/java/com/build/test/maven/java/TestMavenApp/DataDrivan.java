package com.build.test.maven.java.TestMavenApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivan {

	
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

}


