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
	@FindBy(xpath = "//div[@id='accordian']") WebElement CategoriesDisplayed;
	@FindBy(xpath = "//a[normalize-space()='Women']") WebElement Women;
	@FindBy(xpath = "//a[normalize-space()='Men']") WebElement Men;
	@FindBy(xpath = "//a[normalize-space()='Kids']") WebElement Kids;
	@FindBy(xpath = "//img[@alt='Website for automation practice']") WebElement AutomationExercise;
	@FindBy(xpath = "//h2[normalize-space()='Subscription']") WebElement Subscription;
	@FindBy(xpath = "//input[@id='susbscribe_email']") WebElement SubscriptionTextbox;
	@FindBy(xpath = "//i[@class='fa fa-arrow-circle-o-right']") WebElement EnterSubscription;
	@FindBy(xpath = "//div[@class='alert-success alert']") WebElement SuccessAlert;
	
	
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
	public boolean CategoryIsDisplayed() {
		try {
			return(CategoriesDisplayed.isDisplayed());
		} catch (Exception e) {
			return false;


		}
		
	}
	
	public void clickWomen() {
		Women.click();
	}
	
	public void clickMen() {
		Men.click();
	}
	
	public void clickKids() {
		Kids.click();
	}
	public boolean automationExerciseisDisplayed() {
		try {
			return(AutomationExercise.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
	public String verifySubscription() {
		try {
			return(Subscription.getText());
		} catch (Exception e) {
			return(e.getMessage());
		}
	}
	
	public void enterTextIntoSubscription(String sb) {
		SubscriptionTextbox.sendKeys(sb);
	}
	public void clickSub() {
		EnterSubscription.click();
	}
	public boolean AlertSuccessfulIsDisplayed() {
		try {
			return(SuccessAlert.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}

	

}
