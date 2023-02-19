package webrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands {
	/*
	 * 
	 * Selenium 4 has Relatives locators
	 * 
	 * 
	 */

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://ineuron-courses.vercel.app/login");
		
		WebElement emailId = driver.findElement(By.xpath("//input[@id='email1']"));
		emailId.sendKeys("ineuron@ineuron.com");
		emailId.clear();
		emailId.sendKeys("ashish@gmail.com");
		
		
		driver.quit();
	
	}

}
