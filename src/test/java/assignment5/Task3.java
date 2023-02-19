package assignment5;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {
	
	//Open below application and verify that footer has 4 social media icons

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		List<WebElement> social_icons = driver.findElements(By.xpath("//div[@class='orangehrm-login-footer-sm']/a"));
		System.out.println(social_icons.size());
		
		if(social_icons.size()==4) {
			System.out.println("4 Social Media icons are present");
		}
		else {
			System.out.println("4 Social Media icons are not present");
		}
		
		driver.quit();
	}

}
