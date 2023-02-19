package assignment9;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegiterUser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://ineuron-courses.vercel.app/login");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		// Register the user
		driver.findElement(By.xpath("//a[normalize-space()='New user? Signup']")).click();
		Thread.sleep(2000);
		// check weather sign up button is enable or disable
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement signUpBtn = driver.findElement(By.xpath("//button[normalize-space()='Sign up']"));
		js.executeScript("arguments[0].scrollIntoView(true);", signUpBtn);
		
		System.out.println("Before fill all the details sign up button is :"+signUpBtn.isEnabled());
		
		driver.findElement(By.id("name")).sendKeys("Ashish S");
		driver.findElement(By.id("email")).sendKeys("ashu25954@gmail.com");
		driver.findElement(By.id("password")).sendKeys("ashu4@12345");
		
		driver.findElement(By.xpath("//label[text()='Testing']")).click();
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		WebElement state = driver.findElement(By.id("state"));
		Select select = new Select(state);
		select.selectByVisibleText("Uttar Pradesh");
		
		System.out.println("After fill all the details sign up button is :"+signUpBtn.isEnabled());
		try {
			signUpBtn.click();
		}
		catch (Exception e) {
			System.out.println("WebElement is not clickable so try with javascript");
			js.executeScript("arguments[0].click()",signUpBtn);
		}
		Thread.sleep(2000);
		
		driver.findElement(By.id("email1")).sendKeys("ashu25954@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("ashu4@12345");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).click();

	}

}
