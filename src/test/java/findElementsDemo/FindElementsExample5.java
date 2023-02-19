package findElementsDemo;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsExample5 {

	// find all the values of images having src

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.foundit.in/");
		driver.manage().window().maximize();

		List<WebElement> allLinks = driver.findElements(By.xpath("//img[@src]"));
		System.out.println(allLinks.size());


		System.out.println("***********************************");
	
		for (WebElement ele : allLinks) {
			System.out.println("SRC value is: "+ele.getAttribute("src"));
		}

		driver.quit();

	}

}
