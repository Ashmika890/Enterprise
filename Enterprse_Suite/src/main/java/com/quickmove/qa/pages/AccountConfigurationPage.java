package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class AccountConfigurationPage extends TestBase {
	
	
	@FindBy(id="ctl00_ContentPlaceHolder1_imgbtnGroupAdd")
	WebElement ClickOnGroupAddButton;
	
	
	@FindBy(id="ctl00_ContentPlaceHolder1_imgbtnGroupAdd")
	WebElement ClickOnAccountHead;
	
	@FindBy(id="ctl00_ContentPlaceHolder1_txtGroupName")
	WebElement EnterGroupName;
	
	
	@FindBy(id="ctl00_ContentPlaceHolder1_IbtnSave")
	WebElement ClickOnSaveButton;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtGroupSearch']")
	WebElement Entersearch;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ibtnGroupSearch']")
	WebElement Clickonsearch;
	
	
	
	
	
	
	public AccountConfigurationPage Entersubgroupname(String subgroupname)
	{
		Entersearch.sendKeys(subgroupname);//if we are clicking  on link then it should return landing page object
		return new AccountConfigurationPage();
	}
	
	
	
	
	public AccountConfigurationPage Entersearchtext(String subgroupnamesearch)
	{
		Entersearch.sendKeys(subgroupnamesearch);//if we are clicking  on link then it should return landing page object
		return new AccountConfigurationPage();
	}
	public AccountConfigurationPage Clickonsearch()
	{
		Clickonsearch.click();//if we are clicking  on link then it should return landing page object
		return new AccountConfigurationPage();
	}
	
	
	
	public AccountConfigurationPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public AccountConfigurationPage clickOnSaveButton()
	{
		ClickOnSaveButton.click();//if we are clicking  on link then it should return landing page object
		return new AccountConfigurationPage();
	}
	
	public AccountConfigurationPage clickOnAddGroup()
	{
		ClickOnGroupAddButton.click();//if we are clicking  on link then it should return landing page object
		return new AccountConfigurationPage();
	}
	
	  public AccountConfigurationPage EnterGroupName(String Asset, String income, String Expense,String Liability) {
	  EnterGroupName.sendKeys(Asset,income,Expense,Liability);//if we are clicking  on link then it should return landing page object 
	  return new
	  AccountConfigurationPage();
	  }
	 
	
	public AccountConfigurationPage EnterAssetname(String Asset)
	{
		EnterGroupName.sendKeys(Asset);//if we are clicking  on link then it should return landing page object
		return new AccountConfigurationPage();
	}
	public AccountConfigurationPage clickOnAccountHead()
	{
		
		Select select=new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGroupHead")));
		select.selectByIndex(1);
		return new AccountConfigurationPage();
	}
	public AccountConfigurationPage clickOnAccountHeadLiability()
	{
		
		Select select=new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGroupHead")));
		select.selectByIndex(2);
		return new AccountConfigurationPage();
	}
	public AccountConfigurationPage clickOnAccountHeadExpense()
	{
		
		Select select=new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGroupHead")));
		select.selectByIndex(3);
		return new AccountConfigurationPage();
	}
	public AccountConfigurationPage clickOnAccountHeadIncome()
	{
		
		Select select=new Select(driver.findElement(By.id("ctl00_ContentPlaceHolder1_ddlGroupHead")));
		select.selectByIndex(4);
		return new AccountConfigurationPage();
	}
	
	
}
