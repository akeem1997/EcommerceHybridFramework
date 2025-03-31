package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
	
	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//b[normalize-space()='Cart is empty!']") WebElement CartIsEmpty;
	@FindBy(xpath = "//u[normalize-space()='here']") WebElement Here;
	@FindBy(xpath = "//i[@class='fa fa-times']") WebElement delete;
	@FindBy(xpath = "//li[@class='active']") WebElement CartPageDisplayed;
	@FindBy(xpath = "//a[normalize-space()='Proceed To Checkout']") WebElement ProceedToCheckOut;
	@FindBy(xpath = "//u[normalize-space()='Register / Login']") WebElement RegisterLogin;
	
	
	
	
	public void clickHere() {
		Here.click();
	}
	
	public String cartIsEmptyText() {
		try {
			return(CartIsEmpty.getText());
		} catch (Exception e) {
			return(e.getMessage());
		}
		
	}
	
	public void clickDelete() {
		delete.click();
	}
	public boolean cartPageIsDisplayed() {
		try {
			return(CartPageDisplayed.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
	public void clickProceedToCheckOut() {
		ProceedToCheckOut.click();
	}
	
	public void clickRegisterLogin() {
		RegisterLogin.click();
	}

}
