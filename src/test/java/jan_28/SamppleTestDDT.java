package jan_28;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.ExcelReader;

public class SamppleTestDDT {
	
	
	@Test(dataProvider = "supplier")
	public void sample(String fName ,String lName, String email, String prize, String city) {
		System.out.println("**** Test Started**********");
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(email);
		System.out.println(prize);
		System.out.println(city);
		System.out.println("**** Test Completed**********");
	}
	
	@DataProvider(name="supplier")
	public Object[][] getData() {
		Object[][] data = ExcelReader.getDataFromSheet("Emp");
		return data;
	}

}
