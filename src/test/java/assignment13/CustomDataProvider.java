package assignment13;

import org.testng.annotations.DataProvider;

import helper.ExcelReader;

public class CustomDataProvider {
	
	
	@DataProvider(name="getRegisterData")
	public Object[][] getDataFromExcel() {
		Object[][] data =ExcelReader.getDataFromSheet("RegisterUser");
		return data;
	}

}
