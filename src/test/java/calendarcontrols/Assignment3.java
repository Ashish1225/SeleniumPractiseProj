package calendarcontrols;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://ineuron-courses.vercel.app/login");

		driver.manage().window().maximize();

		driver.findElement(By.id("email1")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.id("password1")).sendKeys("ineuron");

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		Thread.sleep(3000);

		WebElement manageText = driver.findElement(By.xpath("//span[text()='Manage']"));
		Actions action = new Actions(driver);
		action.moveToElement(manageText).perform();

		driver.findElement(By.xpath("//span[text()='Manage Courses']")).click();
		
		Thread.sleep(3000);

		WebElement manageCourseText = driver.findElement(By.xpath("//h1[text()='Manage Courses']"));
		System.out.println(manageCourseText.getText());
		action.moveToElement(manageCourseText).perform();

//		WebElement courseName = driver.findElement(By.xpath("//td[text()='Java Se']"));
//		if(courseName.getText().equals("Java Se")) {
//			System.out.println("Course Name is :"+courseName.getText());
//			WebElement check=driver.findElement(By.xpath("//td[text()='Java Se']/preceding-sibling::td/input"));
//			action.doubleClick(check).build().perform();
//		}
//		
		
		List<WebElement> courseList = driver.findElements(By.xpath("//tbody//td[2]"));
		for (WebElement ele : courseList) {
			if (ele.getText().equals("Java Se")) {
				String course = ele.getText();
				System.out.println("Course is Added.." + course);

				WebElement check=driver.findElement(By.xpath("//td[text()='"+course+"']/preceding-sibling::td/input"));
				action.doubleClick(check).build().perform();
				
				Thread.sleep(3000);
				break;
			}
		}
		//List<WebElement> courseList1 = driver.findElements(By.xpath("//tbody//td[2]"));
		boolean flag = false;
		for (WebElement ele1 : courseList) {
			if (ele1.getText().equals("Java Se")) {
				flag = true;
			}
		}
		if (flag) {
			System.out.println("Course is Present");
		} else {
			System.out.println("Course is deleted");
		}
		
		

		
	}
}
