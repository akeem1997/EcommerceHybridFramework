package testCases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class verifySubscriptionInHomePage extends BaseClass{
	
	
	@Test(priority = 1)
	public void verifySubInHomepage() throws Exception {
		HomePage hp = new HomePage(driver);
		boolean HomePageVisible = hp.automationExerciseisDisplayed();
		Assert.assertEquals(HomePageVisible, true);
		//Thread.sleep(3000);;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");
		String sub =hp.verifySubscription();
		Assert.assertEquals(sub, "SUBSCRIPTION");
		hp.enterTextIntoSubscription("wisdomolalere@yahoo.com");
		hp.clickSub();
		Boolean success =hp.AlertSuccessfulIsDisplayed();
		Assert.assertEquals(success, true);
	}

}
