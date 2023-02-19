package assignment5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {
	
	//Open below application and verify logo is present or not

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement brand = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img"));
		if(brand.isDisplayed()) {
			System.out.println("Logo is Present");
		}else {
			System.out.println("Logo is not Present");
		}
		
		
		driver.quit();
	}

}
