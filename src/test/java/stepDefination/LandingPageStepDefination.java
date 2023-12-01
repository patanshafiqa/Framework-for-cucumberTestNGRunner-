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
import utils.TestContextSetup;

public class LandingPageStepDefination {
	WebDriver driver;
	//public String Landingpageproductname;
	public String offerpageproductname;
	TestContextSetup testcontextsetup;
	Landingpage landingPage;

	public LandingPageStepDefination(TestContextSetup testcontextsetup)
	{
		this.testcontextsetup=testcontextsetup;
		this.landingPage=testcontextsetup.pageobjectmanager.getLandingpage(); // object was created in constructor then only it will use across the class

	}
	@Given("User is on Greencart landing page")
	public void user_is_on_greencart_landing_page() throws InterruptedException {
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));



	}
	@When("^User searched with shortname(.+)and extracted actual name of the product$")
	public void user_searched_with_shortname_tom_and_extracted_actual_name_of_the_product(String shortName) throws InterruptedException 
	{
		landingPage.searchProduct(shortName);
		Thread.sleep(2000);
		testcontextsetup.Landingpageproductname =landingPage.getproductName().split("-")[0].trim();
		System.out.println(testcontextsetup.Landingpageproductname + ":is extracted from home page");
		//landingPage.selectTopDealsPage();


	}
	/*@When("Added {string} items of the selected product to cart")
	public void Added_items_product(String quantity)
	{
		landingPage.incrementQuantity(Integer.parseInt(quantity));
		landingPage.addToCart();
	}*/
	@When("Added\"{int}\"items of the selected product to cart")
	public void added_items_of_the_selected_product_to_cart(Integer int1) {
		landingPage.incrementQuantity(int1);
		landingPage.addToCart();
	    // Write code here that turns the phrase above into concrete actions
	    
	}

}
