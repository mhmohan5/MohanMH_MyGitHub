package week5.apachepoi;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

import org.testng.annotations.Test;

public class ReadFromExcel {
	@Test 
	public void readFromExcelMethod() throws IOException {
		
		File file1 = new File("./data/testdata.xlsx");
		
		FileInputStream fis = new FileInputStream(file1);
		
		XSSFWorkbook  book = new XSSFWorkbook(fis);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		
		int rowCount = sheet.getLastRowNum();
		
		for (int i = 1; i <= rowCount; i++) {
			
			XSSFRow row = sheet.getRow(i);
			int columnCount = row.getLastCellNum();
			for (int j = 0; j < columnCount; j++) {
				XSSFCell cell = row.getCell(j);
				System.out.println(cell.getStringCellValue());
				
			}
			
			book.close();
		}
		
	}

}
