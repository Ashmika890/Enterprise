package com.quickmove.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.AccountConfigurationPage;
import com.quickmove.qa.pages.AccountingConfigsubgroup;
import com.quickmove.qa.pages.AccountingModule;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.pages.SettingPage;
import com.quickmove.qa.util.TestUtil;

public class Accountsubgroupconfigtest extends TestBase{
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	AccountingModule accountingmodule;
	AccountConfigurationPage accountingconfigurationpage;
	AccountingConfigsubgroup accountingconfigsubgrouppage;
	String sheetname="AccountSG_FIXEDASSET";
	String sheetnameCA="AccountSG_CURRENTASSET";
	String sheetnamedirectincome="ACCOUNTSG_DIRECTINCOME";
	String sheetnameINDincome="ACCOUNTSG_INDIRECTINCOME";
	String sheetnameDE="DIRECT_EXPENSE";
	String sheetnameIE="INDIRECT__EXPENSE";
	String sheetnamecurrentLiability="CURRENT_LIABILITY";
	String sheetnamecapital="CAPITALACCOUNT";
	
	public Accountsubgroupconfigtest()
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
		 accountingconfigsubgrouppage= new AccountingConfigsubgroup();
		 
}
	@DataProvider
	public Object[][] gettestAccountingsubGroup() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}
	@DataProvider
	public Object[][] gettestAccountingsubGroupCA() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetnameCA);
		return data;
	}
	@DataProvider
	public Object[][] gettestAccountingsubGroupDI() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetnamedirectincome);
		return data;
	}
	@DataProvider
	public Object[][] gettestAccountingsubGroupINDincome() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetnameINDincome);
		return data;
	}
	@DataProvider
	public Object[][] gettestAccountingsubGroupDE() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetnameDE);
		return data;
	}
	@DataProvider
	public Object[][] gettestAccountingsubGroupIE() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetnameIE);
		return data;
	}
	@DataProvider
	public Object[][] gettestAccountingsubGroupCL() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetnamecurrentLiability);
		return data;
	}
	@DataProvider
	public Object[][] gettestAccountingsubGroupCapital() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetnamecapital);
		return data;
	}
	
	@Test(priority=1,dataProvider="gettestAccountingsubGroup")
	public void VerifyAccountconfigurationsubgroup(String fixedAsset) throws InterruptedException {
		
		accountingconfigurationpage.Entersubgroupname("Fixed Asset");
		Thread.sleep(1000);
		accountingconfigurationpage.Clickonsearch();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Clickonsubgroupaddbutton();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Entersubgroupnameinsearch(fixedAsset);
		
		accountingconfigsubgrouppage.Clickonsubgrousavebutton();
	}
	@Test(priority=2,dataProvider="gettestAccountingsubGroupCA")
	public void VerifyAccountconfigurationsubgroupCA(String currentasset) throws InterruptedException {
		
		accountingconfigurationpage.Entersubgroupname("Current Asset");
		Thread.sleep(1000);
		accountingconfigurationpage.Clickonsearch();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Clickonsubgroupaddbutton();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Entersubgroupnameinsearch(currentasset);
		
		accountingconfigsubgrouppage.Clickonsubgrousavebutton();
	}
	@Test(priority=3,dataProvider="gettestAccountingsubGroupDI")
	public void VerifyAccountconfigurationsubgroupDI(String Directncoome) throws InterruptedException {
		
		accountingconfigurationpage.Entersubgroupname("Direct Income");
		Thread.sleep(1000);
		accountingconfigurationpage.Clickonsearch();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Clickonsubgroupaddbutton();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Entersubgroupnameinsearch(Directncoome);
		
		accountingconfigsubgrouppage.Clickonsubgrousavebutton();
	}
	@Test(priority=4,dataProvider="gettestAccountingsubGroupINDincome")
	public void VerifyAccountconfigurationsubgroupINDincome(String indirectincome) throws InterruptedException {
		
		accountingconfigurationpage.Entersubgroupname("Indirect Income");
		Thread.sleep(1000);
		accountingconfigurationpage.Clickonsearch();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Clickonsubgroupaddbutton();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Entersubgroupnameinsearch(indirectincome);
		
		accountingconfigsubgrouppage.Clickonsubgrousavebutton();
	}
	@Test(priority=5,dataProvider="gettestAccountingsubGroupDE")
	public void VerifyAccountconfigurationsubgroupDE(String DirectExpense) throws InterruptedException {
		
		accountingconfigurationpage.Entersubgroupname("Direct Expense");
		Thread.sleep(1000);
		accountingconfigurationpage.Clickonsearch();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Clickonsubgroupaddbutton();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Entersubgroupnameinsearch(DirectExpense);
		
		accountingconfigsubgrouppage.Clickonsubgrousavebutton();
	}
	@Test(priority=6,dataProvider="gettestAccountingsubGroupIE")
	public void VerifyAccountconfigurationsubgroupIE(String indirectexpense) throws InterruptedException {
		
		accountingconfigurationpage.Entersubgroupname("Indirect Expense");
		Thread.sleep(1000);
		accountingconfigurationpage.Clickonsearch();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Clickonsubgroupaddbutton();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Entersubgroupnameinsearch(indirectexpense);
		
		accountingconfigsubgrouppage.Clickonsubgrousavebutton();
	}
	@Test(priority=7,dataProvider="gettestAccountingsubGroupCL")
	public void VerifyAccountconfigurationsubgroupCL(String currentLiability) throws InterruptedException {
		
		accountingconfigurationpage.Entersubgroupname("Current Liability");
		Thread.sleep(1000);
		accountingconfigurationpage.Clickonsearch();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Clickonsubgroupaddbutton();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Entersubgroupnameinsearch(currentLiability);
		
		accountingconfigsubgrouppage.Clickonsubgrousavebutton();
	}
	@Test(priority=8,dataProvider="gettestAccountingsubGroupCapital")
	public void VerifyAccountconfigurationsubgroupCapitalaccount(String capitalaccount) throws InterruptedException {
		
		accountingconfigurationpage.Entersubgroupname("Capital Account");
		Thread.sleep(1000);
		accountingconfigurationpage.Clickonsearch();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Clickonsubgroupaddbutton();
		Thread.sleep(1000);
		accountingconfigsubgrouppage.Entersubgroupnameinsearch(capitalaccount);
		
		accountingconfigsubgrouppage.Clickonsubgrousavebutton();
	}
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
