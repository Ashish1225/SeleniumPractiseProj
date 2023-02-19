package jan_22;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ReadExcel2 {
	
	@Test
	public void readExcel() throws IOException {
		
		File file = new File(System.getProperty("user.dir")+"//testdata//LoginIneurone.xlsx");
		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int sheetCount = workbook.getNumberOfSheets();
		
		System.out.println("Sheet count is :"+sheetCount);
		
		int ttlRows = sheet.getLastRowNum()+1;
		int ttlColumns = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Total rows in sheet is :"+ttlRows);
		System.out.println("Total columns in sheet is :"+ttlColumns);
		
		XSSFRow row1 = sheet.getRow(0);
		XSSFCell cell1 = row1.getCell(0);
		System.out.println(cell1.getStringCellValue());
		
	}

}
