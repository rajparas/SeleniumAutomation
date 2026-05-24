package Fb_DataDriven;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FbExcelReader
{


	String path = "D:\\Sanket\\Fb.xlsx";
	String sheet = "new";

   
	
	public int rowcount()
	{
		int row = 0;
		 
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(path);
			XSSFSheet worksheet = workbook.getSheet(sheet);
			row = worksheet.getPhysicalNumberOfRows();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return row;
		
	}
	
	public int colcount()
	{
		int col = 0;
		
		 
		try {
			XSSFWorkbook workbook = new XSSFWorkbook(path);
			XSSFSheet worksheet = workbook.getSheet(sheet);
			col = worksheet.getRow(0).getPhysicalNumberOfCells();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return col;
		
	}
	
	public String getData(int row, int col)
	{
		String data = null;
		
		XSSFWorkbook workbook;
		XSSFSheet worksheet = null;
		try {
			 workbook = new XSSFWorkbook(path);
			 worksheet = workbook.getSheet(sheet);
			 data = worksheet.getRow(row).getCell(col).getStringCellValue();
			
		} catch (IOException e) {
		
		Double dt = worksheet.getRow(0).getCell(col).getNumericCellValue();
		data = dt.toString();
		}
		
		
		
		return data;
		
	}
	
}
