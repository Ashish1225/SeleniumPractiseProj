package findElementsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FindElementsExample1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(3000);

		Select month = new Select(driver.findElement(By.id("month")));
		List<WebElement> allDDOptions = month.getOptions();

		System.out.println("Size of the Month list :" + allDDOptions.size());

		for (WebElement ele : allDDOptions) {
			System.out.println(ele.getText());

			if (ele.getText().contains("Aug")) {
				System.out.println("Found");
				break;
			}
		}

		driver.quit();

	}

}
