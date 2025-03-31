package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.productPage;
import testBase.BaseClass;

public class AddProductInCartsTest extends BaseClass{
	
	@Test(priority = 1)
	public void AddProductInCarts() throws Exception {
		HomePage hp = new HomePage(driver);
		hp.clickProducts();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,600);");
		
		productPage pp = new productPage(driver);
		pp.clickViewProduct();
		pp.clickAddToCart();
		//Thread.sleep(5000);
		//pp.clickBlueTop();
		pp.clickContinueShopping();
		
		hp.clickProducts();
		JavascriptExecutor jsp = (JavascriptExecutor) driver;
		jsp.executeScript("window.scrollBy(0,600);");
		
		pp.clickAddToCartMenTshirt();
		pp.clickAddToCart();
		pp.clickContinueShopping();
		
		hp.clickCart();
		
	
		
		String BlueTop =driver.findElement(By.xpath("//a[normalize-space()='Blue Top']")).getText();
		Assert.assertEquals(BlueTop, "Blue Top");
		
		String MensTshirt =driver.findElement(By.xpath("//a[normalize-space()='Men Tshirt']")).getText();
		Assert.assertEquals(MensTshirt, "Men Tshirt");
		
		
		
	}

}
