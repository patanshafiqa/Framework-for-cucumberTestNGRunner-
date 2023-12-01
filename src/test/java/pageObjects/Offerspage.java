package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Offerspage {
	public WebDriver driver;
	
	
	By searchproduct=By.xpath("//*[@id=\"search-field\"]");
	By productLink=By.xpath("//*[@id=\\\"search-field\\");
	By productname=By.cssSelector("tr td:nth-child(1)");
	
	public Offerspage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void searchProduct(String name)
	{
		driver.findElement(searchproduct).sendKeys(name);
		
	}

	public void productLink()
	{
		driver.findElement(productLink).click();
	}
	public String productName()
	{
		return driver.findElement(productname).getText();
	}
}
 