package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.CheckOutPage;
import pageObjects.EnterAccountInformation;
import pageObjects.HomePage;
import pageObjects.PaymentPage;
import pageObjects.SignUpLogInPage;
import pageObjects.productPage;
import testBase.BaseClass;

public class RegisterWhileCheckOut extends BaseClass {
	
	@Test
	public void verify_Register_while_checkedout() throws Exception {
		
		//HomePage
		HomePage hp = new HomePage(driver);
		boolean homePage = hp.automationExerciseisDisplayed();
		Assert.assertEquals(homePage, true);
        hp.clickProducts();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600);");
		
		//productPage
		productPage pp = new productPage(driver);
		pp.clickViewProduct();
		pp.clickAddToCart();
		pp.clickContinueShopping();
		
		hp.clickCart();
		
		CartPage cp = new CartPage(driver);
		Boolean cartPage = cp.cartPageIsDisplayed();
		Assert.assertEquals(cartPage, true);
		cp.clickProceedToCheckOut();
		cp.clickRegisterLogin();
		
		
		
		SignUpLogInPage slp = new SignUpLogInPage(driver);
		slp.EnterSignUpName("John Paul");
		slp.EnterEmailAddress("JohnPaul1999@gmail.com");
		slp.clickSignUp();
		
		EnterAccountInformation ea = new EnterAccountInformation(driver);
		ea.clickMr();
		
		ea.enterPassword("JohnPaul1");
		JavascriptExecutor jst = (JavascriptExecutor) driver;
		jst.executeScript("window.scrollBy(0,1000);");
		ea.enterDay("4");
		
		ea.enterMonth("March");
		ea.enterYear("1996");
		ea.clickSignUpForNewsLetter();
		ea.clickReceiveSpecialOfferFromOurPartner();
		ea.enterFirstName("John");
		ea.enterLastName("Paul");
		ea.enterCompany("Omega");
		ea.enterAddress("5322 matt avenue north");
		ea.enterCountry("United States");
		ea.enterState("Texas");
		ea.enterCity("Brooklyn");
		ea.enterZipCode("55432");
		ea.enterMobileNumber("6212123344");
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		jss.executeScript("window.scrollBy(0,100);");
		Thread.sleep(2000);
		ea.clickCreateAccount();
		Boolean acct =ea.AccountCreatedDisplay();
		Assert.assertEquals(acct, true);
		ea.clickContinue();
		String text =driver.findElement(By.xpath("//li[10]//a[1]")).getText();
		Assert.assertEquals(text, "Logged in as John Paul");
		hp.clickCart();
		cp.clickProceedToCheckOut();
		
		CheckOutPage cop = new CheckOutPage(driver);
		boolean add = cop.AddressDetailIsDisplayed();
		Assert.assertEquals(add, true);
		
		boolean ryo = cop.ReviewYourOrderIsDisplayed();
		Assert.assertEquals(ryo, true);
		
		cop.EnterAddComment("Quality over quantity.");
		cop.clickPlaceOrder();
		
		PaymentPage py = new PaymentPage(driver);
		boolean pd =py.PaymentPageIsDisplayed();
		Assert.assertEquals(pd, true);
		
		py.enterNameOnCard("John Paul Doe");
		py.enterCardNumber("1234567890");
		py.entercvc("232");
		py.enterExpirationMonth("09");
		py.enterExpirationYear("2029");
		py.clickPayAndConfirmOrder();
		
		//boolean osd = py.orderSuccessfulDisplayed();
		//Assert.assertEquals(osd, true);
		
		Thread.sleep(2000);
		ea.clickDeleteAccount();
		
		
		
		
		boolean delete = ea.AccountDeletedIsDisplayed();
		Assert.assertEquals(delete, true);
	}

}
