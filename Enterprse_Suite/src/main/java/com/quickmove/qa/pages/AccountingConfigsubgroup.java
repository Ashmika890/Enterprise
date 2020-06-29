package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.quickmove.qa.base.TestBase;

public class AccountingConfigsubgroup extends TestBase {

	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_btnSubGroupSubmit']")
	WebElement ClickOnsubgroupsavebutton;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_gvGroup_ctl02_ibtnAddNew']")
	WebElement Clickonsubgroupaddbutton;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_gvGroup_ctl03_ibtnAddNew']")
	WebElement Clickonsubgroupaddbutton2;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtSubGroupName']")
	WebElement EnterSuGroupName;
	
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtGroupName")
	WebElement EnterGroupName;
	
	
	public AccountingConfigsubgroup()
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public AccountingConfigsubgroup Entersubgroupnameinsearch(String subgroupname)
	{
		EnterSuGroupName.sendKeys(subgroupname);//if we are clicking  on link then it should return landing page object
		return new AccountingConfigsubgroup();
	}
	
	public AccountingConfigsubgroup Clickonsubgrousavebutton()
	{
		ClickOnsubgroupsavebutton.click();//if we are clicking  on link then it should return landing page object
		return new AccountingConfigsubgroup();
	}
	public AccountingConfigsubgroup Clickonsubgroupaddbutton()
	{ 
		Clickonsubgroupaddbutton.click();//if we are clicking  on link then it should return landing page object
		return new AccountingConfigsubgroup();
	}
	
	public AccountConfigurationPage EnterAllsubGroupName(String fixedAsset)
	{
		EnterGroupName.sendKeys(fixedAsset);//if we are clicking  on link then it should return landing page object
		return new AccountConfigurationPage();
	}
	
	
}
