package jan_21;

import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterDemo {
	
	@Parameters("Browser")
	@Test
	public void test1(@Optional ("firefox")String browserName) {
		
		Reporter.log("Browser Name is: "+browserName, true);
		
	}

}
