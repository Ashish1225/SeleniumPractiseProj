package findElementsDemo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsExample4 {

	// Using iterator

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());

		// find the text from the hyperlink
		for (WebElement ele : allLinks) {
			System.out.println("Link text is: "+ele.getText());
		}
		
		System.out.println("***********************************");

		for (WebElement ele : allLinks) {
			System.out.println("Inner HTML text is: "+ele.getAttribute("innerHTML"));
		}

		System.out.println("***********************************");

		for (WebElement ele : allLinks) {
			System.out.println("Outer HTML text is: "+ele.getAttribute("outerHTML"));
		}

		System.out.println("***********************************");
	
		for (WebElement ele : allLinks) {
			System.out.println("HREF text is: "+ele.getAttribute("href"));
		}

		driver.quit();

	}

}
