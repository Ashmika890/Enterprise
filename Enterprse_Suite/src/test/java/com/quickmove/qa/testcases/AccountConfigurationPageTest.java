package com.quickmove.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.AccountConfigurationPage;
import com.quickmove.qa.pages.AccountingModule;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.SettingPage;
import com.quickmove.qa.util.TestUtil;

public class AccountConfigurationPageTest extends TestBase {
	
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	AccountingModule accountingmodule;
	AccountConfigurationPage accountingconfigurationpage;
	String sheetname="AccountGroups";
	
	public AccountConfigurationPageTest()
	{
		super();
	}
	
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 homepage.clickonAccountModuleLink();
		 homepage.clickonhomepgesidemenu();
		 accountingmodule=new AccountingModule();
		 accountingmodule.clickOnConfigurationLink();
		 accountingconfigurationpage=new AccountConfigurationPage();
		 
}
	
	@DataProvider
	public Object[][] gettestAccountingGroup() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}
	
	@Test(priority=1,dataProvider="gettestAccountingGroup")
	public void VerifyAccountconfigurationAsset(String asset,String income,String expense,String Liability) throws InterruptedException {
		
		accountingconfigurationpage.clickOnAddGroup();
		Thread.sleep(1000);
		accountingconfigurationpage.clickOnAccountHead();
		accountingconfigurationpage.EnterAssetname(asset);
		//accountingconfigurationpage.EnterGroupName(asset,income,expense,Liability);
		accountingconfigurationpage.clickOnSaveButton();
	}
	@Test(priority=2,dataProvider="gettestAccountingGroup")
	public void VerifyAccountconfigurationIncome(String asset,String income,String expense,String Liability) throws InterruptedException {
		
		accountingconfigurationpage.clickOnAddGroup();
		Thread.sleep(1000);
		accountingconfigurationpage.clickOnAccountHeadIncome();
		accountingconfigurationpage.EnterAssetname(income);
		//accountingconfigurationpage.EnterGroupName(asset,income,expense,Liability);
		accountingconfigurationpage.clickOnSaveButton();
	}
	@Test(priority=3,dataProvider="gettestAccountingGroup")
	public void VerifyAccountconfigurationExpense(String asset,String income,String expense,String Liability) throws InterruptedException {
		
		accountingconfigurationpage.clickOnAddGroup();
		Thread.sleep(1000);
		accountingconfigurationpage.clickOnAccountHeadExpense();
		accountingconfigurationpage.EnterAssetname(expense);
		//accountingconfigurationpage.EnterGroupName(asset,income,expense,Liability);
		accountingconfigurationpage.clickOnSaveButton();
	}
	@Test(priority=4,dataProvider="gettestAccountingGroup")
	public void VerifyAccountconfigurationLIability(String asset,String income,String expense,String Liability) throws InterruptedException {
		
		accountingconfigurationpage.clickOnAddGroup();
		Thread.sleep(1000);
		accountingconfigurationpage.clickOnAccountHeadLiability();
		accountingconfigurationpage.EnterAssetname(Liability);
		//accountingconfigurationpage.EnterGroupName(asset,income,expense,Liability);
		accountingconfigurationpage.clickOnSaveButton();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	
}