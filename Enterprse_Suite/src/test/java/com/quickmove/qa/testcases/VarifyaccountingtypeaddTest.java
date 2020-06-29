package com.quickmove.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
import com.quickmove.qa.pages.accountingtypeadd;
import com.quickmove.qa.util.TestUtil;


public class VarifyaccountingtypeaddTest extends TestBase {
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	AccountingModule accountingmodule;
	AccountConfigurationPage accountingconfigurationpage;
	AccountingConfigsubgroup accountingconfigsubgrouppage;
	accountingtypeadd AccTypeAdd;
	String sheetname="Sheet2";
	String sheetname2="Panamsalesincome";
	String sheetname3="panamaoperaaionalexpense";
	
	public VarifyaccountingtypeaddTest()
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
		  AccTypeAdd= new accountingtypeadd();
}
	

	
/*
 * @DataProvider public Object[][] gettestAccountingGroupledger() throws
 * EncryptedDocumentException, IOException { Object
 * data[][]=TestUtil.getTestData(sheetname); return data; }
 * 
 * @Test(priority=1, dataProvider="gettestAccountingGroupledger") public void
 * VerifyAccountconfigurationAsset(String TDSReceivable, String Cash, String
 * Bank,String Inventories, String Deposits) throws InterruptedException {
 * AccTypeAdd.clickontypebutton(); AccTypeAdd.selectAccountheadAsset();
 * AccTypeAdd.selectgroupcurrentAsset(); AccTypeAdd.selectSubGroupAsset();
 * AccTypeAdd.EnterLedgerName(TDSReceivable); AccTypeAdd.clickonsavebutton();
 * //, String Cash, String Bank, String Inventories, String Deposits
 * 
 * }
 */
  @DataProvider
	public Object[][] gettestAccountingGroupledgerexpense() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname3);
		return data;
	}

@Test(priority=2, dataProvider="gettestAccountingGroupledgerexpense")
public void VerifyAccountconfigurationExpense(String TDSReceivable) throws InterruptedException 
{
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement statusbutton=driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_imgbtnGLAdd']"));
	js.executeScript("arguments[0].scrollIntoView();", statusbutton);
	
		AccTypeAdd.clickontypebutton();
		AccTypeAdd.selectAccountheadExpense();
		
		AccTypeAdd.selectgroupDirectExepnse();
		
		AccTypeAdd.selectSubGroupExpense();
		
		  AccTypeAdd.EnterLedgerName(TDSReceivable);
		 AccTypeAdd.clickonsavebutton(); 
	//, String Cash, String Bank, String Inventories, String Deposits
	
}
@DataProvider
	public Object[][] gettestAccountingGroupledgerincome() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname2);
		return data;
	}

@Test(priority=1, dataProvider="gettestAccountingGroupledgerincome")
public void VerifyAccountconfigurationIncome(String TDSReceivable) throws InterruptedException 
{
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement statusbutton=driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_imgbtnGLAdd']"));
	js.executeScript("arguments[0].scrollIntoView();", statusbutton);
	
		AccTypeAdd.clickontypebutton();
		AccTypeAdd.selectAccountheadIncome();
		
		AccTypeAdd.selectgroupDirectIncome();
		
		AccTypeAdd.selectSubGroupincome();
		
		  AccTypeAdd.EnterLedgerName(TDSReceivable);
		 AccTypeAdd.clickonsavebutton(); 
	//, String Cash, String Bank, String Inventories, String Deposits
	
}
}
