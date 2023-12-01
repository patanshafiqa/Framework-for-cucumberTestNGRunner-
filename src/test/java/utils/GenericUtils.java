package utils;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;


public class GenericUtils {
	
public WebDriver driver;

	public GenericUtils(WebDriver driver)
	{
		this.driver=driver;
	}
	public void SwithToWindowToChild()
	{
		Set<String>windowskeys=driver.getWindowHandles();
		 Iterator<String>it= windowskeys.iterator();
		String parentwindow= it.next();
		String childwindow=it.next(); 
		driver.switchTo().window(childwindow);
	}

}
