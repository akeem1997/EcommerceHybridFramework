package testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.productPage;
import testBase.BaseClass;

public class SearchProduct extends BaseClass {
	
	@Test(priority = 1)
	public void testSearchProduct()  {
		String homepage = driver.getTitle();
		Assert.assertEquals(homepage, "Automation Exercise");
		HomePage hp = new HomePage(driver);
		hp.clickProducts();
		String productP =driver.getTitle();
		Assert.assertEquals(productP, "Automation Exercise - All Products");
		productPage pp = new productPage(driver);
		pp.enterSearchProduct("blue top");
		pp.clickSearch();
		boolean SearchedProduct =driver.findElement(By.xpath("//h2[normalize-space()='Searched Products']")).isDisplayed();
		Assert.assertEquals(SearchedProduct, true);
		
		String bt =driver.findElement(By.xpath("//div[@class='productinfo text-center']//p[contains(text(),'Blue Top')]")).getText();
		Assert.assertEquals(bt, "Blue Top");
		
		
	}

}
