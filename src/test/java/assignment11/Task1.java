package assignment11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task1 {

	public static void main(String[] args) {
		/*
		 * Open http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html
		 * Click on timer 
		 * Wait for text "WebDriver" Use 2 conditions of ExpectedCondition
		 * 
		 * 
		 */
		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
			
			
			driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			
			// Method 1 - textToBePresentInElementLocated
			//Boolean status = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//p[@id='demo']"), "WebDriver"));
			
			
			// Method 2 - textToBe
			Boolean status=wait.until(ExpectedConditions.textToBe(By.xpath("//p[@id='demo']"), "WebDriver"));
			if(status==true) {
				System.out.println("Pass");
			}else {
				System.out.println("Fail");
			}
			
			driver.quit();
	}

}
