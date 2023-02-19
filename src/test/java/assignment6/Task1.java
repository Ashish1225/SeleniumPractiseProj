package assignment6;

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
		// for Username: using x-path
		WebElement userName1 = driver.findElement(By.xpath("//input[@name='username']"));
		WebElement userName2 = driver.findElement(By.xpath("//input[contains(@name,'username')]"));
		WebElement userName3 = driver
				.findElement(By.xpath("//label[text()='Username']//parent::div//following-sibling::div//input"));

		// for Username: using cssSelector
		WebElement userName4 = driver.findElement(By.cssSelector("input[name='username']"));
		WebElement userName5 = driver.findElement(By.cssSelector("input[placeholder*='Username']"));
		WebElement userName6 = driver
				.findElement(By.cssSelector("div[class*='oxd-input-group'] div:nth-child(2) input[name=username]"));

		// for Password: using x-path
		WebElement password1 = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement password2 = driver.findElement(By.xpath("//input[contains(@name,'password')]"));
		WebElement password3 = driver
				.findElement(By.xpath("//label[text()='Password']//parent::div//following-sibling::div//input"));

		// for Username: using cssSelector
		WebElement password4 = driver.findElement(By.cssSelector("input[name='password']"));
		WebElement password5 = driver.findElement(By.cssSelector("input[placeholder*='password']"));
		WebElement password6 = driver
				.findElement(By.cssSelector("div[class*='oxd-input-group'] div:nth-child(2) input[name=password]"));

		// for LOgin: using x-path
		WebElement login1 = driver.findElement(By.xpath("//button[text()=' Login ']"));
		WebElement login2 = driver.findElement(By.xpath("//div[contains(@class,'orangehrm-login-action')]/button"));
		WebElement login3 = driver.findElement(By.xpath("//button[contains(@class,'orangehrm-login-button')]"));

		// for LOgin: using CssSelector
		WebElement login4 = driver.findElement(By.cssSelector("button[class*='orangehrm-login-button']"));
		WebElement login5 = driver.findElement(By.cssSelector("div[class*='orangehrm-login-action']>button"));
		WebElement login6 = driver.findElement(By.cssSelector("button[type='submit']"));

	}

}
