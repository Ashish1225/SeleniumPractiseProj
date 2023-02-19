package assignment6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {
	
	// Flow- Login > Admin> Add User> Search User > Delete User > Logout

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		Thread.sleep(3000);
		// for UserName: using x-path
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("admin123");
		
		WebElement login1 = driver.findElement(By.xpath("//button[text()=' Login ']"));
		login1.click();
		Thread.sleep(3000);
		// Write dynamic X-path which should match all below elements
		
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
		
		WebElement userRole1 = driver.findElement(By.xpath("//label[text()='User Role']//parent::div//following-sibling::div//div[text()='-- Select --']"));
		userRole1.click();
		Thread.sleep(2000);
		
		List<WebElement> listUsrRole = driver.findElements(By.xpath("//div[@role='listbox']//div//span"));
		for(WebElement userRole : listUsrRole) {
			if(userRole.getText().equals("Admin")) {
				userRole.click();
				break;
			}
		}			
		// Type A in employee name and write XPath which matches all element in suggestions	
		WebElement employeeName=driver.findElement(By.xpath("//input[contains(@placeholder,'Type for hints')]"));
		employeeName.sendKeys("p");
		Thread.sleep(1500);
		Actions action = new Actions(driver);
		List<WebElement> searchRecords = driver.findElements(By.xpath("//div[@role='listbox']/div/span"));
		
		for(WebElement record :searchRecords) {
			System.out.println(record.getText());
			if(record.getText().contains("Peter Mac Anderson")) {
				action.moveToElement(record).click().build().perform();
				break;
			}
		}
		
		WebElement status1 = driver.findElement(By.xpath("//label[text()='Status']//parent::div//following-sibling::div//div[text()='-- Select --']"));
		status1.click();
		Thread.sleep(2000);
		List<WebElement> listStatus = driver.findElements(By.xpath("//div[@role='listbox']//div//span"));
		for(WebElement status:listStatus) {
			if(status.getText().equals("Enabled")) {
				status.click();
				break;
			}
		}
	
		WebElement userName2=driver.findElement(By.xpath("//label[text()='Username']//parent::div//following-sibling::div//input"));
		userName2.sendKeys("ashish.sahu");
		
		WebElement password1=driver.findElement(By.xpath("//label[text()='Password']//parent::div//following-sibling::div//input"));
		password1.sendKeys("Qwer@1234");
		Thread.sleep(1000);
		WebElement confirmPassword1=driver.findElement(By.xpath("//label[text()='Confirm Password']//parent::div//following-sibling::div//input"));
		confirmPassword1.sendKeys("Qwer@1234");
		Thread.sleep(1000);
		
		WebElement saveBtn1=driver.findElement(By.xpath("//div[@class='oxd-form-actions']//button[.=' Save ']"));
		action.moveToElement(saveBtn1).click().build().perform();
		//saveBtn1.click();
		
		Thread.sleep(5000);
//		WebElement successFullMsg=driver.findElement(By.xpath("//div[@id='oxd-toaster_1']//div[contains(@class,'oxd-toast-start')]//p[2]"));
//		if(successFullMsg.getText().contains("Successfully Saved")) {
//			System.out.println("User added successfully: "+successFullMsg.getText());
//		}
//		else {
//			System.out.println("User not added successfully");
//		}
		
		WebElement searchUserName = driver.findElement(By.xpath("//label[normalize-space()='Username']/parent::div//following-sibling::div/input"));
		searchUserName.sendKeys("ashish.sahu");
		
		WebElement searchBtn =driver.findElement(By.xpath("//button[normalize-space()='Search']"));
		action.moveToElement(searchBtn).click().build().perform();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;	
		WebElement userStatus = driver.findElement(By.xpath("//div[@role='table']//div[@class='oxd-table-card']//div[contains(text(),'ashish.sahu')]"));
		js.executeScript("arguments[0].scrollIntoView(true);", userStatus);
		System.out.println("User is Present :"+userStatus.isDisplayed());
		
		WebElement checkBox = driver.findElement(By.xpath("//div[contains(text(),'ashish.sahu')]/parent::div/preceding-sibling::div//span"));
		checkBox.click();
		
		Thread.sleep(2000);
		
		WebElement deleteBtn = driver.findElement(By.xpath("//button[text()=' Delete Selected ']"));
		System.out.println("Deleted button is displayed: "+deleteBtn.isDisplayed());
		
		deleteBtn.click();
		
		Thread.sleep(2000);
		
		WebElement popMsg = driver.findElement(By.xpath("//div[@role='document']//p[contains(@class,'--card-body')]"));
		System.out.println(popMsg.getText());
		
		WebElement popUpDeleteBtn = driver.findElement(By.xpath("//div[@role='document']//button[text()=' Yes, Delete ']"));
		popUpDeleteBtn.click();
//		
//		WebElement successFullDeleteMsg=driver.findElement(By.xpath("//div[@id='oxd-toaster_1']//div[contains(@class,'oxd-toast-start')]//p[2]"));
//		if(successFullDeleteMsg.getText().contains("Successfully Deleted")) {
//			System.out.println("User Deleted successfully: "+successFullDeleteMsg.getText());
//		}
//		else {
//			System.out.println("User not Deleted successfully");
//		}
		
		if(driver.findElements(By.xpath("//div[@role='table']//div[@class='oxd-table-card']//div[contains(text(),'ashish.sahu')]")).isEmpty()) {
			System.out.println("User is Deleted");
		}else {
			System.out.println("User is not deleted");
		}
		
		WebElement serProfiledDrpDn = driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']"));
		serProfiledDrpDn.click();
		
		WebElement logOutBtn =driver.findElement(By.xpath("//a[text()='Logout']"));
		logOutBtn.click();
		
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
