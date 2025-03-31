package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage {
	
	public ContactUsPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//h2[normalize-space()='Get In Touch']") WebElement GetInTouch;
	@FindBy(xpath = "//input[@placeholder='Name']") WebElement Name;
	@FindBy(xpath = "//input[@placeholder='Email']") WebElement Email;
	@FindBy(xpath = "//input[@placeholder='Subject']") WebElement Subject;
	@FindBy(xpath = "//textarea[@id='message']") WebElement YourMessageHere;
	@FindBy(xpath = "//input[@name='submit']") WebElement Submit;
	@FindBy(xpath = "//div[@class='status alert alert-success']") WebElement Success;
	@FindBy(xpath = "//span[normalize-space()='Home']") WebElement Home;
	
	
	
	public boolean GetInTouchIsDisplayed() {
		try {
			return(GetInTouch.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
	
	public void enterName(String N) {
		Name.sendKeys(N);
	}
	
	public void enterEmail(String M) {
		Email.sendKeys(M);
	}
	
	public void enterSubject(String S) {
		Subject.sendKeys(S);
	}
	
	public void enterYourMessageHere(String Y) {
		YourMessageHere.sendKeys(Y);
	}
	
	public void clickSubmit() {
		Submit.click();
	}
	
	public boolean successIsDisplayed() {
		try {
			return(Success.isDisplayed());
		} catch (Exception e) {
			return false;
		} 
	}
	
	public void clickHome() {
		Home.click();
	}

}
