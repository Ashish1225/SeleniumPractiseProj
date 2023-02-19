package findElementsDemo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsExample7 {

	// Exception in thread "main" org.openqa.selenium.StaleElementReferenceException:
	//stale element reference: element is not attached to the page document
	// because after refresh userName field is loose the reference

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement userName = driver.findElement(By.name("email"));
		userName.sendKeys("Ashish");
		driver.navigate().refresh();
		//Thread.sleep(2000);
		//userName.clear();
		userName.sendKeys("Mangal");
		
		driver.quit();

	}

}
