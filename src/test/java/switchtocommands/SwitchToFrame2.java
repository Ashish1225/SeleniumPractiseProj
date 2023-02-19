package switchtocommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToFrame2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ineuron-courses.vercel.app/login");

		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.id("email1")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.id("password1")).sendKeys("ineuron");

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Practise']")).click();
		
		// switching to frame using name or id.
		driver.switchTo().frame("ashu");
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).click();
		
		driver.switchTo().defaultContent();
	}

}
