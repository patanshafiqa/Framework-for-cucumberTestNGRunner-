package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Landingpage {
 
	public WebDriver driver;
	public Landingpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By searchbox=By.xpath("//*[@id=\"root\"]/div/header/div/div[2]/form/input");
	
	By prodctname=By.cssSelector("h4.product-name");
	By topdelas=By.linkText("Top Deals");
	By incriment=By.cssSelector("a.increment");
	By addToCart=By.cssSelector(".product-action button");


public void searchProduct(String pname)
{
	driver.findElement(searchbox).sendKeys(pname);
}
public void getSearchText()
{
	driver.findElement(prodctname).getText();
}

public String getproductName()
{
	return driver.findElement(prodctname).getText();
	
}
public void selectTopDealsPage()
{
	driver.findElement(topdelas).click();
}
public String getTitleLandingPage()
{
	return driver.getTitle();
}
public void incrementQuantity(int quantity)
{
	int i=quantity-1;
	while (i>0) {
		
		driver.findElement(incriment).click();
		i--;
	}
}
 public void addToCart()
 {
	 driver.findElement(addToCart).click();
 }
}