package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WomenSection {
	
	public WebDriver driver; 
	
	By TopSection = By.xpath("//*[@id='subcategories']/ul/li[1]/h5/a"); 
	By Tops_Tshirt	= By.xpath("//*[@id='subcategories']/ul/li[1]/h5/a");
	By Product_Top = By.xpath("//*[@id='center_column']/ul/li/div/div[1]/div/a[1]/img"); 
	By AddtoCart = By.xpath("//*[@id='add_to_cart']/button");
	By Checkout = By.xpath("//*[@id='layer_cart']/div/div[2]/div[4]/a");
	By ProceedToCheckout = By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]"); 
	By Address_ProceedToCheckout = By.xpath("//*[@id=\"center_column\"]/form/p/button");
	By TermsOfService = By.cssSelector("input[id='cgv']"); 
	By ProceedToCheckOut2 = By.xpath("//*[@id='form']/p/button/span");
	By SelectPaymentMode = By.cssSelector("a.bankwire"); 
	By ConfirmOrder = By.xpath("//*[@id='cart_navigation']/button"); 
	By OrderCompleteMsg = By.xpath("//*[@id='center_column']/div/p/strong"); 
	
	public WomenSection(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
			this.driver = driver ;
			}
	
	public WebElement getTopSection() {
		return driver.findElement(TopSection);
	}


	public WebElement getTshirts() {
		return driver.findElement(Tops_Tshirt);
	}
	
	public WebElement getProduct() {
		return driver.findElement(Product_Top);
	}
	
	public WebElement getAddToCart() {
		return driver.findElement(AddtoCart);
	}
	
	public WebElement getCheckout() {
		return driver.findElement(Checkout);
	}
	
	public WebElement getProceedToCheckout() {
		return driver.findElement(ProceedToCheckout);
	}
	
	public WebElement getProceedToCheckoutOnAddress() {
		return driver.findElement(Address_ProceedToCheckout);
	}
	
	public WebElement getTermOfService() {
		return driver.findElement(TermsOfService);
	}
	
	public WebElement getProceedToCheckout2() {
		return driver.findElement(ProceedToCheckOut2);
	}
	
	public WebElement getPaymentMode() {
		return driver.findElement(SelectPaymentMode);
	}
	
	public WebElement getConfirmOrder() {
		return driver.findElement(ConfirmOrder);
	}
	
	public WebElement getOrderCompleteMsg() {
		return driver.findElement(OrderCompleteMsg);
	}
	
	
	
	
}
