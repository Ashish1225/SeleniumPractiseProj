package assignment13;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//a[normalize-space()='Practise']")
	WebElement practiseLink;
	
	@FindBy(xpath = "//h1[normalize-space()='iNeuron Courses']")
	WebElement ineuroneLogo;
	
	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	WebElement loginLink;
	
	
	public boolean verifyLogo() {
		boolean status = ineuroneLogo.isDisplayed();
		return status;
	}
	
	public boolean verifyPractiseLink() {
		boolean status=practiseLink.isDisplayed();
		return status;
	}
	
	public LoginPage clickLioginLink() {
		loginLink.click();
		return new LoginPage(driver);
	}

}
