package assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Mukesh");
		
		WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));
		login.click();
		Thread.sleep(3000);
		WebElement errorMsg = driver.findElement(By.xpath("//div[@role='alert']/div/p"));
		if(errorMsg.getText().contains("Invalid credentials")) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		driver.quit();
	}

}
