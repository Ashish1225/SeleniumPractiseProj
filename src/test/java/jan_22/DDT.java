package jan_22;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT {


	@Test(dataProvider = "supplier")
	public void test1(String uname, String pass) {
		Reporter.log(uname, true);
		Reporter.log(pass, true);

	}
	
	@DataProvider(name = "supplier")
	public Object[][] getData() {
		Object[][] data = { { "ashu", "100" }, { "mangu", "200" }, { "sanju", "300" } };
		return data;
	}

}
