package webrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands3 {
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
		
		/*
		 * 
		 *  driver.findElements(By.xpath("//input[@id='email1']")).get(0).sendKeys("sds")- not throw any exception
		 *  
		 *  driver.findElements(By.xpath("//input[@id='email1']")).get(1).sendKeys("sds")- IndexOutOfBound Exception
		 *  
		 *  +emailId.getAttribute("Value"));- it will give you null value
		 *  +emailId.getAttribute("value"));- it will give you the attribute of the field
		 *  
		 */
		WebElement emailId=driver.findElement(By.xpath("//input[@id='email1']"));
		System.out.println("Enable status :"+emailId.isEnabled());
		System.out.println("Diplayed status :"+emailId.isDisplayed());
		System.out.println("Attribute is :"+emailId.getAttribute("placeholder"));
		System.out.println("CSS is :"+emailId.getCssValue("font-size"));
		emailId.sendKeys("ashu");
		System.out.println("Value fetched from selenium :"+emailId.getAttribute("Value"));
		
		
		driver.quit();
	
	}

}
