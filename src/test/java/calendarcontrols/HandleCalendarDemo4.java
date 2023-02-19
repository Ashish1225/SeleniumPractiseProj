package calendarcontrols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCalendarDemo4 {
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		driver.manage().window().maximize();

		/*
		 * Write alogin to select date 28 August 2024
		 * 
		 */

		driver.findElement(By.id("datepicker")).click();

//		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//
//		System.out.println(month);
//		System.out.println(year);
//
//		while (!(month.equals("August") && year.equals("2024"))) {
//
//			driver.findElement(By.xpath("//span[text()='Next']")).click();
//			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
//			year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
//			System.out.println(month);
//			System.out.println(year);
//		}
//
//		driver.findElement(By.xpath("//a[text()='23']")).click();

		// calling the function

		selectCalendarDate("32", "August", "2023");
	}

	public static void selectCalendarDate(String expDay, String expMonth, String expYear) {
		
		if(expMonth.equals("February") && Integer.parseInt(expDay)>29) {
			System.out.println("Wrong Date :"+ expMonth+ ":: "+expDay);
			return;		
		}
		
		if(Integer.parseInt(expDay)>31) {
			System.out.println("Wrong Date :"+ expMonth+ ":: "+expDay);
			return;		
		}
		
		String month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().trim();
		String year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText().trim();
		while (!(month.equals(expMonth) && year.equals(expYear))) {

			driver.findElement(By.xpath("//span[text()='Next']")).click();
			month = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText().trim();
			year = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText().trim();
			System.out.println(month);
			System.out.println(year);
		}
		driver.findElement(By.xpath("//a[text()='" + expDay + "']")).click();
	}

}
