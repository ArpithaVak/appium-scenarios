package practiceAppium.AppiumBasic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.google.common.collect.Table.Cell;

public class LoginCredFromExcel
{
	public FileInputStream file;
	public XSSFWorkbook workbook = null;
	public XSSFSheet sheet;
	public Row row;
	public Cell cell;

	//Returns Username
	public String getUsername() throws IOException {
		

		try {
			file = new FileInputStream(new File(System.getProperty("user.dir") + "\\documents\\LoginCredentials.xlsx"));
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheetAt(0);

			row = sheet.getRow(1);
			cell = (Cell) row.getCell(0);
			
			file.close();
		} 
		catch (Exception ex)
		{
			System.out.println("Invalid username");
		}
		return ((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue();

		
	}
	//Returns Password
	public String getPassword() throws IOException {

		try {
			file = new FileInputStream(new File(System.getProperty("user.dir") + "\\documents\\LoginCredentials.xlsx"));
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheetAt(0);

			row = sheet.getRow(1);
			cell = (Cell) row.getCell(1);
			
			file.close();
		} 
		catch (Exception ex)
		{
			System.out.println("Invalid password");
		}
		return ((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue();
		
	}
	
	public String getSearchedValue() throws IOException
	{
		try {
			file = new FileInputStream(new File(System.getProperty("user.dir") + "\\documents\\LoginCredentials.xlsx"));
			workbook = new XSSFWorkbook(file);
			sheet = workbook.getSheetAt(1);

			row = sheet.getRow(1);
			cell = (Cell) row.getCell(1);
			
			file.close();
		} 
		catch (Exception ex)
		{
			System.out.println("Invalid Searched Value");
		}
		return ((org.apache.poi.ss.usermodel.Cell) cell).getStringCellValue();
	}

}
