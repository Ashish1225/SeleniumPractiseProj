package assignment12;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import helper.Utility;

public class TaskInTestNG {

	WebDriver driver;
	
	
	@Parameters("browser")
	@BeforeClass
	public void launchBrowser(String browserName) {
		
		if (browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

		driver.get("https://ineuron-courses.vercel.app/login");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
	@Parameters("getCourse")
	@Test
	public void testOne(String enterCourseName) {
		driver.findElement(By.id("email1")).sendKeys("ineuron@ineuron.ai");
		driver.findElement(By.id("password1")).sendKeys("ineuron");

		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		// Thread.sleep(3000);

		WebElement manageText = driver.findElement(By.xpath("//span[text()='Manage']"));

		Actions action = new Actions(driver);
		action.moveToElement(manageText).perform();

		driver.findElement(By.xpath("//span[text()='Manage Courses']")).click();

		WebElement manageCourseText = driver.findElement(By.xpath("//h1[text()='Manage Courses']"));

		Reporter.log(manageCourseText.getText(), true);
		action.moveToElement(manageCourseText).perform();

		driver.findElement(By.xpath("//button[text()='Add New Course ']")).click();

		driver.findElement(By.id("thumbnail")).sendKeys("C:\\Users\\ashu2\\OneDrive\\Desktop\\abc\\imgae1.png");

		WebElement courseName = driver.findElement(By.xpath("//input[@id='name']"));
		courseName.sendKeys(enterCourseName);

		WebElement descriptionText = driver.findElement(By.id("description"));
		descriptionText.sendKeys("I am Learning Java Selenium with Mukesh Otwani");

		WebElement instructorName = driver.findElement(By.name("instructorName"));
		instructorName.sendKeys("Mukesh Otwani");

		WebElement coursePrice = driver.findElement(By.id("price"));
		coursePrice.sendKeys("5000");

		WebElement startDate = driver.findElement(By.name("startDate"));
		startDate.click();
		List<WebElement> allStartDates = driver
				.findElements(By.xpath("//div[@role='listbox']//div[@aria-disabled='false']"));

		for (WebElement strtDate : allStartDates) {
			if (strtDate.getText().equals("22")) {
				strtDate.click();
				break;
			}
		}
		WebElement endDate = driver.findElement(By.name("endDate"));
		endDate.click();

		List<WebElement> allEndDates = driver
				.findElements(By.xpath("//div[@role='listbox']//div[contains(@aria-label,'January')]"));

		for (WebElement lastDate : allEndDates) {
			if (lastDate.getText().equals("28")) {
				lastDate.click();
				break;
			}
		}

		driver.findElement(By.xpath("//div[text()='Select Category']")).click();

		List<WebElement> listCategories = driver.findElements(By.xpath("//div[contains(@class,'menu-items')]/button"));
		for (WebElement list : listCategories) {
			if (list.getText().equals("Testing")) {
				list.click();
				break;
			}
		}

		driver.findElement(By.xpath("//button[text()='Save']")).click();

		Utility.waitForSeconds(3);

		List<WebElement> courseList = driver.findElements(By.xpath("//tbody//td[2]"));
		boolean isPresent = false;
		for (WebElement ele1 : courseList) {
			if (ele1.getText().equals(enterCourseName)) {
				String course = ele1.getText();
				isPresent = driver.findElement(By.xpath("//td[text()='"+course+"']")).isDisplayed();
				isPresent = true;
				break;
			}
		}
		Assert.assertTrue(isPresent, "Course is not present");
		
		for (WebElement ele : courseList) {
			if (ele.getText().equals(enterCourseName)) {
				String course = ele.getText();
				Reporter.log("Course is Added.." + course, true);
				
				

				WebElement check = driver
						.findElement(By.xpath("//td[text()='" + course + "']/preceding-sibling::td/input"));
				action.doubleClick(check).build().perform();
				WebElement deleteBtn = driver.findElement(By.xpath("//td[text()='" + course
						+ "']/preceding-sibling::td/input/parent::td//following-sibling::td/button"));
				JavascriptExecutor js = (JavascriptExecutor) driver;
				try {
					deleteBtn.click();
				} catch (Exception e) {
					System.out.println("Webelement is not clickable delete using javascript");
					js.executeScript("documents[0].click()", deleteBtn);
				}

				// Thread.sleep(3000);

				Utility.waitForSeconds(3);
				break;
			}
		}
		List<WebElement> courseList1 = driver.findElements(By.xpath("//tbody//td[2]"));
		boolean isPresentAfterDelete =false;
		for (WebElement ele1 : courseList1) {
			if (ele1.getText().equals(enterCourseName)) {
				String course = ele1.getText();
				isPresentAfterDelete = driver.findElement(By.xpath("//td[text()='"+course+"']")).isDisplayed();
				isPresentAfterDelete = true;
				break;
			}
		}
		
		Assert.assertFalse(isPresentAfterDelete, "Course is not deleted yet..");
		Utility.waitForSeconds(3);
		driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).click();
		Utility.waitForSeconds(3);
	}
}
