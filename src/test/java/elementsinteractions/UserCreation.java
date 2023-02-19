package elementsinteractions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UserCreation {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ashish");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sahu");
		
		driver.findElement(By.xpath("//div[contains(text(),'Mobile number')]/parent::div//input")).sendKeys("5459359483");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("sdasd3434");
		
		WebElement day = driver.findElement(By.id("day"));
		
		Select daySelect = new Select(day);
		daySelect.selectByVisibleText("25");
		
		WebElement month = driver.findElement(By.id("month"));
		
		Select monthSelect = new Select(month);
		monthSelect.selectByVisibleText("Apr");
		
		WebElement year = driver.findElement(By.id("year"));
		
		Select yearSelect = new Select(year);
		yearSelect.selectByVisibleText("1995");
		
		WebElement gender = driver.findElement(By.xpath("//label[text()='Male']/parent::span/input"));
		gender.click();
		System.out.println("Male is selected :"+gender.isSelected());
		
	
	}

}
