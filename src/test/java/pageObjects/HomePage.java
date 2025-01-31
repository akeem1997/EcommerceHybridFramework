package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//a[@href='/products']") WebElement Products;
	@FindBy(xpath = "//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[3]/a[1]") WebElement Cart;
	@FindBy(xpath = "//a[normalize-space()='Signup / Login']") WebElement SignupLogin;
	@FindBy(xpath = "//a[normalize-space()='Contact us']") WebElement ContactUs;
	
	
	public void clickProducts() {
		Products.click();
	}
	
	public void clickCart() {
		Cart.click();
	}
	
	public void clickSignupLogin() {
		SignupLogin.click();
	}
	
	public void ClickContactUs() {
		ContactUs.click();
	}
	

}
