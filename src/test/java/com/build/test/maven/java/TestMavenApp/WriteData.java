package com.build.test.maven.java.TestMavenApp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteData {
	
	public static void writedata() throws IOException {
		
		File f = new File("C:\\Users\\Admin\\eclipse-workspace\\TestMavenApp\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb= new XSSFWorkbook(fis);
		Sheet createSheet = wb.createSheet("logins");
		Row createRow = createSheet.createRow(0);
		Cell createCell = createRow.createCell(0);
		createCell.setCellValue("username");
		wb.getSheet("logins").getRow(0).createCell(1).setCellValue("pass");
		wb.getSheet("logins").createRow(1).createCell(0).setCellValue("yoga");
		wb.getSheet("logins").getRow(1).createCell(1).setCellValue("123@");
		wb.getSheet("logins").createRow(2).createCell(0).setCellValue("susa");
		wb.getSheet("logins").getRow(2).createCell(1).setCellValue("1234@");
		wb.getSheet("logins").createRow(4).createCell(2).setCellValue("asdadasd");
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		System.out.println("sheetcreated");
		
	}
	public static void main(String[] args) throws Exception {
	writedata();	
	}}
	


