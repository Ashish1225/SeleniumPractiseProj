package assignment8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// Capture all link text available in the footer section and verify Create Page Link is present or not. 
		//If yes then click on it.
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id='pageFooter']//a"));
		System.out.println("Size of all links are :"+allLinks.size());
		for(WebElement links : allLinks) {
			System.out.println(links.getText());
			if(links.getText().equals("Create Page")) {
				links.click();
				break;
			}
		}
		WebElement header = driver.findElement(By.xpath("//div[@data-testid='pageCreationHeaderBannerTitle']"));
		System.out.println("Header of Create Page is :"+header.getText());
		driver.quit();

	}

}
