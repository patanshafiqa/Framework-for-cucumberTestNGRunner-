package stepDefination;

import static org.testng.Assert.assertEquals;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.Landingpage;
import pageObjects.Offerspage;
import pageObjects.PageObjectManager;
import utils.TestContextSetup;

public class OfferPageStepDefination {
	WebDriver driver;
	public String Landingpageproductname;
	public String offerpageproductname;
	TestContextSetup testcontextsetup;
     PageObjectManager pageobjectmanager;
	public OfferPageStepDefination(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
	}

@Then("^User searched for (.+) shortname in offerpage$")
public void user_searched_for_shortname_in_offerpage_to_check_if_product_exist(String pname) throws InterruptedException {
 
	switchToOffersPage();
	pageobjectmanager=new PageObjectManager(testcontextsetup.driver);
	Offerspage offerPage=testcontextsetup.pageobjectmanager.getofferPage();
	//Offerspage offerPage=new Offerspage(testcontextsetup.driver);  using this one from object manager
	offerPage.searchProduct(pname);
	Thread.sleep(3000);
	offerpageproductname=offerPage.productName();
	
	//offerPage.productLink();
	
	/*testcontextsetup.driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[2]")).click();
	Set<String>windowskeys=testcontextsetup.driver.getWindowHandles();
	terator<String>it= windowskeys.iterator();
	String parentwindow= it.next();
	String childwindow=it.next(); 
	testcontextsetup.driver.switchTo().window(childwindow);
	offerPage.searchProduct(pname);
	//testcontextsetup.driver.findElement(By.xpath("//*[@id=\"search-field\"]")).sendKeys(pname);
	offerpageproductname=testcontextsetup.driver.findElement(By.cssSelector("tr td:nth-child(1)")).getText();
	System.out.println("The offer page:" + offerpageproductname);
	*/  
}

public void switchToOffersPage()
{
	//testcontextsetup.driver.findElement(By.xpath("//*[@id=\"root\"]/div/header/div/div[3]/a[2]")).click();
	pageobjectmanager=new PageObjectManager(testcontextsetup.driver);
	Landingpage landingPage=testcontextsetup.pageobjectmanager.getLandingpage();
			//Landingpage landingPage=new Landingpage(testcontextsetup.driver);
	landingPage.selectTopDealsPage();
//The below code is to design in generic calss
	/*Set<String>windowskeys=testcontextsetup.driver.getWindowHandles();
	 Iterator<String>it= windowskeys.iterator();
	String parentwindow= it.next();
	String childwindow=it.next(); 
	testcontextsetup.driver.switchTo().window(childwindow);
	*/
	testcontextsetup.genericUtils.SwithToWindowToChild();
}
@Then("validate product name matches in offerpage with landingpage")	
public void validate_product_name_matches_in_offerpage_with_landingpage()
{
  Assert.assertEquals(offerpageproductname, testcontextsetup.Landingpageproductname);
  
}

}
