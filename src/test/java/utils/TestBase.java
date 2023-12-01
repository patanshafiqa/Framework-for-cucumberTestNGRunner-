package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
public WebDriver driver;
	
	public WebDriver WebDriverManager() throws IOException
	
	
	{
		FileInputStream file=new FileInputStream(System.getProperty("user.dir")+"//src//test//Resources//global.properties");
		Properties pro=new Properties();
		pro.load(file);
		String url=pro.getProperty("QAUrl");
		if(driver == null)
		{
			if(pro.getProperty("browser").equalsIgnoreCase("chrome"))
					{
				          driver=new ChromeDriver();
				          driver.manage().window().maximize();
					}
		
		
		//Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(url);
	    }
		return driver;
		
	}
}
