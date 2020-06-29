package com.quickmove.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.MasterPrefixPage;
import com.quickmove.qa.pages.SettingPage;

import com.quickmove.qa.util.TestUtil;

public class MasterPrefixTest extends TestBase{
	
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	MasterPrefixPage masterprefix;
	String sheetname="MasterPrefixvertical";
	public MasterPrefixTest()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		homepage.clickonsettinglink();
		 
		 settingpage=new SettingPage();
		 settingpage.verifysidebarlink(); 
		 Thread.sleep(1000);
		 settingpage.verifyMasterPrefixlink();
		 masterprefix=new MasterPrefixPage();
		 }	
	
	@DataProvider
	public Object[][] gettestMasterPrefix() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}
	
	@Test(priority=1, dataProvider="gettestMasterPrefix")
	public void varifymasterprefix(String masterprefixname,String prefix)
	{	
		masterprefix.Search(masterprefixname);
	    masterprefix.ClickonSearch();
	    masterprefix.Clickoneditbutton();
	    masterprefix.Clickonclear();
	//	masterprefix.updatemaster(masterprefixname, prefix);
	    masterprefix.Enterprefix(prefix);
		
		
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}




