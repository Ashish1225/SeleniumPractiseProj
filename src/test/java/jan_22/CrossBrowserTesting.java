package jan_22;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import helper.Utility;

public class CrossBrowserTesting {
	
	@Parameters("Browser")
	@Test
	public void login(String browserName) {
		System.out.println("thread id is :"+Thread.currentThread().getId());
		WebDriver driver = Utility.startBrowser(browserName, "https://www.google.com/");
		Reporter.log(driver.getTitle() +" of browser name is :"+browserName, true);
		driver.quit();
	}

}
