package webrivercommands;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementsCommands4 {
	/*
	 * 
	 * Selenium 4 has Relatives locators
	 * 
	 * 
	 */

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
		
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
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		System.out.println("Enable status :"+pass.isEnabled());
		pass.sendKeys("jhb");
		
		driver.quit();
	
	}

}
