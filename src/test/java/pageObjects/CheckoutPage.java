package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
 
	public WebDriver driver;
	public CheckoutPage(WebDriver driver)
	{
		this.driver=driver;
	}
	By cartBag=By.cssSelector("img[alt='Cart']");
	By checkoutButton=By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
	By promoBtn =By.cssSelector(".promoBtn");
	By placeOrder=By.xpath("//button[normalize-space()='Place Order']");
	
	public void CheckoutItems()
	{
		driver.findElement(cartBag).click();
		driver.findElement(checkoutButton).click();
	}
	public boolean verifyPromobutton()
	{
		return driver.findElement(promoBtn).isDisplayed();
	}
	public boolean verifyplaceOrderbutton()
	{
		return driver.findElement(placeOrder).isDisplayed();
	}
}
