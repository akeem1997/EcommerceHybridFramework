package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.EnterAccountInformation;
import pageObjects.HomePage;
import pageObjects.SignUpLogInPage;
import testBase.BaseClass;

public class RegisterUser extends BaseClass {
	
	@Test(priority = 1)
	public void RegisterUserInfo() throws InterruptedException {
		HomePage hp = new HomePage(driver);
		hp.clickSignupLogin();
		
		SignUpLogInPage sp = new SignUpLogInPage(driver);
		boolean dis = sp.newUserSignUpDisplay();
		Assert.assertEquals(dis, true);
		
		sp.EnterSignUpName("Atinuke Olalere");
		sp.EnterEmailAddress("wisdomolalere@yahoo.com");
		sp.clickSignUp();
		
		EnterAccountInformation ea = new EnterAccountInformation(driver);
		ea.clickMr();
		
		ea.enterPassword("AtinukeOlalere123");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");
		ea.enterDay("4");
		
		ea.enterMonth("April");
		ea.enterYear("2002");
		ea.clickSignUpForNewsLetter();
		ea.clickReceiveSpecialOfferFromOurPartner();
		ea.enterFirstName("Atinuke");
		ea.enterLastName("Olalere");
		ea.enterCompany("Allawee");
		ea.enterAddress("5322 matt avenue north");
		ea.enterCountry("United States");
		ea.enterState("Texas");
		ea.enterCity("Brooklyn");
		ea.enterZipCode("55432");
		ea.enterMobileNumber("6212346342");
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,100);");
		Thread.sleep(2000);
		ea.clickCreateAccount();
		Boolean acct =ea.AccountCreatedDisplay();
		Assert.assertEquals(acct, true);
		ea.clickContinue();
		String text =driver.findElement(By.xpath("//li[10]//a[1]")).getText();
		Assert.assertEquals(text, "Logged in as Atinuke Olalere");
		ea.clickDeleteAccount();
		boolean delete = ea.AccountDeletedIsDisplayed();
		Assert.assertEquals(delete, true);
		
	}

}
