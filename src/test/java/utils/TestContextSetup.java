package utils;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import pageObjects.CheckoutPage;
import pageObjects.PageObjectManager;

public class TestContextSetup {
	
public WebDriver driver;
public String Landingpageproductname;
public PageObjectManager pageobjectmanager;
public TestBase testBase;
public GenericUtils genericUtils;
public CheckoutPage checkOut;

public TestContextSetup() throws IOException
{
	testBase=new TestBase();
	pageobjectmanager=new PageObjectManager(testBase.WebDriverManager()); 
	genericUtils=new GenericUtils(testBase.WebDriverManager());
	
	
}

}
