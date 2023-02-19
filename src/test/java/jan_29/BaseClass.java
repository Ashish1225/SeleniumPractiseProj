package jan_29;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import helper.Utility;

public class BaseClass {
	WebDriver driver;
	
	@BeforeClass
	public void setUpApplication() {
		driver = Utility.startBrowser("chrome", "https://ineuron-courses.vercel.app/");
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
