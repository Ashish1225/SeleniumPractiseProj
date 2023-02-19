package jan_22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.Utility;

public class DDT2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		Reporter.log("Setting up browser", true);
		driver = Utility.startBrowser("chrome", "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Reporter.log("Application is up and running ", true);
	}
	
	@AfterMethod
	public void tearDown() {
		Reporter.log("Terminating session", true);
		driver.quit();
		Reporter.log("Session terminating", true);
	}


	@Test(dataProvider = "supplier")
	public void test1(String uname, String pass) {
		
		driver.findElement(By.name("username")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		Utility.waitForSeconds(3);
		Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"), "Login not successfull");
		
	}
	
	@DataProvider(name = "supplier")
	public Object[][] getData() {
		Object[][] data = { { "Admin", "admin123" }, { "mangu", "200" }, { "sanju", "300" } };
		return data;
	}

}
