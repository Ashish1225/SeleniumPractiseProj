package helper;

import org.testng.annotations.DataProvider;

public class CustomDataProvider {
	
	@DataProvider(name="EmpDataSet")
	public static Object[][] getData() {
		Object[][] data = ExcelReader.getDataFromSheet("Emp");
		return data;
	}

}
