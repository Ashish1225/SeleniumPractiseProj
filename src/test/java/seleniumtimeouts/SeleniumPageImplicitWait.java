package seleniumtimeouts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPageImplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		// always use this kind of wait before get() method
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[normalize-space()='Click me to start timer']")).click();
		
		 WebElement text = driver.findElement(By.xpath("//p[contains(.,'WebDriver')]"));
		System.out.println(text.isDisplayed());

	}

}
