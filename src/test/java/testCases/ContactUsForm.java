package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ContactUsPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class ContactUsForm extends BaseClass {
	
	@Test
	public void verify_contactUs_Form() {
		String homepage = driver.getTitle();
		Assert.assertEquals(homepage, "Automation Exercise");
		
		HomePage hp = new HomePage(driver);
		hp.ClickContactUs();
		
		
		ContactUsPage cup = new ContactUsPage(driver);
		boolean git = cup.GetInTouchIsDisplayed();
		Assert.assertEquals(git, true);
		
		cup.enterName("Mike Morris");
		cup.enterEmail("MikeMorris@yahoo.com");
		cup.enterSubject("Focused");
		cup.enterYourMessageHere("Validity is the essence of positivity");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800);");
		cup.clickSubmit();
		
		
		driver.switchTo().alert().accept();
		
		
		boolean succcess = cup.successIsDisplayed();
		Assert.assertEquals(succcess, true);
		
		cup.clickHome();
		
		String homepage1 = driver.getTitle();
		Assert.assertEquals(homepage1, "Automation Exercise");
		
		
	}

}
