package calendarcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendarDemo1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().window().maximize();
		
		//1- Handling Data Picker using sendkeys method
		
		//driver.findElement(By.id("datepicker")).sendKeys("12/23/2022");
		
		//2- Handling Data Picker using click on datepicker and again click on date
		
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//a[text()='28']")).click();
		
		driver.quit();
		
		

	}

}
