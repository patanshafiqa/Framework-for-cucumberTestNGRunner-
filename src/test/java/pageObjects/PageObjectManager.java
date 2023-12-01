package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
	
	public Landingpage landingPage;
	public Offerspage offerPage;
	public WebDriver driver;
	public CheckoutPage checkOut;

	public PageObjectManager(WebDriver driver)
	{
		this.driver=driver;
	}
	public Landingpage getLandingpage()
	{
		landingPage=new Landingpage(driver);
		return landingPage;
	}
	
	public Offerspage getofferPage()
	{
		offerPage=new Offerspage(driver);
		return offerPage;
	}
	public CheckoutPage getcheckoutpage()
	{
		checkOut=new CheckoutPage(driver);
		return checkOut;
	}
}

