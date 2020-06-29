package com.quickmove.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.ArticleAddSettingPage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.SettingPage;



public class SettingPageTest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	ArticleAddSettingPage articlesettingpage;
	public SettingPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		
		 homepage.clickonsettinglink();
		 settingpage=new SettingPage();
		
		
	}
	
	@Test(priority=1)
	public void clickonsidemenutest()
	{   
		settingpage.verifysidebarlink();
	}
	@Test(priority=3)
	public void verifyaddarticlelinktest()
	{ settingpage.verifysidebarlink();
		settingpage.verifyaddarticlelink();
	}
	@Test(priority=2)
	public void verifyAddarticlepagetitletest()
	{  
		settingpage.verifysidebarlink(); 
		settingpage.verifyaddarticlelink();
		String articlesettingpage = settingpage.addarticletitle();
		
		Assert.assertEquals(articlesettingpage, "QuickMove- ArticleSetting");
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}
