package assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		//userName.sendKeys("Admin");
		
		WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));
		login.click();
		String userNameBorder = userName.getCssValue("border");
		System.out.println(userNameBorder);
		if(userNameBorder.contains("1px")) {
			System.out.println("UserName border is Matched");
		}
		else {
			System.out.println("UserName border is not Matched");
		}
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		String passwordBorder = password.getCssValue("border");
		System.out.println(passwordBorder);
		if(passwordBorder.contains("1px")) {
			System.out.println("Password border is Matched");
		}
		else {
			System.out.println("Password border is not Matched");
		}
		
		
		WebElement requiredTextUserName = driver.findElement(By.xpath("//input[@name='username']/parent::div/parent::div//span[text()='Required']"));
		if(requiredTextUserName.isDisplayed()) {
			System.out.println("Required Message for UserName is showing");
		}else {
			System.out.println("Required Message for UserName is Not showing");
		}
		
		WebElement requiredTextPassword = driver.findElement(By.xpath("//input[@name='password']/parent::div/parent::div//span[text()='Required']"));
		if(requiredTextPassword.isDisplayed()) {
			System.out.println("Required Message for Password is showing");
		}else {
			System.out.println("Required Message for Password is Not showing");
		}
		
		driver.quit();
	}

}
