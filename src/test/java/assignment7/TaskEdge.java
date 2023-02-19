package assignment7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TaskEdge {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new EdgeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//button[text()=' Login ']"));
		login.click();
		Thread.sleep(3000);
		
		String currentUrl = driver.getCurrentUrl();
		if(currentUrl.contains("dashboard")) {
			System.out.println("User is login successfully");
		}else {
			System.out.println("User is not login successfully");
		}
		WebElement serProfiledDrpDn = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		serProfiledDrpDn.click();
		
		WebElement logOutBtn =driver.findElement(By.xpath("//a[text()='Logout']"));
		logOutBtn.click();
		Thread.sleep(2000);
		
		WebElement brandName = driver.findElement(By.xpath("//div[@class='orangehrm-login-branding']/img"));
		if(brandName.isDisplayed()) {
			System.out.println("User has successfully Logged Out.");
		}
		else {
			System.out.println("User has not successfully Logged Out.");
		}
		
		
		driver.quit();
	}

}
