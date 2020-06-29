package com.quickmove.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.ArticleAddSettingPage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.SettingPage;
import com.quickmove.qa.util.TestUtil;

public class Articlesettingpagetest extends TestBase {
	
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	ArticleAddSettingPage articlesettingpage;
	String sheetname="Addarticle";
	
	public Articlesettingpagetest()
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
		 settingpage.verifysidebarlink(); 
		settingpage.verifyaddarticlelink();
		articlesettingpage=new ArticleAddSettingPage();
		
		
	}
	
	@DataProvider
	public Object[][] gettestdataarticle() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}
	
	@Test(priority=1,dataProvider="gettestdataarticle")
	public void validateaddarticle(String article ,String volume) throws InterruptedException
	{
		articlesettingpage.ClickonExpandicon();
		articlesettingpage.ClickonAddarticleicon();
		Thread.sleep(1000);
		articlesettingpage.Enterarticlenameandvolume(article, volume);
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
