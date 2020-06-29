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
import com.quickmove.qa.pages.EnquiryMasterpage;
import com.quickmove.qa.pages.HomePage;
import com.quickmove.qa.pages.LoginPage;
import com.quickmove.qa.util.TestUtil;

public class varifyEnquirytest extends TestBase{
	HomePage homepage;
	LoginPage loginpage;
	 EnquiryMasterpage enquirymaster;
	 String sheetname="Enquiry_Individual";
	
	public varifyEnquirytest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		 loginpage=new LoginPage();
		 homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
		 homepage.clickonsalesmodule();
		  enquirymaster=new EnquiryMasterpage();
}
	@DataProvider
	public Object[][] gettestEnquiry() throws EncryptedDocumentException, IOException
	{
		Object data[][]=TestUtil.getTestData(sheetname);
		return data;
	}
	
	@Test(priority=1,dataProvider="gettestEnquiry")
	public void createnq(String indivdualFirstname, String enterindividualmobile,String  originaddress,String origincountry,String origincity,String destinatonaddress,String destinationcountry,String destinationcity) throws InterruptedException {
		enquirymaster.Clickonenquiryaddbutton();
		enquirymaster.EnterEnquiryaddbutton(indivdualFirstname);
		Thread.sleep(2000);
		enquirymaster.Clickonmobile();
		Thread.sleep(3000);
		enquirymaster.Enterindividualmobile(enterindividualmobile);
		enquirymaster.EntryOriginaddress(originaddress);
		enquirymaster.Selectorigincountry(origincountry);
		enquirymaster.Enterorigincity(origincity);
		enquirymaster.Destinationddress(destinatonaddress);
		enquirymaster.SelectDestinationcountry(destinationcountry);
		enquirymaster.EnterDestinationcity(destinationcity);
		enquirymaster.Selectenqstatus();
		enquirymaster.Clickonenquirysavebutton();
		homepage.clickonsalesmodule();
		enquirymaster.copyenqid();
		
		/*
		 * public String copyenqid() { String Enqidcopy=driver.findElement(By.xpath(
		 * "//div[@id='ctl00_ContentPlaceHolder1_ViewEnquiry_divgvBorder']//td[3]")).
		 * getText(); System.out.println(Enqidcopy); return Enqidcopy; }
		 */
	driver.findElement(By.xpath("//a[@id='ctl00_ContentPlaceHolder1_ViewEnquiry_gvEnquiry_ctl02_imbEnquirySummary']")).click();
	
	JavascriptExecutor js = (JavascriptExecutor) driver;
	WebElement statusbutton=driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_ddlEnquiryStatus']"));
	js.executeScript("arguments[0].scrollIntoView();", statusbutton);
	enquirymaster.selectsurveyor();
	enquirymaster.Clickonenquirysavebutton();
	
	
	}
}