package com.practice.appiumAssignment.appiumAssignOnAmazon;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelInputs 
{
	public FileInputStream file;
	public XSSFWorkbook workbook = null;
	public XSSFSheet sheet;
	public Row row;
	public Cell cell;

	//Returns Username
	public String getUsername() throws IOException 
	{
		try
		{
			file = new FileInputStream(new File(System.getProperty("user.dir") + "\\loginCred\\credentials.xlsx"));
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheetAt(0);

			row = sheet.getRow(1);
			cell = row.getCell(0);
			
			file.close();
		} 
		catch (Exception ex)
		{
			System.out.println("Wrong username");
		}

		return cell.getStringCellValue();
	}

	//Returns Password
	public String getPassword() throws IOException {

		try {
			file = new FileInputStream(new File(System.getProperty("user.dir") + "\\Documents\\LoginCredentials.xlsx"));
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheetAt(0);

			row = sheet.getRow(1);
			cell = row.getCell(1);
			
			file.close();
		} 
		catch (Exception ex) 
		{
			System.out.println("Wrong username");

		}
		
		return cell.getStringCellValue();
	} 
}
