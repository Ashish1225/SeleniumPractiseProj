package findElementsDemo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsExample6 {

	// find all the values of images having src

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("q")).sendKeys("mukesh otwani");
		Thread.sleep(2000);

		List<WebElement> allValues = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@role='option']"));
		
		System.out.println(allValues.size());
		
		for(WebElement ele: allValues) {
			System.out.println(ele.getText());
			//System.out.println(ele.getAttribute("innerHTML"));
			
			if(ele.getText().contains("assured")) {
				ele.click();
				break;
			}
		}
		
		if(driver.getTitle().contains("rest assured")) {
			System.out.println("Validation is Passed");
		}
		driver.quit();

	}

}
