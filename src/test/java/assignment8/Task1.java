package assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// Capture the below text and verify text contains the below text
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		//  -//div[@class='_8esl']     
		
		String expText="Facebook helps you connect and share with the people in your life";
		String actualText = driver.findElement(By.xpath("//div[@class='_8esl']//h2")).getText();
		System.out.println(actualText);
		
		if(actualText.contains(expText)) {
			System.out.println("Passed");
		}
		else {
			System.out.println("Failed");
		}
		
		driver.quit();

	}

}
