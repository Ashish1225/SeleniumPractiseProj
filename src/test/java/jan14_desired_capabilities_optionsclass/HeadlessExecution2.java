package jan14_desired_capabilities_optionsclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessExecution2 {

	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		//opt.setHeadless(true);
		
		//opt.addArguments("--headless");
		
		// -- if we want to run in incognito
		
		opt.addArguments("--start-maximized");
		opt.addArguments("--incognito");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.get("http://learn-automation.com");
		System.out.println("Title is :"+driver.getTitle());
		
		driver.quit();
	}

}
