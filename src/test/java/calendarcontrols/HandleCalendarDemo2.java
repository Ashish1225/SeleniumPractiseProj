package calendarcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendarDemo2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().window().maximize();
		
	
		
		//3- clicking on next month icon then click on date
		
		driver.findElement(By.id("datepicker")).click();
		
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		
		driver.findElement(By.xpath("//a[text()='28']")).click();
		
		driver.quit();
		
		

	}

}
