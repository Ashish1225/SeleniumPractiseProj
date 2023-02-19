package jan_15_selenium_grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumWithTestNG {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void startBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/");
		
	}
	@Test(priority=2)
	public void verifyUrl() {
		
		String currentUrl = driver.getCurrentUrl();
		Assert.assertTrue(currentUrl.contains("ineuron-courses"),"Url did not match");
		
	}
	
	@Test(priority=3)
	public void verifyTitle() {
		
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Courses"),"Title Mismatched");
		
	}
	@Test(priority=4)
	public void closeBrowser() {
		driver.quit();
	}

}
