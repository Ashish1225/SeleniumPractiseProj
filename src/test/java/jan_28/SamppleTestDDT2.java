package jan_28;

import org.testng.annotations.Test;

import helper.CustomDataProvider;

public class SamppleTestDDT2 {
	
	
	@Test(dataProvider = "EmpDataSet",dataProviderClass =CustomDataProvider.class )
	public void sample(String fName ,String lName, String email, String prize, String city) {
		System.out.println("**** Test Started**********");
		System.out.println(fName);
		System.out.println(lName);
		System.out.println(email);
		System.out.println(prize);
		System.out.println(city);
		System.out.println("**** Test Completed**********");
	}
	

}
