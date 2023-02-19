package jan_15_selenium_grid;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SeleniumWithTestNG2 {
	
	WebDriver driver;
	
	@Test(priority=1)
	public void startBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ineuron-courses.vercel.app/login");
		
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
	public void verifyFooterCount() {
		List<WebElement> element = driver.findElements(By.xpath("//div[@class='social-btns']/a"));
		System.out.println(element.size());
		Assert.assertEquals(element.size(),4,"Footer Count is mismatch.");
	}
	@Test(priority=5)
	public void login() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("ineuron");
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		Thread.sleep(3000);
		String heading = driver.findElement(By.xpath("//div[@class='home']//h4")).getText();
		Assert.assertTrue(heading.contains("Welcome iNeuron"),"Heading is not diplaying");
	}
	@Test(priority=6)
	public void logout() throws InterruptedException {
		driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).click();
		Thread.sleep(2000);
		String loginHeading = driver.findElement(By.xpath("//h2[normalize-space()='Sign In']")).getText();
		System.out.println(loginHeading);
		Assert.assertTrue(loginHeading.contains("SIGN IN"),"Not logout");
	}
	
	
	@Test(priority=7)
	public void closeBrowser() {
		driver.quit();
	}

}
