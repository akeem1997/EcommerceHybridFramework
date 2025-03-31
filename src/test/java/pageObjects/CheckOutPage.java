package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutPage extends BasePage {
	
	public CheckOutPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//h2[normalize-space()='Address Details']") WebElement AddressDetail;
	@FindBy(xpath = "//h2[normalize-space()='Review Your Order']") WebElement ReviewYourOrder;
	@FindBy(xpath = "//textarea[@name='message']") WebElement AddComment;
	@FindBy(xpath = "//a[normalize-space()='Place Order']") WebElement PlaceOrder;
	
	
	public boolean AddressDetailIsDisplayed() {
		try {
			return(AddressDetail.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
	
	public boolean ReviewYourOrderIsDisplayed() {
		try {
			return(ReviewYourOrder.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
	
	public void EnterAddComment(String comm) {
		AddComment.sendKeys(comm);
	}
	public void clickPlaceOrder() {
		PlaceOrder.click();
	}

}
