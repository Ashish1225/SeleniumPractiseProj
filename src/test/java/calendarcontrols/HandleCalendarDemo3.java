package calendarcontrols;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendarDemo3 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		
		driver.manage().window().maximize();
		
	
		
		//4- Using loop select all dates and select a value
		
		driver.findElement(By.id("datepicker")).click();
		
		List<WebElement> allDates = driver.findElements(By.xpath("//td[@data-handler='selectDay']/a"));
		
		for(WebElement dates:allDates) {
			if(dates.getText().equals("24")) {
				dates.click();
				break;
			}
		}
		
		driver.quit();
		
		

	}

}
