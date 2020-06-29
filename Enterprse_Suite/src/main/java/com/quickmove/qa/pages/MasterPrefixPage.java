package com.quickmove.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.quickmove.qa.base.TestBase;

public class MasterPrefixPage extends TestBase{

	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtSearch']")
	WebElement SearchMasterPrefix;
	
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ibtnRefresh']")
	WebElement ClickOnSearchMasterPrefix;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtPrefix']")
	WebElement updateprefix;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_btnSubmit']")
	WebElement clickonsavebutton;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_gvMasterPrefix_ctl02_ibtnEdit']")
	WebElement clickoneditbutton;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtPrefix']")
	WebElement clickonclearprefix;
	
	public MasterPrefixPage()
	{
		PageFactory.initElements(driver, this);// for initialization page factory method
		
	}
	
	public MasterPrefixPage Search(String MasterPrefix) {
		SearchMasterPrefix.sendKeys(MasterPrefix);
		return new MasterPrefixPage();
	}
	
	public MasterPrefixPage ClickonSearch() {
		ClickOnSearchMasterPrefix.click();
		return new MasterPrefixPage();
	}
	public MasterPrefixPage Clickonclear() {
		clickonclearprefix.clear();
		return new MasterPrefixPage();
	}
	public MasterPrefixPage Clickoneditbutton() {
		clickoneditbutton.click();
		return new MasterPrefixPage();
	}
	
	public void updatemaster(String mastername,String prefix)
	{
		updateprefix.sendKeys(mastername,prefix);
		clickonsavebutton.click();
		
	}
	public void Enterprefix(String prefix)
	{
		updateprefix.sendKeys(prefix);
		clickonsavebutton.click();
		
	}
	
	
}
