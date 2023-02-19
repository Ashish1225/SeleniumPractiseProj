package jan_7_waits;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import helper.Utility;

public class CaptureScreenShot {

	// Using Output type as File

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		Utility.waitForSeconds(2);
		// taking screen shot using utility class
		Utility.captureScreenShots(driver);
		
		driver.quit();
	}

}
