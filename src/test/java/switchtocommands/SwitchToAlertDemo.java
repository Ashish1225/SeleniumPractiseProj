package switchtocommands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 	Write a logic to wait until alert is present max time 10 sec if alert
 *  is present in 5 second then break the loop switchToAlert > capture text > print > accept
 * 
 */


public class SwitchToAlertDemo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email1")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.id("password1")).sendKeys("ineuron");

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[normalize-space()='Practise']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[normalize-space()='Click to show']")).click();
		Alert alert=driver.switchTo().alert();
		String alertText = alert.getText();
		if(alertText.contains("code")) {
			System.out.println("pass");
		}
		else {
			System.out.println("Fail-Text does not match");
		}
		System.out.println(alertText);
		
		alert.accept();	

	}
}
