package helper;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Reporter;

// in Utility class we are using custom wait method



public class Utility {
	 /*
	 * 
	 * method will accept browser, url and return driver
	 */
	
	public static WebDriver startBrowser(String browserName, String url) {
		WebDriver driver = null;
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else if(browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else {
			Reporter.log("Sorry "+browserName+ " is not supported..");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(20));
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		return driver;
	}
	
	
	// custom click method using element, action class and javascript
	public static void clickElement(WebDriver driver, By locator)
	{
		try 
		{
			driver.findElement(locator).click();
		} catch (Exception e) {
			
			try {
				System.out.println("Trying with actions class click");
				Actions act=new Actions(driver);
				act.moveToElement(driver.findElement(locator)).click().build().perform();
			} catch (Exception e1) {
				
				System.out.println("Trying with JS Click");
				JavascriptExecutor js=(JavascriptExecutor)driver;
				js.executeScript("arguments[0].click()", driver.findElement(locator));
			}
			
		}
		
	}
	
	// -- Highlighting element
	public static WebElement highlightElement(WebDriver driver,WebElement element)
	{
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px solid red;')", element);
		
		waitForSeconds(1);
		
		js.executeScript("arguments[0].setAttribute('style','border:2px solid white;')", element);
		
		return element;
	}
	
	public static WebElement highlightElement(WebDriver driver,By locator)
	{
		
		WebElement element=driver.findElement(locator);
	
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].setAttribute('style','background: yellow; border:2px solid red;')", element);
		
		try {
			Thread.sleep(300);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		js.executeScript("arguments[0].setAttribute('style','border:2px solid white;')", element);
		
		return element;
	}
	
	
	// custom method for wait for alert
	public static Alert waitForAlert(WebDriver driver) {
		Alert alert = null;
		for (int i = 0; i < 15; i++) {
			try {
				alert = driver.switchTo().alert();
				break;
			} catch (NoAlertPresentException e) {
				System.out.println("No Alert found - Waiting for ALert");
				waitForSeconds(1);
			}
		}
		return alert;
	}

	// method overloading if user wants give any time
	public static Alert waitForAlert(WebDriver driver, int time) {
		Alert alert = null;
		for (int i = 0; i < time; i++) {
			try {
				alert = driver.switchTo().alert();
				break;
			} catch (NoAlertPresentException e) {
				System.out.println("No Alert found - Waiting for ALert");
				waitForSeconds(1);
			}
		}
		return alert;
	}

	// this will wait for given seconds
	public static void waitForSeconds(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// ----to capture screen shot

	public static void captureScreenShots(WebDriver driver) {
		TakesScreenshot tss = (TakesScreenshot) driver;

		File src = tss.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\SeleniumTrainingWorkspace\\SeleniumWebDriver\\screenshots\\ElementScreenshot_"+getCustomDateFormat()+".png");

		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Something went wrong-" + e.getMessage());

		}
	}
	
	// Capturing screen shot for an element
	
	public static void captureScreenshotOfWebElement(WebElement element) {
		File src = element.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\SeleniumTrainingWorkspace\\SeleniumWebDriver\\screenshots\\ElementScreenshot_"+getCustomDateFormat()+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			
			System.out.println("Something went wrong-" + e.getMessage());
		}
	}

	// creating utility for current date format

	public static String getCustomDateFormat() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy");
		String currentDate = dateFormat.format(date);
		return currentDate;

//		Date date = new Date();
//		return date.toString().replace(" ", "_").replace(":", "_");
		
	}

}
