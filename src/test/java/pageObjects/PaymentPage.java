package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaymentPage extends BasePage {
	public PaymentPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//li[@class='active']") WebElement PaymentPageDisplayed;
	@FindBy(xpath = "//input[@name='name_on_card']") WebElement NameOnCard;
	@FindBy(xpath = "//input[@name='card_number']") WebElement CardNumber;
	@FindBy(xpath = "//input[@placeholder='ex. 311']") WebElement cvc;
	@FindBy(xpath = "//input[@placeholder='MM']") WebElement ExpirationMonth;
	@FindBy(xpath = "//input[@placeholder='YYYY']") WebElement ExpirationYear;
	@FindBy(xpath = "//button[@id='submit']") WebElement PayAndConfirmOrder;
	@FindBy(xpath = "//div[contains(text(),'Your order has been placed successfully!')]") WebElement OrderSuccessful;
	
	public boolean PaymentPageIsDisplayed() {
		try {
			return(PaymentPageDisplayed.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
	
	public void enterNameOnCard(String n) {
		NameOnCard.sendKeys(n);
	}
	
	public void enterCardNumber(String c) {
		CardNumber.sendKeys(c);
	}
	
	public void entercvc(String cv) {
		cvc.sendKeys(cv);
	}
	
	public void enterExpirationMonth(String e) {
		ExpirationMonth.sendKeys(e);
	}
	
	public void enterExpirationYear(String y) {
		ExpirationYear.sendKeys(y);
	}
	
	public void clickPayAndConfirmOrder() {
		PayAndConfirmOrder.click();
	}
	
	public boolean orderSuccessfulDisplayed() {
		try {
			return(OrderSuccessful.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
	
	

}
