package jan_21;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SkipTest {
	
	@Test
	public void login() {
		Assert.assertTrue(true);
		Reporter.log("Login to application", true);
	}
	
	@Test(dependsOnMethods  = "login")
	public void logout() {
		Reporter.log("logout from application", true);
	}

}
