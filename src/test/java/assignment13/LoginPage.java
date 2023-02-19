package assignment13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//h2[normalize-space()='Sign In']")
	WebElement signInLabel;
	
	@FindBy(xpath = "//a[text()='New user? Signup']")
	WebElement signupLinkText;
	
	
	public boolean verifySignInLabel() {
		boolean status = signInLabel.isDisplayed();
		return status;
	}
	
	public RegisterPage clickOnSignUpLink() {
		signupLinkText.click();
		return new RegisterPage(driver);
	}

}
