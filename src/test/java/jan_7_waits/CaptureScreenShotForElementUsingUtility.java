package jan_7_waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class CaptureScreenShotForElementUsingUtility {

	// Using Output type as File

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Click me to start timer']"));
		
		Utility.captureScreenshotOfWebElement(button);
		
		driver.quit();
	}

}
