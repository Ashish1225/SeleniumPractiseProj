package seleniumtimeouts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPageLoadTimeOut {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		// always use this kind of wait before get() method
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		
		driver.get("https://learn-automation.com/");

	}

}
