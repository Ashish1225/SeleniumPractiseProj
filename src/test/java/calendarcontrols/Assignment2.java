package calendarcontrols;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment2 {

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

		WebElement manageCourseText = driver.findElement(By.xpath("//h1[text()='Manage Courses']"));
		System.out.println(manageCourseText.getText());
		action.moveToElement(manageCourseText).perform();

		driver.findElement(By.xpath("//button[text()='Add New Course ']")).click();

		driver.findElement(By.id("thumbnail")).sendKeys("C:\\Users\\ashu2\\OneDrive\\Desktop\\abc\\imgae1.png");

		WebElement courseName = driver.findElement(By.xpath("//input[@id='name']"));
		courseName.sendKeys("Java Se");

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
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		List<WebElement> courseList = driver.findElements(By.xpath("//tbody//td[2]"));
		List<WebElement> allCheckBoxes = driver.findElements(By.xpath("//td//input[@type='checkbox']"));
		List<WebElement> allDeleteBtns = driver.findElements(By.xpath("//button[text()='Delete']"));
		System.out.println("Total numbers of Course available :" + courseList.size());
		int count = 0;
		for(int i=0;i<courseList.size();i++) {
			if(courseList.get(i).getText().equals("Java Se")) {
				System.out.println("Course is Added.." + courseList.get(i).getText());
				count = count+i;
				for(int j =0;j<allCheckBoxes.size();j++) {
					if(j==count) {
						System.out.println("count of check box :"+j);
						js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
						allCheckBoxes.get(j).click();
						for(int k=0;k<allDeleteBtns.size();k++) {
							if(k==count) {
								System.out.println("count of delete :"+k);
								allDeleteBtns.get(k).click();
								break;
							}
						}
						break;
					}
				}
				break;
			}
		}
		
		
		/*
		
		for (WebElement ele : courseList) {
			if (ele.getText().equals("Java Se")) {
				System.out.println("Course is Added.." + ele.getText());

				WebElement checkBox = driver.findElement(By.xpath("//td[2]/preceding-sibling::td/input"));

				checkBox.click();
				WebElement deleteButton = checkBox.findElement(By.xpath("//parent::td/following-sibling::td/button"));
				deleteButton.click();
				driver.findElement(
						By.xpath("//td[2]/preceding-sibling::td/input//parent::td/following-sibling::td/button"))
						.click();
				Thread.sleep(3000);
				break;
			}
		}
		*/
		
		List<WebElement> courseList1 = driver.findElements(By.xpath("//tbody//td[2]"));
		boolean flag = false;
		for (WebElement ele1 : courseList1) {
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
