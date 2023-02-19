package jan_7_waits;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShotForElement {

	// Using Output type as File

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Click me to start timer']"));
		
		File src = button.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\SeleniumTrainingWorkspace\\SeleniumWebDriver\\screenshots\\ElementScreenshot"+getCustomDateTimeFormat()+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			
			System.out.println("Something went wrong-" + e.getMessage());
		}
		
		driver.quit();
	}
	
	public static String getCustomDateTimeFormat() {
//		Date date = new Date();
//		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss_dd_MM_yyyy");
//		String currentDate = dateFormat.format(date);
//		return currentDate;

		Date date = new Date();
		return date.toString().replace(" ", "_").replace(":", "_");
		
	}

}
