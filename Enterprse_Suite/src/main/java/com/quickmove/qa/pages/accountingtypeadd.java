package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class accountingtypeadd extends TestBase {
	
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_imgbtnGLAdd']")
	WebElement clickontypebutton;

	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlHead']")
	WebElement selectAccounthead;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlGroup']")
	WebElement selectGroup;
	
	@FindBy(xpath="//select[@id='ctl00_ContentPlaceHolder1_ddlSubGroup']")
	WebElement selectSubGroup;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtGLName']")
	WebElement EnterLedgerName;
	
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_ibnGLSave']")
	WebElement clickonsavebutton;
	
	
	
	public accountingtypeadd clickonsavebutton() {
		clickonsavebutton.click();
		return new accountingtypeadd();
	}
	
	
	public accountingtypeadd EnterLedgerName(String ledger) {
		EnterLedgerName.sendKeys(ledger);
		return new accountingtypeadd();
	}
	/*
	 * public accountingtypeadd EnterLedgerName1(String Ledger) {
	 * EnterLedgerName.sendKeys(Ledger); return new accountingtypeadd(); } public
	 * accountingtypeadd EnterLedgerName2(String Ledger) {
	 * EnterLedgerName.sendKeys(Ledger); return new accountingtypeadd(); } public
	 * accountingtypeadd EnterLedgerName3(String Ledger) {
	 * EnterLedgerName.sendKeys(Ledger); return new accountingtypeadd(); } public
	 * accountingtypeadd EnterLedgerName4(String Ledger) {
	 * EnterLedgerName.sendKeys(Ledger); return new accountingtypeadd(); }
	 */
	
	public accountingtypeadd selectSubGroupAsset() {
		selectSubGroup.click();
		Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlSubGroup']")));
		select.selectByIndex(2);
		return new accountingtypeadd();
		
	}
	
	public accountingtypeadd selectSubGroupExpense() {
		selectSubGroup.click();
		Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlSubGroup']")));
		select.selectByIndex(1);
		return new accountingtypeadd();
		
	}
	
	public accountingtypeadd selectgroupDirectExepnse() {
		selectGroup.click();
		Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlGroup']")));
		select.selectByIndex(3);
		return new accountingtypeadd();
		
	}
	public accountingtypeadd selectgroupDirectIncome() {
		selectGroup.click();
		Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlGroup']")));
		select.selectByIndex(3);
		return new accountingtypeadd();
		
	}
	public accountingtypeadd selectSubGroupincome() {
		selectSubGroup.click();
		Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlSubGroup']")));
		select.selectByIndex(1);
		return new accountingtypeadd();
		
	}
	public accountingtypeadd selectgroupcurrentAsset() {
		selectGroup.click();
		Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlGroup']")));
		select.selectByIndex(7);
		return new accountingtypeadd();
		
	}
	
	/*
	 * public AccountConfigurationPage EnterGroupNameLEDGER(String TDSRECEIABLE)//,
	 * String Cash, String BanK,String INVENTORIES,String DEPOSITS {
	 * EnterLedgerName.sendKeys(TDSRECEIABLE);//if we are clicking on link then it
	 * should return landing page object return new
	 * AccountConfigurationPage();//,Cash,BanK,INVENTORIES,DEPOSITS }
	 */
	public accountingtypeadd clickontypebutton() {
		clickontypebutton.click();
		return new accountingtypeadd();
	}
	
	public accountingtypeadd selectAccountheadAsset() {
		selectAccounthead.click();
		Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlHead']")));
		select.selectByIndex(1);
		return new accountingtypeadd();
		
	}
	public accountingtypeadd selectAccountheadLiability() {
		selectAccounthead.click();
		Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlHead']")));
		select.selectByIndex(2);
		return new accountingtypeadd();
		
	}
	public accountingtypeadd selectAccountheadExpense() {
		selectAccounthead.click();
		Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlHead']")));
		select.selectByIndex(3);
		return new accountingtypeadd();
	}
	public accountingtypeadd selectAccountheadIncome() {
		selectAccounthead.click();
		Select select= new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlHead']")));
		select.selectByIndex(4);
		return new accountingtypeadd();
		
	}
	
	
	public accountingtypeadd()
	{
		PageFactory.initElements(driver, this);
	}
	
}
