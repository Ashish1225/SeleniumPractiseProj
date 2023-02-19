package webrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands5 {
	/*
	 * 
	 * Selenium 4 has Relatives locators
	 * 
	 * 
	 */

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("ineuron@ineuron.ai");
		
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("ineuron");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//button[text()='Sign out']")).click();
		
		//driver.quit();
	
	}

}
