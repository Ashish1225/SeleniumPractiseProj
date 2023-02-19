package jan_8;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsDemo2 {
	
	// CLick and type using  JavaScript

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/?.intl=in");
		
		//driver.findElement(By.xpath("//input[@id='persistent']")).click();
		/*
		 * Click with Multiple ways:
		 *  	CLick -  JavaScript
		 *  	Click - Action
		 *  	CLick - WebElement
		 * 
		 * 
		 */
		
		// type using js
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('login-username').value = 'selenium'");
		
		js.executeScript("document.getElementById('persistent').click()");
		
		driver.quit();

	}

}
