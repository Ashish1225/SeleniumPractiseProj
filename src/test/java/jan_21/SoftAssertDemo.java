package jan_21;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	@Test
	public void test1() {
		Reporter.log("Test started",true);
		Assert.assertTrue(true);
		Reporter.log("Test 1 ended",true);
	}
	@Test
	public void test2() {
		Reporter.log("Test 2 is started", true);
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(true);
		Reporter.log("Test 2 is ended", true);
		softassert.assertAll();
		
	}
	
}
