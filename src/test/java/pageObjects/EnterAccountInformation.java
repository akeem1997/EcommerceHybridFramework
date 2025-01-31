package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EnterAccountInformation extends BasePage {
	
	public EnterAccountInformation(WebDriver driver) {
		super(driver);
	}
	
	
	
	@FindBy(xpath = "//input[@id='id_gender1']") WebElement Mr;
	@FindBy(xpath = "//input[@id='id_gender2']") WebElement Mrs;
	@FindBy(xpath = "//input[@id='name']") WebElement Name;
	@FindBy(xpath = "//input[@id='email']") WebElement Email;
	@FindBy(xpath = "//input[@id='password']") WebElement Password;
	@FindBy(xpath = "//select[@id='days']") WebElement Day;
	@FindBy(xpath = "//select[@id='months']") WebElement Month;
	@FindBy(xpath = "//select[@id='years']") WebElement Year;
	@FindBy(xpath = "//input[@id='newsletter']") WebElement SignUpForNewsLetter;
	@FindBy(xpath = "//input[@id='optin']") WebElement ReceiveSpecialOffersFromOurPartner;
	@FindBy(xpath = "//input[@id='first_name']") WebElement FirstName;
	@FindBy(xpath = "//input[@id='last_name']") WebElement LastName;
	@FindBy(xpath = "//input[@id='company']") WebElement Company;
	@FindBy(xpath = "//input[@id='address1']") WebElement Address;
	@FindBy(xpath = "//input[@id='address2']") WebElement Address2;
	@FindBy(xpath = "//select[@id='country']") WebElement Country;
	@FindBy(xpath = "//input[@id='state']") WebElement State;
	@FindBy(xpath = "//input[@id='city']") WebElement City;
	@FindBy(xpath = "//input[@id='zipcode']") WebElement ZipCode;
	@FindBy(xpath = "//input[@id='mobile_number']") WebElement MobileNumber;
	@FindBy(xpath = "//button[normalize-space()='Create Account']") WebElement CreateAccount;
	@FindBy(xpath = "//b[normalize-space()='Enter Account Information']") WebElement EnterAccountInformation;
	@FindBy(xpath = "//b[normalize-space()='Account Created!']") WebElement AccountCreated;
	@FindBy(xpath = "//a[normalize-space()='Continue']") WebElement Continue;
	@FindBy(xpath = "//a[normalize-space()='Delete Account']") WebElement deleteAccount;
	@FindBy(xpath = "//b[normalize-space()='Account Deleted!']") WebElement AccountDeleted;
	
	
	public void clickMr() {
		Mr.click();
	}
	
	public void clickMrs() {
		Mrs.click();
	}
	
	public void enterName(String nm) {
		Name.sendKeys(nm);
	}
	public void enterEmail(String ml) {
		Email.sendKeys(ml);
	}
	public void enterPassword(String ps) {
		Password.sendKeys(ps);
	}
	
	public void enterDay(String d) {
		Select s = new Select(Day);
		s.selectByVisibleText(d);
	}
	public void enterMonth(String m) {
		Select s = new Select(Month);
		s.selectByVisibleText(m);
	}
	public void enterYear(String y) {
		Select s = new Select(Year);
		s.selectByVisibleText(y);
	}
	public void clickSignUpForNewsLetter() {
		SignUpForNewsLetter.click();
	}
	public void clickReceiveSpecialOfferFromOurPartner() {
		ReceiveSpecialOffersFromOurPartner.click();
	}
	public void enterFirstName(String fn) {
		FirstName.sendKeys(fn);
	}
	
	public void enterLastName(String ln) {
		LastName.sendKeys(ln);
	}
	
	public void enterCompany(String C) {
		Company.sendKeys(C);
	}
	public void enterAddress(String Add) {
		Address.sendKeys(Add);
	}
	
	public void enterAddress2(String Add2) {
		Address2.sendKeys(Add2);
	}
	public void enterCountry(String cy) {
		Select s = new Select(Country);
		s.selectByVisibleText(cy);
	}
	
	public void enterState(String st) {
		State.sendKeys(st);
	}
	public void enterCity(String ct) {
		City.sendKeys(ct);
	}
	
	public void enterZipCode(String zc) {
		ZipCode.sendKeys(zc);
	}
	public void clickCreateAccount() {
		CreateAccount.click();
	}
	public void enterMobileNumber(String mn) {
		MobileNumber.sendKeys(mn);
	}
	
	public boolean enterAccountInformationDisplayed() {
		try {
			return(EnterAccountInformation.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
	public boolean AccountCreatedDisplay() {
		try {
			return(AccountCreated.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}
	public void clickContinue() {
		Continue.click();
	}
	public void clickDeleteAccount() {
		deleteAccount.click();
	}
	public boolean AccountDeletedIsDisplayed() {
		try {
			return(AccountDeleted.isDisplayed());
		} catch (Exception e) {
			return false;
		}
	}


}
