package jan_8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.yahoo.com/?.intl=in");
		
		driver.findElement(By.xpath("//input[@id='persistent']")).click();
		/*
		 * Click with Multiple ways:
		 *  	CLick -  JavaScript
		 *  	Click - Action
		 *  	CLick - WebElement
		 * 
		 * 
		 */
		
		driver.quit();

	}

}
