package com.quickmove.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.quickmove.qa.base.TestBase;

public class SettingPage extends TestBase{
	
	@FindBy(xpath="//li[@id='IdMenu0']//li[3]//a[1]")
	WebElement clickonaddarticlelink;
	
	@FindBy(xpath="//a[@id='nav-icon']")
	WebElement clickonsidebarlink;
	
	
	@FindBy(xpath="//span[contains(text(),'Master Prefix')]")
	WebElement clickonMasterPrefixlink;
	
	@FindBy(xpath="//div[@id='ctl00_ContentPlaceHolder1_divCategoryClose']")
	WebElement clickoncategordetailsicon;
	
	public SettingPage()
	{
		PageFactory.initElements(driver, this);// for initialization page factory method
		
	}
	public ArticleAddSettingPage verifyaddarticlelink()
	{
		clickonaddarticlelink.click();
		return new ArticleAddSettingPage();
	}
	public SettingPage  verifysidebarlink()
	{ 
		clickonsidebarlink.click();
		return new SettingPage();
		
	}
	public MasterPrefixPage  verifyMasterPrefixlink()
	{ 
		clickonMasterPrefixlink.click();
		return new MasterPrefixPage();
		
	}
	
	
	public String addarticletitle()
	{
		return driver.getTitle();
	}
}
