package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import testBase.BaseClass;

public class ViewCategoryProduct  extends BaseClass{
	
	@Test(priority = 1)
	public void VerifyCategoryProduct() throws Exception {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000);");
		
		HomePage hp = new HomePage(driver);
		boolean dis = hp.CategoryIsDisplayed();
		Assert.assertEquals(dis, true);
		
		hp.clickWomen();
		
		List<WebElement> wom = driver.findElements(By.xpath("//div[@id='Women']//li"));
		for (WebElement web : wom) {
			String we = web.getText();
			System.out.println(we);
			Thread.sleep(2000);
			if(we.equals("TOPS")) {
				
				web.click();
				break;
			}
		}
		
		Thread.sleep(5000);
	}

}
