package calendarcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://ineuron-courses.vercel.app/login");

		driver.manage().window().maximize();
		
		// Register the user
		driver.findElement(By.xpath("//a[normalize-space()='New user? Signup']")).click();
		Thread.sleep(2000);
		// check weather sign up button is enable or disable
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement signUpBtn = driver.findElement(By.xpath("//button[normalize-space()='Sign up']"));
		js.executeScript("arguments[0].scrollIntoView(true);", signUpBtn);
		
		System.out.println("Before fill all the details sign up button is :"+signUpBtn.isEnabled());
		
		driver.findElement(By.id("name")).sendKeys("Ashish K Sahu");
		driver.findElement(By.id("email")).sendKeys("ashu2595@gmail.com");
		driver.findElement(By.id("password")).sendKeys("ashu@12345");
		
		driver.findElement(By.xpath("//label[text()='Testing']")).click();
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		
		WebElement state = driver.findElement(By.id("state"));
		Select select = new Select(state);
		select.selectByVisibleText("Uttar Pradesh");
		
		System.out.println("After fill all the details sign up button is :"+signUpBtn.isEnabled());
		signUpBtn.click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("email1")).sendKeys("ashu2595@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("ashu@12345");
		
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();

		
		driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).click();

	}

}
