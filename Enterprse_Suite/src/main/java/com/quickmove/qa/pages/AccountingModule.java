package com.quickmove.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.quickmove.qa.base.TestBase;

public class AccountingModule extends TestBase{

	@FindBy(xpath="//span[contains(text(),'Configuration')]")
	WebElement ClickOnConfigurationLink;
	
	public AccountingModule clickOnConfigurationLink()
	{
		ClickOnConfigurationLink.click();//if we are clicking  on link then it should return landing page object
		return new AccountingModule();
	}

	public AccountingModule()
	{
		PageFactory.initElements(driver, this);
	}
}
