package assignment8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		// Click on Create new account 
		//Fill in all details and click on the Signup button - using css

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector("a[data-testid^='open-registration']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Shubham");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("Paul");
		
		driver.findElement(By.cssSelector("input[aria-label*='Mobile number']")).sendKeys("shubhamp@gmail.com");
		
		driver.findElement(By.cssSelector("input[aria-label*='Re-enter email address']")).sendKeys("shubhamp@gmail.com");
		
		driver.findElement(By.cssSelector("input[id='password_step_input']")).sendKeys("shubham@123");
		
		WebElement date = driver.findElement(By.cssSelector("select[aria-label='Day']"));
		Select selectDate = new Select(date);
		selectDate.selectByVisibleText("25");
		
		WebElement month = driver.findElement(By.cssSelector("select[aria-label='Month']"));
		Select selectMonth = new Select(month);
		selectMonth.selectByVisibleText("Apr");
		
		WebElement year = driver.findElement(By.cssSelector("select[aria-label='Year']"));
		Select selectYear = new Select(year);
		selectYear.selectByVisibleText("1996");
		
		driver.findElement(By.cssSelector("span[data-name='gender_wrapper'] span:nth-child(2)")).click();
		
		driver.findElement(By.cssSelector("button[name='websubmit']")).click();
		
		Thread.sleep(10000);
		
		driver.quit();

	}

}
