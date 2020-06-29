package com.quickmove.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.quickmove.qa.base.TestBase;

public class ArticleAddSettingPage extends TestBase{

	@FindBy(id="ctl00_ContentPlaceHolder1_divCloseArticledetails")
	WebElement clickonexpandicon;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_imgbtnAddArticles']")
	WebElement clickonaddarticleicon;
	
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtItemName']")
	WebElement Enterarticlename;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_txtItemVolume']")
	WebElement Entervolume;
	
	@FindBy(xpath="//input[@id='ctl00_ContentPlaceHolder1_chkSubsidary_0']")
	WebElement clickonsubsidiary;
	
	@FindBy(xpath="//a[@id='ctl00_ContentPlaceHolder1_btnSubmit']")
	WebElement clickonsavebutton;
	
	public ArticleAddSettingPage()
	{
		PageFactory.initElements(driver, this);// for initialization page factory method
		
	}
	
	public ArticleAddSettingPage ClickonExpandicon()
	{
		clickonexpandicon.click();
		return new ArticleAddSettingPage();
	}
	
	public ArticleAddSettingPage ClickonAddarticleicon()
	{
		clickonaddarticleicon.click();
		return new ArticleAddSettingPage();
	}
	public void selectunit(String Volumeunit)
	{
		Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlUnit']")));
		select.selectByVisibleText(Volumeunit);
	}
	public void selectweightunit(String Weightunit)
	{
		Select select=new Select(driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlItemWeightUnit']")));
		select.selectByVisibleText(Weightunit);
	}
	public void Enterarticlenameandvolume(String articlename, String articlevolume)
	{
		Enterarticlename.sendKeys(articlename);
		Entervolume.sendKeys(articlevolume);
		clickonsubsidiary.click();
		clickonsavebutton.click();
		
	}
}
