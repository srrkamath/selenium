package com.actitime.Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HelperUtils {
	
	WebDriver driver;
	public WebDriver openBrowser(String browsername, String url)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
		driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
		
	}

}
