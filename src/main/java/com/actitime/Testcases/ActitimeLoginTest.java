package com.actitime.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.actitime.Helper.HelperUtils;
import com.actitime.pages.ActitimeLoginPage;

public class ActitimeLoginTest 
{
	@Test
	public void Login() throws InterruptedException
	{
		HelperUtils hu = new HelperUtils();
		WebDriver driver=hu.openBrowser("chrome", "https://demo.actitime.com/login.do");
		ActitimeLoginPage loginpage = PageFactory.initElements(driver, ActitimeLoginPage.class);
		loginpage.logintoActitime("admin", "manager");
		//driver.wait(5000);
		//driver.close();
		
	}

}
