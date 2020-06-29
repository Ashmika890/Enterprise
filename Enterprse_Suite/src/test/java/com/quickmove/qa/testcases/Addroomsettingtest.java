package com.quickmove.qa.testcases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.quickmove.qa.base.TestBase;
import com.quickmove.qa.pages.AddRoomSettingpage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;

import com.quickmove.qa.pages.SettingPage;
import com.quickmove.qa.util.TestUtil;

public class Addroomsettingtest extends TestBase {
	
	HomePage homepage;
	LoginPage loginpage;
	SettingPage settingpage;
	
	AddRoomSettingpage addroomsetting;
	String sheetname="Addroom";
	
	
	public Addroomsettingtest()
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
		
		
		 addroomsetting=new AddRoomSettingpage();
		 settingpage.verifyaddarticlelink();
		 
}	
	
	@DataProvider
	public Object[][] gettestaddroom() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}

	
	  @Test(priority=1, dataProvider="gettestaddroom") 
	
	  public void varifyaddroom(String addroom) throws InterruptedException {
	  addroomsetting.clickoncategryicon(); addroomsetting.clickonaddRoombutton();
	 Thread.sleep(1000);
	  
	 addroomsetting.clickongoodstype(); addroomsetting.EnterRoomname(addroom);
	  addroomsetting.selectelement(); addroomsetting.clickonsavebutton();
	  addroomsetting.clickonfirstelement();
	  
	 Thread.sleep(1000); addroomsetting.clickoutside();
	  addroomsetting.clickonenteroom(); //Thread.sleep(1000);
	  addroomsetting.clickonnext(); Thread.sleep(8000);
	  addroomsetting.clickonsavebutton();
	  
	  }

		
		 @Test(priority=2,dataProvider="gettestaddroom") 
		 public void varifyaddOffficeRoom(String addroom) throws InterruptedException {
		
		 addroomsetting.clickoncategryicon(); addroomsetting.clickonaddRoombutton();
		 Thread.sleep(1000);
		  
		  addroomsetting.SelectOfficegoods(); addroomsetting.EnterRoomname(addroom);
		  addroomsetting.selectelement(); addroomsetting.clickonsavebutton(); }
		 
		  @Test(priority=3,dataProvider="gettestaddroom") 
		  public void varifyaddCommerciaGoodsroom(String addroom) throws InterruptedException {
		 
		  addroomsetting.clickoncategryicon(); addroomsetting.clickonaddRoombutton();
		  Thread.sleep(1000);
		  
		  addroomsetting.SelectCommercialgoods();
		 addroomsetting.EnterRoomname(addroom); addroomsetting.selectelement();
		  addroomsetting.clickonsavebutton(); }
		  
		  @Test(priority=4,dataProvider="gettestaddroom") 
		  public void varifyaddIndustrialGoodsRoom(String addroom) throws InterruptedException {
		 
		  addroomsetting.clickoncategryicon(); addroomsetting.clickonaddRoombutton();
		  Thread.sleep(1000);
		 
		  addroomsetting.SelectIndustrialgoods();
		  addroomsetting.EnterRoomname(addroom); addroomsetting.selectelement();
		   addroomsetting.clickonsavebutton(); }
		   
		   @Test(priority=5,dataProvider="gettestaddroom") public void
		   varifyaddFIneArtsRoom(String addroom) throws InterruptedException {
		   
		   addroomsetting.clickoncategryicon(); addroomsetting.clickonaddRoombutton();
		   Thread.sleep(1000);
		   
		   addroomsetting.SelectFIneartsgoods(); addroomsetting.EnterRoomname(addroom);
		   addroomsetting.selectelement(); addroomsetting.clickonsavebutton(); }
		   
		   @Test(priority=6,dataProvider="gettestaddroom") public void
		   varifyaddDataCentreRoom(String addroom) throws InterruptedException {
		   
		   addroomsetting.clickoncategryicon(); addroomsetting.clickonaddRoombutton();
		   Thread.sleep(1000);
		   
		   addroomsetting.SelectDataCentre(); addroomsetting.EnterRoomname(addroom);
		   addroomsetting.selectelement(); addroomsetting.clickonsavebutton(); }
		   
		   @Test(priority=7,dataProvider="gettestaddroom") public void
		   varifyaddITGoodsRoom(String addroom) throws InterruptedException {
		   
		   addroomsetting.clickoncategryicon(); addroomsetting.clickonaddRoombutton();
		   Thread.sleep(1000);
		   
		   addroomsetting.SelectITGoods(); addroomsetting.EnterRoomname(addroom);
		   addroomsetting.selectelement(); addroomsetting.clickonsavebutton(); }
		   
		   @Test(priority=8,dataProvider="gettestaddroom") 
		   public void  varifyaddPersonalEffctsRoom(String addroom) throws InterruptedException {
		   
		   addroomsetting.clickoncategryicon(); addroomsetting.clickonaddRoombutton();
		   Thread.sleep(1000);
		   
		   addroomsetting.SelectPeronalEffects(); addroomsetting.EnterRoomname(addroom);
		   addroomsetting.selectelement(); addroomsetting.clickonsavebutton(); }
		   
		   @Test(priority=9,dataProvider="gettestaddroom") 
		   public void  varifyaddPershiableGoodsRoom(String addroom) throws InterruptedException {
		   
		   addroomsetting.clickoncategryicon(); addroomsetting.clickonaddRoombutton();
		   Thread.sleep(1000);
		   
		   addroomsetting.SelectPershiableGoods();
		   addroomsetting.EnterRoomname(addroom); addroomsetting.selectelement();
		   addroomsetting.clickonsavebutton(); }
		 
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
}
