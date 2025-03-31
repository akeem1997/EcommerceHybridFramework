package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CartPage;
import pageObjects.HomePage;
import testBase.BaseClass;

public class RemoveProductFromCart extends BaseClass{
	
	@Test(priority = 1)
	public void verifyProductRemovedFromCart() throws Exception {
		
		HomePage hp = new HomePage(driver);
		hp.clickProducts();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");
		
		
		WebElement addToCart =driver.findElement(By.xpath("//body/section/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[2]/div[1]/div[1]/div[1]/a[1]"));
		addToCart.click();
		
		WebElement cont = driver.findElement(By.xpath("//button[normalize-space()='Continue Shopping']"));
		cont.click();
		
		hp.clickCart();
		
		CartPage cp = new CartPage(driver);
		cp.clickDelete();
		
		Thread.sleep(1000);
		
		String empt = cp.cartIsEmptyText();
		
		Assert.assertEquals(empt,"Cart is empty!");
		
	}

}
