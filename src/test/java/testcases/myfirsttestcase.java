package testcases;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.base;
import utilities.ReadExcelData;


public class myfirsttestcase extends base{
	
	@Test(dataProviderClass=ReadExcelData.class, dataProvider="testraj")
	public static void LoginTest(String username, String password) throws InterruptedException
	{
		driver.findElement(By.linkText(elem.getProperty("signin_link"))).click();
		System.out.println("username=" + username);
		driver.findElement(By.id(elem.getProperty("login_field"))).sendKeys(username);
		Thread.sleep(3000);
		driver.findElement(By.xpath(elem.getProperty("next_btn"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(elem.getProperty("password_field"))).sendKeys(password);
		Thread.sleep(3000);
		driver.findElement(By.xpath(elem.getProperty("login_btn"))).click();
		Thread.sleep(3000);
	}
	
}
