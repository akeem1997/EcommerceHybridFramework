package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpLogInPage extends BasePage {
	
	public SignUpLogInPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@data-qa='login-email']") WebElement LogInEmailAdress;
	@FindBy(xpath = "//input[@placeholder='Password']") WebElement LogInPassword;
	@FindBy(xpath = "//button[normalize-space()='Login']") WebElement Login;
	@FindBy(xpath = "//input[@placeholder='Name']") WebElement SignUpName;
	@FindBy(xpath = "//input[@data-qa='signup-email']") WebElement EmailAddress;
	@FindBy(xpath = "//button[normalize-space()='Signup']") WebElement SignUp;
	@FindBy(xpath = "//h2[normalize-space()='New User Signup!']") WebElement NewUserSignUp;
	
	
	public void enterLoginEmail(String mail) {
		LogInEmailAdress.sendKeys(mail);
	}
	
	public void enterLogInPassword(String password) {
		LogInPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		Login.click();
	}
	
	public void EnterSignUpName(String sname) {
		SignUpName.sendKeys(sname);
	}
	
	public void EnterEmailAddress(String Eadd) {
		EmailAddress.sendKeys(Eadd);
	}
	
	public void clickSignUp() {
		SignUp.click();
	}
	public boolean newUserSignUpDisplay() {
		try {
			return (NewUserSignUp.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
	
	
}
