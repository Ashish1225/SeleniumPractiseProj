package assignment11;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2 {

	/*
	 * Create a method in Utility class named as "captureScreenshotOfWebElement"
	 * will capture the screenshot of element will store element screenshot in
	 * element screenshot folder all screenshot should have date time stamp
	 * 
	 */

	public static void captureScreenshotOfWebElement(WebElement element) {
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\SeleniumTrainingWorkspace\\SeleniumWebDriver\\screenshots\\ElementScreenshot_"
				+ getCustomDateFormat() + ".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {

			System.out.println("Something went wrong-" + e.getMessage());
		}
	}
	public static String getCustomDateFormat() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy");
		String currentDate = dateFormat.format(date);
		return currentDate;

		
	}

}
