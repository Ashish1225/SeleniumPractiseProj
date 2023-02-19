package assignment13;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class Task3_CreateUserTestUsingDataProviderWithExcel extends BaseClass {

	HomePage homePage;
	LoginPage loginPage;
	RegisterPage registerPage;

	@Test(priority = 1)
	public void verifyLogoTest() {
		homePage = new HomePage(driver);
		boolean statusOfLogo = homePage.verifyLogo();
		assertTrue(statusOfLogo, "Logo is not displayed");
	}

	@Test(priority = 2)
	public void verifyPractiseLinkTest() {
		boolean statusOfPractiseLink = homePage.verifyPractiseLink();
		assertTrue(statusOfPractiseLink, "Practise Link is not displayed");
	}

	@Test(priority = 3)
	public void clickLogInTest() {
		// loginPage = new LoginPage(driver);
		loginPage = homePage.clickLioginLink();
	}

	@Test(priority = 4)
	public void verifySigInLabelTest() {
		boolean statusOfSignInLabel = loginPage.verifySignInLabel();
		assertTrue(statusOfSignInLabel, "Sign In label is not displayed");
	}

	@Test(priority = 5)
	public void clickOnSignUpLinkAndVerifySignUpLabelTest() {
		registerPage = loginPage.clickOnSignUpLink();
		boolean statusOfSignUpLabel = registerPage.verifySignUpLabel();
		assertTrue(statusOfSignUpLabel, "Sign Up label is not displayed");
	}

	@Test(priority = 6,dataProvider = "getRegisterData",dataProviderClass = CustomDataProvider.class)
	public void createUserTest(String Name,String Email, String Password, String interestCourse, String Gender,String State) {
		loginPage = registerPage.enterRegisterUserCredentials(Name,Email,Password,interestCourse,Gender,State);

		boolean statusOfSignInLabel = loginPage.verifySignInLabel();
		assertTrue(statusOfSignInLabel, "Sign In label is not displayed after User created");
		registerPage = loginPage.clickOnSignUpLink();
	}
}
