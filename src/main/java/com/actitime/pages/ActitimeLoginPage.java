package com.actitime.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ActitimeLoginPage 
{
	WebDriver driver;
	public ActitimeLoginPage(WebDriver lDriver)
	{
		this.driver=lDriver;
	}
	
	@FindBy(id="username") WebElement userName;
	//@FindBy(name="pwd") WebElement password;
	@FindBy(how=How.NAME,using="pwd") WebElement password;
	@FindBy(id="loginButton") WebElement loginButton;
	
	public void logintoActitime(String uname, String pwd)
	{
		userName.sendKeys(uname);
		password.sendKeys(pwd);
		loginButton.click();
	}

}
