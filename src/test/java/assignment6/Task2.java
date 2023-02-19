package assignment6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		// for Username: using x-path
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		
		WebElement login1 = driver.findElement(By.xpath("//button[text()=' Login ']"));
		login1.click();
		Thread.sleep(3000);
		// Write dynamic xpath which should match all below elements
		
		List<WebElement> allElements = driver.findElements(By.xpath("//ul[@class='oxd-main-menu']//li//span"));
		
		for(WebElement ele:allElements) {
			System.out.println(ele.getText());
			if(ele.getText().equals("Admin")) {
				ele.click();
				Thread.sleep(3000);
				break;
			}
		}
		// Click on Add button 
		driver.findElement(By.xpath("//button[text()=' Add ']")).click();
		Thread.sleep(3000);
		
		// Type A in employee name and write XPath which matches all element in suggestions
		
		driver.findElement(By.xpath("//input[contains(@placeholder,'Type for hints')]")).sendKeys("A");
		Thread.sleep(1500);
		
		List<WebElement> searchReccords = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		for(WebElement record :searchReccords) {
			System.out.println(record.getText());
		}
		
		WebElement userRole1 = driver.findElement(By.xpath("//label[text()='Status']//parent::div//following-sibling::div//div[text()='-- Select --']"));
		
		WebElement userRole2 =driver.findElement(By.xpath("(//div[text()='-- Select --'])[1]"));
		
		WebElement userRole3= driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text-input')])[1]"));
		
		WebElement status1 = driver.findElement(By.xpath("//label[text()='User Role']//parent::div//following-sibling::div//div[text()='-- Select --']"));
		WebElement status2 =driver.findElement(By.xpath("(//div[text()='-- Select --'])[2]"));
		WebElement status3= driver.findElement(By.xpath("(//div[contains(@class,'oxd-select-text-input')])[2]"));

		WebElement searchEmployeeName = driver.findElement(By.xpath("//input[contains(@placeholder,'Type for hints')]"));
		
		WebElement searchEmployeeName1 = driver.findElement(By.xpath("//label[text()='Employee Name']//parent::div//following-sibling::div//input[contains(@placeholder,'Type for hints')]"));
		
		WebElement searchEmployeeName2=driver.findElement(By.xpath("//div[@class='oxd-autocomplete-wrapper']//input[contains(@placeholder,'Type for hints')]"));
		
		WebElement userName1=driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]"));
		WebElement userName2=driver.findElement(By.xpath("//label[text()='Username']//parent::div//following-sibling::div//input"));
		WebElement userName3=driver.findElement(By.xpath("//div//label[text()='Username']//parent::div//following-sibling::div//input"));
		WebElement userName4=driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]"));
		
		WebElement password1=driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
		WebElement password2=driver.findElement(By.xpath("//label[text()='Password']//parent::div//following-sibling::div//input"));
		WebElement password3=driver.findElement(By.xpath("//div//label[text()='Password']//parent::div//following-sibling::div//input"));
		WebElement password4=driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]"));
		
		WebElement confirmPassword1=driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[4]"));
		WebElement confirmPassword2=driver.findElement(By.xpath("//label[text()='Confirm Password']//parent::div//following-sibling::div//input"));
		WebElement confirmPassword3=driver.findElement(By.xpath("//div//label[text()='Confirm Password']//parent::div//following-sibling::div//input"));
		WebElement confirmPassword4=driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]"));
		
		WebElement cancelBtn1=driver.findElement(By.xpath("//button[text()=' Cancel ']"));
		WebElement cancelBtn2=driver.findElement(By.xpath("//p//following-sibling::button[1]"));
		WebElement cancelBtn3=driver.findElement(By.xpath("//div[@class='oxd-form-actions']//button[1]"));
		
		WebElement saveBtn1=driver.findElement(By.xpath("//button[text()=' Save ']"));
		WebElement saveBtn2=driver.findElement(By.xpath("//p//following-sibling::button[2]"));
		WebElement saveBtn3=driver.findElement(By.xpath("//div[@class='oxd-form-actions']//button[2]"));
		
		driver.quit();
	
	}

}
