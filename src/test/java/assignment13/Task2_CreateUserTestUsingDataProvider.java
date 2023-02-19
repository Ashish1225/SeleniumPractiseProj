package assignment13;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Task2_CreateUserTestUsingDataProvider extends BaseClass {

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

	@Test(priority = 6,dataProvider ="supplier")
	public void createUserTest(String name,String email, String password, String interestCourse, String gender,String state) {
		loginPage = registerPage.enterRegisterUserCredentials(name,email,password,interestCourse,gender,state);

		boolean statusOfSignInLabel = loginPage.verifySignInLabel();
		assertTrue(statusOfSignInLabel, "Sign In label is not displayed after User created");
		registerPage = loginPage.clickOnSignUpLink();
	}

	@DataProvider(name = "supplier")
	public Object[][] dataSupplier() {
		Object[][] data = { { "Aman", "aman1@gmail.com", "198664", "Web Dev", "Male", "Telangana" },
				{ "Kritika", "kritika@gmail.com", "198082", "Selenium", "Female", "Uttar Pradesh" },
				{ "Priyanka", "priya@gmail.com", "198306", "DevOps", "Female", "Uttarakhand" },
				{ "Sanjay", "sanju@gmail.com", "576886", "Machine Learning", "Male", "Tripura" },
				{ "Praveen", "praveen@gmail.com", "388869", "Testing", "Male", "Sikkim" } };
		
		return data;
	}

}
