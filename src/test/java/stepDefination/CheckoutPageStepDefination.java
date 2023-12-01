package stepDefination;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

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
import pageObjects.CheckoutPage;
import pageObjects.Landingpage;
import utils.TestContextSetup;

public class CheckoutPageStepDefination {
	WebDriver driver;
	//public String Landingpageproductname;
	public String offerpageproductname;
	TestContextSetup testcontextsetup;
	public CheckoutPage checkoutpage;

	public CheckoutPageStepDefination(TestContextSetup testcontextsetup)
	{
	   this.testcontextsetup=testcontextsetup;
	   this.checkoutpage=testcontextsetup.pageobjectmanager.getcheckoutpage();
	}

	@Then("verify user has ability to enter promo code and place the order")
	public void verify_user_has_ability_to_enter_prom()
	{
		
		Assert.assertTrue(checkoutpage.verifyPromobutton());
		Assert.assertTrue(checkoutpage.verifyplaceOrderbutton());
		
	}

	@Then ("^User proceeds to Checkout and validate the (.+) items in checkout page$")
	public void User_proceeds_to_Checkout(String name) throws InterruptedException
	{
		checkoutpage.CheckoutItems();
		//Thread.sleep(3000);
	}
   	
}

