package com.quickmove.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.quickmove.qa.base.TestBase;

public class LoginPage extends TestBase {
	//page factory of login page--- OR(Object repository)
	
	@FindBy(xpath="//input[@id='Login1_txtUserName']")
	
	WebElement username;
	
	@FindBy(xpath="//input[@id='Login1_txtPassword']")
	
	WebElement password;
	@FindBy(xpath="//div[@class='qm']//img")
	WebElement logo;
	
	@FindBy(xpath="//input[@id='Login1_btnSignIn']")
	WebElement login;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);// for initialization page factory method
		
	}
	//Actions
	public String validateloginpagetitle()
	{
		return driver.getTitle();
	}
	public boolean validateimage() 
	{
		return logo.isDisplayed();
	}
	public HomePage login(String un, String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		login.click();
		return new HomePage();
	}
}
