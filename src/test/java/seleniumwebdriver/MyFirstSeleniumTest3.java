package seleniumwebdriver;

import java.time.Duration;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumTest3 {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		System.out.println("Title is :"+driver.getPageSource());
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		WebDriver driver1 = new ChromeDriver();
		
		SearchContext driver2 = new ChromeDriver();
		
		Object driver3 = new ChromeDriver();
		
		
		driver.close();
		
		

	}

}
