package jan_7_waits;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenShotUsingUtility2 {

	// Using Output type as File

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		TakesScreenshot tss = (TakesScreenshot)driver;
		File src = tss.getScreenshotAs(OutputType.FILE);
		File dest = new File("./MyFirstScreenShot.png");
		
		
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			
			System.out.println("Something went wrong-"+e.getMessage());
		}
		
		driver.quit();
	}

}
