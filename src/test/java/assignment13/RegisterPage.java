package assignment13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {

	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Sign Up']")
	WebElement signUpLabelText;

	@FindBy(id = "name")
	WebElement nameField;

	@FindBy(id = "email")
	WebElement emailField;

	@FindBy(id = "password")
	WebElement passwordField;

	@FindBy(xpath = "//select[@id='state']")
	WebElement stateDropDown;

	@FindBy(xpath = "//button[@class='submit-btn']")
	WebElement signUpBtn;

	// //div[@class='interests-div']/div/label[text()='DevOps']/preceding-sibling::input[@type='checkbox']

	// //div[@class='gender-div']/label[text()='Male']/preceding-sibling::input

	public boolean verifySignUpLabel() {
		boolean status = signUpLabelText.isDisplayed();
		return status;
	}

	public LoginPage enterRegisterUserCredentials(String enterName, String enterEmail, String enterPassword,
			String interest, String gender, String state) {
		nameField.sendKeys(enterName);
		emailField.sendKeys(enterEmail);
		passwordField.sendKeys(enterPassword);
		driver.findElement(By.xpath("//div[@class='interests-div']/div/label[text()='" + interest
				+ "']/preceding-sibling::input[@type='checkbox']")).click();
		driver.findElement(
				By.xpath("//div[@class='gender-div']/label[text()='" + gender + "']/preceding-sibling::input")).click();
		Select select = new Select(stateDropDown);
		select.selectByVisibleText(state);
		try {
			signUpBtn.click();
		} catch (Exception e) {
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click()", signUpBtn);
		}

		return new LoginPage(driver);

	}

}
