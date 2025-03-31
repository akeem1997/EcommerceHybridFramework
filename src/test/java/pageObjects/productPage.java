package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class productPage extends BasePage {
	
	public productPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath = "//input[@id='search_product']") WebElement SearchProduct;
	@FindBy(xpath = "//button[@id='submit_search']") WebElement search;
	@FindBy(xpath = "//body/section/div[@class='container']/div[@class='row']/div[@class='col-sm-9 padding-right']/div[@class='features_items']/div[5]/div[1]/div[1]/div[1]/a[1]") WebElement BlueTop;
	@FindBy(xpath = "//button[normalize-space()='Add to cart']") WebElement AddToCart;
	@FindBy(xpath = "//button[normalize-space()='Continue Shopping']") WebElement continueShopping;
	@FindBy(xpath = "//div[3]//div[1]//div[2]//ul[1]//li[1]//a[1]") WebElement MenTshirtAddToCart;
	@FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]") WebElement MenTshirt;
	@FindBy(xpath = "//body[1]/section[2]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[2]/ul[1]/li[1]/a[1]") WebElement viewProduct;
	
	public void enterSearchProduct(String prod) {
		SearchProduct.sendKeys(prod);
	}
	
	public void clickSearch() {
		search.click();
	}
	
	public void clickBlueTop() {
		BlueTop.click();
	}
	public void clickAddToCart() {
		
		AddToCart.click();
	}
	
	public void clickContinueShopping() {
		continueShopping.click();
	}
	public void clickAddToCartMenTshirt() {
		MenTshirtAddToCart.click();
	}
	
	public void clickMenTshirtaddToCart() {
		MenTshirt.click();
	}
	public void clickViewProduct() {
		viewProduct.click();
	}

}
