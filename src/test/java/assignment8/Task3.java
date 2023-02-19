package assignment8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		// Click on Create new account 
		//Fill in all details and click on the Signup button

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Saurabh");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sahu");
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'Mobile number')]")).sendKeys("saurabh@gmail.com");
		
		driver.findElement(By.xpath("//input[contains(@aria-label,'Re-enter email address')]")).sendKeys("saurabh@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("saurabh@123");
		
		WebElement date = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Select selectDate = new Select(date);
		selectDate.selectByVisibleText("25");
		
		WebElement month = driver.findElement(By.xpath("//select[@aria-label='Month']"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("Apr");
		
		WebElement year = driver.findElement(By.xpath("//select[@aria-label='Year']"));
		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("1996");
		
		driver.findElement(By.xpath("//label[text()='Male']")).click();
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		Thread.sleep(10000);
		
		driver.quit();

	}

}
