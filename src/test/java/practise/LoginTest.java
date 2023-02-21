package practise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.get("https://ineuron-courses.vercel.app/login");
	}
	
	@Test(dataProvider = "loginData")
	public void loginTestFuncion(String type,String userEmail, String Password) {
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys(userEmail);
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if(type.equals("ValidCred")) {
			Assert.assertTrue(driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).isDisplayed(),"Not Displayed");
		}
		else if(type.equals("ValidEmailInvalidPass")) {
			String actualWarning = driver.findElement(By.xpath("//h2[@class='errorMessage']")).getText();
			String exptedWarning = "Email and Password Doesn't match";
			Assert.assertEquals(actualWarning, exptedWarning,"Login with ValidEmailInvalidPass credentials");
		}
		else if(type.equals("InvalidEmailValidPass")) {
			String actualWarning = driver.findElement(By.xpath("//h2[@class='errorMessage']")).getText();
			String exptedWarning = "USER Email Doesn't Exist";
			Assert.assertEquals(actualWarning, exptedWarning,"Login wih InvalidEmailValidPass credentials");
		}
		else if(type.equals("InvalidEmailValidPass")) {
			String actualWarning = driver.findElement(By.xpath("//h2[@class='errorMessage']")).getText();
			String exptedWarning = "USER Email Doesn't Exist";
			Assert.assertEquals(actualWarning, exptedWarning,"Login wih InvalidEmailValidPass credentials");
		}
		else if(type.equals("BlankCred")) {
			String actualWarning = driver.findElement(By.xpath("//h2[@class='errorMessage']")).getText();
			String exptedWarning = "Email and Password is required";
			Assert.assertEquals(actualWarning, exptedWarning,"Login wih BlankCred credentials");
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	@DataProvider(name = "loginData")
	public Object[][] dataSupplier() {
		
		Object[][] data = {
				
				{"ValidCred","ineuron@ineuron.ai","ineuron"},{"ValidEmailInvalidPass","ineuron@ineuron.ai","sfasfd"},{"InvalidEmailValidPass","ineuron@gmail.com","ineuron"}
				,{"InvalidCred","ineuron@gmail.ai","fefef"},{"BlankCred","",""}
		};
		return data;
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
