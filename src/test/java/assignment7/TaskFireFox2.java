package assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TaskFireFox2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");
		
		WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));
		login.click();
		
		WebElement requiredText = driver.findElement(By.xpath("//input[@name='password']/parent::div/parent::div//span[text()='Required']"));
		if(requiredText.isDisplayed()) {
			System.out.println("Required Message is showing");
		}else {
			System.out.println("Required Message is Not showing");
		}
		
		driver.quit();
	}

}
